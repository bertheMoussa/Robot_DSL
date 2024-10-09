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
 * An implementation of the model object '<em><b>Move Instruction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link robotDSL.impl.MoveInstructionImpl#getDistance <em>Distance</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MoveInstructionImpl extends InstructionImpl implements MoveInstruction {
	/**
	 * The cached value of the '{@link #getDistance() <em>Distance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistance()
	 * @generated
	 * @ordered
	 */
	protected Distance distance;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MoveInstructionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RobotDSLPackage.Literals.MOVE_INSTRUCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Distance getDistance() {
		if (distance != null && distance.eIsProxy()) {
			InternalEObject oldDistance = (InternalEObject) distance;
			distance = (Distance) eResolveProxy(oldDistance);
			if (distance != oldDistance) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							RobotDSLPackage.MOVE_INSTRUCTION__DISTANCE, oldDistance, distance));
			}
		}
		return distance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Distance basicGetDistance() {
		return distance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDistance(Distance newDistance, NotificationChain msgs) {
		Distance oldDistance = distance;
		distance = newDistance;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					RobotDSLPackage.MOVE_INSTRUCTION__DISTANCE, oldDistance, newDistance);
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
	public void setDistance(Distance newDistance) {
		if (newDistance != distance) {
			NotificationChain msgs = null;
			if (distance != null)
				msgs = ((InternalEObject) distance).eInverseRemove(this, RobotDSLPackage.DISTANCE__MOVEINSTRUCTION,
						Distance.class, msgs);
			if (newDistance != null)
				msgs = ((InternalEObject) newDistance).eInverseAdd(this, RobotDSLPackage.DISTANCE__MOVEINSTRUCTION,
						Distance.class, msgs);
			msgs = basicSetDistance(newDistance, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RobotDSLPackage.MOVE_INSTRUCTION__DISTANCE,
					newDistance, newDistance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case RobotDSLPackage.MOVE_INSTRUCTION__DISTANCE:
			if (distance != null)
				msgs = ((InternalEObject) distance).eInverseRemove(this, RobotDSLPackage.DISTANCE__MOVEINSTRUCTION,
						Distance.class, msgs);
			return basicSetDistance((Distance) otherEnd, msgs);
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
		case RobotDSLPackage.MOVE_INSTRUCTION__DISTANCE:
			return basicSetDistance(null, msgs);
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
		case RobotDSLPackage.MOVE_INSTRUCTION__DISTANCE:
			if (resolve)
				return getDistance();
			return basicGetDistance();
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
		case RobotDSLPackage.MOVE_INSTRUCTION__DISTANCE:
			setDistance((Distance) newValue);
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
		case RobotDSLPackage.MOVE_INSTRUCTION__DISTANCE:
			setDistance((Distance) null);
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
		case RobotDSLPackage.MOVE_INSTRUCTION__DISTANCE:
			return distance != null;
		}
		return super.eIsSet(featureID);
	}

} //MoveInstructionImpl
