<%@ taglib prefix="t" tagdir="/WEB-INF/tags"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="header.jsp" %>
<div class="container">

    <div class="logo">
        <h2>Potražnje</h2>

        <c:if test="${!empty potraznje}">

            <table class="table table-striped">
                <thead>
                    <tr>
                        <th>Naslov</th>
                        <th>Lokacija</th>
                        <th>Email</th>
                        <th>Broj telefona</th>
                        <th>Cena(u dinarima)</th>
                        <th>Količina(u kilogramima)</th>
                        <th>Tip</th>
                        <th>Username</th>
                    </tr>
                </thead>
                <tbody> 
                    <c:forEach items="${potraznje}" var="potraznja">

                        <tr>
                            <td> <a href="<c:url value="/korisnik/${potraznja.id}"/>">${potraznja.naslov}</a></td>
                            <td>${potraznja.lokacija}</td>
                            <td>${potraznja.email}</td>
                            <td>${potraznja.brTel}</td>
                            <td>${potraznja.cena}</td>
                            <td>${potraznja.kolicina}</td>
                            <td>${potraznja.username}</td>
                            <td>${username}</td>
                            <c:if test="${pageContext.request.isUserInRole('ROLE_ADMIN')}" >
                            <td><a href="<c:url value='/editPotraznja/${potraznja.id}' />">Izmeni</a></td>
                            <td><a href="<c:url value='/deletePotraznja/${potraznja.id}' />">Obriši</a></td>
                            </c:if>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </c:if>
        <%@include file="footer.jsp" %>
    </div>
</div>
