package posting.test;

import cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@Cucumber.Options(format= {"pretty","html:target/cucumber-html-report","json-pretty:target/cucumber-report.json"})
public class RunCukesTest {

}