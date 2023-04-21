package com.exception.day18;

public class PassLogin {

	public void checkPassword(String pass) throws PasswordException {
		System.out.println("Start");
		try {
			if (pass.length() >= 8) {
				System.out.println("Login Successfully");
			} else {
				throw new PasswordException("Pass Must Contain 8 Char");
			}
		} catch (PasswordException e) {
			e.printStackTrace();
		}

		finally {
			System.out.println("Welcome");
		}
	}

}
