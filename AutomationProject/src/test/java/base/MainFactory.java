package base;

import java.io.File;
import java.io.IOException;
import java.net.URL;

public class MainFactory {

    public static String[] options;

    public static String[] initFactoryCons() {

        options = new String[]{
                "--plugin", "pretty",
                "--plugin", "html:build/reports/cucumber",
                "--glue", "testcases",
                "--glue", "pages",
                "--glue", "featurefiles",
                //"--tags", "@hepsiburada",
                //"--tags", "@chrome",
                //"--tags", "@service",
                //"--tags", "@firefox",
                //"--tags", "@migros",
                "--tags", "@ziraat",
                //"--tags", "@migros or @service",
                //"--features", "src/test/java/featurefiles/Migros.feature"
                //"src/test/java/featurefiles/Migros.feature"
                //"classpath:featurefiles/Migros.feature"
                "classpath:featurefiles/Ziraat.feature"
                //"classpath:featurefiles/Hepsiburada.feature"
        };

        return options;
    }


}
