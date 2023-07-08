public class UnderflowException extends RuntimeException {
    public UnderflowException() {
    super("Underflow!");
    }

    @Override
    public String toString() {
        return "UnderflowException []";
    }
}
    