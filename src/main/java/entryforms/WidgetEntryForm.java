package entryforms;

import io.Prompter;
import main.Inventory;
import menus.Menu;
import products.Color;
import products.Widget;
import products.WidgetSize;
import validators.NewProductIdValidator;

public class WidgetEntryForm {
	private final Prompter prompter;
	private final NewProductIdValidator newProductIdValidator;

	public WidgetEntryForm(Prompter prompter, Inventory inventory) {
		this.prompter = prompter;
		this.newProductIdValidator = new NewProductIdValidator(inventory);
	}

	public Widget promptForWidgetData() {
		long id = prompter.promptForLong("Enter ID: ", newProductIdValidator);
		String description = prompter.prompt("Enter description: ");
		Color color = selectColor();
		WidgetSize size = selectSize();
		return new Widget(id, description, color, size);
	}

	private Color selectColor() {
		Menu menu = new Menu(prompter, "Select a color", Color.values());
		return (Color) menu.prompt();
	}

	private WidgetSize selectSize() {
		Menu menu = new Menu(prompter, "Select a size", WidgetSize.values());
		return (WidgetSize) menu.prompt();
	}
}
