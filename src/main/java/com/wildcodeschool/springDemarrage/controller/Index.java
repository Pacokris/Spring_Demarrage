package com.wildcodeschool.springDemarrage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Index {

    @RequestMapping("/doctor")
    @ResponseBody
    public String indexDoctor () {
        return "<ul>" +
                "<li>William Hartnell<a href='https://en.wikipedia.org/wiki/First_Doctor'> click here!</a></li>" +
                "<li>Patrick Troughton<a href='https://en.wikipedia.org/wiki/Second_Doctor'> click here!</a></li>" +
                "<li>Jon Pertwee<a href='https://en.wikipedia.org/wiki/Third_Doctor'> click here!</a></li>" +
                "<li>Tom Baker<a href='https://en.wikipedia.org/wiki/Fourth_Doctor'> click here!</a></li>" +
                "</ul>";
    }

    @RequestMapping("/doctor/1")
    @ResponseBody
    public String firstDoctor () {
        return "William Hartnell<a href='https://en.wikipedia.org/wiki/First_Doctor'>click here!</a>";
    }

    @RequestMapping("/doctor/2")
    @ResponseBody
    public String secondDoctor () {
        return "Patrick Troughton<a href='https://en.wikipedia.org/wiki/Second_Doctor'>  click here!</a>";
    }

    @RequestMapping("/doctor/3")
    @ResponseBody
    public String thirdDoctor () {
        return "Jon Pertwee<a href='https://en.wikipedia.org/wiki/Third_Doctor'> click here!</a>";
    }

    @RequestMapping("/doctor/4")
    @ResponseBody
    public String fourthDoctor () {
        return "Tom Baker<a href='https://en.wikipedia.org/wiki/Fourth_Doctor'> click here!</a>";
    }
}
