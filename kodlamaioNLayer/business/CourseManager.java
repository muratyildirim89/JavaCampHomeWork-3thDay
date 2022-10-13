package kodlamaioNLayer.business;

import kodlamaioNLayer.core.logging.Logger;
import kodlamaioNLayer.dataAccess.course.CourseDao;
import kodlamaioNLayer.entities.Course;

public class CourseManager {
	private CourseDao courseDao;
	private Logger[] loggers;
	private Course[] courses;
	
	public CourseManager(CourseDao courseDao,Logger[] loggers) {
		this.courseDao=courseDao;
		this.loggers=loggers;
	};
	
	public void add(Course course) throws Exception {
		//Business Rules
		for(Course courseData : courses) {
			if(courseData.getName()==course.getName()) {
				throw new Exception("Kurs İsmi Kullanılmış");
			}else if(courseData.getPrice()<0){
				throw new Exception("Kurs ücreti negatif olamaz");		
			}
		}
		courseDao.add(course);
		for (Logger logger:loggers) {
			logger.log(course.getName());
		}
	}
}