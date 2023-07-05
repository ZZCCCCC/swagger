package com.zzc.controller;

import com.zzc.entity.User;
import com.zzc.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author: 赵智超
 * @date: 2023/07/05/21:49
 * @Description:
 */
@RestController
@Slf4j
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    /**
     * 查询所有用户
     */
    @GetMapping
    public List<User> list(){
        List<User> list = userService.list();
        //log.info("123");
        return list;
    }

    /**
     * 根据id删除用户
     * @param id
     * @return
     */
    @DeleteMapping("/{id}")
    public User del(@PathVariable Long id){
        User user = userService.getById(id);
        boolean b = userService.removeById(id);
        if (b){
            return user;
        }else{
            return null;
        }
    }

    @GetMapping("{id}")
    public User select(@PathVariable Long id){
        return userService.getById(id);
    }

     @PostMapping
    public Boolean save(@RequestBody User user){

         return userService.save(user);
     }

     @PutMapping
    public Boolean update(@RequestBody User user){
         boolean b = userService.updateById(user);
         return b;
     }
}
