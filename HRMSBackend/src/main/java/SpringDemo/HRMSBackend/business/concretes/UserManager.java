package SpringDemo.HRMSBackend.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import SpringDemo.HRMSBackend.business.abstracts.UserService;
import SpringDemo.HRMSBackend.core.utilities.results.Result;
import SpringDemo.HRMSBackend.core.utilities.results.SuccessResult;
import SpringDemo.HRMSBackend.dataAccess.abstracts.UserDao;
import SpringDemo.HRMSBackend.entities.concretes.User;




@Service
public class UserManager implements UserService {
	
	@Autowired
	private UserDao userDao;
	
	@Override
    public Result register(User user) {
        this.userDao.save(user);
        return new SuccessResult("Registration successfully completed!");

	}
}