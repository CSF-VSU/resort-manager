package org.csf.rm.webapp.service;

import org.apache.commons.collections.IteratorUtils;
import org.csf.rm.webapp.jdo.entity.Event;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by andreypopikov on 02/05/15.
 */
@Service
public class ClientService extends BaseService {

    @SuppressWarnings("unchecked")
    public List<Event> getEvents() {
        return IteratorUtils.toList(eventRepository.findAll().iterator());
    }

    public Event getEvent(Long eventId) {
        return eventRepository.findOne(eventId);
    }

}
