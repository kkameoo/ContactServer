package himedia.contactserver.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import himedia.contactserver.mappers.UserMapper;
import himedia.contactserver.repository.vo.UserVo;


@Service
public class UserService {
	@Autowired
	private UserMapper userMapper;
	
	//	목록 불러오기
	public List<UserVo> selectAllUser() {
		List<UserVo> items = 
				userMapper.selectAllUser();
		return items;
	}
		
}