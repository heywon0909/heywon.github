package ch08;

public interface Controllable {
      default void repair() {
    	  System.out.println("���� ���Ϳ��� �����ؾ� �Ѵ�.");
    	  
      }
      static void reset() {
    	  System.out.println("���� �ʱ�ȭ �� �� �ִ�.");
      }
      void power(String name, boolean onOff);
      
}
