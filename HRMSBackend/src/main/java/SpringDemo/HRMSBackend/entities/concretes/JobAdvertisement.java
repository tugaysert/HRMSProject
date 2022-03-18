package SpringDemo.HRMSBackend.entities.concretes;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;

import org.hibernate.annotations.Cascade;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="job_advertisements")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler", "job"})
public class JobAdvertisement {
	
	@Id
	@Column(name = "job_advertisement_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@NotNull
	@JsonBackReference
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="employer_id")
	private Employer employer;
	
	@NotNull
	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name="job_id")
	private Job job;
	
	@ManyToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name="city_id")
	private City city;
	
	
	@Column(name = "job_advertisement_description")
	private String description;
	
	@Column(name = "number_of_open_positions")
	private int numberOfOpenPositions;
	
	@Column(name = "is_active")
	private boolean isActive;
	

	@Column(name="created_date")
	private LocalDate createdDate ;
	
	@Column(name="application_deadline")
	private LocalDate applicationDeadline;
	
	
	@Column(name = "min_salary")
	private double minSalary;
	@Column(name = "max_salary")
	private double maxSalary;
	
	
	

}
