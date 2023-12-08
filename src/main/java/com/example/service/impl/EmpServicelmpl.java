package com.example.service.impl;

import com.example.mapper.EmpMapper;
import com.example.pojo.Emp;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ClassName：EmpServicelmpl
 * Package:com.example.service.impl
 * Description:员工业务实现类
 * Author：MQQQ
 *
 * @Create:2023/12/4 - 18:17
 * @Version:v1.0
 */
@Slf4j
@Service
public class EmpServicelmpl<PageBean> implements EmpService {
    @Autowired
    private EmpMapper empMapper;

    @Override
    public PageBean page(Integer page, Integer pageSize){
        //1、获取总记录数
        Long count = empMapper.count();

        //2、获取分页查询结果列表
        Integer start = (page - 1) * pageSize; //计算起始索引 , 公式: (页码-1)*页大小
        List<Emp> empList = empMapper.list(start, pageSize);

        //3、封装PageBean对象
        PageBean pageBean = new PageBean(count , empList);
        return pageBean;
    }
}
