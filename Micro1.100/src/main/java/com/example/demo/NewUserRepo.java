package com.example.demo;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface NewUserRepo extends MongoRepository<RegisterDataModel, String> {

	RegisterDataModel findByUserName(String string);
	

	
}
