package org.xtext.ipsl.calcul.interpreter;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;


import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.xtext.ipsl.calcul.CalculStandaloneSetup;
import org.xtext.ipsl.calcul.calcul.CALCUL;
import org.xtext.ipsl.calcul.calcul.EFFECTIF;
import org.xtext.ipsl.calcul.calcul.MODALITE;
import org.xtext.ipsl.calcul.calcul.STATISTIQUE;

public class StatInterpreter {

    public StatInterpreter() {
        // TODO Auto-generated constructor stub
    }

    public double interpret(String uri) {
        double result = 0.0;

        new CalculStandaloneSetup();
        CalculStandaloneSetup.doSetup();

        ResourceSet resourceSet = new ResourceSetImpl();
        Resource resource = resourceSet.getResource(URI.createURI(uri, true), true);
        EObject eobject = resource.getContents().get(0);
        CALCUL oprDSL = (CALCUL) eobject;
        STATISTIQUE statistique = oprDSL.getOperation();
        String resultat = statistique.getResultat();
        MODALITE mod = statistique.getModalite();
        EFFECTIF eff = statistique.getEffectif();
        double[] modalites = parseValues(mod.getValues());
        double[] effectifs = parseValues(eff.getValues());


     
        if (modalites.length == 0 || effectifs.length == 0) {
            System.out.println("Données manquantes : modalités ou effectifs non spécifiés.");
            return result;
        }

        if (resultat.equals("moyenne")) {
            double moyenne = calculateMean(modalites, effectifs);
            System.out.println("Moyenne : " + moyenne);
            result = moyenne;
        } else if (resultat.equals("mode")) {
            double mode = calculateMode(modalites, effectifs);
            System.out.println("Mode : " + mode);
            result = mode;
        } else if (resultat.equals("variance")) {
            double variance = calculateVariance(modalites, effectifs);
            System.out.println("Variance : " + variance);
            result = variance;
        } else if (resultat.equals("ecart-type")) {
            double variance = calculateVariance(modalites, effectifs);
            double ecartType = calculateStandardDeviation(variance);
            System.out.println("Écart type : " + ecartType);
            result = ecartType;
        } else {
            System.out.println("Opération statistique non prise en charge.");
        }

        return result;
    }

 
    
 

 private double[] parseValues(List<Double> values) {
     double[] array = new double[values.size()];
     for (int i = 0; i < values.size(); i++) {
         array[i] = values.get(i);
     }
     return array;
 }


    
    private double calculateMean(double[] modalites, double[] effectifs) {
        double sum = 0;
        double totalEffectif = 0;
        for (int i = 0; i < modalites.length; i++) {
            sum += modalites[i] * effectifs[i];
            totalEffectif += effectifs[i];
        }
        return sum / totalEffectif;
    }

    private double calculateMode(double[] modalites, double[] effectifs) {
        double mode = modalites[0];
        double maxEffectif = effectifs[0];
        for (int i = 1; i < modalites.length; i++) {
            if (effectifs[i] > maxEffectif) {
                mode = modalites[i];
                maxEffectif = effectifs[i];
            }
        }
        return mode;
    }

    private double calculateVariance(double[] modalites, double[] effectifs) {
        double mean = calculateMean(modalites, effectifs);
        double sumSquaredDifferences = 0;
        double totalEffectif = 0;
        for (int i = 0; i < modalites.length; i++) {
            double difference = modalites[i] - mean;
            sumSquaredDifferences += difference * difference * effectifs[i];
            totalEffectif += effectifs[i];
        }
        return sumSquaredDifferences / totalEffectif;
    }

    private double calculateStandardDeviation(double variance) {
        return Math.sqrt(variance);
    }

    public static void main(String[] args) {
        StatInterpreter f1 = new StatInterpreter();
        printFileContent("test.calcul");
        double res = f1.interpret("test.calcul");
        System.out.println("###########################");
        System.out.println("Result = " + res);
    }

    private static void printFileContent(String filePath) {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
