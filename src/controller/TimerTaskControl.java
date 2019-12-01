package controller;

import java.text.*;
import java.time.LocalDateTime;
import java.util.*;

import javax.swing.JOptionPane;

public class TimerTaskControl extends TimerTask {
	
	public void create() throws ParseException {
		//the Date and time at which you want to execute
	    DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	    //Date date = new Date();
	    //String curDate = date.toString();
	    int curMinInt = LocalDateTime.now().getMinute();
	    int closestFiveMins = (curMinInt/5)*5 + 5;
	    String curMin = Integer.toString(curMinInt);
	    int curHour = LocalDateTime.now().getHour();
	    String closestFiveMinsStr = Integer.toString(closestFiveMins);
	    if(closestFiveMins >= 60)
	    {
	    	closestFiveMinsStr = "00";
	    	curHour++;
	    }
	    //System.out.println("Current date is: " + curDate + ", current minute is: " + curMin + ", closest 5 min interval is: " + Integer.toString(closestFiveMins));
	    
	    String finalDate = LocalDateTime.now().getYear() + "-" + LocalDateTime.now().getMonthValue() + "-" + LocalDateTime.now().getDayOfMonth() + " " + Integer.toString(curHour) + ":" + closestFiveMinsStr + ":" + "00";
	    //System.out.println(finalDate);
		Date newDateMade = dateFormatter.parse(finalDate);
	    //Now create the time and schedule it
	    Timer timer = new Timer();
	
	    //Use this if you want to execute it repeatedly
	    int period = 300000;//5 mins
	    timer.schedule(new TimerTaskControl(), newDateMade, period );
	}
	public void run() {
		JOptionPane.showMessageDialog(null,"RACE HAS BEGUN");
		BeginRace br = new BeginRace();
		br.run();
	}



}
