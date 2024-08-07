package aulahj;

public class ObjetoPessoa {
	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa();
		Pessoa pessoa2 = new Pessoa();
		//OBJETO
		pessoa1.setNome("Tom Cruise");
		pessoa1.setIdade(60);
		pessoa1.setEndereco("Rua tal");
		pessoa1.setProfissao("Ator");
		pessoa1.setCpf("8888888888");
		pessoa1.setRg("xxxxx");
		//OBJETO 2
		pessoa2.setNome("Messi");
		pessoa2.setIdade(35);
		pessoa2.setEndereco("Rua tal");
		pessoa2.setProfissao("Jogador de futebol");
		pessoa2.setCpf("99999999999");
		pessoa2.setRg("xxxxx");
		//Chamando o método get() para apresentar os objetos
		System.out.println("----Objeto----");
		System.out.println(pessoa1.getNome());
		System.out.println(pessoa1.getIdade());
		System.out.println(pessoa1.getEndereco());
		System.out.println(pessoa1.getProfissao());
		System.out.println(pessoa1.getCpf());
		System.out.println(pessoa1.getrg());
		System.out.println("----Objeto 2----");
		System.out.println(pessoa2.getNome());
		System.out.println(pessoa2.getIdade());
		System.out.println(pessoa2.getEndereco());
		System.out.println(pessoa2.getProfissao());
		System.out.println(pessoa2.getCpf());
		System.out.println(pessoa2.getrg());
	}
}