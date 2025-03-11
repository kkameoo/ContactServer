package himedia.contactserver.repository.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class UserVo {
	private Long userId;
	private String name;
	private String email;
	private String phoneNumber;
	private String address;
	private String group;
}
