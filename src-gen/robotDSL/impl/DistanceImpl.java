/**
 */
package robotDSL.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import robotDSL.Distance;
import robotDSL.MoveInstruction;
import robotDSL.RobotDSLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Distance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link robotDSL.impl.DistanceImpl#getValue <em>Value</em>}</li>
 *   <li>{@link robotDSL.impl.DistanceImpl#getMoveinstruction <em>Moveinstruction</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class DistanceImpl extends ClasseTypeImpl implements Distance {
	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final double VALUE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected double value = VALUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMoveinstruction() <em>Moveinstruction</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMoveinstruction()
	 * @generated
	 * @ordered
	 */
	protected MoveInstruction moveinstruction;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DistanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RobotDSLPackage.Literals.DISTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(double newValue) {
		double oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RobotDSLPackage.DISTANCE__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MoveInstruction getMoveinstruction() {
		if (moveinstruction != null && moveinstruction.eIsProxy()) {
			InternalEObject oldMoveinstruction = (InternalEObject) moveinstruction;
			moveinstruction = (MoveInstruction) eResolveProxy(oldMoveinstruction);
			if (moveinstruction != oldMoveinstruction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RobotDSLPackage.DISTANCE__MOVEINSTRUCTION,
							oldMoveinstruction, moveinstruction));
			}
		}
		return moveinstruction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MoveInstruction basicGetMoveinstruction() {
		return moveinstruction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMoveinstruction(MoveInstruction newMoveinstruction, NotificationChain msgs) {
		MoveInstruction oldMoveinstruction = moveinstruction;
		moveinstruction = newMoveinstruction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					RobotDSLPackage.DISTANCE__MOVEINSTRUCTION, oldMoveinstruction, newMoveinstruction);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMoveinstruction(MoveInstruction newMoveinstruction) {
		if (newMoveinstruction != moveinstruction) {
			NotificationChain msgs = null;
			if (moveinstruction != null)
				msgs = ((InternalEObject) moveinstruction).eInverseRemove(this,
						RobotDSLPackage.MOVE_INSTRUCTION__DISTANCE, MoveInstruction.class, msgs);
			if (newMoveinstruction != null)
				msgs = ((InternalEObject) newMoveinstruction).eInverseAdd(this,
						RobotDSLPackage.MOVE_INSTRUCTION__DISTANCE, MoveInstruction.class, msgs);
			msgs = basicSetMoveinstruction(newMoveinstruction, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RobotDSLPackage.DISTANCE__MOVEINSTRUCTION,
					newMoveinstruction, newMoveinstruction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case RobotDSLPackage.DISTANCE__MOVEINSTRUCTION:
			if (moveinstruction != null)
				msgs = ((InternalEObject) moveinstruction).eInverseRemove(this,
						RobotDSLPackage.MOVE_INSTRUCTION__DISTANCE, MoveInstruction.class, msgs);
			return basicSetMoveinstruction((MoveInstruction) otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case RobotDSLPackage.DISTANCE__MOVEINSTRUCTION:
			return basicSetMoveinstruction(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case RobotDSLPackage.DISTANCE__VALUE:
			return getValue();
		case RobotDSLPackage.DISTANCE__MOVEINSTRUCTION:
			if (resolve)
				return getMoveinstruction();
			return basicGetMoveinstruction();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case RobotDSLPackage.DISTANCE__VALUE:
			setValue((Double) newValue);
			return;
		case RobotDSLPackage.DISTANCE__MOVEINSTRUCTION:
			setMoveinstruction((MoveInstruction) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case RobotDSLPackage.DISTANCE__VALUE:
			setValue(VALUE_EDEFAULT);
			return;
		case RobotDSLPackage.DISTANCE__MOVEINSTRUCTION:
			setMoveinstruction((MoveInstruction) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case RobotDSLPackage.DISTANCE__VALUE:
			return value != VALUE_EDEFAULT;
		case RobotDSLPackage.DISTANCE__MOVEINSTRUCTION:
			return moveinstruction != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (value: ");
		result.append(value);
		result.append(')');
		return result.toString();
	}

} //DistanceImpl
