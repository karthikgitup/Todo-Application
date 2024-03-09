package org.ecommerce.config;

import java.util.Optional;

import org.ecommerce.entity.UserInfo;
import org.ecommerce.respositorylayar.UserInfoRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class UserInfoUserDetailsService implements UserDetailsService {
	
	private UserInfoRepository userInfoRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Optional<UserInfo> opt=userInfoRepository.findByName(username);
		return opt.map(UserInfoUserDetails::new).orElseThrow(()-> new UsernameNotFoundException("user not found"+username));
	}

}
