package com.alihanakcam.aamongodbexample.DataAccess;

import com.alihanakcam.aamongodbexample.Entities.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface IRepository extends MongoRepository<User, String> {
    @Override
    <S extends User> S save(S s);
}
