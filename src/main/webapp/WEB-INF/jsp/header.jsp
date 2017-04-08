<%-- 
    Document   : header
    Created on : Dec 21, 2016, 2:34:50 PM
    Author     : ko
--%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
        <title></title>
        <meta name="description" content="">
        <meta name="viewport" content="width=device-width">

        <link href="<c:url value="/resources/css/bootstrap.css"/>" rel="stylesheet" type="text/css">
        <link href="<c:url value="/resources/css/bootstrap-responsive.css"/>" rel="stylesheet" type="text/css">
        <link href="<c:url value="/resources/css/custom-styles.css"/>" rel="stylesheet" type="text/css">
        <link href="<c:url value="/resources/css/font-awesome.css"/>" rel="stylesheet" type="text/css">
        <link href="<c:url value="/resources/css/component.css"/>" rel="stylesheet" type="text/css">
        <link href="<c:url value="/resources/css/font-awesome-ie7.css"/>" rel="stylesheet" type="text/css">
        <style>
            a{
                color: #c85b5f; 
            }
            a:hover{
                color: #d59392;
            }
            

            .left{
                position: absolute;
                top:0;
                right:20px;
            }

        </style>
        <script src="<c:url value="/resources/js/modernizr-2.6.2-respond-1.1.0.min.js"/>" type="text/javascript"></script>
    </head>
    <body>
        <!--[if lt IE 7]>
            <p class="chromeframe">You are using an <strong>outdated</strong> browser. Please <a href="http://browsehappy.com/">upgrade your browser</a> or <a href="http://www.google.com/chromeframe/?redirect=true">activate Google Chrome Frame</a> to improve your experience.</p>
        <![endif]-->

        <!-- This code is taken from http://twitter.github.com/bootstrap/examples/hero.html -->
        <div class="container">

            <c:url value="/j_spring_security_logout" var="logoutUrl" />
            <form action="${logoutUrl}" method="post" id="logoutForm">
                <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
            </form>
            <script>
                function formSubmit() {
                    document.getElementById("logoutForm").submit();
                }
            </script>
            <c:if test="${pageContext.request.userPrincipal.name!= null}">
                <div class="left">   ${pageContext.request.userPrincipal.name} > <a  href="javascript:formSubmit()">Logout</a>
                </div>
            </c:if>

            <div class="site-header">
                <div class="left">
                    <sec:authorize access="hasRole('ROLE_ANONYMOUS')">
                        <a  href="<c:url value="/reg"/>">Registruj se </a> | <a href="<c:url value="/login"/>">Login</a>
                    </sec:authorize>
                </div>



                <div class="logo">
                    <h1>Berza lešnika</h1>
                    <c:if test="${pageContext.request.isUserInRole('ROLE_ADMIN')}" >
                        ADMINISTRATOR</c:if>

                    </div>
                    <div class="menu">
                        <div class="navbar">
                            <a class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse">
                                <i class="fw-icon-th-list"></i>
                            </a>
                            <div class="nav-collapse collapse">
                                <ul class="nav">
                                <c:if test="${pageContext.request.isUserInRole('ROLE_USER')}" >
                                    <li><a href="<c:url value="/pocetna"/>">Početna</a></li>
                                    <li><a href="<c:url value="/ponude"/>">Ponude</a></li>
                                    <li><a href="<c:url value="/potraznje"/>">Potražnje</a></li>
                                    <li><a href="<c:url value="/upisPonude"/>">Upis ponude</a></li>
                                    <li><a href="<c:url value="/upisPotraznje"/>">Upis potražnje</a></li>
                                    </c:if>

                                <c:if test="${!pageContext.request.isUserInRole('ROLE_ADMIN') && !pageContext.request.isUserInRole('ROLE_USER')}">
                                    <li><a href="<c:url value="/pocetna"/>">Početna</a></li>
                                    <li><a href="<c:url value="/ponude"/>">Ponude</a></li>
                                    <li><a href="<c:url value="/potraznje"/>">Potražnje</a></li>
                                    </c:if>

                                <c:if test="${pageContext.request.isUserInRole('ROLE_ADMIN')}" >
                                    <li><a href="<c:url value="/korisnici"/>">Korisnici</a></li>
                                    <li><a href="<c:url value="/reg"/>">Dodaj admina</a></li>
                                    <li><a href="<c:url value="/potraznje"/>">Uredi potražnje</a></li>
                                    <li><a href="<c:url value="/ponude"/>">Uredi ponude</a></li>
                                    </c:if>
                            </ul>
                        </div><!--/.nav-collapse -->
                    </div>

                </div>
            </div>
        </div>


    </body>
</html>
