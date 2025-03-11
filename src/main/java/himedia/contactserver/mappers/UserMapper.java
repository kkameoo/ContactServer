package himedia.contactserver.mappers;

import java.util.List;

import himedia.contactserver.repository.vo.UserVo;

//shoplist.xml과 1:1 매핑된 인터페이스
public interface UserMapper {
//<select id="selectAllItems" resultType="shopItem">
List<UserVo> selectAllUser();

}
