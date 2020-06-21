package tvnetwork;

/**
 *
 * @author Brian Albert
 */
class Show extends TVNetwork {

    /**
     * @param args the command line arguments
     */
    private String show;

    /**
     * Constructor
     *
     * @param initialShow value for show field
     */
    public Show(String network, int channel, String initialShow) {
        super(network, channel);
        show = initialShow;
    }

    /**
     * The setShow method accepts an argument which is stored in the show field.
     *
     * @param newShow value for show field
     */
    public void setShow(String newShow) {
        show = newShow;
    }

    /**
     * The getShow method returns the value stored in the show field.
     *
     * @return value from show field
     */
    public String getShow() {
        return show;
    }
}
