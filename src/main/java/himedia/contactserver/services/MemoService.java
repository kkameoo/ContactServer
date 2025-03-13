package himedia.contactserver.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import himedia.contactserver.mappers.MemoMapper;
import himedia.contactserver.repository.vo.MemoVo;


@Service
public class MemoService {
	
	@Autowired
	private MemoMapper memoMapper;
	
	//	목록 불러오기
	public List<MemoVo> selectAllMemo() {
		List<MemoVo> items = 
				memoMapper.selectAllMemo();
		return items;
	}
	
	//	유저 불러오기
	public MemoVo selectById(Long id) {
		return memoMapper.selectById(id);
	}
		
	// 새 유저 추가
	public MemoVo insertMemo(MemoVo vo) {
		memoMapper.insertMemo(vo);
		//	새로 생성된 item의 PK
//		Long id = vo.getUserId();
		return vo;
	}
	
	// 유저 업데이트
	public MemoVo updateMemo(MemoVo vo) {
		memoMapper.updateMemo(vo);
		return vo;
	}
	
	//	유저 삭제
	public int deleteMemo(Long id) {
		return memoMapper.deleteMemo(id);
	}

}
