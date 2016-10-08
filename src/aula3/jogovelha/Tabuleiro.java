package aula3.jogovelha;

public class Tabuleiro {

	public static final int MAX_COLUNAS = 3;
	public static final int MAX_LINHAS = 3;

	private char[][] jogadas;

	public Tabuleiro() {
		this.jogadas = new char[MAX_LINHAS][MAX_COLUNAS];
	}

	public void marcarPosicao(int linha, int coluna, char simbolo) {
		char aux;
		this.jogadas[linha][coluna] = simbolo;
		
		aux=this.obterVencedor();
		if(aux!=0)
			System.out.println("O vencedor é: "+ aux);
			
	}

	public void mostrarTabuleiro() {
		for (int i = 0; i < jogadas.length; i++) {
			System.out.print("|");
			for (int j = 0; j < jogadas[i].length; j++) {
				char simbolo = (jogadas[i][j] == 0) ? ' ' : jogadas[i][j];
				System.out.print(simbolo);
				System.out.print("|");
			}
			System.out.println();
		}
	}

	public char obterVencedor() {
		char a[]=new char [3];
		// TODO: Verificar ganhador na linha
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++)
			  	a[j]=this.jogadas[i][j];
			if(a[0]==a[1]&&a[1]==a[2])
				return a[1];
		}
		// TODO: Verificar ganhador na coluna
		for(int j=0;j<3;j++){
		for(int i=0;i<3;i++)
			
			  	a[i]=this.jogadas[i][j];
			if(a[0]==a[1]&&a[1]==a[2])
				return a[1];
		}
		// TODO: Verificar ganhador nas diagonais
			if(this.jogadas[0][0]==this.jogadas[1][1]&&this.jogadas[2][2]==this.jogadas[1][1])
						return jogadas[1][1];
			else if(this.jogadas[2][0]==this.jogadas[1][1]&&this.jogadas[0][2]==this.jogadas[1][1])
				return jogadas[1][1];
			
		// TODO Auto-generated method stub
		return 0;
	}
}
