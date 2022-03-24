package SpringDemo.HRMSBackend.entities.concretes;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "verifications")

public class Verification {
	
	  @Id
	  @Column(name = "user_id")
	  private int userId;
	
	@OneToOne
	@JoinColumn(name = "user_id")
	private User user;

	 @Column(name = "confirm")
	 private boolean confirm;

	 @Column(name = "create_date")
	 private Date createDate;

	 @Column(name = "active")
	 private boolean active;

}
