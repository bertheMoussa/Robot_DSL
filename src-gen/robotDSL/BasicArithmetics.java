/**
 */
package robotDSL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Basic Arithmetics</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link robotDSL.BasicArithmetics#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see robotDSL.RobotDSLPackage#getBasicArithmetics()
 * @model abstract="true"
 * @generated
 */
public interface BasicArithmetics extends Expression {
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
	 * @see robotDSL.RobotDSLPackage#getBasicArithmetics_Expression()
	 * @model containment="true"
	 * @generated
	 */
	EList<Expression> getExpression();

} // BasicArithmetics
