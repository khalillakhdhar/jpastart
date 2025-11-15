package com.elitech.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import jakarta.validation.constraints.Min;

@Entity
public class User extends BaseEntity{

@Column(nullable = false)
private String nom_complet;
@Min(value = 18)
private int age;
@Column(nullable = false)
private String adresse;
@Column(nullable = false, unique = true)
private String tel;

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
