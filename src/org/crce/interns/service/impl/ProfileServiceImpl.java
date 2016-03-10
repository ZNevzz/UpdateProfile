/**
 * @author Nevil Dsouza
 *
 *	Profile Service
 *	DEPENDENCIES: UpdateProfileController, Profile, ProfileDAOImpl
 *
 */

package org.crce.interns.service.impl;

import org.crce.interns.model.*;
import org.crce.interns.beans.*;
import org.crce.interns.dao.impl.ProfileDAOImpl;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service("profileService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
//public class ProfileServiceImpl implements ProfileService{
public class ProfileServiceImpl{
	
	//private ProfileDAO profileDAOImpl;
	@Autowired
	private ProfileDAOImpl profileDAO;
	
	
	/**	GET details from database
	*	
	*	Calls DAO to get details of user
	*	@param	Profile user
	*	@return Profile result 
	*
	*/
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public UserDetailsBean getProfile(UserDetailsBean userDetailsBean) {
		//Profile result = profileDAOImpl.getProfile(user);
		
		UserDetails userDetails=new UserDetails();
		userDetails.setUsername(userDetailsBean.getUsername());
		
		UserDetails result = profileDAO.getProfile(userDetails);
		
		
		if(result == null){
			System.out.println("Returned NULL");
		}
		
		BeanUtils.copyProperties(result,userDetailsBean);
		
		
		return userDetailsBean;
	}
	
	/**	GET details from database
	*	
	*	Calls DAO to get details of user
	*	@param	Profile user
	*	@return Profile result 
	*
	*/
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public ProfessionalProfileBean getProfile(ProfessionalProfileBean professionalProfileBean) {
		//Profile result = profileDAOImpl.getProfile(user);
		
		ProfessionalProfile professionalProfile=new ProfessionalProfile();
		professionalProfile.setUsername(professionalProfileBean.getUsername());
		
		ProfessionalProfile result = profileDAO.getProfile(professionalProfile);
		
		if(result == null){
			System.out.println("Returned NULL");
		}		
		
		
		BeanUtils.copyProperties(result,professionalProfileBean);
		return professionalProfileBean;
	}
	
	/**	GET details from database
	*	
	*	Calls DAO to get details of user
	*	@param	Profile user
	*	@return Profile result 
	*
	*/
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public PersonalProfileBean getProfile(PersonalProfileBean personalProfileBean) {
		//Profile result = profileDAOImpl.getProfile(user);
		
		PersonalProfile personalProfile=new PersonalProfile();
		personalProfile.setUsername(personalProfileBean.getUsername());
		
		PersonalProfile result = profileDAO.getProfile(personalProfile);
		
		if(result == null){
			System.out.println("Returned NULL");
		}		
		
		BeanUtils.copyProperties(result,personalProfileBean);
		return personalProfileBean;
	}	
	
	/**	GET details from database
	*	
	*	Calls DAO to get details of user
	*	@param	Profile user
	*	@return Profile result 
	*
	*/
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public ProfessionalProfileBean updateProfessionalProfile(ProfessionalProfileBean professionalProfileBean) {
		
		ProfessionalProfile professionalProfile=new ProfessionalProfile();
		BeanUtils.copyProperties(professionalProfileBean,professionalProfile);
		
		ProfessionalProfile result = profileDAO.updateProfessionalProfile(professionalProfile);
		
		
		if(result == null){
			System.out.println("Returned NULL");
		}
		
		BeanUtils.copyProperties(result,professionalProfileBean);
		return professionalProfileBean;
	}
	
	/**	GET details from database
	*	
	*	Calls DAO to get details of user
	*	@param	Profile user
	*	@return Profile result 
	*
	*/
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public PersonalProfileBean updatePersonalProfile(PersonalProfileBean personalProfileBean) {
		
		PersonalProfile personalProfile=new PersonalProfile();
		BeanUtils.copyProperties(personalProfileBean,personalProfile);
		
		PersonalProfile result = profileDAO.updatePersonalProfile(personalProfile);
		
		
		if(result == null){
			System.out.println("Returned NULL");
		}
		
		BeanUtils.copyProperties(result,personalProfileBean);
		return personalProfileBean;
		
	}
	
	/**	GET details from database
	*	
	*	Calls DAO to get details of user
	*	@param	Profile user
	*	@return Profile result 
	*
	*/
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public UserDetailsBean updateUserDetails(UserDetailsBean userDetailsBean) {
		
		UserDetails userDetails=new UserDetails();
		BeanUtils.copyProperties(userDetailsBean,userDetails);
		
		UserDetails result = profileDAO.updateUserDetails(userDetails);
		
		
		if(result == null){
			System.out.println("Returned NULL");
		}
		
		BeanUtils.copyProperties(result,userDetailsBean);
		return userDetailsBean;
	}
}
