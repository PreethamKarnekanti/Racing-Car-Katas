package tddmicroexercises.telemetrysystem;

import java.util.Random;

public class TelemetryConnection implements  Connection {
    private final Random connectionEventsSimulator;

    public TelemetryConnection() {
        this.connectionEventsSimulator = new Random(42);
    }

    public Random getConnectionEventsSimulator() {
        return connectionEventsSimulator;
    }

    @Override
    public boolean establishConnection(String connectionString) {
        if (connectionString == null || "".equals(connectionString)) {
            throw new IllegalArgumentException();
        }

        return connectionEventsSimulator.nextInt(10) <= 8;
    }

    @Override
    public boolean disconnect()
    {
        return false;
    }
}
