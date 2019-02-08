package HW2;

public class Laptop {
static int YearModel;
static int RandomAccessMemory;
String Brand;
String Color;
String OperatingSystem;
int Price;


public static void YearModel() {
	YearModel = 2019;
	
}
public static void RandomAccessMemory() {
	RandomAccessMemory = 16;
}


public Laptop(String bd, String cl) {
	Brand = bd;
	Color = cl;
	
	
}

public Laptop(String os, int pr) {
	OperatingSystem = os;
	Price = pr;
}



}