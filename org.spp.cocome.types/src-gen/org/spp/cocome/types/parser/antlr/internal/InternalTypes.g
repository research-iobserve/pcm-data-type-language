/*
* generated by Xtext
*/
grammar InternalTypes;

options {
	superClass=AbstractInternalAntlrParser;
	
}

@lexer::header {
package org.spp.cocome.types.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.spp.cocome.types.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.spp.cocome.types.services.TypesGrammarAccess;

}

@parser::members {

 	private TypesGrammarAccess grammarAccess;
 	
    public InternalTypesParser(TokenStream input, TypesGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }
    
    @Override
    protected String getFirstRuleName() {
    	return "Model";	
   	}
   	
   	@Override
   	protected TypesGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRuleModel
entryRuleModel returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getModelRule()); }
	 iv_ruleModel=ruleModel 
	 { $current=$iv_ruleModel.current; } 
	 EOF 
;

// Rule Model
ruleModel returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='package' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getModelAccess().getPackageKeyword_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getModelAccess().getNameQualifiedNameParserRuleCall_1_0()); 
	    }
		lv_name_1_0=ruleQualifiedName		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getModelRule());
	        }
       		set(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"QualifiedName");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getModelAccess().getImportsImportParserRuleCall_2_0()); 
	    }
		lv_imports_2_0=ruleImport		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getModelRule());
	        }
       		add(
       			$current, 
       			"imports",
        		lv_imports_2_0, 
        		"Import");
	        afterParserOrEnumRuleCall();
	    }

)
)*(
(
		{ 
	        newCompositeNode(grammarAccess.getModelAccess().getTypesComplexTypeParserRuleCall_3_0()); 
	    }
		lv_types_3_0=ruleComplexType		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getModelRule());
	        }
       		add(
       			$current, 
       			"types",
        		lv_types_3_0, 
        		"ComplexType");
	        afterParserOrEnumRuleCall();
	    }

)
)*)
;





// Entry rule entryRuleImport
entryRuleImport returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getImportRule()); }
	 iv_ruleImport=ruleImport 
	 { $current=$iv_ruleImport.current; } 
	 EOF 
;

// Rule Import
ruleImport returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='import' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); 
	    }
		lv_importedNamespace_1_0=ruleQualifiedNameWithWildcard		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getImportRule());
	        }
       		set(
       			$current, 
       			"importedNamespace",
        		lv_importedNamespace_1_0, 
        		"QualifiedNameWithWildcard");
	        afterParserOrEnumRuleCall();
	    }

)
))
;







// Entry rule entryRuleNamedType
entryRuleNamedType returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getNamedTypeRule()); }
	 iv_ruleNamedType=ruleNamedType 
	 { $current=$iv_ruleNamedType.current; } 
	 EOF 
;

// Rule NamedType
ruleNamedType returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getNamedTypeAccess().getComplexTypeParserRuleCall_0()); 
    }
    this_ComplexType_0=ruleComplexType
    { 
        $current = $this_ComplexType_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getNamedTypeAccess().getPrimitiveTypeParserRuleCall_1()); 
    }
    this_PrimitiveType_1=rulePrimitiveType
    { 
        $current = $this_PrimitiveType_1.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleCollectionType
entryRuleCollectionType returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getCollectionTypeRule()); }
	 iv_ruleCollectionType=ruleCollectionType 
	 { $current=$iv_ruleCollectionType.current; } 
	 EOF 
;

// Rule CollectionType
ruleCollectionType returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		{ 
	        newCompositeNode(grammarAccess.getCollectionTypeAccess().getReferenceTypeReferenceParserRuleCall_0_0()); 
	    }
		lv_reference_0_0=ruleTypeReference		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getCollectionTypeRule());
	        }
       		set(
       			$current, 
       			"reference",
        		lv_reference_0_0, 
        		"TypeReference");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_1='[' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getCollectionTypeAccess().getLeftSquareBracketKeyword_1());
    }
(
(
		lv_size_2_0=RULE_INT
		{
			newLeafNode(lv_size_2_0, grammarAccess.getCollectionTypeAccess().getSizeINTTerminalRuleCall_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getCollectionTypeRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"size",
        		lv_size_2_0, 
        		"INT");
	    }

)
)?	otherlv_3=']' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getCollectionTypeAccess().getRightSquareBracketKeyword_3());
    }
)
;





// Entry rule entryRuleMapType
entryRuleMapType returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMapTypeRule()); }
	 iv_ruleMapType=ruleMapType 
	 { $current=$iv_ruleMapType.current; } 
	 EOF 
;

// Rule MapType
ruleMapType returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		{ 
	        newCompositeNode(grammarAccess.getMapTypeAccess().getReferenceTypeReferenceParserRuleCall_0_0()); 
	    }
		lv_reference_0_0=ruleTypeReference		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMapTypeRule());
	        }
       		set(
       			$current, 
       			"reference",
        		lv_reference_0_0, 
        		"TypeReference");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_1='<' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getMapTypeAccess().getLessThanSignKeyword_1());
    }
((
(
		{ 
	        newCompositeNode(grammarAccess.getMapTypeAccess().getMapTypeTypeReferenceParserRuleCall_2_0_0()); 
	    }
		lv_mapType_2_0=ruleTypeReference		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMapTypeRule());
	        }
       		set(
       			$current, 
       			"mapType",
        		lv_mapType_2_0, 
        		"TypeReference");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_3='>' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getMapTypeAccess().getGreaterThanSignKeyword_2_1());
    }
)	otherlv_4='[' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getMapTypeAccess().getLeftSquareBracketKeyword_3());
    }
(
(
		lv_size_5_0=RULE_INT
		{
			newLeafNode(lv_size_5_0, grammarAccess.getMapTypeAccess().getSizeINTTerminalRuleCall_4_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getMapTypeRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"size",
        		lv_size_5_0, 
        		"INT");
	    }

)
)?	otherlv_6=']' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getMapTypeAccess().getRightSquareBracketKeyword_5());
    }
)
;





// Entry rule entryRuleDeclarationTypeReference
entryRuleDeclarationTypeReference returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getDeclarationTypeReferenceRule()); }
	 iv_ruleDeclarationTypeReference=ruleDeclarationTypeReference 
	 { $current=$iv_ruleDeclarationTypeReference.current; } 
	 EOF 
;

// Rule DeclarationTypeReference
ruleDeclarationTypeReference returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getDeclarationTypeReferenceAccess().getTypeReferenceParserRuleCall_0()); 
    }
    this_TypeReference_0=ruleTypeReference
    { 
        $current = $this_TypeReference_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getDeclarationTypeReferenceAccess().getCollectionTypeParserRuleCall_1()); 
    }
    this_CollectionType_1=ruleCollectionType
    { 
        $current = $this_CollectionType_1.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getDeclarationTypeReferenceAccess().getMapTypeParserRuleCall_2()); 
    }
    this_MapType_2=ruleMapType
    { 
        $current = $this_MapType_2.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleTypeReference
entryRuleTypeReference returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getTypeReferenceRule()); }
	 iv_ruleTypeReference=ruleTypeReference 
	 { $current=$iv_ruleTypeReference.current; } 
	 EOF 
;

// Rule TypeReference
ruleTypeReference returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getTypeReferenceRule());
	        }
        }
	otherlv_0=RULE_ID
	{
		newLeafNode(otherlv_0, grammarAccess.getTypeReferenceAccess().getReferenceNamedTypeCrossReference_0()); 
	}

)
)
;





// Entry rule entryRulePrimitiveType
entryRulePrimitiveType returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getPrimitiveTypeRule()); }
	 iv_rulePrimitiveType=rulePrimitiveType 
	 { $current=$iv_rulePrimitiveType.current; } 
	 EOF 
;

// Rule PrimitiveType
rulePrimitiveType returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
(
		lv_name_0_0=RULE_ID
		{
			newLeafNode(lv_name_0_0, grammarAccess.getPrimitiveTypeAccess().getNameIDTerminalRuleCall_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getPrimitiveTypeRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_0_0, 
        		"ID");
	    }

)
)
;





// Entry rule entryRuleComplexType
entryRuleComplexType returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getComplexTypeRule()); }
	 iv_ruleComplexType=ruleComplexType 
	 { $current=$iv_ruleComplexType.current; } 
	 EOF 
;

// Rule ComplexType
ruleComplexType returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getComplexTypeAccess().getEnumerationTypeParserRuleCall_0()); 
    }
    this_EnumerationType_0=ruleEnumerationType
    { 
        $current = $this_EnumerationType_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getComplexTypeAccess().getEntityTypeParserRuleCall_1()); 
    }
    this_EntityType_1=ruleEntityType
    { 
        $current = $this_EntityType_1.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleEnumerationType
entryRuleEnumerationType returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getEnumerationTypeRule()); }
	 iv_ruleEnumerationType=ruleEnumerationType 
	 { $current=$iv_ruleEnumerationType.current; } 
	 EOF 
;

// Rule EnumerationType
ruleEnumerationType returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='enum' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getEnumerationTypeAccess().getEnumKeyword_0());
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getEnumerationTypeAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getEnumerationTypeRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
)(	otherlv_2=':' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getEnumerationTypeAccess().getColonKeyword_2_0());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getEnumerationTypeRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getEnumerationTypeAccess().getParentEnumerationTypeCrossReference_2_1_0()); 
	    }
		ruleQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
))?	otherlv_4='{' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getEnumerationTypeAccess().getLeftCurlyBracketKeyword_3());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getEnumerationTypeAccess().getLiteralsEnumerationLiteralParserRuleCall_4_0()); 
	    }
		lv_literals_5_0=ruleEnumerationLiteral		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getEnumerationTypeRule());
	        }
       		add(
       			$current, 
       			"literals",
        		lv_literals_5_0, 
        		"EnumerationLiteral");
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_6=',' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getEnumerationTypeAccess().getCommaKeyword_5_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getEnumerationTypeAccess().getLiteralsEnumerationLiteralParserRuleCall_5_1_0()); 
	    }
		lv_literals_7_0=ruleEnumerationLiteral		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getEnumerationTypeRule());
	        }
       		add(
       			$current, 
       			"literals",
        		lv_literals_7_0, 
        		"EnumerationLiteral");
	        afterParserOrEnumRuleCall();
	    }

)
))*	otherlv_8='}' 
    {
    	newLeafNode(otherlv_8, grammarAccess.getEnumerationTypeAccess().getRightCurlyBracketKeyword_6());
    }
)
;





// Entry rule entryRuleEnumerationLiteral
entryRuleEnumerationLiteral returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getEnumerationLiteralRule()); }
	 iv_ruleEnumerationLiteral=ruleEnumerationLiteral 
	 { $current=$iv_ruleEnumerationLiteral.current; } 
	 EOF 
;

// Rule EnumerationLiteral
ruleEnumerationLiteral returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
(
		lv_name_0_0=RULE_ID
		{
			newLeafNode(lv_name_0_0, grammarAccess.getEnumerationLiteralAccess().getNameIDTerminalRuleCall_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getEnumerationLiteralRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_0_0, 
        		"ID");
	    }

)
)
;





// Entry rule entryRuleEntityType
entryRuleEntityType returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getEntityTypeRule()); }
	 iv_ruleEntityType=ruleEntityType 
	 { $current=$iv_ruleEntityType.current; } 
	 EOF 
;

// Rule EntityType
ruleEntityType returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='entity' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getEntityTypeAccess().getEntityKeyword_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getEntityTypeAccess().getStorageModifierTypeStorageModifierEnumRuleCall_1_0()); 
	    }
		lv_storageModifier_1_0=ruleTypeStorageModifier		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getEntityTypeRule());
	        }
       		set(
       			$current, 
       			"storageModifier",
        		lv_storageModifier_1_0, 
        		"TypeStorageModifier");
	        afterParserOrEnumRuleCall();
	    }

)
)?(
(
		lv_name_2_0=RULE_ID
		{
			newLeafNode(lv_name_2_0, grammarAccess.getEntityTypeAccess().getNameIDTerminalRuleCall_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getEntityTypeRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_2_0, 
        		"ID");
	    }

)
)(	otherlv_3=':' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getEntityTypeAccess().getColonKeyword_3_0());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getEntityTypeRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getEntityTypeAccess().getParentComplexTypeCrossReference_3_1_0()); 
	    }
		ruleQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
))?	otherlv_5='{' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getEntityTypeAccess().getLeftCurlyBracketKeyword_4());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getEntityTypeAccess().getPropertiesPropertyParserRuleCall_5_0()); 
	    }
		lv_properties_6_0=ruleProperty		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getEntityTypeRule());
	        }
       		add(
       			$current, 
       			"properties",
        		lv_properties_6_0, 
        		"Property");
	        afterParserOrEnumRuleCall();
	    }

)
)*	otherlv_7='}' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getEntityTypeAccess().getRightCurlyBracketKeyword_6());
    }
)
;





// Entry rule entryRuleProperty
entryRuleProperty returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getPropertyRule()); }
	 iv_ruleProperty=ruleProperty 
	 { $current=$iv_ruleProperty.current; } 
	 EOF 
;

// Rule Property
ruleProperty returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		{ 
	        newCompositeNode(grammarAccess.getPropertyAccess().getStorageModifierPropertyStorageModifierEnumRuleCall_0_0()); 
	    }
		lv_storageModifier_0_0=rulePropertyStorageModifier		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getPropertyRule());
	        }
       		set(
       			$current, 
       			"storageModifier",
        		lv_storageModifier_0_0, 
        		"PropertyStorageModifier");
	        afterParserOrEnumRuleCall();
	    }

)
)?(
(
		{ 
	        newCompositeNode(grammarAccess.getPropertyAccess().getTypeDeclarationTypeReferenceParserRuleCall_1_0()); 
	    }
		lv_type_1_0=ruleDeclarationTypeReference		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getPropertyRule());
	        }
       		set(
       			$current, 
       			"type",
        		lv_type_1_0, 
        		"DeclarationTypeReference");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		lv_name_2_0=RULE_ID
		{
			newLeafNode(lv_name_2_0, grammarAccess.getPropertyAccess().getNameIDTerminalRuleCall_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getPropertyRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_2_0, 
        		"ID");
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getPropertyAccess().getRelationshipEntityRelationshipParserRuleCall_3_0()); 
	    }
		lv_relationship_3_0=ruleEntityRelationship		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getPropertyRule());
	        }
       		set(
       			$current, 
       			"relationship",
        		lv_relationship_3_0, 
        		"EntityRelationship");
	        afterParserOrEnumRuleCall();
	    }

)
)?(	otherlv_4='order' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getPropertyAccess().getOrderKeyword_4_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getPropertyAccess().getOrderByPropertyReferenceParserRuleCall_4_1_0()); 
	    }
		lv_orderBy_5_0=rulePropertyReference		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getPropertyRule());
	        }
       		set(
       			$current, 
       			"orderBy",
        		lv_orderBy_5_0, 
        		"PropertyReference");
	        afterParserOrEnumRuleCall();
	    }

)
))?(	otherlv_6='key' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getPropertyAccess().getKeyKeyword_5_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getPropertyAccess().getMapKeyPropertyReferenceParserRuleCall_5_1_0()); 
	    }
		lv_mapKey_7_0=rulePropertyReference		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getPropertyRule());
	        }
       		set(
       			$current, 
       			"mapKey",
        		lv_mapKey_7_0, 
        		"PropertyReference");
	        afterParserOrEnumRuleCall();
	    }

)
))?(	otherlv_8='=' 
    {
    	newLeafNode(otherlv_8, grammarAccess.getPropertyAccess().getEqualsSignKeyword_6_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getPropertyAccess().getLiteralLiteralParserRuleCall_6_1_0()); 
	    }
		lv_literal_9_0=ruleLiteral		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getPropertyRule());
	        }
       		set(
       			$current, 
       			"literal",
        		lv_literal_9_0, 
        		"Literal");
	        afterParserOrEnumRuleCall();
	    }

)
))?)
;





// Entry rule entryRuleEntityRelationship
entryRuleEntityRelationship returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getEntityRelationshipRule()); }
	 iv_ruleEntityRelationship=ruleEntityRelationship 
	 { $current=$iv_ruleEntityRelationship.current; } 
	 EOF 
;

// Rule EntityRelationship
ruleEntityRelationship returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getEntityRelationshipAccess().getEntityRelationshipAction_0(),
            $current);
    }
)(
(
		{ 
	        newCompositeNode(grammarAccess.getEntityRelationshipAccess().getKindEntityRelationshipKindEnumRuleCall_1_0()); 
	    }
		lv_kind_1_0=ruleEntityRelationshipKind		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getEntityRelationshipRule());
	        }
       		set(
       			$current, 
       			"kind",
        		lv_kind_1_0, 
        		"EntityRelationshipKind");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getEntityRelationshipAccess().getMappedByMappedByReferenceParserRuleCall_2_0()); 
	    }
		lv_mappedBy_2_0=ruleMappedByReference		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getEntityRelationshipRule());
	        }
       		set(
       			$current, 
       			"mappedBy",
        		lv_mappedBy_2_0, 
        		"MappedByReference");
	        afterParserOrEnumRuleCall();
	    }

)
)?)
;





// Entry rule entryRuleMappedByReference
entryRuleMappedByReference returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMappedByReferenceRule()); }
	 iv_ruleMappedByReference=ruleMappedByReference 
	 { $current=$iv_ruleMappedByReference.current; } 
	 EOF 
;

// Rule MappedByReference
ruleMappedByReference returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMappedByReferenceRule());
	        }
        }
	otherlv_0=RULE_ID
	{
		newLeafNode(otherlv_0, grammarAccess.getMappedByReferenceAccess().getBasePropertyCrossReference_0_0()); 
	}

)
)(	otherlv_1='.' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getMappedByReferenceAccess().getFullStopKeyword_1_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMappedByReferenceAccess().getPathMappedByReferenceParserRuleCall_1_1_0()); 
	    }
		lv_path_2_0=ruleMappedByReference		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMappedByReferenceRule());
	        }
       		set(
       			$current, 
       			"path",
        		lv_path_2_0, 
        		"MappedByReference");
	        afterParserOrEnumRuleCall();
	    }

)
))?)
;





// Entry rule entryRuleLiteral
entryRuleLiteral returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getLiteralRule()); }
	 iv_ruleLiteral=ruleLiteral 
	 { $current=$iv_ruleLiteral.current; } 
	 EOF 
;

// Rule Literal
ruleLiteral returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getLiteralAccess().getBooleanLiteralParserRuleCall_0()); 
    }
    this_BooleanLiteral_0=ruleBooleanLiteral
    { 
        $current = $this_BooleanLiteral_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getLiteralAccess().getNumberLiteralParserRuleCall_1()); 
    }
    this_NumberLiteral_1=ruleNumberLiteral
    { 
        $current = $this_NumberLiteral_1.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getLiteralAccess().getCharLiteralParserRuleCall_2()); 
    }
    this_CharLiteral_2=ruleCharLiteral
    { 
        $current = $this_CharLiteral_2.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getLiteralAccess().getStringLiteralParserRuleCall_3()); 
    }
    this_StringLiteral_3=ruleStringLiteral
    { 
        $current = $this_StringLiteral_3.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getLiteralAccess().getPropertyReferenceParserRuleCall_4()); 
    }
    this_PropertyReference_4=rulePropertyReference
    { 
        $current = $this_PropertyReference_4.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleStringLiteral
entryRuleStringLiteral returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getStringLiteralRule()); }
	 iv_ruleStringLiteral=ruleStringLiteral 
	 { $current=$iv_ruleStringLiteral.current; } 
	 EOF 
;

// Rule StringLiteral
ruleStringLiteral returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
(
		lv_value_0_0=RULE_STRING
		{
			newLeafNode(lv_value_0_0, grammarAccess.getStringLiteralAccess().getValueSTRINGTerminalRuleCall_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getStringLiteralRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"value",
        		lv_value_0_0, 
        		"STRING");
	    }

)
)
;





// Entry rule entryRuleCharLiteral
entryRuleCharLiteral returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getCharLiteralRule()); }
	 iv_ruleCharLiteral=ruleCharLiteral 
	 { $current=$iv_ruleCharLiteral.current; } 
	 EOF 
;

// Rule CharLiteral
ruleCharLiteral returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
(
		lv_value_0_0=RULE_CHARACTER
		{
			newLeafNode(lv_value_0_0, grammarAccess.getCharLiteralAccess().getValueCHARACTERTerminalRuleCall_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getCharLiteralRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"value",
        		lv_value_0_0, 
        		"CHARACTER");
	    }

)
)
;





// Entry rule entryRuleNumberLiteral
entryRuleNumberLiteral returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getNumberLiteralRule()); }
	 iv_ruleNumberLiteral=ruleNumberLiteral 
	 { $current=$iv_ruleNumberLiteral.current; } 
	 EOF 
;

// Rule NumberLiteral
ruleNumberLiteral returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
(
		{ 
	        newCompositeNode(grammarAccess.getNumberLiteralAccess().getValueNUMBERParserRuleCall_0()); 
	    }
		lv_value_0_0=ruleNUMBER		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getNumberLiteralRule());
	        }
       		set(
       			$current, 
       			"value",
        		lv_value_0_0, 
        		"NUMBER");
	        afterParserOrEnumRuleCall();
	    }

)
)
;





// Entry rule entryRuleBooleanLiteral
entryRuleBooleanLiteral returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getBooleanLiteralRule()); }
	 iv_ruleBooleanLiteral=ruleBooleanLiteral 
	 { $current=$iv_ruleBooleanLiteral.current; } 
	 EOF 
;

// Rule BooleanLiteral
ruleBooleanLiteral returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
(
		{ 
	        newCompositeNode(grammarAccess.getBooleanLiteralAccess().getValueBOOLEANParserRuleCall_0()); 
	    }
		lv_value_0_0=ruleBOOLEAN		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getBooleanLiteralRule());
	        }
       		set(
       			$current, 
       			"value",
        		lv_value_0_0, 
        		"BOOLEAN");
	        afterParserOrEnumRuleCall();
	    }

)
)
;





// Entry rule entryRulePropertyReference
entryRulePropertyReference returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getPropertyReferenceRule()); }
	 iv_rulePropertyReference=rulePropertyReference 
	 { $current=$iv_rulePropertyReference.current; } 
	 EOF 
;

// Rule PropertyReference
rulePropertyReference returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getPropertyReferenceRule());
	        }
        }
	otherlv_0=RULE_ID
	{
		newLeafNode(otherlv_0, grammarAccess.getPropertyReferenceAccess().getReferencePropertyCrossReference_0()); 
	}

)
)
;





// Entry rule entryRuleQualifiedName
entryRuleQualifiedName returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getQualifiedNameRule()); } 
	 iv_ruleQualifiedName=ruleQualifiedName 
	 { $current=$iv_ruleQualifiedName.current.getText(); }  
	 EOF 
;

// Rule QualifiedName
ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(    this_ID_0=RULE_ID    {
		$current.merge(this_ID_0);
    }

    { 
    newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
    }
(
	kw='.' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
    }
    this_ID_2=RULE_ID    {
		$current.merge(this_ID_2);
    }

    { 
    newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
    }
)*)
    ;





// Entry rule entryRuleQualifiedNameWithWildcard
entryRuleQualifiedNameWithWildcard returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getQualifiedNameWithWildcardRule()); } 
	 iv_ruleQualifiedNameWithWildcard=ruleQualifiedNameWithWildcard 
	 { $current=$iv_ruleQualifiedNameWithWildcard.current.getText(); }  
	 EOF 
;

// Rule QualifiedNameWithWildcard
ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
    }
    this_QualifiedName_0=ruleQualifiedName    {
		$current.merge(this_QualifiedName_0);
    }

    { 
        afterParserOrEnumRuleCall();
    }
(
	kw='.' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopKeyword_1_0()); 
    }

	kw='*' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getQualifiedNameWithWildcardAccess().getAsteriskKeyword_1_1()); 
    }
)?)
    ;





// Entry rule entryRuleBOOLEAN
entryRuleBOOLEAN returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getBOOLEANRule()); } 
	 iv_ruleBOOLEAN=ruleBOOLEAN 
	 { $current=$iv_ruleBOOLEAN.current.getText(); }  
	 EOF 
;

// Rule BOOLEAN
ruleBOOLEAN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
	kw='true' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getBOOLEANAccess().getTrueKeyword_0()); 
    }

    |
	kw='false' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getBOOLEANAccess().getFalseKeyword_1()); 
    }
)
    ;





// Entry rule entryRuleNUMBER
entryRuleNUMBER returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getNUMBERRule()); } 
	 iv_ruleNUMBER=ruleNUMBER 
	 { $current=$iv_ruleNUMBER.current.getText(); }  
	 EOF 
;

// Rule NUMBER
ruleNUMBER returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(((
	kw='+' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getNUMBERAccess().getPlusSignKeyword_0_0_0()); 
    }

    |
	kw='-' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getNUMBERAccess().getHyphenMinusKeyword_0_0_1()); 
    }
)?    this_INT_2=RULE_INT    {
		$current.merge(this_INT_2);
    }

    { 
    newLeafNode(this_INT_2, grammarAccess.getNUMBERAccess().getINTTerminalRuleCall_0_1()); 
    }
)
    |(    this_INT_3=RULE_INT    {
		$current.merge(this_INT_3);
    }

    { 
    newLeafNode(this_INT_3, grammarAccess.getNUMBERAccess().getINTTerminalRuleCall_1_0()); 
    }

	kw='.' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getNUMBERAccess().getFullStopKeyword_1_1()); 
    }
    this_INT_5=RULE_INT    {
		$current.merge(this_INT_5);
    }

    { 
    newLeafNode(this_INT_5, grammarAccess.getNUMBERAccess().getINTTerminalRuleCall_1_2()); 
    }
))
    ;





// Rule TypeStorageModifier
ruleTypeStorageModifier returns [Enumerator current=null] 
    @init { enterRule(); }
    @after { leaveRule(); }:
((	enumLiteral_0=' storable' 
	{
        $current = grammarAccess.getTypeStorageModifierAccess().getSTORABLEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_0, grammarAccess.getTypeStorageModifierAccess().getSTORABLEEnumLiteralDeclaration_0()); 
    }
)
    |(	enumLiteral_1='embeddable' 
	{
        $current = grammarAccess.getTypeStorageModifierAccess().getEMBEDDABLEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_1, grammarAccess.getTypeStorageModifierAccess().getEMBEDDABLEEnumLiteralDeclaration_1()); 
    }
));



// Rule EntityRelationshipKind
ruleEntityRelationshipKind returns [Enumerator current=null] 
    @init { enterRule(); }
    @after { leaveRule(); }:
((	enumLiteral_0='unique' 
	{
        $current = grammarAccess.getEntityRelationshipKindAccess().getUNIQUEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_0, grammarAccess.getEntityRelationshipKindAccess().getUNIQUEEnumLiteralDeclaration_0()); 
    }
)
    |(	enumLiteral_1='many' 
	{
        $current = grammarAccess.getEntityRelationshipKindAccess().getMANYEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_1, grammarAccess.getEntityRelationshipKindAccess().getMANYEnumLiteralDeclaration_1()); 
    }
));



// Rule PropertyStorageModifier
rulePropertyStorageModifier returns [Enumerator current=null] 
    @init { enterRule(); }
    @after { leaveRule(); }:
((	enumLiteral_0='var' 
	{
        $current = grammarAccess.getPropertyStorageModifierAccess().getVARIABLEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_0, grammarAccess.getPropertyStorageModifierAccess().getVARIABLEEnumLiteralDeclaration_0()); 
    }
)
    |(	enumLiteral_1='val' 
	{
        $current = grammarAccess.getPropertyStorageModifierAccess().getVALUEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_1, grammarAccess.getPropertyStorageModifierAccess().getVALUEEnumLiteralDeclaration_1()); 
    }
)
    |(	enumLiteral_2='transient' 
	{
        $current = grammarAccess.getPropertyStorageModifierAccess().getTRANSIENTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_2, grammarAccess.getPropertyStorageModifierAccess().getTRANSIENTEnumLiteralDeclaration_2()); 
    }
));



RULE_CHARACTER : '\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'\''))) '\'';

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


