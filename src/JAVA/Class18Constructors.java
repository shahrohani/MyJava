package JAVA;

 class Class18Constructors {

	 String model;
	 String size;
	 String company;

	Class18Constructors(String model, String size, String company) {
		this.model = model;
		this.size = size;
		this.company = company;
	}

	void display() {
		System.out.println(model + " " + size + " " + company + " ");

	}

	 static  class cons {
		public static void  main(String []args) {
			Class18Constructors obj = new Class18Constructors("black", "medsize", "bmw");
			obj.display();

		}
	}
}