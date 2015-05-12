package org.csf.rm.webapp.service;

import org.csf.rm.webapp.repository.*;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by andreypopikov on 02/05/15.
 */
public abstract class BaseService {

    @Autowired
    protected EventRepository eventRepository;

    @Autowired
    protected UserRepository userRepository;

    @Autowired
    protected OrderStatusRepository orderStatusRepository;

    @Autowired
    protected OrderRepository orderRepository;

    @Autowired
    protected HotelRepository hotelRepository;

    @Autowired
    protected ServiceRepository serviceRepository;

    @Autowired
    protected PlaceRepository placeRepository;

}
