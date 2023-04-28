package domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Setter @Getter
public class ChangeDTO { // changePwd.jsp 에서 넘어오는거 정의
	private String userid;
	private String currentPassword;
	private String newPassword;
	private String confirmPassword;
}
 