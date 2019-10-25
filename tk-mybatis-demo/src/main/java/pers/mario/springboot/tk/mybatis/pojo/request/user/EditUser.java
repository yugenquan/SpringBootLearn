package pers.mario.springboot.tk.mybatis.pojo.request.user;

/**
 * @PackageName pers.mario.springboot.tk.mybatis.pojo.request.user
 * @ClassName EditUser
 * @Author mario
 * @Date 2019-10-25 10:54:50
 * @Description TODO
 * @Version 1.0
 **/

public class EditUser {
    /**
     * ID
     */
    private Long id;

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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
