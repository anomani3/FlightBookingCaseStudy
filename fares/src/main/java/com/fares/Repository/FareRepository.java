package com.fares.Repository;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.fares.entity.FareDetails;
import com.google.common.base.Optional;

@Repository
   public interface FareRepository  extends MongoRepository<FareDetails,String>{

	
	
	
	 @Query("{'fid':?0}") public Optional<FareDetails>getinfo(String fid);
	 
	 @Query("{'fid':?0}") 
	  public FareDetails getobj(String fid);

	
	

	
}
