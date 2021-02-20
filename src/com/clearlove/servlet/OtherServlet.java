package com.clearlove.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author promise
 * @date 2020/11/24 - 21:55
 */

public class OtherServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 获取请求中的cookie
        Cookie[] cookies = request.getCookies();
        // 遍历Cookie
        for (Cookie cookie : cookies) {
            System.out.println(cookie.getName() + "====" +cookie.getValue());
            if(cookie.getName().equals("teacher") && cookie.getValue().equals("uzi")){
                //....
            }else {
                //....
            }
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
