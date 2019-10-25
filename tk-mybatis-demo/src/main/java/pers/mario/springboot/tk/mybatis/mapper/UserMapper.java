package pers.mario.springboot.tk.mybatis.mapper;


import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import pers.mario.springboot.tk.mybatis.base.BaseMapper;
import pers.mario.springboot.tk.mybatis.model.User;

import java.util.List;
import java.util.Map;

/**
 * @PackageName pers.mario.springboot.mybatis.mapper
 * @ClassName UserMapper
 * @Author mario
 * @Date 2019-10-24 18:06:34
 * @Description TODO
 * @Version 1.0
 **/

@Mapper
public interface UserMapper extends BaseMapper<User> {

    List<User> findUserPage(Map<String, Object> map);

    @Select("SELECT * FROM t_user tu WHERE tu.username = #{ username}")
    User findUserByUsername(String username);
}
