package br.com.unifacef.store.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="store")
public class Store implements Serializable {
	
	private static final long serialVersionUID = 3996018777928925526L;
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long store_id;
	
	@Column(name="manager_staff_id")
	private Long manager_staff_id;
	
	@Column(name="address_id")
	private Long address_id;
	
	@Column(name="last_update")
	private Date last_update;
	
	public Store() {
		
	}
	public Long getStore_id() {
		return store_id;
	}

	public void setStore_id(Long store_id) {
		this.store_id = store_id;
	}

	public Long getManager_staff_id() {
		return manager_staff_id;
	}

	public void setManager_staff_id(Long manager_staff_id) {
		this.manager_staff_id = manager_staff_id;
	}

	public Long getAddress_id() {
		return address_id;
	}

	public void setAddress_id(Long address_id) {
		this.address_id = address_id;
	}

	public Date getLast_update() {
		return last_update;
	}

	public void setLast_update(Date last_update) {
		this.last_update = last_update;
	}
	@Override
	public String toString() {
		return "Store [store_id=" + store_id + ", manager_staff_id=" + manager_staff_id + ", address_id=" + address_id
				+ ", last_update=" + last_update + "]";
	}
	
}
