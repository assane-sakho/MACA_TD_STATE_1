package api.application_state;

public class UnknownState implements ApplicationStateBehavior {
    @Override
    public ApplicationState getState() {
        return ApplicationState.UNKNOWN;
    }

    @Override
    public ApplicationStateBehavior start() {
        return this;
    }

    @Override
    public ApplicationStateBehavior stop() {
        return this;
    }

    @Override
    public ApplicationStateBehavior turnOn() {
        return this;
    }

    @Override
    public ApplicationStateBehavior turnOff() {
        return this;
    }
}
