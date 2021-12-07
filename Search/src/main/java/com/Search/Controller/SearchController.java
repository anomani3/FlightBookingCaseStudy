package com.Search.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.Search.Entity.SearchDetails;
import com.Search.Repository.SearchRepository;
import com.Search.Service.SearchService;

@RestController
@RequestMapping("/search")
public class SearchController {

	@Autowired
	private SearchRepository searchRepo;

	@Autowired
	private SearchService searchService;

	@GetMapping("/findAll")
	public List<SearchDetails> getAllSearch() {

		return searchService.getAllSearch();
	}

	@GetMapping("/findAll{flightNumber}")
	public Optional<SearchDetails> getSearchByflightNumber(@PathVariable String flightNumber) {
		return this.searchService.getSearchByflightNumber(flightNumber);
	}
	
	@GetMapping("/find/")
    public List<SearchDetails> getFlightByStartPointAndEndPointAndFlightDate(
    		@RequestParam(value = "startPoint") String startPoint,
            @RequestParam(value = "endPoint")String endPoint,
            @RequestParam(value = "flightDate")String flightDate) {
        return searchRepo.findByStartPointAndEndPointAndFlightDate(startPoint, endPoint, flightDate);
    }

}
