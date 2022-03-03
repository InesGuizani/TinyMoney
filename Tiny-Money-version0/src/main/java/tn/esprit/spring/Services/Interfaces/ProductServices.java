package tn.esprit.spring.Services.Interfaces;

import java.util.List;

import tn.esprit.spring.entities.Product;

public interface ProductServices {
	List<Product> getAllProducts();
	public Product Add(Product p);
	public Product Update(Product p);
	public void Delete(Long idProd);
	public Product GetProduct(Long idProd);
}
