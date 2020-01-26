import java.util.ArrayList;

public class ArrayListExampleBreshears
{
   public static void main(String[] args)
   {
       ArrayList<String> names = new ArrayList<String>();
       names.add("Andy"); //invoking add()
       names.add("Angela");
       names.add("Dwight");
       names.add("Erin");
       names.add("Jim");
       names.add("Michael");
       names.add("Pam");
       names.add("Toby");
       System.out.println("Current names on list: "); //invoking get() to print
       for(int i = 0; i < names.size(); i++){
         System.out.println(names.get(i));
       }
       System.out.println("Size of list: "+names.size()); //invoking size()
       System.out.println("Last name in list: "+(names.get(names.size()-1))); //invoking size() to grab last element
       names.set(0, "Andy Bernard"); //invoking set()
       System.out.println("Confirmation of list change: "+names);
       names.add(4, "Kelly"); //addition to the list after specific element
       System.out.println("Confirmation of list addition: "+names);
       System.out.println("Enchanced for loop: ");
       for(String str : names){ //enchanced for loop
         System.out.println(str);
       }
       ArrayList<String> names2 = new ArrayList<String>(names); //new ArrayList using elements from names
       names.remove(0); //invoking remove()
       System.out.println("Confirmation that first element in first list was removed: ");
       System.out.println(names);
       System.out.println(names2);
   }
}
