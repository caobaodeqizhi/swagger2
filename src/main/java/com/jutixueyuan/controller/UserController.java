package com.jutixueyuan.controller;

import com.jutixueyuan.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * 此控制的所有方法都给前端提供API的方法
 */
/*@Controller
@ResponseBody*/
@RestController
@RequestMapping("/user")
public class UserController {

    /**
     * 根据id查询用户信息
     * @param id
     * @return
     */
    //@RequestMapping(value = "/selectById",method = RequestMethod.GET)
    @GetMapping("selectById")
    public User selectById(Integer id) {

        return new User(id, "小明", "xm123", "123213213123");

    }

}
