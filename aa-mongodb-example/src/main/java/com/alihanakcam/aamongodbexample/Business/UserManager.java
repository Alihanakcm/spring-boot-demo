package com.alihanakcam.aamongodbexample.Business;

import com.alihanakcam.aamongodbexample.DataAccess.IRepository;
import com.alihanakcam.aamongodbexample.Entities.User;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserManager implements IUserService {
    private IRepository repository;

    public UserManager(IRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<User> saveAll(Iterable<User> users) {
        return null;
    }

    @Override
    public User save(User user) {
        return repository.save(user);
    }

    @Override
    public List<User> findAll() {
        return repository.findAll();
    }

    @Override
    public List<User> findAll(Sort var1) {
        return null;
    }

    @Override
    public void insert(User user) {

    }

    @Override
    public void insert(Iterable<User> users) {

    }

    @Override
    public List<User> findAll(Example<User> users) {
        return null;
    }

    @Override
    public List<User> findAll(Example<User> users1, Sort var2) {
        return null;
    }
}
