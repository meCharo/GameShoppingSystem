package com.cloud.shopping.controller;

import com.cloud.shopping.utils.Result;
import com.cloud.shopping.utils.NotFoundException;
import com.cloud.shopping.service.OrderService;
import com.cloud.shopping.client.UserHolderClient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@CrossOrigin
@Controller
//@RequestMapping(value = "/order")
public class OrderController extends AbstractController {

    @Autowired
    private OrderService orderService;

    // TODO how to use feign client
    @Autowired
    private UserHolderClient userHolder;
//    @Autowired
//    private UserHolder userHolder;

    @GetMapping(value = "userclient")
    public Result userclient() {
        System.out.println("==========================");
//        Result result = orderService.demo(1);
//        System.out.println(gameMapper.selectById(1));
//        System.out.println(userHolder.demo());
        System.out.println("==========================");
//        return String.valueOf(userHolder.getUser().getId());
        return orderService.demo(1);
    }

    @GetMapping(value = "orders")
    public String orders() {
        System.out.println("hello order");
        return "redirect:http://localhost:9000/order.jsp";
    }

    @PostMapping(value = "order")
    @ResponseBody
    public Result order(@RequestParam(value = "games") Integer[] games) {
//        System.out.println("===================");
//        System.out.println(userHolder.getUser());
        return orderService.addOrders(userHolder.getUser().getId(), Arrays.asList(games));
    }

    @PostMapping(value = "{orderid}/cancel")
    @ResponseBody
    public Result cancelOrder(@PathVariable(value = "orderid") Integer orderid) {
        return orderService.cancelOrder(userHolder.getUser().getId(), orderid);
    }

    @GetMapping(value = "{orderid}/payway")
    public ModelAndView payway(@PathVariable(value = "orderid") Integer orderid) {
        System.out.println(orderid);
        System.out.println("hello payway");
        if (!orderService.exists(orderid)) {
            throw new NotFoundException();
        }
//        this.getModel().addAttribute("id", orderid);
//        redirectAttributes.addFlashAttribute("id", orderid);
//        redirectAttributes.addFlashAttribute("user", userHolder.getUser().getUsername());
        Map<String,Object> data = new HashMap<String,Object>();
        data.put("id", orderid);
//        data.put("user", userHolder.getUser().getUsername());
////        this.getModel().addAttribute("id", orderid);
        return new ModelAndView("redirect:http://localhost:9000/order_1.jsp", data);
//        return "redirect:http://localhost:9000/order_1.jsp";
//        return "redirect:/order_1.jsp";
    }

    @GetMapping(value = "{orderid}/pay")
    public ModelAndView pay(@PathVariable(value = "orderid") Integer orderid) {
        System.out.println(orderid);
        System.out.println("hello pay get");
        if (!orderService.exists(orderid)) {
            throw new NotFoundException();
        }
//        this.getModel().addAttribute("id", orderid);
//        return "order_2";
        Map<String,Object> data = new HashMap<String,Object>();
        data.put("id", orderid);
//        this.getModel().addAttribute("id", orderid);
        return new ModelAndView("redirect:http://localhost:9000/order_2.jsp", data);
    }

    @PostMapping(value = "{orderid}/pay")
    @ResponseBody
    public Result payOrder(@PathVariable(value = "orderid") Integer orderid) {
        System.out.println("hello pay");
        return orderService.pay(userHolder.getUser().getId(), orderid);
    }

    @PostMapping(value = "notpay/{page}")
    @ResponseBody
    public Result getNotPayOrders(@PathVariable(value = "page") Integer page) {
        return orderService.getNotPayOrders(userHolder.getUser().getId(), page);
    }

    @PostMapping(value = "paid/{page}")
    @ResponseBody
    public Result getPaidOrders(@PathVariable(value = "page") Integer page) {
//        System.out.println("=================");
////        System.out.println(userHolder.demo());
//        System.out.println(userHolder.getUser().getId());
//        System.out.println("=================");
        return orderService.getPaidOrders(userHolder.getUser().getId(), page);
//        return Result.success();
    }

    @PostMapping(value = "cancel/{page}")
    @ResponseBody
    public Result getCancelOrders(@PathVariable(value = "page") Integer page) {
        return orderService.getCancelOrders(userHolder.getUser().getId(), page);
    }

}

