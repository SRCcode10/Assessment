package passportApplication;

public class MainPassport {

	public static void main(String[] args) {
		try {
			Application a1 = new Application("Sanjit", 13, "Indian", "No");
			a1.checkcredentials();
		} catch (Exception e) {
			throw new RuntimeException("The application for the candidate was not approved");

		}
		Application a2 = new Application("Jack", 33, "Indian", "No");
		a2.checkcredentials();
		System.out.println(a2);

	}

}
