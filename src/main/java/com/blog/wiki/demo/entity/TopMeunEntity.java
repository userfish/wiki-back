package com.blog.wiki.demo.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@TableName("TopMeun")
@Data
public class TopMeunEntity {

    private Integer id;

    private String name;

    @TableField("menu_list")
    private String meunList;
}
