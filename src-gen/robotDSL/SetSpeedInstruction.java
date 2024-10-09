/**
 */
package robotDSL;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Set Speed Instruction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link robotDSL.SetSpeedInstruction#getSpeed <em>Speed</em>}</li>
 * </ul>
 *
 * @see robotDSL.RobotDSLPackage#getSetSpeedInstruction()
 * @model
 * @generated
 */
public interface SetSpeedInstruction extends Instruction {
	/**
	 * Returns the value of the '<em><b>Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Speed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Speed</em>' attribute.
	 * @see #setSpeed(float)
	 * @see robotDSL.RobotDSLPackage#getSetSpeedInstruction_Speed()
	 * @model
	 * @generated
	 */
	float getSpeed();

	/**
	 * Sets the value of the '{@link robotDSL.SetSpeedInstruction#getSpeed <em>Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Speed</em>' attribute.
	 * @see #getSpeed()
	 * @generated
	 */
	void setSpeed(float value);

} // SetSpeedInstruction
