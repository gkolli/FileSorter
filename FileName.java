import java.util.ArrayList;
import java.util.Scanner;
/**
 * Sort File Paths based on number of slashes, and alphabetically
 *  * @author Naren Kolli, Period 6
 */
public class FileName {

    private ArrayList<String> files = new ArrayList<String>();
 
    public FileName(){
        
    }
    
    /**
     * Method to take user input of file paths
     */
    public void receiveUserInput(){
        boolean truth = false;
        while (!truth){
        Scanner userIn = new Scanner(System.in);
        System.out.println("Please enter file paths, hitting enter key after each one.");
        System.out.println("Hit Q to quit");
        String userInput = userIn.nextLine();
        if(userInput.equalsIgnoreCase("Q")){
            truth = true;
        }
        else{
            files.add(userInput);
        }
        }
    }
    /**
     * This method places the number of slashes in front of file name, to be sorted in sortNames()
     */
    public void placeSlash(){
        for(int i = 0; i < files.size(); i++){
        int slashCount = 0;
        for (int j = 0; j < files.get(i).length(); j++){
            if (files.get(i).substring(j,j+1).equals("\\")){
            slashCount++;    
            }
    
        }
        files.set(i, slashCount + files.get(i));
    }
    
    }

    /**
     * Sorts the file pathways based on number of slashes and alphabetical order
     */
    public void sortPaths(){
        for (int i = 1; i < files.size(); i++){
            String value = files.get(i);
            int index = i;
            while (0< index && value.compareTo(files.get(index-1)) < 0){
            files.set(index, files.get(index-1));
            index--;
            }
            files.set(index, value);
        }
    }
    /**
     * Method to remove slashes in front of path names and print path names
     */
    public void printPathways(){
        for(int i = 0; i< files.size(); i++){
            System.out.println(files.get(i).substring(1));
        }
    }
}