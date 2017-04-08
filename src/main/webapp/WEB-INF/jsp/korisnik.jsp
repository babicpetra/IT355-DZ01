<%@ taglib prefix="t" tagdir="/WEB-INF/tags"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="header.jsp" %>
<div class="container">
    <div class="featured-content">
        <div class="row-fluid">
            <div class="span5 offset1">
                <div class="block">
                    
                        <h1>${ponuda.naslov}</h1>
                        <h2>${ponuda.opis}</h2>
                        
                </div>
            </div>
            <div class="span5">
                <div class="block-content">
                    <h3>Detalji</h3>
                    <p>${ponuda.email} <br/>
                            ${ponuda.brTel}<br/>
                            ${ponuda.cena}<br/>
                            ${ponuda.kolicina}<br/>
                            ${ponuda.tip}<br/>
                        </p>
                    <p class="last">Suspendisse mauris. Fusce accumsan mollis eros. Pellentesque a diam sit amet mi ullamcorper vehicula. Integeralesuada.</p>
                </div>
            </div>
        </div>
    </div>
</div>