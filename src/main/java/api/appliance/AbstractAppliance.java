package api.appliance;

import api.application_state.ApplicationState;

public abstract class AbstractAppliance implements Appliance {
    protected ApplicationState state;

    public AbstractAppliance(ApplicationState state)
    {
        setState(state);
    }

    public void setState(ApplicationState state)
    {
        this.state = state;
    }

    public ApplicationState getState() { return this.state; }
}
