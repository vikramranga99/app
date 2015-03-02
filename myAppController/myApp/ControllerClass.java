package myApp;


import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

@Controller
@SessionAttributes(value={"userName"})
public class ControllerClass {
	

	int i=200;
	private static final Logger logger = Logger.getLogger(ControllerClass.class);	 

	
	
	@RequestMapping("/test")
	public ModelAndView test(HttpServletResponse response,ModelMap modelMap,String userName){
		return  new ModelAndView("test"); 
	}
	
	
	@RequestMapping("/setUser")
	public ModelAndView setUser(HttpServletResponse response,ModelMap modelMap,String userName){
		//System.out.println("Application User: ="+userName); 
		logger.debug("Application User: ="+userName);
		modelMap.addAttribute("userName",userName);
		response.setHeader("userName",userName);
		return  new ModelAndView("home"); 
	}
	
	
	@RequestMapping("/home")
	public ModelAndView home(ModelMap modelMap){
		//System.out.println("Welcome "+modelMap.get("userName"));
		logger.debug("Welcome "+modelMap.get("userName"));
		return  new ModelAndView("home"); 
	}
		
	
	@RequestMapping("/viewFiles")
	public ModelAndView viewFiles(ModelMap modelMap){
		//System.out.println("You are viewing "+modelMap.get("userName")+" files");
		return  new ModelAndView("viewFiles");
	}
	
	@RequestMapping("/uploadFile")
	public ModelAndView uploadFile(ModelMap modelMap){
		//System.out.println("File upload for "+modelMap.get("userName")+" files");  
		return  new ModelAndView("uploadFile");
	}
	
	@RequestMapping(value="/loadFile",method=RequestMethod.POST)  
	public ModelAndView loadFile(@ModelAttribute("file1")UploadFormBean uploadFormBean,ModelMap modelMap)throws Exception{
		List<MultipartFile> files = uploadFormBean.getFile1();
		//System.out.println("Total Files that are loaded:" +files.size());		 
		for(MultipartFile mf : files){
			DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS");
			Calendar cal = Calendar.getInstance();		
			String fileNm="C:/Users/Vikram/SpringApplication/app/src/main/webapp/resources/"+modelMap.get("userName")+"/"+i+"_"+mf.getOriginalFilename();
			//System.out.println("Loding" +fileNm);
			 File dlFile = new File(fileNm);
			 FileOutputStream fos = new FileOutputStream(dlFile);
			 fos.write(mf.getBytes());
			 fos.close();
			 i++;
		}	
 	 return  new ModelAndView("viewFiles");
	}
 	
		
 
    
    @RequestMapping(value="/getFileNames", method = RequestMethod.GET)
    public @ResponseBody List<FileDetails> getLitOfFiles(String userName,ModelMap modelMap,HttpServletResponse response) throws Exception {
    	//System.out.println("GetJSON.. for "+modelMap.get("userName"));
    	UserFileDetails details  = new UserFileDetails();    	
    	return details.getUserFiles((String)modelMap.get("userName"));
    }
    
	
	
	@RequestMapping(value="/getFiles",method=RequestMethod.GET)
    public void getFiles(HttpServletResponse response,String fileName,ModelMap modelMap) throws Exception {
		//System.out.println(fileName+(String)modelMap.get("userName"));
		Path path = Paths.get("C:/Users/Vikram/SpringApplication/app/src/main/webapp/resources/"+(String)modelMap.get("userName")+"/"+fileName);
		byte[] data = Files.readAllBytes(path);				 
        response.setContentType("image/jpeg");
        response.setContentLength(data.length);
        response.setHeader("Content-Disposition", "inline; filename=\"" + fileName+ "\""); 
        BufferedInputStream input = null;
        BufferedOutputStream output = null; 
        try {
            input = new BufferedInputStream(new ByteArrayInputStream(data));
            output = new BufferedOutputStream(response.getOutputStream());
            byte[] buffer = new byte[8192];
            int length;
            while ((length = input.read(buffer)) > 0) {
                output.write(buffer, 0, length);
            }
        } catch (IOException e) {
            System.out.println("There are errors in reading/writing image stream "+ e.getMessage());
        } finally {
            if (output != null){
                output.close();               
                input.close();            	
            }                            
        }
 
    }
	
 
	
	
	
	
}
