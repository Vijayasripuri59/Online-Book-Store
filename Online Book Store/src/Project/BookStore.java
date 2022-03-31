package Project;
import java.util.*;
class Books {
          public String Title;
          public String Author;
          public int Quantity;
          public int Isbn;
          public double Price;
          public double Discount;
          public double Total;         
public Books() {
}

public Books(String title, String author, int quantity, int isbn, double price, double discount, double total)
		 {
	     super();
	      this.Title=title;
	      this.Author=author;
	      this.Quantity=quantity;
	      this.Isbn=isbn;
	      this.Price=price;
	      this.Discount=discount;
	      this.Total=total;
}

          public String getTitle() {
	      return Title;
}

          public String getAuthor() {
	      return Author;
}
          public int getQuantity() {
	      return Quantity;
}
          public int getIsbn() {
	      return Isbn;
}

          public double getPrice() {
	      return Price;
}

          public double getDiscount() {
	      return Discount;
}

          public double getTotal() {
	      return Total;
} 
}
public class BookStore {	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    double amount=0.0;
	        double sum=0.0;
	        int count=1;
	        List store=new ArrayList();
	        Scanner scan=new Scanner(System.in);
	        int menu=0;	        
	        System.out.println("*********WELCOME TO ONLINE BOOK STORE MANAGEMENT*********");
	        System.out.println();     
   	        System.out.println("******Create User ID******");
	        System.out.println();
	        System.out.println(" Enter User Id:");
	        String Email=scan.next();
	        
            System.out.println(" Enter Password:");
            String Password=scan.next();
            
            System.out.println(" Is Id Created For You:");
            String Yes=scan.next();
            
            if(Yes.equals("Yes")){
            	 System.out.println(" Id Is Successfully Created For You");  
            } 
            else
            {
                System.out.println(" Invalid User Id...Please Try Again!");
            }                
            System.out.println();
            System.out.println("*************PLEASE ENTER YOUR DETAILS***************");
            
            System.out.println(" Enter Your Name:");
            String name=scan.next();
            
            System.out.println(" Enter Your Phone No:");
            double Phoneno=scan.nextInt();
            
            System.out.println(" Enter Your City:");
            String city=scan.next();
            
            System.out.println(" Enter User Id:");
	        String id=scan.next();               
	        
            System.out.println();
	        System.out.println("1. Click To Buy The Book");
	        System.out.println("2. Click To Get The Receipt");
	        System.out.println("3. Click To Receive Payment");
	        System.out.println("4. Click To Exit");
	        boolean quit=false;
	        do {	            
	            System.out.print("Please Enter Your Choice:");
	            menu=scan.nextInt();
	            System.out.println("**************************************************************");	            
	            switch(menu) {
	               case 1:
	                    count++;
	                    System.out.println(" Book Title: ");
	                    String booktitle = scan.next();
	                    
	                    System.out.println(" Author: ");
	                    String auth = scan.next();
	                    		
	                    System.out.println(" Quantity: ");
	                    int quantity = scan.nextInt();
	                    
	                    System.out.println(" ISBN: ");
	                    int no = scan.nextInt();
	                    
	                    System.out.println(" Price: ");
	                    double p = scan.nextDouble();
	                    
	                    System.out.println(" Discount: ");
	                    double dis=scan.nextDouble();
	                    
	                    double di=100-dis;
	                    double total=(p*di)/100;
	                     store.add("\n  Book Name: "+booktitle);
	                     store.add("\n  Book Author: "+auth);
	                     store.add("\n  Quantity Of Book: "+quantity);
	                     store.add("\n  ISBN Number: "+no);
	                     store.add("\n  Book Price:  "+p);
	                     store.add("\n  Discount: "+dis);
	                     store.add("\n  Total Price: "+total);	                     
	                     System.out.println("\n");
	                     break;

	                case 2:
	                   System.out.println("*************PURVASHAA ONLINE BOOK STORE MANAGEMENT************");
	                   System.out.println(".........................YOUR RECEIPT..............................");
	                    do
	                    {
	                        System.out.println(store);
	                        System.out.println("*********THANK YOU**********");
	                        break;
	                    }
	                    while(true);
	                    break;
	                case 3:
	                    System.out.println(" Amount of Book is: ");
	                    amount=scan.nextDouble();
	                    double balance=amount-sum;
	                    System.out.println(" Customer Pays: " + balance);
	                    System.out.println(".....PAYMENT RECEIVED.....");	                  
	                    quit=true;
	                    break;
	                case 4:
	                	System.out.println(".....EXIT.....");	   
	                    quit=true;	                    
	                    break;	                    
	                    default:System.out.println(" Invalid Option!");
	            }
	        } while(!quit);
	}

}
