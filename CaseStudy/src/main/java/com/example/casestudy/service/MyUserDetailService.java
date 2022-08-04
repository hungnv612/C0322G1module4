//package com.example.casestudy.service;
//
//import com.example.casestudy.model.decentralization.MyUserDetail;
//import com.example.casestudy.model.decentralization.User;
//import com.example.casestudy.repository.UserRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//import javax.transaction.Transactional;
//
//@Service
//@Transactional
//public class MyUserDetailService implements UserDetailsService {
//    @Autowired
//    private UserRepository userRepository;
//
//    @Override
//    public UserDetails loadUserByUsername(String name) throws UsernameNotFoundException {
//        User user = userRepository.findByUserName(name);
//        if (user == null) {
//            throw new UsernameNotFoundException("user name: " + name + "not found");
//        }
//        return new MyUserDetail(user);
//    }
//}
