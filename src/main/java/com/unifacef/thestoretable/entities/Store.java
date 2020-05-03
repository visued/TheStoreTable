package com.unifacef.thestoretable.entities;

import java.time.LocalDateTime;
import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.annotation.Version;

public class Store {
	
	@Id
	private String store_id;
	private String manager_staff_id;
	private String address_id;
	
	@LastModifiedDate
	private LocalDateTime last_update;

	public String getStore_id() {
		return store_id;
	}

	public void setStore_id(String store_id) {
		this.store_id = store_id;
	}

	public String getManager_staff_id() {
		return manager_staff_id;
	}

	public void setManager_staff_id(String manager_staff_id) {
		this.manager_staff_id = manager_staff_id;
	}

	public String getAddress_id() {
		return address_id;
	}

	public void setAddress_id(String address_id) {
		this.address_id = address_id;
	}

	public LocalDateTime getLast_update() {
		return last_update;
	}

	public void setLast_update(LocalDateTime last_update) {
		this.last_update = last_update;
	}

	@Override
	public String toString() {
		return "Store [store_id=" + store_id + ", manager_staff_id=" + manager_staff_id + ", address_id=" + address_id
				+ ", last_update=" + last_update + "]";
	}
}
