package api.application_state;

public class StartedState implements ApplicationStateBehavior {
    @Override
    public ApplicationState getState() {
        return ApplicationState.STARTED;
    }

    @Override
    public ApplicationStateBehavior start() {
        return this;
    }

    @Override
    public ApplicationStateBehavior stop() {
        return new StoppedState();
    }

    @Override
    public ApplicationStateBehavior turnOn() {
        return new UnknownState();
    }

    @Override
    public ApplicationStateBehavior turnOff() {
        return new UnknownState();
    }
}
