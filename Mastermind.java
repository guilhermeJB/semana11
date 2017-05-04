
public class Mastermind {
	
	Sequencia codigo;
	int numJogadas;

	public Mastermind(){
		//cria uma seq aleatoria
		Sequencia aleatoria = new Sequencia();
	}
	
	public Mastermind(Sequencia seq){
		this.codigo = seq;
		this.numJogadas = 0;
	}
	
	public boolean fim(){
		return numJogadas == 1000;
	}

	public int quantas() {
		return numJogadas;
	}
}
