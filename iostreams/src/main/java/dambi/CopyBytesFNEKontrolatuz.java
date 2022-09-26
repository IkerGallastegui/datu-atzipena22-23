package dambi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class CopyBytesFNEKontrolatuz {
    public static void main(String[] args)  {

        BufferedReader br = null;

        try {
            br = new BufferedReader(new FileReader("xanadu.txt"));
            String c = null;

            while ((c = br.readLine()) != null) {
                System.out.println(c);
            }
        } catch (FileNotFoundException f) {
            System.out.println("Ez da fitxategia aurkitu.");
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } 
        
        finally {
                try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException ioe) {
                ioe.printStackTrace();
            }
        }
    }
}
