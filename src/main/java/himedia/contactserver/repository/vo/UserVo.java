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
	private int count;
	
	public UserVo(String name, String email, String phoneNumber, String address, String group) {
		super();
		this.name = name;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.group = group;
		this.count = count;
	}
}
