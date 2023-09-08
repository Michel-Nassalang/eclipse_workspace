package Exercice1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Wordcount {
	

	public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        
        System.out.println("Veuillez donner le chemin d'accès du fichier en tant qu'argument.");
        String filePath = scanner.next();
        int wordCount = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.split("[\\s,.;:!?]+"); // Divise la ligne en mots en utilisant les identifacteurs comme séparateurs
                wordCount += words.length;
            }
        } catch (IOException e) {
            System.out.println("Erreur lors de la lecture du fichier : " + e.getMessage());
            System.exit(1);
        }

        System.out.println("Nombre de mots : " + wordCount);
    }
}

