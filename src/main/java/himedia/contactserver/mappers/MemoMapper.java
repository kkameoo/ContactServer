package himedia.contactserver.mappers;

import java.util.List;

import himedia.contactserver.repository.vo.MemoVo;

public interface MemoMapper {
	//<select id="selectAllMemo" resultType="memoItem">
		List<MemoVo> selectAllMemo();
		
	//<select id="selectById" parameterType="Long" resultType="memoItem">
		MemoVo selectById(Long id);

	//<insert id="insertMemo" parameterType="memoItem">
		void insertMemo(MemoVo memoVo);
		
	//<update id="updateMemo" parameterType="memoItem">
		int updateMemo(MemoVo memoVo);
		
	//<delete id="deleteMemo" parameterType="Long">
		int deleteMemo(Long id);
}
