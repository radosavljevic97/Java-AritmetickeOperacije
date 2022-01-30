// Na standardni ulaz se unose dva cela broja.
// Ispisati na standardnom izlazu u zasebnim redovima zbir, razliku, proizvod, kolicnik i ostatak deljenja prvog broja drugim
//tim redom

package Domaci0312;

public class AritmetickeOperacije {
    public static void main(String[] args) {

        int prviBroj = 30;
        int drugiBroj =5;

        //Prvi nacin

        System.out.println(prviBroj + drugiBroj);
        System.out.println(prviBroj - drugiBroj);
        System.out.println(prviBroj * drugiBroj);
        System.out.println(prviBroj / drugiBroj);
        System.out.println(prviBroj % drugiBroj);

        //Drugi nacin

        System.out.print(prviBroj + drugiBroj + "\n" + (prviBroj - drugiBroj) + "\n" + (prviBroj * drugiBroj) + "\n" + (prviBroj / drugiBroj) + "\n" + (prviBroj % drugiBroj) );



    }
}

