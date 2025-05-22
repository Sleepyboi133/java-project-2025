import java.util.ArrayList;
import java.util.Collections;

// public class List { //rename
//     public static void main(String[] args) {
//         ArrayList<String> list = new ArrayList<>();
//         list.add("A");
//         list.add("B");
//         list.add("C");
//         list.add("D");

//         System.out.println("Original list: " + list);

//         // Swap elements at index 1 and 3
//         swap(list, 1, 3);

//         System.out.println("List after swapping: " + list);
//     }
// }

public static void swap(ArrayList<T> list, int indexA, int indexB)
{
  Collections.swap(list, indexA, indexB);
  //place holder
    //make sure take T type
}

public static void print(ArrayList<T> list) // ArrayList print
{
  String result = "{";
  for (T element : list)
  {
      result += element + ", ";
  }
  System.out.println(result + "]");
}

public static void print(T[] list) // array print
{
  String result = "{";
  for (T element : list)
  {
      result += element + ", ";
  }
  System.out.println(result + "]");
}

public static void print(T[][] list) // 2D array print
{ 
  String result;
  for (T row : list)
  {
    result = "{";
    for (T element : row)
    {
        result += element + ", ";
    }
    System.out.println(result + "]");
  }
}
