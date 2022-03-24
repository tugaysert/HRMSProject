package SpringDemo.HRMSBackend.business.validations;

import SpringDemo.HRMSBackend.entities.concretes.User;

public class UserValidator {
	
    public static boolean Validator(User user) {
        if (!user.getEmail().isEmpty() && !user.getPassword().isEmpty() && !user.getConfirmPassword().isEmpty()) {
            if (user.getPassword().length() > 3 && user.getConfirmPassword().length() > 3 && user.getPassword().equals(user.getConfirmPassword()))
                return true;
            return false;
        }
        return false;
    }

}
