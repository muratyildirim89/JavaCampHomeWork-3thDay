package kodlamaioNLayer.dataAccess.category;

import kodlamaioNLayer.entities.Category;

public class JDBCCategoryDao implements CategoryDao {

	@Override
	public void add(Category category) {
		System.out.println("Kategori bilgileri JDBC yöntemi ile kaydedildi. : " + category.getName());		
	}

}
