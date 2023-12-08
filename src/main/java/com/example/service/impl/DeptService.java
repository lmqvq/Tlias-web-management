package com.example.service.impl;

import com.example.pojo.Dept;

import java.util.List;

/**
 * ClassName：DeptService
 * Package:com.example.service.impl
 * Description:部门业务规则
 * Author：MQQQ
 *
 * @Create:2023/12/4 - 18:17
 * @Version:v1.0
 */

public interface DeptService {
    /**
     * 查询所有的部门数据
     * @return   存储Dept对象的集合
     */
    List<Dept> list();

    /**
     * 删除部门
     * @param id
     */
    void delete(Integer id);

    /**
     * 新增部门
     * @param dept
     */
    void add(Dept dept);

    /**
     * 修改部门
     * @param dept
     */
    void edit(Dept dept);
}
