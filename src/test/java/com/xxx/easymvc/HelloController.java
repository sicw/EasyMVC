package com.xxx.easymvc;

import com.xxx.easymvc.annotation.Controller;
import com.xxx.easymvc.annotation.RequestMapping;
import com.xxx.easymvc.bean.ModelAndView;

/**
 * @author sicwen
 * @date 2019/02/22
 */
@Controller
public class HelloController {
    @RequestMapping("/hello")
    public ModelAndView sayHello(){
        System.out.println("Hello MVC");
        ModelAndView mv = new ModelAndView();
        mv.setViewName("hello");
        mv.addAttribute("say","Hello MVC");
        return mv;
    }
}
