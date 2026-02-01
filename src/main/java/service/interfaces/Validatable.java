package service.interfaces;

public interface Validatable {
    void validate();

    default void printValidationMessage() {
        System.out.println("✅ Validation passed.");
    }

    static boolean isNotNull(Object obj) {
        return obj != null;
    }
}
