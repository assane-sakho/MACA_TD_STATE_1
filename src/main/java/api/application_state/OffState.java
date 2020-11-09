package api.application_state;

public class OffState implements ApplicationStateBehavior {
    @Override
    public ApplicationState getState() {
        return ApplicationState.OFF;
    }

    @Override
    public ApplicationStateBehavior start() {
        return new UnknownState();
    }

    @Override
    public ApplicationStateBehavior stop() {
        return new UnknownState();
    }

    @Override
    public ApplicationStateBehavior turnOn() {
        return new OnState();
    }

    @Override
    public ApplicationStateBehavior turnOff() {
        return this;
    }
}
