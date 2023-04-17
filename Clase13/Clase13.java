import java.text.DecimalFormat;
import java.util.Arrays;

public class Clase13{
    public static void main(String[] args) {
                //Vectores o Arrays

                int[] numeros=new int[4];       //Declaración de vector
                String[] nombres=new String[4];  
        
                numeros[0]=1;
                nombres[0]="Juan";
                numeros[1]=2;
                nombres[1]="Jose";
                numeros[2]=3;
                nombres[2]="Lorena";
                numeros[3]=4;
                nombres[3]="Ana";
                //numeros[4]=5;
                //nombres[4]="Mirta";
        
                /*
                 *  numeros     nombres         indice
                 *      1       Juan            0
                 *      2       Jose            1
                 *      3       Lorena          2
                 *      4       Ana             3
                 * 
                 */
        
                System.out.println(numeros[0]+" "+nombres[0]);
                System.out.println(numeros[1]+" "+nombres[1]);
                System.out.println(numeros[2]+" "+nombres[2]);
                System.out.println(numeros[3]+" "+nombres[3]);
        
                System.out.println("****************************");
                //Recorrido del vector
                for(int a=0; a<4; a++){
                    System.out.println(numeros[a]+" "+nombres[a]);
                }
        
                //Método length
                System.out.println("Longitud numeros: "+numeros.length);
        
                //Recorrido usando el método length
                System.out.println("****************************");
                for(int a=0; a<numeros.length; a++){
                    System.out.println(numeros[a]+" "+nombres[a]);
                }
        
                //Recorrido usando while
                System.out.println("****************************");
                int x=0;
                while(x<numeros.length){
                    System.out.println(numeros[x]+" "+nombres[x]);
                    x++;
                }

                // Declaración Abreviada
                int [] vector={10,23,29,26,39,38,65,10,46,38,10,7,12,17};
                System.out.println("Longitud vector: "+ vector.length);
                for (int a=0; a<vector.length; a++) System.out.print(vector[a]+", ");
                System.out.println();        
        
                //Totalizar un vector        
                //Promediar un vector

                int suma=0;
                for (int a=0; a<vector.length; a++){
                    suma+=vector[a];
                }
                System.out.println("Total: "+suma);
                System.out.println("Promedio: "+new DecimalFormat("0.00").format((double)suma/vector.length));
        
                //Máximos y Mínimos
                int max=vector[0];
                int min=vector[0];

                for (int a=0; a<vector.length; a++){
                    if(vector[a]>max)   max=vector[a];
                    if(vector[a]<min)   min=vector[a];
                }
                System.out.println("Valor máximo: "+max);
                System.out.println("Valor mínimo: "+min);

                //Contar Elementos

                // int cantPares=0;
                // int cantImpares=0;
                // int cant10=0;
                int cantPares=0, cantImpares=0, cant10=0;
                for (int a=0; a<vector.length; a++){
                    if(vector[a]%2==0)  cantPares++;
                    else                cantImpares++;
                    if(vector[a]==10)   cant10++;
                }
                System.out.println("Cantida de números pares: "+cantPares);
                System.out.println("Cantidad de números impares: "+cantImpares);
                System.out.println("Cantida de veces nro 10: "+cant10);
        
                //Copiar Vectores
                int[] pares={2,4,6,8,10};
                int[] impares= new int[pares.length];
                int[] pares2=new int[pares.length];

                /*
                 *      pares       impares
                 *      2           1
                 *      4           3       
                 *      6           5
                 *      8           7
                 *      10          9
                 * 
                 */

                for(int a=0; a<pares.length; a++) impares[a]=pares[a]-1; 
                for(int a=0; a<impares.length; a++) System.out.println(impares[a]+", "+pares[a]);
                System.arraycopy(pares, 0, pares2, 0, pares.length);
                for (int a=0; a<pares.length; a++) System.out.println(pares[a]+", "+pares2[a]);
        
                //Ordenar un vector
                for(int a=0; a<vector.length; a++) System.out.print(vector[a]+", ");
                System.out.println();
                Arrays.sort(vector);
                for(int a=0; a<vector.length; a++) System.out.print(vector[a]+", ");
                System.out.println();
                for(int a=vector.length-1; a>=0; a--) System.out.print(vector[a]+", ");
                System.out.println();

                System.out.println("******************************************");
                for(int a=0;a<nombres.length;a++)   System.out.println(nombres[a]);
                Arrays.sort(nombres);

                
                System.out.println("******************************************");
                for(int a=0;a<nombres.length;a++)   System.out.println(nombres[a]);
                






    }
}