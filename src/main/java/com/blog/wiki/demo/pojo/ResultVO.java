package com.blog.wiki.demo.pojo;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.List;

@JsonInclude
@Data
public class ResultVO {

    //顶部的数据类型
    private List<String> topList;
}
