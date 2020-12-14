package com.jutixueyuan.api;

import com.jutixueyuan.annotation.SwaggerUIAnncation;
import com.jutixueyuan.pojo.Student;
import com.jutixueyuan.pojo.User;
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
@RequestMapping("/student")
public class StudentController {

    /**
     * 根据id查询用户信息
     * @param id
     * @return
     */
    //@RequestMapping(value = "/selectById",method = RequestMethod.GET)
    @GetMapping("selectById")
    public Student selectById(Integer id) {

        return new Student(id, "小明同学", "xm123", "123213213123");

    }

    @PostMapping("insert")
    // @SwaggerUIAnncation // 手写的注解，用于标识
    public Student insert(Student student){
        return student;
    }

    @PostMapping("update")
    public Student update(Student student){
        return student;
    }

}
