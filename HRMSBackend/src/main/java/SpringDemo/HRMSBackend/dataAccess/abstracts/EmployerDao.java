package SpringDemo.HRMSBackend.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import SpringDemo.HRMSBackend.entities.concretes.Employer;

public interface EmployerDao extends JpaRepository<Employer, Integer>{
	
	Employer getByEmail(String email);
	Employer getEmployerById(int id);
	Employer getEmployerByCompanyName(String companyName);
	

}
