
public class Produto {

	private int id;
	private String nome;
	private CategoriaEnum categoria;
	private double preco;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public CategoriaEnum getCategoria() {
		return categoria;
	}
	public void setCategoria(CategoriaEnum categoria) {
		this.categoria = categoria;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public Produto(int id, String nome, CategoriaEnum categoria, double preco) {
		this.id = id;
		this.nome = nome;
		this.categoria = categoria;
		this.preco = preco;
	}
}
