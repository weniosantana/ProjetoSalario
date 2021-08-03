package application;

import salary.descontos;
import java.util.*;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		descontos desc = new descontos();

		System.out.print("Digite o salario bruto: ");
		desc.salariobruto = sc.nextDouble();

		System.out.print("Digite a porcentagem do desconto do inss: ");
		double porcentagem = sc.nextDouble();
		desc.descontoInss(porcentagem);

		System.out.print("Digite a porcentagem do desconto do Vale Refeição/Alimentação: ");
		porcentagem = sc.nextDouble();
		desc.descontoVr(porcentagem);

		System.out.print("Digite a porcentagem do desconto do Vale transporte: ");
		porcentagem = sc.nextDouble();
		desc.descontoVt(porcentagem);

		System.out.print("Deseja dar ajuda de custo? (Digite '1' para Sim ou '2' para não) ");
		int ajuda = sc.nextInt();
		if (ajuda == 1) {
			System.out.print("Digite o valor a ajuda de custo: ");
			desc.ajudacust = sc.nextDouble();
			desc.descontoCust(ajuda);

		}
		System.out.print("Esse mẽs teve adiantamento? (Digite '1' para Sim ou '2' para não) ");
		int adiant = sc.nextInt();
		if (adiant == 1) {
			System.out.print("Digite o valor do adiantamento: ");
			desc.descontoadiant = sc.nextDouble();
			desc.descontoAdiant(adiant);

		} else {
			desc.descontoAdiant(adiant);
		}
		System.out.println(desc);
	}

}
