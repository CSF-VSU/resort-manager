package org.csf.resortmanager.service;

import org.csf.resortmanager.model.User;
import org.csf.resortmanager.repository.UserRepository;
import org.csf.resortmanager.repository.entity.UserEntity;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.lang.reflect.Type;
import java.util.List;

/**
 * Created by agpopikov on 21/02/15.
 */
@Service
public class UserService {

    @Autowired
    private ModelMapper modelMapper;
    @Autowired
    private UserRepository userRepository;

    @Transactional
    public List<User> getAll() {
        Type listType = new TypeToken<List<User>>() {}.getType();
        List<User> users = modelMapper.map(userRepository.findAll(), listType);
        return users;
    }

    @Transactional
    public void save(User user) {
        UserEntity userEntity = new UserEntity();
        modelMapper.map(user, userEntity);
        userRepository.save(userEntity);
    }
}
