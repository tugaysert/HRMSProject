package SpringDemo.HRMSBackend.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import SpringDemo.HRMSBackend.business.abstracts.EmployerService;
import SpringDemo.HRMSBackend.entities.concretes.Employer;

@RestController
@RequestMapping("/api/employers")
public class EmployersController {
	
	private EmployerService employerService;
	
	@Autowired
	public EmployersController(EmployerService employerService) {
		super();
		this.employerService = employerService;		
	}
	
	@GetMapping("/getall")
	public List<Employer> getAll() {
		
		return this.employerService.getAll();
	}
	
	
	@PostMapping("/add/{employer}")
	public void add(@RequestBody Employer employer) {
		
		this.employerService.add(employer);
	}

}
