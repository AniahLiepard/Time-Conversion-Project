import java.util.Scanner;

public class Time_Tracker {
	public static void main(String args[]){
		Scanner timeNow = new Scanner(System.in);
		System.out.println("What is the time [in seconds]? Please do tell me!");
		
		int timeHours, timeMinutes, timeSeconds, timeTotal;
		
		timeTotal = timeNow.nextInt();
		System.out.println(+ timeTotal + " second(s) huh? I got this under the bag.....");
		timeHours = timeTotal / 3600;
		System.out.println(+ timeHours + " hour(s)....");
		timeMinutes = (timeTotal % 3600) / 60;
		System.out.println(+ timeMinutes + " minutes(s)....");
		timeSeconds = timeTotal % 60;
		System.out.println(+ timeSeconds + " second(s)....");
		
		System.out.print("Ah, I see! So the time is exactly " + timeHours + " hour(s), " + timeMinutes + " minute(s), and " + timeSeconds + " second(s)!");
	}
}
