package org.csf.rm.webapp.service;

import org.csf.rm.webapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.security.core.userdetails.User;

import javax.annotation.PostConstruct;
import java.util.*;

/**
 * Created by andreypopikov on 03/05/15.
 */
@Service
public class AuthService implements UserDetailsService {

    private Map<String, String> rolesToDefaultUrls;

    @PostConstruct
    private void initialize() {
        rolesToDefaultUrls = new HashMap<>();
        rolesToDefaultUrls.put("client", "/client/");
        rolesToDefaultUrls.put("manager", "/manager/");
    }

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        org.csf.rm.webapp.jdo.entity.User user = userRepository.findByEmail(s);
        if (user != null) {
            return new org.springframework.security.core.userdetails.User(user.getEmail(), user.getPassword(),
                    Collections.singletonList(new SimpleGrantedAuthority(user.getRole())));
        } else {
            throw new UsernameNotFoundException(String.format("User with email %s not found.", s));
        }
    }

    public String getDefaultUrlForRole() {
        User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        Collection<GrantedAuthority> roles = user.getAuthorities();
        if (roles != null && roles.size() > 0) {
            Optional<GrantedAuthority> role = roles.stream().findFirst();
            if (rolesToDefaultUrls.containsKey(role.get().getAuthority())) {
                return rolesToDefaultUrls.get(role.get().getAuthority());
            }
        }
        return "/";
    }

}
