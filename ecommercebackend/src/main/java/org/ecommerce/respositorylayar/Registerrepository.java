package org.ecommerce.respositorylayar;

import org.ecommerce.entity.Registerentity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Registerrepository extends MongoRepository<Registerentity, String>{

}
