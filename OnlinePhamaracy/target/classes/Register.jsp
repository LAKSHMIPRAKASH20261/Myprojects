<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
</head>
<body>
    <form style="background-color: blue;" action="login" method="get">
        
        <input
            style="margin-bottom: 10px; padding: 10px; border-radius: 50px;"
            placeholder="user name" type="text" name="name" /><br /> <input
            style="margin-bottom: 10px; padding: 10px; border-radius: 50px;"
            placeholder="Email" type="email" name="email" /><br />
        <hr />

 

        <input
            style="margin-bottom: 10px; padding: 10px; border-radius: 50px;"
            placeholder="Password" type="password" name="pwd" /><br /> <input
            style="margin-bottom: 10px; padding: 10px; border-radius: 50px;"
            placeholder="Confirm Password" type="password" name="cpwd" /><br /> <label
            style="margin-bottom: 10px; color: #fff;">select country</label> <select
            style="margin-bottom: 30px;">
            <option></option>
            <option>India</option>
            <option>US</option>
        </select><br /> <label style="margin-bottom: 10px; color: #fff;">select
            State</label> <select style="margin-bottom: 30px;">
            <option></option>
            <option>Telangana</option>
            <option>Andhra Pradesh</option>
        </select><br /> <label style="margin-bottom: 10px; color: #fff;">select
            city</label> <select style="margin-bottom: 30px;">
            <option></option>
            <option>Hydeabad</option>
            <option>Jagityal</option>
            <option>Karimnagar</option>
            <option>Khammam</option>
        </select><br />

 

        <button
            style="width: 100px; height: 50px; border-radius: 50px; margin-left: 30px;">Register</button>
            <button>signin</button>
            
    </form>
</body>
</html>