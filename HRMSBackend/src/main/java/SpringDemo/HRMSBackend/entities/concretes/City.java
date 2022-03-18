package SpringDemo.HRMSBackend.entities.concretes;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="cities")
@AllArgsConstructor
@NoArgsConstructor
public class City {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="city_id")
	private int id;
	
	@Column(name="city")
	private String city;
	
	@JsonIgnore
	@OneToMany(mappedBy ="city", orphanRemoval = true)
	private List<JobAdvertisement> jobAdvertisements;
}
