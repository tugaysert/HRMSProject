package SpringDemo.HRMSBackend.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import SpringDemo.HRMSBackend.entities.concretes.City;

public interface CityDao extends JpaRepository<City, Integer>{
	
	

}
