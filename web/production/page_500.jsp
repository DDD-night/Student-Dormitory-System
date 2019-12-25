<!DOCTYPE html>
<html lang="en">
  <head>
    <%@ include file="head.jsp"%>
  </head>

  <body class="nav-md">
    <div class="container body">
      <div class="main_container">
        <!-- page content -->
        <div class="col-md-12">
          <div class="col-middle">
            <div class="text-center">
              <h1 class="error-number">500</h1>
              <h2>Internal Server Error</h2>
              <p>We track these errors automatically, but if the problem persists feel free to contact us. In the meantime, try refreshing.
              </p>
              <div class="mid_center">
                <h3>Return</h3>
                <form action="login.jsp" method="post">
                  <div class="  form-group pull-right top_search">
                    <div class="input-group">
                      <input type="" class="form-control" placeholder="返回登陆界面">
                      <span class="input-group-btn">
                              <button class="btn btn-secondary" type="submit">Go!</button>
                          </span>
                    </div>
                  </div>
                </form>
              </div>
            </div>
          </div>
        </div>
        <!-- /page content -->
      </div>
    </div>
<%@ include file="body.jsp"%>
  </body>
</html>