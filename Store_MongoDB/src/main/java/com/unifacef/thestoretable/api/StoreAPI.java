package com.unifacef.thestoretable.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.unifacef.thestoretable.entities.Store;
import com.unifacef.thestoretable.repository.StoreRepository;

@RestController
@RequestMapping("/store")
public class StoreAPI {
	
	@Autowired
	private StoreRepository _storeRepository;
	
	@GetMapping
	public List<Store> getAll(){
		return _storeRepository.findAll();
	}
	
	@PostMapping
	public Store insert(@RequestBody Store store) {
		return _storeRepository.save(store);		
	}
	
	@PutMapping
	public Store update(@RequestBody Store store) {
		return _storeRepository.save(store);		
	}
	
	@DeleteMapping
	public void delete(@RequestBody Store store) {
		_storeRepository.delete(store);	
	}
}
