package composite;

import java.util.ArrayList;

public class EmpresaJunior {
	
	private String idEmpresa;
	private ArrayList<Estagiario> listadeEstagiarios;
	
	public EmpresaJunior(String idEmpresa) {
		
		this.idEmpresa = idEmpresa;
		listadeEstagiarios = new ArrayList<>();
	}
	
	public void adionarEstagiario(Estagiario estagiarioNovo) {
		listadeEstagiarios.add(estagiarioNovo);
	}
	
	public void removeEstagiario(Estagiario estagiarioRemovido) {
		listadeEstagiarios.remove(estagiarioRemovido);
	}
	
	public ArrayList<Estagiario> getListadeEstagiarios(){
		return listadeEstagiarios;
	}

	public String getIdEmpresa() {
		return idEmpresa;
	}
	
	
	
	

}
