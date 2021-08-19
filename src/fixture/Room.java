package fixture;

import java.util.Scanner;

public class Room extends Fixture {
	private Room[] exits =new Room[4];
	
	public Room() {
		super();
	}
public Room(String name, String sDescription, String lDescription) {
	super(name, sDescription, lDescription);
}
	
	
	public Room[] getExits() {
		return exits;
}


public void setExits(Room room1, Room room2, Room room3, Room room4) {

	this.exits[0] = room1;
	this.exits[1] = room2;
	this.exits[2] = room3;
	this.exits[3] = room4;
	}

public Room getExit(String direction) {
	Scanner scan = new Scanner(System.in);
	int ekey = 0;
	int wkey = 0;
	int skey = 0;
	int nkey = 0;
	
	do {
		switch(direction) {
		case "east":
				System.out.println("To open the door use key 4:");
				int key4 = scan.nextInt();
				if(key4 == 4) {
					ekey = 4;
					System.out.println("door is unlocked");
					System.out.println("Turn the light on: ");
					String light = scan.next();
					if(light.equals("on")) {
						return exits[0];
					}else {
						System.out.println("You did not turn the right switch");
						continue;
					}
				}else {
					System.out.println("Please use the valid key");
					continue;
				}
		case "west":
				System.out.println("To open the door use key 1:");
					int key1 = scan.nextInt();
				if(key1 == 1) {
					wkey = 1;
					System.out.println("door is unlocked");
					System.out.println("Turn the light on: ");
					String light = scan.next();
					if(light.equals("on")) {
						return exits[1];
					}else {
						System.out.println("You did not turn the right switch");
						continue;
					}
				}else {
					System.out.println("Please use the valid key");
					continue;
				}
				
			
			
		case "south":
				System.out.println("To open the door use key 2:");
				int key2 = scan.nextInt();
				if(key2 == 2) {
					skey = 2;
					System.out.println("door is unlocked");
					System.out.println("Turn the light on: ");
					String light = scan.next();
					if(light.equals("on")) {
						return exits[2];
					}else {
						System.out.println("You did not turn the right switch");
						continue;
					}
				}else {
					System.out.println("Please use the valid key");
					continue;
				}
					
		case "north":
				System.out.println("To open the door use key 3:");
				int key3 = scan.nextInt();
				if(key3 == 3) {
					nkey = 3;
					System.out.println("door is unlocked");
					System.out.println("Turn the light on: ");
					String light = scan.next();
					if(light.equals("on")) {
						return exits[3];
					}else {
						System.out.println("You did not turn the right switch");
						continue;
					}
				}else {
					System.out.println("Please use the valid key");
					continue;
				}
		default:
			return null;
		}
	}while(true);
}
}
