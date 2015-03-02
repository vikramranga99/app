<%@include file="/WEB-INF/views/header.jsp" %>
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
            <li class="active"><a href="home">Home</a></li>
            <li><a href="uploadFile">Upload File</a></li>
            <li><a href="viewFiles">View File</a></li>
          </ul>
        </div><!--/.nav-collapse -->
      </div>
    </nav>
<!--    Container -->   
    <div class="container">

      <div class="base-template">
        <h1>File Stash</h1>
        <img src="<spring:url value="/resources/img/fileStash.ico"></spring:url>"/> 
         <br><br><br><br>
        <div id="fileLoadBtn"><button class="btn btn-md btn-primary" onClick="setUser('manasa')"><span class="glyphicon "></span> Manasa</button></div><br>
        <div id="fileLoadBtn"><button class="btn btn-md btn-primary" onClick="setUser('vikram')"><span class="glyphicon "></span> Vikram</button></div>
        <div id="welcomeUser"></div>
      </div>
      

    </div>
<!-- /.container -->
  </body>
</html>
