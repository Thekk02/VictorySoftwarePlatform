package personal.kk.victorysoftwareplatform.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import personal.kk.victorysoftwareplatform.dto.LoginDto;
import personal.kk.victorysoftwareplatform.service.UserService;
import personal.kk.victorysoftwareplatform.service.impl.UserServiceImpl;
import personal.kk.victorysoftwareplatform.entity.User;
import personal.kk.victorysoftwareplatform.utils.Result;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author kk
 * @description user控制层
 * @date 2024-5-16 08:27:16
 */
@RestController
@RequestMapping("/vsp")
public class UserController {

    @Autowired
    private UserService userService;
    @GetMapping("/getall")
    @ResponseBody
    public Result<List<User>> getAll(){
        return Result.ok(userService.getAll());
    }

    @GetMapping("/getbyid={id}")
    @ResponseBody
    public Result<User> getById(@PathVariable("id") Integer id){return Result.ok(userService.getById(id));}


    @PostMapping("/login")
    @ResponseBody
    public Result<Object> login(LoginDto loginDto){
        return Result.ok();
    }

}
