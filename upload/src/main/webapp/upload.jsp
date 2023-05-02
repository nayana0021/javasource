<%@page import="java.net.URLEncoder"%>
<%@page import="java.util.UUID"%>
<%@page import="java.util.Iterator"%>
<%@page import="org.apache.commons.fileupload.FileItem"%>
<%@page import="java.util.List"%>
<%@page import="java.io.File"%>
<%@page import="org.apache.commons.fileupload.disk.DiskFileItemFactory"%>
<%@page import="org.apache.commons.fileupload.servlet.ServletFileUpload"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//request.setCharacterEncoding("utf-8"); 안되는 상황 한글깨짐

	// 현재 request에 file upload 요청이 들어있는지 확인 : Check that we have a file upload request
	boolean isMultipart = ServletFileUpload.isMultipartContent(request);	

	if(isMultipart){
		// Create a factory for disk-based file items
		DiskFileItemFactory factory = new DiskFileItemFactory();

		// Create a new file upload handler
		ServletFileUpload upload = new ServletFileUpload(factory);

		// Parse the request 담음
		List<FileItem> items = upload.parseRequest(request);
		
		// Process the uploaded items 하나씩 꺼내서 폼필드인지 검증
		Iterator<FileItem> iter = items.iterator();
		
		String name=null, value=null;
		
		while (iter.hasNext()) {
		    FileItem item = iter.next();

		    // 일반요소
		    if (item.isFormField()) {
		    	name = item.getFieldName();
		        value = item.getString("utf-8");
		        out.print("<h3>일반 데이터</h3>");
		        out.print(name+" : "+value+"<br>");
		    } else { // 파일요소
		    	name = item.getFieldName();
		        value = item.getName();
		        long size = item.getSize();
		        
		        out.print("<h3>파일 데이터</h3>");
		        out.print(name+" : "+value+" - "+ size +"<br>");
		        
		        // 파일 저장
		        if(!name.isEmpty()){
		        	String path = "/Users/youngkyung/Documents/upload"; // 경로
		        	
		        	//고유값 생성  java.util
		        	UUID uuid = UUID.randomUUID();
		        	
		        	// 		/Users/youngkyung/Documents/upload//고유값_배경.1.jpg 
		        	File f = new File(path+"//"+uuid.toString()+"_"+value); // 파일 객체 생성. upload 폴더에 가서 저장시켜줘
		        	item.write(f); // 파일 저장
		        	
		        	
		        	// 다운로드를 위한 링크 생성 - 링크로 따라가는 것들은 인코딩을 해줘야 함
		        	String encodeName = URLEncoder.encode(f.getName(),"utf-8");
		        	
		        	
		        	out.print("<p>");
		        	out.print("<a href='download.jsp?fileName="+encodeName+"'>"+value+"</a>");
		        	out.print("</p>");
		        	
		        	
		        }
		        
		        
		        
		    }
		}
		
	}

%>