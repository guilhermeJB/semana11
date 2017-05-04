import java.util.Random;

/**
 * Done
 * @author Guilherme
 *
 */
public class Sequencia {
	
	Cores[] seq;
	
	public Sequencia(){
		Random rand = new Random();
		Cores[] colors = Cores.values();
		Cores[] result = new Cores[4];
		for (int i = 0; i < result.length; i++) {
			result[i] = colors[rand.nextInt(colors.length)];
		}
		this.seq = result;
	}
	
	
	public Sequencia(Cores[] sequencia){
		this.seq = sequencia;
	}

	//@ 0 <= i <= 3
	public void mudaCor(int i, Cores cor){
		seq[i] = cor;
	}
	
	@Override
	public String toString(){
		StringBuilder sb1 = new StringBuilder();
		for (int i = 0; i < seq.length; i++) {
			sb1.append("Cor " + (i + 1) +": " +  seq[i] + "\n");
		}
		return sb1.toString();
	}
}
