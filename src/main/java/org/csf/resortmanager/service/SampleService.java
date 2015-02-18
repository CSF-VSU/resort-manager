package org.csf.resortmanager.service;

import org.csf.resortmanager.repository.SampleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by agpopikov on 18/02/15.
 */
@Component
public class SampleService {

    @Autowired
    private SampleRepository sampleRepository;

}
