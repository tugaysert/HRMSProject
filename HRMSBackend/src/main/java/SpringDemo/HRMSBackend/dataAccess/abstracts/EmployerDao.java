package SpringDemo.HRMSBackend.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import SpringDemo.HRMSBackend.entities.concretes.Employer;

@Repository
public interface EmployerDao extends JpaRepository<Employer, Integer>{
	
	Employer findByEmail(String email);
	Employer findEmployerById(int id);
	Employer findEmployerByCompanyName(String companyName);
	

}
