package pers.mario.springboot.tk.mybatis.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sun.tools.classfile.ConstantPool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pers.mario.springboot.tk.mybatis.mapper.UserMapper;
import pers.mario.springboot.tk.mybatis.model.User;
import pers.mario.springboot.tk.mybatis.pojo.request.user.AddUser;
import pers.mario.springboot.tk.mybatis.pojo.request.user.EditUser;
import pers.mario.springboot.tk.mybatis.pojo.request.user.EditUserStatus;
import pers.mario.springboot.tk.mybatis.pojo.request.user.FindUser;
import pers.mario.springboot.tk.mybatis.service.UserService;
import pers.mario.springboot.tk.mybatis.utils.IdGenerator;
import tk.mybatis.mapper.entity.Example;

import java.util.*;

/**
 * @PackageName pers.mario.springboot.mybatis.service.impl
 * @ClassName UserServiceImpl
 * @Author mario
 * @Date 2019-10-24 18:04:47
 * @Description TODO
 * @Version 1.0
 **/

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> findUserAll() {
        List<User> list = userMapper.selectAll();
        System.out.println(list.size());
        return null;
    }

    @Override
    public List<User> findUserPage(FindUser findUser) {
        PageHelper.startPage(findUser.getPage(), findUser.getSize());

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("key", findUser.getKey());
        map.put("status", findUser.getStatus());
        List<User> list = userMapper.findUserPage(map);
        if (list.isEmpty()) {
            System.out.println("查询结果为空");
        }
        PageInfo<User> pageInfo = new PageInfo<>(list);
        System.out.println(pageInfo);

        return null;
    }

    @Override
    public Boolean findUserByUsername(String username) {
        User user = userMapper.findUserByUsername(username);
        System.out.println(user);
        return null;
    }

    @Override
    public Boolean findUserById(Long id) {
        Boolean bool = userMapper.deleteByPrimaryKey(id)>0;
        System.out.println(bool);
        return null;
    }

    @Override
    public Boolean addUser(AddUser adduser) {
        User user = new User();
        user.setId(IdGenerator.create());
        user.setUsername(adduser.getUsername());
        user.setPassword(adduser.getPassword());

        Boolean bool = userMapper.insertSelective(user) > 0;
        System.out.println(bool);
        return null;
    }

    @Override
    public Boolean update(EditUser editUser) {
        User user = userMapper.selectByPrimaryKey(editUser.getId());
        user.setUsername(editUser.getUsername());
        user.setPassword(editUser.getPassword());

        Boolean bool = userMapper.updateByPrimaryKeySelective(user)>0;

        System.out.println(bool);

        return null;
    }

    @Override
    public Boolean updateStatus(EditUserStatus editUserStatus) {
        if (editUserStatus.getIds().length <= 0) {
            System.out.println("没有选择数据");
        }
        List<Long> idList = Arrays.asList(editUserStatus.getIds());
        Example example = new Example(User.class);
        example.createCriteria().andIn("id",  idList);
        User record = new User();
        record.setStatus(editUserStatus.getStatus());
        boolean bool = userMapper.updateByExampleSelective(record, example) > 0;
        System.out.println(bool);

        return null;
    }


}
