/**
 * @author Nevil Dsouza
 *
 *	Profile model
 *	DEPENDENCIES: ProfileServiceImpl, UpdateProfileController, ProfileDAOImpl
 */
package org.crce.interns.model;

/*
 * 
CREATE TABLE profile (
id VARCHAR(30) PRIMARY KEY,
name VARCHAR(30)
);

INSERT INTO profile (id,name)
VALUES ('100','Nevil');


 */


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "profile")
public class Profile {

	@Id
	@Column(name = "id")	
	private String id;
		
	@Column(name = "name")	
	private String name;
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	
	
	
}
