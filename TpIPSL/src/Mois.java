
public class Mois {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner entree = new java.util.Scanner(System.in);
		System.out.println("Donner le num�ro du mois :");
		int a = entree.nextInt();
		int nb = 0;
		switch(a) {
		case 1 : nb =31; break;
		case 2 : nb =28; break;
		case 3 : nb =31; break;
		case 4 : nb =30; break;
		case 5 : nb =31; break;
		case 6 : nb =30; break;
		case 7 : nb =31; break;
		case 8 : nb =31; break;
		case 9 : nb =30; break;
		case 10 : nb =31; break;
		case 11 : nb =30; break;
		case 12 : nb =31; break;
		default : System.out.println("Le mois donn� n'existe pas, merci de r�assayer."); break;
		}
		System.out.println("Le mois " + a + " est compos� de "+ nb + "jours.");
	}

}
