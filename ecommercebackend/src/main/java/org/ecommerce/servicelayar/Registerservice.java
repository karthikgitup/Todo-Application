package org.ecommerce.servicelayar;

import java.util.List;

import org.ecommerce.entity.Registerentity;
import org.ecommerce.entity.UserInfo;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;


public interface Registerservice {
	
	public List<Registerentity> getallData();
	public String insertallData(Registerentity regdata);
	public String deleteData( String id);
	public String updateData(Registerentity regdata);

	 public String addUser( UserInfo userInfo);
}
