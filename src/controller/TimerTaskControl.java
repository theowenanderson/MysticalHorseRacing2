package controller;

import java.text.*;
import java.util.*;

public class TimerTaskControl extends TimerTask {
	
	public void create() throws ParseException {
		 //the Date and time at which to execute
	    DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = dateFormatter.parse("2012-07-06 13:05:45");

	    
	    Timer timer = new Timer();
	    
	    int period = 300000;
	    timer.schedule(new TimerTaskControl(), date,period );
	}
	public void run() {
		System.out.println("timer works");
		BeginRace br = new BeginRace();
		br.run();
	}



}
