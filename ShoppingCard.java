
package Project1ShoppingCartBag;


public class ShoppingCard {
    
    NewInterface<Item> bag;
    
    public ShoppingCard (NewInterface<Item> bag){
        this.bag = bag;
    }
    public String receipt(){
        StringBuilder builder = new StringBuilder();
        Object[] result = bag.toArray();
        for (Object object : result )  {
            Item item = (Item) object;
            builder.append(item.toString());
            builder.append("\n");
            
        }
        builder.append(String.format ("Total: %.2d", getTotalCost()));
        
        return builder.toString();
    }
    
    public double getTotalCost () {
        double total = 0;
        Object[] result = bag.toArray();
         for (Object object : result )  {
            Item item = (Item) object;
            total+=item.getPrice ();
        
    }
    return total;
    }
    
    public void addItem (Item item) {
        bag.add (item);
    }
    
    public Item removeItem () {
        return bag.remove();
    }
    
    public boolean removeItem (Item item) {
        return bag.remove (item);
        
    }
    
    public int getNumberOfItems(){
        return bag.getCurrentSize();
    }
    
    public void abandoned (){
        bag.clear();
    }
    
    
}
