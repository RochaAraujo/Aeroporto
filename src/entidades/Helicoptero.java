package entidades;

public class Helicoptero extends Aeronave {
	
	public Helicoptero(TorreControle torreControle) {
		super(torreControle);
	}
	
	private int quantidadeHelices;
	private int potenciaPropulsaoVertical;
	
	@Override
	public void autorizarPouso(String local) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void autorizarDecolagem(String local) {
		// TODO Auto-generated method stub
		
	}
	
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
	@Override
	public TipoAeronave getTipoAeronave() {
		return TipoAeronave.HELICOPTERO;
	}
	
}
