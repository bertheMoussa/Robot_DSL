/**
 */
package robotDSL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>If Instruction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link robotDSL.IfInstruction#getBlock <em>Block</em>}</li>
 * </ul>
 *
 * @see robotDSL.RobotDSLPackage#getIfInstruction()
 * @model
 * @generated
 */
public interface IfInstruction extends ControlStructure {
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
	 * @see robotDSL.RobotDSLPackage#getIfInstruction_Block()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Block> getBlock();

} // IfInstruction
