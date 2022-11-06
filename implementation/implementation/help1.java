import java.io.File; 
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner; 

public class help1 {
    public static int countParantheses(String str){
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '{' || str.charAt(i) == '}' || str.charAt(i) == '(' || str.charAt(i) == ')' || str.charAt(i) == '[' || str.charAt(i) == ']') {
                count++;
            }
        }
        return count;    
    }

  public static void main(String[] args) throws IOException {
    int count = 0;
    try {
      File myObj = new File("arp.txt");
      File myobj1=new File("art.txt");
      Scanner myReader = new Scanner(myObj);
      FileOutputStream out=new FileOutputStream(myobj1);
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        System.out.println(data);
        count += countParantheses(data);
      }
      System.out.println("The no of parenthesis in file: "+count);
      out.write(count);
      myReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }}

}