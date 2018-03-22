package qsp;

class Sample{
	int x=12;
}
class Sample2 extends Sample{
	int x=25;
	void display(){
		int x=35;
		System.out.println(x);
		System.out.println(this.x);
		System.out.println(super.x);
	}
}
public class DemoOfThiskeyword {

	public static void main(String[] args) {
		Sample2 s=new Sample2();
		s.display();

	}

}
