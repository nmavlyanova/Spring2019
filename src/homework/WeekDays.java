package homework;

public class WeekDays {

	public static void main(String[] args) {
		
		boolean check =isValidDayOfWeek("Monday");
		System.out.println(check);
	}
	
	public static boolean isValidDayOfWeek (String dayName) {
		
		dayName = dayName.toLowerCase().trim();
		String [] weekDays= new String [] {"Monday", "Tuesday", "Wednesday", 
										"Thursday","Friday", "Saturday", "Sunday"};
		boolean check=false;
		for (int i = 0; i < weekDays.length; i++) {
			if(dayName.equals(weekDays[i])) {
				check=true;
			
		}else {
			check=false;
			
		}
		
	}
		return check;

}}
