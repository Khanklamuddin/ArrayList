import java.util.ArrayList;

public class Classroom{
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Boolean> list2 = new ArrayList<>();
        ArrayList<String> list3 = new ArrayList<>();
// add element in the end 
        list.add(1); //time complexity = O(1)
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        // 2nd method add
        list.add(1,9); // O(n) time comp

        System.out.println(list);

        //get operation - O(1)

        // int element = list.get(2);
        // System.out.println(element);

        //remove element - O(n)

        // list.remove(2) ;
        // System.out.println(list);

        //set element at index - O(n)

        list.set(2, 10);
        System.out.println(list);

        // contains element
        // System.out.println(list.contains(1));
        // System.out.println(list.contains(11));
        
        // Size of Arraylist

        System.out.println(list.size());

        // print the arraylist
        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i)+ " ");
        }

       



        
    }
}