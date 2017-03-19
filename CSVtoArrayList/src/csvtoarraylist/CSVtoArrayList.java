

package csvtoarraylist;


/**
 *
 * @author Yash Kotadia
 */
import java.util.*;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class CSVtoArrayList {
	public static void main(String[] args) {
	
            Scanner in = new Scanner(System.in);
            System.out.println("Enter CSV file with full location Path :");
            String name = in.next();    
            
            System.out.println("Enter Product Name:");
            String PRname = in.next();    
           
		BufferedReader crunchifyBuffer = null;
		
		try {
			String crunchifyLine;
			crunchifyBuffer = new BufferedReader(new FileReader(name));
			
			// How to read file in java line by line?
			while ((crunchifyLine = crunchifyBuffer.readLine()) != null) {
				//System.out.println("Raw CSV data: " + crunchifyLine);
				//System.out.println("Converted ArrayList data: " + crunchifyCSVtoArrayList(crunchifyLine) + "\n");
                                crunchifyCSVtoArrayList(crunchifyLine,PRname);
                        }
                        
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (crunchifyBuffer != null) crunchifyBuffer.close();
			} catch (IOException crunchifyException) {
				crunchifyException.printStackTrace();
			}
		}         
	}
	        
	// Utility which converts CSV to ArrayList using Split Operation
	public static ArrayList<String> crunchifyCSVtoArrayList(String crunchifyCSV, String ProductName) {
		ArrayList<String> crunchifyResult = new ArrayList<String>();
		if (crunchifyCSV != null) {
			String[] splitData = crunchifyCSV.split("\\s*,\\s*");
                        
			for (int i = 0; i < splitData.length; i++) {
				if (!(splitData[i] == null) || !(splitData[i].length() == 0)) {
					crunchifyResult.add(splitData[i].trim());           
				}
                                       
                                if(i>=2)
                                {
                                    String array[] = new String[crunchifyResult.size()];              
                                    
                                    for(int j =0;j<crunchifyResult.size();j++)
                                    {
                                        array[j] = crunchifyResult.get(j);
                                        if(ProductName.equals(array[j]))
                                        {
                                            System.out.println("Shop Id is " + array[0]);
                                            float result = Float.parseFloat(array[1]);   
                                            System.out.println(result);   
                                        }
                                    }
                                    //Displaying Array elements
                                    /*for(String k: array)
                                    {
                                    System.out.println(k);
                                    }*/
                        }
                        
		}
		return crunchifyResult ;
	}
            return null;
	     
        
        }
        
}
