package tddmicroexercises.telemetrysystem;

import java.util.Random;

public class TelemetryConnection {
    private final Random connectionEventsSimulator = new Random(42);

    public Random getConnectionEventsSimulator() {
        return connectionEventsSimulator;
    }

    public boolean establishConnection(String connectionString) {
        if (connectionString == null || "".equals(connectionString)) {
            throw new IllegalArgumentException();
        }

        return connectionEventsSimulator.nextInt(10) <= 8;
    }
}
