package SpringDemo.HRMSBackend.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import SpringDemo.HRMSBackend.entities.concretes.Employer;


@Repository
public interface EmployerDao extends JpaRepository<Employer, Integer>{
	
	List<Employer> findByEmail(String email);
	Employer findEmployerById(int id);
	Employer findEmployerByCompanyName(String companyName);
	

}
