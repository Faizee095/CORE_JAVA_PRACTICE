// OPA 11deC

import java.util.Scanner;

class Item{
    int itemId;
    String itemName;
    String itemType;
    double itemPrice;
    Item(int itemId, String itemName, String itemType, double itemPrice){
        this.itemId = itemId;
        this.itemName = itemName;
        this.itemType = itemType;
        this.itemPrice = itemPrice;
    }
    int getItemId(){
        return itemId;
    }
    String getItemName(){
        return itemName;
    }
    String getItemType(){
        return itemType;
    }
    double getItemPrice(){
        return itemPrice;
    }
}

public class Solution1{
    public static void main(String[] args){
        int itemId;
        String itemName;
        String itemType;
        double itemPrice;
        Item[] item = new Item[4];
        Scanner s = new Scanner(System.in);
        for(int i=0;i<item.length;i++){
            itemId = s.nextInt();s.nextLine();
            itemName = s.nextLine();
            itemType = s.nextLine();
            itemPrice = s.nextDouble();
            item[i] = new Item(itemId, itemName, itemType, itemPrice);
        }
        s.nextLine();
        String newItemType = s.nextLine();
        String newItemName = s.nextLine();
        s.close();

        int avgItemPrice = findAvgItemPriceByTypes(item, newItemType);
        Item[] items = searchItemByName(item, newItemName);

        if(avgItemPrice > 0)
            System.out.println(avgItemPrice);
        else
            System.out.println("There are no items with given type");

        if(items == null)
            System.out.println("There are no items with the given name");
        else{
            for(int i=0;i<items.length;i++){
                System.out.println(items[i].getItemId());
            }
        }
    }
    public static int findAvgItemPriceByTypes(Item[] item, String itemType){
        int avgPrice = 0, count = 0;
        double sum = 0;
        for(int i=0;i<item.length;i++){
            if(itemType.equalsIgnoreCase(item[i].getItemType())) {
                sum += item[i].getItemPrice();
                count++;
            }
        }
        avgPrice = (int)(sum/count);
        return avgPrice;
    }
    public static Item[] searchItemByName(Item[] item, String itemName){
        int count = 0;
        for(int i=0;i<item.length;i++){
            if(itemName.equalsIgnoreCase(item[i].getItemName()))
                count++;
        }
        if(count == 0) return null;
        Item[] items = new Item[count];
        count = 0;
        for(int i=0;i<item.length;i++){
            if(itemName.equalsIgnoreCase(item[i].getItemName())){
                items[count++] = item[i];
            }
        }
        for(int i=0;i<items.length;i++){
            for(int j=i+1;j<items.length;j++){
                if(items[i].getItemId() >= items[j].getItemId()){
                    Item temp = items[i];
                    items[i] = items[j];
                    items[j] = temp;
                }
            }
        }
        return items;
    }
}



// INPUT
// 1002
// Gulabjam
// Sweet
// 800
// 1001
// Gulabjam
// Sweet
// 700
// 1003
// Kalakandi
// Sweet
// 1100
// 1004
// MoongDal
// Hot
// 750
// Sweet
// Gulabjam

// OUTPUT

// 866
// 1001
// 1002