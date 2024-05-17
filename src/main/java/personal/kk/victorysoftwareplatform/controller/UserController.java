package personal.kk.victorysoftwareplatform.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import personal.kk.victorysoftwareplatform.service.UserService;
import personal.kk.victorysoftwareplatform.service.impl.UserServiceImpl;
import personal.kk.victorysoftwareplatform.entity.User;

import java.util.List;

/**
 * @author kk
 * @description user控制层
 * @date 2024-5-16 08:27:16
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;
    @GetMapping("/getall")
    @ResponseBody
    public List<User> getAll(){
        return userService.getAll();
    }


}
