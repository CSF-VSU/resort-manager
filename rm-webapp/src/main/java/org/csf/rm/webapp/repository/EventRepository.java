package org.csf.rm.webapp.repository;

import org.csf.rm.webapp.jdo.entity.Event;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by andreypopikov on 03/05/15.
 */
public interface EventRepository extends CrudRepository<Event, Long> {


    
}
