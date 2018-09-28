package org.andestech.learning.rfb18.steps;

import cucumber.api.java.After;

public class CukeHooks {

@After(value = "@1",order = 10)
    public void tearDown1(){


    System.out.println("--- 1 Очищаем ресурсы после теста");
}


    @After(value = "@1",order = 20)
    public void tearDown2(){


        System.out.println("--- 2 Очищаем ресурсы после теста");

    }

}
