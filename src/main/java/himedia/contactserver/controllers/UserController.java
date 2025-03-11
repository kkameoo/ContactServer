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

import himedia.contactserver.repository.vo.UserVo;
import himedia.contactserver.services.UserService;


@RestController
@RequestMapping("/api/user")
public class UserController {

	@Autowired
	private UserService userService;

//	GET : /api/user
	@GetMapping
	public ResponseEntity<List<UserVo>> getAllUser() {
		List<UserVo> items = 
				userService.selectAllUser();
		return ResponseEntity.ok(items);
	}
	
//	GET : /api/user/{id}
	@GetMapping("/{id}")
	public ResponseEntity<UserVo> getUser(@PathVariable Long id) {
		UserVo vo = userService.selectById(id);
		return ResponseEntity.ok(vo);
	}
	
	
//	POST : /api/user -> 새로운 유저 항목 생성
	@PostMapping
	public ResponseEntity<UserVo> createUser(@RequestBody UserVo vo) {
		UserVo savedVo = userService.insertUser(vo);
		return ResponseEntity.ok(savedVo);	
		//	ResponseEntity.created로 하는 것이 의미상 더 나을 수도 있다.
	}
	
//	PUT : /api/user/{id} -> 기존 유저 항목 수정
	@PutMapping("/{id}")
	public ResponseEntity<UserVo> updateItem(@RequestBody UserVo vo,
			@PathVariable Long id) {
		vo.setUserId(id);
		UserVo updatedUser = userService.updateUser(vo);
		return ResponseEntity.ok(updatedUser);
	}
	
//	DELETE : /api/shoplist/{id} -> 기존 쇼핑 항목 삭제
	@DeleteMapping("/{id}")
	//	Body에 실어 보낼 내용이 없음 -> Void
	public ResponseEntity<Void> deleteUser(@PathVariable Long id) {
		userService.deleteUser(id);
		return ResponseEntity.ok().<Void>build();
	}
	
	
}