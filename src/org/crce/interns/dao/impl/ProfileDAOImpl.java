/**
 * @author Nevil Dsouza
 *
 *	Profile DAO
 *	DEPENDENCIES: ProfileServiceImpl, UpdateProfileController, Profile
 */
package org.crce.interns.dao.impl;

import org.crce.interns.model.*;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("profileDAO")
//public class ProfileDAOImpl implements ProfileDAO{
public class ProfileDAOImpl{

	@Autowired
	private SessionFactory sessionFactory;
	
	/*
	public void addProfile(Profile user) {
		sessionFactory.getCurrentSession().save(user);
	}*/
	
	
	/**	GET details from database
	*	
	*	@param	Profile user
	*	@return Profile result 
	*
	*/
	public UserDetails getProfile(UserDetails user) {
		System.out.println("before get");
		UserDetails result = (UserDetails)sessionFactory.getCurrentSession().get(UserDetails.class, user.getUsername());
		System.out.println("after get");
		return result;
	}
	
	/**	GET details from database
	*	
	*	@param	Profile user
	*	@return Profile result 
	*
	*/
	public ProfessionalProfile getProfile(ProfessionalProfile professionalProfile) {
		System.out.println("before get");
		ProfessionalProfile result = (ProfessionalProfile)sessionFactory.getCurrentSession().get(ProfessionalProfile.class, professionalProfile.getUsername());
		System.out.println("after get");
		return result;
	}
	
	/**	GET details from database
	*	
	*	@param	Profile user
	*	@return Profile result 
	*
	*/
	public PersonalProfile getProfile(PersonalProfile personalProfile) {
		System.out.println("before get");
		PersonalProfile result = (PersonalProfile)sessionFactory.getCurrentSession().get(PersonalProfile.class, personalProfile.getUsername());
		System.out.println("after get");
		return result;
	}
		

	
	
	public ProfessionalProfile updateProfessionalProfile(ProfessionalProfile professionalProfile) {
		
		sessionFactory.getCurrentSession().update(professionalProfile);
		
		ProfessionalProfile result = (ProfessionalProfile)sessionFactory.getCurrentSession().get(ProfessionalProfile.class, professionalProfile.getUsername());
		
		return result;
	}
	
	public PersonalProfile updatePersonalProfile(PersonalProfile personalProfile) {
		
		sessionFactory.getCurrentSession().update(personalProfile);
		
		PersonalProfile result = (PersonalProfile)sessionFactory.getCurrentSession().get(PersonalProfile.class, personalProfile.getUsername());
		
		return result;
	}
	
	public UserDetails updateUserDetails(UserDetails userDetails) {
		
		sessionFactory.getCurrentSession().update(userDetails);
		
		UserDetails result = (UserDetails)sessionFactory.getCurrentSession().get(UserDetails.class, userDetails.getUsername());
		
		return result;
	}
	
	
}
