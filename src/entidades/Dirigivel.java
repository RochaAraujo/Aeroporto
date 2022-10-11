package entidades;

public class Dirigivel extends Aeronave {

		public Dirigivel(TorreControle torreControle) {
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
		return TipoAeronave.DIRIGIVEL;
	}

}
