package com.cissdata.repository;

import com.cissdata.entity.User;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface UserRepository extends PagingAndSortingRepository<User, Long> {

    User getByUsername(String username);

}
