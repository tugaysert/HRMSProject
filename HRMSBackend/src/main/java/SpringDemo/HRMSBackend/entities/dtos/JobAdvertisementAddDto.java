package SpringDemo.HRMSBackend.entities.dtos;

import java.time.LocalDate;
import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class JobAdvertisementAddDto {
	
	@JsonIgnore
	private int id;
	private int employerId;
	@JsonIgnore
	private int jobTitleId;
	private String jobDescription;
	private int minSalary;
	private int maxSalary;
	private String DtoCity;
	private int numberOfOpenPosition;
	@JsonIgnore
	private LocalDate applicationDeadline;
	@JsonIgnore
	private LocalDate createdDate;
	@JsonIgnore
	private boolean isActive;
	
	
	


}