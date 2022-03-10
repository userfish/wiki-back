package com.blog.wiki.demo.controller;

import cn.hutool.core.util.StrUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.blog.wiki.demo.common.Contants;
import com.blog.wiki.demo.entity.TopMeunEntity;
import com.blog.wiki.demo.pojo.FilterVO;
import com.blog.wiki.demo.pojo.ResultVO;
import com.blog.wiki.demo.service.TopMeunService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@Slf4j
@RestController
@RequestMapping("back-home")
public class HomeController {

    @Resource
    private TopMeunService topMeunService;

    @GetMapping("/test")
    public ResultVO getTopType(FilterVO filterVO){
        //测试下运行
        ResultVO resultVO = new ResultVO();
        resultVO.setTopList(Contants.TOPTYPE.get("v-index"));
        log.info(resultVO.toString() );
        return resultVO;
    }

    @GetMapping("/getTopData")
    public ResultVO getTopData(FilterVO filterVO) {
        String type = filterVO.getLeftType();
        ResultVO resultVO = new ResultVO();

        resultVO.setTopList(StrUtil.split(topMeunService.getOne(new QueryWrapper<TopMeunEntity>().eq("name", type == null ? "v-index" : type)).getMeunList(), ','));

        return resultVO;
    }

}
