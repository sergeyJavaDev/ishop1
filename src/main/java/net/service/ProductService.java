package net.service;

import java.util.List;

import net.entity.Category;
import net.entity.Producer;
import net.entity.Product;

/**
 * 
 * @author devstudy
 * @see http://devstudy.net
 */
public interface ProductService {

	List<Product> listAllProducts(int page, int limit);
	
	List<Product> listProductsByCategory(String categoryUrl, int page, int limit);
	
	List<Category> listAllCategories();
	
	List<Producer> listAllProducers();
}
