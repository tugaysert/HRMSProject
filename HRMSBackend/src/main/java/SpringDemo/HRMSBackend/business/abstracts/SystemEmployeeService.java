package SpringDemo.HRMSBackend.business.abstracts;

import java.util.List;

import SpringDemo.HRMSBackend.core.utilities.results.DataResult;
import SpringDemo.HRMSBackend.core.utilities.results.Result;
import SpringDemo.HRMSBackend.entities.concretes.SystemEmployee;

public interface SystemEmployeeService {
	
	DataResult<List<SystemEmployee>> findAll();
	Result add(SystemEmployee systemEmployee);

}
