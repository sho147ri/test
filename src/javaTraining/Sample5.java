package javaTraining;

public class Sample5 {

	public static void main(String[] args) {
		for (CarName car : CarName.values()) {
			System.out.println(car);
		}
	}
	
	protected enum CarName {
		TOYOTA,
		HONDA,
		NISSAN,
		SUBARU,
		TESLA,
		BMW
	}
}
