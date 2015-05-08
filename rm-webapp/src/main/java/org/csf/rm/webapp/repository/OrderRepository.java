package org.csf.rm.webapp.repository;

import org.csf.rm.webapp.jdo.entity.Order;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by andreypopikov on 03/05/15.
 */
public interface OrderRepository extends CrudRepository<Order, Long> {
    


}
