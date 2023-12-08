package com.example.service.impl;

import com.example.mapper.DeptMapper;
import com.example.pojo.Dept;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

/**
 * ClassName：DeptServicelmpl
 * Package:com.example.service.impl
 * Description:部门业务实现类
 * Author：MQQQ
 *
 * @Create:2023/12/4 - 18:17
 * @Version:v1.0
 */
@Slf4j
@Service
public class DeptServicelmpl implements DeptService {
    @Autowired
    private DeptMapper deptMapper;

    @Override
    public List<Dept> list() {
        List<Dept> deptList = deptMapper.list();
        return deptList;
    }


    @Override
    public void delete(Integer id) {
        //调用持久层删除功能
        deptMapper.deleteById(id);
    }

    @Override
    public void add(Dept dept) {
        //补全部门数据
        dept.setCreateTime(LocalDateTime.now());
        dept.setUpdateTime(LocalDateTime.now());
        //调用持久层增加功能
        deptMapper.inser(dept);
    }
    @Override
    public void edit(Dept dept){
        dept.setUpdateTime(LocalDateTime.now());
        deptMapper.edit(dept);
    }
}
