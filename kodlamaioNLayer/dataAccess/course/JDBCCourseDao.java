package kodlamaioNLayer.dataAccess.course;

import kodlamaioNLayer.entities.Course;

public class JDBCCourseDao implements CourseDao{

	@Override
	public void add(Course course) {
		System.out.println("Kurs bilgileri JDBC yöntemi ile kaydedildi : " + course.getName());		
	}

}
