<%@ taglib prefix="t" tagdir="/WEB-INF/tags"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="header.jsp" %>
<div class="container">

    <div class="logo">
        <h2>Korisnici</h2>

        <c:if test="${!empty korisnici}">

            <table class="table table-striped">
                <thead>
                    <tr>
                        <th>Username</th>
                        <th>Ime</th>
                        <th>Prezime</th>
                        <th>Adresa</th>
                        <th>Broj telefona</th>
                    </tr>
                </thead>
                <tbody> 
                    <c:forEach items="${korisnici}" var="korisnik">

                        <tr>
                            <td>${korisnik.username}</td>
                            <td>${korisnik.ime}</td>
                            <td>${korisnik.prezime}</td>
                            <td>${korisnik.adresa}</td>
                            <td>${korisnik.telefon}</td>
                            <td><a href="<c:url value='/deleteKorisnik/${korisnik.id}' />">Obriši</a></td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </c:if>
        <%@include file="footer.jsp" %>
    </div>
</div>