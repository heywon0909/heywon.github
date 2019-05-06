package ch08;

public class ControllableTest {
//람다식 
	public static void main(String[] args) {
		String who="나는"; // 지역변수 
		 Controllable tv= (x,y) -> {
			 if(y)
				 System.out.println(who+x+"전원을 켠다.");
			 else
				 System.out.println(who+ x+ "전원을 끈다.");
		 };
		// TODO Auto-generated method stub
       
    	   
   
       tv.power("TV",true);
       tv.power("TV",false);
       tv.repair();
       Controllable.reset();
       
	}

}
