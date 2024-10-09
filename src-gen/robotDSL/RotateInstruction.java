/**
 */
package robotDSL;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rotate Instruction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link robotDSL.RotateInstruction#getAngle <em>Angle</em>}</li>
 * </ul>
 *
 * @see robotDSL.RobotDSLPackage#getRotateInstruction()
 * @model
 * @generated
 */
public interface RotateInstruction extends Primitive {
	/**
	 * Returns the value of the '<em><b>Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Angle</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Angle</em>' attribute.
	 * @see #setAngle(double)
	 * @see robotDSL.RobotDSLPackage#getRotateInstruction_Angle()
	 * @model
	 * @generated
	 */
	double getAngle();

	/**
	 * Sets the value of the '{@link robotDSL.RotateInstruction#getAngle <em>Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Angle</em>' attribute.
	 * @see #getAngle()
	 * @generated
	 */
	void setAngle(double value);

} // RotateInstruction
