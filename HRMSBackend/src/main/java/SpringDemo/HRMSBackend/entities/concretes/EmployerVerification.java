package SpringDemo.HRMSBackend.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "employers_verifications")
public class EmployerVerification {
	
	 @Id
	 @Column(name = "employer_id")
	 private int employerId;

	//json back kontrlou yap
	@OneToOne
	@JoinColumn(name = "employer_id")
	private Employer employer;

	   @Column(name = "confirm")
	   private boolean confirm;

	   @Column(name = "create_date")
	   private Date createDate;

	   @Column(name = "active")
	   private boolean active;
	

}
