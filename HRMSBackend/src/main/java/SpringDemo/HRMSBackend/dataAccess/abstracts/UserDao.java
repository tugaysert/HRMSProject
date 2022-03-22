package SpringDemo.HRMSBackend.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import SpringDemo.HRMSBackend.entities.concretes.City;
import SpringDemo.HRMSBackend.entities.concretes.User;

@Repository
public interface UserDao extends JpaRepository<User, Integer>{
	
	

}
