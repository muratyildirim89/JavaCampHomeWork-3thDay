package kodlamaioNLayer.dataAccess.instructor;

import kodlamaioNLayer.entities.Instructor;

public class JDBCInstructorDao implements InstructorDao{

	@Override
	public void add(Instructor instructor) {
		System.out.println("Eğitmen bilgileri JBDC yöntemi ile kaydedildi : " + instructor.getName() );		
	}

}
