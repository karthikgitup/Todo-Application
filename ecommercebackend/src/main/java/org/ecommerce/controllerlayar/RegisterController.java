package org.ecommerce.controllerlayar;

import java.util.List;

import org.ecommerce.entity.Registerentity;
import org.ecommerce.entity.UserInfo;
import org.ecommerce.servicelayar.Registerservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegisterController {
	
	@Autowired
	private Registerservice regservice;
	
	@GetMapping("/registerdata")
	 @PreAuthorize("hasAuthority('ROLE_USER')")
	public List<Registerentity> getallData(){
		List <Registerentity> obj=regservice.getallData();
		return obj;
		
	}
	@PostMapping("/registerdata")
	 @PreAuthorize("hasAuthority('ROLE_ADMIN')")
	public String insertallData(@RequestBody Registerentity regdata) {
		
		
		return regservice.insertallData(regdata);
		
	}
	
	@DeleteMapping("/registerdata/{id}")
	public String deleteData(@PathVariable String id) {
		
		return regservice.deleteData(id);
		
	}
	
	@PutMapping("/registerdata")
	public String updateData(@RequestBody Registerentity regdata) {
		return regservice.updateData(regdata);
		
	}
	@PostMapping("/new")
  public String addUser(@RequestBody UserInfo userInfo) {
	  return regservice.addUser(userInfo);
	  
  }
}
