package fun.felipe.economyinterface.enums;

public enum ResponseType {
    SUCCESS(1),
    FAILURE(2),
    NOT_IMPLEMENTED(3);

    private final int id;

    ResponseType(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}
