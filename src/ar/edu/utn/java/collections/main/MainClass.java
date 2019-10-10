package ar.edu.utn.java.collections.main;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.*;

public class MainClass {

	public static void main(String[] args) {
	
		Set<Integer> enterosUnicos = new HashSet<>();
	    boolean noEsta = true;
	    Scanner  scan = new Scanner (System.in);
	    
	    while (noEsta) {
	    	noEsta = enterosUnicos.add(scan.nextInt());
	    }
		
	    System.out.println("ya esta");
		
	}

}


//Integer unEntero = 1;
//Integer otroEntero = new Integer(2);
//Integer elOtroEntero = Integer.valueOf("3");
//
//ArrayList<Integer> listaEnteros = new ArrayList();
//
//listaEnteros.add(unEntero);
//listaEnteros.add(elOtroEntero);
//
//System.out.println (unEntero * elOtroEntero);
//
////for(Integer entero: listaEnteros) {
////	System.out.println(entero);
////}
//
//HashSet<Integer> listaUnica = new HashSet<>();
//listaUnica.add(123);
//listaUnica.add(new Integer(123));
//listaUnica.add(321);
//listaUnica.add(123123);
//
//for(Integer elemento: listaUnica) {
//	System.out.println(elemento);
//}