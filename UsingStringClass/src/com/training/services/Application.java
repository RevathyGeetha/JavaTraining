package com.training.services;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		StringService service = new StringService();
		String city ="CHENNAI";
		System.out.println(String.format("%s", city) );
		System.out.println(String.format("%3$.4f %2$.3f %1$.2f", 100.456,234.5,4648,36476,67,899));
		int key=14;
		switch (key) {
		case 1:
			service.stringEquals("ram", "ram");
			break;
		case 2:
			service.stringObjEquals();
		case 3:
			service.usiongtrim(" ramesh ");
			break;
		case 4:
			service.lengthOfString("  ramesh  ");
			
			break;
		case 5:
			service.usingSubString("dhavaputhalvan");
			break;
		case 6:
			service.usingCharAtAndIndexOf("ram@abc.com");
			break;
		case 7:
			service.usingReplace("abc@ram.com", "welcome to chennai");
			break;
		case 8:
			service.usingConcat("revathy", "dhavaputhalvan");
			break;
		case 9:
			service.usingCompareTo("C", "B");
			break;
		case 10:
			service.usingStringFormat("ajith", 98.99);
			break;
		case 11:
			service.usingStringFormat(98);
			break;
		case 12:
			service.usingStringFormat(16, 16);
			break;
		case 13:
			service.usingStringFormat("rev", "rev");
			break;
		case 14:
			service.usingStringFormat(444L);
			break;
		default:
			
			break;
		}

	}

}
