package pers.mario.springboot.tk.mybatis.pojo.request.user;

/**
 * @PackageName pers.mario.springboot.tk.mybatis.pojo.request.u
 * @ClassName EditUserStatus
 * @Author mario
 * @Date 2019-10-25 11:32:19
 * @Description TODO
 * @Version 1.0
 **/

public class EditUserStatus {

    /**
     * ID
     */
    private Long[] ids;

    /**
     * 状态
     */
    private Boolean status;

    public Long[] getIds() {
        return ids;
    }

    public void setIds(Long[] ids) {
        this.ids = ids;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}
