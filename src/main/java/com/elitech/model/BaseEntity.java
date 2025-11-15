package com.elitech.model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
@MappedSuperclass // la classe interagi avec la BD sans créer une instance indépendante
public class BaseEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(insertable = false)
private LocalDateTime createdAt,updatedAt;
@PrePersist // faire l'action lors de la creation d'une entité
public void initialize()
{
	createdAt=updatedAt=LocalDateTime.now();
}
@PreUpdate
public void update()
{
updatedAt=LocalDateTime.now();	
}
}
