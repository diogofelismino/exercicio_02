package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product{
	
	private Date manufacturDate;
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public UsedProduct() {
		super();
	}

	public UsedProduct(String name, Double price, Date manufacturDate) {
		super(name, price);
		this.manufacturDate = manufacturDate;
	}

	public Date getManufacturDate() {
		return manufacturDate;
	}

	public void setManufacturDate(Date manufacturDate) {
		this.manufacturDate = manufacturDate;
	}

	@Override
	public String priceTag() {
		return getName() + " (used) $ " 
				+ getPrice()
				+ " (manufacture date: "
				+sdf.format(manufacturDate)
				+ ")";
	}
	
}
