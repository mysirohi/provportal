<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<h1>Providers page</h1>

<ul>
<c:forEach items="${providers}" var="provider">
   <li>${provider}</li>
</c:forEach>
</ul>