public enum Key {
    CAPSLOCK,
    Q("q");

    private String value;

    Key() {
        // constructor for CAPSLOCK
    }

    Key(String value) {
        // constructor for Q("q")
        this.value = value;
    }

    public String getvalue() {
        return value;
    }
}
