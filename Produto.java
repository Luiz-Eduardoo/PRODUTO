// criei a classe Pessoa
class Pessoa {
	// Caracteristicas necessarias da Pessoa
	 String nome;
	 String sobrenome;
	 int altura; // altura em centímetros
	 String datanasc;
	 // metodo construtor para montar as caracteristicas do produto
	 Pessoa(String nome,String sobrenome, int altura, String datanasc){
		 this.nome = nome; // o this. serve para direcionar o metodo construtor para a variavel
		 this.sobrenome = sobrenome;
		 this.altura = altura;
		 this.datanasc = datanasc;
	 }
	// método para organizar e poder mostrar para o usuario a descrição da Pessoa
	 String descricao() {
		 // o ".replace" foi usado para tirar todos os espaços em branco do nome e sobrenome
		 // o ".toLowerCase" foi usado para substitutir todas as letras maíusculas do nome e sobrenome  para transforma-las em minusculas desse jeito fica no formato correto de um email
		 String nomeSemEspaço = this.nome.replace(" ", "").toLowerCase(); 
		 // mesma coisa que fiz no primeiro string do método descricao
	     String sobrenomeSemEspaço = this.sobrenome.replace(" ", "").toLowerCase();
	     // return para mostrar no final o email formatado da forma correta
		 return nomeSemEspaço + "." + sobrenomeSemEspaço + "@dominio.com";	 
	 }
 }
// Criei a classe do produto
public class Produto {
	// caracteristicas do produto
	 String nome;
	 String marca;
	 int custo;
	 int venda;
	 
	 // método construtor para montar as caracteristicas do produto
	 Produto(String nome, String marca, int custo, int venda){
		 	this.nome = nome;// o this. serve para direcionar o metodo construtor para a variavel
			this.marca = marca;
			this.custo = custo;
			this.venda = venda;
	 }
	 //fiz um metodo para calcular o lucro do produto
	 int callucro() {
		 return venda - custo;
	 }

	 // método para organizar e poder mostrar para o usuario a descrição do produto
	 String descricao() {
			return
					"nome: " + this.nome + "\n" +
					"marca: " + this.marca + "\n" +
					"custo: " + this.custo + "\n" +
					"Valor do produto: " + this.venda + "\n" +
					"Lucro do produto: " + callucro();
	 }
	public static void main(String[] args) {
		// criei um novo objeto produto e coloquei as caracteristicas do produto
		Produto p1 = new Produto("Air force", "Nike", 200, 800);
		// criei um novo objeto Pessoa e coloquei as caracteristicas dela
		Pessoa pe1 = new Pessoa("Luiz Eduardo", "Vieira de Paula", 175, "23/07/2005");
		
		// chamei o método que criei para organizar a descrição do produto e mostrar no final
		System.out.println(p1.descricao());
		// chamei o método que criei para organizar a descrição da Pessoa e mostrar no final
		System.out.println(pe1.descricao());
	}
}
