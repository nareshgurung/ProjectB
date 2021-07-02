package fixture;

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
	switch(direction) {
	case "east":
		return exits[0];
	case "west":
		return exits[1];
	case "south":
		return exits[2];
	case "north":
		return exits[3];
	default:
		return null;
	}
}
}
