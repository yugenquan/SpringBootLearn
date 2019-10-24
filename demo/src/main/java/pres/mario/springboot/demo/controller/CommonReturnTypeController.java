package pres.mario.springboot.demo.controller;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @PackageName pres.mario.springboot.demo.controller
 * @ClassName CommonReturnTypeController
 * @Author mario
 * @Date 2019-10-17 17:05:10
 * @Description TODO
 * @Version 1.0
 **/

/**
 * 常见返回类型
 */
@Controller
public class CommonReturnTypeController {

    /**
     * 第一种：返回字符串
     *
     * @return
     */
    @ResponseBody
    @RequestMapping("/return/string")
    public String returnString() {
        return "返回字符串";
    }

    /**
     * 第二种返回
     *
     * @return
     */
    @ResponseBody
    @RequestMapping("/return/json")
    public String returnJsonString() {
        JSONObject json = new JSONObject();
        json.put("key1", "value1");
        JSONArray array = new JSONArray();
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("key1", "value2");
        jsonObject.put("key2", "value2");
        array.put(jsonObject);
        json.put("key2", array);
        return json.toString();
    }

    /**
     * 第三种：关键字"redirect"重定向站点外部
     *
     * @return
     */
    @RequestMapping("/redirect/web/outer")
    public String redirectWebOuter() {
        String url = "http://www.baidu.com";
        return "redirect:" + url;
    }

    /**
     * 第三种：关键字"redirect"重定向站点内部
     *
     * @return
     */
    @RequestMapping("/redirect/web/current")
    public String redirectWebCurrent() {
        String url = "/return/string";
        return "redirect:" + url;
    }

    /**
     * 第三种：利用response重定向站点外部
     *
     * @param response
     * @throws IOException sendRedirect异常处理
     */
    @RequestMapping("/redirect/by/response/web/outer")
    public void redirectWebOuterByResponse(HttpServletResponse response) throws IOException {
        String url = "http://www.baidu.com";
        response.sendRedirect(url);
    }

    /**
     * 第三种：利用response重定向站点内部
     *
     * @param response
     * @throws IOException sendRedirect异常处理
     */
    @RequestMapping("/redirect/by/response/web/current")
    public void redirectWebCurrentByResponse(HttpServletResponse response) throws IOException {
        String url = "/return/string";
        response.sendRedirect(url);
    }

    /**
     * 第四种：站内转发，转发只能是站内转发
     *
     * @param request
     * @param response
     * @throws ServletException forward异常处理
     * @throws IOException      forward异常处理
     */
    @RequestMapping("/forward")
    public void forward(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String url = "/return/string";
        request.getRequestDispatcher(url).forward(request, response);
    }

    /**
     * 返回流文件（下载文件）
     *
     * @param response
     * @throws IOException getOutputStream和getBytes异常处理
     */
    @RequestMapping("/return/stream/file")
    public void returnStreamFile(HttpServletResponse response) throws IOException {
        response.setHeader("content-Type", "application/force-download");
        response.setHeader("Content-Disposition", "attachment;filename=" + new String("下载文件.txt".getBytes("utf-8"),"iso-8859-1"));
        ServletOutputStream outputStream = response.getOutputStream();
        outputStream.write("这是您的下载文件".getBytes("utf-8"));
    }

}
