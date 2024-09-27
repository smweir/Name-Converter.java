import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NameConverter {
   public static void main (String[] args)  {

      Scanner scnr = new Scanner(System.in);
      String userInput = scnr.nextLine(); 
   
      String[] userInputArray = userInput.split(" ");
      List<String> userInputList = new ArrayList<>(Arrays.asList(userInputArray));
     
      
      if (userInputList.size() == 2) {
         String firstName = userInputArray[0];
            char firstInitial = firstName.charAt(0);
              String lastName = userInputArray[1];
              System.out.print(lastName + ", " + firstInitial + ".");
           
}        
      if (userInputList.size() == 3) {
         String firstName = userInputArray[0];
            char firstInitial = firstName.charAt(0);
               String middleName = userInputArray[1];
                  char middleInitial = middleName.charAt(0);
                  String lastName = userInputArray[2];
                  System.out.print(lastName + ", " + firstInitial + "." + middleInitial + ".");
      
} 
}
}