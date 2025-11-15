package com.elitech.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Min;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
@Column(nullable = false)
private String nom_complet;
@Min(value = 18)
private int age;
@Column(nullable = false)
private String adresse;
@Column(nullable = false, unique = true)
private String tel;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getNom_complet() {
	return nom_complet;
}
public void setNom_complet(String nom_complet) {
	this.nom_complet = nom_complet;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getAdresse() {
	return adresse;
}
public void setAdresse(String adresse) {
	this.adresse = adresse;
}
public String getTel() {
	return tel;
}
public void setTel(String tel) {
	this.tel = tel;
}


}
