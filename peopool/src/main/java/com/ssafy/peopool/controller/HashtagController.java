package com.ssafy.peopool.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.peopool.model.Hashtag;
import com.ssafy.peopool.model.service.HashtagService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/has")
@CrossOrigin(origins="*",allowedHeaders = "*")
public class HashtagController {

	private static final String SUCCESS = "success";
	private static final String FAIL = "fail";

	@Autowired
	HashtagService hashtagService;

	@ApiOperation(value = "사용자별 등록한 태그목록", response = String.class)
	@GetMapping("/tag")
	public ResponseEntity<List<Map<String, Object>>> tagByUser(@RequestParam("index")int index, @RequestParam("type")int type ) {
		return new ResponseEntity<>(hashtagService.tagByUser(index, type), HttpStatus.OK);

	}
	
	@ApiOperation(value = "태그별 등록한 사용자목록", response = String.class)
	@GetMapping("/user")
	public ResponseEntity<List<Map<Object, Object>>> userByTag(@RequestParam("name")String name, @RequestParam("type")int type ) {
		return new ResponseEntity<>(hashtagService.userByTag(name, type), HttpStatus.OK);

	}
	
	@ApiOperation(value = "선택된 태그를 모두 포함하는 사용자 교집합", response = String.class)
	@GetMapping("/inter")
	public ResponseEntity<List<Map<Object, Object>>> userTagIntersection(@RequestParam("list")List<Integer> list){
		return new ResponseEntity<>(hashtagService.userTagIntersection(list), HttpStatus.OK);
	}
	
	@ApiOperation(value = "선택된 태그를 포함한 사용자 합집합", response = String.class)
	@GetMapping("/union")
	public ResponseEntity<List<Map<Object, Object>>> userTagUnion(@RequestParam("list")List<Integer> list){
		return new ResponseEntity<>(hashtagService.userTagUnion(list), HttpStatus.OK);
	}

	@ApiOperation(value = "태그를 등록한 사용자 수", response = String.class)
	@GetMapping("/count")
	public ResponseEntity<List<Map<String, Object>>> countByTag() {
		return new ResponseEntity<>(hashtagService.countByTag(), HttpStatus.OK);

	}

	@ApiOperation(value = "태그 등록", response = String.class)
	@PostMapping()
	public ResponseEntity<String> registerHashtag(@RequestBody Hashtag hashtag) {
		if (hashtagService.registerHashtag(hashtag)) {
			return new ResponseEntity<String>(SUCCESS, HttpStatus.OK);
		}
		return new ResponseEntity<String>(FAIL, HttpStatus.NO_CONTENT);

	}

	@ApiOperation(value = "태그 삭제", response = String.class)
	@DeleteMapping("{tag_index}")
	public ResponseEntity<String> deleteHashtag(@PathVariable("tag_index") int index) {
		if (hashtagService.deleteHashtag(index)) {
			return new ResponseEntity<String>(SUCCESS, HttpStatus.OK);
		}
		return new ResponseEntity<String>(FAIL, HttpStatus.OK);

	}

}
