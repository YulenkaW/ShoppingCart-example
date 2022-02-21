
package Project1ShoppingCartBag;

import java.util.Scanner;


public class Project1 {

    
    public static void main(String[] args) {
        Scanner keyboard = new Scanner (System.in);
        System.out.println("Do you want to use an array or Linked ObjectBag?");
        String bagtype = keyboard.nextLine();
        NewInterface<Item> bag;
        if (bagtype.equalsIgnoreCase("arrayBag") ){
           bag= new BagArray<Item>(); 
        }
        else 
        {
          bag = new BagLinkedProjects();  
        }
        ShoppingCard cart = new ShoppingCard (bag);
        
        String stop = "No";
        
        while (!stop.equalsIgnoreCase("yes")) {
            String option ="";
            while ( !option.equals("1") &&!option.equals("2") 
                    &&!option.equals("3") &&!option.equals("4")
                    &&!option.equals("5")){
            System.out.println ("Hello, what do you want to do? ");
            System.out.println ("1 - add item");
            System.out.println ("2 - remove random item");
            System.out.println ("3- remove spesific item");
            System.out.println ("4 -  get number of items in cart");
            System.out.println ("5 - adandon the cart");        
                    
             option = keyboard.nextLine();
            
            }
            
            if (option.equals("1")) {
                System.out.println ("Enter the item name");
                String name = keyboard.nextLine();
                System.out.println ("Enter the item price");
                double price = Double.parseDouble (keyboard.nextLine());
                Item item =new Item (name,price);
                cart.addItem (item);}
            else if  (option.equals("2")) {
                System.out.println ("Removed: " + cart.removeItem());
            }
            else if  (option.equals("3")) {
                System.out.println ("Enter the item name");
                String name = keyboard.nextLine();
                System.out.println ("Enter the item price");
                double price = Double.parseDouble (keyboard.nextLine());
                Item item =new Item (name,price);
                if (cart.removeItem(item)){
                 System.out.println ("Removed successfully");
                }
                else {
                        System.out.println ("Couldn`t find that item in the cart");
            }
            }
        else if (option.equals ("4")) {
                System.out.println (String.format ("You have %d items in your cart" , 
                        cart.getNumberOfItems()));
        }
        else if (option.equals ("5"))   {
            cart.abandoned();
            System.out.println ("You abandon your cart, woops");
        }         
           
              
  
           System.out.println("Do you want to checkout? (yes/no");
            stop = keyboard.nextLine ();
        }  
        System.out.println(cart.receipt());
    }
        
        
}
    

