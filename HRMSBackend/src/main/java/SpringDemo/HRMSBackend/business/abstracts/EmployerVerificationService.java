package SpringDemo.HRMSBackend.business.abstracts;

import SpringDemo.HRMSBackend.core.utilities.results.Result;
import SpringDemo.HRMSBackend.entities.concretes.Employer;

public interface EmployerVerificationService {
	
	
	Result add(Employer employer);

}
