package pers.mario.springboot.tk.mybatis.base;

import java.io.Serializable;

/**
 * @PackageName pers.mario.springboot.tk.mybatis.base
 * @ClassName BasePage
 * @Author mario
 * @Date 2019-10-25 11:36:06
 * @Description TODO
 * @Version 1.0
 **/

public class BasePage implements Serializable {

    private static final long serialVersionUID = 1L;

    public Integer page = 1;

    public Integer size = 50;

    public Integer getPage() {
        return this.page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getSize() {
        return this.size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

}
