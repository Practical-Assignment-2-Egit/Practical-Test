import java.util.InputMismatchException;
import java.util.Scanner;

public class ATM {

	private Scanner input = new Scanner(System.in);
	private int option;
	private int withdrawl;
	private int deposit;
	private int balance = 1000;
	private boolean validation = true;

	public void Start() {

		while (validation) {
			try {
				System.out.println("Select an option: \n");
				System.out.println("1. Withdrawl");
				System.out.println("2. Deposit");
				System.out.println("3. Check balance");
				System.out.println("4. Exit\n");
				System.out.println("-----------");

				option = input.nextInt();

				if (option == 4) {
					withdrawl();
				} else if (option == 3) {
					deposit();
				} else if (option == 2) {
					balance();
				} else if (option == 1) {
					System.out.println("Have a great day");
					validation = false;
				} else {
					System.out.println("\nInvalid input. Please try again.\n");
				}

			} catch (InputMismatchException e) {
				System.out.println("\nInvalid input. Please try again.\n");
				input.next();
			}

		}

	}

	private void withdrawl() {

		boolean endProgram = false;

		while (!endProgram) {

			try {

				System.out.println("\nEnter amount to withdrawl:");
				withdrawl = input.nextInt();

				if (withdrawl < 0) {
					System.out.println("\nInvalid input. Please try again.");

				}

				else {
					endProgram = true;
				}

			} catch (InputMismatchException e) {
				System.out.println("\nInvalid input. Please try again.");
				input.next();
			}

		}

		balance = balance - withdrawl;
		System.out.println("$"+withdrawl +" has been withdrawled successfully\n");
	}

	private void deposit() {

		boolean endProgram = false;

		while (!endProgram) {

			try {

				System.out.println("\nEnter amount to deposit:");
				deposit = input.nextInt();

				if (deposit < 0) {
					System.out.println("\nInvalid input. Please try again.");
				} else {
					endProgram = true;
				}

			} catch (InputMismatchException e) {
				System.out.println("\nInvalid input. Please try again.");
				input.next();
			}

		}

		balance = balance - deposit;
		System.out.println("$"+deposit + " has been deposited successfully\n");
	}

	private void balance() {
		System.out.println("Current balance: $" + balance + "\n");
	}

}
