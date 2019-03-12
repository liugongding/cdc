package com.dingding.cdc.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.text.DateFormat;
import java.util.Date;


@Controller
public class RecordController {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @RequestMapping("/hello")
    public ModelAndView hello() {
        ModelAndView mv = new ModelAndView();
        mv.addObject("now", DateFormat.getDateTimeInstance().format(new Date()));
        mv.setViewName("hello");
        return mv;
    }

}

