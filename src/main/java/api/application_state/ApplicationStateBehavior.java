package api.application_state;

public interface ApplicationStateBehavior {
    ApplicationState getState();
    ApplicationStateBehavior start();
    ApplicationStateBehavior stop();
    ApplicationStateBehavior turnOn();
    ApplicationStateBehavior turnOff();
}
