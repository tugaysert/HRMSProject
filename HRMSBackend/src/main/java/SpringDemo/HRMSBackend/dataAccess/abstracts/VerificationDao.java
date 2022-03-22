package SpringDemo.HRMSBackend.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import SpringDemo.HRMSBackend.entities.concretes.City;
import SpringDemo.HRMSBackend.entities.concretes.Verification;

@Repository
public interface VerificationDao extends JpaRepository<Verification, Integer>{
	
	

}
