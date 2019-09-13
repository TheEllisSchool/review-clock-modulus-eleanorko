import javax.swing.JOptionPane;

public class Clock {
	public static void main (String [] args){
		//ask the user for a start time and duration
		//give an ending time
		
		//get start time as a string
		String answer = JOptionPane.showInputDialog(null, "When does this even start? (ex: 3:10): ");
		//figure out where the colon in
		int colonInd = answer.indexOf(':');
		//take start of string to where the colon is and make it an integer
		int hours = Integer.parseInt(answer.substring(0, colonInd));
		//take colon to end of string and make it an integer
		int minutes = Integer.parseInt(answer.substring(colonInd + 1, answer.length()));
		//check that it came in correctly
		//System.out.println("Hours: " + hours);
		//System.out.println("Minutes: " + minutes);
		
		String input = JOptionPane.showInputDialog(null, "How long is this event in minutes: ");
		int length = Integer.parseInt(input);
		//System.out.println(length);

		int hourRemains = length / 60;
		//System.out.println(hourRemains);
		
		int minRemains = length % 60;
		//System.out.println(minRemains);
		
		int newHour = hours + hourRemains;
		//System.out.println(newHour);
		int newMin = minutes + minRemains;
		
		if (newMin > 60) 
		{
			int brandNewHour = newMin / 60;
			int finalHours = newHour + brandNewHour;
			//System.out.println(finalHours);
			int brandNewMin = newMin % 60;
			if (brandNewMin < 10)
				System.out.println("The event ends at: " + finalHours + ":0" + brandNewMin);
			else {
				System.out.println("The event ends at: " + finalHours + ":" + brandNewMin);
			}
		}	
		else if (newMin < 10)
		{
			System.out.println("The event ends at: " + newHour + ":0" + newMin);
		}
		
		else 
		{
				System.out.println("The event ends at: " + newHour + ":" + newMin);
		}
		
		
		
			
		
		
		//
		
		//find the total minutes
		//find modulus of the total minutes
		
		
		/*if (newMin > 60)
		{
			int newMinRemains = newMin / 60;
			newHour = hourRemains + newMinRemains;
			int mins = newMin % 60;
			int leftOverMin = mins + newMin;
		}*/
		
		
		
		
		
	}
}
