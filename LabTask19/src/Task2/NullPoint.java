package Task2;
public class NullPoint {
    public static void main (String [] args)
    {
        String ptr = null;
        try
        {
            if (ptr.equals("Qasim"))
                System.out.print("Same");
            else
                System.out.print("Not Same");
        }
        catch(NullPointerException e)
        {
            System.out.print("NullPointerException Caught");
        }
        catch (Exception e) {
            System.out.println("Exception occurred");
        }
    }
}
