package tn.esprit.spring.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.Date;
import java.util.Set;
@Entity
@Table( name = "Account")

public class Account {
	@Id	
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name="idAccount")
	
	private long idAccount;
	@Enumerated(EnumType.STRING)
	private TypeAccount TypeAccount;
	private long CIN;
	private long RIB;
	private Date DateCreation;
	private float TotalAccount;
	
	@ManyToMany(mappedBy="account")
	private Set<User>user;
	
	@ManyToMany
	private Set<Loan>loan;
	
	@ManyToMany
	private Set<Transaction>transaction;
	
	public Account(tn.esprit.spring.entities.TypeAccount typeAccount, long cIN, long rIB, Date dateCreation,
			float totalAccount) {
		super();
		TypeAccount = typeAccount;
		CIN = cIN;
		RIB = rIB;
		DateCreation = dateCreation;
		TotalAccount = totalAccount;
	}
	public Account() {
	
	}
	public long getIdAccount() {
		return idAccount;
	}
	public void setIdAccount(long idAccount) {
		this.idAccount = idAccount;
	}
	public TypeAccount getTypeAccount() {
		return TypeAccount;
	}
	public void setTypeAccount(TypeAccount typeAccount) {
		TypeAccount = typeAccount;
	}
	public long getCIN() {
		return CIN;
	}
	public void setCIN(long cIN) {
		CIN = cIN;
	}
	public long getRIB() {
		return RIB;
	}
	public void setRIB(long rIB) {
		RIB = rIB;
	}
	public Date getDateCreation() {
		return DateCreation;
	}
	public void setDateCreation(Date dateCreation) {
		DateCreation = dateCreation;
	}
	public float getTotalAccount() {
		return TotalAccount;
	}
	public void setTotalAccount(float totalAccount) {
		TotalAccount = totalAccount;
	}
	
	
	
	
}
