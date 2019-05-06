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
      System.out.println("2마리"+name+"가 날아간다.");
   }
   public void count() {
      System.out.println(name+"2마리 있다.");
   }
}
class Tree implements Countable
{
   String name;
   Tree(String name){this.name= name;}
   void ripen() {
      System.out.println(name+"에 열매가 잘 익었다.");
   }
   public void count() {
      System.out.println(name+"5그루 있다.");
      }
}
public class CountableTest {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      Countable[] m= { new Bird("뻐꾸기"), new Bird("독수리"), new Tree("사과나무"),new Tree("밤나무")};
      
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