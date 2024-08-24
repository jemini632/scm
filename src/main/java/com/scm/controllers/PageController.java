package com.scm.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class PageController {

       @RequestMapping("/home")
       public String home(){
          System.out.println("Home page handler");
          return "home";
       }

       //about 

       //services
       @RequestMapping("/about")
       public String about(){
         System.out.println("About page");
         return "about";
       }

       @RequestMapping("/services")
       public String services() {
         System.out.println("services paghe loading");
           return "services";
       }
       
}
