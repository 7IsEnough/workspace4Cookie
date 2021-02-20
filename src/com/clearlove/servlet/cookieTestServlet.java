package com.clearlove.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class cookieTestServlet extends HttpServlet {

  protected void doPost(HttpServletRequest request,
      HttpServletResponse response)
      throws ServletException, IOException {

    //创建2个cookie
    Cookie cookie = new Cookie("company", "bjpowernode");
    Cookie cookie2 = new Cookie("teacher", "uzi");

    //指定cookie绑定的路径。注意：这里指定的路径要求必须要加上项目名称
//    cookie.setPath(request.getContextPath()+"/xxx/ooo/aaa");
//    cookie2.setPath(request.getContextPath()+"/bbb");

    // 设置cookie的有效期。这个值为一个整型值，单位为秒
    // 该值大于0，表示将Cookie存放到客户端的硬盘
    // 该值小于0，与不设置效果相同，会将Cookie存放到浏览器的缓存
    // 该值等于0，表示Cookie一生成，马上失效
//    cookie.setMaxAge(60 * 60); // 设置cookie的有效期为1小时
//    cookie2.setMaxAge(60 * 60 * 24 * 10); // 设置cookie的有效期为10天



    //向响应中添加Cookie
    response.addCookie(cookie);
    response.addCookie(cookie2);
  }

  protected void doGet(HttpServletRequest request,
      HttpServletResponse response)
      throws ServletException, IOException {
    this.doPost(request, response);
  }
}
