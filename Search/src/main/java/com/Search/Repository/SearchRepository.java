package com.Search.Repository;

import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import com.Search.Entity.SearchDetails;

public interface SearchRepository extends MongoRepository<SearchDetails, String> {

	public List<SearchDetails> findByStartPointAndEndPointAndFlightDate(String startPoint, String endPoint,
			String flightDate);

}
