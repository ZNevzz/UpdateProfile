package org.crce.interns.dao;

import org.crce.interns.model.*;
import org.springframework.stereotype.Repository;

//@Repository("profileDao")
public interface ProfileDAO {

	public UserDetails getProfile(UserDetails user);
	
	public ProfessionalProfile getProfile(ProfessionalProfile professionalProfile);
	
	public PersonalProfile getProfile(PersonalProfile personalProfile);
	
	public ProfessionalProfile updateProfessionalProfile(ProfessionalProfile professionalProfile);
	
	public PersonalProfile updatePersonalProfile(PersonalProfile personalProfile);
	
	public UserDetails updateUserDetails(UserDetails userDetails);		
	
}
