/**
 */
package org.spp.cocome.types.types;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.spp.cocome.types.types.TypesFactory
 * @model kind="package"
 * @generated
 */
public interface TypesPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "types";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.spp.org/cocome/types/Types";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "types";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  TypesPackage eINSTANCE = org.spp.cocome.types.types.impl.TypesPackageImpl.init();

  /**
   * The meta object id for the '{@link org.spp.cocome.types.types.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.spp.cocome.types.types.impl.ModelImpl
   * @see org.spp.cocome.types.types.impl.TypesPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__NAME = 0;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__IMPORTS = 1;

  /**
   * The feature id for the '<em><b>Types</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__TYPES = 2;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.spp.cocome.types.types.impl.ImportImpl <em>Import</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.spp.cocome.types.types.impl.ImportImpl
   * @see org.spp.cocome.types.types.impl.TypesPackageImpl#getImport()
   * @generated
   */
  int IMPORT = 1;

  /**
   * The feature id for the '<em><b>Imported Namespace</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT__IMPORTED_NAMESPACE = 0;

  /**
   * The number of structural features of the '<em>Import</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.spp.cocome.types.types.impl.TypeImpl <em>Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.spp.cocome.types.types.impl.TypeImpl
   * @see org.spp.cocome.types.types.impl.TypesPackageImpl#getType()
   * @generated
   */
  int TYPE = 2;

  /**
   * The number of structural features of the '<em>Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.spp.cocome.types.types.impl.NamedTypeImpl <em>Named Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.spp.cocome.types.types.impl.NamedTypeImpl
   * @see org.spp.cocome.types.types.impl.TypesPackageImpl#getNamedType()
   * @generated
   */
  int NAMED_TYPE = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_TYPE__NAME = TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Named Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.spp.cocome.types.types.impl.CollectionTypeImpl <em>Collection Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.spp.cocome.types.types.impl.CollectionTypeImpl
   * @see org.spp.cocome.types.types.impl.TypesPackageImpl#getCollectionType()
   * @generated
   */
  int COLLECTION_TYPE = 4;

  /**
   * The feature id for the '<em><b>Reference</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLLECTION_TYPE__REFERENCE = TYPE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Size</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLLECTION_TYPE__SIZE = TYPE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Collection Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLLECTION_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.spp.cocome.types.types.impl.MapTypeImpl <em>Map Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.spp.cocome.types.types.impl.MapTypeImpl
   * @see org.spp.cocome.types.types.impl.TypesPackageImpl#getMapType()
   * @generated
   */
  int MAP_TYPE = 5;

  /**
   * The feature id for the '<em><b>Reference</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAP_TYPE__REFERENCE = TYPE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Map Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAP_TYPE__MAP_TYPE = TYPE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Size</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAP_TYPE__SIZE = TYPE_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Map Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAP_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.spp.cocome.types.types.impl.DeclarationTypeReferenceImpl <em>Declaration Type Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.spp.cocome.types.types.impl.DeclarationTypeReferenceImpl
   * @see org.spp.cocome.types.types.impl.TypesPackageImpl#getDeclarationTypeReference()
   * @generated
   */
  int DECLARATION_TYPE_REFERENCE = 6;

  /**
   * The number of structural features of the '<em>Declaration Type Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARATION_TYPE_REFERENCE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.spp.cocome.types.types.impl.TypeReferenceImpl <em>Type Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.spp.cocome.types.types.impl.TypeReferenceImpl
   * @see org.spp.cocome.types.types.impl.TypesPackageImpl#getTypeReference()
   * @generated
   */
  int TYPE_REFERENCE = 7;

  /**
   * The feature id for the '<em><b>Reference</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_REFERENCE__REFERENCE = DECLARATION_TYPE_REFERENCE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Type Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_REFERENCE_FEATURE_COUNT = DECLARATION_TYPE_REFERENCE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.spp.cocome.types.types.impl.PrimitiveTypeImpl <em>Primitive Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.spp.cocome.types.types.impl.PrimitiveTypeImpl
   * @see org.spp.cocome.types.types.impl.TypesPackageImpl#getPrimitiveType()
   * @generated
   */
  int PRIMITIVE_TYPE = 8;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMITIVE_TYPE__NAME = NAMED_TYPE__NAME;

  /**
   * The number of structural features of the '<em>Primitive Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMITIVE_TYPE_FEATURE_COUNT = NAMED_TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.spp.cocome.types.types.impl.ComplexTypeImpl <em>Complex Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.spp.cocome.types.types.impl.ComplexTypeImpl
   * @see org.spp.cocome.types.types.impl.TypesPackageImpl#getComplexType()
   * @generated
   */
  int COMPLEX_TYPE = 9;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPLEX_TYPE__NAME = NAMED_TYPE__NAME;

  /**
   * The feature id for the '<em><b>Parent</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPLEX_TYPE__PARENT = NAMED_TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Complex Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPLEX_TYPE_FEATURE_COUNT = NAMED_TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.spp.cocome.types.types.impl.EnumerationTypeImpl <em>Enumeration Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.spp.cocome.types.types.impl.EnumerationTypeImpl
   * @see org.spp.cocome.types.types.impl.TypesPackageImpl#getEnumerationType()
   * @generated
   */
  int ENUMERATION_TYPE = 10;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUMERATION_TYPE__NAME = COMPLEX_TYPE__NAME;

  /**
   * The feature id for the '<em><b>Parent</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUMERATION_TYPE__PARENT = COMPLEX_TYPE__PARENT;

  /**
   * The feature id for the '<em><b>Literals</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUMERATION_TYPE__LITERALS = COMPLEX_TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Enumeration Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUMERATION_TYPE_FEATURE_COUNT = COMPLEX_TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.spp.cocome.types.types.impl.EnumerationLiteralImpl <em>Enumeration Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.spp.cocome.types.types.impl.EnumerationLiteralImpl
   * @see org.spp.cocome.types.types.impl.TypesPackageImpl#getEnumerationLiteral()
   * @generated
   */
  int ENUMERATION_LITERAL = 11;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUMERATION_LITERAL__NAME = 0;

  /**
   * The number of structural features of the '<em>Enumeration Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUMERATION_LITERAL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.spp.cocome.types.types.impl.EntityTypeImpl <em>Entity Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.spp.cocome.types.types.impl.EntityTypeImpl
   * @see org.spp.cocome.types.types.impl.TypesPackageImpl#getEntityType()
   * @generated
   */
  int ENTITY_TYPE = 12;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_TYPE__NAME = COMPLEX_TYPE__NAME;

  /**
   * The feature id for the '<em><b>Parent</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_TYPE__PARENT = COMPLEX_TYPE__PARENT;

  /**
   * The feature id for the '<em><b>Storage Modifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_TYPE__STORAGE_MODIFIER = COMPLEX_TYPE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Properties</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_TYPE__PROPERTIES = COMPLEX_TYPE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Entity Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_TYPE_FEATURE_COUNT = COMPLEX_TYPE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.spp.cocome.types.types.impl.PropertyImpl <em>Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.spp.cocome.types.types.impl.PropertyImpl
   * @see org.spp.cocome.types.types.impl.TypesPackageImpl#getProperty()
   * @generated
   */
  int PROPERTY = 13;

  /**
   * The feature id for the '<em><b>Storage Modifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__STORAGE_MODIFIER = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__TYPE = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__NAME = 2;

  /**
   * The feature id for the '<em><b>Relationship</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__RELATIONSHIP = 3;

  /**
   * The feature id for the '<em><b>Order By</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__ORDER_BY = 4;

  /**
   * The feature id for the '<em><b>Map Key</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__MAP_KEY = 5;

  /**
   * The feature id for the '<em><b>Literal</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__LITERAL = 6;

  /**
   * The number of structural features of the '<em>Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_FEATURE_COUNT = 7;

  /**
   * The meta object id for the '{@link org.spp.cocome.types.types.impl.EntityRelationshipImpl <em>Entity Relationship</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.spp.cocome.types.types.impl.EntityRelationshipImpl
   * @see org.spp.cocome.types.types.impl.TypesPackageImpl#getEntityRelationship()
   * @generated
   */
  int ENTITY_RELATIONSHIP = 14;

  /**
   * The feature id for the '<em><b>Kind</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_RELATIONSHIP__KIND = 0;

  /**
   * The feature id for the '<em><b>Mapped By</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_RELATIONSHIP__MAPPED_BY = 1;

  /**
   * The number of structural features of the '<em>Entity Relationship</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_RELATIONSHIP_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.spp.cocome.types.types.impl.MappedByReferenceImpl <em>Mapped By Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.spp.cocome.types.types.impl.MappedByReferenceImpl
   * @see org.spp.cocome.types.types.impl.TypesPackageImpl#getMappedByReference()
   * @generated
   */
  int MAPPED_BY_REFERENCE = 15;

  /**
   * The feature id for the '<em><b>Base</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPED_BY_REFERENCE__BASE = 0;

  /**
   * The feature id for the '<em><b>Path</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPED_BY_REFERENCE__PATH = 1;

  /**
   * The number of structural features of the '<em>Mapped By Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPED_BY_REFERENCE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.spp.cocome.types.types.impl.LiteralImpl <em>Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.spp.cocome.types.types.impl.LiteralImpl
   * @see org.spp.cocome.types.types.impl.TypesPackageImpl#getLiteral()
   * @generated
   */
  int LITERAL = 16;

  /**
   * The number of structural features of the '<em>Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.spp.cocome.types.types.impl.StringLiteralImpl <em>String Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.spp.cocome.types.types.impl.StringLiteralImpl
   * @see org.spp.cocome.types.types.impl.TypesPackageImpl#getStringLiteral()
   * @generated
   */
  int STRING_LITERAL = 17;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_LITERAL__VALUE = LITERAL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>String Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.spp.cocome.types.types.impl.CharLiteralImpl <em>Char Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.spp.cocome.types.types.impl.CharLiteralImpl
   * @see org.spp.cocome.types.types.impl.TypesPackageImpl#getCharLiteral()
   * @generated
   */
  int CHAR_LITERAL = 18;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHAR_LITERAL__VALUE = LITERAL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Char Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHAR_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.spp.cocome.types.types.impl.NumberLiteralImpl <em>Number Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.spp.cocome.types.types.impl.NumberLiteralImpl
   * @see org.spp.cocome.types.types.impl.TypesPackageImpl#getNumberLiteral()
   * @generated
   */
  int NUMBER_LITERAL = 19;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_LITERAL__VALUE = LITERAL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Number Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.spp.cocome.types.types.impl.BooleanLiteralImpl <em>Boolean Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.spp.cocome.types.types.impl.BooleanLiteralImpl
   * @see org.spp.cocome.types.types.impl.TypesPackageImpl#getBooleanLiteral()
   * @generated
   */
  int BOOLEAN_LITERAL = 20;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_LITERAL__VALUE = LITERAL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Boolean Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.spp.cocome.types.types.impl.PropertyReferenceImpl <em>Property Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.spp.cocome.types.types.impl.PropertyReferenceImpl
   * @see org.spp.cocome.types.types.impl.TypesPackageImpl#getPropertyReference()
   * @generated
   */
  int PROPERTY_REFERENCE = 21;

  /**
   * The feature id for the '<em><b>Reference</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_REFERENCE__REFERENCE = LITERAL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Property Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_REFERENCE_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.spp.cocome.types.types.TypeStorageModifier <em>Type Storage Modifier</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.spp.cocome.types.types.TypeStorageModifier
   * @see org.spp.cocome.types.types.impl.TypesPackageImpl#getTypeStorageModifier()
   * @generated
   */
  int TYPE_STORAGE_MODIFIER = 22;

  /**
   * The meta object id for the '{@link org.spp.cocome.types.types.EntityRelationshipKind <em>Entity Relationship Kind</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.spp.cocome.types.types.EntityRelationshipKind
   * @see org.spp.cocome.types.types.impl.TypesPackageImpl#getEntityRelationshipKind()
   * @generated
   */
  int ENTITY_RELATIONSHIP_KIND = 23;

  /**
   * The meta object id for the '{@link org.spp.cocome.types.types.PropertyStorageModifier <em>Property Storage Modifier</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.spp.cocome.types.types.PropertyStorageModifier
   * @see org.spp.cocome.types.types.impl.TypesPackageImpl#getPropertyStorageModifier()
   * @generated
   */
  int PROPERTY_STORAGE_MODIFIER = 24;


  /**
   * Returns the meta object for class '{@link org.spp.cocome.types.types.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see org.spp.cocome.types.types.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the attribute '{@link org.spp.cocome.types.types.Model#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.spp.cocome.types.types.Model#getName()
   * @see #getModel()
   * @generated
   */
  EAttribute getModel_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.spp.cocome.types.types.Model#getImports <em>Imports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Imports</em>'.
   * @see org.spp.cocome.types.types.Model#getImports()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Imports();

  /**
   * Returns the meta object for the containment reference list '{@link org.spp.cocome.types.types.Model#getTypes <em>Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Types</em>'.
   * @see org.spp.cocome.types.types.Model#getTypes()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Types();

  /**
   * Returns the meta object for class '{@link org.spp.cocome.types.types.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Import</em>'.
   * @see org.spp.cocome.types.types.Import
   * @generated
   */
  EClass getImport();

  /**
   * Returns the meta object for the attribute '{@link org.spp.cocome.types.types.Import#getImportedNamespace <em>Imported Namespace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Imported Namespace</em>'.
   * @see org.spp.cocome.types.types.Import#getImportedNamespace()
   * @see #getImport()
   * @generated
   */
  EAttribute getImport_ImportedNamespace();

  /**
   * Returns the meta object for class '{@link org.spp.cocome.types.types.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type</em>'.
   * @see org.spp.cocome.types.types.Type
   * @generated
   */
  EClass getType();

  /**
   * Returns the meta object for class '{@link org.spp.cocome.types.types.NamedType <em>Named Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Named Type</em>'.
   * @see org.spp.cocome.types.types.NamedType
   * @generated
   */
  EClass getNamedType();

  /**
   * Returns the meta object for the attribute '{@link org.spp.cocome.types.types.NamedType#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.spp.cocome.types.types.NamedType#getName()
   * @see #getNamedType()
   * @generated
   */
  EAttribute getNamedType_Name();

  /**
   * Returns the meta object for class '{@link org.spp.cocome.types.types.CollectionType <em>Collection Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Collection Type</em>'.
   * @see org.spp.cocome.types.types.CollectionType
   * @generated
   */
  EClass getCollectionType();

  /**
   * Returns the meta object for the containment reference '{@link org.spp.cocome.types.types.CollectionType#getReference <em>Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Reference</em>'.
   * @see org.spp.cocome.types.types.CollectionType#getReference()
   * @see #getCollectionType()
   * @generated
   */
  EReference getCollectionType_Reference();

  /**
   * Returns the meta object for the attribute '{@link org.spp.cocome.types.types.CollectionType#getSize <em>Size</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Size</em>'.
   * @see org.spp.cocome.types.types.CollectionType#getSize()
   * @see #getCollectionType()
   * @generated
   */
  EAttribute getCollectionType_Size();

  /**
   * Returns the meta object for class '{@link org.spp.cocome.types.types.MapType <em>Map Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Map Type</em>'.
   * @see org.spp.cocome.types.types.MapType
   * @generated
   */
  EClass getMapType();

  /**
   * Returns the meta object for the containment reference '{@link org.spp.cocome.types.types.MapType#getReference <em>Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Reference</em>'.
   * @see org.spp.cocome.types.types.MapType#getReference()
   * @see #getMapType()
   * @generated
   */
  EReference getMapType_Reference();

  /**
   * Returns the meta object for the containment reference '{@link org.spp.cocome.types.types.MapType#getMapType <em>Map Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Map Type</em>'.
   * @see org.spp.cocome.types.types.MapType#getMapType()
   * @see #getMapType()
   * @generated
   */
  EReference getMapType_MapType();

  /**
   * Returns the meta object for the attribute '{@link org.spp.cocome.types.types.MapType#getSize <em>Size</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Size</em>'.
   * @see org.spp.cocome.types.types.MapType#getSize()
   * @see #getMapType()
   * @generated
   */
  EAttribute getMapType_Size();

  /**
   * Returns the meta object for class '{@link org.spp.cocome.types.types.DeclarationTypeReference <em>Declaration Type Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Declaration Type Reference</em>'.
   * @see org.spp.cocome.types.types.DeclarationTypeReference
   * @generated
   */
  EClass getDeclarationTypeReference();

  /**
   * Returns the meta object for class '{@link org.spp.cocome.types.types.TypeReference <em>Type Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type Reference</em>'.
   * @see org.spp.cocome.types.types.TypeReference
   * @generated
   */
  EClass getTypeReference();

  /**
   * Returns the meta object for the reference '{@link org.spp.cocome.types.types.TypeReference#getReference <em>Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Reference</em>'.
   * @see org.spp.cocome.types.types.TypeReference#getReference()
   * @see #getTypeReference()
   * @generated
   */
  EReference getTypeReference_Reference();

  /**
   * Returns the meta object for class '{@link org.spp.cocome.types.types.PrimitiveType <em>Primitive Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Primitive Type</em>'.
   * @see org.spp.cocome.types.types.PrimitiveType
   * @generated
   */
  EClass getPrimitiveType();

  /**
   * Returns the meta object for class '{@link org.spp.cocome.types.types.ComplexType <em>Complex Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Complex Type</em>'.
   * @see org.spp.cocome.types.types.ComplexType
   * @generated
   */
  EClass getComplexType();

  /**
   * Returns the meta object for the reference '{@link org.spp.cocome.types.types.ComplexType#getParent <em>Parent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Parent</em>'.
   * @see org.spp.cocome.types.types.ComplexType#getParent()
   * @see #getComplexType()
   * @generated
   */
  EReference getComplexType_Parent();

  /**
   * Returns the meta object for class '{@link org.spp.cocome.types.types.EnumerationType <em>Enumeration Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Enumeration Type</em>'.
   * @see org.spp.cocome.types.types.EnumerationType
   * @generated
   */
  EClass getEnumerationType();

  /**
   * Returns the meta object for the containment reference list '{@link org.spp.cocome.types.types.EnumerationType#getLiterals <em>Literals</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Literals</em>'.
   * @see org.spp.cocome.types.types.EnumerationType#getLiterals()
   * @see #getEnumerationType()
   * @generated
   */
  EReference getEnumerationType_Literals();

  /**
   * Returns the meta object for class '{@link org.spp.cocome.types.types.EnumerationLiteral <em>Enumeration Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Enumeration Literal</em>'.
   * @see org.spp.cocome.types.types.EnumerationLiteral
   * @generated
   */
  EClass getEnumerationLiteral();

  /**
   * Returns the meta object for the attribute '{@link org.spp.cocome.types.types.EnumerationLiteral#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.spp.cocome.types.types.EnumerationLiteral#getName()
   * @see #getEnumerationLiteral()
   * @generated
   */
  EAttribute getEnumerationLiteral_Name();

  /**
   * Returns the meta object for class '{@link org.spp.cocome.types.types.EntityType <em>Entity Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Entity Type</em>'.
   * @see org.spp.cocome.types.types.EntityType
   * @generated
   */
  EClass getEntityType();

  /**
   * Returns the meta object for the attribute '{@link org.spp.cocome.types.types.EntityType#getStorageModifier <em>Storage Modifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Storage Modifier</em>'.
   * @see org.spp.cocome.types.types.EntityType#getStorageModifier()
   * @see #getEntityType()
   * @generated
   */
  EAttribute getEntityType_StorageModifier();

  /**
   * Returns the meta object for the containment reference list '{@link org.spp.cocome.types.types.EntityType#getProperties <em>Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Properties</em>'.
   * @see org.spp.cocome.types.types.EntityType#getProperties()
   * @see #getEntityType()
   * @generated
   */
  EReference getEntityType_Properties();

  /**
   * Returns the meta object for class '{@link org.spp.cocome.types.types.Property <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Property</em>'.
   * @see org.spp.cocome.types.types.Property
   * @generated
   */
  EClass getProperty();

  /**
   * Returns the meta object for the attribute '{@link org.spp.cocome.types.types.Property#getStorageModifier <em>Storage Modifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Storage Modifier</em>'.
   * @see org.spp.cocome.types.types.Property#getStorageModifier()
   * @see #getProperty()
   * @generated
   */
  EAttribute getProperty_StorageModifier();

  /**
   * Returns the meta object for the containment reference '{@link org.spp.cocome.types.types.Property#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.spp.cocome.types.types.Property#getType()
   * @see #getProperty()
   * @generated
   */
  EReference getProperty_Type();

  /**
   * Returns the meta object for the attribute '{@link org.spp.cocome.types.types.Property#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.spp.cocome.types.types.Property#getName()
   * @see #getProperty()
   * @generated
   */
  EAttribute getProperty_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.spp.cocome.types.types.Property#getRelationship <em>Relationship</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Relationship</em>'.
   * @see org.spp.cocome.types.types.Property#getRelationship()
   * @see #getProperty()
   * @generated
   */
  EReference getProperty_Relationship();

  /**
   * Returns the meta object for the containment reference '{@link org.spp.cocome.types.types.Property#getOrderBy <em>Order By</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Order By</em>'.
   * @see org.spp.cocome.types.types.Property#getOrderBy()
   * @see #getProperty()
   * @generated
   */
  EReference getProperty_OrderBy();

  /**
   * Returns the meta object for the containment reference '{@link org.spp.cocome.types.types.Property#getMapKey <em>Map Key</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Map Key</em>'.
   * @see org.spp.cocome.types.types.Property#getMapKey()
   * @see #getProperty()
   * @generated
   */
  EReference getProperty_MapKey();

  /**
   * Returns the meta object for the containment reference '{@link org.spp.cocome.types.types.Property#getLiteral <em>Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Literal</em>'.
   * @see org.spp.cocome.types.types.Property#getLiteral()
   * @see #getProperty()
   * @generated
   */
  EReference getProperty_Literal();

  /**
   * Returns the meta object for class '{@link org.spp.cocome.types.types.EntityRelationship <em>Entity Relationship</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Entity Relationship</em>'.
   * @see org.spp.cocome.types.types.EntityRelationship
   * @generated
   */
  EClass getEntityRelationship();

  /**
   * Returns the meta object for the attribute '{@link org.spp.cocome.types.types.EntityRelationship#getKind <em>Kind</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Kind</em>'.
   * @see org.spp.cocome.types.types.EntityRelationship#getKind()
   * @see #getEntityRelationship()
   * @generated
   */
  EAttribute getEntityRelationship_Kind();

  /**
   * Returns the meta object for the containment reference '{@link org.spp.cocome.types.types.EntityRelationship#getMappedBy <em>Mapped By</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Mapped By</em>'.
   * @see org.spp.cocome.types.types.EntityRelationship#getMappedBy()
   * @see #getEntityRelationship()
   * @generated
   */
  EReference getEntityRelationship_MappedBy();

  /**
   * Returns the meta object for class '{@link org.spp.cocome.types.types.MappedByReference <em>Mapped By Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mapped By Reference</em>'.
   * @see org.spp.cocome.types.types.MappedByReference
   * @generated
   */
  EClass getMappedByReference();

  /**
   * Returns the meta object for the reference '{@link org.spp.cocome.types.types.MappedByReference#getBase <em>Base</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Base</em>'.
   * @see org.spp.cocome.types.types.MappedByReference#getBase()
   * @see #getMappedByReference()
   * @generated
   */
  EReference getMappedByReference_Base();

  /**
   * Returns the meta object for the containment reference '{@link org.spp.cocome.types.types.MappedByReference#getPath <em>Path</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Path</em>'.
   * @see org.spp.cocome.types.types.MappedByReference#getPath()
   * @see #getMappedByReference()
   * @generated
   */
  EReference getMappedByReference_Path();

  /**
   * Returns the meta object for class '{@link org.spp.cocome.types.types.Literal <em>Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Literal</em>'.
   * @see org.spp.cocome.types.types.Literal
   * @generated
   */
  EClass getLiteral();

  /**
   * Returns the meta object for class '{@link org.spp.cocome.types.types.StringLiteral <em>String Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>String Literal</em>'.
   * @see org.spp.cocome.types.types.StringLiteral
   * @generated
   */
  EClass getStringLiteral();

  /**
   * Returns the meta object for the attribute '{@link org.spp.cocome.types.types.StringLiteral#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.spp.cocome.types.types.StringLiteral#getValue()
   * @see #getStringLiteral()
   * @generated
   */
  EAttribute getStringLiteral_Value();

  /**
   * Returns the meta object for class '{@link org.spp.cocome.types.types.CharLiteral <em>Char Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Char Literal</em>'.
   * @see org.spp.cocome.types.types.CharLiteral
   * @generated
   */
  EClass getCharLiteral();

  /**
   * Returns the meta object for the attribute '{@link org.spp.cocome.types.types.CharLiteral#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.spp.cocome.types.types.CharLiteral#getValue()
   * @see #getCharLiteral()
   * @generated
   */
  EAttribute getCharLiteral_Value();

  /**
   * Returns the meta object for class '{@link org.spp.cocome.types.types.NumberLiteral <em>Number Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Number Literal</em>'.
   * @see org.spp.cocome.types.types.NumberLiteral
   * @generated
   */
  EClass getNumberLiteral();

  /**
   * Returns the meta object for the attribute '{@link org.spp.cocome.types.types.NumberLiteral#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.spp.cocome.types.types.NumberLiteral#getValue()
   * @see #getNumberLiteral()
   * @generated
   */
  EAttribute getNumberLiteral_Value();

  /**
   * Returns the meta object for class '{@link org.spp.cocome.types.types.BooleanLiteral <em>Boolean Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Boolean Literal</em>'.
   * @see org.spp.cocome.types.types.BooleanLiteral
   * @generated
   */
  EClass getBooleanLiteral();

  /**
   * Returns the meta object for the attribute '{@link org.spp.cocome.types.types.BooleanLiteral#isValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.spp.cocome.types.types.BooleanLiteral#isValue()
   * @see #getBooleanLiteral()
   * @generated
   */
  EAttribute getBooleanLiteral_Value();

  /**
   * Returns the meta object for class '{@link org.spp.cocome.types.types.PropertyReference <em>Property Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Property Reference</em>'.
   * @see org.spp.cocome.types.types.PropertyReference
   * @generated
   */
  EClass getPropertyReference();

  /**
   * Returns the meta object for the reference '{@link org.spp.cocome.types.types.PropertyReference#getReference <em>Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Reference</em>'.
   * @see org.spp.cocome.types.types.PropertyReference#getReference()
   * @see #getPropertyReference()
   * @generated
   */
  EReference getPropertyReference_Reference();

  /**
   * Returns the meta object for enum '{@link org.spp.cocome.types.types.TypeStorageModifier <em>Type Storage Modifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Type Storage Modifier</em>'.
   * @see org.spp.cocome.types.types.TypeStorageModifier
   * @generated
   */
  EEnum getTypeStorageModifier();

  /**
   * Returns the meta object for enum '{@link org.spp.cocome.types.types.EntityRelationshipKind <em>Entity Relationship Kind</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Entity Relationship Kind</em>'.
   * @see org.spp.cocome.types.types.EntityRelationshipKind
   * @generated
   */
  EEnum getEntityRelationshipKind();

  /**
   * Returns the meta object for enum '{@link org.spp.cocome.types.types.PropertyStorageModifier <em>Property Storage Modifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Property Storage Modifier</em>'.
   * @see org.spp.cocome.types.types.PropertyStorageModifier
   * @generated
   */
  EEnum getPropertyStorageModifier();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  TypesFactory getTypesFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.spp.cocome.types.types.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.spp.cocome.types.types.impl.ModelImpl
     * @see org.spp.cocome.types.types.impl.TypesPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODEL__NAME = eINSTANCE.getModel_Name();

    /**
     * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__IMPORTS = eINSTANCE.getModel_Imports();

    /**
     * The meta object literal for the '<em><b>Types</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__TYPES = eINSTANCE.getModel_Types();

    /**
     * The meta object literal for the '{@link org.spp.cocome.types.types.impl.ImportImpl <em>Import</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.spp.cocome.types.types.impl.ImportImpl
     * @see org.spp.cocome.types.types.impl.TypesPackageImpl#getImport()
     * @generated
     */
    EClass IMPORT = eINSTANCE.getImport();

    /**
     * The meta object literal for the '<em><b>Imported Namespace</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPORT__IMPORTED_NAMESPACE = eINSTANCE.getImport_ImportedNamespace();

    /**
     * The meta object literal for the '{@link org.spp.cocome.types.types.impl.TypeImpl <em>Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.spp.cocome.types.types.impl.TypeImpl
     * @see org.spp.cocome.types.types.impl.TypesPackageImpl#getType()
     * @generated
     */
    EClass TYPE = eINSTANCE.getType();

    /**
     * The meta object literal for the '{@link org.spp.cocome.types.types.impl.NamedTypeImpl <em>Named Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.spp.cocome.types.types.impl.NamedTypeImpl
     * @see org.spp.cocome.types.types.impl.TypesPackageImpl#getNamedType()
     * @generated
     */
    EClass NAMED_TYPE = eINSTANCE.getNamedType();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NAMED_TYPE__NAME = eINSTANCE.getNamedType_Name();

    /**
     * The meta object literal for the '{@link org.spp.cocome.types.types.impl.CollectionTypeImpl <em>Collection Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.spp.cocome.types.types.impl.CollectionTypeImpl
     * @see org.spp.cocome.types.types.impl.TypesPackageImpl#getCollectionType()
     * @generated
     */
    EClass COLLECTION_TYPE = eINSTANCE.getCollectionType();

    /**
     * The meta object literal for the '<em><b>Reference</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COLLECTION_TYPE__REFERENCE = eINSTANCE.getCollectionType_Reference();

    /**
     * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COLLECTION_TYPE__SIZE = eINSTANCE.getCollectionType_Size();

    /**
     * The meta object literal for the '{@link org.spp.cocome.types.types.impl.MapTypeImpl <em>Map Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.spp.cocome.types.types.impl.MapTypeImpl
     * @see org.spp.cocome.types.types.impl.TypesPackageImpl#getMapType()
     * @generated
     */
    EClass MAP_TYPE = eINSTANCE.getMapType();

    /**
     * The meta object literal for the '<em><b>Reference</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MAP_TYPE__REFERENCE = eINSTANCE.getMapType_Reference();

    /**
     * The meta object literal for the '<em><b>Map Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MAP_TYPE__MAP_TYPE = eINSTANCE.getMapType_MapType();

    /**
     * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MAP_TYPE__SIZE = eINSTANCE.getMapType_Size();

    /**
     * The meta object literal for the '{@link org.spp.cocome.types.types.impl.DeclarationTypeReferenceImpl <em>Declaration Type Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.spp.cocome.types.types.impl.DeclarationTypeReferenceImpl
     * @see org.spp.cocome.types.types.impl.TypesPackageImpl#getDeclarationTypeReference()
     * @generated
     */
    EClass DECLARATION_TYPE_REFERENCE = eINSTANCE.getDeclarationTypeReference();

    /**
     * The meta object literal for the '{@link org.spp.cocome.types.types.impl.TypeReferenceImpl <em>Type Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.spp.cocome.types.types.impl.TypeReferenceImpl
     * @see org.spp.cocome.types.types.impl.TypesPackageImpl#getTypeReference()
     * @generated
     */
    EClass TYPE_REFERENCE = eINSTANCE.getTypeReference();

    /**
     * The meta object literal for the '<em><b>Reference</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_REFERENCE__REFERENCE = eINSTANCE.getTypeReference_Reference();

    /**
     * The meta object literal for the '{@link org.spp.cocome.types.types.impl.PrimitiveTypeImpl <em>Primitive Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.spp.cocome.types.types.impl.PrimitiveTypeImpl
     * @see org.spp.cocome.types.types.impl.TypesPackageImpl#getPrimitiveType()
     * @generated
     */
    EClass PRIMITIVE_TYPE = eINSTANCE.getPrimitiveType();

    /**
     * The meta object literal for the '{@link org.spp.cocome.types.types.impl.ComplexTypeImpl <em>Complex Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.spp.cocome.types.types.impl.ComplexTypeImpl
     * @see org.spp.cocome.types.types.impl.TypesPackageImpl#getComplexType()
     * @generated
     */
    EClass COMPLEX_TYPE = eINSTANCE.getComplexType();

    /**
     * The meta object literal for the '<em><b>Parent</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPLEX_TYPE__PARENT = eINSTANCE.getComplexType_Parent();

    /**
     * The meta object literal for the '{@link org.spp.cocome.types.types.impl.EnumerationTypeImpl <em>Enumeration Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.spp.cocome.types.types.impl.EnumerationTypeImpl
     * @see org.spp.cocome.types.types.impl.TypesPackageImpl#getEnumerationType()
     * @generated
     */
    EClass ENUMERATION_TYPE = eINSTANCE.getEnumerationType();

    /**
     * The meta object literal for the '<em><b>Literals</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENUMERATION_TYPE__LITERALS = eINSTANCE.getEnumerationType_Literals();

    /**
     * The meta object literal for the '{@link org.spp.cocome.types.types.impl.EnumerationLiteralImpl <em>Enumeration Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.spp.cocome.types.types.impl.EnumerationLiteralImpl
     * @see org.spp.cocome.types.types.impl.TypesPackageImpl#getEnumerationLiteral()
     * @generated
     */
    EClass ENUMERATION_LITERAL = eINSTANCE.getEnumerationLiteral();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENUMERATION_LITERAL__NAME = eINSTANCE.getEnumerationLiteral_Name();

    /**
     * The meta object literal for the '{@link org.spp.cocome.types.types.impl.EntityTypeImpl <em>Entity Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.spp.cocome.types.types.impl.EntityTypeImpl
     * @see org.spp.cocome.types.types.impl.TypesPackageImpl#getEntityType()
     * @generated
     */
    EClass ENTITY_TYPE = eINSTANCE.getEntityType();

    /**
     * The meta object literal for the '<em><b>Storage Modifier</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENTITY_TYPE__STORAGE_MODIFIER = eINSTANCE.getEntityType_StorageModifier();

    /**
     * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENTITY_TYPE__PROPERTIES = eINSTANCE.getEntityType_Properties();

    /**
     * The meta object literal for the '{@link org.spp.cocome.types.types.impl.PropertyImpl <em>Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.spp.cocome.types.types.impl.PropertyImpl
     * @see org.spp.cocome.types.types.impl.TypesPackageImpl#getProperty()
     * @generated
     */
    EClass PROPERTY = eINSTANCE.getProperty();

    /**
     * The meta object literal for the '<em><b>Storage Modifier</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROPERTY__STORAGE_MODIFIER = eINSTANCE.getProperty_StorageModifier();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROPERTY__TYPE = eINSTANCE.getProperty_Type();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROPERTY__NAME = eINSTANCE.getProperty_Name();

    /**
     * The meta object literal for the '<em><b>Relationship</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROPERTY__RELATIONSHIP = eINSTANCE.getProperty_Relationship();

    /**
     * The meta object literal for the '<em><b>Order By</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROPERTY__ORDER_BY = eINSTANCE.getProperty_OrderBy();

    /**
     * The meta object literal for the '<em><b>Map Key</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROPERTY__MAP_KEY = eINSTANCE.getProperty_MapKey();

    /**
     * The meta object literal for the '<em><b>Literal</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROPERTY__LITERAL = eINSTANCE.getProperty_Literal();

    /**
     * The meta object literal for the '{@link org.spp.cocome.types.types.impl.EntityRelationshipImpl <em>Entity Relationship</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.spp.cocome.types.types.impl.EntityRelationshipImpl
     * @see org.spp.cocome.types.types.impl.TypesPackageImpl#getEntityRelationship()
     * @generated
     */
    EClass ENTITY_RELATIONSHIP = eINSTANCE.getEntityRelationship();

    /**
     * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENTITY_RELATIONSHIP__KIND = eINSTANCE.getEntityRelationship_Kind();

    /**
     * The meta object literal for the '<em><b>Mapped By</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENTITY_RELATIONSHIP__MAPPED_BY = eINSTANCE.getEntityRelationship_MappedBy();

    /**
     * The meta object literal for the '{@link org.spp.cocome.types.types.impl.MappedByReferenceImpl <em>Mapped By Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.spp.cocome.types.types.impl.MappedByReferenceImpl
     * @see org.spp.cocome.types.types.impl.TypesPackageImpl#getMappedByReference()
     * @generated
     */
    EClass MAPPED_BY_REFERENCE = eINSTANCE.getMappedByReference();

    /**
     * The meta object literal for the '<em><b>Base</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MAPPED_BY_REFERENCE__BASE = eINSTANCE.getMappedByReference_Base();

    /**
     * The meta object literal for the '<em><b>Path</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MAPPED_BY_REFERENCE__PATH = eINSTANCE.getMappedByReference_Path();

    /**
     * The meta object literal for the '{@link org.spp.cocome.types.types.impl.LiteralImpl <em>Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.spp.cocome.types.types.impl.LiteralImpl
     * @see org.spp.cocome.types.types.impl.TypesPackageImpl#getLiteral()
     * @generated
     */
    EClass LITERAL = eINSTANCE.getLiteral();

    /**
     * The meta object literal for the '{@link org.spp.cocome.types.types.impl.StringLiteralImpl <em>String Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.spp.cocome.types.types.impl.StringLiteralImpl
     * @see org.spp.cocome.types.types.impl.TypesPackageImpl#getStringLiteral()
     * @generated
     */
    EClass STRING_LITERAL = eINSTANCE.getStringLiteral();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRING_LITERAL__VALUE = eINSTANCE.getStringLiteral_Value();

    /**
     * The meta object literal for the '{@link org.spp.cocome.types.types.impl.CharLiteralImpl <em>Char Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.spp.cocome.types.types.impl.CharLiteralImpl
     * @see org.spp.cocome.types.types.impl.TypesPackageImpl#getCharLiteral()
     * @generated
     */
    EClass CHAR_LITERAL = eINSTANCE.getCharLiteral();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CHAR_LITERAL__VALUE = eINSTANCE.getCharLiteral_Value();

    /**
     * The meta object literal for the '{@link org.spp.cocome.types.types.impl.NumberLiteralImpl <em>Number Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.spp.cocome.types.types.impl.NumberLiteralImpl
     * @see org.spp.cocome.types.types.impl.TypesPackageImpl#getNumberLiteral()
     * @generated
     */
    EClass NUMBER_LITERAL = eINSTANCE.getNumberLiteral();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NUMBER_LITERAL__VALUE = eINSTANCE.getNumberLiteral_Value();

    /**
     * The meta object literal for the '{@link org.spp.cocome.types.types.impl.BooleanLiteralImpl <em>Boolean Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.spp.cocome.types.types.impl.BooleanLiteralImpl
     * @see org.spp.cocome.types.types.impl.TypesPackageImpl#getBooleanLiteral()
     * @generated
     */
    EClass BOOLEAN_LITERAL = eINSTANCE.getBooleanLiteral();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BOOLEAN_LITERAL__VALUE = eINSTANCE.getBooleanLiteral_Value();

    /**
     * The meta object literal for the '{@link org.spp.cocome.types.types.impl.PropertyReferenceImpl <em>Property Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.spp.cocome.types.types.impl.PropertyReferenceImpl
     * @see org.spp.cocome.types.types.impl.TypesPackageImpl#getPropertyReference()
     * @generated
     */
    EClass PROPERTY_REFERENCE = eINSTANCE.getPropertyReference();

    /**
     * The meta object literal for the '<em><b>Reference</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROPERTY_REFERENCE__REFERENCE = eINSTANCE.getPropertyReference_Reference();

    /**
     * The meta object literal for the '{@link org.spp.cocome.types.types.TypeStorageModifier <em>Type Storage Modifier</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.spp.cocome.types.types.TypeStorageModifier
     * @see org.spp.cocome.types.types.impl.TypesPackageImpl#getTypeStorageModifier()
     * @generated
     */
    EEnum TYPE_STORAGE_MODIFIER = eINSTANCE.getTypeStorageModifier();

    /**
     * The meta object literal for the '{@link org.spp.cocome.types.types.EntityRelationshipKind <em>Entity Relationship Kind</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.spp.cocome.types.types.EntityRelationshipKind
     * @see org.spp.cocome.types.types.impl.TypesPackageImpl#getEntityRelationshipKind()
     * @generated
     */
    EEnum ENTITY_RELATIONSHIP_KIND = eINSTANCE.getEntityRelationshipKind();

    /**
     * The meta object literal for the '{@link org.spp.cocome.types.types.PropertyStorageModifier <em>Property Storage Modifier</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.spp.cocome.types.types.PropertyStorageModifier
     * @see org.spp.cocome.types.types.impl.TypesPackageImpl#getPropertyStorageModifier()
     * @generated
     */
    EEnum PROPERTY_STORAGE_MODIFIER = eINSTANCE.getPropertyStorageModifier();

  }

} //TypesPackage
