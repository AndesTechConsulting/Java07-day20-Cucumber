package org.andestech.learning.rfb18.steps;

import cucumber.api.java.en.*;
import org.andestech.learning.rfb18.Customer;
import org.junit.Assert;

public class StepsHandler {

    private static Customer cust;

    static {
        //....
        cust = new Customer("Super User");
    }

    @Given("^Пользователь \"([^\"]*)\" умеет считать$")
    public void пользовательУмеетСчитать(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("user: " + arg1);
        cust.setName("Новый Пользователь");
        Assert.assertTrue(arg1.startsWith("А"));
    }

    @Given("^Берём на работу$")
    public void берёмНаРаботу() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //...
        //...
        System.out.println("Ok. На работу взят");
        System.out.println(cust.getName());
    }

}
