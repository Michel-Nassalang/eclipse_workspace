/**
 */
package Enseignement;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see Enseignement.EnseignementPackage
 * @generated
 */
public interface EnseignementFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EnseignementFactory eINSTANCE = Enseignement.impl.EnseignementFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Domaine</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Domaine</em>'.
	 * @generated
	 */
	Domaine createDomaine();

	/**
	 * Returns a new object of class '<em>Enseignant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enseignant</em>'.
	 * @generated
	 */
	Enseignant createEnseignant();

	/**
	 * Returns a new object of class '<em>Departement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Departement</em>'.
	 * @generated
	 */
	Departement createDepartement();

	/**
	 * Returns a new object of class '<em>Universite</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Universite</em>'.
	 * @generated
	 */
	Universite createUniversite();

	/**
	 * Returns a new object of class '<em>Etudiant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Etudiant</em>'.
	 * @generated
	 */
	Etudiant createEtudiant();

	/**
	 * Returns a new object of class '<em>Note</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Note</em>'.
	 * @generated
	 */
	Note createNote();

	/**
	 * Returns a new object of class '<em>Matiere</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Matiere</em>'.
	 * @generated
	 */
	Matiere createMatiere();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	EnseignementPackage getEnseignementPackage();

} //EnseignementFactory
