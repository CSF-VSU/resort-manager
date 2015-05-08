package org.csf.rm.webapp.repository;

import org.csf.rm.webapp.jdo.entity.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

/**
 * Created by andreypopikov on 03/05/15.
 */
public interface UserRepository extends CrudRepository<User, Long> {

    @Query("select user from User user where user.email like :email")
    User findByEmail(@Param("email") String email);

}
