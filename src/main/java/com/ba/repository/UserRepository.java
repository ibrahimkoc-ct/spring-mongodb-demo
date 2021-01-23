package com.ba.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.ba.entity.Kullanici;

@Repository
public interface UserRepository extends MongoRepository<Kullanici, String>{

}
