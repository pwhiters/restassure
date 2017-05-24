import java.util.ResourceBundle;

public class AirQualityBundleTest   {

    public static void main(String[] args){

        ResourceBundle aqTranslation;
        String language;

        ResourceTranslationBundle aq = new ResourceTranslationBundle("en_US");
        ResourceTranslationBundle aq2 = new ResourceTranslationBundle();

        aqTranslation = aq.getTranslation();

        String pm2 = aqTranslation.getString("Pollutant.Phrase.PM2.5");
        String pm10 = aqTranslation.getString("Pollutant.Phrase.PM10");
        String phraseCO = aqTranslation.getString("Pollutant.Phrase.CO");

        language = "en_US";
        System.out.println("Language->" + language  + ": " + pm2 + " :: " + pm10 + " :: " + " " + phraseCO  + "\n");

        language = "el-GR";
        language = aq.convertLanguageDashToUnderscore(language);
        aqTranslation = aq.getTranslation(language);
        pm2 = aqTranslation.getString("Pollutant.Phrase.PM2.5");
        pm10 = aqTranslation.getString("Pollutant.Phrase.PM10");
        phraseCO = aqTranslation.getString("Pollutant.Phrase.CO");

        System.out.println("Language->" + language  + ": " + pm2 + " :: " + pm10 + " :: " + " " + phraseCO  + "\n");

        language = "ar_AE";
        aqTranslation = aq.getTranslation(language);
        pm2 = aqTranslation.getString("Pollutant.Phrase.PM2.5");
        pm10 = aqTranslation.getString("Pollutant.Phrase.PM10");
        phraseCO = aqTranslation.getString("Pollutant.Phrase.CO");

        System.out.println("Language->" + language  + ": " + pm2 + " :: " + pm10 + " :: " + " " + phraseCO + "\n");

        System.out.println("****************************************************************************\n");


        language = "ar_AE";
        aqTranslation = aq2.getTranslation(language);
        pm2 = aqTranslation.getString("Pollutant.Phrase.PM2.5");
        pm10 = aqTranslation.getString("Pollutant.Phrase.PM10");
        phraseCO = aqTranslation.getString("Pollutant.Phrase.CO");

        System.out.println("Language->" + language  + ": " + pm2 + " :: " + pm10 + " :: " + " " + phraseCO + "\n");

    }

  }
