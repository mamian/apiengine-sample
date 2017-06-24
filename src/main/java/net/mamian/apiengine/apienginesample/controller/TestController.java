package com.sankuai.meituan.apiengine.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 用用于项目test的接口集
 *
 * @author mamian
 * @mail mamianskyma@gmail.com
 * @date 2017-06-22 15:53
 * @copyright ©2017 All Rights Reserved
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 */
@Slf4j
@Controller
@RequestMapping("/api/test")
public class TestController {



    @RequestMapping(value="/register", method = RequestMethod.POST)
    @ResponseBody
    public String register(String name, String mobile) {
        return "success";
    }

    /**
     * @api {get} /user/:id 查询用户数据
     * @apiParam {Number} id Users unique ID.
     * @apiGroup /api/test
     */
    @RequestMapping(value="/list/data", method = RequestMethod.GET)
    @ResponseBody
    public Object list(@RequestParam(value="page", defaultValue = "1") int page,
                       @RequestParam(value="pageSize", defaultValue = "10") int pageSize) {
        return "";
    }

    /**
     * @api {get} /user/:id 用户搜索
     * @apiHeaderExample {json} Header-Example:
     *     {
     *       "Accept-Encoding": "Accept-Encoding: gzip, deflate"
     *     }
     * @apiGroup /api/test
     */
    @RequestMapping(value="/search", method = RequestMethod.GET)
    @ResponseBody
    public Object search(@RequestParam(value="name", required=true) String name,
                         @RequestParam(value="page", defaultValue = "1") int page,
                         @RequestParam(value="pageSize", defaultValue = "10") int pageSize) {
        return "";
    }

    
    @RequestMapping(value="/search/word", method = RequestMethod.GET)
    @ResponseBody
    public Object word(@RequestParam(value="name", required=true) String name) {
        return "";
    }

}
