package strategy;

public class SalarioLiquido implements ContasStrategy {

	@Override
	public double calcular(double salarioMensal, double horasTrabalhadas, double salarioHora) {
		//para fazer o calculo do salario E so fazer horas trabalhadas * 220 (44hs semanais)
		
		if(salarioMensal < 1.400) {
			
			salarioMensal = salarioMensal * 0.75;
			
		} else if(salarioMensal > 1.400){
			
			salarioMensal = salarioMensal * 0.9;
		} else {
			
			System.out.println("Algum erro aconteceu");
		}
		
		return salarioMensal;
	}
	
}
