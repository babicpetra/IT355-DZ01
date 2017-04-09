
<%@ taglib prefix="t" tagdir="/WEB-INF/tags"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="header.jsp" %>
<div class="container">

    <div class="logo">
        <h2>Ponude</h2>

        <c:if test="${!empty ponude}">

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
                    <c:forEach items="${ponude}" var="ponuda">

                        <tr>
                            <td> <a href="<c:url value="/korisnik/${ponuda.id}"/>">${ponuda.naslov}</a></td>
                            <td>${ponuda.lokacija}</td>
                            <td>${ponuda.email}</td>
                            <td>${ponuda.brTel}</td>
                            <td>${ponuda.cena}</td>
                            <td>${ponuda.kolicina}</td>
                            <td>${ponuda.tip}</td>
                            <td>${ponuda.username}</td>

                            <c:if test="${username == ponuda.username}">
                                <c:if test="${pageContext.request.isUserInRole('ROLE_USER')}">
                                    <td><a href="<c:url value='/editPonuda/${ponuda.id}' />">Izmeni</a></td>
                                    <td><a href="<c:url value='/deletePonuda/${ponuda.id}' />">Obriši</a></td>
                                </c:if>
                            </c:if>


                            <c:if test="${pageContext.request.isUserInRole('ROLE_ADMIN')}">
                                <td><a href="<c:url value='/editPonuda/${ponuda.id}' />">Izmeni</a></td>
                                <td><a href="<c:url value='/deletePonuda/${ponuda.id}' />">Obriši</a></td>
                            </c:if>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </c:if>
        <%@include file="footer.jsp" %>
    </div>
</div>
