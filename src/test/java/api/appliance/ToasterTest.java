package api.appliance;

import api.application_state.ApplicationState;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ToasterTest {
    private Toaster toaster;

    @BeforeMethod
    public void setUp() {
        toaster = ApplianceBuilder.createToaster();
    }

    @AfterMethod
    public void tearDown() {
        toaster = null;
    }

    @Test
    public void testStart() {
        toaster.turnOn();
        toaster.start();
        assertEquals(toaster.getState(), ApplicationState.STARTED);
    }

    @Test
    public void testStop() {
        toaster.turnOn();
        toaster.start();
        toaster.stop();
        assertEquals(toaster.getState(), ApplicationState.STOPPED);
    }

    @Test
    public void testTurnOn() {
        toaster.turnOn();
        assertEquals(toaster.getState(), ApplicationState.ON);
    }

    @Test
    public void testTurnOff() {
        toaster.turnOn();
        toaster.start();
        toaster.stop();
        toaster.turnOff();
        assertEquals(toaster.getState(), ApplicationState.OFF);
    }
}