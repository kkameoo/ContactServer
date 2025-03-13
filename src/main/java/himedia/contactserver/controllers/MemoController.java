package himedia.contactserver.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import himedia.contactserver.repository.vo.MemoVo;
import himedia.contactserver.services.MemoService;


@RestController
@RequestMapping("/api/memo")
public class MemoController {
	
	@Autowired
	private MemoService memoService;

//	GET : /api/user
	@GetMapping
	public ResponseEntity<List<MemoVo>> getAllMemo() {
		List<MemoVo> items = 
				memoService.selectAllMemo();
		return ResponseEntity.ok(items);
	}
	
//	GET : /api/user/{id}
	@GetMapping("/{id}")
	public ResponseEntity<MemoVo> getMemo(@PathVariable Long id) {
		MemoVo vo = memoService.selectById(id);
		return ResponseEntity.ok(vo);
	}
	
	
//	POST : /api/user -> 새로운 유저 항목 생성
	@PostMapping
	public ResponseEntity<MemoVo> createMemo(@RequestBody MemoVo vo) {
		MemoVo savedVo = memoService.insertMemo(vo);
		return ResponseEntity.ok(savedVo);	
		//	ResponseEntity.created로 하는 것이 의미상 더 나을 수도 있다.
	}
	
//	PUT : /api/user/{id} -> 기존 유저 항목 수정
	@PutMapping("/{id}")
	public ResponseEntity<MemoVo> updateItem(@RequestBody MemoVo vo,
			@PathVariable Long id) {
		vo.setMemoId(id);
		MemoVo updatedMemo = memoService.updateMemo(vo);
		return ResponseEntity.ok(updatedMemo);
	}
	
//	DELETE : /api/shoplist/{id} -> 기존 쇼핑 항목 삭제
	@DeleteMapping("/{id}")
	//	Body에 실어 보낼 내용이 없음 -> Void
	public ResponseEntity<Void> deleteMemo(@PathVariable Long id) {
		memoService.deleteMemo(id);
		return ResponseEntity.ok().<Void>build();
	}

}
