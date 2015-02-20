package org.csf.resortmanager.controller;

import org.csf.resortmanager.service.SampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;
import java.util.Random;

/**
 * Created by agpopikov on 18/02/15.
 */
@Controller
public class SampleController {

    @Autowired
    private SampleService sampleService;

    @RequestMapping("/sample")
    public String sampleMethod(ModelMap model) {
        Random random = new Random();
        model.put("random", random.nextInt(100) > 42);
        model.put("message1", "Hello");
        model.put("message2", "Good bye");
        return "sample/index";
    }

}
