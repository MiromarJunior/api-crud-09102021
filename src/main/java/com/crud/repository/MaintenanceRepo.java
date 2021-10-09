package com.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.model.MaintenanceModel;

public interface MaintenanceRepo  extends JpaRepository<MaintenanceModel, Long>{
	// Todo mundo vê  é interface herda a comunicação da <tabela , id
	/*
	 *get
	 *post
	 *put
	 *delete
	 * 
	 */    
}
