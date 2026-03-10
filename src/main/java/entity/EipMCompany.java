package entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "eip_m_company")
public class EipMCompany {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "company_id")
	private Integer companyId;

	@Column(name = "company_name")
	private String companyName;

	@OneToMany(mappedBy = "company")
	private List<TurbineUser> users;

	@OneToMany(mappedBy = "company")
	private List<EipMPost> posts;
}
