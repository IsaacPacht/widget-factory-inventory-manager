package menus;

public enum MainMenuOption implements HasDescription {
	ADD("Add item"),
	EDIT("Edit item"),
	REMOVE("Remove item"),
	LIST("List all items"),
	EXIT("Exit");
	
	private final String description;
	
	private MainMenuOption(String description) {
		this.description = description;
	}

	@Override
	public String getDescription() {
		return description;
	}

}
