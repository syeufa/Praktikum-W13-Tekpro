package com.polban.tekpro.monopoly;

public class JailCell extends Cell {
	public static int BAIL = 50;
	private boolean available = true;
	protected Player owner;
	
	public JailCell() {
		setName("Jail");
	}
	
	public void playAction() {
		
	}

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}

	public Player getOwner() {
		return owner;
	}

	public void setOwner(Player player) {
		this.owner = player;
	}
}
