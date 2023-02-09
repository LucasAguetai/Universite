public class Calculatrice {
	public static void main(String[] args) {
       try {
          Expression deux = new Nombre(2) ;
          Expression trois = new Nombre(3) ;
          Expression dixSept = new Nombre(17) ;
          Expression douze = new Nombre(12);
          Expression zero = new Nombre(0);

          Expression s = new Soustraction(dixSept, deux);
          Expression a = new Addition(deux, trois);
          Expression b = new Multiplication(douze, trois);
          Expression d = new Division(s, a);
          Expression k = new Multiplication(b, s);
          Expression j = new Soustraction(k, dixSept);
          Expression n = new Division(douze, zero);

          System.out.println(d + " = " + d.valeur()) ; // affiche ((17 - 2) / (2 + 3))
          System.out.println(k + " = " + k.valeur()) ; // affiche ((12 * 3) * (17 - 2))
          System.out.println(j + " = " + j.valeur()) ; // affiche (((12 * 3) * (17 - 2)) - 17)
          System.out.println(n + " = " + n.valeur()) ; // affiche On ne peut pas diviser par 0, veuillez changer votre nombre s'il vous plait.
       }

        catch (ArithmeticException e){
            System.out.println("On ne peut pas diviser par 0, veuillez changer votre nombre s'il vous plait.");
       }

       finally {
          System.out.println("Fin des calculs !");
     }
    }
}