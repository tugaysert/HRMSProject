package SpringDemo.HRMSBackend.entities.validations;

import SpringDemo.HRMSBackend.entities.concretes.Employer;

public class EmployerValidator {
	
	 public static boolean Validator(Employer employer){
	        if(employer.getCompanyName().isEmpty()){
	            return false;
	        }
	        return true;
	    }

}
