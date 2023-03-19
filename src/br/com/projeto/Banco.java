package br.com.projeto;

import java.util.Scanner;

public class Banco {

	public static void main(String[] args) {

		String nomeCliente;
		int num, operacao = 0, transOp, numContaPoupanca, numContaCorrente;
		float saldoInicialC, saldoInicialP, saldoC = 0, saldoP = 0, valorG = 0;

		Scanner ler = new Scanner(System.in);

		System.out.print("Entre com o seu nome: ");
		nomeCliente = ler.nextLine();

		System.out.print("Entre com o número de sua conta corrente: ");
		numContaCorrente = ler.nextInt();

		System.out.print("Entre com o saldo inicial de sua conta corrente " + numContaCorrente + ": ");
		saldoInicialC = ler.nextFloat();

		System.out.print("Entre com o número de sua conta poupança: ");
		numContaPoupanca = ler.nextInt();

		System.out.print("Entre com o saldo inicial de sua conta poupança " + numContaPoupanca + ": ");
		saldoInicialP = ler.nextFloat();

		// while (!"5".equals(operacao)) {
		System.out.println("Qual operação deseja realizar: ");
		System.out
				.println(" 1 - Creditar\n " + "2 - Debitar\n " + "3 - Transferir\n " + "4 - Saldo\n " + "5 - Sair\n ");
		operacao = ler.nextInt();

		switch (operacao) {
		case 1:
			// console.log("O usuario deseja creditar.");
			System.out.println("Opção 1");
			break;

		case 2:
			// console.log("O usuario deseja debitar.");
			System.out.println("Opção 2");
			break;

		case 3:
			// console.log("O usuario deseja transferir.");
			System.out.println("Opção 3");
			break;

		case 4:
			// console.log("O usuario deseja consultar seu saldo.");
			System.out.println("Opção 4");
			break;

		default:
			// console.log("sair");
			System.out.println("Obrigado por trabalhar com o nosso banco!!!");
		}

		if (operacao >= 1 && operacao <= 4) {
			System.out.println(" 1 - Conta Corrente" + " 2 - Conta Poupança");
			num = ler.nextInt();

			if (operacao == 1) {
				if (num == 1) {
					System.out.println("Entre com o valor para ser Creditado");
					valorG = ler.nextFloat();
					saldoC = valorG + saldoInicialC;
					System.out.printf("Saldo atual na Conta Corrente: " + saldoC);
				} else if (num == 2) {
					System.out.println("Entre com o valor para ser Creditado");
					valorG = ler.nextFloat();
					saldoP = valorG + saldoInicialP;
					System.out.printf("Saldo atual na Conta Poupança: " + saldoP);
				}
			}
			if (operacao == 2) {
				if (num == 1) {
					System.out.println("Entre com o valor para ser Debitado");
					valorG = ler.nextFloat();
					saldoC = saldoInicialC - valorG;
					System.out.printf("Saldo atual na Conta Corrente: " + saldoC);
				} else if (num == 2) {
					System.out.println("Entre com o valor para ser Debitado: ");
					valorG = ler.nextFloat();
					if (saldoP > 0) {
						saldoP = saldoInicialP - valorG;
						System.out.printf("Saldo atual na Conta Poupança: " + saldoP);
					} else
						System.out.println("Saldo Insuficiente");
				}
			}
			if (operacao == 3) {
				if (num == 1) {
					System.out.println("Qual valor deseja transferir da CC para CP: ");
					transOp = ler.nextInt();
					saldoP = transOp + saldoInicialP;
					saldoC = saldoInicialC - transOp;
					System.out.printf("Saldo atual na Conta Poupança: ", saldoP);
					System.out.printf("Saldo atual na Conta Corrente: ", saldoC);
				} else if (num == 2) {
					System.out.println("Qual valor deseja transferir da CP para CC: ");
					transOp = ler.nextInt();
					saldoC = transOp + saldoInicialC;
					saldoP = saldoInicialP - transOp;
					if (saldoP > 0) {
						System.out.printf("Saldo atual na Conta Poupança: %.2f", saldoP);
						System.out.printf("\nSaldo atual na Conta Corrente: %.2f", saldoC);
					} else
						System.out.println("Saldo Insuficiente");
				}
				if (operacao == 4) {
					if (num == 4) {
						System.out.printf("Saldo da sua Conta Corrente: ", saldoC);
						System.out.printf("Saldo da sua Conta Poupança: ", saldoP);
					}

				}

			}
			ler = new Scanner(System.in);
		}

	}
}