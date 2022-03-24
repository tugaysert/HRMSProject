package SpringDemo.HRMSBackend.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import SpringDemo.HRMSBackend.business.abstracts.EmployerService;
import SpringDemo.HRMSBackend.business.abstracts.EmployerVerificationService;
import SpringDemo.HRMSBackend.business.abstracts.UserService;
import SpringDemo.HRMSBackend.business.abstracts.VerificationService;
import SpringDemo.HRMSBackend.core.utilities.results.DataResult;
import SpringDemo.HRMSBackend.core.utilities.results.ErrorResult;
import SpringDemo.HRMSBackend.core.utilities.results.Result;
import SpringDemo.HRMSBackend.core.utilities.results.SuccessDataResult;
import SpringDemo.HRMSBackend.core.utilities.results.SuccessResult;
import SpringDemo.HRMSBackend.dataAccess.abstracts.EmployerDao;
import SpringDemo.HRMSBackend.entities.concretes.Employer;

@Service
public class EmployerManager implements EmployerService{
	
	@Autowired
	private EmployerDao employerDao;
	private UserService userService;
    private VerificationService verificationService;
    private EmployerVerificationService employerVerificationService;
	
	
	private Result isEmailExist(String email) {
		if (this.employerDao.findByEmail(email)!=null) {
			//"Email database'de mevcut"
			return new SuccessResult();
		}
		//"Email database'de mevcut degil"
		else return new ErrorResult();			
	}
	
	
	
	
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
		if (this.isEmailExist(employer.getEmail()).isSuccess() == true){
				return new ErrorResult("Email already exist");
			}
				
		//kontrol kodlari
		this.employerDao.save(employer);
		return new SuccessResult("Employer added");
		
	}

	 @Override
	    public DataResult<List<Employer>> findByEmployerEmail(String email) {
	        return new SuccessDataResult<List<Employer>>(this.employerDao.findByEmail(email), "employer listelendi (email ile)");
	    }

}
