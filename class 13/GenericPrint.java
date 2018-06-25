public class GenericPrint {
  
  public static <T> void printArray(T[] Array) {
    for (T n : Array)
      System.out.printf("%s ", n);

    System.out.println();
  }

  public static void main(String args[]) {
    Integer[] intg = { 1, 2, 3, 4, 5, 6 };
    Double[] dg = { 1.1, 2.1, 3.1, 4.2,6.5, 5.6, 8.7 };
    Character[] cg = { 'N', 'I', 'K', 'H', 'I' ,'L'};

    System.out.println("Integer Array:");
    printArray(intg); 
    System.out.println("\nDouble contains:");
    printArray(dg); 
    System.out.println("\n character contains:");
    printArray(cg); 
  } 
}