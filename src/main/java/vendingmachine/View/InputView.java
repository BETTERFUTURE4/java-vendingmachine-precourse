package vendingmachine.View;

import camp.nextstep.edu.missionutils.Console;

public class InputView {
	public static String machineMoneyInput() {
		System.out.println("자판기가 보유하고 있는 금액을 입력해 주세요.");
		return Console.readLine();
	}

	public static String machineProductInput() {
		System.out.println("상품명과 가격, 수량을 입력해 주세요.");
		return Console.readLine();
	}

	public static String userMoneyInput() {
		System.out.println("투입 금액을 입력해 주세요.");
		return Console.readLine();
	}

	public static String buyProductNameInput() {
		System.out.println("구매할 상품명을 입력해 주세요.");
		return Console.readLine();
	}
}