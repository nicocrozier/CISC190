
/**
 * Enumeration class Months - write a description of the enum class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public class StringMonth
{
    public static final String[] COLD_MONTHS = {
        "DECEMBER",
        "JANUARY",
        "FEBRUARY",
    };
    public static final String[] COOL_MONTHS = {
        "MARCH",
        "APRIL",
    };
    public static final String[] SNEEZY_MONTHS = {
        "MAY",
    };
    public static final String[] WARM_MONTHS = {
        
        "JUNE",
        "JULY",
        "AUGUST",
        "SEPTEMBER", 
    };
    
    public static final String[][] SEASONS = {
        COLD_MONTHS,
        COOL_MONTHS,
        SNEEZY_MONTHS,
        WARM_MONTHS,
    };
    
    public static String getSeason(String month)
    {
        String season = "Don't know.";
        String[] months = null;
        for (String [] sarray : SEASONS)
        {
            for (String s : sarray)
            {
                if (s.equals(month))
                {
                    months = sarray;
                    break;
                }
            }
            if (months != null)
            {
                break;
            }
        }
    }
    
}












