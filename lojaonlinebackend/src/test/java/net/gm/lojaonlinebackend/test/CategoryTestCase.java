package net.gm.lojaonlinebackend.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import net.gm.lojaonlinebackend.dao.CategoryDAO;
import net.gm.lojaonlinebackend.dto.Category;

public class CategoryTestCase {
	
	private static AnnotationConfigApplicationContext context;
	
	private static CategoryDAO categoryDAO;
	
	private Category category;
	
	@BeforeClass
	public static void init(){
		
		context = new AnnotationConfigApplicationContext();
		context.scan("net.gm.lojaonlinebackend");
		context.refresh();
		categoryDAO = (CategoryDAO) context.getBean("categoryDAO");
		
	}
/*	@Test
	public void testAddCategory(){
		
		category = new Category();
		
		category.setName("Television");
		category.setDescription("This is the description for TV!");
		category.setImageURL("CAT_1.png");
		
		assertEquals("Successfully add category inside the table!", true,categoryDAO.add(category));
		
	}*/
	
	@Test
	public void GetCategory(){
		
		category = categoryDAO.get(3);
		assertEquals("Successfully fetched a single category from the table!", "Television",category.getName());
	}
	
	
/*	@Test
	public void GetCategory(){
		
		category = categoryDAO.get(3);
		category.setName("TV");
		assertEquals("Successfully fetched a single category from the table!", "Television",category.getName());
	}*/
	
/*	@Test
	public void deleteCategory(){
		
		category = categoryDAO.get(3);
		
		assertEquals("Successfully deleted a single category from the table!", true,categoryDAO.delete(category));
	}*/
	
/*	@Test
	public void ListCategory(){

		assertEquals("Successfully fetched the list of category from the table!",3,categoryDAO.list().size());
	}*/
	
	/*@Test
	public void testCRUDCategory(){
		
		category = new Category();
		
		category.setName("Laptop");
		category.setDescription("This is the description for TV!");
		category.setImageURL("CAT_1.png");
		
		assertEquals("Successfully add category inside the table!", true,categoryDAO.add(category));
		
		category = new Category();
		
		category.setName("Television");
		category.setDescription("This is the description for TV!");
		category.setImageURL("CAT_2.png");
		
		assertEquals("Successfully add category inside the table!", true,categoryDAO.add(category));
		
		//Fetching and updating The category
		category = categoryDAO.get(2);
		category.setName("TV");
		assertEquals("Successfully fetched a single category from the table!", "Television",category.getName());
		
		//deleting category
		
		assertEquals("Successfully deleted a single category from the table!", true,categoryDAO.delete(category));
		
		//Fetching the list
		assertEquals("Successfully fetched the list of category from the table!",1,categoryDAO.list().size());
	}*/
	

}
