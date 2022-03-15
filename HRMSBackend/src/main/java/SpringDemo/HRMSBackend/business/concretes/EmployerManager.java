package SpringDemo.HRMSBackend.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import SpringDemo.HRMSBackend.business.abstracts.EmployerService;
import SpringDemo.HRMSBackend.core.utilities.results.DataResult;
import SpringDemo.HRMSBackend.core.utilities.results.Result;
import SpringDemo.HRMSBackend.core.utilities.results.SuccessDataResult;
import SpringDemo.HRMSBackend.core.utilities.results.SuccessResult;
import SpringDemo.HRMSBackend.dataAccess.abstracts.EmployerDao;
import SpringDemo.HRMSBackend.entities.concretes.Employer;

@Service
public class EmployerManager implements EmployerService{
	
	private EmployerDao employerDao;
	
	//dependency injection, IoC
	@Autowired
	public EmployerManager(EmployerDao employerDao) {
		super();
		this.employerDao = employerDao;
	}

	@Override
	public DataResult<List<Employer>> getAll() {
		
		 this.employerDao.findAll();
		 return new SuccessDataResult<List<Employer>>
		 (this.employerDao.findAll(), "Employers listed");
		
	}

	@Override
	public Result add(Employer employer) {
		//kontrol kodlari
		this.employerDao.save(employer);
		return new SuccessResult("Employer added");
		
	}

}
