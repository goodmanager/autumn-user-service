package com.autumn.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.autumn.user.entity.UserEntity;
import com.autumn.user.repository.UserRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class UserService {

	@Autowired
	private UserRepository<UserEntity> userRepository;

	public Flux<UserEntity> getUsers() {
		return userRepository.getUsers();
	}

	public Mono<Integer> getCountOfUsers() {
		return userRepository.getCountOfUsers();
	}
}
