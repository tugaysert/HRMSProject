package SpringDemo.HRMSBackend.entities.concretes;

import java.time.LocalDateTime;


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
@JsonIgnoreProperties({"hibernateLazyInitializer","handler", "employer", "job"})
public class JobAdvertisement {
	
	@Id
	@Column(name = "job_advertisement_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@NotNull
	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "employer_id")
	private Employer employer;
	
	@NotNull
	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "job_titles_id")
	private Job job;
	
	@Column(name = "job_advertisement_description")
	private String description;
	
	@Column(name = "open_positions")
	private int openPositions;
	
	@Column(name = "is_active")
	private boolean isActive;
	
	@Null(message = "must be null")
	@Column(name = "release_date_time")
	private LocalDateTime releaseDateTime = LocalDateTime.now();
	

}
