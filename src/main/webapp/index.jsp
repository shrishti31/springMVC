<html>
<head>
<title>Login Page</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>
<div style="height:90px;width:100%;" class="bg-info">
<h1 style="text-align:center;font-size:55px;">Login</h1>
</div>
<div class="container">
<div style="height:320px;width:50%;margin-left:270px;margin-top:80px;border:2px solid;border-radius:7px;">
<div style="position:relative;top:30px;width:90%;margin-left:20px;">
<form action="login" method="post">
  <div class="form-group">
    <label for="exampleInputEmail1">Username</label>
    <input name="username" type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter username">
      </div>
  <div class="form-group">
    <label for="exampleInputPassword1">Password</label>
    <input name="password" type="password" class="form-control" id="exampleInputPassword1" placeholder="Password">
  </div>
   <button type="submit" class="btn btn-primary">Login</button>
</form>
</div>

</div>
</div>
</body>
</html>
