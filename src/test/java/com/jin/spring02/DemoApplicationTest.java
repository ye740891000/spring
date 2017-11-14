package com.jin.spring02;

		import com.jin.spring02.Model.Student;
		import com.jin.spring02.repository.StudentCrudRepository;
		import com.jin.spring02.repository.StudentRepository;
		import org.junit.Assert;
		import org.junit.Test;
		import org.junit.runner.RunWith;
		import org.springframework.beans.factory.annotation.Autowired;
		import org.springframework.boot.test.context.SpringBootTest;
		import org.springframework.test.context.junit4.SpringRunner;

		import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTest {
	//注入刚才定义的接口
	@Autowired
	private StudentRepository studentRepository;

	@Autowired
	private StudentCrudRepository studentCrudRepository;

	@Test
	public void selectNameByAge() {
		List<Student> students = studentRepository.selectNameByAge("foo", 22);
		for (Student student : students) {
			System.out.println("id:" + student.getId()
					+ " , name:" + student.getName()
					+ " ,age:" + student.getAge());
		}
	}

	@Test
	public void testAddStudent() {
		//添加操作
		Student stu = new Student("foo1","km",22);
		studentCrudRepository.save(stu);
	}

	@Test
	public void testUpdateStudent() {
		/*修改的操作*/
		Student stu = studentCrudRepository.findOne(1);
		stu.setName("bar1");
		studentCrudRepository.save(stu);
	}

	@Test
	public void testDelete() {
		//删除操作
		studentCrudRepository.delete(1);
	}

	@Test
	public void testCount() {
		//取数量操作
		Assert.assertEquals(3,studentCrudRepository.count());
		Assert.assertEquals(2,studentCrudRepository.countByAge(22));
	}

}





