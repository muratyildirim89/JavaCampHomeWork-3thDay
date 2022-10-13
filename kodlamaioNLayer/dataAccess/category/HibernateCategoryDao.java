package kodlamaioNLayer.dataAccess.category;

import kodlamaioNLayer.entities.Category;

public class HibernateCategoryDao implements CategoryDao {

	@Override
	public void add(Category category) {
		System.out.println("Kategori bilgileri Hibernate yöntemi ile kaydedildi : " + category.getName());		
	}

}
