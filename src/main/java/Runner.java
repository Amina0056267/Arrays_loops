import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Runner {


    public static void main(String[] args) {

//        SCOTTISH ISLANDS
        List<String> scottishIslands = new ArrayList<String>(Arrays.asList("Jura","Mull","Skye","Arran","Tresco"));
        String scottishIsland = "Tiree";



        scottishIslands.add("Jura");
        scottishIslands.add("Mull");
        scottishIslands.add("Skye");
        scottishIslands.add("Arran");
        scottishIslands.add("Tresco");

        System.out.println(scottishIslands);


//        1. Add "Coll" to the end of the list
        scottishIslands.add("Coll");


//        2. Add "Tiree" to the start of the list

        Collections.reverse(scottishIslands);
        scottishIslands.add(scottishIsland);
        Collections.reverse(scottishIslands);

        System.out.println(scottishIslands);


//        3. Add "Islay" after "Jura" and before "Mull"

        System.out.println(scottishIslands);
        String firstScottishIsland = scottishIslands.get(1);
        System.out.println();

        scottishIslands.get(1);
        scottishIslands.set(1,"Islay");

//        4. Print out the index position of "Skye"

        String[] Skye = scottishIslands.toArray(new String[2]);
        System.out.println(Skye);


//        5. Remove "Tresco" from the list by name
        scottishIslands.remove ("Tresco");
        System.out.println(scottishIslands);


//        6. Remove "Arran" from the list by index
        scottishIslands.remove(3);
        System.out.println(scottishIslands);

//        7. Print the number of islands in your arraylist

        int islandNumber = scottishIslands.toArray().length;
        System.out.println(islandNumber);

//        8. Sort the list alphabetically
        Collections.sort(scottishIslands);
        System.out.println(scottishIslands);

//        9. Print out all the islands using a for loop



//        NUMBERS
        List<Integer> numbers = new ArrayList<>();
        Collections.addAll(numbers, 1, 1, 4, 2, 7, 1, 6, 15, 13, 99, 7);

        System.out.println("numbers: " + numbers);

//        1. Print out a list of the even integers
        int[] arrayNum = {1, 1, 4, 2, 7, 1, 6, 15, 13, 99, 7};
        List<Integer> even = new ArrayList<>();
        for (int i = 0; i < arrayNum.length; i++){
            if(arrayNum[i] % 2 ==0){
                even.add(arrayNum[i]);
            }
            System.out.println(even);
        }

//        2. Print the difference between the largest and smallest value

             int min = numbers.get(0);
             int max = numbers.get(0);

             int n = numbers.size();
             for (int i = 1; i < n; i++) {
                 if (numbers.get(i) < min) {
                     min = numbers.get(i);
                 }
                 System.out.println("Maximum is 99");


                 }

        for (int i = 1; i < n; i++){
            if (numbers.get(i) > max) {
                max = numbers.get(i);
            }
            System.out.println("Minimum is 1");
             }





//        3. Print True if the list contains a 1 next to a 1 somewhere.
//        4. Print the sum of the numbers,
//        5. Print the sum of the numbers...
//           ...except the number 13 is unlucky, so it does not count...
//           ...and numbers that come immediately after a 13 also do not count.
//
//          So [7, 13, 2] would have sum of 9.

    }



}
