package com.game;

public class Game {
	
	private int id;
	private String name;
	private String type;
	private String category;
	private String description;
	private String imageName;
	
	public Game() {
		
	}
	public Game(int id, String name, String type, String category, String description, String imageName) {
		this.id = id;
		this.name = name;
		this.type = type;
		this.category = category;
		this.description = description;
		this.imageName = imageName;
	}
	
	public Game(String name, String type, String category, String description, String imageName) {
		this.name = name;
		this.type = type;
		this.category = category;
		this.description = description;
		this.imageName = imageName;
	}
	public Game(int id, String name, String type, String category, String description) {
		this.id = id;
		this.name = name;
		this.type = type;
		this.category = category;
		this.description = description;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getType() {
		return type;
	}

	public String getCategory() {
		return category;
	}

	public String getDescription() {
		return description;
	}

	public String getImageName() {
		return imageName;
	}
	
}
