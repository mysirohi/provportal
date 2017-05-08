package ims.ProviderPortal.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import ims.ProviderPortal.data.ProviderRepository;
import ims.ProviderPortal.data.UserRepository;
import ims.ProviderPortal.model.Provider;
import ims.ProviderPortal.model.User;

@Controller
public class ProviderController {

	@Autowired
	private ProviderRepository providerData;
@Autowired
	private UserRepository userData;
	
	
	@RequestMapping(value = "/Signon.html", method = RequestMethod.POST)
	public ModelAndView signIn(@RequestParam("uname")String name,@RequestParam("pwd")String password) {

		System.out.println(name);
		System.out.println(password);
				
		User user = new User();
		user.setUserId(name);
		user.setPassword(password);
		
		userData.save(user);
		return new ModelAndView("allProviders", "form", user);

	}

	@RequestMapping(value = "/Signon.html", method = RequestMethod.GET)
	public ModelAndView signOn() {

		User user = new User();
		return new ModelAndView("Signon", "form", user);

	}
	
	@RequestMapping(value = "/pportal.html", method = RequestMethod.POST)
	public String newProvider(Provider provider) {

		providerData.save(provider);
		return ("redirect:/list.html");

	}

	@RequestMapping(value = "/pportal.html", method = RequestMethod.GET)
	public ModelAndView addNewProvider() {

		Provider provider = new Provider();
		return new ModelAndView("pportal", "form", provider);

	}

	
	@RequestMapping(value = "/listProviders.html", method = RequestMethod.POST)
	public ModelAndView providers() {
		List<Provider> allProviders = providerData.findAll();
		return new ModelAndView("allProviders", "providers", allProviders);

	}
	
	@RequestMapping(value="/error.html",method=RequestMethod.POST)
	public String error() {
		return ("redirect:/error.html");

	}

}
