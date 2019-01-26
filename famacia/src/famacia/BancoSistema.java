package famacia;

import java.util.ArrayList;
import java.util.List;



public class BancoSistema {

	private static List<Medicamento> listaMedicamento = new ArrayList<>();
	
	public void adiciona(Medicamento m1) {
		listaMedicamento.add(m1);
	}
	
	public Medicamento getMedicamento(String mid) {
	
		for(Medicamento m : listaMedicamento) {
			if(m.getNome().equals(mid)) {
				return m;
			}
		}
		
		return null;
	}

}
