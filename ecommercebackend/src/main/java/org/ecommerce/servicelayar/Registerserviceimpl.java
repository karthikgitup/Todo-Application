package org.ecommerce.servicelayar;

import java.util.List;

import org.ecommerce.entity.Registerentity;
import org.ecommerce.entity.UserInfo;
import org.ecommerce.respositorylayar.Registerrepository;
import org.ecommerce.respositorylayar.UserInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
@Service
public class Registerserviceimpl implements Registerservice {
	@Autowired
	private Registerrepository  regrepo;
	@Autowired
	private UserInfoRepository userInfoRepository;
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@Override
	public List<Registerentity> getallData(){
		List <Registerentity> li=regrepo.findAll();
		return li;
		
	}
	@Override
	public String insertallData(Registerentity regdata) {
		regrepo.save(regdata);
		return "data successfully posted";
	}
	@Override
	public String deleteData( String id) {
		regrepo.deleteById(id);
		return "data successfully Deleted";
		
		
	}
	@Override
	public String updateData( Registerentity regdata) {
		regrepo.save(regdata);
		return "data successfully Updated";
	}
	
	@Override
	 public String addUser( UserInfo userInfo) {
		 userInfo.setPassword(passwordEncoder.encode(userInfo.getPassword()));
		 userInfoRepository.save(userInfo);
		 return "user add to system";
	 }

}
