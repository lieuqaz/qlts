package qlts_jvw.model;

public class UserModel {
	private final String floorID;
	private final String email;
	private final int id;
	private final String phoneNB;
	private final String roleName;
	private final String userName;
	private final String name;

	public UserModel(String floorID, String email, int id, String phoneNB, String roleName, String userName,
			String name) {
		this.floorID = floorID;
		this.email = email;
		this.id = id;
		this.phoneNB = phoneNB;
		this.roleName = roleName;
		this.userName = userName;
		this.name = name;
	}

}
