package com.jccm.Cuenta;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Cuenta cuenta1 = new Cuenta("Jane Green", 50.00);
		Cuenta cuenta2 = new Cuenta("John Blue", -7.53);

		System.out.printf("saldo de %s: $%.2f%n", cuenta1.obtenerNombre(), cuenta1.obtenerSaldo());
		System.out.printf("saldo de %s: $%.2f%n", cuenta2.obtenerNombre(), cuenta2.obtenerSaldo());

		Scanner sc = new Scanner(System.in);

		System.out.print("Escriba el monto a depositar para cuenta1: ");
		double montoDeposito = sc.nextDouble();

		System.out.printf("%nsumando %.2f al saldo de la cuenta%n%n", montoDeposito);
		cuenta1.depositar(montoDeposito);

		System.out.printf("saldo de %s: $%.2f%n", cuenta1.obtenerNombre(), cuenta1.obtenerSaldo());
		System.out.printf("saldo de %s: $%.2f%n", cuenta2.obtenerNombre(), cuenta2.obtenerSaldo());

		System.out.print("Escriba el monto a depositar para cuenta2:");
		montoDeposito = sc.nextDouble();

		System.out.printf("%nsumando %.2f al saldo de la cuenta%n%n", montoDeposito);
		cuenta2.depositar(montoDeposito);

		System.out.printf("saldo de %s: $%.2f%n", cuenta1.obtenerNombre(), cuenta1.obtenerSaldo());
		System.out.printf("saldo de %s: $%.2f%n", cuenta2.obtenerNombre(), cuenta2.obtenerSaldo());

		System.out.print("Escriba el monto a retirar para cuenta1: ");
		double montoRetirado = sc.nextDouble();

		System.out.printf("%nretirando %.2f al saldo de la cuenta%n%n", montoRetirado);
		cuenta1.retirar(montoRetirado);

		System.out.print("Escriba el monto a retirar para cuenta2: ");
		montoRetirado = sc.nextDouble();

		System.out.printf("%nretirando %.2f al saldo de la cuenta%n%n", montoRetirado);
		cuenta2.retirar(montoRetirado);

		System.out.printf("saldo de %s: $%.2f%n", cuenta1.obtenerNombre(), cuenta1.obtenerSaldo());
		System.out.printf("saldo de %s: $%.2f%n", cuenta2.obtenerNombre(), cuenta2.obtenerSaldo());
		
		sc.close();

	}

}
