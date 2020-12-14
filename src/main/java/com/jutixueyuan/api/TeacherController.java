package com.jutixueyuan.api;

import com.jutixueyuan.pojo.Student;
import com.jutixueyuan.pojo.Teacher;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 此控制的所有方法都给前端提供API的方法
 */
/*@Controller
@ResponseBody*/
@RestController
@RequestMapping("/teacher")
public class TeacherController {

    /**
     * 根据id查询用户信息
     * @param id
     * @return
     */
    //@RequestMapping(value = "/selectById",method = RequestMethod.GET)
    @GetMapping("selectById")
    public Teacher selectById(Integer id) {

        return new Teacher(id, "小明老师", "xm123", "123213213123");

    }

    @PostMapping("insert")
    // @SwaggerUIAnncation // 手写的注解，用于标识
    public Teacher insert(Teacher teacher){
        return teacher;
    }

    @PostMapping("update")
    public Teacher update(Teacher teacher){
        return teacher;
    }

}
