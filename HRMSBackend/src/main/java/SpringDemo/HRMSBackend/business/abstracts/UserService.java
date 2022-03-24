package SpringDemo.HRMSBackend.business.abstracts;

import SpringDemo.HRMSBackend.core.utilities.results.Result;
import SpringDemo.HRMSBackend.entities.concretes.User;

public interface UserService {
	
	 Result register(User user);

}
