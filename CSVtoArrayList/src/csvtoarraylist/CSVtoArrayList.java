

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
           
		BufferedReader Buffer = null;
		
		try {
			String Line;
			Buffer = new BufferedReader(new FileReader(name));
			
			// read file line by line
			while ((Line = Buffer.readLine()) != null) {
				//System.out.println("Raw CSV data: " + Line);
				//System.out.println("Converted ArrayList data: " + CSVtoArrayList(Line) + "\n");
                                CSVtoArrayList(Line,PRname);
                        }
						
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (Buffer != null) Buffer.close();
			} catch (IOException crunchifyException) {
				crunchifyException.printStackTrace();
			}
		}         
	}
	        
	// Utility which converts CSV to ArrayList using Split Operation
	public static ArrayList<String> CSVtoArrayList(String CSV, String ProductName) {
		ArrayList<String> Result = new ArrayList<String>();
		if (CSV != null) {
			String[] splitData = CSV.split("\\s*,\\s*");
                        
			for (int i = 0; i < splitData.length; i++) {
				if (!(splitData[i] == null) || !(splitData[i].length() == 0)) {
					Result.add(splitData[i].trim());           
				}
				if(i>=2)
                                {
                                    String array[] = new String[Result.size()];              
                                    for(int j =0;j<Result.size();j++)
                                    {
                                        array[j] = Result.get(j);
                                        if(ProductName.equals(array[j]))
                                        {
                                            System.out.println("Shop Id is " + array[0]);
                                            float result = Float.parseFloat(array[1]);   
                                            System.out.println("Price is "+result);
					     System.out.println("");
                                        }	
                                    }							
                                    //Displaying Array elements
                                    /*for(String k: array)
                                    {
                                    System.out.println(k);
                                    }*/
				}
			}return Result ;
		}return null;
    }
}
