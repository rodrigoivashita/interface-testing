package modal.entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Installment {
	
	private static SimpleDateFormat fds = new SimpleDateFormat("dd/MM/yyyy");
	
	private Date date;
	private Double amount;
	
	public Installment() {
	}

	public Installment(Date date, Double amount) {
		this.date = date;
		this.amount = amount;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return fds.format(date)+" - "+ String.format("%.2f", amount );
	}	
	
	
}
