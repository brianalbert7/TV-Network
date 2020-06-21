package tvnetwork;

/**
 *
 * @author Brian Albert
 */
public class TVNetwork {

    /**
     * @param args the command line arguments
     */
    private String network;
    private int channel;

    /**
     * Constructor
     *
     * @param initialNetwork value for network field
     * @param initialChannel value for channel field
     */
    public TVNetwork(String initialNetwork, int initialChannel) {
        network = initialNetwork;
        channel = initialChannel;
    }

    /**
     * The setNetwork method accepts an argument which is stored in the network
     * field.
     *
     * @param newNetwork value for network field
     */
    public void setNetwork(String newNetwork) {
        network = newNetwork;
    }

    /**
     * The setChannel method accepts an argument which is stored in the channel
     * field.
     *
     * @param newChannel value for channel field
     */
    public void setChannel(int newChannel) {
        channel = newChannel;
    }

    /**
     * The getNetwork method returns the value stored in the network field.
     *
     * @return value from network field
     */
    public String getNetwork() {
        return network;
    }

    /**
     * The getChannel method returns the value stored in the channel field.
     *
     * @return value from channel field
     */
    public int getChannel() {
        return channel;
    }
}
