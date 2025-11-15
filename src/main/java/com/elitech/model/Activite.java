package com.elitech.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;


@Entity
public class Activite extends BaseEntity{

@Column(columnDefinition = "varchar(30) default 'loisir' ")
private String type;

private String description;

public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}

}
