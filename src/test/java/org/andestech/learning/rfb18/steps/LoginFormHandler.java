package org.andestech.learning.rfb18.steps;

import cucumber.api.Format;
import cucumber.api.java.ru.Дано;
import cucumber.api.java.ru.Допустим;
import cucumber.api.java.ru.То;
import org.junit.Assert;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public class LoginFormHandler {





    @Дано("^набор данных логин и пароль$")
    public void наборДанныхЛогинИПароль(List<Map<String,String>> lmap) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
        // E,K,V must be a scalar (String, Integer, Date, enum etc)

        System.out.println(lmap);

        for(Map<String,String> map: lmap ){

            for(String key: map.keySet())
            {
                System.out.println(key + "=>" + map.get(key));



            }
            System.out.println("-----------");
        }

       // Assert.assertEquals(1,1-2-3-4-2);
    }


    @То("^Получаем результат$")
    public void получаемРезультат() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Ok!");
    }


    @Дано("^список сайтов$")
    public void списокСайтов(List<String> sites) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
        // E,K,V must be a scalar (String, Integer, Date, enum etc)
        System.out.println(sites);
    }


    @Допустим("^11дата приёма на работу сотрудника не позже \"([^\"]*)\"$")
    public void датаПриёмаНаРаботуСотрудникаНеПозже2(String sdata) throws Throwable {
        // Write code here that turns the phrase above into concrete actions

         Date date;
         DateFormat df =
                 new SimpleDateFormat("yyyy-MM-dd",new Locale("en"));

         date = df.parse(sdata);
        System.out.println(date);
    }


    @Допустим("^дата приёма на работу сотрудника не позже \"([^\"]*)\"$")
    public void датаПриёмаНаРаботуСотрудникаНеПозже(
            @Format("yyyy-MM-dd") Date date) throws Throwable {
        // Write code here that turns the phrase above into concrete actions

        System.out.println(date);
    }
}
