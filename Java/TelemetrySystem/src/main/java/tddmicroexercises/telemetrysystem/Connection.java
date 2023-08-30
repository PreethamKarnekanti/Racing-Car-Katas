package tddmicroexercises.telemetrysystem;

public interface Connection {
    boolean establishConnection(String connectionString);
    boolean disconnect();
}
