public class Clase03{
    public static void main (String[] args){
        System.out.println("-- Clase03 --"); 

        //Operadores Java

        int nro1=5;
        int nro2=7;
        //  <----

        //Operador de asignación =

        System.out.println(nro1);   // 5
        System.out.println(nro2);   // 7

        nro1=nro2;

        System.out.println(nro1);   // 7
        System.out.println(nro2);   // 7

        //Operadores incrementales

        //sumar 1 a la variable     ++
        nro1++;                     // nro1=nro1+1;
        System.out.println(nro1);

        //Restar 1 a la variable    --
        nro1--;                     //nro1=nro1-1;
        System.out.println(nro1);

        //Sumar 5 a la variable     +=
        nro1+=5;                    //nro1=nro1+5;
        System.out.println(nro1);   

        //Restar 5 a la variable    -=
        nro1-=5;                    //nro1=nro1-5;
        System.out.println(nro1);

        //Multiplicar la variable   *=
        nro1*=5;                    //nro1=nro1*5;
        System.out.println(nro1);

        //Dividir la variable       /=
        nro1/=5;                    //nro1=nro1/5;
        System.out.println(nro1);

        //Post incremento y Pre incremento  ++ y --
        System.out.println(nro1);   //7
        System.out.println(nro1++); //7 es lo que se imprime en pantalla porque primero imprime y luego suma
        System.out.println(nro1);   //8
        System.out.println(++nro1); //9 primero suma y luego imprime

        //Operadores Lógicos

        /*
         *      Operador    Nombre
         *      &&          and
         *      ||          or
         *      ==          equals
         *      !=          not equals
         *      !           not
         *      < <= => >   comparación
         * 
         * 
        */

        /*
          *     Tabla de verdad

                X   Y       OR  AND
                F   F       F   F
                F   V       V   F
                V   F       V   F
                V   V       V   V


        
        */


        boolean log1=true;
        boolean log2=false;

        System.out.println(log1 || log2);       //true
        System.out.println(log1 && log2);       //false

        //or
        System.out.println("or");
        System.out.println(log2||log2);         //false
        System.out.println(log2||log1);         //true
        System.out.println(log1||log2);         //true
        System.out.println(log1||log1);         //true

        //and
        System.out.println(log2&&log2);         //false
        System.out.println(log2&&log1);         //false
        System.out.println(log1&&log2);         //false
        System.out.println(log1&&log1);         //true

        //Operador de comparación equals ==
        System.out.println(nro1 == 9);          //true
        System.out.println(nro1 == 7);          //false

        //Operador distinto not equals !=
        System.out.println(nro1!=9);            //false
        System.out.println(nro1!=7);            //true

        //Operadores de comparación < <= => >
        System.out.println(nro1<=10);           //true
        System.out.println(nro1>10);            //false

        //Operador Not !
        System.out.println(log1);               //true
        System.out.println(!log1);              //false
        System.out.println(!!log1);             //true  --> Cuando es par
        System.out.println(!!!log1);            //false --> Cuando es impar
        System.out.println(!!!!log1);           //true


        //Ejercicio 1

        boolean bn=true;
        byte    bt=8;        
        int     in=5;        
        long    lg=100;        
        float   fl=2.18f;        
        String  st="manzana";

        System.out.println(st);
        System.out.println(bn);
        System.out.println(bt);
        System.out.println(in);
        System.out.println(lg);
        System.out.println(fl);

        var var1=true;        
        var var2=500;
        var var3=500L;
        var var4=6.5f;
        var var5="hola";
        
        System.out.println(var1);
        System.out.println(var2);
        System.out.println(var3);
        System.out.println(var4);
        System.out.println(var5);

        var1=false;
        var2=40;
        var3=40L;
        var4=2.3f;

        System.out.println(var1);
        System.out.println(var2);
        System.out.println(var3);
        System.out.println(var4);
        System.out.println(var5);
       
    }

}