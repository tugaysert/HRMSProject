package SpringDemo.HRMSBackend.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import SpringDemo.HRMSBackend.entities.concretes.SystemEmployee;

@Repository
public interface SystemEmployeeDao extends JpaRepository<SystemEmployee, Integer>{

	
	SystemEmployee findById(int id);
	
}
