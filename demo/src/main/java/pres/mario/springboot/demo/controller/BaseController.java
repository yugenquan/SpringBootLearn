package pres.mario.springboot.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @PackageName pres.mario.springboot.demo.controller
 * @ClassName BaseController
 * @Author mario
 * @Date 2019-10-17 16:50:41
 * @Description TODO
 * @Version 1.0
 **/

@Controller
public class BaseController {

    @ResponseBody
    @RequestMapping("/")
    public String home(){

        String content = "Hello Spring Boot:<br>"+
                "1.<a href = 'http://localhost:8080/return/string'>页面返回字符串:http://localhost:8080/return/string</a><br>"+
                "2.<a href = 'http://localhost:8080/return/json'>返回Json格式字符串:http://localhost:8080/return/json</a><br>"+
                "3.1.<a href = 'http://localhost:8080/redirect/web/outer'>关键字\"redirect\"重定向站点外部:http://localhost:8080/redirect/web/outer</a><br>"+
                "3.2.<a href = 'http://localhost:8080/redirect/web/current'>关键字\"redirect\"重定向站点内部:http://localhost:8080/redirect/web/current</a><br>"+
                "3.3.<a href = 'http://localhost:8080/redirect/by/response/web/outer'>页利用response重定向站点外部:http://localhost:8080/redirect/by/response/web/outer</a><br>"+
                "3.4.<a href = 'http://localhost:8080/forward'>站内转发，转发只能是站内转发:http://localhost:8080/forward</a><br>"+
                "4.<a href = 'http://localhost:8080/return/stream/file'>返回流文件（下载文件）:http://localhost:8080/return/stream/file</a><br>";

        return content;
    }
}
