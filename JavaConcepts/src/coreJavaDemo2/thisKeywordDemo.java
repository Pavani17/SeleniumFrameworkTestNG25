package coreJavaDemo2;

public class thisKeywordDemo {
	int a = 100;

	public void getData() {
		int a = 10;
		int b = a + this.a;
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		thisKeywordDemo d = new thisKeywordDemo();
		d.getData();
	}

}
