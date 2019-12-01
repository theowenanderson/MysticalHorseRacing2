package controller;

import java.text.*;
import java.util.*;

import javax.swing.JOptionPane;

public class TimerTaskControl extends TimerTask {
	
	public void create() throws ParseException {
		 //the Date and time at which to execute
	    DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = dateFormatter.parse("2019-07-06 12:00:00");

	    
	    Timer timer = new Timer();
	    
	    int period1 = 300000;
	    timer.schedule(new TimerTaskControl(), date,period1 );
	}
	public void run() {
		BeginRace br = new BeginRace();
		br.run();

		
	}



}
