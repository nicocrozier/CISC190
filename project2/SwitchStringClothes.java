public class SwitchStringClothes
{
    public String dressMe(String month)
    {
        month = month.toUpperCase();
        String dressing = "I'm dressing in ";
        switch (month)
        {
            case DECEMBER:
            case JANUARY:
            case FEBRUARY:
                dressing += "warm stuff!";
                break;
            
            case MARCH:
            case APRIL:
                dressing += "light fleece.";
                break;
                
            case MAY:
                dressing += "kleenex.";
                break;
            
            case JUNE:
            case JULY:
            case AUGUST:
            case SEPTEMBER:
                dressing += "short shorts.";
                break;
                
            default;
                dressing += "clothing";
        }
        
        return dressing;
        
    }

    public static void main(String[] args)
    {
        SwitchStringClothes clothes = new SwitchStringClothes();
        for (int i = 0 ; i < args.length ; i++) {
            System.out.println("I got " + args[i]);
            String s  = clothes.dressMe(args[i]);
            System.out.println(s);
        }
    }
}
