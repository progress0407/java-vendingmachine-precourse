package vendingmachine.validator;

import static vendingmachine.constant.ErrorMessage.*;

public class InputValidator {

	public static void validateMachineMoney(String input) {
		isDigit(input);
		isPositive(input);
		isCorrectUnit(input);
	}

	private static void isDigit(String input) {
		try {
			Integer.parseInt(input);
		} catch (NumberFormatException e) {
			throw new IllegalArgumentException(ERROR_NOT_NUMBER);
		}
	}

	private static void isPositive(String input) {
		int intInput = Integer.parseInt(input);
		if (intInput < 0) {
			throw new IllegalArgumentException(ERROR_NOT_POSITIVE);
		}
	}

	private static void isCorrectUnit(String input) {
		int intInput = Integer.parseInt(input);
		if (intInput % 10 != 0) {
			throw new IllegalArgumentException(ERROR_NOT_CORRECT_UNIT);
		}
	}
}
