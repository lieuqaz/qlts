package qlts_jvw.model;

public class FloorModel {
	private final String id;
	private final String name;

	public FloorModel(String id, String name) {
		this.id = id;
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}
}
