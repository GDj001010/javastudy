package parking;

import java.util.Arrays;
import java.util.Scanner;

public class ParkingLot {

	private String name;	// 주차장 이름
	private Car[] cars;		// 주차장
	private int idx;        // 주차장에 자동차 객수
	private Scanner sc;		// 
	
	
	// 생성자
	public ParkingLot(String name) {
		this.name = name;
		cars = new Car[10];
		sc = new Scanner(System.in);
	}
	
	public void addCar() {
		System.out.println("현재 등록된 차량은 : " + idx + " 대다.");
		if(idx == cars.length) {
			System.out.println("더 이상 차량 등록이 불가능합니다.");
		return;
		}
		System.out.println("차량번호 >>>");
		String carNo = sc.next();
		System.out.println("모델 >>>");
		String model = sc.next();
		//cars[idx++] = new Car(carNo, model);  	아래랑 똑같은 식
		Car car = new Car(carNo, model);
		cars[idx++] = car;
		System.out.println("차량번호 " + carNo + " 차량이 등록되었습니다.");
		
		
		
		
		
		/*
		System.out.println("차량번호와 모델명을 순서대로 입력하세요");
		Car car = new Car(sc.next(), sc.next());
		cars[idx++] = car;
		System.out.println(car.getModel() + "번호: " + car.getCarNo() + "차량이 등록되었습니다.");
		*/
		
	}
	
	public void deleteCar() {			// 빠진 차량
		
		if(idx == 0) {
			System.out.println("빠질 차량이 없습니다.");
			return;
		}
		int deletecar = (int)(Math.random() * idx);
			
		for(int i = 0; i < idx; i++) {
			if(cars[i] == cars[deletecar]) {
				cars[i] = null;
			}
			if(idx == 0) {
				System.out.println("빠질 차량이 없습니다.");
				
		}
		}
		
		
		
		
	}
	
	public void printAllCars() {		// 모든 차량 정보
		
		System.out.println("현재 등록된 차량은 : " + idx + " 대다.");
		if(idx == 0) {
			System.out.println("현재 주차장은 비어있습니다.");
			return;
		}   
		for(int i = 0; i < idx; i++) {
			System.out.println(cars[i]);
		}
		
		
	}
	

	public void manage() {				// 메니저
		while(true) {
			
			System.out.println("1.추가 2.삭제 3.전체 0.종료 >>>");
			String choice = sc.next();
			
			switch(choice) {
			case "1":
				addCar();	// addCar 호출
				break;
			case "2":
				deleteCar();
			case "3":
				printAllCars();
			case "0":
				return;		// method 종료
			default : 
				System.out.println("존재하지 않는 메뉴입니다.");
			}	
			
//			String choice = sc.next();
		}
		
		
	}


	
	
	
	
	
	
}
