package zadacha4;

import java.util.Scanner;

public class ClassMain {
	public static void main(String[] args) {
		boolean stop = false;
		 Scanner vlez = new Scanner(System.in);
		Brojach br = new Brojach();
	    while (!stop) {
	    	System.out.println("Za frlanje na parichkata vnesete 1 ");
	    	System.out.println("Za resetiranje na brojachot vnesete 2 ");
	    	System.out.println("Za izlez vnesete 0 ");
	        int a = vlez.nextInt();
	        switch (a) {
	            case 0:
	                stop = true;
	                break;
	            case 1:
	            	System.out.println("Kolku pati da se frli parichkata?");
	            	int b = vlez.nextInt();	
	            	for (int i = 0; i < b; i++) {
	            		if (Math.random() < 0.5) {
	            			System.out.println("Glava");
	            			br.ZgolemuvanjeX();
	            		}
	            		else {
	            			System.out.println("Pismo");
	            			br.ZgolemuvanjeY();
	            		}
	            	}
	            	System.out.println("Glava: " + br.x);
	            	System.out.println("Pismo: " + br.y);
	            	break;
	            case 2:
	                System.out.println("Brojachot e resetiran: ");
	                br.Reset();
	            	System.out.println("Glava: " + br.x);
	            	System.out.println("Pismo: " + br.y);
	                break;
	            default:
	                System.out.println("Vnesovte nevaliden broj!");
	                break;
	        }
	    }
	    vlez.close();
	}
}

