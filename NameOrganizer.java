import java.util.*;
public class NameOrganizer {
  public static void main(String[] args){
    Scanner user_input = new Scanner(System.in); 
    String names[] = {"John", "Tyler", "Eric", "Ally", "Petra", "Elaine"};
    String firstname, lastname, fullname, answer;
    for (int i = 0; i < names.length; i++){
    System.out.println(i + ": " + names[i]);}
    System.out.println("This is a list of classmates");
    System.out.println("Would you like to alphabetize this list, yes or no?");
     answer = user_input.nextLine();
    if (answer.equalsIgnoreCase("Yes"))
     {System.out.println("The list has been alphabetized.");
     Arrays.sort(names);
      for (int i = 0; i < names.length; i++)
      {System.out.println(i + ": " + names[i]);}}
    else{
      System.out.println("The list will remain unalphabetized.");
      for (int i = 0; i < names.length; i++){
      System.out.println(i + ": " + names[i]);}
    }
  }
}