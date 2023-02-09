public class Nombre extends Expression{
    private int valeurNombre;
    
    public Nombre(int valeurNombre){
        this.valeurNombre = valeurNombre;
    }

    public int valeur(){
        return valeurNombre;
    }
    
    public String toString(){
        String recap = this.valeurNombre + "";
        return recap;
    }
}