
public class Anneebixestile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner entree = new java.util.Scanner(System.in);
		System.out.println("Donner une ann�e :");
		int a  = entree.nextInt();
		if(a%4==0 && a%100!=0) {
			System.out.println("L'ann�e est bissextile.");
		}
		else {
			System.out.println("L'ann�e n'est pas bissextile.");
		}
	}

}
