import java.util.List;
import java.util.Optional;
import java.util.stream.*;

public class ManipulacaoProdutos {

	public static void main(String[] args) {
		
		Produto p1 = new Produto(17, "Wisk", CategoriaEnum.BEBIDA, 13.00);
		Produto p2 = new Produto(12, "Pao de Queijo", CategoriaEnum.PADARIA, 10.00);
		Produto p3 = new Produto(16, "Pao", CategoriaEnum.PADARIA, 5.00);
		Produto p4 = new Produto(11, "Mussarela", CategoriaEnum.FRIOS, 25.00);
		Produto p5 = new Produto(13, "Presunto", CategoriaEnum.FRIOS, 60.00);
		
		List<Produto> prods = List.of(p1, p2, p3, p4, p5);
		
		List<Produto> maisQCinquenta = prods.stream().filter(e -> e.getPreco() 
				> 50).collect(Collectors.toList());
		
		if(!maisQCinquenta.isEmpty()) {
			System.out.println(maisQCinquenta.get(0).getNome());
		}
		
		List<Produto> bebidas = prods.stream().filter(e -> e.getCategoria() 
				== CategoriaEnum.BEBIDA).collect(Collectors.toList());
		
		if(!bebidas.isEmpty()) {
			for (Produto produto : bebidas) {
				System.out.println(produto.getNome()); 
			}
		}
		
		List<Produto> prodsPadaria = prods.stream().filter(e -> e.getCategoria() 
				== CategoriaEnum.PADARIA).collect(Collectors.toList());

		if(!prodsPadaria.isEmpty()) {
			System.out.println(prodsPadaria.size());
		}
	}
}
