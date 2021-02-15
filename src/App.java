import java.util.*;
public class App {
    public static String palabras[] = {"NANNAN", "NAURRUAN", "NBN", "NEN", "NEVEN", "NGN", "NIN", "NISIN", "NMN", "NN", "NON", "NOON", "NRN", "NSN", "NUN", "O", "OBO", "OGO", "OGOPOOGO", "OHO", "ONO", "OO", "OOO", "OPPO", "OSO", "OTO", "OTTO", "OWO", "OXO", "P", "PAP", "PBP", "PCP", "PDP", "PEEP", "PEP", "PGP", "PHP", "PIP", "PIPIPIP", "PNP", "POOP", "POP", "PP", "PPP", "PRP", "PSP", "PULLUP", "PUP", "PVP", "PWP", "PZP", "Q", "QAANAAQ", "QAZAQ", "QOQ", "QQ", "R", "RACECARS", "RADAR", "RAR", "REDDER", "REDIVIDER", "REER", "REFER"};
                                     
    public static int[] palindrome(String[] pal)
    {
        int[] contador = new int[pal.length];
        int c = 0;
        for (String i : pal) {
            String reversa = "";
            for(int j = i.length()-1; j>=0; j--)
            {
                reversa += i.charAt(j);
            }
            if(reversa.equals(i))
            {
                contador[c] = 1;
            }
            else{
                contador[c] = 0;
            }
            c++;
        }
        return contador;
    } 
    public static void main(String[] args) throws Exception {
        int c = 0;
        for (int i : palindrome(palabras))
        {
            if(i == 0)
            {
                System.out.println("La plabra: "+ palabras[c] + " no es palindrome");
            }
            c++;
        }
    }
}
