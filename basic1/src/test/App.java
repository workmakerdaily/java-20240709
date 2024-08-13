package test;
class Car implements Vehicle{
	private String vin;
	private String color;
	boolean isStart;
	
	public String getVin() {
		return vin;
	}
	public void setVin(String vin) {
		this.vin = vin;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	Car(String vin, String color, boolean isStart){
		this.vin = vin;
		this.color = color;
		this.isStart = isStart;
		}
	@Override
	public void accelrate() {
	
	}
	@Override
	public void stop() {
		
	}
	@Override
	public void setStar() {
		
	}
}

class ManualCar extends Car{
	int gear;
	
	ManualCar(String vin, String color, boolean isStart, int gear) {
		super(vin, color, isStart);
		this.gear = gear;
		
		if(gear > 6 || gear < 0) System.out.println("기어를 잘못 입력하셨습니다(0-6).");
		
		System.out.println("차량번호 = " + vin + ", 색상 = " + color + ", 시동상태 = " + isStart 
				+ ", 기어 상태 = " + gear);
		}
	
	public void setGear(int gear){
		if(gear > 6 || gear < 0) System.out.println("기어를 잘못 입력하셨습니다(0-6).");
		
		System.out.println(gear + "(으)로 기어를 변경합니다.");
	}

	@Override
	public void accelrate() {
		System.out.println("수동 변속기 자동차가 가속합니다!");
	}

	@Override
	public void stop() {
		System.out.println("수동 변속기 자동차가 정차합니다!");
	}

	@Override
	public void setStar() {
		isStart = false;	
	}
}

class AutomaticCar extends Car{

	AutomaticCar(String vin, String color, boolean isStart) {
		super(vin, color, isStart);
		System.out.println("차량번호 = " + vin + ", 색상 = " + color + ", 시동상태 = " + isStart);
	}

	@Override
	public void accelrate() {
		System.out.println("자동 변속기 자동차가 가속합니다!");	
	}

	@Override
	public void stop() {
		System.out.println("자동 변속기 자동차가 정차합니다!");	
	}

	@Override
	public void setStar() {
		isStart = false;	
	}
	
}


class Train implements Vehicle{
	String trainNumber;
	String departureStation;
	String arrivalStation;
	boolean isStart;
	
	Train(String trainNumber, String departureStation,String arrivalStation, boolean isStart){
		this.trainNumber = trainNumber;
		this.departureStation = departureStation;
		this.arrivalStation = arrivalStation;
		this.isStart = isStart;
	}
	
	@Override
	public void accelrate() {
	}
	
	@Override
	public void stop() {
	}
	
	@Override
	public void setStar() {
	}
}

class PassengerTrain extends Train{
	int passengerCount;
	PassengerTrain(String trainNumber, String departureStation, String arrivalStation, boolean isStart, int passengerCount) {
		super(trainNumber, departureStation, arrivalStation, isStart);
		this.passengerCount = passengerCount;
		System.out.println("열차번호 = " + trainNumber + ", 출발역 = " + departureStation + ", 도착역 = " + arrivalStation 
				+ ", 시동 상태 = " + isStart + ", 탑승객 수 = " + passengerCount);
	}

	
	@Override
	public void accelrate() {
		System.out.println("여객 열차가 천천히 가속합니다!");
	}

	@Override
	public void stop() {
		System.out.println("여객 열차가 천천히 정차합니다!");
	}

	@Override
	public void setStar() {
		isStart = false;
	}
}

class FreightTrain extends Train{
	double cargoWeight;
	FreightTrain(String trainNumber, String departureStation, String arrivalStation, boolean isStart, double cargoWeight) {
		super(trainNumber, departureStation, arrivalStation, isStart);
		this.cargoWeight = cargoWeight;
		System.out.println("열차번호 = " + trainNumber + ", 출발역 = " + departureStation + ", 도착역 = " + arrivalStation 
				+ ", 시동 상태 = " + isStart + ", 화물 무게 = " + cargoWeight);
	}


	@Override
	public void accelrate() {
		System.out.println("화물 열차가 느리게 가속합니다!");	
	}

	@Override
	public void stop() {
		System.out.println("화물 열차가 느리게 정차합니다!");
	}

	@Override
	public void setStar() {
		isStart = false;	
	}
}

interface Vehicle{
	public void accelrate();
	public void stop();
	public void setStar();
	}


public class App {
	public static void main(String[] args) {
		Car car1 = new Car("10가1234","blue",false);
		ManualCar manualCar = new ManualCar("10가1234","blue",false,0);
		AutomaticCar automaticCar = new AutomaticCar("10가1234","blue",false);
		PassengerTrain passengerTrain = new PassengerTrain("KTX001", "서울", "부산", false, 200);
		FreightTrain freightTrain = new FreightTrain("Cargo001", "부산", "구미", true, 100.0);
	}

}
