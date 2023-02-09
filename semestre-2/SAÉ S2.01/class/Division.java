public class Division extends Operation{

    public Division(Expression op1, Expression op2){
        super(op1, op2);
    }
    
    public int valeur(){
        return this.getOPerande1().valeur() / this.getOPerande2().valeur();
    }

    public String toString(){
        String recap = "(" + this.getOPerande1() + "/" + this.getOPerande2() + ")";
        return recap;
    }
}