/**
 */
package robotDSL.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import robotDSL.ClasseType;
import robotDSL.RobotDSLPackage;
import robotDSL.VarDeclaration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Classe Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link robotDSL.impl.ClasseTypeImpl#getVardeclaration <em>Vardeclaration</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ClasseTypeImpl extends ExpressionImpl implements ClasseType {
	/**
	 * The cached value of the '{@link #getVardeclaration() <em>Vardeclaration</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVardeclaration()
	 * @generated
	 * @ordered
	 */
	protected EList<VarDeclaration> vardeclaration;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClasseTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RobotDSLPackage.Literals.CLASSE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VarDeclaration> getVardeclaration() {
		if (vardeclaration == null) {
			vardeclaration = new EObjectContainmentEList<VarDeclaration>(VarDeclaration.class, this,
					RobotDSLPackage.CLASSE_TYPE__VARDECLARATION);
		}
		return vardeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case RobotDSLPackage.CLASSE_TYPE__VARDECLARATION:
			return ((InternalEList<?>) getVardeclaration()).basicRemove(otherEnd, msgs);
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
		case RobotDSLPackage.CLASSE_TYPE__VARDECLARATION:
			return getVardeclaration();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case RobotDSLPackage.CLASSE_TYPE__VARDECLARATION:
			getVardeclaration().clear();
			getVardeclaration().addAll((Collection<? extends VarDeclaration>) newValue);
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
		case RobotDSLPackage.CLASSE_TYPE__VARDECLARATION:
			getVardeclaration().clear();
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
		case RobotDSLPackage.CLASSE_TYPE__VARDECLARATION:
			return vardeclaration != null && !vardeclaration.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ClasseTypeImpl
