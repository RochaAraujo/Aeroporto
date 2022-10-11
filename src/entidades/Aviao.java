package entidades;


public class Aviao extends Aeronave {

	public Aviao(TorreControle torreControle) {
		super(torreControle);
	}

	private String pistaDecolagem;
	
	
	
	@Override
	public void enviarMensagem(String mensagem) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void pousar() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void decolar() {
		// TODO Auto-generated method stub
		
	}
	
	private TipoAviao tipoAviao;
	private Porte porte;
	private boolean pilotoAutomatico;
	private int quantidadeTurbinas;
	public TipoAviao getTipoAviao() {
		return tipoAviao;
	}
	public void setTipoAviao(TipoAviao tipoAviao) {
		this.tipoAviao = tipoAviao;
	}
	public Porte getPorte() {
		return porte;
	}
	public void setPorte(Porte porte) {
		this.porte = porte;
	}
	public boolean isPilotoAutomatico() {
		return pilotoAutomatico;
	}
	public void setPilotoAutomatico(boolean pilotoAutomatico) {
		this.pilotoAutomatico = pilotoAutomatico;
	}
	public int getQuantidadeTurbinas() {
		return quantidadeTurbinas;
	}
	public void setQuantidadeTurbinas(int quantidadeTurbinas) {
		this.quantidadeTurbinas = quantidadeTurbinas;
	}

	@Override
	public void autorizarPouso(String local) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void autorizarDecolagem(String local) {
		pistaDecolagem = local;
		System.out.println("Realizar Taxiamento até a " + pistaDecolagem);
	}

	@Override
	public TipoAeronave getTipoAeronave() {
		return TipoAeronave.AVIAO;
	}



	
	
}
