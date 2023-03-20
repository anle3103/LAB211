
import java.util.ArrayList;
import java.util.Collections;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 
 */
public class Performfuntions {
    UserInput val = new UserInput();
     ArrayList<EastAsiaCountries> alist = new ArrayList<>();
    //checkExist
    public int checkExistCode( String code){
        for (int i = 0; i < alist.size(); i++) {
            if(alist.get(i).getCountryCode().equalsIgnoreCase(code)){
                return i;
            }
        }    
        return -1;
    }
    
     //Step 1:Show menu option  
    public int menu(){
        //display menu
        System.out.println("==========================================================================");
        System.out.println( "1. Input the information of 11 countries in East Asia\n" +
                            "2. Display the information of country you've just input\n" +
                            "3. Search the information of country by user-entered name\n" +
                            "4. Display the information of countries sorted name in ascending order  \n" +
                            "5. Exit ");
        System.out.println("==========================================================================");
        System.out.println("Please choice one option: ");
        int i = val.getInt(1, 5);
        return i;
    }
    

    //option 1:Add information for a country
    public void addInformationForCountry(){
        //If you enter through 11 countries, you will not be allowed to enter again
        if(alist.size() > 2){
            System.out.println("Can't add more. East Asia Countries only has only 11 countries");
        }
      //Enter country data
        else{
            //check exist code
            String code;
            while (true) {                
                System.out.println("Enter country code: ");
                code = val.getString();
  
                if(checkExistCode(code) >= 0 ){
                    System.out.println("This country already exist");
                }
                else{
                    break;
                }
            }
            System.out.println("Enter country name: ");
            String name = val.getString();
            System.out.println("Enter total Area: ");
            float area = val.getFloat(1, Double.POSITIVE_INFINITY);
            System.out.println("Enter terrain of country: ");
            String terrain = val.getString();
           //add data of object to arraylist 
            alist.add(new EastAsiaCountries(code, name, area, terrain));
        }
    }
    //option 2:Display information of countries
    public void displayInformationOfCounties(){
        if(alist.isEmpty()){
            System.out.println("List is empty");
        }
        else{
            System.out.printf("%-20s%-20s%-20s%-20s\n","ID", "Name", "Total Area","Terrain");
            for (int i = 0; i < alist.size(); i++) {
                alist.get(i).display();
            }  
        }

    }
    //option 3:Search information of countries by name
    public void	searchInformationByName(){
        System.out.println("Enter the name you want to search for: ");
        String name = val.getString();
        int flag = 0;       
         System.out.printf("%-20s%-20s%-20s%-20s\n","ID", "Name", "Total Area","Terrain");      
        for (int i = 0; i < alist.size(); i++) {              
            if(alist.get(i).getCountryName().equalsIgnoreCase(name)){               
                alist.get(i).display();           
                flag = 1;
                
            }
        }
        
        if(flag == 0){
            System.out.println("No Result!");
        }
    }
    //option 4:Display the information of countries sorted name in ascending order 
    public void displayAndSortInformationByAscendingOrder(){
        System.out.printf("%-20s%-20s%-20s%-20s\n","ID", "Name", "Total Area","Terrain");
        Collections.sort(alist);       
        for (int i = 0; i < alist.size(); i++) {
            alist.get(i).display();
        }
    }
    
}

