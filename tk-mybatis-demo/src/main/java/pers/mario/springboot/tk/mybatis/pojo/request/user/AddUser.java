package pers.mario.springboot.tk.mybatis.pojo.request.user;

/**
 * @PackageName pers.mario.springboot.tk.mybatis.pojo.request.user
 * @ClassName AddUser
 * @Author mario
 * @Date 2019-10-24 20:31:59
 * @Description TODO
 * @Version 1.0
 **/

public class AddUser {

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
