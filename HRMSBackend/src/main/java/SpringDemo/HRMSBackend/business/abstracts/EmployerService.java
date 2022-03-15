package SpringDemo.HRMSBackend.business.abstracts;

import java.util.List;

import SpringDemo.HRMSBackend.entities.concretes.Employer;

public interface EmployerService {
	
	List<Employer> getAll();
	void add(Employer employer);

}
