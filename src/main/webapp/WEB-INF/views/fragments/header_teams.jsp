<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<nav class="navbar navbar-default">
		<div class="container-fluid">
		
			<div class="navbar-header">
      			<a class="navbar-brand" href="<spring:url value="/"/>">
      			Torna nyilvántartó
      			</a>
    		</div>
    		
    		<ul class="nav navbar-nav">
    		
    			<li><a href="<spring:url value="/"/>" >Kezdőoldal</a></li>
    		
    			<li class="dropdown">
          			
          			<a href="#" class="dropdown-toggle" 
          				data-toggle="dropdown" role="button" 
          				aria-expanded="false">Tornák <span class="caret"></span></a>
          	
          			<ul class="dropdown-menu" role="menu">
            			<li><a href="<spring:url value="/tournament/addTournament"/>" >Új létrehozása</a></li>
            			<li><a href="<spring:url value="/tournament/find"/>" >Listája</a></li>
          			</ul>
          			
        		</li>
        		<li class="dropdown">
        		<a href="#" class="dropdown-toggle" 
          				data-toggle="dropdown" role="button" 
          				aria-expanded="false">Csapatok<span class="caret"></span></a>
          	
          			<ul class="dropdown-menu" role="menu">
            			<li><a href="<spring:url value="/tournament/addTournament"/>" >Új létrehozása</a></li>
            			<li><a href="<spring:url value="/tournament/find"/>" >Listája</a></li>
          			</ul>
          			
        		</li>
        		
    		<!--  	
    		<li class="dropdown">
          		
          			<a href="#" class="dropdown-toggle" 
          				data-toggle="dropdown" role="button" 
          				aria-expanded="false">Resources <span class="caret"></span></a>
          		
          			<ul class="dropdown-menu" role="menu">
            			<li><a href="#">Add</a></li>
            			<li><a href="#">Find</a></li>
          			</ul>
        		
        		</li>-->
        		
    		</ul>
    		
		</div>
</nav>