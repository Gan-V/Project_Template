package com.template.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.template.model.Account;
import com.template.repositories.AccountRepository;

@Service
public class AccountServiceImpl implements AccountService {
	@Autowired
	private AccountRepository depaRepository;

	@Override
	public Account save(Account entity) {
		return depaRepository.save(entity);
	}

	@Override
	public List<Account> saveAll(List<Account> entities) {
		return (List<Account>) depaRepository.saveAll(entities);
	}

	@Override
	public Optional<Account> findById(Integer id) {
		return depaRepository.findById(id);
	}

	@Override
	public boolean existsById(Integer id) {
		return depaRepository.existsById(id);
	}

	@Override
	public Iterable<Account> findAll() {
		return depaRepository.findAll();
	}

	@Override
	public List<Account> findAllById(List<Integer> ids) {
		return (List<Account>) depaRepository.findAllById(ids);
	}

	@Override
	public long count() {
		return depaRepository.count();
	}

	@Override
	public void deleteById(Integer id) {
		depaRepository.deleteById(id);
	}

	@Override
	public void delete(Account entity) {
		depaRepository.delete(entity);
	}

	@Override
	public void deleteAll(List<Account> entities) {
		depaRepository.deleteAll(entities);
	}

	@Override
	public void deleteAll() {
		depaRepository.deleteAll();
	}

}
