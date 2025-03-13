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
	
	//	유저 불러오기
	public UserVo selectById(Long id) {
		return userMapper.selectById(id);
	}
		
	// 새 유저 추가
	public UserVo insertUser(UserVo vo) {
		userMapper.insertUser(vo);
		//	새로 생성된 item의 PK
//		Long id = vo.getUserId();
		return vo;
	}
	
	// 유저 업데이트
	public UserVo updateUser(UserVo vo) {
		userMapper.updateUser(vo);
		return vo;
	}
	
	// 유저 카운트 업데이트
	public int updateUserCount(Long id) {
		return userMapper.updateUserCount(id);
	}
	
	//	유저 삭제
	public int deleteUser(Long id) {
		return userMapper.deleteUser(id);
	}
	
}