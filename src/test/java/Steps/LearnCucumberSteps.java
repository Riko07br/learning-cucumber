package Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class LearnCucumberSteps {
    @Given("file created correctly")
    public void file_created_correctly() {
    }

    @When("executed")
    public void executed() {
    }

    @Then("the specification returns success")
    public void the_specification_returns_success() {
        // This is not compiling the tests on future edits when using the plugin run,
        // so right click on tests>java>package or tests>java and click on Rebuild
    }

    int counter = 0;

    @Given("the value of {int}")
    public void the_value_of(Integer val) {
        counter = val;
    }

    @When("adding {int}")
    public void adding(Integer val) {
        counter += val;
    }

    @Then("returns {int}")
    public void returns(Integer val) {
        Assert.assertEquals((int) val, counter);
    }

    LocalDate deliveryDate;


    @Given("the delivery date of {date}")
    public void the_delivery_date_of(LocalDate date) {
        deliveryDate = date;
    }

    @When("it delays by {int} {word}")
    public void it_delays_by(Integer units, String temporalUnit) {
        ChronoUnit chronoUnit = ChronoUnit.valueOf(temporalUnit.toUpperCase());
        deliveryDate = deliveryDate.plus(units, chronoUnit);
    }

    @Then("the delivery will be made in {date}")
    public void the_delivery_will_be_made_in(LocalDate delayedDate) {
        Assert.assertEquals(delayedDate, deliveryDate);
    }
}
