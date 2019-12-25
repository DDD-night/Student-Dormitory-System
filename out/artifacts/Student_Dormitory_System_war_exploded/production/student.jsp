<%@ page language="java" pageEncoding="utf-8" %>
<html>
<head>
    <%@include file="head.jsp" %>
</head>

<body class="login" onload="succ(${success})">
<div>
    <c:remove var="success" scope="session"/>
    <a class="hiddenanchor" id="signup"></a>
    <a class="hiddenanchor" id="signin"></a>
    <div class="login_wrapper">
        <div class="animate form login_form">
            <section class="login_content">
                <form action="student" method="post">
                    <h1>Login Form</h1>
                    <div>
                        <label class="col-form-label">欢迎 ${user.name} 同学, 请输入一下内容</label>
                    </div>
                    <div>
                        <input type="text" name="number" class="form-control" value="${user.number}" placeholder="学号"
                               required="" hidden/>
                    </div>
                    <div>
                        <input type="number" name="adminhome" class="form-control" placeholder="访问公寓楼" required=""/>
                    </div>
                    <br/>
                    <div class="rodio">
                        原因:
                        <label>
                            <input type="radio" class="flat" name="thing" value="1">探亲
                        </label>
                        <label>
                            <input type="radio" class="flat" name="thing" value="2">开会
                        </label>
                        <label>
                            <input type="radio" class="flat" name="thing" value="3">携带贵重物品
                        </label>
                    </div>

                    <div>
                        <button type="submit" class="btn btn-default submit">提交</button>
                    </div>
                    <div class="separator">
                        <p class="change_link">修改个人信息
                            <a href="#signup" class="to_register"> 点击这里 </a>
                        </p>
                    </div>
                    <div class="clearfix"></div>
                </form>
            </section>
        </div>
        <div id="register" class="animate form registration_form">
            <section class="login_content">
                <form action="update" method="post">
                    <h1>修改个人信息</h1>
                    <div>
                        <input type="text" class="form-control" name="number" placeholder="学号" value="${user.number}" hidden/>
                    </div>
                    <div>
                        <input type="text" class="form-control" name="name" placeholder="姓名" required=""/>
                    </div>
                    <div>
                        <input type="text" class="form-control" name="home" placeholder="公寓楼" required=""/>
                    </div>
                    <div>
                        <input type="email" class="form-control" name="email" placeholder="邮箱" required=""/>
                    </div>
                    <div>
                        <input type="password" class="form-control" name="password" placeholder="密码" required=""/>
                    </div>
                    <div>
                        <button class="btn btn-default submit" type="submit">Submit</button>
                    </div>

                    <div class="clearfix"></div>

                    <div class="separator">
                        <p class="change_link">进行登陆
                            <a href="#signin" class="to_register"> 返回</a>
                        </p>
                        <div class="clearfix"></div>
                        <br/>
                    </div>
                </form>
            </section>
        </div>
    </div>
</div>

<%@include file="body.jsp" %>
</body>
</html>
