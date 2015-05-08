package org.csf.rm.webapp.repository;

import org.csf.rm.webapp.jdo.entity.Hotel;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by andreypopikov on 03/05/15.
 */
public interface HotelRepository extends CrudRepository<Hotel, Long> {
    


}
