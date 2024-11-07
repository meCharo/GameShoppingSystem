package com.cloud.shopping.controller;

import com.cloud.shopping.service.KindService;
import com.cloud.shopping.utils.Result;
import com.cloud.shopping.exception.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping(value = "kind")
public class KindController extends AbstractController {

    @Autowired
    private KindService kindService;

    @PostMapping(value = "all")
    @ResponseBody
    public Result allkinds(HttpServletResponse response) {
        return kindService.getAll();
    }

    @GetMapping(value = "{kind}/games")
    public ModelAndView getGames(@PathVariable(value = "kind") Integer kind) {
        String name = kindService.getNameById(kind);
        if (name == null) {
            throw new NotFoundException();
        }
        Map<String,Object> data = new HashMap<>();
        data.put("id", kind);
        data.put("name", name);
//        this.getModel().addAttribute("id", kind);
//        this.getModel().addAttribute("name", name);
        return new ModelAndView("redirect:http://localhost:9000/kinds.jsp", data);
//        return "redirect:http://localhost:9000/kinds.jsp";
    }

    @PostMapping(value = "{kind}/games")
    @ResponseBody
    public Result getGamesByKind(@PathVariable(value = "kind") Integer kind, @RequestParam(value = "page",
            required = false, defaultValue = "1") Integer page) {
        return kindService.getGamesByKind(kind, page);
    }

}
