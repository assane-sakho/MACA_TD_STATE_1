package api.application_state;

public enum ApplicationState {
    OFF(new OffState()),
    ON(new OnState()),
    STOPPED(new StoppedState()),
    STARTED(new StartedState()),
    UNKNOWN(new UnknownState());

    private ApplicationStateBehavior applicationStateBehavior;

    ApplicationState(ApplicationStateBehavior stateBehavior)
    {
        this.applicationStateBehavior = stateBehavior;
    }

    public ApplicationStateBehavior getStateBehavior()
    {
        return applicationStateBehavior;
    }
}
