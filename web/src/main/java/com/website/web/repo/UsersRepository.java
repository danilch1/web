package com.website.web.repo;

import com.website.web.models.Users;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends CrudRepository <Users, Long>{

}
