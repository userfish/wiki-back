package com.blog.wiki.demo.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.blog.wiki.demo.dao.TopMeunDao;
import com.blog.wiki.demo.entity.TopMeunEntity;
import org.springframework.stereotype.Service;

@Service("TopMeunService")
public class TopMeunServiceImpl extends ServiceImpl<TopMeunDao, TopMeunEntity> implements TopMeunService{
}
