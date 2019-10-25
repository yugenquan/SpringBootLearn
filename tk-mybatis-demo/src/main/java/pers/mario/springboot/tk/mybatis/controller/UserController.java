package pers.mario.springboot.tk.mybatis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pers.mario.springboot.tk.mybatis.model.User;
import pers.mario.springboot.tk.mybatis.pojo.request.user.EditUserStatus;
import pers.mario.springboot.tk.mybatis.pojo.request.user.AddUser;
import pers.mario.springboot.tk.mybatis.pojo.request.user.EditUser;
import pers.mario.springboot.tk.mybatis.pojo.request.user.FindUser;
import pers.mario.springboot.tk.mybatis.service.UserService;

import java.util.List;

/**
 * @PackageName pers.mario.springboot.mybatis.controller
 * @ClassName UserController
 * @Author mario
 * @Date 2019-10-24 17:37:07
 * @Description TODO
 * @Version 1.0
 **/

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @ResponseBody
    @RequestMapping("/user/find/all")
    private String findUserAll() {
        List<User> list = userService.findUserAll();
        return null;
    }

    @ResponseBody
    @RequestMapping("/user/find/page")
    private String findUserAll(FindUser findUser) {
        List<User> list = userService.findUserPage(findUser);
        return null;
    }

//    localhost:8080/user/find/mario
    @ResponseBody
    @RequestMapping("/user/find/{username}")
    private String findUser(@PathVariable String username) {

        Boolean bool = userService.findUserByUsername(username);

        return null;
    }

//    localhost:8080/user/del/1
    @ResponseBody
    @RequestMapping("/user/del/{id}")
    private String delUser(@PathVariable Long id) {

        Boolean bool= userService.findUserById(id);


        return null;
    }

//    localhost:8080/user/add?username=mario&password=mario
    @ResponseBody
    @RequestMapping("/user/add")
    private String addUser(AddUser adduser) {
        Boolean bool = userService.addUser(adduser);

        return null;
    }

//    localhost:8080/user/edit?username=mario&password=mario&id=347617123771748352
    @ResponseBody
    @RequestMapping("/user/edit")
    private String editUser(EditUser editUser) {
        Boolean bool = userService.update(editUser);

        return null;
    }

//    localhost:8080/user/edit/status?ids=347617123771748352,347618971173916672&status=1
    @ResponseBody
    @RequestMapping("/user/edit/status")
    private String editUserStatus(EditUserStatus editUserStatus) {
        Boolean bool = userService.updateStatus(editUserStatus);

        return null;
    }

}
