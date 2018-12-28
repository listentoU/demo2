package com.javasm.demo2.book.service;

import com.javasm.demo2.book.entity.Goods;
import org.springframework.cache.annotation.Cacheable;

import java.util.List;

public interface IGoodsService {
    /**
     * redis的可以 组成  a:b:c:d
     * cacheNames 在缓存中key
     * key代表上goods后面：的部分
     * unless什么数据不存
     * condition数据满足什么条件才存
     * @return
     */
    @Cacheable(cacheNames = "Goods",key = "10010",unless = "#result == null")
    List<Goods>selectAll();
}
