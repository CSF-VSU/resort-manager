package org.csf.resortmanager.repository;

import org.csf.resortmanager.repository.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by agpopikov on 18/02/15.
 */
public interface UserRepository extends CrudRepository<UserEntity, Long> {

}
