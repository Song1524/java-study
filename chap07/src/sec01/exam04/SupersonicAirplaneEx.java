package sec01.exam04;

public class SupersonicAirplaneEx {

	public static void main(String[] args) {
		SupersonicAirplane sa = new SupersonicAirplane();
		
		sa.takeOff();
		sa.fly();
		
		sa.flyMOde = SupersonicAirplane.SUPERSONIC;
		sa.fly();
		
		sa.flyMOde = SupersonicAirplane.NORMAL;
		sa.fly();
		
		sa.land();
	}

}
