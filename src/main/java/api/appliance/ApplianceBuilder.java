package api.appliance;

import api.application_state.ApplicationState;

public   class ApplianceBuilder {
    public static Toaster createToaster() {
        return new Toaster(ApplicationState.OFF);
    }
}
