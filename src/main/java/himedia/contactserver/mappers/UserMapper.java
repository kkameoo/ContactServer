package himedia.contactserver.mappers;

import java.util.List;

import himedia.contactserver.repository.vo.UserVo;


public interface UserMapper {
//<select id="selectAllItems" resultType="userItem">
	List<UserVo> selectAllUser();
	
//<select id="selectById" parameterType="Long" resultType="userItem">
	UserVo selectById(Long id);

//<insert id="insertUser" parameterType="userItem">
	void insertUser(UserVo userVo);
	
//<update id="updateUser" parameterType="userItem">
	int updateUser(UserVo vo);
	
//<update id="updateUserCount" parameterType="Long">
	int updateUserCount(Long id);
	
//<delete id="deleteUser" parameterType="Long">
	int deleteUser(Long id);
	

	
}
