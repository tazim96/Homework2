package HW2;

public class TestLaptop {
	public static void main(String[] args) {
		Laptop MyLaptop = new Laptop("HP", "Black");
		Laptop.YearModel();
		Laptop.RandomAccessMemory();
		Laptop MyLaptop2 = new Laptop("Windows 10",2000);
		
		
System.out.println("Brand: " + MyLaptop.Brand + " " + "Color: " + MyLaptop.Color);		
System.out.println("Year Model: " + Laptop.YearModel);
System.out.println("Your RAM is: " + Laptop.RandomAccessMemory + "GB");
System.out.println("Operating System: " + MyLaptop2.OperatingSystem + " " + "Price: $" + MyLaptop2.Price);

	}
}
;

