package ch8.two.homework.twentytwo;

public class LoginForm {
	
	private String usr = "Username", pswd = "1234", usrIn, pswdIn;
	private int inputCounter = 0, attemptCounter = 0;
	
	public void input(String text){
		if(inputCounter == 0){
			usrIn = text;
		} else{
			pswdIn = text;;
		}
		inputCounter++;
	}
	
	@SuppressWarnings("deprecation")
	public void click(String button){
		if(button.equals("reset")){
			reset();
		} else if(button.equals("submit")){
				input(LoginWindow.usr.getText());
				input(LoginWindow.pswd.getText());
		}
	}
	
	public boolean login(){
		if(usrIn.equals(usr) && pswdIn.equals(pswd)){
			return true;
		} else {
			reset();
			return false;
		}
	}
	
	private void reset(){
		LoginWindow.usr.setText(null);
		LoginWindow.pswd.setText(null);
		attemptCounter ++;
		if(!(attemptCounter < 3)){
			System.out.println("Too many failed login attempts.");
			System.exit(0);
		}
		inputCounter = 0;
	}
}
