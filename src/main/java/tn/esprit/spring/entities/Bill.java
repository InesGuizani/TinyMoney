package tn.esprit.spring.entities;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import java.io.Serializable;
import java.util.Date;

@Entity

public class Bill implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id	
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	
	
	private long idBill;
	private long AmountBill;
	private String Company;
	@Temporal(TemporalType.DATE)
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
