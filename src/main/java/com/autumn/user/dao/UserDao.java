package com.autumn.user.dao;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface UserDao<T> {

	Flux<T> getUsers();

	Mono<Integer> getCountOfUsers();
}
