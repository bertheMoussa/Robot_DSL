/**
 */
package robotDSL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Repeat Instruction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link robotDSL.RepeatInstruction#getBlock <em>Block</em>}</li>
 * </ul>
 *
 * @see robotDSL.RobotDSLPackage#getRepeatInstruction()
 * @model
 * @generated
 */
public interface RepeatInstruction extends ControlStructure {
	/**
	 * Returns the value of the '<em><b>Block</b></em>' containment reference list.
	 * The list contents are of type {@link robotDSL.Block}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Block</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Block</em>' containment reference list.
	 * @see robotDSL.RobotDSLPackage#getRepeatInstruction_Block()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Block> getBlock();

} // RepeatInstruction
