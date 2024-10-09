/**
 */
package robotDSL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Classe Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link robotDSL.ClasseType#getVardeclaration <em>Vardeclaration</em>}</li>
 * </ul>
 *
 * @see robotDSL.RobotDSLPackage#getClasseType()
 * @model abstract="true"
 * @generated
 */
public interface ClasseType extends Expression {
	/**
	 * Returns the value of the '<em><b>Vardeclaration</b></em>' containment reference list.
	 * The list contents are of type {@link robotDSL.VarDeclaration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vardeclaration</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vardeclaration</em>' containment reference list.
	 * @see robotDSL.RobotDSLPackage#getClasseType_Vardeclaration()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<VarDeclaration> getVardeclaration();

} // ClasseType
