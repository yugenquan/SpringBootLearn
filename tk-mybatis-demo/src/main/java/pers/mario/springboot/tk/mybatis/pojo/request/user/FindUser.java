package pers.mario.springboot.tk.mybatis.pojo.request.user;

import pers.mario.springboot.tk.mybatis.base.BasePage;

/**
 * @PackageName pers.mario.springboot.tk.mybatis.pojo.request.user
 * @ClassName FindUser
 * @Author mario
 * @Date 2019-10-25 11:30:37
 * @Description TODO
 * @Version 1.0
 **/

public class FindUser extends BasePage {

    /**
     * 用户名关键字查询
     */
    private String key;

    /**
     * 用户状态查询
     */
    private Boolean status;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}
