package CaseStudy.FareMicroservice.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import CaseStudy.FareMicroservice.Repository.FareRepository;
import CaseStudy.FareMicroservice.entity.FareDetails;

@Service
public class FareServiceImpl implements FareService {
	

	@Autowired
	private FareRepository fareRepository;

	@Override
	public List<FareDetails> getAllFlights() {
		 return fareRepository.findAll();
	}

	@Override
	public void updateFlight(String fId, FareDetails updatedFlight) {
	fareRepository.save(updatedFlight);
	}
	
	@Override
	public void addFlight(FareDetails f1) {
		fareRepository.save(f1);	
	}

	@Override
	public void deleteFlight(String fId) {
	 fareRepository.deleteById(fId);
	}
	
	@Override
	public Optional<FareDetails> getFlightById(String fId) {
		return fareRepository.findById(fId);
	}
	public List<FareDetails> findByStartPointAndEndPointAndFlightDate(String startPoint,String endPoint,String flightDate ){
        return fareRepository.findByStartPointAndEndPointAndFlightDate(startPoint, endPoint, flightDate);
    }
}
