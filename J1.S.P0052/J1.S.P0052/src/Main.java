
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 
 */
public class Main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Performfuntions  ManageEastAsiaCountries = new Performfuntions();
        ArrayList<EastAsiaCountries> alist = new ArrayList<>();
        while(true){
            //Step 1:Show menu option  
            int option =  ManageEastAsiaCountries.menu();
            switch(option){
                case 1: //option 1:Add information for a country
                     ManageEastAsiaCountries.addInformationForCountry(); 
                    break;
                case 2://option 2:Display information of countries
                     ManageEastAsiaCountries.displayInformationOfCounties();
                    break;
                case 3://option 3:Search information of countries by name
                     ManageEastAsiaCountries.searchInformationByName();
                    break;
                case 4://option 4:Display the information of countries sorted name in ascending order 
                     ManageEastAsiaCountries.displayAndSortInformationByAscendingOrder();
                    break;
                case 5://option 5:exit program
                    return;
            }
        }
              
    }
    
}
