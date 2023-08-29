package tddmicroexercises.telemetrysystem;

import java.util.Random;

public class TelemetryClient
{
    public static final String DIAGNOSTIC_MESSAGE = "AT#UD";

    private boolean onlineStatus;
    private final String diagnosticMessageResult = "";

    private final TelemetryConnection connection;

    private final TelemetryActions telemetryActions;

    public TelemetryClient(TelemetryConnection connection, TelemetryActions telemetryActions) {
        this.connection = connection;
        this.telemetryActions = telemetryActions;
    }

    public boolean getOnlineStatus()
    {
        return onlineStatus; 
    }

    public void connect(String telemetryServerConnectionString)
    {
        onlineStatus = connection.establishConnection(telemetryServerConnectionString);
    }

    public void disconnect()
    {
        onlineStatus = connection.disconnect();
    }

    public void send(String message)
    {
        telemetryActions.send(message);
    }

    public String receive()
    {
        return telemetryActions.receive();
    }
}

