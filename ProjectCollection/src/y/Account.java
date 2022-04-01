package y;

import x.User;

public class Account {
	
	private User user;
	
	public void openAccount() {
		// user authentification
		user.auth();
		// our code
	}

}
