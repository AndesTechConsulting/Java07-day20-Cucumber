package org.andestech.learning.rfb18.steps;

import cucumber.api.java.en.Given;
import org.junit.Assert;

public class StepsForSummator {

    private int a,b;

    public StepsForSummator(){
        System.out.println("+++ ctor: " +this);

    }

    @Given("[дД]ва числа: ([+-]?\\d+), ([+-]?\\d+)$")
    public void дваЧисла(int a, int b) throws Throwable {
        // Write code here that turns the phrase above into concrete actions

        this.a = a;
        this.b = b;
    }

    @Given("^Пользователь имеет калькулятор$")
    public void пользовательИмеетКалькулятор() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }

    @Given("^Получаем результат (\\d+)$")
    public void получаемРезультат(int expected) throws Throwable {
        // Write code here that turns the phrase above into concrete actions

        Assert.assertEquals(expected, a+b);
    }



}
