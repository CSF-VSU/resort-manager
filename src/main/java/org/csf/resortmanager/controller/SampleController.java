package org.csf.resortmanager.controller;

import org.csf.resortmanager.service.SampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * Created by agpopikov on 18/02/15.
 */
@Controller
public class SampleController {

    @Autowired
    private SampleService sampleService;

    @RequestMapping("/sample")
    public String sampleMethod(ModelMap model) {
        model.put("message", "Hello");
        return "sample/index";
    }

}
