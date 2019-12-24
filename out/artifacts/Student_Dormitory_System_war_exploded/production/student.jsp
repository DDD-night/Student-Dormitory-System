<%@ page language="java" pageEncoding="utf-8"%>
<html>
<head>
    <%@include file="head.jsp"%>
</head>

<body class="login">
<div>
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
                        <input type="text" name="number" class="form-control" value="${user.number}" placeholder="学号" required="" hidden/>
                    </div>
                    <div>
                        <input type="number" name="adminhome" class="form-control" placeholder="访问公寓楼" required=""/>
                    </div><br/>
                    <div class="rodio">
                      原因:
                        <label>
                            <input type="radio" class="flat" name="thing" value="1">探亲
                        </label>
                        <label>
                            <input type="radio" class="flat" name="thing" value="2">开会
                        </label>
                        <label>
                            <input type="radio" class="flat"  name="thing" value="3">携带贵重物品
                        </label>
                    </div>

                    <div>
                        <button type="submit" class="btn btn-default submit">提交</button>
                    </div>

                    <div class="clearfix"></div>
                </form>
            </section>
        </div>
    </div>
</div>
<%@include file="body.jsp"%>
</body>
</html>
