package main;
import entryforms.WidgetEntryForm;
import io.InputOutput;
import io.InputOutputImpl;
import io.Prompter;
import io.PrompterImpl;
import menus.MainMenu;

public class Main {
	public static void main(String[] args) {
		InputOutput io = new InputOutputImpl();
		Prompter prompter = new PrompterImpl(io);
		MainMenu mainMenu = new MainMenu(prompter);
		Inventory inventory = new Inventory();
		WidgetEntryForm widgetEntryForm = new WidgetEntryForm(prompter, inventory);
		UserInterface ui = new UserInterface(prompter, mainMenu, widgetEntryForm, inventory);

		ui.executeMainMenuLoop();
	}
}
