package listaCandidatos;

import java.util.ArrayList;
import java.util.List;

import listaCandidatos.Banco1;
import listaCandidatos.Candidato;

public class Banco1 {
	private static List<Candidato> listaDeCandidatos = new ArrayList<>();
	public void adiciona(Candidato c1) {
		listaDeCandidatos.add(c1);
		
		
	}
	public List<Candidato>getCandidato(){
		return Banco1.listaDeCandidatos;
	}
}
