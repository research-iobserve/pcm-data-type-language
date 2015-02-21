/**
 */
package org.spp.cocome.types.types.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.spp.cocome.types.types.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TypesFactoryImpl extends EFactoryImpl implements TypesFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static TypesFactory init()
  {
    try
    {
      TypesFactory theTypesFactory = (TypesFactory)EPackage.Registry.INSTANCE.getEFactory(TypesPackage.eNS_URI);
      if (theTypesFactory != null)
      {
        return theTypesFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new TypesFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypesFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case TypesPackage.MODEL: return createModel();
      case TypesPackage.IMPORT: return createImport();
      case TypesPackage.TYPE: return createType();
      case TypesPackage.NAMED_TYPE: return createNamedType();
      case TypesPackage.COLLECTION_TYPE: return createCollectionType();
      case TypesPackage.MAP_TYPE: return createMapType();
      case TypesPackage.DECLARATION_TYPE_REFERENCE: return createDeclarationTypeReference();
      case TypesPackage.TYPE_REFERENCE: return createTypeReference();
      case TypesPackage.PRIMITIVE_TYPE: return createPrimitiveType();
      case TypesPackage.COMPLEX_TYPE: return createComplexType();
      case TypesPackage.ENUMERATION_TYPE: return createEnumerationType();
      case TypesPackage.ENUMERATION_LITERAL: return createEnumerationLiteral();
      case TypesPackage.ENTITY_TYPE: return createEntityType();
      case TypesPackage.PROPERTY: return createProperty();
      case TypesPackage.ENTITY_RELATIONSHIP: return createEntityRelationship();
      case TypesPackage.MAPPED_BY_REFERENCE: return createMappedByReference();
      case TypesPackage.LITERAL: return createLiteral();
      case TypesPackage.STRING_LITERAL: return createStringLiteral();
      case TypesPackage.CHAR_LITERAL: return createCharLiteral();
      case TypesPackage.NUMBER_LITERAL: return createNumberLiteral();
      case TypesPackage.BOOLEAN_LITERAL: return createBooleanLiteral();
      case TypesPackage.PROPERTY_REFERENCE: return createPropertyReference();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case TypesPackage.TYPE_STORAGE_MODIFIER:
        return createTypeStorageModifierFromString(eDataType, initialValue);
      case TypesPackage.ENTITY_RELATIONSHIP_KIND:
        return createEntityRelationshipKindFromString(eDataType, initialValue);
      case TypesPackage.PROPERTY_STORAGE_MODIFIER:
        return createPropertyStorageModifierFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case TypesPackage.TYPE_STORAGE_MODIFIER:
        return convertTypeStorageModifierToString(eDataType, instanceValue);
      case TypesPackage.ENTITY_RELATIONSHIP_KIND:
        return convertEntityRelationshipKindToString(eDataType, instanceValue);
      case TypesPackage.PROPERTY_STORAGE_MODIFIER:
        return convertPropertyStorageModifierToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Import createImport()
  {
    ImportImpl import_ = new ImportImpl();
    return import_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type createType()
  {
    TypeImpl type = new TypeImpl();
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NamedType createNamedType()
  {
    NamedTypeImpl namedType = new NamedTypeImpl();
    return namedType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CollectionType createCollectionType()
  {
    CollectionTypeImpl collectionType = new CollectionTypeImpl();
    return collectionType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MapType createMapType()
  {
    MapTypeImpl mapType = new MapTypeImpl();
    return mapType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DeclarationTypeReference createDeclarationTypeReference()
  {
    DeclarationTypeReferenceImpl declarationTypeReference = new DeclarationTypeReferenceImpl();
    return declarationTypeReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeReference createTypeReference()
  {
    TypeReferenceImpl typeReference = new TypeReferenceImpl();
    return typeReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PrimitiveType createPrimitiveType()
  {
    PrimitiveTypeImpl primitiveType = new PrimitiveTypeImpl();
    return primitiveType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComplexType createComplexType()
  {
    ComplexTypeImpl complexType = new ComplexTypeImpl();
    return complexType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnumerationType createEnumerationType()
  {
    EnumerationTypeImpl enumerationType = new EnumerationTypeImpl();
    return enumerationType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnumerationLiteral createEnumerationLiteral()
  {
    EnumerationLiteralImpl enumerationLiteral = new EnumerationLiteralImpl();
    return enumerationLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EntityType createEntityType()
  {
    EntityTypeImpl entityType = new EntityTypeImpl();
    return entityType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Property createProperty()
  {
    PropertyImpl property = new PropertyImpl();
    return property;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EntityRelationship createEntityRelationship()
  {
    EntityRelationshipImpl entityRelationship = new EntityRelationshipImpl();
    return entityRelationship;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MappedByReference createMappedByReference()
  {
    MappedByReferenceImpl mappedByReference = new MappedByReferenceImpl();
    return mappedByReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Literal createLiteral()
  {
    LiteralImpl literal = new LiteralImpl();
    return literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringLiteral createStringLiteral()
  {
    StringLiteralImpl stringLiteral = new StringLiteralImpl();
    return stringLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CharLiteral createCharLiteral()
  {
    CharLiteralImpl charLiteral = new CharLiteralImpl();
    return charLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NumberLiteral createNumberLiteral()
  {
    NumberLiteralImpl numberLiteral = new NumberLiteralImpl();
    return numberLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BooleanLiteral createBooleanLiteral()
  {
    BooleanLiteralImpl booleanLiteral = new BooleanLiteralImpl();
    return booleanLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PropertyReference createPropertyReference()
  {
    PropertyReferenceImpl propertyReference = new PropertyReferenceImpl();
    return propertyReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeStorageModifier createTypeStorageModifierFromString(EDataType eDataType, String initialValue)
  {
    TypeStorageModifier result = TypeStorageModifier.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertTypeStorageModifierToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EntityRelationshipKind createEntityRelationshipKindFromString(EDataType eDataType, String initialValue)
  {
    EntityRelationshipKind result = EntityRelationshipKind.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertEntityRelationshipKindToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PropertyStorageModifier createPropertyStorageModifierFromString(EDataType eDataType, String initialValue)
  {
    PropertyStorageModifier result = PropertyStorageModifier.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertPropertyStorageModifierToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypesPackage getTypesPackage()
  {
    return (TypesPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static TypesPackage getPackage()
  {
    return TypesPackage.eINSTANCE;
  }

} //TypesFactoryImpl
