package game;
import fixture.Room;

public class RoomManager {

	Room rooms[] = new Room[4];
	Room startingRoom;
	
	public void init() {
		Room kit = new Room("kitchen.", "\t -New remodel kithen.",
					"\t -modern kitchen with maple cabinets, stainless appliances. \n"
					+ "---You can go south and west---");
					this.rooms[0] =kit;
					this.startingRoom =kit;
						
		Room bed = new Room("Bedroom.", "\t -Master Bedroom.", 
					"\t -All major improvements are within 8 years such as new replacement \n"
					+ "\t thermopane windows and attached full Bathroom. \n"
					+ "---you can go east and south.---");	
					this.rooms[1] = bed;
	
		Room liv = new Room("livingroom.", "\t -Decorated Room.", "\t -this room's wall has nice painting hanged on \n" +"\t the wall"
					+ "in east and west and has big carpent on the floor.\n"
					+ "--You can go west and north.---");
					this.rooms[2] = liv;
		
		Room din = new Room("diningRoom", "\t -DiningRoom with long table", "\t -DiningRoom has long table with six \n"
					+ "\t chair and located in the south part of home.\n"
					+ "---you can go east and south.---");
					this.rooms[3]= din;
					
					kit.setExits(null, rooms[1], null, rooms[3]);
					bed.setExits(rooms[0], null, rooms[2], null);
					liv.setExits(null, rooms[1], null, rooms[3]);
					din.setExits(rooms[0], null, rooms[2], null);
	}
	
}
