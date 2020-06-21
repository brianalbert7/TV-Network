package tvnetwork;
import java.util.Scanner;


/**
 *
 * @author Brian Albert
 */
public class TVNetworkDriver {

    /**
     * The main method is the program's starting point.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //declare variables
        Show myShow;
        String networkEntered;
        int channelEntered;
        String showEntered;
        Scanner input = new Scanner(System.in);

        //Instantiating an instance of Show
        myShow = new Show("HBO", 28, "Game of Thrones");
        System.out.println("After instantiation...");

        //Display attributes of object
        System.out.printf("\nTV Network: " + myShow.getNetwork());
        System.out.printf("\nTV Network Channel: " + myShow.getChannel());
        System.out.printf("\nTV Show Name: " + myShow.getShow());

        //Get Data
        System.out.printf("\n\nEnter new TV network: ");
        networkEntered = input.nextLine();

        System.out.print("Enter new channel of the TV network: ");
        channelEntered = input.nextInt();
        input.nextLine();

        System.out.print("Enter new TV show name: ");
        showEntered = input.nextLine();

        //create show object
        myShow.setNetwork(networkEntered);
        myShow.setChannel(channelEntered);
        myShow.setShow(showEntered);

        System.out.printf("\nAfter updates...\n\n");
        System.out.println("TV Network: " + myShow.getNetwork());
        System.out.println("TV Network Channel: " + myShow.getChannel());
        System.out.println("TV Show Name: " + myShow.getShow());
    }
}
