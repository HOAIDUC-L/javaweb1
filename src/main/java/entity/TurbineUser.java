package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "turbine_user")
public class TurbineUser {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_id")
	private Integer userId;

	@Column(name = "login_name", length = 32)
	private String loginName;

	@Column(name = "password_value", length = 20)
	private String passwordValue;

	@Column(name = "first_name", length = 99)
	private String firstName;

	@Column(name = "last_name", length = 99)
	private String lastName;

	@Column(name = "email", length = 99)
	private String email;

	@Column(name = "in_telephone", length = 15)
	private String inTelephone;

	@Column(name = "out_telephone", length = 15)
	private String outTelephone;

	@ManyToOne
	@JoinColumn(name = "company_id")
	private EipMCompany company;

	@ManyToOne
	@JoinColumn(name = "position_id")
	private EipMPosition position;

	@Column(name = "is_admin")
	private Boolean isAdmin;
}