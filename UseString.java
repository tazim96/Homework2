package HW2;

public class UseString {
	public static void main(String[] args) {
		String Name = "Ronaldo";
		String Name2 = "Lebron";
		int Age = 100;
		String OperatingSys = "Windows 10";
		String City = "London";
		String Period = ".";
		
		
		System.out.println(Name2.contains("e"));
		System.out.println(Name.length());
		System.out.println(Name.toLowerCase());
		System.out.println(City.toUpperCase());
		System.out.println(Name.endsWith("W"));
		System.out.println(Name.charAt(3));
		System.out.println(City.contains("a"));
		System.out.println(Name.replaceFirst("R", "M"));
		System.out.println(Name.replaceAll("Ronaldo", "Lebron"));
		System.out.println(Name.lastIndexOf("n"));
		System.out.println(Name.equals(City));
		System.out.println(City.isEmpty());
		System.out.println(OperatingSys.replace("10", "20"));
		System.out.println(OperatingSys.split(""));
		System.out.println(Name.intern());
		System.out.println(Name2.hashCode());
		System.out.println(OperatingSys.codePointAt(5));
		System.out.println(Name2.endsWith(Period));
		System.out.println(Name.compareTo(OperatingSys));
		System.out.println(City.equalsIgnoreCase(Name2));
		System.out.println(Name.toString());
		System.out.println(Name2.contentEquals("City"));
		System.out.println(Name.subSequence(2,4));
		System.out.println(OperatingSys.indexOf("d"));
		System.out.println(Name.trim());
		System.out.println(City.getBytes());
		System.out.println(Name2.startsWith(""));
		System.out.println(Period.substring(0));
		System.out.println(OperatingSys.matches(City));
		System.out.println(Age);
	}
}