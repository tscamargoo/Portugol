package salarioliquido;

import java.util.Scanner;

public class salarioliquido {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		Scanner read = new Scanner(System.in);
		
		float salarioBruto, adicionalNoturno, horasextras, descontoColaborador,quantidadehx,salarioTotal;
		
		System.out.println("qual o salario: ");
		salarioBruto = read.nextFloat();
		
		System.out.println("qual o adicional noturno : ");
		adicionalNoturno = read.nextFloat();
		
		System.out.println("qual eo valor de horas extras ");
		horasextras = read.nextFloat();
		
		System.out.println("qual a quantidade de horas extras: ");
		quantidadehx = read.nextFloat();
		
		System.out.println("qual o total de desconto do colaborador : ");
		descontoColaborador = read.nextFloat();
		
		salarioTotal = ((salarioBruto+adicionalNoturno+(horasextras+quantidadehx))-descontoColaborador);
		
		System.out.println("salario liquido : "+ salarioTotal);
		
		
	}

}
