package org.ecommerce.respositorylayar;

import java.util.Optional;

import org.ecommerce.entity.UserInfo;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserInfoRepository extends MongoRepository<UserInfo, Integer>{

	Optional<UserInfo> findByName(String username);

}
