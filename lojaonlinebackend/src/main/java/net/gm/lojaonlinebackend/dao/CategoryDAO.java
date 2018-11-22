package net.gm.lojaonlinebackend.dao;

import java.util.List;

import net.gm.lojaonlinebackend.dto.Category;

public interface CategoryDAO {
	
	List<Category> list();
	Category get(int id);

}
