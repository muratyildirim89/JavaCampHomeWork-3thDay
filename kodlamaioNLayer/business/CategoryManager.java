package kodlamaioNLayer.business;

import kodlamaioNLayer.core.logging.Logger;
import kodlamaioNLayer.dataAccess.category.CategoryDao;
import kodlamaioNLayer.entities.Category;

public class CategoryManager {
	private CategoryDao categoryDao;
	private Logger[] loggers;
	private Category[] categories;
	
	public CategoryManager(CategoryDao categoryDao,Logger[] loggers) {
		this.categoryDao=categoryDao;
		this.loggers=loggers;
	}
	
	public void add(Category category) throws Exception {
		//Business Rules
		for(Category categoryData : categories) {
			if(categoryData.getName()==category.getName()) {
				throw new Exception("Kategori Adı Zaten Kullanılmış");
			}
		}
		categoryDao.add(category);
		for(Logger logger:loggers) {
			logger.log(category.getName());
		}
	}
}