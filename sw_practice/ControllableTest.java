package ch08;

public class ControllableTest {
//���ٽ� 
	public static void main(String[] args) {
		String who="����"; // �������� 
		 Controllable tv= (x,y) -> {
			 if(y)
				 System.out.println(who+x+"������ �Ҵ�.");
			 else
				 System.out.println(who+ x+ "������ ����.");
		 };
		// TODO Auto-generated method stub
       
    	   
   
       tv.power("TV",true);
       tv.power("TV",false);
       tv.repair();
       Controllable.reset();
       
	}

}
