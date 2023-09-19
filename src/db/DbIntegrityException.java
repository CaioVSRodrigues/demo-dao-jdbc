package db;

public class DbIntegrityException extends RuntimeException { // Exceção de intregridade referencial

    private static final long serialVersionUID = 1L;

    public DbIntegrityException(String msg){
        super(msg);
    }
}
