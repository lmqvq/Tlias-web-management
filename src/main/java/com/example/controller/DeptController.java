package com.example.controller;

import com.example.pojo.Dept;
import com.example.service.impl.DeptService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.pojo.Result;

import java.util.List;

/**
 * ClassName：DeptController
 * Package:com.example
 * Description:部门管理控制器
 * Author：MQQQ
 *
 * @Create:2023/12/4 - 17:53
 * @Version:v1.0
 */
@Slf4j
@RestController
@RequestMapping("depts")
public class DeptController {
    @Autowired
    private DeptService deptService;

    /**
     * 查询部门数据
     * @return
     */
    //@RequestMapping(value = "/depts" , method = RequestMethod.GET)
    @GetMapping
    public Result list(){
        log.info("查询所有部门数据");
        List<Dept> deptList = deptService.list();
        return Result.success(deptList);
    }

    /**
     * 删除部门
     *
     */
    @DeleteMapping("{id}")
    public Result delete(@PathVariable Integer id){
        log.info("根据id删除部门：{}",id);
        //调用service删除部门
        deptService.delete(id);
        return Result.success();
    }

    /**
     * 新增部门
     * @param dept
     * @return
     */
    @PostMapping
    public Result add(@RequestBody Dept dept){
        //记录日志
        log.info("新增部门：{}",dept);
        //调用service层添加功能
        deptService.add(dept);
        return Result.success();
    }

    /**
     * 修改部门[未完成]
     * @param dept
     * @return
     */
    @PutMapping
    public Result edit(@RequestBody Dept dept){
        log.info("修改部门：{}",dept);
        deptService.edit(dept);
        return Result.success();
    }
}
