<%@ taglib prefix="t" tagdir="/WEB-INF/tags"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="header.jsp" %>
<c:url var="upisPonude" value="/upisPonude" ></c:url>
    <div class="container">
        <h2>Unesite ponudu</h2>
        <div>
        <c:url var="post_url"  value="/upisPonude" />
        <form:form method="POST" action="${post_url}" modelAttribute="ponuda">
            <% String success = (String) request.getAttribute("successMsg");%>
            <%= (success != null) ? "<div class=\"alert alert-success\">" + success + "</div>" : ""%>

            <div class="container" >
                <form:input value="${username}" id="username" path="username" type="hidden" />
                     <form:input type="hidden" id="id"  class="form-control" placeholder="id" path="id" />
                <form:label path="naslov">
                    Naslov*
                </form:label>
                <form:input type="text" id="naslov"   path="naslov" required="required"/>
            </div>

            <div>
                <form:label path="lokacija">
                    Lokacija*
                </form:label>
                <form:input type="text" 
                            id="lokacija" class="form-control" path="lokacija" required="required"/>
            </div>
            
            <div>
                <form:label path="email">
                    Email*
                </form:label>
                <form:input type="email" id="email" class="form-control" path="email" required="required"/>
            </div>
            
            <div>
                <form:label path="brTel">
                    Broj telefona
                </form:label>
                <form:input type="text" id="brTel"  path="brTel"/>
            </div>

            
            <div>
                <form:label path="kolicina">
                    Količina* (u kilogramima)
                </form:label>
                <form:input type="number" id="kolicina" class="form-control" path="kolicina" required="required"/>
            </div>
            
            
            <div class="form-group">
                <form:label path="cena">
                    Cena* (u dinarima)
                </form:label>
                <form:input type="number" id="cena" class="form-control" path="cena" required="required"/>
            </div>
            
            <div class="form-group">
                <form:label path="opis">
                    Opis*
                </form:label>
                <form:textarea type="text" id="opis" class="form-control" placeholder="Unesite opis ponude..." path="opis" required="required"/>
            </div>
            
            <div class="form-group">
             <form:label for="tip" path="tip">Tip*</form:label>
             <form:select id="tip" class="form-control"  path="tip">
                      
                    <form:options items="${tipovi}" itemValue="id" itemLabel="name" />
                </form:select>
             </div>
            <button class="button button-block" name="submit"/>Dodaj</button>
        </form:form>
    </div>
</div>
<%@include file="footer.jsp" %>