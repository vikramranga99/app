<%@include file="/WEB-INF/views/header.jsp" %>
<!-- Page CSS -->
<!-- Page Jave Script -->
<script>
$(document).ready( function() {
	$( "#fileLoadBtn" ).hide();
	$( "#fileLoadingBtn" ).hide();
    $('.btn-file :file').on('fileselect', function(event, numFiles, label) {    	
        $( "#fileSelector" ).hide();
        $( "#fileLoadBtn" ).show();
        $( "#filesSelected" ).empty();
        $( "#filesSelected" ).append( "<p>You have selected "+numFiles+" files to upload</p>" );
    });
});

$(document).on('change', '.btn-file :file', function() {	
    var input = $(this),
        numFiles = input.get(0).files ? input.get(0).files.length : 1,
        label = input.val().replace(/\\/g, '/').replace(/.*\//, '');
    input.trigger('fileselect', [numFiles, label]);
    $( "#fileSelector" ).hide();
});

function submitThis(){
	$( "#fileLoadBtn" ).hide();
	$( "#fileLoadingBtn" ).show();
	document.getElementById('').submit('loadFile');
}
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
            <li class="active"><a href="uploadFile">Upload File</a></li>
            <li><a href="viewFiles">View File</a></li>
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
      	<div class="starter-template">
      		<br><br>
		    <form method="POST" enctype="multipart/form-data" action="loadFile">
		    <div id="fileSelector"><span class="btn btn-default btn-file">Select files to load<input type="file" name="file1" multiple></span></div>		     		    
		    <div id="fileLoadBtn"><button class="btn btn-md btn-primary" onClick="submitThis()"><span class="glyphicon "></span> Load selected files</button></div>
			<div id="fileLoadingBtn"><button class="btn btn-lg btn-warning"><span class="glyphicon glyphicon-refresh spinning"></span> Loading...</button></div>		       
		    <br>
		    <div id="filesSelected"></div>														
			</form>
			</div>
		</div>						
</body>
</html>