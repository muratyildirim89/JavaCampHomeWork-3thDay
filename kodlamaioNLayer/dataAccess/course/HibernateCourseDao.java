package kodlamaioNLayer.dataAccess.course;

import kodlamaioNLayer.entities.Course;

public class HibernateCourseDao implements CourseDao {

	@Override
	public void add(Course course) {
		System.out.println("Kurs bilgileri Hibernate yöntemi ile kaydedildi : " + course.getName());		
	}

}
