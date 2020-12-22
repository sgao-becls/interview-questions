package org.example.grouping;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * 请完善grouping方法
 *
 * @author sgao
 */
public class Application {

	public static void main(String[] args) {
		List<Account> accounts = new ArrayList<>();
		Account account1 = new Account(1, "Martin", true);
		Account account2 = new Account(2, "Jack", true);
		Account account3 = new Account(3, "Sam", false);
		accounts.add(account1);
		accounts.add(account2);
		accounts.add(account3);
		accounts.forEach(account -> System.out.println(String.format("%s::%s::%s", account.getId(), account.getName(), account.getValidated())));
		System.out.println();

		Map<Boolean, List<User>> result = grouping(accounts);

		if (Objects.isNull(result)) {
			return;
		}

		result.forEach((key, value) -> {
			System.out.println(String.format("Validated is %s :: ", key));
			value.forEach(user -> System.out.println(String.format("%s::%s::%s", user.getId(), user.getName(), user.getValidated())));
		});
	}

	/**
	 * 请实现此方法，逻辑为， 按照account是否已经被验证， 对account进行分组， 分组内Account对象转为User对象
	 *
	 * @param accounts Account集合
	 * @return Map<validated, List<User>>
	 */
	public static Map<Boolean, List<User>> grouping(List<Account> accounts) {
		return null;
	}
}
