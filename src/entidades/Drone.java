package entidades;

public class Drone extends Aeronave {

	
	public Drone(TorreControle torreControle) {
		super(torreControle);
	}

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
		return TipoAeronave.DRONE;
	}

}
