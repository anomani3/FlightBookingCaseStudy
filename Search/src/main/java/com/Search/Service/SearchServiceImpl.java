package com.Search.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.Search.Entity.SearchDetails;
import com.Search.Repository.SearchRepository;

@Service
public class SearchServiceImpl implements SearchService{

	@Autowired
	private SearchRepository searchRepo;
	
	@Override
	public List<SearchDetails> getAllSearch() {
		
		return searchRepo.findAll();
	}

	@Override
	public Optional<SearchDetails> getSearchByflightNumber(String flightNumber) {
		return searchRepo.findById(flightNumber);
	}

	
	public List<SearchDetails> findByStartPointAndEndPointAndFlightDate(String startPoint, String endPoint,
			String flightDate) {
		
		return searchRepo.findByStartPointAndEndPointAndFlightDate(startPoint, endPoint, flightDate);
	}

}
