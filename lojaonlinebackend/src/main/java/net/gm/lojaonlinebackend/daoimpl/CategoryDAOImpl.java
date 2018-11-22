package net.gm.lojaonlinebackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import net.gm.lojaonlinebackend.dao.CategoryDAO;
import net.gm.lojaonlinebackend.dto.Category;


@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {

	private static List<Category> categories = new ArrayList<Category>();

	static {

		Category category = new Category();
		// Adding first category
		category.setId(1);
		category.setName("Television");
		category.setDescription("This is the description for TV!");
		category.setImageURL("CAT_1.png");

		// Adding Category to list
		categories.add(category);

		// Adding second category
		category = new Category();

		category.setId(2);
		category.setName("Mobile");
		category.setDescription("This is the description for mobile!");
		category.setImageURL("CAT_2.png");

		// Adding Category to list
		categories.add(category);

		// Adding third category
		category = new Category();

		category.setId(3);
		category.setName("Laptop");
		category.setDescription("This is the description for Laptop!");
		category.setImageURL("CAT_3.png");

		// Adding Category to list
		categories.add(category);

	}

	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
		return categories;
	}

	@Override
	public Category get(int id) {
		//Enhanced for loop
	
		for(Category category:categories){
			
			if(category.getId()== id) return category;
		}
		return null;
		
	}

}
