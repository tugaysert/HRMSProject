package SpringDemo.HRMSBackend.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import SpringDemo.HRMSBackend.entities.concretes.EmployerConfirmBySystemEmployee;

public interface EmployerConfirmBySystemEmployeeDao extends JpaRepository<EmployerConfirmBySystemEmployee, Integer>{

	EmployerConfirmBySystemEmployee findByEmployerId(int employerId);
	List<EmployerConfirmBySystemEmployee> findAllByIsConformed(boolean isConfirmed);
	
}
