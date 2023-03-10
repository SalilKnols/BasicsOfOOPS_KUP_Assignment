package BasicsOfOOPS_Question1;

public class CopyValues
{
    String companyName;
    CopyValues(String companyName)
    {
        this.companyName=companyName;
    }

    CopyValues(CopyValues object)
    {
        this.companyName=object.companyName;
    }

    public static void main(String[] args)
    {
        CopyValues copy1 = new CopyValues("Knoldus");
        System.out.println("Object 1: "+copy1.companyName);

        CopyValues copy2 = new CopyValues(copy1);
        System.out.println("Object 2: "+copy2.companyName);
    }
}