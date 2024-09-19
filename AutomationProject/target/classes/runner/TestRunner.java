//
// Bakir Mert Caner
// Moneypay
//


package runner;

import base.MainFactory;

import java.util.stream.Stream;

/*
@RunWith(Cucumber.class)
@CucumberOptions(
        features = {
                "src//test//java//Features//Migros.feature",
                //"src//test//java//Features//Hepsiburada.feature"
                },
        glue = {"TestCases","Pages","Features"},
        tags = "@chrome",
        //tags = "@chrome and @migros",
        //tags = "@firefox",
        //tags = "@chrome or @firefox",
        plugin = {"pretty", "html:build/reports/cucumber"}
)

 */

public class TestRunner {
    public static void main(String[] args) {

        /*
        try{
            Stream<String> cucumberOptions = Stream.of(MainFactory.initFactory(args[0]));
            io.cucumber.core.cli.Main.main(cucumberOptions.toArray(String[]::new));
        }catch(Exception e){
            System.out.println(e);
        }
        */

        try{
            Stream<String> cucumberOptions = Stream.concat(Stream.of(MainFactory.initFactoryCons()), Stream.of(args));
            io.cucumber.core.cli.Main.main(cucumberOptions.toArray(String[]::new));
        }catch(Exception e){
            System.out.println(e);
        }

    }

}


