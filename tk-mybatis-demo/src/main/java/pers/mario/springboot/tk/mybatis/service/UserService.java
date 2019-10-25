package pers.mario.springboot.tk.mybatis.service;

import pers.mario.springboot.tk.mybatis.model.User;
import pers.mario.springboot.tk.mybatis.pojo.request.user.AddUser;
import pers.mario.springboot.tk.mybatis.pojo.request.user.EditUser;
import pers.mario.springboot.tk.mybatis.pojo.request.user.EditUserStatus;
import pers.mario.springboot.tk.mybatis.pojo.request.user.FindUser;

import java.util.List;

/**
 * @PackageName pers.mario.springboot.mybatis.service
 * @ClassName UserService
 * @Author mario
 * @Date 2019-10-24 18:04:29
 * @Description TODO
 * @Version 1.0
 **/

public interface UserService {

    /**
     * 查询所有
     * @return
     */
    List<User> findUserAll();

    /**
     * 分页查询
     * @param findUser
     * @return
     */
    List<User> findUserPage(FindUser findUser);

    /**
     * 通过用户名查询
     * @param username
     * @return
     */
    Boolean findUserByUsername(String username);

    /**
     * 通过ID查询
     * @param id
     * @return
     */
    Boolean findUserById(Long id);

    /**
     * 添加
     * @param adduser
     * @return
     */
    Boolean addUser(AddUser adduser);

    /**
     * 修改
     * @param editUser
     * @return
     */
    Boolean update(EditUser editUser);

    /**
     * 修改状态
     * @param editUserStatus
     * @return
     */
    Boolean updateStatus(EditUserStatus editUserStatus);
}
