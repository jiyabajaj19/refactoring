package theater;

/**
 * Represents a theater play.
 */
public class Play {
    private final String name;
    private final String type;
    /**
     * Constructs a Play with the given name and type.
     * @param name the name of the play
     * @param type the type of the play (e.g., drama, comedy)
     */

    public Play(String name, String type) {
        this.name = name;
        this.type = type;
    }
    /**
     * Returns the name of the play.
     * @return the name, or {@code null} if not set.
     */

    public String getName() {
        return name;
    }
    /**
     * Returns the type of the play.
     * @return the type, or {@code null} if not set
     */

    public String getType() {
        return type;
    }
}
