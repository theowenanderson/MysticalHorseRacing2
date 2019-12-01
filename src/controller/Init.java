package controller;

import java.text.ParseException;

import view.LoginScreen;

public class Init {
	
	public void run() {
		
	}

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		GameEngine game = new GameEngine();
		TimerTaskControl ttc = new TimerTaskControl();
		ttc.create();
		game.initialize();
		LoginScreen runner = new LoginScreen();
		runner.setVisible(true);


	}

}
