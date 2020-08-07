package com.z.controller.user;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author zming
 * @since 2020-08-07
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @PostMapping("/register")
    private void register(){

    }


}
