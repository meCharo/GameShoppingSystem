package com.cloud.shopping.controller;

import com.cloud.shopping.entity.User;
import com.cloud.shopping.service.UserService;
import com.cloud.shopping.utils.MsgCenter;
import com.cloud.shopping.utils.UserHolder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.cloud.shopping.utils.Result;

//import javax.servlet.http.HttpServletRequest;

@CrossOrigin
@Controller
//@RestController
public class UserController extends AbstractController{
//    private final HttpServletRequest request;

    @Autowired
    private UserService userService;
    @Autowired
    private UserHolder userHolder;

//    public UserController(HttpServletRequest request) {
//        this.request = request;
//    }

    @GetMapping(value = "validate")
    public String validate() {
        String referer = getReferer();
//        System.out.println(userHolder.getUser());
        if (userHolder.getUser().getStat().equals(User.STAT_OK)) {
            return "redirect:" + referer;
        }
        return "redirect:http://localhost:9000/validate.jsp";
//        return "validate";
    }

    @PostMapping(value = "validate")
    @ResponseBody
    public Result validate(String code) {
        if (userHolder.getUser() == null) {
            return Result.fail(MsgCenter.USER_NOT_LOGIN);
        }
        if (userHolder.getUser().getStat().equals(User.STAT_OK)) {    // 用户已经验证过了
            return Result.fail(MsgCenter.USER_VALIDATED);
        }
        Result result = userService.validate(userHolder.getUser().getId(), code);
        if (result.isSuccess()) {
            return Result.success("/");
        }
        return result;
    }

    @PostMapping(value = "sendMail")
    @ResponseBody
    public Result sendMail() {
        if (userHolder.getUser() == null) {
            return Result.fail(MsgCenter.USER_NOT_LOGIN);
        }
        return userService.sendMail(userHolder.getUser());
    }

    @GetMapping(value = "personal")
    public String personal() {
        return "redirect:/personal.jsp";
    }

    @PostMapping(value = "personal")
    @ResponseBody
    public Result getPersonInfo() {
        User user = userHolder.getUser();
        if (user == null) {
            return Result.fail(MsgCenter.USER_NOT_LOGIN);
        }
        user.setPassword(null);
        return Result.success(user);
    }

    @GetMapping(value = "update")
    public String update() {
        return "redirect:/updateUserInfo.jsp";
    }

    @PostMapping(value = "update")
    @ResponseBody
    public Result update(User user) {
        return userService.updateUserInfo(user);
    }

    @GetMapping(value = "updatepassword")
    public String updatePassword() {
        return "redirect:/updatepassword.jsp";
    }

    @PostMapping(value = "updatepassword")
    @ResponseBody
    public Result updatePassword(String password) {
        return userService.updatePassword(password);
    }

    @GetMapping(value = "findpassword")
    public String findPassword() {
        return "redirect:/findpassword.jsp";
    }

    @PostMapping(value = "sendfetchpwdmail")
    @ResponseBody
    public Result sendFetchPwdMail(String email) {
        return userService.sendFetchPwdMail(email);
    }

    @PostMapping(value = "findpassword")
    @ResponseBody
    public Result findPassword(String password, String email, String code) {
        return userService.forgetPassword(password, email, code);
    }

    /**
     * 检查用户是否登陆，如果登陆就返回应该跳转到的页面，否则执行接下来的逻辑
     * 每次登陆之前都从request的header中获取跳转之前的链接referer
     * 如果为空（从别的网站跳转过来的），那么应该跳转到首页
     * 登陆流程中第一次登陆就会调用本方法获取跳转链接，登陆失败将referer写入session中
     * 如果是从登录页跳转过来的，可能是登陆出错了，但是跳转到登录页之前的referer在session存着，从session中获取
     * 如果sesson中有referer，那么登陆成功跳转到referer，并且从session中删除referer
     *
     * @return
     */
    private String getReferer() {
        String referer = null;
        String tmp = this.getRequest().getHeader("Referer");
        // 如果为空，不是从本站跳转过来的，应该跳转到首页
        if (tmp == null) {
            referer = "/";
        } else if (tmp.endsWith("/login")) {
            referer = (String) this.getSession().getAttribute("Referer");
        } else {
            referer = tmp;
        }
        this.getSession().setAttribute("Referer", referer);
        return referer;
    }
}
