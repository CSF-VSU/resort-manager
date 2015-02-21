<%--
  Created by IntelliJ IDEA.
  User: agpopikov
  Date: 21/02/15
  Time: 15:02
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<tiles:insertDefinition name="defaultTemplate">
    <tiles:putAttribute name="body">

        <table style="border: solid">
            <c:forEach var="u" items="${users}">

                <tr>
                    <td>${u.firstName}</td>
                    <td>${u.lastName}</td>
                </tr>

            </c:forEach>
        </table>

        <form:form method="post" modelAttribute="user">
            <label for="first_name">First Name:</label>
            <form:input type="text" id="first_name"  path="firstName"/>
            <label for="last_name">Last Name:</label>
            <form:input type="text" id="last_name" path="lastName"/>
            <input type="submit" value="Save">
        </form:form>

    </tiles:putAttribute>
</tiles:insertDefinition>
