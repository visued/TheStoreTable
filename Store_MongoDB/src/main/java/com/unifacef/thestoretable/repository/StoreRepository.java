package com.unifacef.thestoretable.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.unifacef.thestoretable.entities.Store;

public interface StoreRepository extends MongoRepository <Store, Long>{

}
