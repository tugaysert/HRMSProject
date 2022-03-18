package SpringDemo.HRMSBackend.business.abstracts;

import java.util.List;

import SpringDemo.HRMSBackend.core.utilities.results.DataResult;
import SpringDemo.HRMSBackend.core.utilities.results.Result;
import SpringDemo.HRMSBackend.entities.concretes.EmployerConfirmBySystemEmployee;
import SpringDemo.HRMSBackend.entities.dtos.EmployerConfirmBySystemEmployeeGetDto;

public interface EmployerConfirmBySystemEmployeeService {
	
	DataResult<List<EmployerConfirmBySystemEmployee>> findAll();
	Result  isConfirmedByEmployee(int employerId, int employeeId,boolean isConfirmed);
	DataResult<List<EmployerConfirmBySystemEmployeeGetDto>> findAllByIsConfirmed(boolean isConfirmed);

}
