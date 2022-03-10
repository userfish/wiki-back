package com.blog.wiki.demo.common;

import cn.hutool.core.collection.ListUtil;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 常量类
 */

public class Contants {

    //顶部应用栏的类型
    public static Map<String, List<String>> TOPTYPE = new HashMap<>();




    static{
        TOPTYPE.put("v-index", ListUtil.of("图片1","图片1","图片1","图片1","图片1"));
    }
}
