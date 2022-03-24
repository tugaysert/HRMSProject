package SpringDemo.HRMSBackend.business.abstracts;

import java.util.List;

import SpringDemo.HRMSBackend.core.utilities.results.DataResult;
import SpringDemo.HRMSBackend.core.utilities.results.Result;
import SpringDemo.HRMSBackend.entities.concretes.Employer;


public interface EmployerService {
	
	DataResult<List<Employer>> getAll();
	Result add(Employer employer);
	DataResult<List<Employer>> findByEmployerEmail(String email);

}
