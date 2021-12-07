package CaseStudy.FareMicroservice.Repository;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import CaseStudy.FareMicroservice.entity.FareDetails;


@Repository
public interface FareRepository extends MongoRepository<FareDetails,String> {
	public List<FareDetails> findByStartPointAndEndPointAndFlightDate(String startPoint,String endPoint,String flightDate );



}
