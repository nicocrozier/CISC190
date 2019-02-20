public class StringClothes
{
    public String dressMe(String month)
    {
        month = month.toUpperCase();
        String dressing = "I'm dressing in ";
        if (month.equals("DECEMBER") ||
            month.equals ("JANUARY") ||
            month.equals ("FEBRUARY"))
            {
                dressing += "warm stuff!";
            }
                
        else if (month.equals ("MARCH") ||
            month.equals ("APRIL"))
        {
            dressing += "light fleece.";
        }
       
        else if (month.equals ("MAY"))
        {
            dressing += "kleenex.";
        }
        
        else if (month.equals ("JUNE") ||
            month.equals ("JULY") ||
            month.equals ("AUGUST") ||
            month.equals ("SEPTEMBER"))
        {
            dressing += "short shorts.";
        }
        else
        {
        dressing += "clothing.";
        }
        return dressing;
    }

    public static void main(String[] args)
    {
        StringClothes clothes = new StringClothes();
        for (int i = 0 ; i < args.length ; i++) {
            System.out.println("I got " + args[i]);
            String s  = clothes.dressMe(args[i]);
            System.out.println(s);
        }
    }
}
