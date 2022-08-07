
public class Pessoa {

	private Integer id;
	private String nome;
	private Integer idade;

	// Construtor sem par�metros
	public Pessoa() {
	}

	// Construtor com todos os par�metros
	public Pessoa(Integer id, String nome, Integer idade) {
		this.id = id;
		this.nome = nome;
		this.idade = idade;
	}

	// Sobrescrever o m�todo toString
	@Override
	public String toString() {
		return "Pessoa [id=" + id + ", nome=" + nome + ", idade=" + idade + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

}