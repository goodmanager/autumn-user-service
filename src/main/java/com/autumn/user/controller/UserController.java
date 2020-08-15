package com.autumn.user.controller;

import com.autumn.common.response.Pager;
import com.autumn.common.response.ResponseResult;
import com.autumn.user.entity.UserEntity;
import com.autumn.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/user")
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping(value = "/login")
	public Mono<ResponseResult> login() {
		Flux<UserEntity> users = userService.getUsers();

		List<Integer> list = new ArrayList<>();
		userService.getCountOfUsers().subscribe((obj) -> {
			list.add(obj);
		});
		Pager pager = new Pager();
		pager.setTotalRecords(list.get(0));
		return ResponseResult.success(Mono.just(pager), users);
	}

}
