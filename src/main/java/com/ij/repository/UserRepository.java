package com.ij.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ij.model.User;

@Repository("userRepository")
public interface UserRepository extends CrudRepository<User, Long>{
	
	@Query("select u from User u where u.name = :userName")
	User findByUserName(@Param("userName") String string);

}
