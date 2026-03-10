package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "eip_m_post")
public class EipMPost {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "post_id")
	private Integer postId;

	@Column(name = "post_name")
	private String postName;

	@ManyToOne
	@JoinColumn(name = "company_id")
	private EipMCompany company;

	@OneToOne
	@JoinColumn(name = "group_name", referencedColumnName = "group_name")
	private TurbineGroup turbineGroup;
}