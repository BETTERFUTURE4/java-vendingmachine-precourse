package vendingmachine.Model;

import vendingmachine.Utils.Converter;
import vendingmachine.Utils.Validator.MoneyValidator;
import vendingmachine.Utils.Validator.UserMoneyValidator;

public class Money {
	private int money;

	public Money(String money) {
		new MoneyValidator(money);
		this.money = Converter.getInt(money);
	}

	public Money(String money, int minPrice) {
		new UserMoneyValidator(money, minPrice);
		this.money = Converter.getInt(money);
	}

	public int get() {
		return money;
	}

	public int toCoinCount(int divider) {
		return money / divider;
	}

	public void setMinus(int money) {
		this.money -= money;
	}

	public boolean isEmpty() {
		return money == 0;
	}

	public boolean isBiggerOrSame(int money) {
		return this.money >= money;
	}
}
