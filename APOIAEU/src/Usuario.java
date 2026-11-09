import java.util.ArrayList;
import java.util.Objects;

public class Usuario {
	private String email;
	private String senha;
	private ArrayList<String> nomeCausasCurtidas;
	
	
	public Usuario(String email, String senha) {
		this.email=email;
		this.senha=senha;
	}
	
	public boolean senhaCorreta(String senhaTentada) {
		return senha.equals(senhaTentada);
	}

	
	@Override
	public String toString() {
		return "Usuario [email=" + email + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(email);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		return Objects.equals(email, other.email);
	}
	
}
