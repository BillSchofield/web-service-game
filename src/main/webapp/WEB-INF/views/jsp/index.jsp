<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
</head>

<body>
    <canvas id="canvas" width="800" height="600"></canvas>

<spring:url value="/resources/core/css/bootstrap.min.js" var="bootstrapJs"/>
<script src="//ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
<script>window.jQuery || document.write('<script src="/resources/core/js/jquery-1.11.3.js"><\/script>')</script>
<script src="/resources/core/js/vector2d.js"></script>
<script src="/resources/core/js/sprite.js"></script>
<script src="/resources/core/js/entity2d.js"></script>
<script src="/resources/core/js/entityFactory.js"></script>
<script src="/resources/core/js/keyBoardEventHandler.js"></script>
<script src="/resources/core/js/loop.js"></script>
<script src="/resources/core/js/runner.js"></script>
<script src="/resources/core/js/main.js"></script>

</body>
</html>