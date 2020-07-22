package JAVA;

class Class22OverridingTest extends Class22Overriding{
	public void over() {
		System.out.println("world");
	}

 static class test  {

	public static void main(String []args) {
		Class22Overriding obj = new Class22Overriding();
		obj.over();
	}
}
}
