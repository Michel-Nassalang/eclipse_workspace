package org.xtext.ipsl.interpreter;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.xtext.ipsl.figure.FigureStandaloneSetup;
import org.xtext.ipsl.figure.figure.DIMENSION;
import org.xtext.ipsl.figure.figure.PROGRAMME;
import org.xtext.ipsl.figure.figure.REEL;
import org.xtext.ipsl.figure.figure.RETURN;

public class FigureInterpreter {

	public FigureInterpreter() {
		// TODO Auto-generated constructor stub
	}
	
	public String runFigure(String url) {
		double result = 0.0;
		String sortie = "";
		new FigureStandaloneSetup();
		FigureStandaloneSetup.doSetup();
		ResourceSet resourceset = new ResourceSetImpl();
		Resource resource = resourceset.getResource(URI.createURI(url, true), true);
		EObject eobject = resource.getContents().get(0);
		PROGRAMME figDSL = (PROGRAMME) eobject;
		DIMENSION dimClass = figDSL.getDim();
		REEL longueur = dimClass.getLongueur();
		REEL largeur = dimClass.getLargeur();
		RETURN ret = figDSL.getRet();
		var operation = ret.getResultat();
		if (operation.equals("surface")) {
			result = longueur.getReel() * largeur.getReel();
			sortie = "Surface: " + result;
		}else if(operation.equals("perimetre")) {
			result = (longueur.getReel() + largeur.getReel()) * 2;
			sortie = "Perimètre: " + result;
		}else {
			result = -1.0;
			sortie = "Erreur: " + result;
		}
		return sortie;
	}
	public static void readFile(String fileName) {
		try
	    {
	      FileInputStream file = new FileInputStream(fileName);   
	      Scanner scanner = new Scanner(file);  
	      
	      while(scanner.hasNextLine())
	      {
	        System.out.println(scanner.nextLine());
	      }
	      scanner.close();    
	    }
	    catch(IOException e)
	    {
	      e.printStackTrace();
	    }
	}
	
	public static void main(String[] args) {
		FigureInterpreter fg = new FigureInterpreter();
		readFile("test.fg");
		String res = fg.runFigure("test.fg");
		System.out.println("##########################");
		System.out.println(res);
	}
}
