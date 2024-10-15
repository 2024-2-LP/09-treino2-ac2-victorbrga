package school.sptech.exception;

public class LivroNaoEncontradoException extends RuntimeException {

    public LivroNaoEncontradoException() {
    }

    public LivroNaoEncontradoException(String message) {
        super(message);
    }

    public LivroNaoEncontradoException(String message, Throwable cause) {
        super(message, cause);
    }
}
