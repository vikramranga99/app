<!DOCTYPE html>
<html lang="en">
  <head>
   	<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
   	<title> Javascript Game</title> 
	<meta name="viewport" content="width=device-width; initial-scale=1.0; maximum-scale=1.0; user-scalable=yes;" />
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="description" content="">
    <meta name="author" content="">
    <meta name="apple-mobile-web-app-title" content="File Stash" />
	<link rel="icon" href="<spring:url value="/resources/img/fileStash.ico"></spring:url>">


 	<script src="https://code.jquery.com/jquery-1.10.2.js"></script>

	<script>
	    
	$( document ).ready(function() {
		var p = $( "player" );
		var position = p.position();
		$( "player" ).text( "left: " + position.left + ", top: " + position.top );
		
	});
	
	
	</script>
	
	
	
	<style>
	.gameLayout{	  
	  border:2px black solid;
	  width:100%;
	  height:100%;	  	      
      border-radius: 5px;
      box-shadow: 10px 10px 5px #888888;	  
	}



	</style>
	</head>
<body>
<div>
  <p>Hello</p>
</div>
<p></p>

<div class="gameLayout"> 
 <div id="player">Vi</div>

</div>
 



</body>
</html>