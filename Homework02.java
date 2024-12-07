//danielle williams
package day1src;
import java.util.Scanner;
/**
 * 
 */
public class Homework02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner key = new Scanner(System.in);
		
		System.out.println("You are building your own Stanley cup");
		System.out.println("Pick a size between 10oz- 40oz");
		//prints the game title and step 1
		int size = key.nextInt();
			
			if(size>=10 && size<=20){
				//gives range of size cups
				System.out.println("Choice of color for the cup is Blue, Green, Yellow. Enter your choice of color.");
				
				String choice =key.next();
				
				if(choice.equalsIgnoreCase("blue")) {
					//defines the choice blue so user input can be lower or uppercase
					System.out.println("Choose the type of straws for Blue is steel, paper and glitter. Enter the type." );
				}
				if(choice.equalsIgnoreCase("green")) {
					System.out.println("You have a plain green stanley with a plain plastic straw." );
				}
				
				if(choice.equalsIgnoreCase("yellow")) {
				
				System.out.println("You have a plain yellow stanley with a plain plastic straw." );
				}
				String straw =key.next();
				//defines the staws
				if(straw.equalsIgnoreCase("steel")) {
				System.out.println("You have a blue stanley with a steel straw.");
				}
				if(straw.equalsIgnoreCase("paper")) {
					System.out.println("You have a blue stanley with a paper straw.");
				}
				if(straw.equalsIgnoreCase("glitter")) {
					System.out.println("You have a blue stanley with a glitter straw.");
				}
				
			}
			else if(size>= 20 && size<= 30) {
					System.out.println("The choice of straw toppers for a plain steel cup is a Bow, Flower, cowboy hat. Enter the type.");
					String topper =key.next();
					
				if(topper.equalsIgnoreCase("bow")) {
					System.out.println("You have a plain steel stanley with a bow topper." );
				}
				if(topper.equalsIgnoreCase("flower")) {
					System.out.println("You have a plain steel stanley with a flower topper." );
				}
				if(topper.equalsIgnoreCase(" cowboy hat")) {
					System.out.println("You have a plain steel stanley with a cowboy hat topper. Choose what other accessory on the cup a charm, snack tray, purse attachment. Enter the type." );
					String accessory =key.next();
					if(accessory.equalsIgnoreCase("charm")) {
					System.out.println("You have a plain steel stanley with a bow topper and a charm. ");
					}
					if(accessory.equalsIgnoreCase("tray")) {
						System.out.println("You have a plain steel stanley with a flower topper and a snack tray.");
					}
					if(accessory.equalsIgnoreCase("purse")) {
						System.out.println("You have a plain steelstanley with a cowboy hat topper and purse attachment.");
					}
				}
			}
			if(size>=30 && size<=40) {
				System.out.println("The choice of cup covers for your purple stanley is black, clear, white. Enter the type.");
				String cover =key.next();
				
			if(cover.equalsIgnoreCase("black")) {
				System.out.println("You have a purple stanley with a black cover." );
			}
			if(cover.equalsIgnoreCase("clear")) {
				System.out.println("You have a purple stanley with a clear cover. Choose if you want an engraving gamecock symbol, carolina C, gamecocks writen out. Enter the type. " );
			}
			if(cover.equalsIgnoreCase("white")) {
				System.out.println("You have a purple stanley with a white cover." );
				String engrave =key.next();
				if(engrave.equalsIgnoreCase("symbol")) {
				System.out.println("You have a purple stanley with a clear cover and gamecock symbol engraved. ");
				}
				if(engrave.equalsIgnoreCase("c")) {
					System.out.println("You have a purple stanley with a clear cover and carolina C engraved.");
					//print statement based on user input
				}
				if(engrave.equalsIgnoreCase("letters")) {
					System.out.println("You have a purple stanley with a clear cover and gamecocks written outengraved.");
				}
				
		}
		}

}//end of main
}//end of class