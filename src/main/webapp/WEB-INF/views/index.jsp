<%@page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="ko">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>To-do List</title>
  <link rel="stylesheet" href="/css/css.css">
</head>
<body>
<div class="container">
  <div class="todo-list">
    <h2>To-do List</h2>
    <div class="row">
      <input type="text" id="input-box" placeholder="Add your task">
      <button id="add-btn">Add</button>
    </div>
    <ul>
      <c:forEach var="task" items="${tasks}">
        <li>${task.contents}<button class="delete-btn" id="task-${task.id}">✖️</button></li>
      </c:forEach>
    </ul>
  </div>
</div>
<script src="/js/task.js"></script>
</body>
</html>