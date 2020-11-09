package api.application_state;

public class StoppedState implements ApplicationStateBehavior {
    @Override
    public ApplicationState getState() {
        return ApplicationState.STOPPED;
    }

    @Override
    public ApplicationStateBehavior start() {
        return new StartedState();
    }

    @Override
    public ApplicationStateBehavior stop() {
        return this;
    }

    @Override
    public ApplicationStateBehavior turnOn() {
        return new UnknownState();
    }

    @Override
    public ApplicationStateBehavior turnOff() {
        return new OffState();
    }
}
