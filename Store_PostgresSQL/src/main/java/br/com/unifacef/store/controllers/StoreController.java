package br.com.unifacef.store.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.unifacef.store.entities.Store;
import br.com.unifacef.store.repositories.StoreRepository;

@RestController
@RequestMapping("/api/store")
public class StoreController {
	@Autowired
	private StoreRepository injecao;
	
	@PostMapping
	public Store insere(@RequestBody Store store) {
		return injecao.save(store);		
	}
	
	@DeleteMapping("/{id}")
	public Store remove(@PathVariable Long id) {
		injecao.deleteById(id);
		return null;
	}
	@GetMapping
	public List<Store> consulta() {
		return injecao.findAll();
	}
	@PutMapping
	public Store atualiza(@RequestBody Store store) {
		return injecao.save(store); 
	}
}
