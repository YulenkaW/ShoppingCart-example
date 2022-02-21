/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project1ShoppingCartBag;

class Item {
    private String name;
    private double price;

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    @Override
    public String toString()
    {
        return name+ "-$"+ price;
    }
    
    @Override
    public boolean equals(Object other){
        if (other.getClass() !=getClass() ){
            return false;
        }
        Item otherItem = (Item)other;
        return name.equalsIgnoreCase(otherItem.name)&&price == otherItem.price;
        }
    
    
}
