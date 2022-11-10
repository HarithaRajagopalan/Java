package Foodbill;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class MainFun {
	Scanner s = new Scanner(System.in);
	ArrayList<Choices> mainObject = new ArrayList<Choices>();
	Choices1 refer;
	
	
	public static void main(String[] args) {

		
		
		System.out.println("\t\t\t MIMI*COM");
		System.out.println("\t\t\t Velacherry,Chennai,600048");
		   SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");    
           Date date = new Date(0);
           System.out.println("Date: "+formatter.format(date));
		System.out.println("\t\t_______________________________________");
		System.out.println();
		Map<String,Integer>item=new LinkedHashMap<>();
		item.put("Corn Pizza",001);
		item.put("Cheese Pizza",002);
		item.put("Mushroom Pizza",003);
		item.put("PeriPeriChicken Pizza",004);
		item.put("Panner Pizza",005);
		item.put("FriedChicken Pizza",006);
       
		item.put("Chicken Burger",007);
		item.put("Veg Burger",800);
		item.put("Cheese Burger",900);
		item.put("PeriPeriChicken Burger",010);
		item.put("Aloo Tikka Burger",011);
		item.put("Sausage Burger",012);
		
		item.put("Apple juice",013);
		item.put("Orange Juice",014);
		item.put("Grapes Juice",015);
		item.put("Pomegranate Juice",016);
		item.put("MuskMelon Juice",017);
		item.put("WaterMelon",180);	
		for(Map.Entry<String,Integer>f : item.entrySet())
        {
        System.out.println(f.getKey() + ":" + f.getValue());
        }
		
		MainFun objSel = new MainFun(); 
		while(true) {
			int choOpt = objSel.selctOption();
			objSel.callOption(choOpt);
		}		

	}
	
	public int selctOption() {
		
		
		int option=0;
			System.out.println("1.Insert \n 2.Search \n 3.Delete \n 4.ShowAll \n 5.Exit");
			System.out.println("\n Choose option \n");
			option = s.nextInt();
		return option;
	}
	public void callOption(int option) {
		switch(option) {
		case 1:
			refer=new Choices1();
			
			mainObject = refer.insertion(mainObject);
			 String id = null;  
             String productName = null;  
             int quantity = 0;  
             double price = 0.0;  
             double totalPrice = 0.0;  
             double overAllPrice = 0.0;  
             double cgst, sgst, subtotal=0.0, discount=0.0;  
             char choice = 0;  
             ArrayList<Choices1> product = new ArrayList<Choices1>();  
             do   
             {  
                 
                 System.out.println("Enter the product details: ");  
                 System.out.print("Product ID: ");  
                 id = s.nextLine();  
                 System.out.print("Product Name: ");  
                 productName = s.nextLine();  
                 System.out.print("Quantity: ");  
                 quantity = s.nextInt();  
                 System.out.print("Price: ");  
                 price = s.nextDouble();  
 
                 totalPrice = price * quantity;  
                
                 overAllPrice = overAllPrice + totalPrice;  
               
                 product.add( Choices1(id, productName, quantity, price, totalPrice));  
                
                 System.out.print("Want to add more items? (y or n): ");  
                 
                 choice = s.next().charAt(0);  
              
                 s.nextLine();  
             }  
         while (choice == 'y' || choice == 'Y'); 
         
       
             System.out.println("\n\t\t\t\t\t\t\t\t\t\tTotal Amount (Rs.) " +overAllPrice);
             discount = overAllPrice*2/100;  
             System.out.println("\n\t\t\t\t\t\t\t\t\t\t    Discount (Rs.) " +discount);  
             subtotal = overAllPrice-discount;   
             System.out.println("\n\t\t\t\t\t\t\t\t\t\t          Subtotal "+subtotal);  
             sgst=overAllPrice*12/100;  
             System.out.println("\n\t\t\t\t\t\t\t\t\t\t          SGST (%) "+sgst);  
             cgst=overAllPrice*12/100;  
             System.out.println("\n\t\t\t\t\t\t\t\t\t\t          CGST (%) "+cgst);    
             System.out.println("\n\t\t\t\t\t\t\t\t\t\t     Invoice Total " +(subtotal+cgst+sgst));  
             System.out.println("\t\t\t\t----------------Thank You for Shopping!!-----------------");  
             System.out.println("\t\t\t\t                     Visit Again");  

			break;
			
		case 2:
			refer = new Choices1();
			refer.search(mainObject);
						break;
			
		case 3:
			refer = new Choices1();
			refer.delete(mainObject);
			break;
			
		case 4:
			refer = new Choices1();
			refer.viewall(mainObject);
			break;
			
		case 5:
			refer = new Choices1();
			refer.exit();
			
			break;
			
			default:
				System.out.println("Please choose the correct opition");
				break;
		}
	}
	
}