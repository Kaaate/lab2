<%@ page errorPage="exeption.jsp" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Calculator</title>


</head>
<body>
<form action="TaskOne" method="get" name="frm">

    First number:
    <input name="n1" type="text" /><br>


    Second number:
    <input name="n2" type="text" /><br>

    Third number:
    <input name="n3" type="text" /><br>

    Forth nymber:
    <input name="n4" type="text" /><br>


    Select task

    <select name="amal">

        <option value="first">First task</option>
        <option value="second">Second task</option>
        <option value="third">Third task</option>
    </select>


    <input type="submit" value="=" />

</form>
</body>
</html>