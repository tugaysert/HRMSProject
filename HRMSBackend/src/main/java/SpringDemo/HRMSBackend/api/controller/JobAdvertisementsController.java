package SpringDemo.HRMSBackend.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import SpringDemo.HRMSBackend.business.abstracts.JobAdvertisementService;
import SpringDemo.HRMSBackend.core.utilities.results.DataResult;
import SpringDemo.HRMSBackend.core.utilities.results.Result;
import SpringDemo.HRMSBackend.entities.concretes.JobAdvertisement;
import SpringDemo.HRMSBackend.entities.dtos.JobAdvertisementAddDto;

@RestController
@RequestMapping("/api/jobadvertisements")
public class JobAdvertisementsController {
	
	private JobAdvertisementService jobAdvertisementService;
	
	@Autowired
	public JobAdvertisementsController
	(JobAdvertisementService jobAdvertisementService) {
		
		this.jobAdvertisementService = jobAdvertisementService;
		
	}
	
	@PostMapping("/add")
	Result add(@RequestBody JobAdvertisementAddDto jobAdvertisementAddDto) {
		
		return this.jobAdvertisementService.add(jobAdvertisementAddDto);
	}
	
	@GetMapping("/getall")
	DataResult<List<JobAdvertisement>> findAll(){
		return this.jobAdvertisementService.findAll();
	}
	
}
