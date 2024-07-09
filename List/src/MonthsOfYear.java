//Create an ArrayList that can store only Strings.
//Create a printAll method that will print all the elements of the ArrayList using an Iterator.

import java.util.ArrayList;
public class MonthsOfYear {
	public static void main(String[] args) {
		ArrayList<String> months = new ArrayList<>();
		
		months.add("January");
		months.add("February");
		months.add("March");
		months.add("April");
		months.add("May");
		months.add("June");
		months.add("July");
		months.add("August");
		months.add("September");
		months.add("October");
		months.add("November");
		months.add("December");
		
		System.out.println("Months of the year:");
		for(String month : months) {
			System.out.println(month);
		}

}}
