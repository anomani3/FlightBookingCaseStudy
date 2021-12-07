package CaseStudy.FareMicroservice.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import CaseStudy.FareMicroservice.Repository.FareRepository;
import CaseStudy.FareMicroservice.Services.FareService;
import CaseStudy.FareMicroservice.entity.FareDetails;

@RestController
@RequestMapping("/fares")

public class FareController {
	@Autowired
    private FareRepository fareRepository;

	@Autowired
	private FareService fareService;

	@GetMapping("/findAll")
	public List<FareDetails> getAllFlights() {
		return fareService.getAllFlights();
	}

	@PostMapping("/flight/add")
	public String addFlight(@RequestBody FareDetails f1) {
		this.fareService.addFlight(f1);
		return "Added Flight with id: " + f1.getfId();
	}

	@DeleteMapping("/{fId}")
	public String deleteFlight(@PathVariable String fId) {
		fareService.deleteFlight(fId);
		return "Deleted Flight with id " + fId;
	}

	@PutMapping("/{fId}")
	public String updateFlight(@PathVariable String fId, @RequestBody FareDetails fareDetails) {
		fareService.updateFlight(fId, fareDetails);
		return "Updated Flight with id: " + fId;
	}
	
	@GetMapping("/find/{fId}")
	public Optional<FareDetails>getFlightById(@PathVariable String fId) {
		return this.fareService.getFlightById(fId);
	}
	@GetMapping("/find/")
    public List<FareDetails> getFlightByStartPointAndEndPointAndFlightDate(@RequestParam(value = "startPoint") String startPoint,
            @RequestParam(value = "endPoint")String endPoint,
            @RequestParam(value = "flightDate")String flightDate) {
        return fareRepository.findByStartPointAndEndPointAndFlightDate(startPoint, endPoint, flightDate);
    }

}
