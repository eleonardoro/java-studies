package string.format;

import java.util.List;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {

		List<Produto> produtos = List.of(
				new Produto(1, "Copo", 3.5),
				new Produto(2, "Caneta", 0.9),
				new Produto(3, "Jogo de Panelas", 130.5)
				);
		
		for (Produto p : produtos) {
			//System.out.format("ID = %d%n", p.getId());
			//System.out.format("ID = %03d%n", p.getId());
			//System.out.format("%d\t%s\t%f%n",  p.getId(), p.getNome(), p.getPreco());
			//System.out.format("%04d\t%-20s\t%.2f%n",  p.getId(), p.getNome(), p.getPreco());
			//System.out.format(new Locale("en", "US"), "%04d\t%-20s\t%f%n",  p.getId(), p.getNome(), p.getPreco());
			System.out.format(new Locale("pt", "BR"), "%04d\t%-20s\t%f%n",  p.getId(), p.getNome(), p.getPreco());
		}
		
		double preco = 1356.7;
		
		String precoStr = String.format("%.2f", preco);
		System.out.println(precoStr);
	}

}
