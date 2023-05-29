package nezet;

import modell.Kert;
import modell.Noveny;

public class KertProgram 
{
    public static void main(String[] args) 
    {
        Kert kertem = new Kert();
        
        
        System.out.println(kertem.getKertem().toString());
        
        kertem.kerthezAd(new Noveny("bb22", 2000, "Tulipán", 2));
        kertem.kerthezAd(new Noveny("bb10", 500, "Málna", 6));
        
        System.out.println(kertem.getKertem().toString());
        
        
        kertem.elad("bb22");
        kertem.elad("ad14");
        
        System.out.println(kertem.getKertem().toString());
        
        kertem.szerializalas();
        
        kertem=null;
        
        kertem = new Kert();
        
        kertem.deszerializalas();
        
        System.out.println(kertem.getKertem().toString());
    }
}
