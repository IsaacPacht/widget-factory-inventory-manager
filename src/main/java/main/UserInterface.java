package main;
import static menus.MainMenuOption.EXIT;

import entryforms.WidgetEntryForm;
import io.Prompter;
import menus.MainMenu;
import menus.MainMenuOption;
import products.Widget;

public class UserInterface {
	private final Prompter prompter;
	private final MainMenu mainMenu;
	private final WidgetEntryForm widgetEntryForm;
	private final Inventory inventory;
	
	public UserInterface(Prompter prompter, MainMenu mainMenu, WidgetEntryForm widgetEntryForm, Inventory inventory) {
		this.prompter = prompter;
		this.mainMenu = mainMenu;
		this.widgetEntryForm = widgetEntryForm;
		this.inventory = inventory;
	}
	
	public void executeMainMenuLoop() {
		prompter.println("Welcome to Widgets R' Us Inventory Management System!");
		prompter.println("");

		MainMenuOption selection;
		while ((selection = mainMenu.prompt()) != EXIT) {
			switch(selection) {
			case ADD:
				handleAddSelection();
				break;
			case EDIT:
				handleEditSelection();
				break;
			case REMOVE:
				handleRemoveSelection();
				break;
			case LIST:
				handleListSelection();
				break;
			default:
				throw new IllegalArgumentException("It should never be possible for the program to reach this line.  If it does, it indicates a programming error - not bad user entry.");
			}
		}

		prompter.println("");
		prompter.println("Goodbye!  Thank you for using the Widgets R' Us Inventory Management System!");
	}

	private void handleAddSelection() {
		Widget widget = widgetEntryForm.promptForWidgetData();
		inventory.addProduct(widget);
	}

	private void handleEditSelection() {
		// TODO Auto-generated method stub
		prompter.println("Sorry, we do not yet support the edit option");
		
	}

	private void handleRemoveSelection() {
		// TODO Auto-generated method stub
		prompter.println("Sorry, we do not yet support the remove option");
		
	}

	private void handleListSelection() {
		// TODO Auto-generated method stub
		prompter.println("Sorry, we do not yet support the list option");
	}

}
