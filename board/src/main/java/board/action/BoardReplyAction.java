package board.action;

import java.net.URLEncoder;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import board.domain.BoardDTO;
import board.service.BoardReplyService;
import board.util.BoardUploadUtils;

public class BoardReplyAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request) throws Exception {
		// multipart/form-data 형태 ==> request.getParmeter() 작업 불가 commonsFileUpload한테 부탁해야함
		BoardUploadUtils utils = new BoardUploadUtils();
		Map<String, String> formData = utils.uploadFile(request);
		
		// DTO 담기
		BoardDTO dto = new BoardDTO();
		// 답변글(새 글) 정보
		dto.setName(formData.get("name"));
		dto.setTitle(formData.get("title"));
		dto.setContent(formData.get("content"));
		dto.setPassword(formData.get("password"));
		if(formData.containsKey("attach")) {
			dto.setAttach(formData.get("attach"));
		}

		// 원본글 정보
		int bno = Integer.parseInt(formData.get("bno")); // 원본글 번호 쓰려고 변수
		dto.setReRef(Integer.parseInt(formData.get("re_ref")));
		dto.setReLev(Integer.parseInt(formData.get("re_lev")));
		dto.setReSeq(Integer.parseInt(formData.get("re_seq")));
		
		// 페이지 나누기 정보
		String criteria = formData.get("criteria");
		String keyword = URLEncoder.encode(formData.get("keyword"), "utf-8");
		String page = formData.get("page");
		String amount = formData.get("amount");

		
		//
		BoardReplyService service = new BoardReplyService();
		
		String path = "";
		if(service.replyInsert(dto)) {
			path = "list.do?criteria="+criteria+"&keyword="+keyword+"&page="+page+"&amount="+amount;
		}else {
			path = "replyView.do?bno="+bno+"&criteria="+criteria+"&keyword="+keyword+"&page="+page+"&amount="+amount;
		}
		
		return new ActionForward(true, path);
	}

}
