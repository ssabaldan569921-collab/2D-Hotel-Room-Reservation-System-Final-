package seb;
import java.util.Scanner;
public class SEB {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[][] hotel = new int[7][5]; 
		int choice;
		
		System.out.println("");
		
		while(true) {
		System.out.println("HOWTEL RESERVATION SESTEM");
		System.out.println("1. View Rooms");
		System.out.println("2. Check in");
		System.out.println("3. Check out");
		System.out.println("4. EXIT");
		System.out.println("Enter Choice: ");
		choice = sc.nextInt();
		
		System.out.println("");
		
		switch(choice) {
		case 1:
			System.out.println("ROOM STATUS: ");
			for(int x=hotel.length-1; x>=0; x--) {
				System.out.print("Floor " + (x+1) + ": ");
				for(int y=0; y<hotel[x].length;y++) {
					System.out.print("(" + hotel [x][y]+")");
				}
				System.out.println(" ");	
				
			}
			System.out.println("");
			
		case 2:
			System.out.print("Enter floor(1-7):");
			int fl = sc.nextInt();
			
			System.out.print("Enter room(1-5):");
			int rm = sc.nextInt();
			
			if(fl>= 1 && fl <= 7 && rm >= 1 && rm <= 5){
				if(hotel[fl - 1][rm - 1]==0) {
					hotel[fl -1][rm -1]=1;
					System.out.println("Check-in successful!");
				}
			}else {
				System.out.println("invalid floor on room number.");
			}		
			
			break;
		case 3:	
			System.out.print("Enter floor(1-7):");
			int flout = sc.nextInt();
			
			System.out.print("Enter room(1-5):");
			int rmout = sc.nextInt();

			
			
			if(flout >= 1 && flout <= 7 && rmout >= 1 && rmout <= 5) {
				if(hotel[flout -1][rmout -1]== 1){
					hotel[flout -1][rmout -1]=0;
					System.out.println("Check-out successful!");
				}else {
					System.out.println("Room already empty.");
				}
			}else {
				System.out.print("Invalid floor or Room number.");
			}
			break;
			
			
		case 4:
			System.out.println("THANK YOU FOR USING THE SYSTEM!.");
			return;
			default:
			System.out.println("Invalid Choice.");

	        } 
		
		System.out.println(" ");
		
		}
	}
}
