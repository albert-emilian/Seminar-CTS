package ro.ase.cts.tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)

@Suite.SuiteClasses({
        GrupaTest.class,
        TesteGrupaMock.class,
        GrupaTestFixture.class
})
public class TestSuites {
}
