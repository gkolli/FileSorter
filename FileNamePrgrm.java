/**
 * Main class to run FileName
 * Creates a FileName object to sort user inputed file pathways
 * @author Naren Kolli, Period 6
 */

public class FileNamePrgrm {

    public static void main(String[] args) {
        
        FileName filePathList = new FileName();
        filePathList.receiveUserInput();
        filePathList.placeSlash();
        filePathList.sortPaths();
        filePathList.printPathways();
        
    }

}
