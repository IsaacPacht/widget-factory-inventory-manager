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
		WidgetEntryForm widgetEntryForm = new WidgetEntryForm(prompter);
		Inventory inventory = new Inventory();
		UserInterface ui = new UserInterface(prompter, mainMenu, widgetEntryForm, inventory);

		ui.executeMainMenuLoop();
	}
}
