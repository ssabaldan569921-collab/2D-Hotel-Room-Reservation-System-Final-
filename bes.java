package bes;
import javax.swing.JOptionPane;
public class besss {

	public static void main(String[] args) {
		int hotel[][] = new int [7][5];
		int choice;
		int availableRooms = 35;
		int occupiedRooms = 0 ; 
		
		while (true) {
			String input = JOptionPane.showInputDialog(
					"Hotel Reservation System \n\n +"
					+ "1. View Rooms\n +"
					+ "2. Check In\n"
					+ "3. Check Out\n"
					+ "4. Exit\n\n"
					+ "Enter Choice: ");
			
			if (input == null) break;
			choice = Integer.parseInt(input);
			
			if(choice == 1) {
				String display = "Room Status: \n";
				display += "\nRooms Available: " + availableRooms + "Rooms Occupied: " + occupiedRooms + "\n\n";
				
				for (int i = 6; i >= 0; i--) {
					display += "Floor " + (i + 1) + ": ";	
					
					for (int j = 0; j < 5; j++) { 
					display += "[" + hotel[i][j] + "] "; 	 
					
				}
				display += "\n";
			    }
				JOptionPane.showMessageDialog(null, display);
		        }
			
				else if (choice == 2) {
			 
				String floorInput = JOptionPane.showInputDialog("Enter Floor (1 to 7):");
				String roomInput = JOptionPane.showInputDialog("Enter Room (1 to 5):");
				 
				if (floorInput == null || roomInput == null) break; 
				int floor = Integer.parseInt(floorInput) - 1;
				 
				int room = Integer.parseInt(roomInput) - 1; 
				if (hotel[floor][room] == 0) {
				 
				int confirm = JOptionPane.showConfirmDialog(null, "Confirm Check-In?", "Check-In", JOptionPane.YES_NO_OPTION); 
				if (confirm == JOptionPane.YES_OPTION) {
				 
				hotel[floor][room] = 1; 
				 
				availableRooms--; 
				occupiedRooms++; 
				JOptionPane.showMessageDialog(null, "Checked in!");
	         }
				
	       } else {
	    	   JOptionPane.showMessageDialog(null, "Room already occupied!");
	       }
         
		   }
			
			 
				else if (choice == 3) {
				
		 
				String floorInput = JOptionPane.showInputDialog("Enter Floor (1-7):");
				String roomInput = JOptionPane.showInputDialog("Enter Room (1-5):");
				 
				if (floorInput == null || roomInput == null) break; 
				int floor = Integer.parseInt(floorInput) - 1;
				 
				int room = Integer.parseInt(roomInput) - 1; 
				if (hotel[floor][room] == 1) {
				 
				int confirm = JOptionPane.showConfirmDialog(null, "Confirm Check-Out?", "Check-Out", JOptionPane.YES_NO_OPTION);	 
				if (confirm == JOptionPane.YES_OPTION) {
				 
				hotel[floor][room] = 0; 
				availableRooms++;
				
				occupiedRooms--;
				 
				JOptionPane.showMessageDialog(null, "Checked out!");		 
           }
				
	       }else {
	    	   JOptionPane.showMessageDialog(null, "Room already empty!");   
	       }
				 if (choice == 4) {
					 
					JOptionPane.showMessageDialog(null, "Pleasure doing business with you!");
					 
					break; 	 
					}
				 
				 else {  
				 JOptionPane.showMessageDialog(null, "Invalid choice, please try again.");
			 	  
             }
	      }	
	   }
    }
}
