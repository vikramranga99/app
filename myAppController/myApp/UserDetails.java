package myApp;

import java.io.BufferedReader;  
import java.io.FileReader;
import java.io.IOException;

public class UserDetails {

	public String userName;	
	public String userRootDirectory;
	
	UserDetails(String userName)throws Exception{
		setUserName(userName);
		BufferedReader br = new BufferedReader(new FileReader("C:/Users/Vikram/SpringApplication/app/src/main/webapp/resources/userDictionary.txt"));
		String line;
		while ((line = br.readLine()) != null) {
		   String[] dtl=line.split(",");		   
		   if(dtl[0].equals(userName)){
			   setUserRootDirectory("C:/Users/Vikram/SpringApplication/app/src/main/webapp/resources/"+userName); 
		   }
		}
		br.close();		
	}		
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
 
	public String getUserRootDirectory() {
		return userRootDirectory;
	}
	public void setUserRootDirectory(String userRootDirectory) throws IOException {
		this.userRootDirectory = userRootDirectory;
	}
	
	
	
}
