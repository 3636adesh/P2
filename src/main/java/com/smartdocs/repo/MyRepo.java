package com.smartdocs.repo;

import java.time.LocalDate;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.smartdocs.model.MyModel;
@Repository
public interface MyRepo extends MongoRepository<MyModel,String> {

	LocalDate save(LocalDate dateTime);

}
