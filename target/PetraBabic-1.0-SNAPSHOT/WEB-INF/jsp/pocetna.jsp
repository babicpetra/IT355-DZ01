<%@include file="header.jsp" %>
<%@taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!-- Page Content -->
<div class="container">
    <br>
    <!-- Portfolio Item Heading -->
    <div class="row">
        <div class="col-lg-12">
            <h1 class="page-header">Početna strana

            </h1>
        </div>
    </div>
    <!-- /.row -->

    <!-- Portfolio Item Row -->
    <div class="row">

        <div class="col-md-8">
            <img class="img-responsive" src="https://upload.wikimedia.org/wikipedia/commons/3/3f/Hazelnuts.jpg" alt="">
        </div>

        <div class="col-md-4">
            <h3>O nama</h3>
            <h1> Poruka</h1>
            <sec:authorize access="hasRole('ROLE_USER')">
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
                    <h2>
                        Vase korisnicko ime je : ${pageContext.request.userPrincipal.name} | <a href="javascript:formSubmit()">Logout</a>
                    </h2>
                </c:if>
            </sec:authorize>
            <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nam viverra euismod odio, gravida pellentesque urna varius vitae. Sed dui lorem, adipiscing in adipiscing et, interdum nec metus. Mauris ultricies, justo eu convallis placerat, felis enim.</p>
            <h3>Na sajtu možete pogledati</h3>
            <ul>
                <li><a href="${flowExecutionUrl}&_eventId=prikaziPonude">Ponude</a>
                    
                </li>
                <li><a href="${flowExecutionUrl}&_eventId=prikaziPotraznje">Potražnje</a>
                    
                </li>
                <li>Consectetur</li>
                <li>Adipiscing Elit</li>
            </ul>
        </div>

    </div>
    <!-- /.row -->

    <!-- Related Projects Row -->
    <div class="row">

        <div class="col-lg-12">
            <h3 class="page-header">Related Projects</h3>
        </div>

        <div class="col-sm-3 col-xs-6">
            <a href="#">
                <img class="img-responsive portfolio-item" src="http://placehold.it/500x300" alt="">


            </a>
        </div>

        <div class="col-sm-3 col-xs-6">
            <a href="#">
                <img class="img-responsive portfolio-item" src="http://placehold.it/500x300" alt="">
            </a>
        </div>

        <div class="col-sm-3 col-xs-6">
            <a href="#">
                <img class="img-responsive portfolio-item" src="http://placehold.it/500x300" alt="">
            </a>
        </div>

        <div class="col-sm-3 col-xs-6">
            <a href="#">
                <img class="img-responsive portfolio-item" src="http://placehold.it/500x300" alt="">
            </a>
        </div>

    </div>
    <%@include file="footer.jsp" %>
</div>

<script src="https://code.jquery.com/jquery-3.1.1.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
