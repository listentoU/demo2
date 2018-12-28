package com.javasm.demo2.book.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.javasm.demo2.book.entity.Goods;
import com.javasm.demo2.book.service.IGoodsService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/book")
public class BookHandler {
    @Autowired
    IGoodsService goodsService;

    Log log=LogFactory.getLog(BookHandler.class);
    @RequestMapping("/log")
    @ResponseBody
    public String test(){
        log.debug("开发时调试代码");
        log.info("项目运行过程中");
        log.error("报错的时候，写在catch中");
        try {
            int a=1/0;
        }catch (Exception e){
            //log.error("错误",e);
            log.error("代码错误"+e.getMessage());
        }
        return "log";
    }

    @ResponseBody
    @RequestMapping("/list")
    public PageInfo test1(){
        PageHelper.startPage(1,5);
        List<Goods> list=goodsService.selectAll();
        PageInfo info=new PageInfo(list);
        return info;
    }
}
