package tn.esprit.spring.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.util.Date;
import java.util.Set;


@Entity
@Table( name = "Transaction")
public class Transaction {
	@Id	
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name="idTransaction")
	
	private long idTransaction;
	
	@Enumerated(EnumType.STRING)
	private TypeTransaction TypeTransaction;
	@Enumerated(EnumType.STRING)
	private TransactionNature TransactionNature;
	
	private Date DateTransaction;
	private float AmountTransaction;
	
	@ManyToMany(mappedBy="transaction")
	private Set<Account>account;
	@OneToOne
	private Bill bill;
	
	public Transaction(tn.esprit.spring.entities.TypeTransaction typeTransaction,
			tn.esprit.spring.entities.TransactionNature transactionNature, Date dateTransaction,
			float amountTransaction) {
		super();
		TypeTransaction = typeTransaction;
		TransactionNature = transactionNature;
		DateTransaction = dateTransaction;
		AmountTransaction = amountTransaction;
	}
	public Transaction() {

	}
	public long getIdTransaction() {
		return idTransaction;
	}
	public void setIdTransaction(long idTransaction) {
		this.idTransaction = idTransaction;
	}
	public TypeTransaction getTypeTransaction() {
		return TypeTransaction;
	}
	public void setTypeTransaction(TypeTransaction typeTransaction) {
		TypeTransaction = typeTransaction;
	}
	public TransactionNature getTransactionNature() {
		return TransactionNature;
	}
	public void setTransactionNature(TransactionNature transactionNature) {
		TransactionNature = transactionNature;
	}
	public Date getDateTransaction() {
		return DateTransaction;
	}
	public void setDateTransaction(Date dateTransaction) {
		DateTransaction = dateTransaction;
	}
	public float getAmountTransaction() {
		return AmountTransaction;
	}
	public void setAmountTransaction(float amountTransaction) {
		AmountTransaction = amountTransaction;
	}
	
}
