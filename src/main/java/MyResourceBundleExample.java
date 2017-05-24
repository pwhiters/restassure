/**
 * Created by pwhit on 4/2/2017.
 */

import java.util.Locale;
import java.util.ResourceBundle;


public class MyResourceBundleExample {

    public static void main(String[] args)
    {
        try
        {

            //Trying with resource bundle
            ResourceBundle aqTranslation = ResourceBundle.getBundle("airquality", new Locale("el_GR"));
            //String myDriver = bundle.getString("database.jdbc.driver");
            String pm2 = aqTranslation.getString("Pollutant.Phrase.PM2.5");
            String pm10 = aqTranslation.getString("Pollutant.Phrase.PM10");
            String phraseCO = aqTranslation.getString("Pollutant.Phrase.CO");

            System.out.println(phraseCO + " " + pm2 + " " + pm10);

        }
        catch (Exception e)
        {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }
    }
}
