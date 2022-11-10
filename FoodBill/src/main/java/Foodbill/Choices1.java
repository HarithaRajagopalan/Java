package Foodbill;

import java.util.ArrayList;
import java.util.Scanner;

public class Choices1 {

	Scanner input = new Scanner(System.in);
	Choices referObj;
	
	public Choices1() {
	}

	public Choices1(String id, String productName, int quantity, double price, double totalPrice) {
		// TODO Auto-generated constructor stub
	}

	public ArrayList<Choices> insertion(ArrayList<Choices> mainObject){
		
		System.out.println("Please eneter how many input u wish to enter");
		int num = input.nextInt();
		
		for(int i=0;i<num;i++) {
			referObj = new Choices();
			System.out.println("Enter ProductName");
			referObj.pname = input.next();
			System.out.println("Enter id");
			referObj.id = input.nextInt(); 
			System.out.println("Enter Quantity");
			referObj. qt= input.nextInt();
			System.out.println("Enter Price");
			referObj.price= input.nextDouble();
			System.out.println("Enter TotalPrice");
			referObj.totalPrice = input.nextDouble();
			
			mainObject.add(referObj);
		}	
		return mainObject;
}
	public int search(ArrayList<Choices> mainObject) {
		int i;
		System.out.println("please enter id need to search:\n ");
		int id = input.nextInt();
		for(i=0;i<mainObject.size();i++) {
			Choices eachRefer = mainObject.get(i);
			if(id==eachRefer.id) {
				System.out.println("Name: "+eachRefer.pname+" \n ID: "+eachRefer.id+" \n Quantity"+eachRefer.qt+" \n Price: "+referObj.price+" \n TotalPrice: "+referObj.totalPrice);
				break;
			}
		}
		return i;
	}
	public void exit() {
		System.exit(0);
     }
	public int delete(ArrayList<Choices>mainObject) {
		System.out.println("Enter the id");
		int id = input.nextInt();
		for(int j=0;j<mainObject.size();j++) {
			Choices eachRefer = mainObject.get(j);
			if(id==eachRefer.id) {
				System.out.println("Name: "+eachRefer.pname+" \n ID: "+eachRefer.id+" \n Quantity"+eachRefer.qt+" \n Price: "+referObj.price+" \n TotalPrice: "+referObj.totalPrice);
			mainObject.remove(j);
			}
			
			}
		return id;
	}
	public int viewall(ArrayList<Choices>mainObject) {
		for(int k=0;k<mainObject.size();k++) {
			Choices eachRefer = mainObject.get(k);
			System.out.println("Name: "+eachRefer.pname+" \n ID: "+eachRefer.id+" \n Quantity"+eachRefer.qt+" \n Price: "+referObj.price+" \n TotalPrice: "+referObj.totalPrice);
			
		}
		return 0;
		
	}

}