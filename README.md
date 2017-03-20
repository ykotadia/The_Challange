# The_Challange_DataOne_Innovation_Labs


# How to Run CSVtoArrayList.java?

1. You Need to have JAVA installed in your computer
2. Download this repository, Extract it.
3. Open Commandpromt at CSVtoArrayList.java
4. Write following commands :  
5. javac CSVtoArrayList.java
6. java CSVtoArrayList

# Input

1. It will ask to give path for csv file, give full to csv file you want to read.
    
   e.g. : D:/The_Challange/CSVtoArrayList/src/csvtoarraylist/data.csv

2. Give Product Name 
   
   e.g : teddy_bear
   
# output

Shop ID is 1, Price is 4.0 

Shop ID is 2, Price is 5.0

# How it Works?

1. System is made in JAVA. 
2. No inbuilt Library (e.g : OpenCSV - 3.9) is use to converts CSV and Split Operation
3. CSVtoArrayList(Line,PRname) - method is created to converts CSV to ArrayList using Split Operation
4. If my input to this function will be 6,6.00,bath_towel, cotton_balls, powder_puff then this function converts it into ArrayList whose output will look like [6 6.00 bath_towel cotton_balls powder_puff] 
5. It will read all content line by line from CSV file and add Data into ArrayList row by row
6. Then I have converted ArrayList into Array
7. Converted ShopID into int
8. Converted price into float (decimal)
9. Matches Input string (Product name) with Array Values of Product name
10. If match found takes Shop ID and Price of that Product


# (Note)

1. This system is capable to separate any wired csv fiel. 
2. As my exmas are going I have done it for single product. To take multiple input of product name, put input under while loop and run it until user says "No" to another input
3. Store input into array, compare it with array generated out of arrayList, take shop id and sum of their price 

