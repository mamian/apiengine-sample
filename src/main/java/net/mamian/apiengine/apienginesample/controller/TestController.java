package com.sankuai.meituan.apiengine.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 用于项目test的接口集
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

    /**
     * 用户注册
     *
     * @param name 用户名称
     * @param mobile 用户手机号
     * @return
     */
    @RequestMapping(value="/register", method = RequestMethod.POST)
    @ResponseBody
    public String register(String name, String mobile) {
        return "success";
    }

    /**
     * 用户查询
     *
     * @param page 页码
     * @param pageSize 每页多少条数据
     *
     * @return
     */
    @RequestMapping(value="/list/data", method = RequestMethod.GET)
    @ResponseBody
    public Object list(@RequestParam(value="page", defaultValue = "1") int page,
                       @RequestParam(value="pageSize", defaultValue = "10") int pageSize) {
        return "";
    }

    /**
     * 项目搜索页
     *
     * @param name 用户名称
     * @param page 页码
     * @param pageSize 每页多少条数据
     * @return
     */
    @RequestMapping(value="/search", method = RequestMethod.GET)
    @ResponseBody
    public Object search(@RequestParam(value="name", required=true) String name,
                         @RequestParam(value="page", defaultValue = "1") int page,
                         @RequestParam(value="pageSize", defaultValue = "10") int pageSize) {
        return "";
    }

    /**
     * 名称搜索提示
     *
     * @param name 用户名称
     * @return
     */
    @RequestMapping(value="/search/word", method = RequestMethod.GET)
    @ResponseBody
    public Object word(@RequestParam(value="name", required=true) String name) {
        return "";
    }

}
