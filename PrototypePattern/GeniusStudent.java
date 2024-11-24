package PrototypePattern;

public class GeniusStudent extends Student {
    private int iq;

    public void setIq(int iq) {
        this.iq = iq;
    }

    public int getIq() {
        return this.iq;
    }

    @Override
    public String toString() {
        return(super.toString() + " Iq : " + this.iq); 
    }

    @Override
    public GeniusStudent clone() { 
        GeniusStudent copy = new GeniusStudent();
        
        copy.setId(this.getId());
        copy.setName(this.getName());
        copy.setPsp(this.getPsp());

        copy.iq = this.iq;

        return copy;
    }
}
