package model.entities;

public class Invoice {
	private Double BasicPayment;
	private Double tax;
	
	public Invoice () {
		
	}

	public Invoice(Double basciPayment, Double tax) {
		this.BasicPayment = basciPayment;
		this.tax = tax;
	}

	public Double getBascicPayment() {
		return BasicPayment;
	}

	public void setBasciPayment(Double basciPayment) {
		this.BasicPayment = basciPayment;
	}

	public Double getTax() {
		return tax;
	}

	public void setTax(Double tax) {
		this.tax = tax;
	}
	
	public Double getTotalPayment () {
		return getBascicPayment() + getTax();
	}
	
}
