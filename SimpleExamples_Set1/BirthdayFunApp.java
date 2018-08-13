package SimpleExamples;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class BirthdayFunApp {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		do {
			LocalDate birthDate;
			DateTimeFormatter d = DateTimeFormatter.ofPattern("MMMM d,YYYY");
			DateTimeFormatter m = DateTimeFormatter.ofPattern("MMMM d");
			System.out.println("Today is: " + LocalDate.now().format(d));
			System.out.println("Please enter your birthdate:");
			String input = sc.nextLine();
			try {
				birthDate = LocalDate.parse(input);
				if (birthDate.isAfter(LocalDate.now())) {
					System.out.println("U not born yet!!!!");
					continue;
				}
				System.out.println("You born on:" + birthDate.getDayOfWeek());
				long years = birthDate.until(LocalDate.now(), ChronoUnit.YEARS);
				System.out.println("You are:" + years + " years old");
				LocalDate next=birthDate.plusYears(years + 1);
				System.out.println("Your next birthday is on:" + next.format(d));
				System.out.println("Wait for :" + LocalDate.now().until(next,ChronoUnit.DAYS)+ " Days");
				System.out.println("Your half birthday is:" + birthDate.plusMonths(6).format(m));

			} catch (Exception e) {
				e.printStackTrace();
			}
		} while (askAgain());

	}

	private static boolean askAgain() {
		System.out.println("Wanna do again(Y/N)?");
		String reply = sc.nextLine();
		if (reply.equalsIgnoreCase("Y"))
			return true;
		return false;

	}
}
