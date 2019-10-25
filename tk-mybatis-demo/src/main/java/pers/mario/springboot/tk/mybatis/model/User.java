package pers.mario.springboot.tk.mybatis.model;

import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * @PackageName pers.mario.springboot.mybatis.model
 * @ClassName User
 * @Author mario
 * @Date 2019-10-24 15:20:59
 * @Description TODO
 * @Version 1.0
 **/

@Table(name = "t_user")
public class User {


    /**
     * ID
     */
    @Id
    private Long id;

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 状态(0:禁用;1:可用)
     */
    private Boolean status;

    /**
     * 修改时间
     */
    private Date updateTime;

    /**
     * 创建时间
     */
    private Date createTime;

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

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
