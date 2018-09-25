import javax.swing.JOptionPane;

public class Clock {
	public static void main (String [] args){
		//ask the user for a start time and duration
		//give an ending time
		
		//get start time as a string
		String answer = JOptionPane.showInputDialog(null, "Give me a start time (ex: 3:10)");
		//figure out where the colon in
		int colonInd = answer.indexOf(':');
		//take start of string to where the colon is and make it an integer
		int hours = Integer.parseInt(answer.substring(0, colonInd));
		//take colon to end of string and make it an integer
		int minutes = Integer.parseInt(answer.substring(colonInd + 1, answer.length()));
		//check that it came in correctly
		//System.out.println("Hours: " + hours);
		//System.out.println("Minutes: " + minutes);
		
		
		
		
		
	}
}
