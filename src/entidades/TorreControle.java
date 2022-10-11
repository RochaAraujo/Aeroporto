package entidades;

import interfaces.Comunicacao;

public class TorreControle {
	
	private String aeroporto;
	private boolean ativa;
	
	public TorreControle(String aeroporto, boolean ativa) {
		this.aeroporto = aeroporto;
		this.ativa = ativa;
	}

	public void pedirRequisicaoDecolagem(Comunicacao objetoComunicacao) {
		String tipoLocalRetorno = "";
		switch (objetoComunicacao.getTipoAeronave()) {
			case AVIAO:
				tipoLocalRetorno = "Pista ";
				break;
			case DIRIGIVEL:
				tipoLocalRetorno = "Plataforma ";
				break;
			case DRONE:
				tipoLocalRetorno = "Campo ";
				break;
			case HELICOPTERO:
				tipoLocalRetorno = "Heliponto ";
				break;
		}
		objetoComunicacao.autorizarDecolagem(tipoLocalRetorno + "40");
	}

	public String getAeroporto() {
		return aeroporto;
	}

	public void setAeroporto(String aeroporto) {
		this.aeroporto = aeroporto;
	}

	public boolean isAtiva() {
		return ativa;
	}

	public void setAtiva(boolean ativa) {
		this.ativa = ativa;
	}
	
	

}
