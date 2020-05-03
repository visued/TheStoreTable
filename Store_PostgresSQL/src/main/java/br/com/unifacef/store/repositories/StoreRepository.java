package br.com.unifacef.store.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.unifacef.store.entities.Store;

public interface StoreRepository extends JpaRepository <Store, Long>{

}
