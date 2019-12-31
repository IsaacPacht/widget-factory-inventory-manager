package entryforms;

import io.Prompter;
import menus.Menu;
import products.Color;
import products.Widget;
import products.WidgetSize;

public class WidgetEntryForm {
	private final Prompter prompter;

	public WidgetEntryForm(Prompter prompter) {
		this.prompter = prompter;
	}

	public Widget promptForWidgetData() {
		long id = prompter.promptForInt("Enter ID: ", 0, 1000);
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
