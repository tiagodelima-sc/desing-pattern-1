package strategy;

public class Funcionario {
	
	
	private double salarioHora;
	private double salarioMensal;
	private double horasTrabalhadas;
	
	public Funcionario(double salarioHora, double horasTrabalhadas, double salarioMensal) {
		this.salarioHora = salarioHora;
		this.horasTrabalhadas = horasTrabalhadas;
		this.salarioMensal = salarioMensal;
	}
	
	
	public double getSalarioMensal() {
		return salarioMensal;
	}

	public double getSalarioHora() {
		return salarioHora;
	}
	
	public double getHorasTrabalhadas() {
		return horasTrabalhadas;
	}
	
	

	public double getResultadoTotal(ContasStrategy strategy) {
		return strategy.calcular(salarioHora, horasTrabalhadas, salarioMensal);
	}
	
	
	
	

}
