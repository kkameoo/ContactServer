package himedia.contactserver.mappers;

import java.util.List;

import himedia.contactserver.repository.vo.UserVo;

//shoplist.xml과 1:1 매핑된 인터페이스
public interface UserMapper {
//<select id="selectAllItems" resultType="shopItem">
	List<UserVo> selectAllUser();
	
//<select id="selectById" parameterType="Long" resultType="userItem">
	UserVo selectById(Long id);

//<insert id="insertUser" parameterType="userItem">
	void insertUser(UserVo userVo);
	
//<update id="updateUser" parameterType="userItem">
	int updateUser(UserVo vo);
	
//<delete id="deleteUser" parameterType="Long">
	int deleteUser(Long id);
}
