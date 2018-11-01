package com.gmail.slartua;


public class Main {
    public static void main(String[] args) {
        while(true){
           Collections myCol = new Collections(View.inputCollectionSize(),
                    View.inputMinValue(),
                    View.inputMaxValue());
           if(myCol.getMinValue()< myCol.getMaxValue()&&
                   myCol.getCollectionSize() <= myCol.getMaxValue() - myCol.getMinValue() + 1){
               myCol.generateUniqueListandSet();
               View.printMessage("List\n");
               System.out.println(myCol.getList());
               View.printMessage("\nSet\n");
               System.out.println(myCol.getSet());
               break;
           }else View.printMessage("Collection can't exist, repeat input");
        }
    }
}
