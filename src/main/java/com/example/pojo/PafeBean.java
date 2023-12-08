package com.example.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * ClassName：PafeBean
 * Package:com.example.pojo
 * Description:
 * Author：MQQQ
 *
 * @Create:2023/12/8 - 13:38
 * @Version:v1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PafeBean {
    private Long total; //总记录数
    private List rows; //当前页数据列表
}
