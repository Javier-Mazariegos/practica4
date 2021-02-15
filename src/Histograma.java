import java.util.*;
public class Histograma {
    static String parrafo = "";
    public static Scanner s = new Scanner(System.in);
    public static void llenar(int[][] cont)
    {
        for(int i =0; i<= 25; i++)
        {
            cont[i][0] = 65+i;
        }
        
        for(int i =0; i<= 25; i++)
        {
            cont[i][1] = 0;
        }

    }

    public static int[][] topchars(String s, int[][] cont)
    {
        int top10[][] = new int[10][2];
        for(int i = 0; i<= s.length()-1; i++)
        {
            char c = s.charAt(i);
            switch(c)
            {
                case 'A': cont[0][1] += 1; break; case 'B': cont[1][1] += 1; break; case 'C': cont[2][1] += 1; break; case 'D': cont[3][1] += 1; break; case 'E': cont[4][1] += 1; break; case 'F': cont[5][1] += 1; break; case 'G': cont[6][1] += 1; break;
                case 'H': cont[7][1] += 1; break; case 'I': cont[8][1] += 1; break; case 'J': cont[9][1] += 1; break; case 'K': cont[10][1] += 1; break; case 'L': cont[11][1] += 1; break; case 'M': cont[12][1] += 1; break; case 'N': cont[13][1] += 1; break;
                case 'O': cont[14][1] += 1; break; case 'P': cont[15][1] += 1; break; case 'Q': cont[16][1] += 1; break; case 'R': cont[17][1] += 1; break; case 'S': cont[18][1] += 1; break; case 'T': cont[19][1] += 1; break; case 'U': cont[20][1] += 1; break; 
                case 'V': cont[21][1] += 1; break; case 'W': cont[22][1] += 1; break; case 'X': cont[23][1] += 1; break; case 'Y': cont[24][1] += 1; break; case 'Z': cont[25][1] += 1; break; default: 
            }
        }


        Arrays.sort(cont,Comparator.comparingInt(o -> o[1]));

        for(int j=16; j<26; j++)
        {
            for(int i=0; i<2;i++)
            {
                top10[j-16][i] = cont[j][i];
            }
        }
        return top10;
    }

    public static void imprimirHistograma(int[][] top10)
    {
        System.out.println("\nHistograma: ");
        for(int i=9; i >= 0; i--)
        {
            System.out.print((char)top10[i][0] +"   "+ top10[i][1] + "   ");
            for(int j =0; j< top10[i][1]; j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) throws Exception {
       System.out.println("Bienvenido al programa que muestra el histograma de chars\n");
       System.out.println("Ingrese un parrafo: ");
       parrafo = s.nextLine();
       parrafo = parrafo.toUpperCase();
       int[][] cont = new int[26][2];
       llenar(cont);
        imprimirHistograma(topchars(parrafo, cont));
    } 
    
}
