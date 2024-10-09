/**
 */
package robotDSL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Control Structure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link robotDSL.ControlStructure#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see robotDSL.RobotDSLPackage#getControlStructure()
 * @model abstract="true"
 * @generated
 */
public interface ControlStructure extends Instruction {
	/**
	 * Returns the value of the '<em><b>Expression</b></em>' containment reference list.
	 * The list contents are of type {@link robotDSL.Expression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' containment reference list.
	 * @see robotDSL.RobotDSLPackage#getControlStructure_Expression()
	 * @model containment="true"
	 * @generated
	 */
	EList<Expression> getExpression();

} // ControlStructure
