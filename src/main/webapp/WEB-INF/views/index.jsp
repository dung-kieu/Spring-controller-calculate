<%--
  Created by IntelliJ IDEA.
  User: anh dung
  Date: 12/11/2019
  Time: 10:38 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Calculator</title>
  </head>
  <body>
  <fieldset>
    <h1>Calculator</h1>
    <form method="post" action="/calculate">
      <input type="number" name="firstNumber" value="${number1}">
      <input type="number" name="secondNumber" value="${number2}">
      <br>
      <br>
      <button type="submit" name="operator" value="+">Addition(+)</button>
      <button type="submit" name="operator" value="-">Subtraction(-)</button>
      <button type="submit" name="operator" value="*">Multiplication(X)</button>
      <button type="submit" name="operator" value="/">Division(/)</button>
    </form>
    <p>Result: ${result}</p>
  </fieldset>

  </body>
</html>