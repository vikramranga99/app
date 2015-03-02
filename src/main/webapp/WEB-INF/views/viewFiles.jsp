<%@include file="/WEB-INF/views/header.jsp" %>
<style>
img{
	width:100%; 
	height:100%;
}
.viewUserImages{
    border: 2px solid;
    border-radius: 5px;
    box-shadow: 10px 10px 5px #888888;
}
</style>
<script>
$( document ).ready(function() {
  $.ajax({ 
   	    type: 'GET', 
   	    url: 'getFileNames', 
   	    dataType: 'json',
   	    success: function (data) { 
   	        $.each(data, function(index, element) {
   	            console.log(element.fileName);
   	            var imgURL='<div id="usrImg" class="viewUserImages"><img  src="<spring:url value="/getFiles?fileName='+element.fileName+'"></spring:url>"/></div><br>';
   	         $('#userImages').append(imgURL);
   	        });
   	    }
   	});       
});
</script>
<!--    Nav Bar -->   
    <nav class="navbar navbar-inverse navbar-fixed-top">
      <div class="container">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <span class="navbar-brand" style="color:white">File Stash</span>
        </div>
        <div id="navbar" class="collapse navbar-collapse">
          <ul class="nav navbar-nav">
            <li><a href="home">Home</a></li>
            <li><a href="uploadFile">Upload File</a></li>
            <li class="active"><a href="viewFiles">View File</a></li>
          </ul>
          <div class="navbar-form navbar-right">
            <div class="form-group">
              <button class="btn btn-success" onClick="setUser('manasa')"><span class="glyphicon "></span> Manasa</button>
              <button class="btn btn-success" onClick="setUser('vikram')"><span class="glyphicon "></span>Vikram</button>   
              <div id="userDetails" class="userDetails">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Who are you?</div>                        	             
            </div>
           </div>                              
        </div><!--/.nav-collapse -->
      </div>
    </nav>
	<!--    Container -->    
      <div class="container">
      	<div class="base-template">      	
      		   <div id="userImages">      		      
      		   </div> 																	
              </div>
		 </div>						
   </body>
</html>
 