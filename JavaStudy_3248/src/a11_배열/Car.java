package a11_배열;

public class Car {
	// 변수
	private String carNumber;
	private String carModel;
	private String carCompany;
	
	// 생성자
	public Car() {
		
	}
	public Car(String carNumber, String carModel, String carCompany) {
		this.carNumber = carNumber;
		this.carModel = carModel;
		this.carCompany = carCompany;
	}
	
	// get, set
	public String getCarNumber() {
		return carNumber;
	}
	public void setCarNumber(String carNumber) {
		this.carNumber = carNumber;
	}
	public String getCarModel() {
		return carModel;
	}
	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}
	public String getCarCompany() {
		return carCompany;
	}
	public void setCarCompany(String carCompany) {
		this.carCompany = carCompany;
	}
	
	
	public void showCarInfo() {
		System.out.println("차량번호: " + carNumber);
		System.out.println("차량모델: " + carModel);
		System.out.println("제조사: " + carCompany);
		System.out.println();
	}
	

}
