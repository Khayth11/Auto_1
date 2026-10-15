public class Auto
{
    private String marke;
    private int ps;
    private boolean elektrisch;
    
     public Auto(String neuMarke, int neuPs, boolean neuElektrisch)
    {
        setMarke(neuMarke);
        setPs(neuPs);
        setElektrisch(neuElektrisch);
    }
    
     public Auto(String neuMarke, boolean neuElektrisch)
    {
        setMarke(neuMarke);
        setPs(0);
        setElektrisch(neuElektrisch);
    }
     
    public Auto(String neuMarke)
    {
        setMarke(neuMarke);
        setPs(0);
        setElektrisch(false);
    }
    

    
    public String getMarke()
    {
       return marke;
    }

    public int getPs()           
    {
    return ps;
    }
    
    public boolean getElektrisch()
    {
        return elektrisch;
    }

     public void setMarke(String neuMarke)
    {
        marke = neuMarke;
    }
    
    public void setPs(int neuPs)
    {
        ps = neuPs;
    }
    
    public void setElektrisch(boolean neuElektrisch)
    {
        elektrisch = neuElektrisch;
    }
    
}