package bancoMobiliario;

import java.util.ArrayList;

public class sisJogo {
	
	ArrayList<Jogador> jogadores = new ArrayList<Jogador>();
	//ArrayList<Propriedades> propriedades = new ArrayList<Propriedades>();
	//ArrayList<SorteOuReves> cartas = new ArrayList<SorteOuReves>();
	
	public void gravaJogador(Jogador o) {
		jogadores.add(o);
	}
	
	public void removeJogador(Jogador o) {
		jogadores.remove(o);
	}
	
	public ArrayList<Jogador> getJogadores(){
		return jogadores;
	}
	
	/**
	 * public ArrayList<Propriedades> generateBoard(){
	 * }
	 */
	
	
}
