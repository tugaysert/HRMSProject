package SpringDemo.HRMSBackend.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import SpringDemo.HRMSBackend.business.abstracts.EmployerService;
import SpringDemo.HRMSBackend.dataAccess.abstracts.EmployerDao;
import SpringDemo.HRMSBackend.entities.concretes.Employer;

@Service
public class EmployerManager implements EmployerService{
	
	private EmployerDao employerDao;
	
	//dependency injection, IoC
	@Autowired
	public EmployerManager(EmployerDao employerDao) {
		super();
		this.employerDao = employerDao;
	}

	@Override
	public List<Employer> getAll() {
		
		return this.employerDao.findAll();
		
	}

	@Override
	public void add(Employer employer) {
		//kontrol kondlari
		this.employerDao.save(employer);
		
	}

}
