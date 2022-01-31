package strategy;

public class SalarioBonificacao implements ContasStrategy {

	
	@Override
	public double calcular(double salarioMensal, double horasTrabalhadas, double salarioHora) {
		//bonificacao do funcionario
		
		salarioHora = salarioHora * 0.9;
		return salarioHora;
	}
	
	
}
