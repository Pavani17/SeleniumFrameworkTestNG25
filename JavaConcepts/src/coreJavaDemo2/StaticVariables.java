package coreJavaDemo2;

public class StaticVariables {

	String name;
	static String city;
	static String surname="kakileti";
	static int i=0;

	public StaticVariables(String name, String city) {
		this.name = name;
		this.city = city;
		i++;
		System.out.println(i);

	}

	public void getSurname() {
		System.out.println(name +surname);
	}
	
	public static void getCity()
	{
		System.out.println(city);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticVariables var = new StaticVariables("pavani", "amalapuram");
		StaticVariables var1 = new StaticVariables("satya", "amp");
		var.getSurname();
		var1.getSurname();
		StaticVariables.getCity(); //calling static method
		StaticVariables.i=67; //assigning value to static variable
		var.name="pavani satyavathi"; //assiging value to non static variable
	}

}
