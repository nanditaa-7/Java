public class Item{
         public static void main (String things[]){
		 String itemNames[]={"Pen","Bottle","Book","Pencilcase"};
		 System.out.println("List of Items:"+itemNames[0]);
		 for(int index=0;index<itemNames.length;index++){
         System.out.println(itemNames[index]);
		 }
		 System.out.println("Reverse array element");
		 for(int index=itemNames.length-1;index>=0;index--){
	     System.out.println("Element is:"+itemNames[index]);
		 }
	}
}
		 