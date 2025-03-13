package himedia.contactserver.repository.vo;

import java.sql.Timestamp;


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
public class MemoVo {
	
	private Long memoId;
	private String title;
	private String content;
	private Timestamp regDate;
	private Long userId;

}
