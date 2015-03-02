<!DOCTYPE html>
<html lang="en">
  <head>
   	<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
   	<title>File Stash</title> 
	<meta name="viewport" content="width=device-width; initial-scale=1.0; maximum-scale=1.0; user-scalable=yes;" />
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="description" content="">
    <meta name="author" content="">
    <meta name="apple-mobile-web-app-title" content="File Stash" />
	
	<link rel="icon" href="<spring:url value="/resources/img/fileStash.ico"></spring:url>">
	<link rel="apple-touch-icon" href="<spring:url value="/resources/img/fileStash2.bmp"></spring:url>">			
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">
	<link rel="stylesheet" href="<spring:url value="/resources/css/base.css"></spring:url>">

  	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>
	<script>
	    
	$( document ).ready(function() {
		//setUser('UNKNOWN');
	});
	
	    function setUser(userNameToSet){	    	
	    	$.get('setUser?userName='+userNameToSet).done(function(){
	    		$( "#userDetails" ).empty();
		    	if(userNameToSet==''){		    		
		    		$( "#userDetails" ).append( "<br><p>Who are you?</p>");	
		    	}else{
		    		$( "#userDetails" ).append( "<p>Welcome "+userNameToSet+"</p>");
		    	}		    	
		    	//location.reload();
	    	});
	    }	    	    
	</script>
	<style>
	.userDetails{
	  color:white;
	}
	</style>
	</head>
<body>
