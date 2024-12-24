package lab3;

public enum Color {
    BLACK("Black", 1),
    WHITE ("White", 2),
    RED ("Red", 3),
    BLUE ("Blue", 4),
    GREEN ("Green", 5);

    private final String description;
    private final int code;

    Color(String description, int code) {
        this.description = description;
        this.code = code;
    }

    public String getDescription() {
        return description;
    }
}