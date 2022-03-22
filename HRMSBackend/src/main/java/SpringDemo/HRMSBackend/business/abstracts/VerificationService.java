package SpringDemo.HRMSBackend.business.abstracts;

import SpringDemo.HRMSBackend.core.utilities.results.DataResult;
import SpringDemo.HRMSBackend.core.utilities.results.Result;
import SpringDemo.HRMSBackend.entities.concretes.User;

public interface VerificationService {
	
	
	Result add(User user);
    DataResult<Boolean> checkForEmail(String... emails);
    Result sendVerificationMail();
    Result verifiedUser();

}
