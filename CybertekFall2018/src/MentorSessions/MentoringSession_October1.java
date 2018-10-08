package MentorSessions;

import java.util.Scanner;

public class MentoringSession_October1 {
//tip calculator
	// number of people
			int numberOfPeople = 0;
			// split or not
			boolean split = false;
			// quality of the service
			String quality = "";
			// total amout
			double amount = 0;

			// tip percentage
			double poor = 0.05;
			double fair = 0.1;
			double good = 0.15;
			double great = 0.20;
			double excellent = 0.25;

			// total without tip per person
			double totalWOTipPerson = 0;
			// tip ampout per person
			double tipPerPerson = 0;
			// total per person including tip
			double totalWithTipPerson;

			// total tip (no splitting)
			double totalTip = 0;
			// total amount with tip (no split)
			double totalWithTip = 0;
			Scanner scanner = new Scanner(System.in);
			System.out.println("Please enter the number of people:");
			numberOfPeople = scanner.nextInt();
			System.out.println("Please enter the total amount:");
			amount = scanner.nextDouble();
			System.out.println("Split or not? (options: true false)");
			split = scanner.nextBoolean();
			System.out.println("How was the service? (options: poor fair good great excellent)");
			quality = scanner.next();
			// if we split, we will calculate tip per person
			if (split) {
				totalWOTipPerson = amount / numberOfPeople;
				System.out.println("Total per person without tip: " + totalWOTipPerson);

				switch (quality.toLowerCase()) {
				case "poor":
					tipPerPerson = totalWOTipPerson * poor;
					break;
				case "fair":
					tipPerPerson = totalWOTipPerson * fair;
					break;
				case "good":
					tipPerPerson = totalWOTipPerson * good;
					break;
				case "great":
					tipPerPerson = totalWOTipPerson * great;
					break;
				case "excellent":
					tipPerPerson = totalWOTipPerson * excellent;
					break;
				default:
					System.out.println("Use one of the given options for quality. Try again");
					break;

				}
				System.out.println("Tip per person: " + tipPerPerson);
				totalWithTipPerson = totalWOTipPerson + tipPerPerson;
				System.out.println("Total per person including tip " + totalWithTipPerson);

				// else we will calculate total tip
			} else {

				switch (quality.toLowerCase()) {
				case "poor":
					totalTip = amount * poor;
					break;
				case "fair":
					totalTip = amount * fair;
					break;
				case "good":
					totalTip = amount * good;
					break;
				case "great":
					totalTip = amount * great;
					break;
				case "excellent":
					totalTip = amount * excellent;
					break;
				default:
					System.out.println("Use one of the given options for quality. Try again");
					break;
				}

				totalWithTip = amount + totalTip;
				System.out.println("Total tip: " + totalTip);
				System.out.println("Total with tip: " + totalWithTip);

			}
}
}