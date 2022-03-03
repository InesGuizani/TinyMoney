package tn.esprit.spring.Services.Implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.Services.Interfaces.ProductServices;
import tn.esprit.spring.entities.Product;
import tn.esprit.spring.entities.Repository.ProductRepository;
@Service
public class ProductServicesImpl implements ProductServices{
	
	@Autowired
	private ProductRepository productrepository ;
	@Override
	public List<Product> getAllProducts() {
		List<Product>products=productrepository.findAll();
		return products;
	}
	@Override
	public Product Add(Product p) {
		Product pr = productrepository.save(p);
		return pr;
		
	}
	@Override
	public Product Update(Product p) {
		Product pr=productrepository.save(p);
		return pr;
	}
	
	public Product modifier(Long idProd , Product p){
		Product pr = productrepository.findById(idProd).get();
		System.out.println(idProd);
		pr.setNomproduct(p.getNomproduct());
		pr.setDescriptionproduct(p.getDescriptionproduct());
		pr.setDateproduct(p.getDateproduct());
		productrepository.save(pr);
		return pr;
		
	}
	
	
		
		
	
	@Override
	public void Delete(Long idProd) {
		productrepository.deleteById(idProd);
		
	}
	@Override
	public Product GetProduct(Long idProd) {
	return	productrepository.findById(idProd).get();
	}


}
