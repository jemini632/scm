package com.scm.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;



import com.scm.forms.UserForm;



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
         System.out.println("services page loading");
           return "services";
       }

       @RequestMapping("/contact")
       public String contact() {
         
           return "contact";
       }
       @RequestMapping("/login")
       public String login() {
           return "login";
       }

       
       @RequestMapping("/register")
       public String register() {
        
           return "register";
       }

      
       
 }
       
       

