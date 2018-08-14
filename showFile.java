import java.io.*;
class ShowFile {
  public static void main(String args[])
  {
    int i;
    FileInputStream fin
    
    try {
      fin = new FileInputStream("s1.txt");
    } catch(FileNotFoundException e) {
      System.out.println("Cannot Open File");
    }
+
    try {
      do {
        i = fin.read();
        if(i != -1) System.out.print((char) i);
      } while(i != -1);
    } catch(IOException e) {
      System.out.println("Error Reading File");
   }
    // Close the file.
    try {
      fin.close();
    } catch(IOException e) {
        System.out.println("Error Closing File");
    }
  }
}

