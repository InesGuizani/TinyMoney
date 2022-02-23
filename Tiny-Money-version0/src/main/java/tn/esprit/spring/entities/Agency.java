package tn.esprit.spring.entities;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table( name = "Agency")
public class Agency {
	@Id	
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name="idAgency")
	
	private long idAgency;
	private String DAG;
	private String AddressAgency;
	private String AgencyName;
	private long AgencyTel;
	
	@ManyToMany(mappedBy="agency")
	private Set<User>user;
	
	public Agency(String dAG, String addressAgency, String agencyName, long agencyTel) {
		super();
		DAG = dAG;
		AddressAgency = addressAgency;
		AgencyName = agencyName;
		AgencyTel = agencyTel;
	}
	public Agency() {
		
	}
	public long getIdAgency() {
		return idAgency;
	}
	public void setIdAgency(long idAgency) {
		this.idAgency = idAgency;
	}
	public String getDAG() {
		return DAG;
	}
	public void setDAG(String dAG) {
		DAG = dAG;
	}
	public String getAddressAgency() {
		return AddressAgency;
	}
	public void setAddressAgency(String addressAgency) {
		AddressAgency = addressAgency;
	}
	public String getAgencyName() {
		return AgencyName;
	}
	public void setAgencyName(String agencyName) {
		AgencyName = agencyName;
	}
	public long getAgencyTel() {
		return AgencyTel;
	}
	public void setAgencyTel(long agencyTel) {
		AgencyTel = agencyTel;
	}
	
}