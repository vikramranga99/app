package myApp;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class UserFileDetails {    
	
	
	public List getUserFiles(String userName) throws Exception{			
		UserDetails dtls = new UserDetails(userName);
		List  <FileDetails>fileNames = new ArrayList<FileDetails>();		
		String root=dtls.getUserRootDirectory();
		File folder = new File(root);
		File[] listOfFiles = folder.listFiles();
		int fileCnt=0;
		    for (int i = 0; i < listOfFiles.length; i++) {
		      if (listOfFiles[i].isFile()) {	
		    	    fileCnt++;
		    	    FileDetails details = new FileDetails();
			    		details.setFileName(listOfFiles[i].getName());
			    		details.setFileNum(fileCnt);
			    	fileNames.add(details);
		      } else if (listOfFiles[i].isDirectory()) {
		       // System.out.println(" TO DO:Directory " + listOfFiles[i].getName());
		      }
		    }				
		return fileNames;
	}
	

}
