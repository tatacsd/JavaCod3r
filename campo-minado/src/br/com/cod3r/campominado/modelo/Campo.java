package br.com.cod3r.campominado.modelo;

import java.util.ArrayList;
import java.util.List;

public class Campo {
	// Data field
	private final int linha;
	private final int coluna;
	
	// the default is false
	private boolean aberto;
	private boolean minado;
	private boolean marcado;
	
	// Auto relacionamento (1 to n)
	private List<Campo> vizinhos = new ArrayList<>();
	
	// Constructor
	protected Campo(int linha, int coluna) { // package visibility
		this.linha = linha;
		this.coluna = coluna;
	}
	
	
	// Methods
	boolean adicionarVizinho(Campo vizinho) {
		boolean linhaDifferent = this.linha != vizinho.linha;
		boolean colunaDifferent = this.coluna != vizinho.linha;
		boolean diagonal = linhaDifferent && colunaDifferent;
		
		// A diferenca de distancia na linha
		int deltaLinha = Math.abs(this.linha - vizinho.linha);
		// A diferenca de distancia na coluna
		int deltaColuna = Math.abs(this.coluna - vizinho.coluna);
		// Somatoria das diferencas de linha e coluna
		int deltaGeral = deltaColuna + deltaLinha;
		
		// Se o vizinho tiver em cima, embaixo, do lado esquerdo e direito
		if(deltaGeral == 1 && !diagonal) {
			vizinhos.add(vizinho);
			return true;
		} else if(deltaGeral == 2 && diagonal) {
			vizinhos.add(vizinho);
			return true;
		} else {
			return false;
		}
		
		
		
	}

}
