package com.fares.Controller;

import java.util.List;

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

import com.fares.Repository.FareRepository;
import com.fares.Service.FlightBookingService;
import com.fares.entity.FareDetails;
import com.google.common.base.Optional;

@RestController
@RequestMapping("/fares")
public class FaresController {
	
@Autowired
FareRepository fareRepo;

@Autowired
private FlightBookingService flghtBookingService;

FlightBookingService s1=new FlightBookingService();

//@GetMapping("/{id}")
//public Optional<FareDetails> getfare(@PathVariable String id) {
//return fareRepo.getinfo(id);
//	}

@GetMapping("/find")
public List<FareDetails> getAllFlights() {
    return  flghtBookingService.getAllFlights();
}

@PostMapping("/flight/add")
public String add(@RequestBody FareDetails f1) {
try {
fareRepo.insert(f1);
return "Inserted sucessfully...";

	}
catch(Exception e) {
return "sorry problem in adding ";
}
}

@GetMapping("/{id}/{type}/")
public String getfare(@PathVariable String id,@PathVariable String type) {
FareDetails f1=fareRepo.getobj(id);
return "your seat is selected.please confirm.\nformat:class,fare\n"+s1.getdata(f1, type)+","+s1.fr();
	}

@GetMapping("/{id}/{type}/confirm")
public String getcon() {
return "flight id:"+s1.fid();
}

@GetMapping("/id")
public String getid() {
return s1.fid();
}

@GetMapping("/class")
public String getclass() {
return s1.fcl();
}

@GetMapping("/fare")
public String fare() {
return s1.fr();
	}



@DeleteMapping("/{fid}")
public String deleteFlight(@PathVariable("fid")  String fid) {
    return flghtBookingService.deleteFlight(fid);
}

@PutMapping("/{fid}")
public String updateFlight( @PathVariable String  fid,@RequestBody FareDetails fareDetails)
{
	 flghtBookingService.updateFlight(fid, fareDetails);
	 return "Updated Successfully";
	
	
}



}
