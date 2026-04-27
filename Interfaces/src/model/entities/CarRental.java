package model.entities;

import java.time.LocalDateTime;

public class CarRental {
	
	private LocalDateTime star;
	private LocalDateTime finish;
	
	private vehicle vehicle;
	private Invoice invoice;
	
	public CarRental () {
				
	}

	public CarRental(LocalDateTime star, LocalDateTime finish, model.entities.vehicle vehicle) {
		this.star = star;
		this.finish = finish;
		this.vehicle = vehicle;
	}

	public LocalDateTime getStart() {
		return star;
	}

	public void setStart(LocalDateTime star) {
		this.star = star;
	}

	public LocalDateTime getFinish() {
		return finish;
	}

	public void setFinish(LocalDateTime finish) {
		this.finish = finish;
	}

	public vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public Invoice getInvoice() {
		return invoice;
	}

	public void setInvoice(Invoice invoice) {
		this.invoice = invoice;
	}

	
	
}
