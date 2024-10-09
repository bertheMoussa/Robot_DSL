/**
 */
package robotDSL;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Move Instruction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link robotDSL.MoveInstruction#getDistance <em>Distance</em>}</li>
 * </ul>
 *
 * @see robotDSL.RobotDSLPackage#getMoveInstruction()
 * @model
 * @generated
 */
public interface MoveInstruction extends Instruction {
	/**
	 * Returns the value of the '<em><b>Distance</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link robotDSL.Distance#getMoveinstruction <em>Moveinstruction</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Distance</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distance</em>' reference.
	 * @see #setDistance(Distance)
	 * @see robotDSL.RobotDSLPackage#getMoveInstruction_Distance()
	 * @see robotDSL.Distance#getMoveinstruction
	 * @model opposite="moveinstruction" required="true"
	 * @generated
	 */
	Distance getDistance();

	/**
	 * Sets the value of the '{@link robotDSL.MoveInstruction#getDistance <em>Distance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distance</em>' reference.
	 * @see #getDistance()
	 * @generated
	 */
	void setDistance(Distance value);

} // MoveInstruction
