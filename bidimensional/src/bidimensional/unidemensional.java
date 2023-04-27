package bidimensional;

import java.util.Scanner;

public class unidemensional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		 Double[] a=new Double[5];
	        for(int i=0;i<5;i++){
	        	do {
	            System.out.println("Ingrese un numero entre 1 y 5 #"+i+1);
	            a[i]=sc.nextDouble();
	        	}
	        	while(a[i]<1 && 6< a[i]);
	            
	        }
	        Double mul=0.0,div=0.0,sum=0.0,res=0.0;
	        for(int i=0;i<5;i++){
	            if(i==0){
	                mul=a[i];
	                div=a[i];
	                sum=a[i];
	                res=a[i];
	            }else{
	                mul=mul*a[i];
	                res=res-a[i];
	                sum=sum+a[i];
	                div=div/a[i];
	            }
	        }
	        System.out.println(mul+"\n"+div+"\n"+sum+"\n"+res+"\n");
		}

	}


