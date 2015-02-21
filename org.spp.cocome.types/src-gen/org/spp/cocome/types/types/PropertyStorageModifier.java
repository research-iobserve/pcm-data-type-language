/**
 */
package org.spp.cocome.types.types;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Property Storage Modifier</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.spp.cocome.types.types.TypesPackage#getPropertyStorageModifier()
 * @model
 * @generated
 */
public enum PropertyStorageModifier implements Enumerator
{
  /**
   * The '<em><b>VARIABLE</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #VARIABLE_VALUE
   * @generated
   * @ordered
   */
  VARIABLE(0, "VARIABLE", "var"),

  /**
   * The '<em><b>VALUE</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #VALUE_VALUE
   * @generated
   * @ordered
   */
  VALUE(1, "VALUE", "val"),

  /**
   * The '<em><b>TRANSIENT</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #TRANSIENT_VALUE
   * @generated
   * @ordered
   */
  TRANSIENT(2, "TRANSIENT", "transient");

  /**
   * The '<em><b>VARIABLE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>VARIABLE</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #VARIABLE
   * @model literal="var"
   * @generated
   * @ordered
   */
  public static final int VARIABLE_VALUE = 0;

  /**
   * The '<em><b>VALUE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>VALUE</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #VALUE
   * @model literal="val"
   * @generated
   * @ordered
   */
  public static final int VALUE_VALUE = 1;

  /**
   * The '<em><b>TRANSIENT</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>TRANSIENT</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #TRANSIENT
   * @model literal="transient"
   * @generated
   * @ordered
   */
  public static final int TRANSIENT_VALUE = 2;

  /**
   * An array of all the '<em><b>Property Storage Modifier</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final PropertyStorageModifier[] VALUES_ARRAY =
    new PropertyStorageModifier[]
    {
      VARIABLE,
      VALUE,
      TRANSIENT,
    };

  /**
   * A public read-only list of all the '<em><b>Property Storage Modifier</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<PropertyStorageModifier> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Property Storage Modifier</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static PropertyStorageModifier get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      PropertyStorageModifier result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Property Storage Modifier</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static PropertyStorageModifier getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      PropertyStorageModifier result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Property Storage Modifier</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static PropertyStorageModifier get(int value)
  {
    switch (value)
    {
      case VARIABLE_VALUE: return VARIABLE;
      case VALUE_VALUE: return VALUE;
      case TRANSIENT_VALUE: return TRANSIENT;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final int value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String name;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String literal;

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private PropertyStorageModifier(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //PropertyStorageModifier
