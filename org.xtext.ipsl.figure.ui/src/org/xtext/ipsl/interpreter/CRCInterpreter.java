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
import org.xtext.ipsl.figure.figure.CARRE;
import org.xtext.ipsl.figure.figure.CERCLE;
import org.xtext.ipsl.figure.figure.FIGURE;
import org.xtext.ipsl.figure.figure.PROGRAMME;
import org.xtext.ipsl.figure.figure.RECTANGLE;
import org.xtext.ipsl.figure.figure.REEL;

public class CRCInterpreter {

	public CRCInterpreter() {
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
		FIGURE fig = figDSL.getFig();
		
		String nom = fig.getNom().toString();
		if(nom.contains("RECTANGLE")) {
			RECTANGLE rect = (RECTANGLE) fig.getNom();
			REEL longueur = rect.getLongueur();
			REEL largeur = rect.getLargeur();
			String operation = rect.getRetour().getResultat();
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
			
		}else if(nom.contains("CARRE")) {

			CARRE carre = (CARRE) fig.getNom();
			REEL cote = carre.getCote();
			String operation = carre.getRetour().getResultat();
			if (operation.equals("surface")) {
				result = cote.getReel() * cote.getReel();
				sortie = "Surface: " + result;
			}else if(operation.equals("perimetre")) {
				result = cote.getReel() * 4;
				sortie = "Perimètre: " + result;
			}else {
				result = -1.0;
				sortie = "Erreur: " + result;
			}
			
		}else if(nom.contains("CERCLE")) {

			CERCLE cer = (CERCLE) fig.getNom();
			REEL rayon = cer.getRayon();
			String operation = cer.getRetour().getResultat();
			if (operation.equals("surface")) {
				result = Math.PI * rayon.getReel()*rayon.getReel();
				sortie = "Surface: " + result;
			}else if(operation.equals("perimetre")) {
				result =  2 * Math.PI * rayon.getReel();
				sortie = "Perimètre: " + result;
			}else {
				result = -1.0;
				sortie = "Erreur: " + result;
			}
			
		}else {
			sortie = "Erreur sur la figure";
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
		CRCInterpreter crc = new CRCInterpreter();
		readFile("test.fg");
		String res = crc.runFigure("test.fg");
		System.out.println("##########################");
		System.out.println(res);
	}
}
