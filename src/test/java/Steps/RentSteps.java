package Steps;

import com.java.entities.Invoice;
import com.java.entities.Movie;
import com.java.services.RentService;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.time.LocalDate;

public class RentSteps {
    private Movie movie = new Movie();
    private RentService rentService = new RentService();
    private Float rentPrice;
    private Invoice invoice;
    private String errorMessage;

    @Given("movie with {int} unit(s) in stock")
    public void movieWithUnitsInStock(Integer stock) {
        movie.setStock(stock);
    }

    @Given("rent price of R$ {float}")
    public void rentPriceOfR$(Float price) {
        rentPrice = price;
    }

    @When("rent")
    public void rent() {
        try {
            invoice = rentService.rent(movie, rentPrice);
        } catch (RuntimeException e) {
            errorMessage = e.getMessage();
        }
    }

    @Then("rent price is R$ {float}")
    public void rentPriceIsR$(Float price) {
        Assert.assertEquals(price, invoice.getRentPrice());
    }

    @Then("return date is in {int} day(s)")
    public void returnDateIsInDay(Integer int1) {
        Assert.assertEquals(LocalDate.now().plusDays(int1), invoice.getReturnDate());
    }

    @Then("movie stock is {int} unit(s)")
    public void movieStockIsUnit(Integer int1) {
        Assert.assertEquals(int1, movie.getStock());
    }

    @Then("won't be able to rent")
    public void wonTBeAbleToRent() {
        Assert.assertEquals(errorMessage, "Movie has no stock");
    }

}
