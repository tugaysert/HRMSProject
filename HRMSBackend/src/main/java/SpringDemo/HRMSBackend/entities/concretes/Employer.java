package SpringDemo.HRMSBackend.entities.concretes;



import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@EqualsAndHashCode(callSuper = false)
@Entity
@PrimaryKeyJoinColumn(name="employer_id", referencedColumnName = "id")
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
	
	@JsonIgnore
	@OneToMany(mappedBy = "employer", orphanRemoval = true, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<JobAdvertisement> jobAdvertisements;

}
