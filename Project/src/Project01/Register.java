package Project01;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Register {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<User> dataSet = new HashSet<>();
		User user = new User();
		user.setUserName("1");
		dataSet.add(user);
		while (true) {
			int num = dataSet.size();
			dataSet.add(register());

			if (dataSet.size() == num) {
				System.out.println("please choose another username");
				continue;
			} else {
				break;
			}
		}
		System.out.println(dataSet.size());

	}

	public static User register() {
		Scanner sc = new Scanner(System.in);
		User user = new User();
		System.out.println("please input your name!");
		String name = sc.nextLine();
		user.setUserName(name);
		System.out.println("please input your password!");
		String password = sc.nextLine();
		user.setPassword(password);
		System.out.println("please input your email!");
		String email = sc.nextLine();
		return user;

	}

}
