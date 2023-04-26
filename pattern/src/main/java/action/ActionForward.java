package action;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
public class ActionForward {
	// 페이지이동방식(true, false), 페이지(String);
	
	// private 이니까 getter setter 있어야 하고 생성자 있어야 함
	private boolean isRedirect;
	private String path;
	
}
