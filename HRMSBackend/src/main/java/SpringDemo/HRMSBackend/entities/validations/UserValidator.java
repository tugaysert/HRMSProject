package SpringDemo.HRMSBackend.entities.validations;

import SpringDemo.HRMSBackend.entities.concretes.User;

public class UserValidator {
	
    public static boolean Validator(User user) {
        if (!user.getEmail().isEmpty() && !user.getPassword().isEmpty() && !user.getConfirmPassword().isEmpty()) {
            if (user.getPassword().length() > 0 && user.getConfirmPassword().length() > 0 && user.getPassword().equals(user.getConfirmPassword()))
                return true;
            return false;
        }
        return false;
    }

}
