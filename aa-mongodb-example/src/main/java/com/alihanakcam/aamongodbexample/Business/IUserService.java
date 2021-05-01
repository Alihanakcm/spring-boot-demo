package com.alihanakcam.aamongodbexample.Business;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import com.alihanakcam.aamongodbexample.Entities.User;
import org.springframework.stereotype.Service;

import java.util.List;

public interface IUserService {
    List<User> saveAll(Iterable<User> users);

    User save(User user);

    List<User> findAll();

    List<User> findAll(Sort var1);

    void insert(User user);

    void insert(Iterable<User> users);

    List<User> findAll(Example<User> users);

    List<User> findAll(Example<User> users1, Sort var2);
}
