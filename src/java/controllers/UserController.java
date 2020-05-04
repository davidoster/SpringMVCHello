/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author mac
 */
@Controller
public class UserController {
    
    @RequestMapping(value="user", method = RequestMethod.GET)
    public String getUser() {
        System.out.println("User");
        return "user2";
    }
    
    @RequestMapping(value="user", method = RequestMethod.POST)
    public String postUser() {
        System.out.println("User");
        return "user2";
    }
    
}
