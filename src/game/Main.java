package game;

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
			close(player);
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
		Scanner scan = new Scanner(System.in);
			System.out.println("Where would you like to go: \"east/west/south/north\" ");
			String[] choice = scan.nextLine().split(" ");
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
		System.out.println(nextRoom+"nextRoom");
		
		if(nextRoom != null) {
//			System.out.println("............");
			player.setCurrentRoom(nextRoom);
//			String currentRoom = "rom" + player.getCurrentRoom().getName();
		}else {
			System.out.println("Invalid Entry!! Try Again.");
		}
}
	private static void close(Player player) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please trun off the light before you leave "
						+ player.getCurrentRoom().getName());
		String light = scan.next();
		if(light.equals("off")) {
			System.out.println("your light has been turned off");
		}
	}
}
	
