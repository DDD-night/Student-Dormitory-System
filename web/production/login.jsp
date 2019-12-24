<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<%@ page language="java" pageEncoding="utf-8"%>
<html lang="en">
  <head>
    <%@ include file="head.jsp"%>
  </head>
  <body class="login" onload="succ(${success})">
  <c:remove var="admin" scope="session" />
  <c:remove var="success" scope="session" />
    <div>
      <a class="hiddenanchor" id="signup"></a>
      <a class="hiddenanchor" id="signin"></a>

      <div class="login_wrapper">
        <div class="animate form login_form">
          <section class="login_content">
            <form action="login" method="post">
              <h1>Login Form</h1>
              <div>
                <input type="text" name="number" class="form-control" placeholder="学号或工号" required="" />
              </div>
              <div>
                <input type="password" name="password" class="form-control" placeholder="密码" required="" />
              </div>
              <div class="rodio">
                是否是学生:
                <label>
                  <input type="radio" class="flat" name="student" value="1">是
                </label>
                <label>
                  <input type="radio" class="flat" name="student" value="0">否
                </label>
              </div>
              <div>
                <button type="submit" class="btn btn-default submit" >Log in</button>
              </div>

              <div class="clearfix"></div>

              <div class="separator">
                <p class="change_link">New to site?
                  <a href="#signup" class="to_register"> Create Account </a>
                </p>

                <div class="clearfix"></div>
                <br />
              </div>
            </form>
          </section>
        </div>

        <div id="register" class="animate form registration_form">
          <section class="login_content">
            <form action="register" method="post">
              <h1>Create Account</h1>
              <div>
                <input type="text" class="form-control" name="number" placeholder="学号" required="" />
              </div>
              <div>
                <input type="text" class="form-control" name="name" placeholder="姓名" required="" />
              </div>
              <div>
                <input type="text" class="form-control" name="home" placeholder="公寓楼" required="" />
              </div>
              <div>
                <input type="email" class="form-control" name="email" placeholder="邮箱" required="" />
              </div>
              <div>
                <input type="password" class="form-control" name="password" placeholder="密码" required="" />
              </div>
              <div class="rodio">
                是否是学生:
                <label>
                  <input type="radio" class="flat" name="student" value="1">是
                </label>
                <label>
                  <input type="radio" class="flat" name="student" value="0">否
                </label>
              </div>
              <div>
                <button class="btn btn-default submit" type="submit">Submit</button>
              </div>

              <div class="clearfix"></div>

              <div class="separator">
                <p class="change_link">Already a member ?
                  <a href="#signin" class="to_register"> Log in </a>
                </p>
                <div class="clearfix"></div>
                <br />
              </div>
            </form>
          </section>
        </div>
      </div>
    </div>
<%@ include file="body.jsp"%>
  </body>
</html>
