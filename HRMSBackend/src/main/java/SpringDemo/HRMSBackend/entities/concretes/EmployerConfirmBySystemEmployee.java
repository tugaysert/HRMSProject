package SpringDemo.HRMSBackend.entities.concretes;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="employer_confirm_by_system_employees")

public class EmployerConfirmBySystemEmployee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column (name ="is_confirmed")
	private boolean isConfirmed;
	
	@JsonBackReference
	@ManyToOne
	@JoinColumn(name = "system_employee_id")
	private SystemEmployee systemEmployee;
	
	@JsonIgnore
	@Column(name="confirmed_date")
	private LocalDateTime confirmedDate;
	
	
	

}
