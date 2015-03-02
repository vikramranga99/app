package myApp;


import java.util.List;   

import org.springframework.web.multipart.MultipartFile;

public class UploadFormBean {

	List<MultipartFile> file1;

	public List<MultipartFile> getFile1() {
		return file1;
	}

	public void setFile1(List<MultipartFile> file1) {
		this.file1 = file1;
	}

 
	
}
