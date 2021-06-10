package com.baeldung.springboot.validacao.repository;

import com.baeldung.springboot.validacao.domain.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
