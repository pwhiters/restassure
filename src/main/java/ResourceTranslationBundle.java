import java.util.Locale;
import java.util.ResourceBundle;

/**
 * AirQualityBundle takes an locale and returns a translation bundle data i.e. airquality_en_US.properties
 * By default the locale format is xx_XX; if xx-XX then use convertLanguageDashToUnderscore()
 * to convert to xx_XX.
 */


public class ResourceTranslationBundle {

    private
    ResourceBundle aqTranslation;
    String language;
    String loc;

    public
    /**
     * Default Constructor
     */
    ResourceTranslationBundle (){

        //Default to English
        setLanguage("en_US");
        setLoc("en_US");
    }

    /**
     * Constructor using the language parameter
     * @param language
     */
    ResourceTranslationBundle (String language){

        setLanguage(language);
        setLoc(language);

        aqTranslation = ResourceBundle.getBundle("airquality", new Locale(language));

    }

    /**
     * Returns the locale
     * @return
     */
    public String getLoc() {
        return loc;
    }
    /**
     * Set the language/Locale
     * @param loc
     */
    public void setLoc(String loc) {
        this.loc = loc;
        this.language = language;
    }

    /**
     * Set the language/Locale
     * @param language
     */
    public void setLanguage(String language) {
        this.loc = language;
        this.language = language;
    }

//    public ResourceBundle getAqTranslation() {
//        return aqTranslation;
//    }



    /**
     * Get the Resiurce Bundle using the passed in languate paramter
     * @param language
     * @return
     */
    ResourceBundle getTranslation(String language){

        aqTranslation = ResourceBundle.getBundle("airquality", new Locale(language));

        return aqTranslation;
    }

    /**
     * Gets the Resource Bundle
     * @return
     */
    ResourceBundle getTranslation(){

        aqTranslation = ResourceBundle.getBundle("airquality", new Locale(language));

        return aqTranslation;
    }

    /**
     * Converts "-" to "_"
     * @param language
     * @return language
     */
    String convertLanguageDashToUnderscore(String language){
        return language.replace("-", "_");
    }

}
