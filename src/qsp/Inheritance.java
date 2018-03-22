package qsp;

 class Demo1{
	 int x=10;
	 void test(){
		 System.out.println("Hi");
	 }
 }
 
 class Demo2 {
	 int y=10;
	 void disp(){
		 System.out.println("Hello");
	 }
 }
 class Demo3 extends Demo2{
	 int z=10;
	 void view(){
		 System.out.println("Bye");
	 }
 }
 
public class Inheritance {

	public static void main(String[] args) {
		/*Demo2 d=new Demo2();
		d.test();
		d.disp();*/
		Demo3 d1=new Demo3();
		d1.disp();
		

	}

}
