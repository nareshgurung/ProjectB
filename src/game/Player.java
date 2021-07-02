package game;

import fixture.Room;
public class Player {
  private Room currentRoom;
  
public Player() {
	super();
}
public void setCurrentRoom(Room currentRoom) {
	  this.currentRoom = currentRoom;
  }
  public Room getCurrentRoom() {
	  return currentRoom;
  }
}
