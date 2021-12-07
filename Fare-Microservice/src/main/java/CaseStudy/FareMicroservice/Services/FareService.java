package CaseStudy.FareMicroservice.Services;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import CaseStudy.FareMicroservice.entity.FareDetails;

@Service
public interface FareService {

	public List<FareDetails> getAllFlights();
	public void deleteFlight(String fId);
	public void updateFlight(String fId, FareDetails updatedFlight);
	public void addFlight(FareDetails f1);
	public Optional<FareDetails> getFlightById(String fId);
}
