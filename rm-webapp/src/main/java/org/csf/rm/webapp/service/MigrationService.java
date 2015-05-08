package org.csf.rm.webapp.service;

import org.csf.rm.webapp.jdo.entity.Hotel;
import org.csf.rm.webapp.jdo.entity.OrderStatus;
import org.csf.rm.webapp.jdo.entity.User;
import org.csf.rm.webapp.repository.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * Created by apopikov on 07.05.15.
 */
@Service
public class MigrationService {

    private static final Logger log = LoggerFactory.getLogger(MigrationService.class);

    @Autowired
    private UserRepository userRepository;
    
    @Autowired
    private OrderStatusRepository orderStatusRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private HotelRepository hotelRepository;

    @Autowired
    private ServiceRepository serviceRepository;

    @PostConstruct
    public void init() {
        initTestUsers();
        initOrderStatuses();
        initOrders();
        initHotelsAndServices();
    }

    private void initTestUsers() {
        log.debug("Inserting test users.");
        userRepository.save(new User("client@rm.com", "0000", "client"));
        userRepository.save(new User("manager@rm.com", "0000", "manager"));
        log.debug("Users is filled.");
    }

    private void initOrderStatuses() {
        log.debug("Inserting order statuses.");
        orderStatusRepository.save(new OrderStatus("Не подтверждён", "Заказ ожидает подтверждения."));
        orderStatusRepository.save(new OrderStatus("Подтверждён", "Заказ подтверждён и ожидает обработки."));
        orderStatusRepository.save(new OrderStatus("В обработке", "Заказ находится в обработке."));
        orderStatusRepository.save(new OrderStatus("Завершён", "Заказ выполнен."));
        orderStatusRepository.save(new OrderStatus("Отменён", "Заказ отменён."));
        log.debug("Order statuses is filled.");
    }

    private void initOrders() {
        log.debug("Inserting orders.");
        // todo
        log.debug("Orders is filled.");
    }

    private void initHotelsAndServices() {
        log.debug("Inserting hotels and services.");

        // todo
        hotelRepository.save(new Hotel("Holiday Inn Express", "Кирова, 9/1", "Воронеж", "(473) 2-124-642"));
        log.debug("Hotels and services is filled.");
    }

}
