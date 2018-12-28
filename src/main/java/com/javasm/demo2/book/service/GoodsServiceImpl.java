package com.javasm.demo2.book.service;

import com.javasm.demo2.book.dao.GoodsMapper;
import com.javasm.demo2.book.entity.Goods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class GoodsServiceImpl implements IGoodsService {
    @Autowired
    GoodsMapper mapper;
    @Override
    public List<Goods> selectAll() {
        //去redis中查询如果有，返回数据，如果没有，去数据库查询存入redis
        List<Goods> list= mapper.selectAll();
        return list;
    }
}
