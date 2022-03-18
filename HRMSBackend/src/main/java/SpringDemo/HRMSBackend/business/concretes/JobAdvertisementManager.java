package SpringDemo.HRMSBackend.business.concretes;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Service;

import SpringDemo.HRMSBackend.business.abstracts.JobAdvertisementService;
import SpringDemo.HRMSBackend.core.utilities.dtoConverter.abstracts.DtoConverterService;
import SpringDemo.HRMSBackend.core.utilities.results.DataResult;
import SpringDemo.HRMSBackend.core.utilities.results.Result;
import SpringDemo.HRMSBackend.core.utilities.results.SuccessDataResult;
import SpringDemo.HRMSBackend.core.utilities.results.SuccessResult;
import SpringDemo.HRMSBackend.dataAccess.abstracts.JobAdvertisementDao;
import SpringDemo.HRMSBackend.entities.concretes.JobAdvertisement;
import SpringDemo.HRMSBackend.entities.dtos.JobAdvertisementAddDto;

@Service
public class JobAdvertisementManager implements JobAdvertisementService{
	
	JobAdvertisementDao jobAdvertisementDao;
	DtoConverterService dtoConverterService;
	
	public JobAdvertisementManager(JobAdvertisementDao jobAdvertisementDao,
			DtoConverterService dtoConverterService) {
		
		this.jobAdvertisementDao = jobAdvertisementDao;
		this.dtoConverterService = dtoConverterService;
	}
	
	
	

	//@Override
	public Result add(JobAdvertisementAddDto jobAdvertisementAddDto) {
		
		jobAdvertisementAddDto.setCreatedDate(LocalDate.now());
		JobAdvertisement jobAdvertisement =
	(JobAdvertisement) dtoConverterService.dtoToEntity(jobAdvertisementAddDto, JobAdvertisement.class);
		jobAdvertisement.setId(jobAdvertisementAddDto.getId());
		jobAdvertisement.setActive(true);
		
		//Simple city check
		for (JobAdvertisement jobAd : jobAdvertisementDao.findAll()) {
			if(jobAdvertisement.getCity().
					getCity().contentEquals(jobAd.getCity().getCity())) {
				jobAdvertisement.setCity(jobAd.getCity());
			}
		}
		
		jobAdvertisementDao.save(jobAdvertisement);
		return new SuccessResult("The job advertisement is successfully added.");
	}
	/*

	@Override
	public Result delete(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result isActive(int id, int employerId, boolean isActive) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public JobAdvertisement findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataResult<List<JobAdvertisement>> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataResult<List<JobAdvertisement>> findAllByIsActive(boolean isActive) {
		// TODO Auto-generated method stub
		return null;
	}
	*/




	@Override
	public DataResult<List<JobAdvertisement>> findAll() {
		
		this.jobAdvertisementDao.findAll();
		
		return new SuccessDataResult<List<JobAdvertisement>>
		(this.jobAdvertisementDao.findAll(),"Job advertisements are successfully listed.");
	}




	


	
	
	
	

}
