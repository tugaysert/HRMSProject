package SpringDemo.HRMSBackend.core.business;

import SpringDemo.HRMSBackend.core.utilities.results.ErrorResult;
import SpringDemo.HRMSBackend.core.utilities.results.Result;

public class BusinessRules {
	
	public static Result run(Result... logics) {
		
		for (Result logic : logics) {
			if (!logic.isSuccess()) {
				return logic;
			}
		}
		
		return null;
	}

}
