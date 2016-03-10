/**
 * @author Nevil Dsouza
 *
 *	Main controller
 *	DEPENDENCIES: ProfileServiceImpl, Profile, ProfileDAOImpl
 */
package org.crce.interns.controller;


import org.crce.interns.beans.*;
import org.crce.interns.service.impl.ProfileServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class UpdateProfileController {
	
	
	//private ProfileService profileService;
	@Autowired
	private ProfileServiceImpl profileService;
		
	@RequestMapping(value="/", method = RequestMethod.GET)
	public ModelAndView index() {
		
		System.out.println("Inside Controller");
		
		ModelAndView model=null;
		
		model = new ModelAndView("index");
				
		return model;
	}
//------------------------------------------------------------------------------------------------------ //
	
	/**	GET details from database
	*	
	*	Creates hardcoded user by setName and setID on user.This value is supposed to be retrieved from Session.
	*	This enhancement will be added later
	*	@param	None
	*	@return MOdelAndView viewprofile page with name
	*
	*/
	
	
	
	@RequestMapping(value="/viewprofile.html", method = RequestMethod.GET)
	public ModelAndView login(@RequestParam("id") String id) {
		
		System.out.println("Inside Controller");
		
		ModelAndView model=null;

		
		UserDetailsBean userDetailsBean= new UserDetailsBean();
		userDetailsBean.setUsername(id);
		ProfessionalProfileBean professionalProfileBean=new ProfessionalProfileBean();
		PersonalProfileBean personalProfileBean=new PersonalProfileBean();
		
		
		userDetailsBean.setUsername(id);
		professionalProfileBean.setUsername(id);
		personalProfileBean.setUsername(id);
		
		
		userDetailsBean = profileService.getProfile(userDetailsBean);
		professionalProfileBean = profileService.getProfile(professionalProfileBean);
		personalProfileBean = profileService.getProfile(personalProfileBean);	
		
		model = new ModelAndView("viewprofile");
		
		model.addObject("userDetails",userDetailsBean);
		model.addObject("professionalProfile",professionalProfileBean);
		model.addObject("personalProfile",personalProfileBean);
		
		return model;
	}
	
	
		
//-----------------------------------------------------------------------------------------//
	@RequestMapping(value="/edit", method = RequestMethod.GET)
	public ModelAndView editProfessionalProfile(@RequestParam("id") String id) {
		
		System.out.println("Inside Controller");
		
		ModelAndView model=null;		

		UserDetailsBean userDetailsBean= new UserDetailsBean();
		ProfessionalProfileBean professionalProfileBean=new ProfessionalProfileBean();
		PersonalProfileBean personalProfileBean=new PersonalProfileBean();
		
		userDetailsBean.setUsername(id);
		professionalProfileBean.setUsername(id);
		personalProfileBean.setUsername(id);

		userDetailsBean = profileService.getProfile(userDetailsBean);
		professionalProfileBean = profileService.getProfile(professionalProfileBean);
		personalProfileBean = profileService.getProfile(personalProfileBean);
		
		
		model = new ModelAndView("profile");		
		model.addObject("userDetails",userDetailsBean);
		model.addObject("professionalProfile",professionalProfileBean);
		model.addObject("personalProfile",personalProfileBean);

		
		return model;
	}
	
	
	
	
//------------------------------------------------------------------------------------------------------------------
	
	@RequestMapping(value="/update-professional", method = RequestMethod.POST)
	public ModelAndView updateProfessionalProfile(@ModelAttribute("professionalProfile")ProfessionalProfileBean professionalProfileBean) {
		
		System.out.println("Inside Controller");
	
		ModelAndView model=null;
		
		
		UserDetailsBean userDetailsBean=new UserDetailsBean();
		PersonalProfileBean personalProfileBean=new PersonalProfileBean();
		
		userDetailsBean.setUsername(professionalProfileBean.getUsername());		
		personalProfileBean.setUsername(professionalProfileBean.getUsername());
		
		
		userDetailsBean = profileService.getProfile(userDetailsBean);		
		personalProfileBean = profileService.getProfile(personalProfileBean);		
		
		professionalProfileBean = profileService.updateProfessionalProfile(professionalProfileBean);				
		
		model = new ModelAndView("viewprofile");
		model.addObject("userDetails",userDetailsBean);
		model.addObject("professionalProfile",professionalProfileBean);
		model.addObject("personalProfile",personalProfileBean);			
		
		return model;
	}
	
	
	
	
	
	
	
	//-----------------------------------------------------------------------------------------//
	


	@RequestMapping(value="/update-personal", method = RequestMethod.POST)
	public ModelAndView updatePersonalProfile(@ModelAttribute("personalProfile")PersonalProfileBean personalProfileBean) {
		
		System.out.println("Inside Controller");
	
		ModelAndView model=null;

		ProfessionalProfileBean professionalProfileBean=new ProfessionalProfileBean();		
		UserDetailsBean userDetailsBean= new UserDetailsBean();

		
		userDetailsBean.setUsername(personalProfileBean.getUsername());		
		professionalProfileBean.setUsername(personalProfileBean.getUsername());
		
		
		userDetailsBean = profileService.getProfile(userDetailsBean);
		professionalProfileBean = profileService.getProfile(professionalProfileBean);
		personalProfileBean = profileService.updatePersonalProfile(personalProfileBean);
				
		model = new ModelAndView("viewprofile");
		model.addObject("userDetails",userDetailsBean);
		model.addObject("professionalProfile",professionalProfileBean);
		model.addObject("personalProfile",personalProfileBean);			
		
		return model;
	}
	//-----------------------------------------------------------------------------------------//

	@RequestMapping(value="/update-password", method = RequestMethod.POST)
	public ModelAndView updateUserDetails(@RequestParam("username") String username,@RequestParam("password") String password) {
		
		System.out.println("Inside Controller");
	
		ModelAndView model=null;
		
		
		UserDetailsBean userDetailsBean= new UserDetailsBean();
		ProfessionalProfileBean professionalProfileBean=new ProfessionalProfileBean();
		PersonalProfileBean personalProfileBean=new PersonalProfileBean();
		
		
		
		userDetailsBean.setUsername(username);
		
		professionalProfileBean.setUsername(username);
		personalProfileBean.setUsername(username);
		
		
		userDetailsBean = profileService.getProfile(userDetailsBean);
		professionalProfileBean = profileService.getProfile(professionalProfileBean);
		personalProfileBean = profileService.getProfile(personalProfileBean);
		
		userDetailsBean.setPassword(password);
		userDetailsBean = profileService.updateUserDetails(userDetailsBean);
		
				
		model = new ModelAndView("viewprofile");
		model.addObject("change",true);
		model.addObject("userDetails",userDetailsBean);
		model.addObject("professionalProfile",professionalProfileBean);
		model.addObject("personalProfile",personalProfileBean);			
		
		return model;
	}
}


/*

*/