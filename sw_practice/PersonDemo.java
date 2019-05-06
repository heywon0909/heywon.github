package number2;

class Person{
	
	String name;
	int age;
	
	String getName() {
		return name;
	}
	
	int getAge() {
		return age;
	}
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	void show() {
		System.out.printf("��� [�̸� : %s, ���� : %d] \n", name, age);
	
	}
	
	
}


class Student extends Person{

	int ID;
	
	int getID() {
		return ID;
	}
	
	Student(String name, int age, int ID){
		super(name,age);	// �θ� �޼����� Person(String name, int age)�� ��µȴ�.
		this.ID = ID;
	}
	
	void show() {
		System.out.printf("�л� [�̸� : %s, ���� : %d, �й� : %d] \n", name, age, ID);
	
	}
	
}

class ForeignStudent extends Student{
	
	String contry;
	
	// ������
	String getCountry() {
		return contry;
	}
	
	// ������
	ForeignStudent(String name, int age , int ID, String world) {
		super(name, age, ID);
		this.contry = world;
	}


	void show() {
		System.out.printf("�ܱ��л� [�̸� : %s, ���� : %d, �й� : %d , ���� : %s] \n", name, age, ID, contry);
	
	}
	
}


public class PersonDemo {

	public static void main(String[] args) {
		
		Person[] arr = {new Person("�浿��" , 22) , new Student("Ȳ����", 23 , 100)
				, new ForeignStudent("Amy", 30 , 200 , "U.S.A")};
		
		
		for(Person a : arr)
			a.show();	

	}

}
