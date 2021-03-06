package SpringDemo.HRMSBackend.entities.concretes;



import java.util.List;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@EqualsAndHashCode(callSuper = false)
@Entity
@PrimaryKeyJoinColumn(name="user_id")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
@Table(name="employers")
public class Employer extends User {
	
	
	@NotBlank
	@Column(name="company_name")
	private String companyName;
	
	@NotBlank
	@Column(name="web_site")
	private String webSite;
	
	@NotBlank
	@Column(name="phone_number")
	private String phoneNumber;
	
	@Column(name = "create_date")
	private Date createDate;

	@Column(name = "active")
	private boolean active;

	@JsonManagedReference
	@OneToMany(mappedBy = "employer", orphanRemoval = true, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<JobAdvertisement> jobAdvertisements;
	
	
	@OneToOne(mappedBy = "employer", orphanRemoval = true, cascade = CascadeType.ALL)
	private EmployerVerification employerVerification;
	
}
