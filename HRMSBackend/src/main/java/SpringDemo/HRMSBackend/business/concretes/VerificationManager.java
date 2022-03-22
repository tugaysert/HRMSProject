package SpringDemo.HRMSBackend.business.concretes;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import SpringDemo.HRMSBackend.business.abstracts.VerificationService;
import SpringDemo.HRMSBackend.core.utilities.results.DataResult;
import SpringDemo.HRMSBackend.core.utilities.results.ErrorDataResult;
import SpringDemo.HRMSBackend.core.utilities.results.Result;
import SpringDemo.HRMSBackend.core.utilities.results.SuccessDataResult;
import SpringDemo.HRMSBackend.core.utilities.results.SuccessResult;
import SpringDemo.HRMSBackend.dataAccess.abstracts.VerificationDao;
import SpringDemo.HRMSBackend.entities.concretes.User;
import SpringDemo.HRMSBackend.entities.concretes.Verification;

import java.util.Date;

@Service
public class VerificationManager implements VerificationService {
	
	@Autowired
	private VerificationDao verificationDao;
    private Verification verification;
    
    
	@Override
	public Result add(User user) {
		
		   verification = new Verification();
	        verification.setUserId(user.getId());
	        verification.setConfirm(true);
	        verification.setCreateDate(new Date());

	        this.sendVerificationMail();
	        this.verifiedUser();


	        this.verificationDao.save(verification);
	        return new SuccessResult("User Authentication has been completed.");
	}
	
	@Override
	public DataResult<Boolean> checkForEmail(String... emails) {
        for (String email:emails){
            if(email.contains("@gmail") || email.contains("@hotmail") || email.contains("@outlook"))
                return new SuccessDataResult<Boolean>();
        }
        return new ErrorDataResult<Boolean>();
        
        
	}
	@Override
	public Result sendVerificationMail() {
		System.out.println("Please complete the verification process by clicking on the link sent to your e-mail address.");
        return new SuccessResult();
	}
	@Override
	public Result verifiedUser() {
		System.out.println("The verification procedure was successfully completed.");
        return new SuccessResult();
	}
    
    
    
    
    

}
