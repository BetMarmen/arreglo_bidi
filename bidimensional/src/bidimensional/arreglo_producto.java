package bidimensional;

import java.util.Scanner;

public class arreglo_producto {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Double[][] array=new Double[10][3];
        Double cant,pre;
        String[] texto={"Cantidad","Precio","Precio total"};
            for(int i=0;i<10;i++){
                System.out.print("Ingrese "+texto[0]);
                cant=sc.nextDouble();
                if(cant<9 & 0<cant)array[i][0]=cant;
                System.out.print("Ingrese "+texto[1]);
                pre=sc.nextDouble();
                if(pre<501 & 0<pre)array[i][1]=pre;
                if(array[i][1]==null | array[i][0]==null)i--;
            }
            imprimir(array,texto);
    }
    public static void imprimir(Double[][] a, String[] b){
        for(int i=0;i<3;i++){
            System.out.print(b[i]+" ");
        }
        System.out.println("");
        for(int i=0;i<10;i++){
            a[i][2]=a[i][0]*a[i][1];
            System.out.print(a[i][0]+"     "+a[i][1]+"     "+a[i][2]);
            System.out.println("    ");
        }
        System.out.println("");
    }
    

}
