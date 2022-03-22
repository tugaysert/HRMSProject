package SpringDemo.HRMSBackend.business.concretes;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import SpringDemo.HRMSBackend.business.abstracts.EmployerVerificationService;
import SpringDemo.HRMSBackend.core.utilities.results.Result;
import SpringDemo.HRMSBackend.core.utilities.results.SuccessResult;
import SpringDemo.HRMSBackend.dataAccess.abstracts.EmployerVerificationDao;
import SpringDemo.HRMSBackend.entities.concretes.Employer;
import SpringDemo.HRMSBackend.entities.concretes.EmployerVerification;

import java.util.Date;

@Service
public class EmployerVerificationManager implements EmployerVerificationService{

	@Autowired
	private EmployerVerificationDao employerVerificationDao;
    private EmployerVerification employerVerification;
	
	
	
	@Override
	public Result add(Employer employer) {
		
		this.employerVerification = new EmployerVerification();
		this.employerVerification.setEmployerId(employer.getId());
		this.employerVerification.setConfirm(true);
		this.employerVerification.setCreateDate(new Date());
		
		this.employerVerificationDao.save(this.employerVerification);
		
	     return new SuccessResult("A verification request has been submitted to the employer.");
		
	}

}
