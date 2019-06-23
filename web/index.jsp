<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 20.06.2019
  Time: 16:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>What_where_when</title>
  <%--<link rel="stylesheet" type="text/css" href="index.css">--%>
  <script type="text/javascript" src="index.js"></script>
</head>
<body>
<div class="form">
  <div class="tab-content">
    <div id="signup">
      <h1>Sign Up for Free</h1>

      <form action="/" method="post">

        <div class="top-row">
          <div class="field-wrap">
            <label>
              First Name<span class="req">*</span>
            </label>
            <input type="text" required autocomplete="off" />
          </div>

          <div class="field-wrap">
            <label>
              Last Name<span class="req">*</span>
            </label>
            <input type="text"required autocomplete="off"/>
          </div>

          <div class="field-wrap">
            <label>
              Surname<span class="req">*</span>
            </label>
            <input type="text"required autocomplete="off"/>
          </div>
        </div>

        <div class="field-wrap">
          <label>
            Email Address<span class="req">*</span>
          </label>
          <input type="email"required autocomplete="off"/>
        </div>

        <div class="field-wrap">
          <label>
            Set A Password<span class="req">*</span>
          </label>
          <input type="password"required autocomplete="off"/>
        </div>

        <button type="submit" class="button button-block"/>Get Started</button>

      </form>

    </div>

    <div id="login">
      <h1>Welcome Back!</h1>

      <form action="/" method="post">

        <div class="field-wrap">
          <label>
            Email Address<span class="req">*</span>
          </label>
          <input type="email"required autocomplete="off"/>
        </div>

        <div class="field-wrap">
          <label>
            Password<span class="req">*</span>
          </label>
          <input type="password"required autocomplete="off"/>
        </div>

        <p class="forgot"><a href="#">Forgot Password?</a></p>

        <button class="button button-block"/>Log In</button>

      </form>

    </div>

  </div><!-- tab-content -->

</div> <!-- /form -->
</body>
</html>
