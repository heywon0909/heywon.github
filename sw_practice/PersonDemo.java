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
		System.out.printf("사람 [이름 : %s, 나이 : %d] \n", name, age);
	
	}
	
	
}


class Student extends Person{

	int ID;
	
	int getID() {
		return ID;
	}
	
	Student(String name, int age, int ID){
		super(name,age);	// 부모 메서드의 Person(String name, int age)가 출력된다.
		this.ID = ID;
	}
	
	void show() {
		System.out.printf("학생 [이름 : %s, 나이 : %d, 학번 : %d] \n", name, age, ID);
	
	}
	
}

class ForeignStudent extends Student{
	
	String contry;
	
	// 접근자
	String getCountry() {
		return contry;
	}
	
	// 생성자
	ForeignStudent(String name, int age , int ID, String world) {
		super(name, age, ID);
		this.contry = world;
	}


	void show() {
		System.out.printf("외국학생 [이름 : %s, 나이 : %d, 학번 : %d , 국적 : %s] \n", name, age, ID, contry);
	
	}
	
}


public class PersonDemo {

	public static void main(String[] args) {
		
		Person[] arr = {new Person("길동이" , 22) , new Student("황진이", 23 , 100)
				, new ForeignStudent("Amy", 30 , 200 , "U.S.A")};
		
		
		for(Person a : arr)
			a.show();	

	}

}
