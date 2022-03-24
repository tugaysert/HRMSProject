package SpringDemo.HRMSBackend.business.validations;

import SpringDemo.HRMSBackend.entities.concretes.Employer;

public class EmployerValidator {
	
	 public static boolean Validator(Employer employer){
	        if(employer.getCompanyName().isEmpty() || employer.getEmail().isEmpty()
	        		|| employer.getPhoneNumber().isEmpty()){
	            return false;
	        }
	        return true;
	    }

}
