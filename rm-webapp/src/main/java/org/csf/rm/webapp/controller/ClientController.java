package org.csf.rm.webapp.controller;

import org.csf.rm.webapp.jdo.entity.Order;
import org.csf.rm.webapp.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by andreypopikov on 02/05/15.
 */
@Controller
@RequestMapping("/client")
public class ClientController {

    @Autowired
    private ClientService clientService;

    @RequestMapping("/")
    public String index() {
        return "client/index";
    }

    @RequestMapping("/orders")
    public String orders(Model model) {

        return "client/order/list";
    }

    @RequestMapping("/orders/new")
    public String orderNew(Model model) {

        return "client/order/new";
    }

    @RequestMapping(value = "/orders/save", method = RequestMethod.POST)
    public String orderSave(Model model, Order order) {

        return "";
    }

    @RequestMapping("/events")
    public String events(Model model) {
        model.addAttribute("events", clientService.getEvents());
        return "client/event/list";
    }

    @RequestMapping("/events/{id}")
    public String eventDetails(Model model, @PathVariable("id") Long eventId) {
        model.addAttribute("event", clientService.getEvent(eventId));
        return "client/event/details";
    }



}
