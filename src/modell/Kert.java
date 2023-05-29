package modell;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Kert 
{
    private ArrayList<Noveny> kertem = new ArrayList<>();

    public Kert() 
    {
        kertem.add(new Noveny("ad14", 1000, "Pitypang", 20));
        kertem.add(new Noveny("ad15", 1500, "Rózsa", 5));
    }

    public ArrayList<Noveny> getKertem()
    {
        return kertem;
    }
    
    public void kerthezAd(Noveny noveny)
    {
        kertem.add(noveny);
    }
    
    public void elad(String id)
    {
        int i=0;
        boolean nincsMeg=true;
        while(i<kertem.size() && nincsMeg)
        {
            if(kertem.get(i).getId().equals(id))
            {
                nincsMeg=false;
                kertem.remove(i);
            }
            i++;
        }
    }
    
    public void szerializalas()
    {
        FileOutputStream kiFajl;
        try 
        {
            kiFajl = new FileOutputStream("kert.bin");
            ObjectOutputStream kiObj = new ObjectOutputStream(kiFajl);
            kiObj.writeObject(kertem);
            kiObj.close();
            kiFajl.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Kert.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Kert.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void deszerializalas()
    {
        FileInputStream beFajl;
        try 
        {
            beFajl = new FileInputStream("kert.bin");
            ObjectInputStream beObj = new ObjectInputStream(beFajl);
            kertem = (ArrayList<Noveny>)beObj.readObject();
            beObj.close();
            beFajl.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Kert.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(Kert.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public String toString() {
        return "Kert{" + "kertem=" + kertem + '}';
    }
}
