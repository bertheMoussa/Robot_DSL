/**
 */
package robotDSL;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Distance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link robotDSL.Distance#getValue <em>Value</em>}</li>
 *   <li>{@link robotDSL.Distance#getMoveinstruction <em>Moveinstruction</em>}</li>
 * </ul>
 *
 * @see robotDSL.RobotDSLPackage#getDistance()
 * @model abstract="true"
 * @generated
 */
public interface Distance extends ClasseType {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(double)
	 * @see robotDSL.RobotDSLPackage#getDistance_Value()
	 * @model
	 * @generated
	 */
	double getValue();

	/**
	 * Sets the value of the '{@link robotDSL.Distance#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(double value);

	/**
	 * Returns the value of the '<em><b>Moveinstruction</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link robotDSL.MoveInstruction#getDistance <em>Distance</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Moveinstruction</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Moveinstruction</em>' reference.
	 * @see #setMoveinstruction(MoveInstruction)
	 * @see robotDSL.RobotDSLPackage#getDistance_Moveinstruction()
	 * @see robotDSL.MoveInstruction#getDistance
	 * @model opposite="distance"
	 * @generated
	 */
	MoveInstruction getMoveinstruction();

	/**
	 * Sets the value of the '{@link robotDSL.Distance#getMoveinstruction <em>Moveinstruction</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Moveinstruction</em>' reference.
	 * @see #getMoveinstruction()
	 * @generated
	 */
	void setMoveinstruction(MoveInstruction value);

} // Distance
