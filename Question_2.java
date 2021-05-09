public class Question_2{

	public static void main(String[] args) {
		// this parameter must be received from caller. For testing only, I initialized with 2.
		int emailType = 2;
		EmailLauncher launcher = new EmailLauncher();
		launcher.launchEmail(emailType);
	}
}