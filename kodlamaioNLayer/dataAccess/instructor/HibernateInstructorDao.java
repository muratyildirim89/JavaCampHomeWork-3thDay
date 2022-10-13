package kodlamaioNLayer.dataAccess.instructor;

import kodlamaioNLayer.entities.Instructor;

public class HibernateInstructorDao implements InstructorDao{

	@Override
	public void add(Instructor instructor) {
		System.out.println("Eğitmen bilgileri Hibernate yöntemi kaydedildi. : " + instructor.getName());		
	}

}
