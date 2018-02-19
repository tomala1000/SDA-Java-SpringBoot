<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Hello Facebook</title>
</head>
<body>
<h3>Connect to Facebook</h3>

<form action="/connect/facebook" method="POST">
    <input type="hidden" name="scope" value="user_posts" />
    <div class="formInfo">
        <p>You aren't connected to Facebook yet. Click the button to connect this application with your Facebook account.</p>
    </div>
    <p><button type="submit">Connect to Facebook</button></p>
</form>
</body>
</html>