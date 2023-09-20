package iphone;

public class Iphone implements ReprodutorMusicalInterface, TelefoneInterface, NavegadorInterface{

	@Override
	public void exibirPagina() {
		System.out.println("Exibindo a página");
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Adicionando uma nova aba");		
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Atualizando a página");		
	}

	@Override
	public void ligar() {
		System.out.println("Iniciando a ligação");		
	}

	@Override
	public void atender() {
		System.out.println("Atendendo a ligação");		
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("Iniciando correio por voz");		
	}

	@Override
	public void tocar() {
		System.out.println("Tocando a musica");		
	}

	@Override
	public void pausar() {
		System.out.println("Pausando a musica");		
	}

	@Override
	public void selecionarMusica() {
		System.out.println("Selecionando uma música");		
	}

}
