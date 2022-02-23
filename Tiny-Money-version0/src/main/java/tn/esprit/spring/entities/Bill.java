package tn.esprit.spring.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table( name = "Bill")
public class Bill {
	@Id	
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name="idBill")
	
	private long idBill;
	private long AmountBill;
	private String Company;
	private Date DateBillPayment;
	private String BillIMage;
	@OneToOne(mappedBy="bill")
	private Transaction transaction;
	
	public Bill(long amountBill, String company, Date dateBillPayment, String billIMage) {
		
		AmountBill = amountBill;
		Company = company;
		DateBillPayment = dateBillPayment;
		BillIMage = billIMage;
	}
	public Bill() {
		
	}
	public long getIdBill() {
		return idBill;
	}
	public void setIdBill(long idBill) {
		this.idBill = idBill;
	}
	public long getAmountBill() {
		return AmountBill;
	}
	public void setAmountBill(long amountBill) {
		AmountBill = amountBill;
	}
	public String getCompany() {
		return Company;
	}
	public void setCompany(String company) {
		Company = company;
	}
	public Date getDateBillPayment() {
		return DateBillPayment;
	}
	public void setDateBillPayment(Date dateBillPayment) {
		DateBillPayment = dateBillPayment;
	}
	public String getBillIMage() {
		return BillIMage;
	}
	public void setBillIMage(String billIMage) {
		BillIMage = billIMage;
	}
	
}