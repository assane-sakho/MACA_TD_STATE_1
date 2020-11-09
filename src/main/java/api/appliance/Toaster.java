package api.appliance;

import api.application_state.ApplicationState;

public class Toaster extends AbstractAppliance {

    public Toaster(ApplicationState state) {
        super(state);
    }

    @Override
    public void start() {
        setState(state.getStateBehavior().start().getState());
    }

    @Override
    public void stop() {
        setState(state.getStateBehavior().stop().getState());
    }

    @Override
    public void turnOn() {
        setState(state.getStateBehavior().turnOn().getState());
    }

    @Override
    public void turnOff() {
        setState(state.getStateBehavior().turnOff().getState());
    }
}
