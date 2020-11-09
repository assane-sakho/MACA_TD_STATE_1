package api.application_state;

public class OnState implements ApplicationStateBehavior {

    @Override
    public ApplicationState getState() {
        return ApplicationState.ON;
    }

    @Override
    public ApplicationStateBehavior start() {
      return new StartedState();
    }

    @Override
    public ApplicationStateBehavior stop() {
        return new UnknownState();
    }

    @Override
    public ApplicationStateBehavior turnOn() {
        return this;
    }

    @Override
    public ApplicationStateBehavior turnOff() {
        return new StoppedState();
    }
}
