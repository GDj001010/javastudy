package dto;

public class ParkingDTO {
	
	private String carNo;
	private String model;
	
	public ParkingDTO () {
		
	}

	
	public ParkingDTO(String carNo, String model) {
		super();
		this.carNo = carNo;
		this.model = model;
	}



	public String getCarNo() {
		return carNo;
	}

	public void setCarNo(String carNo) {
		this.carNo = carNo;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	@Override
	public String toString() {
		return "ParkingDTO [carNo=" + carNo + ", model=" + model + "]";
	}
	
	
	
}
