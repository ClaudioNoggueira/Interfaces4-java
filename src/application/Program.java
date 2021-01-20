package application;

import java.util.Scanner;

import services.BrazilInterestService;
import services.InterestService;
import services.UsaInterestService;

public class Program {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Quantia: ");
		double amount = input.nextDouble();
		System.out.print("Mês: ");
		int months = input.nextInt();

		InterestService is = new BrazilInterestService(2.0);
		double payment = is.payment(amount, months);

		System.out.println("Pagamento depois de " + months + " meses: ");
		System.out.println("R$ " + String.format("%.2f", payment));

		input.close();
	}
}
