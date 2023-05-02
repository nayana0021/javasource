package board.util;

import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

// upload.jsp 에서 했던 작업
public class BoardUploadUtils {
	
	public Map<String, String> uploadFile(HttpServletRequest request){
		
		
		Map<String, String> formData = new HashMap<>();
		
		
		
		
		// 현재 request에 file upload 요청이 들어있는지 확인 : Check that we have a file upload request
		boolean isMultipart = ServletFileUpload.isMultipartContent(request);	

		if(isMultipart){
			// Create a factory for disk-based file items
			DiskFileItemFactory factory = new DiskFileItemFactory();

			// Create a new file upload handler
			ServletFileUpload upload = new ServletFileUpload(factory);
			
			try {
				// Parse the request 담음
				List<FileItem> items = upload.parseRequest(request);
				
				// Process the uploaded items 하나씩 꺼내서 폼필드인지 검증
				Iterator<FileItem> iter = items.iterator();
				
				String name=null, value=null;
				
				while (iter.hasNext()) {
				    FileItem item = iter.next();

				    // 필드명 가져오기
				    name = item.getFieldName();
				    
				    
				    // 일반요소 - writeForm에서 name,password,content,title
				    if (item.isFormField()) {
				        value = item.getString("utf-8");
				        
				        formData.put(name, value);
				        
				    } else { // 파일요소
				    	
				        value = item.getName();
				        
				        // 파일 저장 (파일명이 있고 파일 크기가 0보다 큰)
				        if(!name.isEmpty() && item.getSize() > 0){
				        	String path = "/Users/youngkyung/Documents/upload"; // 경로
				        	
				        	//고유값 생성  java.util
				        	UUID uuid = UUID.randomUUID();
				        	
				        	// 		/Users/youngkyung/Documents/upload//고유값_배경.1.jpg 
				        	File f = new File(path+"//"+uuid.toString()+"_"+value); // 파일 객체 생성. upload 폴더에 가서 저장시켜줘
				        	
				        	//uuid 값이 포함된 파일명이 필요해서
				        	formData.put(name, f.getName());
				        	
				        	item.write(f); // 파일 저장
				        }
				    }
				}

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return formData;
	}
}
