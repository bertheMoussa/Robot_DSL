/**
 */
package robotDSL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Proc Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link robotDSL.ProcCall#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see robotDSL.RobotDSLPackage#getProcCall()
 * @model
 * @generated
 */
public interface ProcCall extends Expression {
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
	 * @see robotDSL.RobotDSLPackage#getProcCall_Expression()
	 * @model containment="true"
	 * @generated
	 */
	EList<Expression> getExpression();

} // ProcCall
