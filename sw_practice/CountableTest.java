package ch07;

interface Countable{
   void count();
   
}
class Bird implements Countable
{
   String name;
   Bird(String name){
      this.name= name;
   }
   
   void fly() {
      System.out.println("2����"+name+"�� ���ư���.");
   }
   public void count() {
      System.out.println(name+"2���� �ִ�.");
   }
}
class Tree implements Countable
{
   String name;
   Tree(String name){this.name= name;}
   void ripen() {
      System.out.println(name+"�� ���Ű� �� �;���.");
   }
   public void count() {
      System.out.println(name+"5�׷� �ִ�.");
      }
}
public class CountableTest {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      Countable[] m= { new Bird("���ٱ�"), new Bird("������"), new Tree("�������"),new Tree("�㳪��")};
      
      for(Countable e: m)
         e.count();
      
      for(int i=0; i<m.length;i++)
      {
         if(m[i] instanceof Bird)
            ((Bird)m[i]).fly();
         else 
            ((Tree)m[i]).ripen();
      }
   }
   

}