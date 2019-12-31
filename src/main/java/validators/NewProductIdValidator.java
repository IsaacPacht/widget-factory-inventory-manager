package validators;

import main.Inventory;

public class NewProductIdValidator implements Validator {
	private final Inventory inventory;
	private final LongValidator longValidator;

	public NewProductIdValidator(Inventory inventory) {
		this.inventory = inventory;
		this.longValidator = new LongValidator(1, Long.MAX_VALUE);
	}

	@Override
	public String validate(String value) {
		String errorMessage = longValidator.validate(value);
		if (errorMessage != null) {
			return errorMessage;
		}
		
		long id = Long.parseLong(value);
		boolean exists = inventory.isProductInInventory(id);
		return exists ? "That ID already exists.  Please enter a new one." : null;
	}
	
}
