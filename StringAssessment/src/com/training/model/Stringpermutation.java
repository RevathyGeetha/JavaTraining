package com.training.model;

public class Stringpermutation {
	private String string = "cat";

	public Stringpermutation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Stringpermutation(String string) {
		super();
		this.string = string;
	}

	public String getString() {
		return string;
	}

	public void setString(String string) {
		this.string = string;
	}

    public void UsingReplace(String str1,String str2 ) {
	System.out.println(str1.replace("cat", "cta"));
	
   }
//   public void UsingReplace(String str1,String str2 ) {
//	System.out.println(str1.replace("cat", "act"));
//}

	
	
	

}
