public class Auto
{
    private String marke;
    private int ps;
    private boolean elektrisch;
    
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