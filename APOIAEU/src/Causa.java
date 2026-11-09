import java.util.ArrayList;
import java.util.Objects;

public class Causa {
	private String nome;
	private String descricao;
	private String emailReseponsavel;
	private ArrayList<String> EmailCurtidas;
	
	
	public Causa(String nome, String descricao, String emailRespondavel) {
		this.nome=nome;
		this.descricao=descricao;
		this.emailReseponsavel=emailRespondavel;
	}
	public String getDescricao() {
		return descricao;
	}
	public int getQuantidadeCutidas() {
		return EmailCurtidas.size();
	}
	public ArrayList<String> AgetEmailCurtidas(){
		return EmailCurtidas;
	}
	public void AdicionaEmailCurtido(String Email) {
		EmailCurtidas.add(Email);
	}
	
	@Override
	public String toString() {
		return "Causa [nome=" + nome + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Causa other = (Causa) obj;
		return Objects.equals(nome, other.nome);
	}
	
}
