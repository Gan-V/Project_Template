package com.template.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.template.model.Account;

@Repository
public interface AccountRepository extends CrudRepository<Account, Integer>{
	
}
