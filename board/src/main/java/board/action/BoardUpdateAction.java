package board.action;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import board.domain.BoardDTO;
import board.service.BoardUpdateService;
import board.service.BoardWriteService;
import board.util.BoardUploadUtils;

public class BoardUpdateAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request) throws Exception {
		
		//  multipart/form-data 형태 ==> request.getParmeter() 작업 불가 commonsFileUpload한테 부탁해야함
		// request==> BoardUploadUtils 넘겨야 함
		BoardUploadUtils utils = new BoardUploadUtils();
		Map<String, String> formData =  utils.uploadFile(request);
		
		// formData 값들을 BoardDTO 객체 생성 후 담기
		// file 이 입력된 경우와 입력이 안된 경우
		BoardDTO dto = new BoardDTO();
		dto.setBno(Integer.parseInt(formData.get("bno")));
		dto.setTitle(formData.get("title"));
		dto.setContent(formData.get("content"));
		dto.setPassword(formData.get("password"));
		if(formData.containsKey("attach")) { //file 이라는 key 값을 가지고 있으면 
			dto.setAttach(formData.get("attach"));
		}
		
		
		// 서비스작업
		BoardUpdateService service = new BoardUpdateService();
		
		//	ActionForward : 성공하면 목록 보여주기, 실패시 writeForm.jsp 
		String path = "";
		if(service.update(dto)) {
			path ="read.do?bno="+dto.getBno();
		}else {
			path ="modify.do?bno="+dto.getBno();
		}
		
		return new ActionForward(true,path); // 담는게 없어서 true로 보내

	}

}
