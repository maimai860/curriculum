package check;

import constants.Constants;

public class Check {

	 private static String firstName = "Maiha";
	 private static String lastName = "Yada"; 
	
	 public static void main(String[] args) {
	 
	 System.out.println("printNameメソッド →" + getName(firstName, lastName));
	 
	 Pet a = new Pet(Constants.CHECK_CLASS_JAVA, Constants.CHECK_CLASS_HOGE);
	 a.introduce(); 
	 
	 RobotPet b = new RobotPet(Constants.CHECK_CLASS_R2D2, Constants.CHECK_CLASS_LUKE);
	 b.introduce();
	}

	private static String getName(String firstName, String lastName) {
    String printName = firstName + lastName;
    return printName; 
    
	}
	
	

}

