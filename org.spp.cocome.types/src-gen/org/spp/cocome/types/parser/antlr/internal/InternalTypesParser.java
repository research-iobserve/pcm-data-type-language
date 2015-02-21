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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTypesParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_CHARACTER", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "'import'", "'['", "']'", "'<'", "'>'", "'enum'", "':'", "'{'", "','", "'}'", "'entity'", "'order'", "'key'", "'='", "'.'", "'*'", "'true'", "'false'", "'+'", "'-'", "' storable'", "'embeddable'", "'unique'", "'many'", "'var'", "'val'", "'transient'"
    };
    public static final int RULE_ID=5;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_CHARACTER=7;
    public static final int RULE_SL_COMMENT=9;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int T__31=31;
    public static final int RULE_STRING=6;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__16=16;
    public static final int T__34=34;
    public static final int T__15=15;
    public static final int T__35=35;
    public static final int T__18=18;
    public static final int T__36=36;
    public static final int T__17=17;
    public static final int T__37=37;
    public static final int T__12=12;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=4;
    public static final int RULE_WS=10;

    // delegates
    // delegators


        public InternalTypesParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalTypesParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalTypesParser.tokenNames; }
    public String getGrammarFileName() { return "../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g"; }



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



    // $ANTLR start "entryRuleModel"
    // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:68:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:69:2: (iv_ruleModel= ruleModel EOF )
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:70:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:77:1: ruleModel returns [EObject current=null] : (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_imports_2_0= ruleImport ) )* ( (lv_types_3_0= ruleComplexType ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_imports_2_0 = null;

        EObject lv_types_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:80:28: ( (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_imports_2_0= ruleImport ) )* ( (lv_types_3_0= ruleComplexType ) )* ) )
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:81:1: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_imports_2_0= ruleImport ) )* ( (lv_types_3_0= ruleComplexType ) )* )
            {
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:81:1: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_imports_2_0= ruleImport ) )* ( (lv_types_3_0= ruleComplexType ) )* )
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:81:3: otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_imports_2_0= ruleImport ) )* ( (lv_types_3_0= ruleComplexType ) )*
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruleModel122); 

                	newLeafNode(otherlv_0, grammarAccess.getModelAccess().getPackageKeyword_0());
                
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:85:1: ( (lv_name_1_0= ruleQualifiedName ) )
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:86:1: (lv_name_1_0= ruleQualifiedName )
            {
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:86:1: (lv_name_1_0= ruleQualifiedName )
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:87:3: lv_name_1_0= ruleQualifiedName
            {
             
            	        newCompositeNode(grammarAccess.getModelAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleModel143);
            lv_name_1_0=ruleQualifiedName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getModelRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"QualifiedName");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:103:2: ( (lv_imports_2_0= ruleImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:104:1: (lv_imports_2_0= ruleImport )
            	    {
            	    // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:104:1: (lv_imports_2_0= ruleImport )
            	    // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:105:3: lv_imports_2_0= ruleImport
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getImportsImportParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleImport_in_ruleModel164);
            	    lv_imports_2_0=ruleImport();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"imports",
            	            		lv_imports_2_0, 
            	            		"Import");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:121:3: ( (lv_types_3_0= ruleComplexType ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==18||LA2_0==23) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:122:1: (lv_types_3_0= ruleComplexType )
            	    {
            	    // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:122:1: (lv_types_3_0= ruleComplexType )
            	    // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:123:3: lv_types_3_0= ruleComplexType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getTypesComplexTypeParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleComplexType_in_ruleModel186);
            	    lv_types_3_0=ruleComplexType();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"types",
            	            		lv_types_3_0, 
            	            		"ComplexType");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleImport"
    // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:147:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:148:2: (iv_ruleImport= ruleImport EOF )
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:149:2: iv_ruleImport= ruleImport EOF
            {
             newCompositeNode(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport223);
            iv_ruleImport=ruleImport();

            state._fsp--;

             current =iv_ruleImport; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport233); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:156:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:159:28: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) )
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:160:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            {
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:160:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:160:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleImport270); 

                	newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
                
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:164:1: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:165:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            {
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:165:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:166:3: lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard
            {
             
            	        newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_ruleImport291);
            lv_importedNamespace_1_0=ruleQualifiedNameWithWildcard();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getImportRule());
            	        }
                   		set(
                   			current, 
                   			"importedNamespace",
                    		lv_importedNamespace_1_0, 
                    		"QualifiedNameWithWildcard");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleNamedType"
    // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:192:1: entryRuleNamedType returns [EObject current=null] : iv_ruleNamedType= ruleNamedType EOF ;
    public final EObject entryRuleNamedType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamedType = null;


        try {
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:193:2: (iv_ruleNamedType= ruleNamedType EOF )
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:194:2: iv_ruleNamedType= ruleNamedType EOF
            {
             newCompositeNode(grammarAccess.getNamedTypeRule()); 
            pushFollow(FOLLOW_ruleNamedType_in_entryRuleNamedType329);
            iv_ruleNamedType=ruleNamedType();

            state._fsp--;

             current =iv_ruleNamedType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNamedType339); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNamedType"


    // $ANTLR start "ruleNamedType"
    // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:201:1: ruleNamedType returns [EObject current=null] : (this_ComplexType_0= ruleComplexType | this_PrimitiveType_1= rulePrimitiveType ) ;
    public final EObject ruleNamedType() throws RecognitionException {
        EObject current = null;

        EObject this_ComplexType_0 = null;

        EObject this_PrimitiveType_1 = null;


         enterRule(); 
            
        try {
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:204:28: ( (this_ComplexType_0= ruleComplexType | this_PrimitiveType_1= rulePrimitiveType ) )
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:205:1: (this_ComplexType_0= ruleComplexType | this_PrimitiveType_1= rulePrimitiveType )
            {
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:205:1: (this_ComplexType_0= ruleComplexType | this_PrimitiveType_1= rulePrimitiveType )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==18||LA3_0==23) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:206:5: this_ComplexType_0= ruleComplexType
                    {
                     
                            newCompositeNode(grammarAccess.getNamedTypeAccess().getComplexTypeParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleComplexType_in_ruleNamedType386);
                    this_ComplexType_0=ruleComplexType();

                    state._fsp--;

                     
                            current = this_ComplexType_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:216:5: this_PrimitiveType_1= rulePrimitiveType
                    {
                     
                            newCompositeNode(grammarAccess.getNamedTypeAccess().getPrimitiveTypeParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_rulePrimitiveType_in_ruleNamedType413);
                    this_PrimitiveType_1=rulePrimitiveType();

                    state._fsp--;

                     
                            current = this_PrimitiveType_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNamedType"


    // $ANTLR start "entryRuleCollectionType"
    // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:232:1: entryRuleCollectionType returns [EObject current=null] : iv_ruleCollectionType= ruleCollectionType EOF ;
    public final EObject entryRuleCollectionType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectionType = null;


        try {
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:233:2: (iv_ruleCollectionType= ruleCollectionType EOF )
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:234:2: iv_ruleCollectionType= ruleCollectionType EOF
            {
             newCompositeNode(grammarAccess.getCollectionTypeRule()); 
            pushFollow(FOLLOW_ruleCollectionType_in_entryRuleCollectionType448);
            iv_ruleCollectionType=ruleCollectionType();

            state._fsp--;

             current =iv_ruleCollectionType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCollectionType458); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCollectionType"


    // $ANTLR start "ruleCollectionType"
    // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:241:1: ruleCollectionType returns [EObject current=null] : ( ( (lv_reference_0_0= ruleTypeReference ) ) otherlv_1= '[' ( (lv_size_2_0= RULE_INT ) )? otherlv_3= ']' ) ;
    public final EObject ruleCollectionType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_size_2_0=null;
        Token otherlv_3=null;
        EObject lv_reference_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:244:28: ( ( ( (lv_reference_0_0= ruleTypeReference ) ) otherlv_1= '[' ( (lv_size_2_0= RULE_INT ) )? otherlv_3= ']' ) )
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:245:1: ( ( (lv_reference_0_0= ruleTypeReference ) ) otherlv_1= '[' ( (lv_size_2_0= RULE_INT ) )? otherlv_3= ']' )
            {
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:245:1: ( ( (lv_reference_0_0= ruleTypeReference ) ) otherlv_1= '[' ( (lv_size_2_0= RULE_INT ) )? otherlv_3= ']' )
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:245:2: ( (lv_reference_0_0= ruleTypeReference ) ) otherlv_1= '[' ( (lv_size_2_0= RULE_INT ) )? otherlv_3= ']'
            {
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:245:2: ( (lv_reference_0_0= ruleTypeReference ) )
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:246:1: (lv_reference_0_0= ruleTypeReference )
            {
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:246:1: (lv_reference_0_0= ruleTypeReference )
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:247:3: lv_reference_0_0= ruleTypeReference
            {
             
            	        newCompositeNode(grammarAccess.getCollectionTypeAccess().getReferenceTypeReferenceParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeReference_in_ruleCollectionType504);
            lv_reference_0_0=ruleTypeReference();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCollectionTypeRule());
            	        }
                   		set(
                   			current, 
                   			"reference",
                    		lv_reference_0_0, 
                    		"TypeReference");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleCollectionType516); 

                	newLeafNode(otherlv_1, grammarAccess.getCollectionTypeAccess().getLeftSquareBracketKeyword_1());
                
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:267:1: ( (lv_size_2_0= RULE_INT ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_INT) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:268:1: (lv_size_2_0= RULE_INT )
                    {
                    // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:268:1: (lv_size_2_0= RULE_INT )
                    // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:269:3: lv_size_2_0= RULE_INT
                    {
                    lv_size_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleCollectionType533); 

                    			newLeafNode(lv_size_2_0, grammarAccess.getCollectionTypeAccess().getSizeINTTerminalRuleCall_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCollectionTypeRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"size",
                            		lv_size_2_0, 
                            		"INT");
                    	    

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleCollectionType551); 

                	newLeafNode(otherlv_3, grammarAccess.getCollectionTypeAccess().getRightSquareBracketKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCollectionType"


    // $ANTLR start "entryRuleMapType"
    // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:297:1: entryRuleMapType returns [EObject current=null] : iv_ruleMapType= ruleMapType EOF ;
    public final EObject entryRuleMapType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapType = null;


        try {
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:298:2: (iv_ruleMapType= ruleMapType EOF )
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:299:2: iv_ruleMapType= ruleMapType EOF
            {
             newCompositeNode(grammarAccess.getMapTypeRule()); 
            pushFollow(FOLLOW_ruleMapType_in_entryRuleMapType587);
            iv_ruleMapType=ruleMapType();

            state._fsp--;

             current =iv_ruleMapType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMapType597); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMapType"


    // $ANTLR start "ruleMapType"
    // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:306:1: ruleMapType returns [EObject current=null] : ( ( (lv_reference_0_0= ruleTypeReference ) ) otherlv_1= '<' ( ( (lv_mapType_2_0= ruleTypeReference ) ) otherlv_3= '>' ) otherlv_4= '[' ( (lv_size_5_0= RULE_INT ) )? otherlv_6= ']' ) ;
    public final EObject ruleMapType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_size_5_0=null;
        Token otherlv_6=null;
        EObject lv_reference_0_0 = null;

        EObject lv_mapType_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:309:28: ( ( ( (lv_reference_0_0= ruleTypeReference ) ) otherlv_1= '<' ( ( (lv_mapType_2_0= ruleTypeReference ) ) otherlv_3= '>' ) otherlv_4= '[' ( (lv_size_5_0= RULE_INT ) )? otherlv_6= ']' ) )
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:310:1: ( ( (lv_reference_0_0= ruleTypeReference ) ) otherlv_1= '<' ( ( (lv_mapType_2_0= ruleTypeReference ) ) otherlv_3= '>' ) otherlv_4= '[' ( (lv_size_5_0= RULE_INT ) )? otherlv_6= ']' )
            {
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:310:1: ( ( (lv_reference_0_0= ruleTypeReference ) ) otherlv_1= '<' ( ( (lv_mapType_2_0= ruleTypeReference ) ) otherlv_3= '>' ) otherlv_4= '[' ( (lv_size_5_0= RULE_INT ) )? otherlv_6= ']' )
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:310:2: ( (lv_reference_0_0= ruleTypeReference ) ) otherlv_1= '<' ( ( (lv_mapType_2_0= ruleTypeReference ) ) otherlv_3= '>' ) otherlv_4= '[' ( (lv_size_5_0= RULE_INT ) )? otherlv_6= ']'
            {
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:310:2: ( (lv_reference_0_0= ruleTypeReference ) )
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:311:1: (lv_reference_0_0= ruleTypeReference )
            {
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:311:1: (lv_reference_0_0= ruleTypeReference )
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:312:3: lv_reference_0_0= ruleTypeReference
            {
             
            	        newCompositeNode(grammarAccess.getMapTypeAccess().getReferenceTypeReferenceParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeReference_in_ruleMapType643);
            lv_reference_0_0=ruleTypeReference();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMapTypeRule());
            	        }
                   		set(
                   			current, 
                   			"reference",
                    		lv_reference_0_0, 
                    		"TypeReference");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleMapType655); 

                	newLeafNode(otherlv_1, grammarAccess.getMapTypeAccess().getLessThanSignKeyword_1());
                
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:332:1: ( ( (lv_mapType_2_0= ruleTypeReference ) ) otherlv_3= '>' )
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:332:2: ( (lv_mapType_2_0= ruleTypeReference ) ) otherlv_3= '>'
            {
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:332:2: ( (lv_mapType_2_0= ruleTypeReference ) )
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:333:1: (lv_mapType_2_0= ruleTypeReference )
            {
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:333:1: (lv_mapType_2_0= ruleTypeReference )
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:334:3: lv_mapType_2_0= ruleTypeReference
            {
             
            	        newCompositeNode(grammarAccess.getMapTypeAccess().getMapTypeTypeReferenceParserRuleCall_2_0_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeReference_in_ruleMapType677);
            lv_mapType_2_0=ruleTypeReference();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMapTypeRule());
            	        }
                   		set(
                   			current, 
                   			"mapType",
                    		lv_mapType_2_0, 
                    		"TypeReference");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleMapType689); 

                	newLeafNode(otherlv_3, grammarAccess.getMapTypeAccess().getGreaterThanSignKeyword_2_1());
                

            }

            otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleMapType702); 

                	newLeafNode(otherlv_4, grammarAccess.getMapTypeAccess().getLeftSquareBracketKeyword_3());
                
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:358:1: ( (lv_size_5_0= RULE_INT ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_INT) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:359:1: (lv_size_5_0= RULE_INT )
                    {
                    // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:359:1: (lv_size_5_0= RULE_INT )
                    // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:360:3: lv_size_5_0= RULE_INT
                    {
                    lv_size_5_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleMapType719); 

                    			newLeafNode(lv_size_5_0, grammarAccess.getMapTypeAccess().getSizeINTTerminalRuleCall_4_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMapTypeRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"size",
                            		lv_size_5_0, 
                            		"INT");
                    	    

                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,15,FOLLOW_15_in_ruleMapType737); 

                	newLeafNode(otherlv_6, grammarAccess.getMapTypeAccess().getRightSquareBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMapType"


    // $ANTLR start "entryRuleDeclarationTypeReference"
    // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:388:1: entryRuleDeclarationTypeReference returns [EObject current=null] : iv_ruleDeclarationTypeReference= ruleDeclarationTypeReference EOF ;
    public final EObject entryRuleDeclarationTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclarationTypeReference = null;


        try {
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:389:2: (iv_ruleDeclarationTypeReference= ruleDeclarationTypeReference EOF )
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:390:2: iv_ruleDeclarationTypeReference= ruleDeclarationTypeReference EOF
            {
             newCompositeNode(grammarAccess.getDeclarationTypeReferenceRule()); 
            pushFollow(FOLLOW_ruleDeclarationTypeReference_in_entryRuleDeclarationTypeReference773);
            iv_ruleDeclarationTypeReference=ruleDeclarationTypeReference();

            state._fsp--;

             current =iv_ruleDeclarationTypeReference; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeclarationTypeReference783); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDeclarationTypeReference"


    // $ANTLR start "ruleDeclarationTypeReference"
    // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:397:1: ruleDeclarationTypeReference returns [EObject current=null] : (this_TypeReference_0= ruleTypeReference | this_CollectionType_1= ruleCollectionType | this_MapType_2= ruleMapType ) ;
    public final EObject ruleDeclarationTypeReference() throws RecognitionException {
        EObject current = null;

        EObject this_TypeReference_0 = null;

        EObject this_CollectionType_1 = null;

        EObject this_MapType_2 = null;


         enterRule(); 
            
        try {
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:400:28: ( (this_TypeReference_0= ruleTypeReference | this_CollectionType_1= ruleCollectionType | this_MapType_2= ruleMapType ) )
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:401:1: (this_TypeReference_0= ruleTypeReference | this_CollectionType_1= ruleCollectionType | this_MapType_2= ruleMapType )
            {
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:401:1: (this_TypeReference_0= ruleTypeReference | this_CollectionType_1= ruleCollectionType | this_MapType_2= ruleMapType )
            int alt6=3;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case 16:
                    {
                    alt6=3;
                    }
                    break;
                case 14:
                    {
                    alt6=2;
                    }
                    break;
                case EOF:
                case RULE_ID:
                    {
                    alt6=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:402:5: this_TypeReference_0= ruleTypeReference
                    {
                     
                            newCompositeNode(grammarAccess.getDeclarationTypeReferenceAccess().getTypeReferenceParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleTypeReference_in_ruleDeclarationTypeReference830);
                    this_TypeReference_0=ruleTypeReference();

                    state._fsp--;

                     
                            current = this_TypeReference_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:412:5: this_CollectionType_1= ruleCollectionType
                    {
                     
                            newCompositeNode(grammarAccess.getDeclarationTypeReferenceAccess().getCollectionTypeParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleCollectionType_in_ruleDeclarationTypeReference857);
                    this_CollectionType_1=ruleCollectionType();

                    state._fsp--;

                     
                            current = this_CollectionType_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:422:5: this_MapType_2= ruleMapType
                    {
                     
                            newCompositeNode(grammarAccess.getDeclarationTypeReferenceAccess().getMapTypeParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleMapType_in_ruleDeclarationTypeReference884);
                    this_MapType_2=ruleMapType();

                    state._fsp--;

                     
                            current = this_MapType_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDeclarationTypeReference"


    // $ANTLR start "entryRuleTypeReference"
    // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:438:1: entryRuleTypeReference returns [EObject current=null] : iv_ruleTypeReference= ruleTypeReference EOF ;
    public final EObject entryRuleTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeReference = null;


        try {
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:439:2: (iv_ruleTypeReference= ruleTypeReference EOF )
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:440:2: iv_ruleTypeReference= ruleTypeReference EOF
            {
             newCompositeNode(grammarAccess.getTypeReferenceRule()); 
            pushFollow(FOLLOW_ruleTypeReference_in_entryRuleTypeReference919);
            iv_ruleTypeReference=ruleTypeReference();

            state._fsp--;

             current =iv_ruleTypeReference; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeReference929); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypeReference"


    // $ANTLR start "ruleTypeReference"
    // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:447:1: ruleTypeReference returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:450:28: ( ( (otherlv_0= RULE_ID ) ) )
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:451:1: ( (otherlv_0= RULE_ID ) )
            {
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:451:1: ( (otherlv_0= RULE_ID ) )
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:452:1: (otherlv_0= RULE_ID )
            {
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:452:1: (otherlv_0= RULE_ID )
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:453:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getTypeReferenceRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTypeReference973); 

            		newLeafNode(otherlv_0, grammarAccess.getTypeReferenceAccess().getReferenceNamedTypeCrossReference_0()); 
            	

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypeReference"


    // $ANTLR start "entryRulePrimitiveType"
    // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:472:1: entryRulePrimitiveType returns [EObject current=null] : iv_rulePrimitiveType= rulePrimitiveType EOF ;
    public final EObject entryRulePrimitiveType() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveType = null;


        try {
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:473:2: (iv_rulePrimitiveType= rulePrimitiveType EOF )
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:474:2: iv_rulePrimitiveType= rulePrimitiveType EOF
            {
             newCompositeNode(grammarAccess.getPrimitiveTypeRule()); 
            pushFollow(FOLLOW_rulePrimitiveType_in_entryRulePrimitiveType1008);
            iv_rulePrimitiveType=rulePrimitiveType();

            state._fsp--;

             current =iv_rulePrimitiveType; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimitiveType1018); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimitiveType"


    // $ANTLR start "rulePrimitiveType"
    // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:481:1: rulePrimitiveType returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject rulePrimitiveType() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:484:28: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:485:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:485:1: ( (lv_name_0_0= RULE_ID ) )
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:486:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:486:1: (lv_name_0_0= RULE_ID )
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:487:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimitiveType1059); 

            			newLeafNode(lv_name_0_0, grammarAccess.getPrimitiveTypeAccess().getNameIDTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPrimitiveTypeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimitiveType"


    // $ANTLR start "entryRuleComplexType"
    // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:511:1: entryRuleComplexType returns [EObject current=null] : iv_ruleComplexType= ruleComplexType EOF ;
    public final EObject entryRuleComplexType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComplexType = null;


        try {
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:512:2: (iv_ruleComplexType= ruleComplexType EOF )
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:513:2: iv_ruleComplexType= ruleComplexType EOF
            {
             newCompositeNode(grammarAccess.getComplexTypeRule()); 
            pushFollow(FOLLOW_ruleComplexType_in_entryRuleComplexType1099);
            iv_ruleComplexType=ruleComplexType();

            state._fsp--;

             current =iv_ruleComplexType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComplexType1109); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComplexType"


    // $ANTLR start "ruleComplexType"
    // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:520:1: ruleComplexType returns [EObject current=null] : (this_EnumerationType_0= ruleEnumerationType | this_EntityType_1= ruleEntityType ) ;
    public final EObject ruleComplexType() throws RecognitionException {
        EObject current = null;

        EObject this_EnumerationType_0 = null;

        EObject this_EntityType_1 = null;


         enterRule(); 
            
        try {
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:523:28: ( (this_EnumerationType_0= ruleEnumerationType | this_EntityType_1= ruleEntityType ) )
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:524:1: (this_EnumerationType_0= ruleEnumerationType | this_EntityType_1= ruleEntityType )
            {
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:524:1: (this_EnumerationType_0= ruleEnumerationType | this_EntityType_1= ruleEntityType )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                alt7=1;
            }
            else if ( (LA7_0==23) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:525:5: this_EnumerationType_0= ruleEnumerationType
                    {
                     
                            newCompositeNode(grammarAccess.getComplexTypeAccess().getEnumerationTypeParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleEnumerationType_in_ruleComplexType1156);
                    this_EnumerationType_0=ruleEnumerationType();

                    state._fsp--;

                     
                            current = this_EnumerationType_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:535:5: this_EntityType_1= ruleEntityType
                    {
                     
                            newCompositeNode(grammarAccess.getComplexTypeAccess().getEntityTypeParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleEntityType_in_ruleComplexType1183);
                    this_EntityType_1=ruleEntityType();

                    state._fsp--;

                     
                            current = this_EntityType_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComplexType"


    // $ANTLR start "entryRuleEnumerationType"
    // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:551:1: entryRuleEnumerationType returns [EObject current=null] : iv_ruleEnumerationType= ruleEnumerationType EOF ;
    public final EObject entryRuleEnumerationType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumerationType = null;


        try {
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:552:2: (iv_ruleEnumerationType= ruleEnumerationType EOF )
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:553:2: iv_ruleEnumerationType= ruleEnumerationType EOF
            {
             newCompositeNode(grammarAccess.getEnumerationTypeRule()); 
            pushFollow(FOLLOW_ruleEnumerationType_in_entryRuleEnumerationType1218);
            iv_ruleEnumerationType=ruleEnumerationType();

            state._fsp--;

             current =iv_ruleEnumerationType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumerationType1228); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEnumerationType"


    // $ANTLR start "ruleEnumerationType"
    // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:560:1: ruleEnumerationType returns [EObject current=null] : (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( ( ruleQualifiedName ) ) )? otherlv_4= '{' ( (lv_literals_5_0= ruleEnumerationLiteral ) ) (otherlv_6= ',' ( (lv_literals_7_0= ruleEnumerationLiteral ) ) )* otherlv_8= '}' ) ;
    public final EObject ruleEnumerationType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_literals_5_0 = null;

        EObject lv_literals_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:563:28: ( (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( ( ruleQualifiedName ) ) )? otherlv_4= '{' ( (lv_literals_5_0= ruleEnumerationLiteral ) ) (otherlv_6= ',' ( (lv_literals_7_0= ruleEnumerationLiteral ) ) )* otherlv_8= '}' ) )
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:564:1: (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( ( ruleQualifiedName ) ) )? otherlv_4= '{' ( (lv_literals_5_0= ruleEnumerationLiteral ) ) (otherlv_6= ',' ( (lv_literals_7_0= ruleEnumerationLiteral ) ) )* otherlv_8= '}' )
            {
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:564:1: (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( ( ruleQualifiedName ) ) )? otherlv_4= '{' ( (lv_literals_5_0= ruleEnumerationLiteral ) ) (otherlv_6= ',' ( (lv_literals_7_0= ruleEnumerationLiteral ) ) )* otherlv_8= '}' )
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:564:3: otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( ( ruleQualifiedName ) ) )? otherlv_4= '{' ( (lv_literals_5_0= ruleEnumerationLiteral ) ) (otherlv_6= ',' ( (lv_literals_7_0= ruleEnumerationLiteral ) ) )* otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleEnumerationType1265); 

                	newLeafNode(otherlv_0, grammarAccess.getEnumerationTypeAccess().getEnumKeyword_0());
                
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:568:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:569:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:569:1: (lv_name_1_0= RULE_ID )
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:570:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumerationType1282); 

            			newLeafNode(lv_name_1_0, grammarAccess.getEnumerationTypeAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEnumerationTypeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:586:2: (otherlv_2= ':' ( ( ruleQualifiedName ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==19) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:586:4: otherlv_2= ':' ( ( ruleQualifiedName ) )
                    {
                    otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleEnumerationType1300); 

                        	newLeafNode(otherlv_2, grammarAccess.getEnumerationTypeAccess().getColonKeyword_2_0());
                        
                    // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:590:1: ( ( ruleQualifiedName ) )
                    // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:591:1: ( ruleQualifiedName )
                    {
                    // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:591:1: ( ruleQualifiedName )
                    // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:592:3: ruleQualifiedName
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getEnumerationTypeRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getEnumerationTypeAccess().getParentEnumerationTypeCrossReference_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleEnumerationType1323);
                    ruleQualifiedName();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,20,FOLLOW_20_in_ruleEnumerationType1337); 

                	newLeafNode(otherlv_4, grammarAccess.getEnumerationTypeAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:609:1: ( (lv_literals_5_0= ruleEnumerationLiteral ) )
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:610:1: (lv_literals_5_0= ruleEnumerationLiteral )
            {
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:610:1: (lv_literals_5_0= ruleEnumerationLiteral )
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:611:3: lv_literals_5_0= ruleEnumerationLiteral
            {
             
            	        newCompositeNode(grammarAccess.getEnumerationTypeAccess().getLiteralsEnumerationLiteralParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleEnumerationLiteral_in_ruleEnumerationType1358);
            lv_literals_5_0=ruleEnumerationLiteral();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEnumerationTypeRule());
            	        }
                   		add(
                   			current, 
                   			"literals",
                    		lv_literals_5_0, 
                    		"EnumerationLiteral");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:627:2: (otherlv_6= ',' ( (lv_literals_7_0= ruleEnumerationLiteral ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==21) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:627:4: otherlv_6= ',' ( (lv_literals_7_0= ruleEnumerationLiteral ) )
            	    {
            	    otherlv_6=(Token)match(input,21,FOLLOW_21_in_ruleEnumerationType1371); 

            	        	newLeafNode(otherlv_6, grammarAccess.getEnumerationTypeAccess().getCommaKeyword_5_0());
            	        
            	    // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:631:1: ( (lv_literals_7_0= ruleEnumerationLiteral ) )
            	    // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:632:1: (lv_literals_7_0= ruleEnumerationLiteral )
            	    {
            	    // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:632:1: (lv_literals_7_0= ruleEnumerationLiteral )
            	    // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:633:3: lv_literals_7_0= ruleEnumerationLiteral
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEnumerationTypeAccess().getLiteralsEnumerationLiteralParserRuleCall_5_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEnumerationLiteral_in_ruleEnumerationType1392);
            	    lv_literals_7_0=ruleEnumerationLiteral();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEnumerationTypeRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"literals",
            	            		lv_literals_7_0, 
            	            		"EnumerationLiteral");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_8=(Token)match(input,22,FOLLOW_22_in_ruleEnumerationType1406); 

                	newLeafNode(otherlv_8, grammarAccess.getEnumerationTypeAccess().getRightCurlyBracketKeyword_6());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEnumerationType"


    // $ANTLR start "entryRuleEnumerationLiteral"
    // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:661:1: entryRuleEnumerationLiteral returns [EObject current=null] : iv_ruleEnumerationLiteral= ruleEnumerationLiteral EOF ;
    public final EObject entryRuleEnumerationLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumerationLiteral = null;


        try {
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:662:2: (iv_ruleEnumerationLiteral= ruleEnumerationLiteral EOF )
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:663:2: iv_ruleEnumerationLiteral= ruleEnumerationLiteral EOF
            {
             newCompositeNode(grammarAccess.getEnumerationLiteralRule()); 
            pushFollow(FOLLOW_ruleEnumerationLiteral_in_entryRuleEnumerationLiteral1442);
            iv_ruleEnumerationLiteral=ruleEnumerationLiteral();

            state._fsp--;

             current =iv_ruleEnumerationLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumerationLiteral1452); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEnumerationLiteral"


    // $ANTLR start "ruleEnumerationLiteral"
    // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:670:1: ruleEnumerationLiteral returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleEnumerationLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:673:28: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:674:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:674:1: ( (lv_name_0_0= RULE_ID ) )
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:675:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:675:1: (lv_name_0_0= RULE_ID )
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:676:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumerationLiteral1493); 

            			newLeafNode(lv_name_0_0, grammarAccess.getEnumerationLiteralAccess().getNameIDTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEnumerationLiteralRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEnumerationLiteral"


    // $ANTLR start "entryRuleEntityType"
    // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:700:1: entryRuleEntityType returns [EObject current=null] : iv_ruleEntityType= ruleEntityType EOF ;
    public final EObject entryRuleEntityType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntityType = null;


        try {
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:701:2: (iv_ruleEntityType= ruleEntityType EOF )
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:702:2: iv_ruleEntityType= ruleEntityType EOF
            {
             newCompositeNode(grammarAccess.getEntityTypeRule()); 
            pushFollow(FOLLOW_ruleEntityType_in_entryRuleEntityType1533);
            iv_ruleEntityType=ruleEntityType();

            state._fsp--;

             current =iv_ruleEntityType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntityType1543); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEntityType"


    // $ANTLR start "ruleEntityType"
    // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:709:1: ruleEntityType returns [EObject current=null] : (otherlv_0= 'entity' ( (lv_storageModifier_1_0= ruleTypeStorageModifier ) )? ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( ( ruleQualifiedName ) ) )? otherlv_5= '{' ( (lv_properties_6_0= ruleProperty ) )* otherlv_7= '}' ) ;
    public final EObject ruleEntityType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Enumerator lv_storageModifier_1_0 = null;

        EObject lv_properties_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:712:28: ( (otherlv_0= 'entity' ( (lv_storageModifier_1_0= ruleTypeStorageModifier ) )? ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( ( ruleQualifiedName ) ) )? otherlv_5= '{' ( (lv_properties_6_0= ruleProperty ) )* otherlv_7= '}' ) )
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:713:1: (otherlv_0= 'entity' ( (lv_storageModifier_1_0= ruleTypeStorageModifier ) )? ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( ( ruleQualifiedName ) ) )? otherlv_5= '{' ( (lv_properties_6_0= ruleProperty ) )* otherlv_7= '}' )
            {
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:713:1: (otherlv_0= 'entity' ( (lv_storageModifier_1_0= ruleTypeStorageModifier ) )? ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( ( ruleQualifiedName ) ) )? otherlv_5= '{' ( (lv_properties_6_0= ruleProperty ) )* otherlv_7= '}' )
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:713:3: otherlv_0= 'entity' ( (lv_storageModifier_1_0= ruleTypeStorageModifier ) )? ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( ( ruleQualifiedName ) ) )? otherlv_5= '{' ( (lv_properties_6_0= ruleProperty ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_23_in_ruleEntityType1580); 

                	newLeafNode(otherlv_0, grammarAccess.getEntityTypeAccess().getEntityKeyword_0());
                
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:717:1: ( (lv_storageModifier_1_0= ruleTypeStorageModifier ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=33 && LA10_0<=34)) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:718:1: (lv_storageModifier_1_0= ruleTypeStorageModifier )
                    {
                    // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:718:1: (lv_storageModifier_1_0= ruleTypeStorageModifier )
                    // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:719:3: lv_storageModifier_1_0= ruleTypeStorageModifier
                    {
                     
                    	        newCompositeNode(grammarAccess.getEntityTypeAccess().getStorageModifierTypeStorageModifierEnumRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTypeStorageModifier_in_ruleEntityType1601);
                    lv_storageModifier_1_0=ruleTypeStorageModifier();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEntityTypeRule());
                    	        }
                           		set(
                           			current, 
                           			"storageModifier",
                            		lv_storageModifier_1_0, 
                            		"TypeStorageModifier");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:735:3: ( (lv_name_2_0= RULE_ID ) )
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:736:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:736:1: (lv_name_2_0= RULE_ID )
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:737:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEntityType1619); 

            			newLeafNode(lv_name_2_0, grammarAccess.getEntityTypeAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEntityTypeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:753:2: (otherlv_3= ':' ( ( ruleQualifiedName ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==19) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:753:4: otherlv_3= ':' ( ( ruleQualifiedName ) )
                    {
                    otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleEntityType1637); 

                        	newLeafNode(otherlv_3, grammarAccess.getEntityTypeAccess().getColonKeyword_3_0());
                        
                    // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:757:1: ( ( ruleQualifiedName ) )
                    // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:758:1: ( ruleQualifiedName )
                    {
                    // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:758:1: ( ruleQualifiedName )
                    // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:759:3: ruleQualifiedName
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getEntityTypeRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getEntityTypeAccess().getParentComplexTypeCrossReference_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleEntityType1660);
                    ruleQualifiedName();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,20,FOLLOW_20_in_ruleEntityType1674); 

                	newLeafNode(otherlv_5, grammarAccess.getEntityTypeAccess().getLeftCurlyBracketKeyword_4());
                
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:776:1: ( (lv_properties_6_0= ruleProperty ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID||(LA12_0>=37 && LA12_0<=39)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:777:1: (lv_properties_6_0= ruleProperty )
            	    {
            	    // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:777:1: (lv_properties_6_0= ruleProperty )
            	    // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:778:3: lv_properties_6_0= ruleProperty
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEntityTypeAccess().getPropertiesPropertyParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleProperty_in_ruleEntityType1695);
            	    lv_properties_6_0=ruleProperty();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEntityTypeRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"properties",
            	            		lv_properties_6_0, 
            	            		"Property");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            otherlv_7=(Token)match(input,22,FOLLOW_22_in_ruleEntityType1708); 

                	newLeafNode(otherlv_7, grammarAccess.getEntityTypeAccess().getRightCurlyBracketKeyword_6());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEntityType"


    // $ANTLR start "entryRuleProperty"
    // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:806:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:807:2: (iv_ruleProperty= ruleProperty EOF )
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:808:2: iv_ruleProperty= ruleProperty EOF
            {
             newCompositeNode(grammarAccess.getPropertyRule()); 
            pushFollow(FOLLOW_ruleProperty_in_entryRuleProperty1744);
            iv_ruleProperty=ruleProperty();

            state._fsp--;

             current =iv_ruleProperty; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProperty1754); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProperty"


    // $ANTLR start "ruleProperty"
    // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:815:1: ruleProperty returns [EObject current=null] : ( ( (lv_storageModifier_0_0= rulePropertyStorageModifier ) )? ( (lv_type_1_0= ruleDeclarationTypeReference ) ) ( (lv_name_2_0= RULE_ID ) ) ( (lv_relationship_3_0= ruleEntityRelationship ) )? (otherlv_4= 'order' ( (lv_orderBy_5_0= rulePropertyReference ) ) )? (otherlv_6= 'key' ( (lv_mapKey_7_0= rulePropertyReference ) ) )? (otherlv_8= '=' ( (lv_literal_9_0= ruleLiteral ) ) )? ) ;
    public final EObject ruleProperty() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Enumerator lv_storageModifier_0_0 = null;

        EObject lv_type_1_0 = null;

        EObject lv_relationship_3_0 = null;

        EObject lv_orderBy_5_0 = null;

        EObject lv_mapKey_7_0 = null;

        EObject lv_literal_9_0 = null;


         enterRule(); 
            
        try {
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:818:28: ( ( ( (lv_storageModifier_0_0= rulePropertyStorageModifier ) )? ( (lv_type_1_0= ruleDeclarationTypeReference ) ) ( (lv_name_2_0= RULE_ID ) ) ( (lv_relationship_3_0= ruleEntityRelationship ) )? (otherlv_4= 'order' ( (lv_orderBy_5_0= rulePropertyReference ) ) )? (otherlv_6= 'key' ( (lv_mapKey_7_0= rulePropertyReference ) ) )? (otherlv_8= '=' ( (lv_literal_9_0= ruleLiteral ) ) )? ) )
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:819:1: ( ( (lv_storageModifier_0_0= rulePropertyStorageModifier ) )? ( (lv_type_1_0= ruleDeclarationTypeReference ) ) ( (lv_name_2_0= RULE_ID ) ) ( (lv_relationship_3_0= ruleEntityRelationship ) )? (otherlv_4= 'order' ( (lv_orderBy_5_0= rulePropertyReference ) ) )? (otherlv_6= 'key' ( (lv_mapKey_7_0= rulePropertyReference ) ) )? (otherlv_8= '=' ( (lv_literal_9_0= ruleLiteral ) ) )? )
            {
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:819:1: ( ( (lv_storageModifier_0_0= rulePropertyStorageModifier ) )? ( (lv_type_1_0= ruleDeclarationTypeReference ) ) ( (lv_name_2_0= RULE_ID ) ) ( (lv_relationship_3_0= ruleEntityRelationship ) )? (otherlv_4= 'order' ( (lv_orderBy_5_0= rulePropertyReference ) ) )? (otherlv_6= 'key' ( (lv_mapKey_7_0= rulePropertyReference ) ) )? (otherlv_8= '=' ( (lv_literal_9_0= ruleLiteral ) ) )? )
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:819:2: ( (lv_storageModifier_0_0= rulePropertyStorageModifier ) )? ( (lv_type_1_0= ruleDeclarationTypeReference ) ) ( (lv_name_2_0= RULE_ID ) ) ( (lv_relationship_3_0= ruleEntityRelationship ) )? (otherlv_4= 'order' ( (lv_orderBy_5_0= rulePropertyReference ) ) )? (otherlv_6= 'key' ( (lv_mapKey_7_0= rulePropertyReference ) ) )? (otherlv_8= '=' ( (lv_literal_9_0= ruleLiteral ) ) )?
            {
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:819:2: ( (lv_storageModifier_0_0= rulePropertyStorageModifier ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=37 && LA13_0<=39)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:820:1: (lv_storageModifier_0_0= rulePropertyStorageModifier )
                    {
                    // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:820:1: (lv_storageModifier_0_0= rulePropertyStorageModifier )
                    // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:821:3: lv_storageModifier_0_0= rulePropertyStorageModifier
                    {
                     
                    	        newCompositeNode(grammarAccess.getPropertyAccess().getStorageModifierPropertyStorageModifierEnumRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_rulePropertyStorageModifier_in_ruleProperty1800);
                    lv_storageModifier_0_0=rulePropertyStorageModifier();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPropertyRule());
                    	        }
                           		set(
                           			current, 
                           			"storageModifier",
                            		lv_storageModifier_0_0, 
                            		"PropertyStorageModifier");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:837:3: ( (lv_type_1_0= ruleDeclarationTypeReference ) )
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:838:1: (lv_type_1_0= ruleDeclarationTypeReference )
            {
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:838:1: (lv_type_1_0= ruleDeclarationTypeReference )
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:839:3: lv_type_1_0= ruleDeclarationTypeReference
            {
             
            	        newCompositeNode(grammarAccess.getPropertyAccess().getTypeDeclarationTypeReferenceParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleDeclarationTypeReference_in_ruleProperty1822);
            lv_type_1_0=ruleDeclarationTypeReference();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPropertyRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_1_0, 
                    		"DeclarationTypeReference");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:855:2: ( (lv_name_2_0= RULE_ID ) )
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:856:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:856:1: (lv_name_2_0= RULE_ID )
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:857:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProperty1839); 

            			newLeafNode(lv_name_2_0, grammarAccess.getPropertyAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPropertyRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:873:2: ( (lv_relationship_3_0= ruleEntityRelationship ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=35 && LA14_0<=36)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:874:1: (lv_relationship_3_0= ruleEntityRelationship )
                    {
                    // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:874:1: (lv_relationship_3_0= ruleEntityRelationship )
                    // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:875:3: lv_relationship_3_0= ruleEntityRelationship
                    {
                     
                    	        newCompositeNode(grammarAccess.getPropertyAccess().getRelationshipEntityRelationshipParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleEntityRelationship_in_ruleProperty1865);
                    lv_relationship_3_0=ruleEntityRelationship();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPropertyRule());
                    	        }
                           		set(
                           			current, 
                           			"relationship",
                            		lv_relationship_3_0, 
                            		"EntityRelationship");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:891:3: (otherlv_4= 'order' ( (lv_orderBy_5_0= rulePropertyReference ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==24) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:891:5: otherlv_4= 'order' ( (lv_orderBy_5_0= rulePropertyReference ) )
                    {
                    otherlv_4=(Token)match(input,24,FOLLOW_24_in_ruleProperty1879); 

                        	newLeafNode(otherlv_4, grammarAccess.getPropertyAccess().getOrderKeyword_4_0());
                        
                    // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:895:1: ( (lv_orderBy_5_0= rulePropertyReference ) )
                    // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:896:1: (lv_orderBy_5_0= rulePropertyReference )
                    {
                    // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:896:1: (lv_orderBy_5_0= rulePropertyReference )
                    // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:897:3: lv_orderBy_5_0= rulePropertyReference
                    {
                     
                    	        newCompositeNode(grammarAccess.getPropertyAccess().getOrderByPropertyReferenceParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FOLLOW_rulePropertyReference_in_ruleProperty1900);
                    lv_orderBy_5_0=rulePropertyReference();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPropertyRule());
                    	        }
                           		set(
                           			current, 
                           			"orderBy",
                            		lv_orderBy_5_0, 
                            		"PropertyReference");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:913:4: (otherlv_6= 'key' ( (lv_mapKey_7_0= rulePropertyReference ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==25) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:913:6: otherlv_6= 'key' ( (lv_mapKey_7_0= rulePropertyReference ) )
                    {
                    otherlv_6=(Token)match(input,25,FOLLOW_25_in_ruleProperty1915); 

                        	newLeafNode(otherlv_6, grammarAccess.getPropertyAccess().getKeyKeyword_5_0());
                        
                    // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:917:1: ( (lv_mapKey_7_0= rulePropertyReference ) )
                    // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:918:1: (lv_mapKey_7_0= rulePropertyReference )
                    {
                    // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:918:1: (lv_mapKey_7_0= rulePropertyReference )
                    // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:919:3: lv_mapKey_7_0= rulePropertyReference
                    {
                     
                    	        newCompositeNode(grammarAccess.getPropertyAccess().getMapKeyPropertyReferenceParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FOLLOW_rulePropertyReference_in_ruleProperty1936);
                    lv_mapKey_7_0=rulePropertyReference();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPropertyRule());
                    	        }
                           		set(
                           			current, 
                           			"mapKey",
                            		lv_mapKey_7_0, 
                            		"PropertyReference");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:935:4: (otherlv_8= '=' ( (lv_literal_9_0= ruleLiteral ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==26) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:935:6: otherlv_8= '=' ( (lv_literal_9_0= ruleLiteral ) )
                    {
                    otherlv_8=(Token)match(input,26,FOLLOW_26_in_ruleProperty1951); 

                        	newLeafNode(otherlv_8, grammarAccess.getPropertyAccess().getEqualsSignKeyword_6_0());
                        
                    // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:939:1: ( (lv_literal_9_0= ruleLiteral ) )
                    // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:940:1: (lv_literal_9_0= ruleLiteral )
                    {
                    // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:940:1: (lv_literal_9_0= ruleLiteral )
                    // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:941:3: lv_literal_9_0= ruleLiteral
                    {
                     
                    	        newCompositeNode(grammarAccess.getPropertyAccess().getLiteralLiteralParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleLiteral_in_ruleProperty1972);
                    lv_literal_9_0=ruleLiteral();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPropertyRule());
                    	        }
                           		set(
                           			current, 
                           			"literal",
                            		lv_literal_9_0, 
                            		"Literal");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProperty"


    // $ANTLR start "entryRuleEntityRelationship"
    // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:965:1: entryRuleEntityRelationship returns [EObject current=null] : iv_ruleEntityRelationship= ruleEntityRelationship EOF ;
    public final EObject entryRuleEntityRelationship() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntityRelationship = null;


        try {
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:966:2: (iv_ruleEntityRelationship= ruleEntityRelationship EOF )
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:967:2: iv_ruleEntityRelationship= ruleEntityRelationship EOF
            {
             newCompositeNode(grammarAccess.getEntityRelationshipRule()); 
            pushFollow(FOLLOW_ruleEntityRelationship_in_entryRuleEntityRelationship2010);
            iv_ruleEntityRelationship=ruleEntityRelationship();

            state._fsp--;

             current =iv_ruleEntityRelationship; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntityRelationship2020); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEntityRelationship"


    // $ANTLR start "ruleEntityRelationship"
    // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:974:1: ruleEntityRelationship returns [EObject current=null] : ( () ( (lv_kind_1_0= ruleEntityRelationshipKind ) ) ( (lv_mappedBy_2_0= ruleMappedByReference ) )? ) ;
    public final EObject ruleEntityRelationship() throws RecognitionException {
        EObject current = null;

        Enumerator lv_kind_1_0 = null;

        EObject lv_mappedBy_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:977:28: ( ( () ( (lv_kind_1_0= ruleEntityRelationshipKind ) ) ( (lv_mappedBy_2_0= ruleMappedByReference ) )? ) )
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:978:1: ( () ( (lv_kind_1_0= ruleEntityRelationshipKind ) ) ( (lv_mappedBy_2_0= ruleMappedByReference ) )? )
            {
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:978:1: ( () ( (lv_kind_1_0= ruleEntityRelationshipKind ) ) ( (lv_mappedBy_2_0= ruleMappedByReference ) )? )
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:978:2: () ( (lv_kind_1_0= ruleEntityRelationshipKind ) ) ( (lv_mappedBy_2_0= ruleMappedByReference ) )?
            {
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:978:2: ()
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:979:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getEntityRelationshipAccess().getEntityRelationshipAction_0(),
                        current);
                

            }

            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:984:2: ( (lv_kind_1_0= ruleEntityRelationshipKind ) )
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:985:1: (lv_kind_1_0= ruleEntityRelationshipKind )
            {
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:985:1: (lv_kind_1_0= ruleEntityRelationshipKind )
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:986:3: lv_kind_1_0= ruleEntityRelationshipKind
            {
             
            	        newCompositeNode(grammarAccess.getEntityRelationshipAccess().getKindEntityRelationshipKindEnumRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleEntityRelationshipKind_in_ruleEntityRelationship2075);
            lv_kind_1_0=ruleEntityRelationshipKind();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEntityRelationshipRule());
            	        }
                   		set(
                   			current, 
                   			"kind",
                    		lv_kind_1_0, 
                    		"EntityRelationshipKind");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:1002:2: ( (lv_mappedBy_2_0= ruleMappedByReference ) )?
            int alt18=2;
            alt18 = dfa18.predict(input);
            switch (alt18) {
                case 1 :
                    // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:1003:1: (lv_mappedBy_2_0= ruleMappedByReference )
                    {
                    // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:1003:1: (lv_mappedBy_2_0= ruleMappedByReference )
                    // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:1004:3: lv_mappedBy_2_0= ruleMappedByReference
                    {
                     
                    	        newCompositeNode(grammarAccess.getEntityRelationshipAccess().getMappedByMappedByReferenceParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleMappedByReference_in_ruleEntityRelationship2096);
                    lv_mappedBy_2_0=ruleMappedByReference();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEntityRelationshipRule());
                    	        }
                           		set(
                           			current, 
                           			"mappedBy",
                            		lv_mappedBy_2_0, 
                            		"MappedByReference");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEntityRelationship"


    // $ANTLR start "entryRuleMappedByReference"
    // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:1028:1: entryRuleMappedByReference returns [EObject current=null] : iv_ruleMappedByReference= ruleMappedByReference EOF ;
    public final EObject entryRuleMappedByReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMappedByReference = null;


        try {
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:1029:2: (iv_ruleMappedByReference= ruleMappedByReference EOF )
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:1030:2: iv_ruleMappedByReference= ruleMappedByReference EOF
            {
             newCompositeNode(grammarAccess.getMappedByReferenceRule()); 
            pushFollow(FOLLOW_ruleMappedByReference_in_entryRuleMappedByReference2133);
            iv_ruleMappedByReference=ruleMappedByReference();

            state._fsp--;

             current =iv_ruleMappedByReference; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMappedByReference2143); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMappedByReference"


    // $ANTLR start "ruleMappedByReference"
    // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:1037:1: ruleMappedByReference returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '.' ( (lv_path_2_0= ruleMappedByReference ) ) )? ) ;
    public final EObject ruleMappedByReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_path_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:1040:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '.' ( (lv_path_2_0= ruleMappedByReference ) ) )? ) )
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:1041:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '.' ( (lv_path_2_0= ruleMappedByReference ) ) )? )
            {
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:1041:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '.' ( (lv_path_2_0= ruleMappedByReference ) ) )? )
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:1041:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '.' ( (lv_path_2_0= ruleMappedByReference ) ) )?
            {
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:1041:2: ( (otherlv_0= RULE_ID ) )
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:1042:1: (otherlv_0= RULE_ID )
            {
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:1042:1: (otherlv_0= RULE_ID )
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:1043:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getMappedByReferenceRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMappedByReference2188); 

            		newLeafNode(otherlv_0, grammarAccess.getMappedByReferenceAccess().getBasePropertyCrossReference_0_0()); 
            	

            }


            }

            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:1054:2: (otherlv_1= '.' ( (lv_path_2_0= ruleMappedByReference ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==27) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:1054:4: otherlv_1= '.' ( (lv_path_2_0= ruleMappedByReference ) )
                    {
                    otherlv_1=(Token)match(input,27,FOLLOW_27_in_ruleMappedByReference2201); 

                        	newLeafNode(otherlv_1, grammarAccess.getMappedByReferenceAccess().getFullStopKeyword_1_0());
                        
                    // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:1058:1: ( (lv_path_2_0= ruleMappedByReference ) )
                    // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:1059:1: (lv_path_2_0= ruleMappedByReference )
                    {
                    // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:1059:1: (lv_path_2_0= ruleMappedByReference )
                    // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:1060:3: lv_path_2_0= ruleMappedByReference
                    {
                     
                    	        newCompositeNode(grammarAccess.getMappedByReferenceAccess().getPathMappedByReferenceParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleMappedByReference_in_ruleMappedByReference2222);
                    lv_path_2_0=ruleMappedByReference();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMappedByReferenceRule());
                    	        }
                           		set(
                           			current, 
                           			"path",
                            		lv_path_2_0, 
                            		"MappedByReference");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMappedByReference"


    // $ANTLR start "entryRuleLiteral"
    // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:1084:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:1085:2: (iv_ruleLiteral= ruleLiteral EOF )
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:1086:2: iv_ruleLiteral= ruleLiteral EOF
            {
             newCompositeNode(grammarAccess.getLiteralRule()); 
            pushFollow(FOLLOW_ruleLiteral_in_entryRuleLiteral2260);
            iv_ruleLiteral=ruleLiteral();

            state._fsp--;

             current =iv_ruleLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteral2270); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLiteral"


    // $ANTLR start "ruleLiteral"
    // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:1093:1: ruleLiteral returns [EObject current=null] : (this_BooleanLiteral_0= ruleBooleanLiteral | this_NumberLiteral_1= ruleNumberLiteral | this_CharLiteral_2= ruleCharLiteral | this_StringLiteral_3= ruleStringLiteral | this_PropertyReference_4= rulePropertyReference ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_BooleanLiteral_0 = null;

        EObject this_NumberLiteral_1 = null;

        EObject this_CharLiteral_2 = null;

        EObject this_StringLiteral_3 = null;

        EObject this_PropertyReference_4 = null;


         enterRule(); 
            
        try {
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:1096:28: ( (this_BooleanLiteral_0= ruleBooleanLiteral | this_NumberLiteral_1= ruleNumberLiteral | this_CharLiteral_2= ruleCharLiteral | this_StringLiteral_3= ruleStringLiteral | this_PropertyReference_4= rulePropertyReference ) )
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:1097:1: (this_BooleanLiteral_0= ruleBooleanLiteral | this_NumberLiteral_1= ruleNumberLiteral | this_CharLiteral_2= ruleCharLiteral | this_StringLiteral_3= ruleStringLiteral | this_PropertyReference_4= rulePropertyReference )
            {
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:1097:1: (this_BooleanLiteral_0= ruleBooleanLiteral | this_NumberLiteral_1= ruleNumberLiteral | this_CharLiteral_2= ruleCharLiteral | this_StringLiteral_3= ruleStringLiteral | this_PropertyReference_4= rulePropertyReference )
            int alt20=5;
            switch ( input.LA(1) ) {
            case 29:
            case 30:
                {
                alt20=1;
                }
                break;
            case RULE_INT:
            case 31:
            case 32:
                {
                alt20=2;
                }
                break;
            case RULE_CHARACTER:
                {
                alt20=3;
                }
                break;
            case RULE_STRING:
                {
                alt20=4;
                }
                break;
            case RULE_ID:
                {
                alt20=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:1098:5: this_BooleanLiteral_0= ruleBooleanLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getLiteralAccess().getBooleanLiteralParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleBooleanLiteral_in_ruleLiteral2317);
                    this_BooleanLiteral_0=ruleBooleanLiteral();

                    state._fsp--;

                     
                            current = this_BooleanLiteral_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:1108:5: this_NumberLiteral_1= ruleNumberLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getLiteralAccess().getNumberLiteralParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleNumberLiteral_in_ruleLiteral2344);
                    this_NumberLiteral_1=ruleNumberLiteral();

                    state._fsp--;

                     
                            current = this_NumberLiteral_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:1118:5: this_CharLiteral_2= ruleCharLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getLiteralAccess().getCharLiteralParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleCharLiteral_in_ruleLiteral2371);
                    this_CharLiteral_2=ruleCharLiteral();

                    state._fsp--;

                     
                            current = this_CharLiteral_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:1128:5: this_StringLiteral_3= ruleStringLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getLiteralAccess().getStringLiteralParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleStringLiteral_in_ruleLiteral2398);
                    this_StringLiteral_3=ruleStringLiteral();

                    state._fsp--;

                     
                            current = this_StringLiteral_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:1138:5: this_PropertyReference_4= rulePropertyReference
                    {
                     
                            newCompositeNode(grammarAccess.getLiteralAccess().getPropertyReferenceParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_rulePropertyReference_in_ruleLiteral2425);
                    this_PropertyReference_4=rulePropertyReference();

                    state._fsp--;

                     
                            current = this_PropertyReference_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLiteral"


    // $ANTLR start "entryRuleStringLiteral"
    // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:1154:1: entryRuleStringLiteral returns [EObject current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final EObject entryRuleStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteral = null;


        try {
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:1155:2: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:1156:2: iv_ruleStringLiteral= ruleStringLiteral EOF
            {
             newCompositeNode(grammarAccess.getStringLiteralRule()); 
            pushFollow(FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral2460);
            iv_ruleStringLiteral=ruleStringLiteral();

            state._fsp--;

             current =iv_ruleStringLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringLiteral2470); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStringLiteral"


    // $ANTLR start "ruleStringLiteral"
    // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:1163:1: ruleStringLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:1166:28: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:1167:1: ( (lv_value_0_0= RULE_STRING ) )
            {
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:1167:1: ( (lv_value_0_0= RULE_STRING ) )
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:1168:1: (lv_value_0_0= RULE_STRING )
            {
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:1168:1: (lv_value_0_0= RULE_STRING )
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:1169:3: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringLiteral2511); 

            			newLeafNode(lv_value_0_0, grammarAccess.getStringLiteralAccess().getValueSTRINGTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getStringLiteralRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_0_0, 
                    		"STRING");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStringLiteral"


    // $ANTLR start "entryRuleCharLiteral"
    // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:1193:1: entryRuleCharLiteral returns [EObject current=null] : iv_ruleCharLiteral= ruleCharLiteral EOF ;
    public final EObject entryRuleCharLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCharLiteral = null;


        try {
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:1194:2: (iv_ruleCharLiteral= ruleCharLiteral EOF )
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:1195:2: iv_ruleCharLiteral= ruleCharLiteral EOF
            {
             newCompositeNode(grammarAccess.getCharLiteralRule()); 
            pushFollow(FOLLOW_ruleCharLiteral_in_entryRuleCharLiteral2551);
            iv_ruleCharLiteral=ruleCharLiteral();

            state._fsp--;

             current =iv_ruleCharLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCharLiteral2561); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCharLiteral"


    // $ANTLR start "ruleCharLiteral"
    // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:1202:1: ruleCharLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_CHARACTER ) ) ;
    public final EObject ruleCharLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:1205:28: ( ( (lv_value_0_0= RULE_CHARACTER ) ) )
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:1206:1: ( (lv_value_0_0= RULE_CHARACTER ) )
            {
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:1206:1: ( (lv_value_0_0= RULE_CHARACTER ) )
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:1207:1: (lv_value_0_0= RULE_CHARACTER )
            {
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:1207:1: (lv_value_0_0= RULE_CHARACTER )
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:1208:3: lv_value_0_0= RULE_CHARACTER
            {
            lv_value_0_0=(Token)match(input,RULE_CHARACTER,FOLLOW_RULE_CHARACTER_in_ruleCharLiteral2602); 

            			newLeafNode(lv_value_0_0, grammarAccess.getCharLiteralAccess().getValueCHARACTERTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCharLiteralRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_0_0, 
                    		"CHARACTER");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCharLiteral"


    // $ANTLR start "entryRuleNumberLiteral"
    // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:1232:1: entryRuleNumberLiteral returns [EObject current=null] : iv_ruleNumberLiteral= ruleNumberLiteral EOF ;
    public final EObject entryRuleNumberLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberLiteral = null;


        try {
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:1233:2: (iv_ruleNumberLiteral= ruleNumberLiteral EOF )
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:1234:2: iv_ruleNumberLiteral= ruleNumberLiteral EOF
            {
             newCompositeNode(grammarAccess.getNumberLiteralRule()); 
            pushFollow(FOLLOW_ruleNumberLiteral_in_entryRuleNumberLiteral2642);
            iv_ruleNumberLiteral=ruleNumberLiteral();

            state._fsp--;

             current =iv_ruleNumberLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumberLiteral2652); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNumberLiteral"


    // $ANTLR start "ruleNumberLiteral"
    // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:1241:1: ruleNumberLiteral returns [EObject current=null] : ( (lv_value_0_0= ruleNUMBER ) ) ;
    public final EObject ruleNumberLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:1244:28: ( ( (lv_value_0_0= ruleNUMBER ) ) )
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:1245:1: ( (lv_value_0_0= ruleNUMBER ) )
            {
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:1245:1: ( (lv_value_0_0= ruleNUMBER ) )
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:1246:1: (lv_value_0_0= ruleNUMBER )
            {
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:1246:1: (lv_value_0_0= ruleNUMBER )
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:1247:3: lv_value_0_0= ruleNUMBER
            {
             
            	        newCompositeNode(grammarAccess.getNumberLiteralAccess().getValueNUMBERParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleNUMBER_in_ruleNumberLiteral2697);
            lv_value_0_0=ruleNUMBER();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getNumberLiteralRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_0_0, 
                    		"NUMBER");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNumberLiteral"


    // $ANTLR start "entryRuleBooleanLiteral"
    // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:1271:1: entryRuleBooleanLiteral returns [EObject current=null] : iv_ruleBooleanLiteral= ruleBooleanLiteral EOF ;
    public final EObject entryRuleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanLiteral = null;


        try {
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:1272:2: (iv_ruleBooleanLiteral= ruleBooleanLiteral EOF )
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:1273:2: iv_ruleBooleanLiteral= ruleBooleanLiteral EOF
            {
             newCompositeNode(grammarAccess.getBooleanLiteralRule()); 
            pushFollow(FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral2732);
            iv_ruleBooleanLiteral=ruleBooleanLiteral();

            state._fsp--;

             current =iv_ruleBooleanLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanLiteral2742); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBooleanLiteral"


    // $ANTLR start "ruleBooleanLiteral"
    // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:1280:1: ruleBooleanLiteral returns [EObject current=null] : ( (lv_value_0_0= ruleBOOLEAN ) ) ;
    public final EObject ruleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:1283:28: ( ( (lv_value_0_0= ruleBOOLEAN ) ) )
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:1284:1: ( (lv_value_0_0= ruleBOOLEAN ) )
            {
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:1284:1: ( (lv_value_0_0= ruleBOOLEAN ) )
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:1285:1: (lv_value_0_0= ruleBOOLEAN )
            {
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:1285:1: (lv_value_0_0= ruleBOOLEAN )
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:1286:3: lv_value_0_0= ruleBOOLEAN
            {
             
            	        newCompositeNode(grammarAccess.getBooleanLiteralAccess().getValueBOOLEANParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleBOOLEAN_in_ruleBooleanLiteral2787);
            lv_value_0_0=ruleBOOLEAN();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBooleanLiteralRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_0_0, 
                    		"BOOLEAN");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBooleanLiteral"


    // $ANTLR start "entryRulePropertyReference"
    // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:1310:1: entryRulePropertyReference returns [EObject current=null] : iv_rulePropertyReference= rulePropertyReference EOF ;
    public final EObject entryRulePropertyReference() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyReference = null;


        try {
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:1311:2: (iv_rulePropertyReference= rulePropertyReference EOF )
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:1312:2: iv_rulePropertyReference= rulePropertyReference EOF
            {
             newCompositeNode(grammarAccess.getPropertyReferenceRule()); 
            pushFollow(FOLLOW_rulePropertyReference_in_entryRulePropertyReference2822);
            iv_rulePropertyReference=rulePropertyReference();

            state._fsp--;

             current =iv_rulePropertyReference; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertyReference2832); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePropertyReference"


    // $ANTLR start "rulePropertyReference"
    // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:1319:1: rulePropertyReference returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject rulePropertyReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:1322:28: ( ( (otherlv_0= RULE_ID ) ) )
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:1323:1: ( (otherlv_0= RULE_ID ) )
            {
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:1323:1: ( (otherlv_0= RULE_ID ) )
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:1324:1: (otherlv_0= RULE_ID )
            {
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:1324:1: (otherlv_0= RULE_ID )
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:1325:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getPropertyReferenceRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePropertyReference2876); 

            		newLeafNode(otherlv_0, grammarAccess.getPropertyReferenceAccess().getReferencePropertyCrossReference_0()); 
            	

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePropertyReference"


    // $ANTLR start "entryRuleQualifiedName"
    // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:1344:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:1345:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:1346:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName2912);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName2923); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:1353:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:1356:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:1357:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:1357:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:1357:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName2963); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:1364:1: (kw= '.' this_ID_2= RULE_ID )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==27) ) {
                    int LA21_2 = input.LA(2);

                    if ( (LA21_2==RULE_ID) ) {
                        alt21=1;
                    }


                }


                switch (alt21) {
            	case 1 :
            	    // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:1365:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,27,FOLLOW_27_in_ruleQualifiedName2982); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName2997); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleQualifiedNameWithWildcard"
    // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:1385:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:1386:2: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:1387:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameWithWildcardRule()); 
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard3045);
            iv_ruleQualifiedNameWithWildcard=ruleQualifiedNameWithWildcard();

            state._fsp--;

             current =iv_ruleQualifiedNameWithWildcard.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard3056); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedNameWithWildcard"


    // $ANTLR start "ruleQualifiedNameWithWildcard"
    // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:1394:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;


         enterRule(); 
            
        try {
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:1397:28: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? ) )
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:1398:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? )
            {
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:1398:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? )
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:1399:5: this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )?
            {
             
                    newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildcard3103);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;


            		current.merge(this_QualifiedName_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:1409:1: (kw= '.' kw= '*' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==27) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:1410:2: kw= '.' kw= '*'
                    {
                    kw=(Token)match(input,27,FOLLOW_27_in_ruleQualifiedNameWithWildcard3122); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopKeyword_1_0()); 
                        
                    kw=(Token)match(input,28,FOLLOW_28_in_ruleQualifiedNameWithWildcard3135); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getQualifiedNameWithWildcardAccess().getAsteriskKeyword_1_1()); 
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedNameWithWildcard"


    // $ANTLR start "entryRuleBOOLEAN"
    // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:1429:1: entryRuleBOOLEAN returns [String current=null] : iv_ruleBOOLEAN= ruleBOOLEAN EOF ;
    public final String entryRuleBOOLEAN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBOOLEAN = null;


        try {
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:1430:2: (iv_ruleBOOLEAN= ruleBOOLEAN EOF )
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:1431:2: iv_ruleBOOLEAN= ruleBOOLEAN EOF
            {
             newCompositeNode(grammarAccess.getBOOLEANRule()); 
            pushFollow(FOLLOW_ruleBOOLEAN_in_entryRuleBOOLEAN3178);
            iv_ruleBOOLEAN=ruleBOOLEAN();

            state._fsp--;

             current =iv_ruleBOOLEAN.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBOOLEAN3189); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBOOLEAN"


    // $ANTLR start "ruleBOOLEAN"
    // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:1438:1: ruleBOOLEAN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleBOOLEAN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:1441:28: ( (kw= 'true' | kw= 'false' ) )
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:1442:1: (kw= 'true' | kw= 'false' )
            {
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:1442:1: (kw= 'true' | kw= 'false' )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==29) ) {
                alt23=1;
            }
            else if ( (LA23_0==30) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:1443:2: kw= 'true'
                    {
                    kw=(Token)match(input,29,FOLLOW_29_in_ruleBOOLEAN3227); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBOOLEANAccess().getTrueKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:1450:2: kw= 'false'
                    {
                    kw=(Token)match(input,30,FOLLOW_30_in_ruleBOOLEAN3246); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBOOLEANAccess().getFalseKeyword_1()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBOOLEAN"


    // $ANTLR start "entryRuleNUMBER"
    // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:1463:1: entryRuleNUMBER returns [String current=null] : iv_ruleNUMBER= ruleNUMBER EOF ;
    public final String entryRuleNUMBER() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNUMBER = null;


        try {
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:1464:2: (iv_ruleNUMBER= ruleNUMBER EOF )
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:1465:2: iv_ruleNUMBER= ruleNUMBER EOF
            {
             newCompositeNode(grammarAccess.getNUMBERRule()); 
            pushFollow(FOLLOW_ruleNUMBER_in_entryRuleNUMBER3287);
            iv_ruleNUMBER=ruleNUMBER();

            state._fsp--;

             current =iv_ruleNUMBER.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNUMBER3298); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNUMBER"


    // $ANTLR start "ruleNUMBER"
    // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:1472:1: ruleNUMBER returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( (kw= '+' | kw= '-' )? this_INT_2= RULE_INT ) | (this_INT_3= RULE_INT kw= '.' this_INT_5= RULE_INT ) ) ;
    public final AntlrDatatypeRuleToken ruleNUMBER() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_2=null;
        Token this_INT_3=null;
        Token this_INT_5=null;

         enterRule(); 
            
        try {
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:1475:28: ( ( ( (kw= '+' | kw= '-' )? this_INT_2= RULE_INT ) | (this_INT_3= RULE_INT kw= '.' this_INT_5= RULE_INT ) ) )
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:1476:1: ( ( (kw= '+' | kw= '-' )? this_INT_2= RULE_INT ) | (this_INT_3= RULE_INT kw= '.' this_INT_5= RULE_INT ) )
            {
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:1476:1: ( ( (kw= '+' | kw= '-' )? this_INT_2= RULE_INT ) | (this_INT_3= RULE_INT kw= '.' this_INT_5= RULE_INT ) )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=31 && LA25_0<=32)) ) {
                alt25=1;
            }
            else if ( (LA25_0==RULE_INT) ) {
                int LA25_2 = input.LA(2);

                if ( (LA25_2==EOF||LA25_2==RULE_ID||LA25_2==22||(LA25_2>=37 && LA25_2<=39)) ) {
                    alt25=1;
                }
                else if ( (LA25_2==27) ) {
                    alt25=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 25, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:1476:2: ( (kw= '+' | kw= '-' )? this_INT_2= RULE_INT )
                    {
                    // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:1476:2: ( (kw= '+' | kw= '-' )? this_INT_2= RULE_INT )
                    // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:1476:3: (kw= '+' | kw= '-' )? this_INT_2= RULE_INT
                    {
                    // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:1476:3: (kw= '+' | kw= '-' )?
                    int alt24=3;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==31) ) {
                        alt24=1;
                    }
                    else if ( (LA24_0==32) ) {
                        alt24=2;
                    }
                    switch (alt24) {
                        case 1 :
                            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:1477:2: kw= '+'
                            {
                            kw=(Token)match(input,31,FOLLOW_31_in_ruleNUMBER3338); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getNUMBERAccess().getPlusSignKeyword_0_0_0()); 
                                

                            }
                            break;
                        case 2 :
                            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:1484:2: kw= '-'
                            {
                            kw=(Token)match(input,32,FOLLOW_32_in_ruleNUMBER3357); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getNUMBERAccess().getHyphenMinusKeyword_0_0_1()); 
                                

                            }
                            break;

                    }

                    this_INT_2=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNUMBER3374); 

                    		current.merge(this_INT_2);
                        
                     
                        newLeafNode(this_INT_2, grammarAccess.getNUMBERAccess().getINTTerminalRuleCall_0_1()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:1497:6: (this_INT_3= RULE_INT kw= '.' this_INT_5= RULE_INT )
                    {
                    // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:1497:6: (this_INT_3= RULE_INT kw= '.' this_INT_5= RULE_INT )
                    // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:1497:11: this_INT_3= RULE_INT kw= '.' this_INT_5= RULE_INT
                    {
                    this_INT_3=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNUMBER3402); 

                    		current.merge(this_INT_3);
                        
                     
                        newLeafNode(this_INT_3, grammarAccess.getNUMBERAccess().getINTTerminalRuleCall_1_0()); 
                        
                    kw=(Token)match(input,27,FOLLOW_27_in_ruleNUMBER3420); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNUMBERAccess().getFullStopKeyword_1_1()); 
                        
                    this_INT_5=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNUMBER3435); 

                    		current.merge(this_INT_5);
                        
                     
                        newLeafNode(this_INT_5, grammarAccess.getNUMBERAccess().getINTTerminalRuleCall_1_2()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNUMBER"


    // $ANTLR start "ruleTypeStorageModifier"
    // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:1525:1: ruleTypeStorageModifier returns [Enumerator current=null] : ( (enumLiteral_0= ' storable' ) | (enumLiteral_1= 'embeddable' ) ) ;
    public final Enumerator ruleTypeStorageModifier() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:1527:28: ( ( (enumLiteral_0= ' storable' ) | (enumLiteral_1= 'embeddable' ) ) )
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:1528:1: ( (enumLiteral_0= ' storable' ) | (enumLiteral_1= 'embeddable' ) )
            {
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:1528:1: ( (enumLiteral_0= ' storable' ) | (enumLiteral_1= 'embeddable' ) )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==33) ) {
                alt26=1;
            }
            else if ( (LA26_0==34) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:1528:2: (enumLiteral_0= ' storable' )
                    {
                    // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:1528:2: (enumLiteral_0= ' storable' )
                    // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:1528:4: enumLiteral_0= ' storable'
                    {
                    enumLiteral_0=(Token)match(input,33,FOLLOW_33_in_ruleTypeStorageModifier3495); 

                            current = grammarAccess.getTypeStorageModifierAccess().getSTORABLEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getTypeStorageModifierAccess().getSTORABLEEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:1534:6: (enumLiteral_1= 'embeddable' )
                    {
                    // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:1534:6: (enumLiteral_1= 'embeddable' )
                    // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:1534:8: enumLiteral_1= 'embeddable'
                    {
                    enumLiteral_1=(Token)match(input,34,FOLLOW_34_in_ruleTypeStorageModifier3512); 

                            current = grammarAccess.getTypeStorageModifierAccess().getEMBEDDABLEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getTypeStorageModifierAccess().getEMBEDDABLEEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypeStorageModifier"


    // $ANTLR start "ruleEntityRelationshipKind"
    // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:1544:1: ruleEntityRelationshipKind returns [Enumerator current=null] : ( (enumLiteral_0= 'unique' ) | (enumLiteral_1= 'many' ) ) ;
    public final Enumerator ruleEntityRelationshipKind() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:1546:28: ( ( (enumLiteral_0= 'unique' ) | (enumLiteral_1= 'many' ) ) )
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:1547:1: ( (enumLiteral_0= 'unique' ) | (enumLiteral_1= 'many' ) )
            {
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:1547:1: ( (enumLiteral_0= 'unique' ) | (enumLiteral_1= 'many' ) )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==35) ) {
                alt27=1;
            }
            else if ( (LA27_0==36) ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:1547:2: (enumLiteral_0= 'unique' )
                    {
                    // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:1547:2: (enumLiteral_0= 'unique' )
                    // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:1547:4: enumLiteral_0= 'unique'
                    {
                    enumLiteral_0=(Token)match(input,35,FOLLOW_35_in_ruleEntityRelationshipKind3557); 

                            current = grammarAccess.getEntityRelationshipKindAccess().getUNIQUEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getEntityRelationshipKindAccess().getUNIQUEEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:1553:6: (enumLiteral_1= 'many' )
                    {
                    // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:1553:6: (enumLiteral_1= 'many' )
                    // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:1553:8: enumLiteral_1= 'many'
                    {
                    enumLiteral_1=(Token)match(input,36,FOLLOW_36_in_ruleEntityRelationshipKind3574); 

                            current = grammarAccess.getEntityRelationshipKindAccess().getMANYEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getEntityRelationshipKindAccess().getMANYEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEntityRelationshipKind"


    // $ANTLR start "rulePropertyStorageModifier"
    // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:1563:1: rulePropertyStorageModifier returns [Enumerator current=null] : ( (enumLiteral_0= 'var' ) | (enumLiteral_1= 'val' ) | (enumLiteral_2= 'transient' ) ) ;
    public final Enumerator rulePropertyStorageModifier() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:1565:28: ( ( (enumLiteral_0= 'var' ) | (enumLiteral_1= 'val' ) | (enumLiteral_2= 'transient' ) ) )
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:1566:1: ( (enumLiteral_0= 'var' ) | (enumLiteral_1= 'val' ) | (enumLiteral_2= 'transient' ) )
            {
            // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:1566:1: ( (enumLiteral_0= 'var' ) | (enumLiteral_1= 'val' ) | (enumLiteral_2= 'transient' ) )
            int alt28=3;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt28=1;
                }
                break;
            case 38:
                {
                alt28=2;
                }
                break;
            case 39:
                {
                alt28=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:1566:2: (enumLiteral_0= 'var' )
                    {
                    // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:1566:2: (enumLiteral_0= 'var' )
                    // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:1566:4: enumLiteral_0= 'var'
                    {
                    enumLiteral_0=(Token)match(input,37,FOLLOW_37_in_rulePropertyStorageModifier3619); 

                            current = grammarAccess.getPropertyStorageModifierAccess().getVARIABLEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getPropertyStorageModifierAccess().getVARIABLEEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:1572:6: (enumLiteral_1= 'val' )
                    {
                    // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:1572:6: (enumLiteral_1= 'val' )
                    // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:1572:8: enumLiteral_1= 'val'
                    {
                    enumLiteral_1=(Token)match(input,38,FOLLOW_38_in_rulePropertyStorageModifier3636); 

                            current = grammarAccess.getPropertyStorageModifierAccess().getVALUEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getPropertyStorageModifierAccess().getVALUEEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:1578:6: (enumLiteral_2= 'transient' )
                    {
                    // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:1578:6: (enumLiteral_2= 'transient' )
                    // ../org.spp.cocome.types/src-gen/org/spp/cocome/types/parser/antlr/internal/InternalTypes.g:1578:8: enumLiteral_2= 'transient'
                    {
                    enumLiteral_2=(Token)match(input,39,FOLLOW_39_in_rulePropertyStorageModifier3653); 

                            current = grammarAccess.getPropertyStorageModifierAccess().getTRANSIENTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getPropertyStorageModifierAccess().getTRANSIENTEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePropertyStorageModifier"

    // Delegated rules


    protected DFA18 dfa18 = new DFA18(this);
    static final String DFA18_eotS =
        "\6\uffff";
    static final String DFA18_eofS =
        "\1\2\1\3\4\uffff";
    static final String DFA18_minS =
        "\2\5\2\uffff\2\5";
    static final String DFA18_maxS =
        "\2\47\2\uffff\2\47";
    static final String DFA18_acceptS =
        "\2\uffff\1\2\1\1\2\uffff";
    static final String DFA18_specialS =
        "\6\uffff}>";
    static final String[] DFA18_transitionS = {
            "\1\1\20\uffff\1\2\1\uffff\3\2\12\uffff\3\2",
            "\1\4\10\uffff\1\2\1\uffff\1\2\5\uffff\1\3\1\uffff\4\3\11\uffff"+
            "\3\3",
            "",
            "",
            "\1\5\10\uffff\1\3\1\uffff\1\3\5\uffff\1\2\1\uffff\3\2\10\uffff"+
            "\5\2",
            "\1\4\10\uffff\1\2\1\uffff\1\2\5\uffff\1\3\1\uffff\3\3\10\uffff"+
            "\5\3"
    };

    static final short[] DFA18_eot = DFA.unpackEncodedString(DFA18_eotS);
    static final short[] DFA18_eof = DFA.unpackEncodedString(DFA18_eofS);
    static final char[] DFA18_min = DFA.unpackEncodedStringToUnsignedChars(DFA18_minS);
    static final char[] DFA18_max = DFA.unpackEncodedStringToUnsignedChars(DFA18_maxS);
    static final short[] DFA18_accept = DFA.unpackEncodedString(DFA18_acceptS);
    static final short[] DFA18_special = DFA.unpackEncodedString(DFA18_specialS);
    static final short[][] DFA18_transition;

    static {
        int numStates = DFA18_transitionS.length;
        DFA18_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA18_transition[i] = DFA.unpackEncodedString(DFA18_transitionS[i]);
        }
    }

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = DFA18_eot;
            this.eof = DFA18_eof;
            this.min = DFA18_min;
            this.max = DFA18_max;
            this.accept = DFA18_accept;
            this.special = DFA18_special;
            this.transition = DFA18_transition;
        }
        public String getDescription() {
            return "1002:2: ( (lv_mappedBy_2_0= ruleMappedByReference ) )?";
        }
    }
 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleModel122 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleModel143 = new BitSet(new long[]{0x0000000000842002L});
    public static final BitSet FOLLOW_ruleImport_in_ruleModel164 = new BitSet(new long[]{0x0000000000842002L});
    public static final BitSet FOLLOW_ruleComplexType_in_ruleModel186 = new BitSet(new long[]{0x0000000000840002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport223 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleImport270 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_ruleImport291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamedType_in_entryRuleNamedType329 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNamedType339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexType_in_ruleNamedType386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveType_in_ruleNamedType413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollectionType_in_entryRuleCollectionType448 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCollectionType458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeReference_in_ruleCollectionType504 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleCollectionType516 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleCollectionType533 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleCollectionType551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMapType_in_entryRuleMapType587 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMapType597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeReference_in_ruleMapType643 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleMapType655 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleTypeReference_in_ruleMapType677 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleMapType689 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleMapType702 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleMapType719 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleMapType737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclarationTypeReference_in_entryRuleDeclarationTypeReference773 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeclarationTypeReference783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeReference_in_ruleDeclarationTypeReference830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollectionType_in_ruleDeclarationTypeReference857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMapType_in_ruleDeclarationTypeReference884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeReference_in_entryRuleTypeReference919 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeReference929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTypeReference973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveType_in_entryRulePrimitiveType1008 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveType1018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimitiveType1059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexType_in_entryRuleComplexType1099 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComplexType1109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumerationType_in_ruleComplexType1156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntityType_in_ruleComplexType1183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumerationType_in_entryRuleEnumerationType1218 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumerationType1228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleEnumerationType1265 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumerationType1282 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_19_in_ruleEnumerationType1300 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleEnumerationType1323 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleEnumerationType1337 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleEnumerationLiteral_in_ruleEnumerationType1358 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_21_in_ruleEnumerationType1371 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleEnumerationLiteral_in_ruleEnumerationType1392 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_22_in_ruleEnumerationType1406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumerationLiteral_in_entryRuleEnumerationLiteral1442 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumerationLiteral1452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumerationLiteral1493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntityType_in_entryRuleEntityType1533 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntityType1543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleEntityType1580 = new BitSet(new long[]{0x0000000600000020L});
    public static final BitSet FOLLOW_ruleTypeStorageModifier_in_ruleEntityType1601 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEntityType1619 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_19_in_ruleEntityType1637 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleEntityType1660 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleEntityType1674 = new BitSet(new long[]{0x000000E000400020L});
    public static final BitSet FOLLOW_ruleProperty_in_ruleEntityType1695 = new BitSet(new long[]{0x000000E000400020L});
    public static final BitSet FOLLOW_22_in_ruleEntityType1708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_entryRuleProperty1744 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProperty1754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyStorageModifier_in_ruleProperty1800 = new BitSet(new long[]{0x000000E000000020L});
    public static final BitSet FOLLOW_ruleDeclarationTypeReference_in_ruleProperty1822 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProperty1839 = new BitSet(new long[]{0x0000001807000002L});
    public static final BitSet FOLLOW_ruleEntityRelationship_in_ruleProperty1865 = new BitSet(new long[]{0x0000000007000002L});
    public static final BitSet FOLLOW_24_in_ruleProperty1879 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rulePropertyReference_in_ruleProperty1900 = new BitSet(new long[]{0x0000000006000002L});
    public static final BitSet FOLLOW_25_in_ruleProperty1915 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rulePropertyReference_in_ruleProperty1936 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_26_in_ruleProperty1951 = new BitSet(new long[]{0x00000001E00000F0L});
    public static final BitSet FOLLOW_ruleLiteral_in_ruleProperty1972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntityRelationship_in_entryRuleEntityRelationship2010 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntityRelationship2020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntityRelationshipKind_in_ruleEntityRelationship2075 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_ruleMappedByReference_in_ruleEntityRelationship2096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMappedByReference_in_entryRuleMappedByReference2133 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMappedByReference2143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMappedByReference2188 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_27_in_ruleMappedByReference2201 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleMappedByReference_in_ruleMappedByReference2222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral2260 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteral2270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLiteral_in_ruleLiteral2317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberLiteral_in_ruleLiteral2344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCharLiteral_in_ruleLiteral2371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_ruleLiteral2398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyReference_in_ruleLiteral2425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral2460 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringLiteral2470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringLiteral2511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCharLiteral_in_entryRuleCharLiteral2551 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCharLiteral2561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CHARACTER_in_ruleCharLiteral2602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberLiteral_in_entryRuleNumberLiteral2642 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumberLiteral2652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNUMBER_in_ruleNumberLiteral2697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral2732 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanLiteral2742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBOOLEAN_in_ruleBooleanLiteral2787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyReference_in_entryRulePropertyReference2822 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyReference2832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePropertyReference2876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName2912 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName2923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName2963 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_27_in_ruleQualifiedName2982 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName2997 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard3045 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard3056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildcard3103 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_27_in_ruleQualifiedNameWithWildcard3122 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleQualifiedNameWithWildcard3135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBOOLEAN_in_entryRuleBOOLEAN3178 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBOOLEAN3189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleBOOLEAN3227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleBOOLEAN3246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNUMBER_in_entryRuleNUMBER3287 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNUMBER3298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleNUMBER3338 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_32_in_ruleNUMBER3357 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNUMBER3374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNUMBER3402 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleNUMBER3420 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNUMBER3435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleTypeStorageModifier3495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleTypeStorageModifier3512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleEntityRelationshipKind3557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleEntityRelationshipKind3574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rulePropertyStorageModifier3619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rulePropertyStorageModifier3636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rulePropertyStorageModifier3653 = new BitSet(new long[]{0x0000000000000002L});

}