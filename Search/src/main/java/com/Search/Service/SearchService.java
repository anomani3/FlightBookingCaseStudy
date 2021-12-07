package com.Search.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.Search.Entity.SearchDetails;

@Service
public interface SearchService {
	
	public List<SearchDetails> getAllSearch();
	public Optional<SearchDetails> getSearchByflightNumber(String flightNumber);
	
}
