package net.svw.shoppingbackend1.dao;

import java.util.List;

import net.svw.shoppingbackend1.dto.Category;

public interface CategoryDAO 
{
    List<Category> list();	
    Category get(int id);
	
}
