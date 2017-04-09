<%@ taglib prefix="t" tagdir="/WEB-INF/tags"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="header.jsp" %>
<!DOCTYPE html>


<html lang="en" class="no-js">
    <!-- BEGIN HEAD -->
    <head>
        <meta charset="utf-8"/>
        <title>Sign-Up/Login Form</title>
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta content="width=device-width, initial-scale=1" name="viewport"/>
        <meta content="" name="description"/>
        <meta content="" name="author"/>
    </head>

    <body onload='document.loginForm.username.focus();'>

        <header class="header navbar-fixed-top">

        </header>


        <div class="container">

            <div class="logo">

                <c:if test="${pageContext.request.isUserInRole('ROLE_ADMIN')}" >
                                    <h2 class="carousel-title">Unesite podatke o novom administratoru</h2>
                       </c:if>
                <c:if test="${!pageContext.request.isUserInRole('ROLE_ADMIN')}" >
                                      <h2 class="carousel-title">Registruj se</h2>
                <p>Nemaš nalog? <br/> Registracija je besplatna!
                </p>
                       </c:if>
              

                <div class="form">

                    <div id="signup">   




                        <form:form modelAttribute="regi" method="POST" >
                           
                                <% String success = (String) request.getAttribute("successMsg");%>
                                <%= (success != null) ? "<div class=\"alert alert-success\">" + success + "</div>" : ""%>
                          

                            


                            <div class="top-row">
                                <div class="field-wrap">
                                    <label>
                                        Ime<span class="req">*</span>
                                    </label>
                                    <form:input type="text" path="ime" id="ime" required="required"/>
                                </div>

                                <div class="field-wrap">
                                    <label>
                                        Prezime<span class="req">*</span>
                                    </label>
                                    <form:input  path="prezime" id="prezime" required="required"/>
                                </div>

                            </div>

                            <div class="field-wrap">
                                <label>
                                    Username<span class="req">*</span>
                                </label>

                                <form:input type="text" path="username" id="username" required="required"/>
                            </div>

                            <div class="field-wrap">
                                <label>
                                    Password<span class="req">*</span>
                                </label>
                                <form:input type="password" path="password" id="password" required="required"/>
                            </div>

                            <div class="field-wrap">
                                <label>
                                    Adresa<span class="req">*</span>
                                </label>
                                <form:input type="text" path="adresa" id="adresa" required="required"/>
                            </div>

                            <div class="field-wrap">
                                <label>
                                    Telefon<span class="req">*</span>
                                </label>
                                <form:input type="text" path="telefon" id="telefon" required="required"/>
                            </div>
                            <div class="field-wrap">
                                <form:input type="hidden"  path="enabled" id="enabled" value="1"/>
                            </div>

                            <div class="field-wrap">
                                <c:if test="${pageContext.request.isUserInRole('ROLE_ADMIN')}" >
                                    <form:input path="role"  id="role" value="ROLE_ADMIN" type="hidden" />
                                </c:if>
                                <c:if test="${!pageContext.request.isUserInRole('ROLE_USER')}" >
                                    <form:input path="role"  id="role" value="ROLE_USER" type="hidden" />
                                </c:if>
                            </div>

                            <button class="button button-block" name="submit"/>Register</button>
                        </form:form>


                    </div>

                    <div id="login">   

                    </div>

                </div><!-- tab-content -->

            </div> <!-- /form -->
            <script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>
            <script src="<c:url value="/resources/js/login.js" />"></script>	

        </div>
    </body>
    <!-- END BODY -->
</html>
