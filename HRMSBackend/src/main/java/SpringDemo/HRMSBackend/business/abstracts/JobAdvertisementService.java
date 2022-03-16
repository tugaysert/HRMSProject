package SpringDemo.HRMSBackend.business.abstracts;

import java.util.List;



import SpringDemo.HRMSBackend.core.utilities.results.DataResult;
import SpringDemo.HRMSBackend.core.utilities.results.Result;
import SpringDemo.HRMSBackend.entities.concretes.JobAdvertisement;
import SpringDemo.HRMSBackend.entities.dtos.JobAdvertisementAddDto;


public interface JobAdvertisementService {
	
	Result add(JobAdvertisementAddDto jobAdvertisementAddDto);

	/*Result delete(int id);
	Result isActive(int id,int employerId,boolean isActive);
	
	JobAdvertisement findById(int id);
	DataResult<List<JobAdvertisement>> findAll();
	DataResult<List<JobAdvertisement>> findAllByIsActive(boolean isActive);
	/*
	DataResult<List<JobAdvertisement>> getAllByIsActive();
	DataResult<List<JobAdvertisement>> getAllByIsActiveOrderByReleasedDateTimeAsc();
	DataResult<List<JobAdvertisement>> getAllByIsActiveOrderByReleasedDateTimeDesc();
	DataResult<List<JobAdvertisement>> getAllByIsActiveAndCompanyName(String companyName);
	
	
	DataResult<List<JobAdvertisement>> getAllActiveJobAdvertisement();
	
	
	DataResult<List<JobAdvertisement>> getByAllActiveByEmployer(int employerId);
	*/
	
	

}
