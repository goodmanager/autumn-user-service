package com.autumn.user.repository;

import com.autumn.common.dao.BaseDao;
import com.autumn.user.dao.UserDao;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Repository
public class UserRepository<T> extends BaseDao<T> implements UserDao<T> {

	private static final String MAPPER_CLASS = "com.autumn.user.dao.UserDao.";

	public UserRepository(SqlSessionFactory sqlSessionFactory) {
		super(sqlSessionFactory);
	}

	@Override
	public Flux<T> getUsers() {
		return this.applySelectList(MAPPER_CLASS + "getUsers", null);
	}

	@Override
	public Mono<Integer> getCountOfUsers() {
		return this.applyCount(MAPPER_CLASS + "getCountOfUsers", null);
	}

}
