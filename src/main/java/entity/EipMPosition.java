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
@Table(name = "eip_m_position")
public class EipMPosition {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "position_id")
	private Integer positionId;

	@Column(name = "position_name")
	private String positionName;

	@OneToMany(mappedBy = "position")
	private List<TurbineUser> users;
}