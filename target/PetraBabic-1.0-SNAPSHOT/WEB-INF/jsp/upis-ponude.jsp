<%-- 
    Document   : ponuda
    Created on : Dec 21, 2016, 2:34:29 PM
    Author     : ko
--%>


<%@taglib uri="http://www.springframework.org/tags/form"   prefix="form"%>
<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ include file="header.jsp" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<br/>
<br/>
<h2>Unesite ponudu</h2>

<form:form method="POST" action="${flowExecutionUrl}" commandName="ponuda">
   <input type="hidden" name="_eventId" value="performAdd">
        <input type="hidden" name="_flowExecutionKey"
                   value="${flowExecutionKey}" />   
    <table>
        <tr>
            <td><form:label path="imeIPrezime"><spring:message code="name"/></form:label></td>
            <td><form:input path="imeIPrezime" /></td>
           
        </tr>
        <tr>
            <td><form:label path="email"><spring:message code="email"/></form:label></td>
            <td><form:input path="email" /></td>
        </tr>
        <tr>
            <td><form:label path="kolicina"><spring:message code="quantity"/></form:label></td>
            <td><form:input path="kolicina" /></td>
        </tr>
        <tr>
            <td><form:label path="lokacija"><spring:message code="location"/></form:label></td>
            <td><form:input path="lokacija" /></td>
        </tr>
        <tr>
            <td><form:label path="brojTelefona"><spring:message code="number"/></form:label></td>
            <td><form:input path="brojTelefona" /></td>
        </tr>
        <tr>
            <td><form:label path="cena"><spring:message code="price"/></form:label></td>
            <td><form:input path="cena" /></td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="submit" value="Objavi"/>
            </td>
        </tr>
    </table>
</form:form>
<%@ include file="footer.jsp" %>
