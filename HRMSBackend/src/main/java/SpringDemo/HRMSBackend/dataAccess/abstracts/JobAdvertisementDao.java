
package SpringDemo.HRMSBackend.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import SpringDemo.HRMSBackend.entities.concretes.JobAdvertisement;

@Repository
public interface JobAdvertisementDao extends JpaRepository<JobAdvertisement, Integer>{

	JobAdvertisement findById(int id);
	
	//JobAdvertisement getByEmployer_EmployerId(int id);
	
	List<JobAdvertisement> findAll();
	List<JobAdvertisement> findAllByIsActive(boolean isActive);
	//List<JobAdvertisement> getAllByIsActiveOrderByReleasedDateTimeAsc(boolean isActive);
	//List<JobAdvertisement> getAllByIsActiveOrderByReleasedDateTimeDesc(boolean isActive);
	//List<JobAdvertisement> getAllByIsActiveAndEmployer_CompanyName(boolean isActive, String companyName);
	
	//@Query("from JobAdvertisement ja where ja.isActive = true")
	//List<JobAdvertisement>getAllActiveJobAdvertisement();
	
	//@Query("from JobAdvertisement ja where ja.employer.id=:employerId")
	//List<JobAdvertisement>getByAllActiveByEmployer(int employerId);
	
	
	
} 
