package main;

import java.util.Scanner;

import chain_of_responsability.ChequeComLimite;
import chain_of_responsability.ChequeSemFundo;
import chain_of_responsability.CompraMaquinas;
import chain_of_responsability.SaldoEmpresa;
import hook_method.OrdemComida;
import hook_method.OrdemDeCompra;
import hook_method.OrdemLimpeza;
import observer.AtualizarMsg;
import observer.DadosMsg;
import observer.MensagensObserver;
import state_pattern.IntegracaoComeco;
import state_pattern.IntegracaoFinal;
import state_pattern.IntegracaoStatus;
import strategy.ContasStrategy;
import strategy.Funcionario;
import strategy.HorasExtras;
import strategy.SalarioBonificacao;
import strategy.SalarioLiquido;
import composite.Estagiario;
import composite.EmpresaJunior;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		boolean tentarNovamente = true;
		
		//Menu de opcoes do gestao de empresas.
		//enquanto for verdadeiro, execute..
		
		do {
			
			int sair = 10;
			
			System.out.println("===== GESTAO DE EMPRESAS =====");
			System.out.println();
			System.out.println("Escolha uma opcao do menu");
			System.out.println();
			System.out.println("(1) - Gerenciar Pagamento dos Funcionarios");
			System.out.println("(2) - Verificar Gastos da Empresa");
			System.out.println("(3) - Integracao da Empresa");
			System.out.println("(4) - Notificacar o e-mail");
			System.out.println("(5) - Controle de Estagiarios da Empresa");
			System.out.println("(6) - Efetuar a Compra de Maquinas Industriais");
			System.out.println("(7) - Forcar a Parada do Sistema");
			
			int selecionador = ler.nextInt();
			
			switch(selecionador) {
			
			case 1:
				System.out.println("Digite o Salario por Mes do Funcionario: ");
				double salarioMensal = ler.nextDouble();
				System.out.println("Digite o Salario por Hora do Funcionario: ");
				double salarioHora = ler.nextDouble();
				System.out.println("Digite Quantas Horas o Funcionario Trabalhou: ");
				double horasTrabalhadas = ler.nextDouble();
				Funcionario pgtfuncionario = new Funcionario(salarioMensal, salarioHora, horasTrabalhadas);
				System.out.println("Gestao Financeiro dos Funcionarios: ");
				System.out.println(""
						+ "(1) - Salario Liquido. "
						+ "(2) - Horas Extras. "
						+ "(3) - Adicionar Bonificacao ");
				
				int selecionadorDois = ler.nextInt();
				
				switch (selecionadorDois) {
				
				case 1: 
					System.out.println("O salario com os descontos do funcionario totalizou em: "  + "R$" + pgtfuncionario.getResultadoTotal(new SalarioLiquido()));
					System.out.println();
					break;
					
				case 2: 
					System.out.println("Qual o nome do funcionario?");
					String nomefuncionario = ler.next();
					System.out.println("As horas extras do funcionario: "+ nomefuncionario + " Totalizaram: " + " R$" + pgtfuncionario.getResultadoTotal(new HorasExtras()));
					System.out.println();
					break;
					
				case 3:
					System.out.println("Foi adicionado uma bonificacao de: R$" + pgtfuncionario.getResultadoTotal(new SalarioBonificacao()) + " Devido seu esforco na empresa.");
					System.out.println();
					break;
					
				}
					break;
			
			case 2:
				
				System.out.println("Gestao Contas da Empresa: ");
				System.out.println(""
						+ "(1) - Gastos com Comida. "
						+ "(2) - Gastos com Limpeza. "
						);
				
				int selecionadorTres = ler.nextInt();
				
				switch (selecionadorTres) {
				
				case 1: 
					System.out.println("Total de Gastos:");
					System.out.println();
					
					OrdemDeCompra gastosComida = new OrdemComida(89.97, 0, "Verduras");
					System.out.println("Com as: "+ gastosComida.getNomeProdut() +" Foi Gasto: R$" + gastosComida.getPrecoComidaDia() + " Por dia. Totalizando: R$" +  gastosComida.calcularMes(30)  + " ao mes");
					System.out.println();
					
					OrdemDeCompra gastosComida2 = new OrdemComida(150, 0, "Frutas");
					System.out.println("Com as: "+ gastosComida2.getNomeProdut() +" Foi Gasto: R$" + gastosComida2.getPrecoComidaDia() + " Por dia. Totalizando: R$" +  gastosComida2.calcularMes(30)  + " ao mes");
					System.out.println();
					break;
					
				case 2: 
					System.out.println("Total de Gastos:");
					System.out.println();
					
					OrdemDeCompra gastosLimpeza = new OrdemLimpeza(0, 450.00, "Diarias dos Prestadores de Servicos");
					System.out.println("Com as: "+ gastosLimpeza.getNomeProdut() +" Foi Gasto: R$" + gastosLimpeza.getPrecoLimpezaDia() + " Por dia. Totalizando: R$" +  gastosLimpeza.calcularMes(30)  + " ao mes");
					System.out.println();
					
					OrdemDeCompra gastosLimpeza2 = new OrdemLimpeza(0, 37.50, "Produtos de Higienizacao");
					System.out.println("Com as: "+ gastosLimpeza2.getNomeProdut() +" Foi Gasto: R$" + gastosLimpeza2.getPrecoLimpezaDia() + " Por dia. Totalizando: R$" +  gastosLimpeza2.calcularMes(30)  + " ao mes");
					System.out.println();
					break;
				
				}
				
				break;
					
					
				
			case 3:
				
				System.out.println("Integracao da Empresa: ");
				System.out.println(""
						+ "(1) - Iniciar Video. "
						+ "(2) - Pausar Video. "
						);
				
				int selecionadorQuatro = ler.nextInt();
				
				IntegracaoStatus status = new IntegracaoStatus();
				
				switch (selecionadorQuatro) {
				
				case 1: 
					
					IntegracaoComeco comecarVideo = new IntegracaoComeco();
					comecarVideo.verificarStatus(status);
					System.out.println();
					continue;
					
				case 2: 
					
					IntegracaoFinal pausarVideo = new IntegracaoFinal();
					pausarVideo.verificarStatus(status);
					System.out.println();
					continue;
					
				}
				
				break;
				

				
			case 4:
				
				System.out.println("Escolha o Destinatario: ");
				System.out.println();
				System.out.println("(1) - Enviar Aviso no e-mail Para Todos os Trabalhadores.");
				System.out.println();
				System.out.println("(2) - Enviar Aviso no e-mail Para Gestores e Lideres. ");

				
				int selecionadorCinco = ler.nextInt();
				
				AtualizarMsg atualizarmsg = new AtualizarMsg();
				
				//eu crio uma instancia do auditoriaObserver
				//e uma isntancia dos dados observer
				new MensagensObserver(atualizarmsg);
				new DadosMsg(atualizarmsg);
				
				switch (selecionadorCinco) {
				
				case 1: 
					
					System.out.println();
					System.out.println("======== GERAL =========");
					atualizarmsg.setNotification();
					System.out.println();
					//na primeira vez que eu notifico os observadores para que eles possam atualizar seu estado intero
					//eu chamo o metodo setnotificacao do objeto sujeito
					//como eu ja tenho nesse objeto sujeito aqui
					//e ja adiiconei a auditoria e dados observer na minha lista
					//entao quando eu chamo o setnoficacao, eu vou disparar uma notificacao de atualizao, ou seja, uma requisicao
					//para os meus observadores, para as minhas classes que dependem da minha notificacao
					
					
				case 2: 
					

					//na segunda eu chamo outra mensagem, mais uma vez, ele ira disparar uma requisicao de atualizacao
					//para os meus bjetos que estao dependendo dessa notififcacao para mudar meu estado interno
					System.out.println();
					System.out.println("======== LIDERES =========");
					atualizarmsg.setNotification();
					System.out.println();
					continue;
					
					
					
				}
				
				break;
			
				
			case 5:
				
				Estagiario estagiarioOne = new Estagiario("Tiago", "ADS" , 20, 14589);
				Estagiario estagiarioTwo = new Estagiario("Lucas", "Eng.Software" , 33, 245872);
				Estagiario estagiarioThree= new Estagiario("Jose", "Adm" , 18, 34583);
				Estagiario estagiarioFour = new Estagiario("Camila", "BioMedicina" , 21, 45981);
				
				EmpresaJunior setorA = new EmpresaJunior("TI.1A");
				EmpresaJunior setorB = new EmpresaJunior("RH.2B");
				
				setorA.adionarEstagiario(estagiarioOne);
				setorA.adionarEstagiario(estagiarioTwo);
				setorB.adionarEstagiario(estagiarioThree);
				setorB.adionarEstagiario(estagiarioFour);
				
				System.out.println("Gestao de Estafiarios: ");
				System.out.println();
				System.out.println("(1) - Listar Estagiarios do Setor de TI.");
				System.out.println();
				System.out.println("(2) - Remover Estagiario do Programa de TI. ");
				System.out.println();
				System.out.println("(3) - Listar Estagiarios do Setor de RH. ");
				System.out.println();
				System.out.println("(4) - Remover Estagiario do Programa de RH. ");
				
				
				int selecionadorSeis = ler.nextInt();
				
				
				switch (selecionadorSeis) {
				
				case 1: 
					
					System.out.println("Estagiarios da Turma: " + setorA.getIdEmpresa());
					System.out.println("");
					for (Estagiario estagiario : setorA.getListadeEstagiarios()) {
						System.out.println("Nome: " + estagiario.getNome() + ". " + "Idade: " + estagiario.getIdade() + ". " + "Curso: " + estagiario.getNomeCurso() + ". ");
						System.out.println("");
					}
					
					continue;
					
				case 2: 
					
					setorA.removeEstagiario(estagiarioOne);
					System.out.println("Estagiario: "+ estagiarioOne.getNome()  +". Removido com Sucesso! COD:  " + estagiarioOne.getCodCadastro() + ".");
					System.out.println();
					System.out.println("Estagiarios da Turma: " + setorA.getIdEmpresa());
					for (Estagiario estagiario : setorA.getListadeEstagiarios()) {
						System.out.println("Nome: " + estagiario.getNome() + ". " + "Idade: " + estagiario.getIdade() + ". " + "Curso: " + estagiario.getNomeCurso() + ". ");
						System.out.println("");
					}
					
					continue;
					
				
				case 3:
					
					System.out.println("Estagiarios da Turma: " + setorB.getIdEmpresa());
					System.out.println("");
					for (Estagiario estagiario : setorB.getListadeEstagiarios()) {
						System.out.println("Nome: " + estagiario.getNome() + ". " + "Idade: " + estagiario.getIdade() + ". " + "Curso: " + estagiario.getNomeCurso() + ". ");
						System.out.println("");
					}
					
					continue;
					
				
				case 4:
					
					setorB.removeEstagiario(estagiarioThree);
					System.out.println("Estagiario: "+ estagiarioThree.getNome()  +". Removido com Sucesso! COD: " + estagiarioThree.getCodCadastro() + ".");
					System.out.println();
					System.out.println("Estagiarios da Turma: " + setorB.getIdEmpresa());
					for (Estagiario estagiario : setorB.getListadeEstagiarios()) {
						System.out.println("Nome: " + estagiario.getNome() + ". " + "Idade: " + estagiario.getIdade() + ". " + "Curso: " + estagiario.getNomeCurso() + ". ");
						System.out.println("");
					}
					
					continue;
					
				}
				
			
			case 6:
				
				final CompraMaquinas compraMaquinas = new CompraMaquinas(100000);
				calcularCompra(compraMaquinas);
				
				
					final ChequeComLimite cheqL = new ChequeComLimite();
					final ChequeSemFundo cheqS = new ChequeSemFundo();
					final SaldoEmpresa sal = new SaldoEmpresa();
					
					System.out.println();
					cheqL.setNext(cheqS);
					cheqS.setNext(sal);
					cheqL.calcularCompra(compraMaquinas);
					System.out.println();
					
				continue;

					
			case 7:
				
				if (tentarNovamente == true) 
				{
					System.exit(0);
					
				} else {

					continue;
				}
				
				
				
				

			
			
			
			}
			

			
			
		} while(tentarNovamente);
		
	}

	private static void calcularCompra(CompraMaquinas compraMaquinas) {
		// TODO Auto-generated method stub
		
	}

}



