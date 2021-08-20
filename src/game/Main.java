package game;

import java.util.Arrays;
import java.util.Scanner;
import fixture.Room;

public class Main {
	public static void main(String[] args) {
		// Room manager
		RoomManager fn = new RoomManager();
		//setting up player
		Player player = new Player();
		//starting room. 
		fn.init();
		player.setCurrentRoom(fn.startingRoom);
		System.out.println("-----Welcome to my Home------");		
		System.out.println("///////Player starts at Kitchen.\\\\\\\\\\\\");
		System.out.println("East, West, South and North are the command to move next Room.");
				 
		while(true) {
			String[] command = collectInput();
			if((command.length == 2)&& (command[1].equals("west"))){
				interact(player);
			}
			else if((command.length == 2)&& (command[1].equals("south"))){
				interact(player);
			}
			else if((command.length == 2)&& (command[1].equals("north"))){
				interact(player);
			}
			else if((command.length == 2)&& (command[1].equals("east"))){
				interact(player);
			}
			else {
				System.out.println("wrong direction");
				continue;
			}
			parse(command, player);
			printRoom(player);
			System.out.println("----------------------------------------------");
		}
}
	private static void printRoom(Player player) {
		String print = "Your are at " + player.getCurrentRoom().getName() + "\n" +
						player.getCurrentRoom().getsDescription() +"\n" +
						player.getCurrentRoom().getlDescription();
		System.out.println(print);
	}
		
	private static String[] collectInput() {
		Room exit;
		Scanner scan = new Scanner(System.in);
			System.out.println("Where would you like to go: ///east/west/south/north///");
			String[] choice = scan.nextLine().split(" ");
//			for(int i=0; i<choice.length; i++) {
//				String cha = choice[0];
//				String cha1 = choice[1];
//				String con = cha+cha1;	
//				if(!con.equals("gowest")) {
//					System.out.println("tryagain");
//				}
//			}
			return choice;				
		}
	private static void parse(String[] command, Player player) {
		Scanner scan = new Scanner(System.in);
		if((command.length == 1) && (command[0].equals("quit"))){
		 //If the use chooses to quit	
			System.out.println("Good Bye!!");
			System.exit(0);
		}
		Room nextRoom = player.getCurrentRoom().getExit(command[1]);
		
		if(nextRoom != null) {
			player.setCurrentRoom(nextRoom);
//			String currentRoom = "rom" + player.getCurrentRoom().getName();
		}else {
			System.out.println("Invalid Entry!! Try Again.");
		}
}
	private static Player interact(Player player) {
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("Please trun off the light before you leave "
							+ player.getCurrentRoom().getName());
			String light = scan.next();
			if(light.equals("off")) {
				System.out.println("your light has been turned off");
//				break;
			}else {
				System.out.println("Please press the off button.");
				continue;
			}
			return player;
		}
	}
}
	
