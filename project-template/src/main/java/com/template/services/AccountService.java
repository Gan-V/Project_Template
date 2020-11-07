package com.template.services;

import java.util.List;
import java.util.Optional;

import com.template.model.Account;

public interface AccountService {

	void deleteAll();

	void deleteAll(List<Account> entities);

	void delete(Account entity);

	void deleteById(Integer id);

	long count();

	List<Account> findAllById(List<Integer> ids);

	Iterable<Account> findAll();

	boolean existsById(Integer id);

	Optional<Account> findById(Integer id);

	List<Account> saveAll(List<Account> entities);

	Account save(Account entity);
	
}
