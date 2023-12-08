package com.example.service.impl;

import org.springframework.stereotype.Service;

/**
 * ClassName：EmpService
 * Package:com.example.service.impl
 * Description:员工业务规则
 * Author：MQQQ
 *
 * @Create:2023/12/4 - 18:18
 * @Version:v1.0
 */
public interface EmpService {
    /**
     * 条件分页查询
     * @param page 页码
     * @param pageSize 每页展示记录数
     * @return
     */
    PageBean page(Integer page, Integer pageSize);
}
