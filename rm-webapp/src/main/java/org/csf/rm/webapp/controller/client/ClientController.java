package org.csf.rm.webapp.controller.client;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by andreypopikov on 02/05/15.
 */
@Controller
@RequestMapping("/client")
public class ClientController {

    @RequestMapping("/")
    public String index() {
        return "client/index";
    }

}
