package set.convidado;

import java.util.Objects;

public class Convidado {
	private String nome;
	
	private int codigoConvite;

	public Convidado(String nome, int codigoConvite) {
		this.nome = nome;
		this.codigoConvite = codigoConvite;
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getCodigoConvite() {
		return codigoConvite;
		
	}
	
	public int hashCode() {
		return Objects.hash(codigoConvite);
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Convidado other = (Convidado) obj;
		return codigoConvite == other.codigoConvite;
	}

	public String toString() {
		return "Convidado [nome=" + nome + 
				", codigoConvite=" + codigoConvite + "]";
	}
	
	
}
