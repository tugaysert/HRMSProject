package SpringDemo.HRMSBackend.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;


import SpringDemo.HRMSBackend.business.abstracts.EmployerConfirmBySystemEmployeeService;
import SpringDemo.HRMSBackend.core.utilities.results.DataResult;
import SpringDemo.HRMSBackend.core.utilities.results.Result;
import SpringDemo.HRMSBackend.entities.concretes.EmployerConfirmBySystemEmployee;
import SpringDemo.HRMSBackend.entities.dtos.EmployerConfirmBySystemEmployeeGetDto;

@Service
public class EmployerConfirmBySystemEmployeeManager implements EmployerConfirmBySystemEmployeeService{

	@Override
	public DataResult<List<EmployerConfirmBySystemEmployee>> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result isConfirmedByEmployee(int employerId, int employeeId, boolean isConfirmed) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataResult<List<EmployerConfirmBySystemEmployeeGetDto>> findAllByIsConfirmed(boolean isConfirmed) {
		// TODO Auto-generated method stub
		return null;
	}

}
