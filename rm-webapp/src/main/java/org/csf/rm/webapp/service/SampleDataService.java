package org.csf.rm.webapp.service;

import org.csf.rm.webapp.jdo.entity.Hotel;
import org.csf.rm.webapp.jdo.entity.OrderStatus;
import org.csf.rm.webapp.jdo.entity.Place;
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
public class SampleDataService extends BaseService {

    private static final Logger log = LoggerFactory.getLogger(SampleDataService.class);

    @PostConstruct
    public void init() {
        initTestUsers();
        initPlaces();
        initEvents();
        initOrderStatuses();
        initOrders();
        initHotelsAndServices();
    }

    private void initTestUsers() {
        userRepository.deleteAll();
        log.debug("Inserting test users.");
        userRepository.save(new User("client@rm.com", "0000", "client"));
        userRepository.save(new User("manager@rm.com", "0000", "manager"));
        log.debug("Users is filled.");
    }

    private void initOrderStatuses() {
        orderStatusRepository.deleteAll();
        log.debug("Inserting order statuses.");
        orderStatusRepository.save(new OrderStatus("Не подтверждён", "Заказ ожидает подтверждения."));
        orderStatusRepository.save(new OrderStatus("Подтверждён", "Заказ подтверждён и ожидает обработки."));
        orderStatusRepository.save(new OrderStatus("В обработке", "Заказ находится в обработке."));
        orderStatusRepository.save(new OrderStatus("Завершён", "Заказ выполнен."));
        orderStatusRepository.save(new OrderStatus("Отменён", "Заказ отменён."));
        log.debug("Order statuses is filled.");
    }

    private void initOrders() {
        orderRepository.deleteAll();
        log.debug("Inserting orders.");
        // todo
        log.debug("Orders is filled.");
    }

    private void initHotelsAndServices() {
        serviceRepository.deleteAll();
        hotelRepository.deleteAll();
        log.debug("Inserting hotels and services.");

        // todo
        hotelRepository.save(new Hotel("Holiday Inn Express", "Кирова, 9/1", "Воронеж", "(473) 2-124-642"));
        log.debug("Hotels and services is filled.");
    }

    private void initPlaces() {
        placeRepository.deleteAll();
        log.debug("Inserting places.");
        placeRepository.save(new Place("Галерея Чижова", "", 0.0, 0.0));
        placeRepository.save(new Place("Галерея Чижова", "", 0.0, 0.0));
        log.debug("Places is filled.");
    }

    private void initEvents() {

    }

}
