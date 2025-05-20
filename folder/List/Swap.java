import java.util.ArrayList;

public static void swap(ArrayList<T> list) //T represents all types
{
  for (T element : list)
  {
        // Process each element
        System.out.println(element);
  }

}

public static swap()
{
    


}

public <T> void processList(ArrayList<T> list) {
    for (T element : list) {
        // Process each element
        System.out.println(element);
    }
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
