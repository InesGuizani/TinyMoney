package tn.esprit.spring.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.spring.Services.Implementation.ProductServicesImpl;
import tn.esprit.spring.entities.Product;

@RestController
public class ProductController  {
	@Autowired
	private ProductServicesImpl psi ;
	@GetMapping("/getAllProduct")
	public List<Product>getAllProducts(){
		List<Product>products= psi.getAllProducts();
		return products;
	}
	@PostMapping("/AddProduct")
	public Product Addproduct(@RequestBody Product p){
		Product pr= psi.Add(p);
		
		return pr;
	}
	@PutMapping("/PutProduct")
	public Product Updateproduct(@RequestBody Product p){
		Product pr=psi.Update(p);
		return pr;
	}
	@PutMapping("/modifierProduct/{idProd}")
	public Product modifier(@PathVariable("idProd") Long idProd , @RequestBody Product p){
		return psi.modifier(idProd, p);
	}
	@DeleteMapping("/deleteproduct/{idProd}")
	public void deleteproduct(@PathVariable("idProd")Long idProd){
		psi.Delete(idProd);
		
	}
	@GetMapping("getProduct/{idProd}")
	public Product getproductbyid (@PathVariable("idProd")Long idProd){
		return psi.GetProduct(idProd);
	}
	
	
	

}
