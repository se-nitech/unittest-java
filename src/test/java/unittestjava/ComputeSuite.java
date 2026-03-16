package unittestjava;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({
    ComputeAddTest.class,
    ComputeMultTest.class,
    AddOrMultTest.class
})
class ComputeSuite {
}
