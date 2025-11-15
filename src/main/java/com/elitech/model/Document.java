package com.elitech.model;

import jakarta.persistence.Entity;


@Entity
public class Document extends BaseEntity{

private int id_user;
private String url;
private String titre;

public int getId_user() {
	return id_user;
}
public void setId_user(int id_user) {
	this.id_user = id_user;
}
public String getUrl() {
	return url;
}
public void setUrl(String url) {
	this.url = url;
}
public String getTitre() {
	return titre;
}
public void setTitre(String titre) {
	this.titre = titre;
}

}
