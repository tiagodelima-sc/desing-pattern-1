package strategy;

public class HorasExtras implements ContasStrategy {
	
	@Override
	public double calcular(double salarioMensal, double horasTrabalhadas, double salarioHora) {
		
		//adicional da horas extra E 50% fim de semana, feriado nessa empresa.
		
		salarioHora = salarioHora * 1.5;
		return salarioHora;
		
	}

}
