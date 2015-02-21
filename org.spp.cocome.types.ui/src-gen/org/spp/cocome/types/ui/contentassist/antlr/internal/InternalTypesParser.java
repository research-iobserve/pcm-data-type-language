package org.spp.cocome.types.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.spp.cocome.types.services.TypesGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTypesParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_CHARACTER", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'true'", "'false'", "'+'", "'-'", "' storable'", "'embeddable'", "'unique'", "'many'", "'var'", "'val'", "'transient'", "'package'", "'import'", "'['", "']'", "'<'", "'>'", "'enum'", "'{'", "'}'", "':'", "','", "'entity'", "'order'", "'key'", "'='", "'.'", "'*'"
    };
    public static final int RULE_ID=4;
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
    public static final int RULE_INT=5;
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
    public String getGrammarFileName() { return "../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g"; }


     
     	private TypesGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(TypesGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleModel"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:60:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:61:1: ( ruleModel EOF )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:62:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel61);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:69:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:73:2: ( ( ( rule__Model__Group__0 ) ) )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:74:1: ( ( rule__Model__Group__0 ) )
            {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:74:1: ( ( rule__Model__Group__0 ) )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:75:1: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:76:1: ( rule__Model__Group__0 )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:76:2: rule__Model__Group__0
            {
            pushFollow(FOLLOW_rule__Model__Group__0_in_ruleModel94);
            rule__Model__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleImport"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:88:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:89:1: ( ruleImport EOF )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:90:1: ruleImport EOF
            {
             before(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport121);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getImportRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:97:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:101:2: ( ( ( rule__Import__Group__0 ) ) )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:102:1: ( ( rule__Import__Group__0 ) )
            {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:102:1: ( ( rule__Import__Group__0 ) )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:103:1: ( rule__Import__Group__0 )
            {
             before(grammarAccess.getImportAccess().getGroup()); 
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:104:1: ( rule__Import__Group__0 )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:104:2: rule__Import__Group__0
            {
            pushFollow(FOLLOW_rule__Import__Group__0_in_ruleImport154);
            rule__Import__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleNamedType"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:118:1: entryRuleNamedType : ruleNamedType EOF ;
    public final void entryRuleNamedType() throws RecognitionException {
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:119:1: ( ruleNamedType EOF )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:120:1: ruleNamedType EOF
            {
             before(grammarAccess.getNamedTypeRule()); 
            pushFollow(FOLLOW_ruleNamedType_in_entryRuleNamedType183);
            ruleNamedType();

            state._fsp--;

             after(grammarAccess.getNamedTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNamedType190); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNamedType"


    // $ANTLR start "ruleNamedType"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:127:1: ruleNamedType : ( ( rule__NamedType__Alternatives ) ) ;
    public final void ruleNamedType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:131:2: ( ( ( rule__NamedType__Alternatives ) ) )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:132:1: ( ( rule__NamedType__Alternatives ) )
            {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:132:1: ( ( rule__NamedType__Alternatives ) )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:133:1: ( rule__NamedType__Alternatives )
            {
             before(grammarAccess.getNamedTypeAccess().getAlternatives()); 
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:134:1: ( rule__NamedType__Alternatives )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:134:2: rule__NamedType__Alternatives
            {
            pushFollow(FOLLOW_rule__NamedType__Alternatives_in_ruleNamedType216);
            rule__NamedType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNamedTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNamedType"


    // $ANTLR start "entryRuleCollectionType"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:146:1: entryRuleCollectionType : ruleCollectionType EOF ;
    public final void entryRuleCollectionType() throws RecognitionException {
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:147:1: ( ruleCollectionType EOF )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:148:1: ruleCollectionType EOF
            {
             before(grammarAccess.getCollectionTypeRule()); 
            pushFollow(FOLLOW_ruleCollectionType_in_entryRuleCollectionType243);
            ruleCollectionType();

            state._fsp--;

             after(grammarAccess.getCollectionTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCollectionType250); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCollectionType"


    // $ANTLR start "ruleCollectionType"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:155:1: ruleCollectionType : ( ( rule__CollectionType__Group__0 ) ) ;
    public final void ruleCollectionType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:159:2: ( ( ( rule__CollectionType__Group__0 ) ) )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:160:1: ( ( rule__CollectionType__Group__0 ) )
            {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:160:1: ( ( rule__CollectionType__Group__0 ) )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:161:1: ( rule__CollectionType__Group__0 )
            {
             before(grammarAccess.getCollectionTypeAccess().getGroup()); 
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:162:1: ( rule__CollectionType__Group__0 )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:162:2: rule__CollectionType__Group__0
            {
            pushFollow(FOLLOW_rule__CollectionType__Group__0_in_ruleCollectionType276);
            rule__CollectionType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCollectionTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCollectionType"


    // $ANTLR start "entryRuleMapType"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:174:1: entryRuleMapType : ruleMapType EOF ;
    public final void entryRuleMapType() throws RecognitionException {
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:175:1: ( ruleMapType EOF )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:176:1: ruleMapType EOF
            {
             before(grammarAccess.getMapTypeRule()); 
            pushFollow(FOLLOW_ruleMapType_in_entryRuleMapType303);
            ruleMapType();

            state._fsp--;

             after(grammarAccess.getMapTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMapType310); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMapType"


    // $ANTLR start "ruleMapType"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:183:1: ruleMapType : ( ( rule__MapType__Group__0 ) ) ;
    public final void ruleMapType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:187:2: ( ( ( rule__MapType__Group__0 ) ) )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:188:1: ( ( rule__MapType__Group__0 ) )
            {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:188:1: ( ( rule__MapType__Group__0 ) )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:189:1: ( rule__MapType__Group__0 )
            {
             before(grammarAccess.getMapTypeAccess().getGroup()); 
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:190:1: ( rule__MapType__Group__0 )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:190:2: rule__MapType__Group__0
            {
            pushFollow(FOLLOW_rule__MapType__Group__0_in_ruleMapType336);
            rule__MapType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMapTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMapType"


    // $ANTLR start "entryRuleDeclarationTypeReference"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:202:1: entryRuleDeclarationTypeReference : ruleDeclarationTypeReference EOF ;
    public final void entryRuleDeclarationTypeReference() throws RecognitionException {
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:203:1: ( ruleDeclarationTypeReference EOF )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:204:1: ruleDeclarationTypeReference EOF
            {
             before(grammarAccess.getDeclarationTypeReferenceRule()); 
            pushFollow(FOLLOW_ruleDeclarationTypeReference_in_entryRuleDeclarationTypeReference363);
            ruleDeclarationTypeReference();

            state._fsp--;

             after(grammarAccess.getDeclarationTypeReferenceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeclarationTypeReference370); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDeclarationTypeReference"


    // $ANTLR start "ruleDeclarationTypeReference"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:211:1: ruleDeclarationTypeReference : ( ( rule__DeclarationTypeReference__Alternatives ) ) ;
    public final void ruleDeclarationTypeReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:215:2: ( ( ( rule__DeclarationTypeReference__Alternatives ) ) )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:216:1: ( ( rule__DeclarationTypeReference__Alternatives ) )
            {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:216:1: ( ( rule__DeclarationTypeReference__Alternatives ) )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:217:1: ( rule__DeclarationTypeReference__Alternatives )
            {
             before(grammarAccess.getDeclarationTypeReferenceAccess().getAlternatives()); 
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:218:1: ( rule__DeclarationTypeReference__Alternatives )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:218:2: rule__DeclarationTypeReference__Alternatives
            {
            pushFollow(FOLLOW_rule__DeclarationTypeReference__Alternatives_in_ruleDeclarationTypeReference396);
            rule__DeclarationTypeReference__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDeclarationTypeReferenceAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDeclarationTypeReference"


    // $ANTLR start "entryRuleTypeReference"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:230:1: entryRuleTypeReference : ruleTypeReference EOF ;
    public final void entryRuleTypeReference() throws RecognitionException {
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:231:1: ( ruleTypeReference EOF )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:232:1: ruleTypeReference EOF
            {
             before(grammarAccess.getTypeReferenceRule()); 
            pushFollow(FOLLOW_ruleTypeReference_in_entryRuleTypeReference423);
            ruleTypeReference();

            state._fsp--;

             after(grammarAccess.getTypeReferenceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeReference430); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTypeReference"


    // $ANTLR start "ruleTypeReference"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:239:1: ruleTypeReference : ( ( rule__TypeReference__ReferenceAssignment ) ) ;
    public final void ruleTypeReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:243:2: ( ( ( rule__TypeReference__ReferenceAssignment ) ) )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:244:1: ( ( rule__TypeReference__ReferenceAssignment ) )
            {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:244:1: ( ( rule__TypeReference__ReferenceAssignment ) )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:245:1: ( rule__TypeReference__ReferenceAssignment )
            {
             before(grammarAccess.getTypeReferenceAccess().getReferenceAssignment()); 
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:246:1: ( rule__TypeReference__ReferenceAssignment )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:246:2: rule__TypeReference__ReferenceAssignment
            {
            pushFollow(FOLLOW_rule__TypeReference__ReferenceAssignment_in_ruleTypeReference456);
            rule__TypeReference__ReferenceAssignment();

            state._fsp--;


            }

             after(grammarAccess.getTypeReferenceAccess().getReferenceAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTypeReference"


    // $ANTLR start "entryRulePrimitiveType"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:258:1: entryRulePrimitiveType : rulePrimitiveType EOF ;
    public final void entryRulePrimitiveType() throws RecognitionException {
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:259:1: ( rulePrimitiveType EOF )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:260:1: rulePrimitiveType EOF
            {
             before(grammarAccess.getPrimitiveTypeRule()); 
            pushFollow(FOLLOW_rulePrimitiveType_in_entryRulePrimitiveType483);
            rulePrimitiveType();

            state._fsp--;

             after(grammarAccess.getPrimitiveTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimitiveType490); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePrimitiveType"


    // $ANTLR start "rulePrimitiveType"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:267:1: rulePrimitiveType : ( ( rule__PrimitiveType__NameAssignment ) ) ;
    public final void rulePrimitiveType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:271:2: ( ( ( rule__PrimitiveType__NameAssignment ) ) )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:272:1: ( ( rule__PrimitiveType__NameAssignment ) )
            {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:272:1: ( ( rule__PrimitiveType__NameAssignment ) )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:273:1: ( rule__PrimitiveType__NameAssignment )
            {
             before(grammarAccess.getPrimitiveTypeAccess().getNameAssignment()); 
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:274:1: ( rule__PrimitiveType__NameAssignment )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:274:2: rule__PrimitiveType__NameAssignment
            {
            pushFollow(FOLLOW_rule__PrimitiveType__NameAssignment_in_rulePrimitiveType516);
            rule__PrimitiveType__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getPrimitiveTypeAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrimitiveType"


    // $ANTLR start "entryRuleComplexType"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:286:1: entryRuleComplexType : ruleComplexType EOF ;
    public final void entryRuleComplexType() throws RecognitionException {
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:287:1: ( ruleComplexType EOF )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:288:1: ruleComplexType EOF
            {
             before(grammarAccess.getComplexTypeRule()); 
            pushFollow(FOLLOW_ruleComplexType_in_entryRuleComplexType543);
            ruleComplexType();

            state._fsp--;

             after(grammarAccess.getComplexTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComplexType550); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleComplexType"


    // $ANTLR start "ruleComplexType"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:295:1: ruleComplexType : ( ( rule__ComplexType__Alternatives ) ) ;
    public final void ruleComplexType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:299:2: ( ( ( rule__ComplexType__Alternatives ) ) )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:300:1: ( ( rule__ComplexType__Alternatives ) )
            {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:300:1: ( ( rule__ComplexType__Alternatives ) )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:301:1: ( rule__ComplexType__Alternatives )
            {
             before(grammarAccess.getComplexTypeAccess().getAlternatives()); 
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:302:1: ( rule__ComplexType__Alternatives )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:302:2: rule__ComplexType__Alternatives
            {
            pushFollow(FOLLOW_rule__ComplexType__Alternatives_in_ruleComplexType576);
            rule__ComplexType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getComplexTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComplexType"


    // $ANTLR start "entryRuleEnumerationType"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:314:1: entryRuleEnumerationType : ruleEnumerationType EOF ;
    public final void entryRuleEnumerationType() throws RecognitionException {
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:315:1: ( ruleEnumerationType EOF )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:316:1: ruleEnumerationType EOF
            {
             before(grammarAccess.getEnumerationTypeRule()); 
            pushFollow(FOLLOW_ruleEnumerationType_in_entryRuleEnumerationType603);
            ruleEnumerationType();

            state._fsp--;

             after(grammarAccess.getEnumerationTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumerationType610); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEnumerationType"


    // $ANTLR start "ruleEnumerationType"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:323:1: ruleEnumerationType : ( ( rule__EnumerationType__Group__0 ) ) ;
    public final void ruleEnumerationType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:327:2: ( ( ( rule__EnumerationType__Group__0 ) ) )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:328:1: ( ( rule__EnumerationType__Group__0 ) )
            {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:328:1: ( ( rule__EnumerationType__Group__0 ) )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:329:1: ( rule__EnumerationType__Group__0 )
            {
             before(grammarAccess.getEnumerationTypeAccess().getGroup()); 
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:330:1: ( rule__EnumerationType__Group__0 )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:330:2: rule__EnumerationType__Group__0
            {
            pushFollow(FOLLOW_rule__EnumerationType__Group__0_in_ruleEnumerationType636);
            rule__EnumerationType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEnumerationTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEnumerationType"


    // $ANTLR start "entryRuleEnumerationLiteral"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:342:1: entryRuleEnumerationLiteral : ruleEnumerationLiteral EOF ;
    public final void entryRuleEnumerationLiteral() throws RecognitionException {
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:343:1: ( ruleEnumerationLiteral EOF )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:344:1: ruleEnumerationLiteral EOF
            {
             before(grammarAccess.getEnumerationLiteralRule()); 
            pushFollow(FOLLOW_ruleEnumerationLiteral_in_entryRuleEnumerationLiteral663);
            ruleEnumerationLiteral();

            state._fsp--;

             after(grammarAccess.getEnumerationLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumerationLiteral670); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEnumerationLiteral"


    // $ANTLR start "ruleEnumerationLiteral"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:351:1: ruleEnumerationLiteral : ( ( rule__EnumerationLiteral__NameAssignment ) ) ;
    public final void ruleEnumerationLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:355:2: ( ( ( rule__EnumerationLiteral__NameAssignment ) ) )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:356:1: ( ( rule__EnumerationLiteral__NameAssignment ) )
            {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:356:1: ( ( rule__EnumerationLiteral__NameAssignment ) )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:357:1: ( rule__EnumerationLiteral__NameAssignment )
            {
             before(grammarAccess.getEnumerationLiteralAccess().getNameAssignment()); 
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:358:1: ( rule__EnumerationLiteral__NameAssignment )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:358:2: rule__EnumerationLiteral__NameAssignment
            {
            pushFollow(FOLLOW_rule__EnumerationLiteral__NameAssignment_in_ruleEnumerationLiteral696);
            rule__EnumerationLiteral__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getEnumerationLiteralAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEnumerationLiteral"


    // $ANTLR start "entryRuleEntityType"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:370:1: entryRuleEntityType : ruleEntityType EOF ;
    public final void entryRuleEntityType() throws RecognitionException {
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:371:1: ( ruleEntityType EOF )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:372:1: ruleEntityType EOF
            {
             before(grammarAccess.getEntityTypeRule()); 
            pushFollow(FOLLOW_ruleEntityType_in_entryRuleEntityType723);
            ruleEntityType();

            state._fsp--;

             after(grammarAccess.getEntityTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntityType730); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEntityType"


    // $ANTLR start "ruleEntityType"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:379:1: ruleEntityType : ( ( rule__EntityType__Group__0 ) ) ;
    public final void ruleEntityType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:383:2: ( ( ( rule__EntityType__Group__0 ) ) )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:384:1: ( ( rule__EntityType__Group__0 ) )
            {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:384:1: ( ( rule__EntityType__Group__0 ) )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:385:1: ( rule__EntityType__Group__0 )
            {
             before(grammarAccess.getEntityTypeAccess().getGroup()); 
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:386:1: ( rule__EntityType__Group__0 )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:386:2: rule__EntityType__Group__0
            {
            pushFollow(FOLLOW_rule__EntityType__Group__0_in_ruleEntityType756);
            rule__EntityType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEntityTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEntityType"


    // $ANTLR start "entryRuleProperty"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:398:1: entryRuleProperty : ruleProperty EOF ;
    public final void entryRuleProperty() throws RecognitionException {
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:399:1: ( ruleProperty EOF )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:400:1: ruleProperty EOF
            {
             before(grammarAccess.getPropertyRule()); 
            pushFollow(FOLLOW_ruleProperty_in_entryRuleProperty783);
            ruleProperty();

            state._fsp--;

             after(grammarAccess.getPropertyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProperty790); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProperty"


    // $ANTLR start "ruleProperty"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:407:1: ruleProperty : ( ( rule__Property__Group__0 ) ) ;
    public final void ruleProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:411:2: ( ( ( rule__Property__Group__0 ) ) )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:412:1: ( ( rule__Property__Group__0 ) )
            {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:412:1: ( ( rule__Property__Group__0 ) )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:413:1: ( rule__Property__Group__0 )
            {
             before(grammarAccess.getPropertyAccess().getGroup()); 
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:414:1: ( rule__Property__Group__0 )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:414:2: rule__Property__Group__0
            {
            pushFollow(FOLLOW_rule__Property__Group__0_in_ruleProperty816);
            rule__Property__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPropertyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProperty"


    // $ANTLR start "entryRuleEntityRelationship"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:426:1: entryRuleEntityRelationship : ruleEntityRelationship EOF ;
    public final void entryRuleEntityRelationship() throws RecognitionException {
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:427:1: ( ruleEntityRelationship EOF )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:428:1: ruleEntityRelationship EOF
            {
             before(grammarAccess.getEntityRelationshipRule()); 
            pushFollow(FOLLOW_ruleEntityRelationship_in_entryRuleEntityRelationship843);
            ruleEntityRelationship();

            state._fsp--;

             after(grammarAccess.getEntityRelationshipRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntityRelationship850); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEntityRelationship"


    // $ANTLR start "ruleEntityRelationship"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:435:1: ruleEntityRelationship : ( ( rule__EntityRelationship__Group__0 ) ) ;
    public final void ruleEntityRelationship() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:439:2: ( ( ( rule__EntityRelationship__Group__0 ) ) )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:440:1: ( ( rule__EntityRelationship__Group__0 ) )
            {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:440:1: ( ( rule__EntityRelationship__Group__0 ) )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:441:1: ( rule__EntityRelationship__Group__0 )
            {
             before(grammarAccess.getEntityRelationshipAccess().getGroup()); 
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:442:1: ( rule__EntityRelationship__Group__0 )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:442:2: rule__EntityRelationship__Group__0
            {
            pushFollow(FOLLOW_rule__EntityRelationship__Group__0_in_ruleEntityRelationship876);
            rule__EntityRelationship__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEntityRelationshipAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEntityRelationship"


    // $ANTLR start "entryRuleMappedByReference"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:454:1: entryRuleMappedByReference : ruleMappedByReference EOF ;
    public final void entryRuleMappedByReference() throws RecognitionException {
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:455:1: ( ruleMappedByReference EOF )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:456:1: ruleMappedByReference EOF
            {
             before(grammarAccess.getMappedByReferenceRule()); 
            pushFollow(FOLLOW_ruleMappedByReference_in_entryRuleMappedByReference903);
            ruleMappedByReference();

            state._fsp--;

             after(grammarAccess.getMappedByReferenceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMappedByReference910); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMappedByReference"


    // $ANTLR start "ruleMappedByReference"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:463:1: ruleMappedByReference : ( ( rule__MappedByReference__Group__0 ) ) ;
    public final void ruleMappedByReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:467:2: ( ( ( rule__MappedByReference__Group__0 ) ) )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:468:1: ( ( rule__MappedByReference__Group__0 ) )
            {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:468:1: ( ( rule__MappedByReference__Group__0 ) )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:469:1: ( rule__MappedByReference__Group__0 )
            {
             before(grammarAccess.getMappedByReferenceAccess().getGroup()); 
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:470:1: ( rule__MappedByReference__Group__0 )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:470:2: rule__MappedByReference__Group__0
            {
            pushFollow(FOLLOW_rule__MappedByReference__Group__0_in_ruleMappedByReference936);
            rule__MappedByReference__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMappedByReferenceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMappedByReference"


    // $ANTLR start "entryRuleLiteral"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:482:1: entryRuleLiteral : ruleLiteral EOF ;
    public final void entryRuleLiteral() throws RecognitionException {
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:483:1: ( ruleLiteral EOF )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:484:1: ruleLiteral EOF
            {
             before(grammarAccess.getLiteralRule()); 
            pushFollow(FOLLOW_ruleLiteral_in_entryRuleLiteral963);
            ruleLiteral();

            state._fsp--;

             after(grammarAccess.getLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteral970); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLiteral"


    // $ANTLR start "ruleLiteral"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:491:1: ruleLiteral : ( ( rule__Literal__Alternatives ) ) ;
    public final void ruleLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:495:2: ( ( ( rule__Literal__Alternatives ) ) )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:496:1: ( ( rule__Literal__Alternatives ) )
            {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:496:1: ( ( rule__Literal__Alternatives ) )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:497:1: ( rule__Literal__Alternatives )
            {
             before(grammarAccess.getLiteralAccess().getAlternatives()); 
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:498:1: ( rule__Literal__Alternatives )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:498:2: rule__Literal__Alternatives
            {
            pushFollow(FOLLOW_rule__Literal__Alternatives_in_ruleLiteral996);
            rule__Literal__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLiteralAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLiteral"


    // $ANTLR start "entryRuleStringLiteral"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:510:1: entryRuleStringLiteral : ruleStringLiteral EOF ;
    public final void entryRuleStringLiteral() throws RecognitionException {
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:511:1: ( ruleStringLiteral EOF )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:512:1: ruleStringLiteral EOF
            {
             before(grammarAccess.getStringLiteralRule()); 
            pushFollow(FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral1023);
            ruleStringLiteral();

            state._fsp--;

             after(grammarAccess.getStringLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringLiteral1030); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStringLiteral"


    // $ANTLR start "ruleStringLiteral"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:519:1: ruleStringLiteral : ( ( rule__StringLiteral__ValueAssignment ) ) ;
    public final void ruleStringLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:523:2: ( ( ( rule__StringLiteral__ValueAssignment ) ) )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:524:1: ( ( rule__StringLiteral__ValueAssignment ) )
            {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:524:1: ( ( rule__StringLiteral__ValueAssignment ) )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:525:1: ( rule__StringLiteral__ValueAssignment )
            {
             before(grammarAccess.getStringLiteralAccess().getValueAssignment()); 
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:526:1: ( rule__StringLiteral__ValueAssignment )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:526:2: rule__StringLiteral__ValueAssignment
            {
            pushFollow(FOLLOW_rule__StringLiteral__ValueAssignment_in_ruleStringLiteral1056);
            rule__StringLiteral__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getStringLiteralAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStringLiteral"


    // $ANTLR start "entryRuleCharLiteral"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:538:1: entryRuleCharLiteral : ruleCharLiteral EOF ;
    public final void entryRuleCharLiteral() throws RecognitionException {
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:539:1: ( ruleCharLiteral EOF )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:540:1: ruleCharLiteral EOF
            {
             before(grammarAccess.getCharLiteralRule()); 
            pushFollow(FOLLOW_ruleCharLiteral_in_entryRuleCharLiteral1083);
            ruleCharLiteral();

            state._fsp--;

             after(grammarAccess.getCharLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCharLiteral1090); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCharLiteral"


    // $ANTLR start "ruleCharLiteral"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:547:1: ruleCharLiteral : ( ( rule__CharLiteral__ValueAssignment ) ) ;
    public final void ruleCharLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:551:2: ( ( ( rule__CharLiteral__ValueAssignment ) ) )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:552:1: ( ( rule__CharLiteral__ValueAssignment ) )
            {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:552:1: ( ( rule__CharLiteral__ValueAssignment ) )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:553:1: ( rule__CharLiteral__ValueAssignment )
            {
             before(grammarAccess.getCharLiteralAccess().getValueAssignment()); 
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:554:1: ( rule__CharLiteral__ValueAssignment )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:554:2: rule__CharLiteral__ValueAssignment
            {
            pushFollow(FOLLOW_rule__CharLiteral__ValueAssignment_in_ruleCharLiteral1116);
            rule__CharLiteral__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getCharLiteralAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCharLiteral"


    // $ANTLR start "entryRuleNumberLiteral"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:566:1: entryRuleNumberLiteral : ruleNumberLiteral EOF ;
    public final void entryRuleNumberLiteral() throws RecognitionException {
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:567:1: ( ruleNumberLiteral EOF )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:568:1: ruleNumberLiteral EOF
            {
             before(grammarAccess.getNumberLiteralRule()); 
            pushFollow(FOLLOW_ruleNumberLiteral_in_entryRuleNumberLiteral1143);
            ruleNumberLiteral();

            state._fsp--;

             after(grammarAccess.getNumberLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumberLiteral1150); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNumberLiteral"


    // $ANTLR start "ruleNumberLiteral"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:575:1: ruleNumberLiteral : ( ( rule__NumberLiteral__ValueAssignment ) ) ;
    public final void ruleNumberLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:579:2: ( ( ( rule__NumberLiteral__ValueAssignment ) ) )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:580:1: ( ( rule__NumberLiteral__ValueAssignment ) )
            {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:580:1: ( ( rule__NumberLiteral__ValueAssignment ) )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:581:1: ( rule__NumberLiteral__ValueAssignment )
            {
             before(grammarAccess.getNumberLiteralAccess().getValueAssignment()); 
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:582:1: ( rule__NumberLiteral__ValueAssignment )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:582:2: rule__NumberLiteral__ValueAssignment
            {
            pushFollow(FOLLOW_rule__NumberLiteral__ValueAssignment_in_ruleNumberLiteral1176);
            rule__NumberLiteral__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getNumberLiteralAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNumberLiteral"


    // $ANTLR start "entryRuleBooleanLiteral"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:594:1: entryRuleBooleanLiteral : ruleBooleanLiteral EOF ;
    public final void entryRuleBooleanLiteral() throws RecognitionException {
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:595:1: ( ruleBooleanLiteral EOF )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:596:1: ruleBooleanLiteral EOF
            {
             before(grammarAccess.getBooleanLiteralRule()); 
            pushFollow(FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral1203);
            ruleBooleanLiteral();

            state._fsp--;

             after(grammarAccess.getBooleanLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanLiteral1210); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBooleanLiteral"


    // $ANTLR start "ruleBooleanLiteral"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:603:1: ruleBooleanLiteral : ( ( rule__BooleanLiteral__ValueAssignment ) ) ;
    public final void ruleBooleanLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:607:2: ( ( ( rule__BooleanLiteral__ValueAssignment ) ) )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:608:1: ( ( rule__BooleanLiteral__ValueAssignment ) )
            {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:608:1: ( ( rule__BooleanLiteral__ValueAssignment ) )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:609:1: ( rule__BooleanLiteral__ValueAssignment )
            {
             before(grammarAccess.getBooleanLiteralAccess().getValueAssignment()); 
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:610:1: ( rule__BooleanLiteral__ValueAssignment )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:610:2: rule__BooleanLiteral__ValueAssignment
            {
            pushFollow(FOLLOW_rule__BooleanLiteral__ValueAssignment_in_ruleBooleanLiteral1236);
            rule__BooleanLiteral__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getBooleanLiteralAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBooleanLiteral"


    // $ANTLR start "entryRulePropertyReference"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:622:1: entryRulePropertyReference : rulePropertyReference EOF ;
    public final void entryRulePropertyReference() throws RecognitionException {
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:623:1: ( rulePropertyReference EOF )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:624:1: rulePropertyReference EOF
            {
             before(grammarAccess.getPropertyReferenceRule()); 
            pushFollow(FOLLOW_rulePropertyReference_in_entryRulePropertyReference1263);
            rulePropertyReference();

            state._fsp--;

             after(grammarAccess.getPropertyReferenceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertyReference1270); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePropertyReference"


    // $ANTLR start "rulePropertyReference"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:631:1: rulePropertyReference : ( ( rule__PropertyReference__ReferenceAssignment ) ) ;
    public final void rulePropertyReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:635:2: ( ( ( rule__PropertyReference__ReferenceAssignment ) ) )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:636:1: ( ( rule__PropertyReference__ReferenceAssignment ) )
            {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:636:1: ( ( rule__PropertyReference__ReferenceAssignment ) )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:637:1: ( rule__PropertyReference__ReferenceAssignment )
            {
             before(grammarAccess.getPropertyReferenceAccess().getReferenceAssignment()); 
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:638:1: ( rule__PropertyReference__ReferenceAssignment )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:638:2: rule__PropertyReference__ReferenceAssignment
            {
            pushFollow(FOLLOW_rule__PropertyReference__ReferenceAssignment_in_rulePropertyReference1296);
            rule__PropertyReference__ReferenceAssignment();

            state._fsp--;


            }

             after(grammarAccess.getPropertyReferenceAccess().getReferenceAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePropertyReference"


    // $ANTLR start "entryRuleQualifiedName"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:650:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:651:1: ( ruleQualifiedName EOF )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:652:1: ruleQualifiedName EOF
            {
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1323);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName1330); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:659:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:663:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:664:1: ( ( rule__QualifiedName__Group__0 ) )
            {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:664:1: ( ( rule__QualifiedName__Group__0 ) )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:665:1: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:666:1: ( rule__QualifiedName__Group__0 )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:666:2: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName1356);
            rule__QualifiedName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleQualifiedNameWithWildcard"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:678:1: entryRuleQualifiedNameWithWildcard : ruleQualifiedNameWithWildcard EOF ;
    public final void entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:679:1: ( ruleQualifiedNameWithWildcard EOF )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:680:1: ruleQualifiedNameWithWildcard EOF
            {
             before(grammarAccess.getQualifiedNameWithWildcardRule()); 
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard1383);
            ruleQualifiedNameWithWildcard();

            state._fsp--;

             after(grammarAccess.getQualifiedNameWithWildcardRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard1390); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQualifiedNameWithWildcard"


    // $ANTLR start "ruleQualifiedNameWithWildcard"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:687:1: ruleQualifiedNameWithWildcard : ( ( rule__QualifiedNameWithWildcard__Group__0 ) ) ;
    public final void ruleQualifiedNameWithWildcard() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:691:2: ( ( ( rule__QualifiedNameWithWildcard__Group__0 ) ) )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:692:1: ( ( rule__QualifiedNameWithWildcard__Group__0 ) )
            {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:692:1: ( ( rule__QualifiedNameWithWildcard__Group__0 ) )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:693:1: ( rule__QualifiedNameWithWildcard__Group__0 )
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup()); 
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:694:1: ( rule__QualifiedNameWithWildcard__Group__0 )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:694:2: rule__QualifiedNameWithWildcard__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group__0_in_ruleQualifiedNameWithWildcard1416);
            rule__QualifiedNameWithWildcard__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualifiedNameWithWildcard"


    // $ANTLR start "entryRuleBOOLEAN"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:706:1: entryRuleBOOLEAN : ruleBOOLEAN EOF ;
    public final void entryRuleBOOLEAN() throws RecognitionException {
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:707:1: ( ruleBOOLEAN EOF )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:708:1: ruleBOOLEAN EOF
            {
             before(grammarAccess.getBOOLEANRule()); 
            pushFollow(FOLLOW_ruleBOOLEAN_in_entryRuleBOOLEAN1443);
            ruleBOOLEAN();

            state._fsp--;

             after(grammarAccess.getBOOLEANRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBOOLEAN1450); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBOOLEAN"


    // $ANTLR start "ruleBOOLEAN"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:715:1: ruleBOOLEAN : ( ( rule__BOOLEAN__Alternatives ) ) ;
    public final void ruleBOOLEAN() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:719:2: ( ( ( rule__BOOLEAN__Alternatives ) ) )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:720:1: ( ( rule__BOOLEAN__Alternatives ) )
            {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:720:1: ( ( rule__BOOLEAN__Alternatives ) )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:721:1: ( rule__BOOLEAN__Alternatives )
            {
             before(grammarAccess.getBOOLEANAccess().getAlternatives()); 
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:722:1: ( rule__BOOLEAN__Alternatives )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:722:2: rule__BOOLEAN__Alternatives
            {
            pushFollow(FOLLOW_rule__BOOLEAN__Alternatives_in_ruleBOOLEAN1476);
            rule__BOOLEAN__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBOOLEANAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBOOLEAN"


    // $ANTLR start "entryRuleNUMBER"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:734:1: entryRuleNUMBER : ruleNUMBER EOF ;
    public final void entryRuleNUMBER() throws RecognitionException {
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:735:1: ( ruleNUMBER EOF )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:736:1: ruleNUMBER EOF
            {
             before(grammarAccess.getNUMBERRule()); 
            pushFollow(FOLLOW_ruleNUMBER_in_entryRuleNUMBER1503);
            ruleNUMBER();

            state._fsp--;

             after(grammarAccess.getNUMBERRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNUMBER1510); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNUMBER"


    // $ANTLR start "ruleNUMBER"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:743:1: ruleNUMBER : ( ( rule__NUMBER__Alternatives ) ) ;
    public final void ruleNUMBER() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:747:2: ( ( ( rule__NUMBER__Alternatives ) ) )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:748:1: ( ( rule__NUMBER__Alternatives ) )
            {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:748:1: ( ( rule__NUMBER__Alternatives ) )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:749:1: ( rule__NUMBER__Alternatives )
            {
             before(grammarAccess.getNUMBERAccess().getAlternatives()); 
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:750:1: ( rule__NUMBER__Alternatives )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:750:2: rule__NUMBER__Alternatives
            {
            pushFollow(FOLLOW_rule__NUMBER__Alternatives_in_ruleNUMBER1536);
            rule__NUMBER__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNUMBERAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNUMBER"


    // $ANTLR start "ruleTypeStorageModifier"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:763:1: ruleTypeStorageModifier : ( ( rule__TypeStorageModifier__Alternatives ) ) ;
    public final void ruleTypeStorageModifier() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:767:1: ( ( ( rule__TypeStorageModifier__Alternatives ) ) )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:768:1: ( ( rule__TypeStorageModifier__Alternatives ) )
            {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:768:1: ( ( rule__TypeStorageModifier__Alternatives ) )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:769:1: ( rule__TypeStorageModifier__Alternatives )
            {
             before(grammarAccess.getTypeStorageModifierAccess().getAlternatives()); 
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:770:1: ( rule__TypeStorageModifier__Alternatives )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:770:2: rule__TypeStorageModifier__Alternatives
            {
            pushFollow(FOLLOW_rule__TypeStorageModifier__Alternatives_in_ruleTypeStorageModifier1573);
            rule__TypeStorageModifier__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeStorageModifierAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTypeStorageModifier"


    // $ANTLR start "ruleEntityRelationshipKind"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:782:1: ruleEntityRelationshipKind : ( ( rule__EntityRelationshipKind__Alternatives ) ) ;
    public final void ruleEntityRelationshipKind() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:786:1: ( ( ( rule__EntityRelationshipKind__Alternatives ) ) )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:787:1: ( ( rule__EntityRelationshipKind__Alternatives ) )
            {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:787:1: ( ( rule__EntityRelationshipKind__Alternatives ) )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:788:1: ( rule__EntityRelationshipKind__Alternatives )
            {
             before(grammarAccess.getEntityRelationshipKindAccess().getAlternatives()); 
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:789:1: ( rule__EntityRelationshipKind__Alternatives )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:789:2: rule__EntityRelationshipKind__Alternatives
            {
            pushFollow(FOLLOW_rule__EntityRelationshipKind__Alternatives_in_ruleEntityRelationshipKind1609);
            rule__EntityRelationshipKind__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEntityRelationshipKindAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEntityRelationshipKind"


    // $ANTLR start "rulePropertyStorageModifier"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:801:1: rulePropertyStorageModifier : ( ( rule__PropertyStorageModifier__Alternatives ) ) ;
    public final void rulePropertyStorageModifier() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:805:1: ( ( ( rule__PropertyStorageModifier__Alternatives ) ) )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:806:1: ( ( rule__PropertyStorageModifier__Alternatives ) )
            {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:806:1: ( ( rule__PropertyStorageModifier__Alternatives ) )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:807:1: ( rule__PropertyStorageModifier__Alternatives )
            {
             before(grammarAccess.getPropertyStorageModifierAccess().getAlternatives()); 
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:808:1: ( rule__PropertyStorageModifier__Alternatives )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:808:2: rule__PropertyStorageModifier__Alternatives
            {
            pushFollow(FOLLOW_rule__PropertyStorageModifier__Alternatives_in_rulePropertyStorageModifier1645);
            rule__PropertyStorageModifier__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPropertyStorageModifierAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePropertyStorageModifier"


    // $ANTLR start "rule__NamedType__Alternatives"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:820:1: rule__NamedType__Alternatives : ( ( ruleComplexType ) | ( rulePrimitiveType ) );
    public final void rule__NamedType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:824:1: ( ( ruleComplexType ) | ( rulePrimitiveType ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==29||LA1_0==34) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_ID) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:825:1: ( ruleComplexType )
                    {
                    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:825:1: ( ruleComplexType )
                    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:826:1: ruleComplexType
                    {
                     before(grammarAccess.getNamedTypeAccess().getComplexTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleComplexType_in_rule__NamedType__Alternatives1681);
                    ruleComplexType();

                    state._fsp--;

                     after(grammarAccess.getNamedTypeAccess().getComplexTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:831:6: ( rulePrimitiveType )
                    {
                    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:831:6: ( rulePrimitiveType )
                    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:832:1: rulePrimitiveType
                    {
                     before(grammarAccess.getNamedTypeAccess().getPrimitiveTypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_rulePrimitiveType_in_rule__NamedType__Alternatives1698);
                    rulePrimitiveType();

                    state._fsp--;

                     after(grammarAccess.getNamedTypeAccess().getPrimitiveTypeParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedType__Alternatives"


    // $ANTLR start "rule__DeclarationTypeReference__Alternatives"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:842:1: rule__DeclarationTypeReference__Alternatives : ( ( ruleTypeReference ) | ( ruleCollectionType ) | ( ruleMapType ) );
    public final void rule__DeclarationTypeReference__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:846:1: ( ( ruleTypeReference ) | ( ruleCollectionType ) | ( ruleMapType ) )
            int alt2=3;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case 25:
                    {
                    alt2=2;
                    }
                    break;
                case EOF:
                case RULE_ID:
                    {
                    alt2=1;
                    }
                    break;
                case 27:
                    {
                    alt2=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:847:1: ( ruleTypeReference )
                    {
                    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:847:1: ( ruleTypeReference )
                    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:848:1: ruleTypeReference
                    {
                     before(grammarAccess.getDeclarationTypeReferenceAccess().getTypeReferenceParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleTypeReference_in_rule__DeclarationTypeReference__Alternatives1730);
                    ruleTypeReference();

                    state._fsp--;

                     after(grammarAccess.getDeclarationTypeReferenceAccess().getTypeReferenceParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:853:6: ( ruleCollectionType )
                    {
                    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:853:6: ( ruleCollectionType )
                    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:854:1: ruleCollectionType
                    {
                     before(grammarAccess.getDeclarationTypeReferenceAccess().getCollectionTypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleCollectionType_in_rule__DeclarationTypeReference__Alternatives1747);
                    ruleCollectionType();

                    state._fsp--;

                     after(grammarAccess.getDeclarationTypeReferenceAccess().getCollectionTypeParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:859:6: ( ruleMapType )
                    {
                    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:859:6: ( ruleMapType )
                    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:860:1: ruleMapType
                    {
                     before(grammarAccess.getDeclarationTypeReferenceAccess().getMapTypeParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleMapType_in_rule__DeclarationTypeReference__Alternatives1764);
                    ruleMapType();

                    state._fsp--;

                     after(grammarAccess.getDeclarationTypeReferenceAccess().getMapTypeParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclarationTypeReference__Alternatives"


    // $ANTLR start "rule__ComplexType__Alternatives"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:870:1: rule__ComplexType__Alternatives : ( ( ruleEnumerationType ) | ( ruleEntityType ) );
    public final void rule__ComplexType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:874:1: ( ( ruleEnumerationType ) | ( ruleEntityType ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==29) ) {
                alt3=1;
            }
            else if ( (LA3_0==34) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:875:1: ( ruleEnumerationType )
                    {
                    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:875:1: ( ruleEnumerationType )
                    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:876:1: ruleEnumerationType
                    {
                     before(grammarAccess.getComplexTypeAccess().getEnumerationTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleEnumerationType_in_rule__ComplexType__Alternatives1796);
                    ruleEnumerationType();

                    state._fsp--;

                     after(grammarAccess.getComplexTypeAccess().getEnumerationTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:881:6: ( ruleEntityType )
                    {
                    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:881:6: ( ruleEntityType )
                    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:882:1: ruleEntityType
                    {
                     before(grammarAccess.getComplexTypeAccess().getEntityTypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleEntityType_in_rule__ComplexType__Alternatives1813);
                    ruleEntityType();

                    state._fsp--;

                     after(grammarAccess.getComplexTypeAccess().getEntityTypeParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexType__Alternatives"


    // $ANTLR start "rule__Literal__Alternatives"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:892:1: rule__Literal__Alternatives : ( ( ruleBooleanLiteral ) | ( ruleNumberLiteral ) | ( ruleCharLiteral ) | ( ruleStringLiteral ) | ( rulePropertyReference ) );
    public final void rule__Literal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:896:1: ( ( ruleBooleanLiteral ) | ( ruleNumberLiteral ) | ( ruleCharLiteral ) | ( ruleStringLiteral ) | ( rulePropertyReference ) )
            int alt4=5;
            switch ( input.LA(1) ) {
            case 12:
            case 13:
                {
                alt4=1;
                }
                break;
            case RULE_INT:
            case 14:
            case 15:
                {
                alt4=2;
                }
                break;
            case RULE_CHARACTER:
                {
                alt4=3;
                }
                break;
            case RULE_STRING:
                {
                alt4=4;
                }
                break;
            case RULE_ID:
                {
                alt4=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:897:1: ( ruleBooleanLiteral )
                    {
                    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:897:1: ( ruleBooleanLiteral )
                    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:898:1: ruleBooleanLiteral
                    {
                     before(grammarAccess.getLiteralAccess().getBooleanLiteralParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleBooleanLiteral_in_rule__Literal__Alternatives1845);
                    ruleBooleanLiteral();

                    state._fsp--;

                     after(grammarAccess.getLiteralAccess().getBooleanLiteralParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:903:6: ( ruleNumberLiteral )
                    {
                    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:903:6: ( ruleNumberLiteral )
                    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:904:1: ruleNumberLiteral
                    {
                     before(grammarAccess.getLiteralAccess().getNumberLiteralParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleNumberLiteral_in_rule__Literal__Alternatives1862);
                    ruleNumberLiteral();

                    state._fsp--;

                     after(grammarAccess.getLiteralAccess().getNumberLiteralParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:909:6: ( ruleCharLiteral )
                    {
                    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:909:6: ( ruleCharLiteral )
                    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:910:1: ruleCharLiteral
                    {
                     before(grammarAccess.getLiteralAccess().getCharLiteralParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleCharLiteral_in_rule__Literal__Alternatives1879);
                    ruleCharLiteral();

                    state._fsp--;

                     after(grammarAccess.getLiteralAccess().getCharLiteralParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:915:6: ( ruleStringLiteral )
                    {
                    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:915:6: ( ruleStringLiteral )
                    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:916:1: ruleStringLiteral
                    {
                     before(grammarAccess.getLiteralAccess().getStringLiteralParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleStringLiteral_in_rule__Literal__Alternatives1896);
                    ruleStringLiteral();

                    state._fsp--;

                     after(grammarAccess.getLiteralAccess().getStringLiteralParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:921:6: ( rulePropertyReference )
                    {
                    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:921:6: ( rulePropertyReference )
                    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:922:1: rulePropertyReference
                    {
                     before(grammarAccess.getLiteralAccess().getPropertyReferenceParserRuleCall_4()); 
                    pushFollow(FOLLOW_rulePropertyReference_in_rule__Literal__Alternatives1913);
                    rulePropertyReference();

                    state._fsp--;

                     after(grammarAccess.getLiteralAccess().getPropertyReferenceParserRuleCall_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Alternatives"


    // $ANTLR start "rule__BOOLEAN__Alternatives"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:932:1: rule__BOOLEAN__Alternatives : ( ( 'true' ) | ( 'false' ) );
    public final void rule__BOOLEAN__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:936:1: ( ( 'true' ) | ( 'false' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==12) ) {
                alt5=1;
            }
            else if ( (LA5_0==13) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:937:1: ( 'true' )
                    {
                    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:937:1: ( 'true' )
                    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:938:1: 'true'
                    {
                     before(grammarAccess.getBOOLEANAccess().getTrueKeyword_0()); 
                    match(input,12,FOLLOW_12_in_rule__BOOLEAN__Alternatives1946); 
                     after(grammarAccess.getBOOLEANAccess().getTrueKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:945:6: ( 'false' )
                    {
                    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:945:6: ( 'false' )
                    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:946:1: 'false'
                    {
                     before(grammarAccess.getBOOLEANAccess().getFalseKeyword_1()); 
                    match(input,13,FOLLOW_13_in_rule__BOOLEAN__Alternatives1966); 
                     after(grammarAccess.getBOOLEANAccess().getFalseKeyword_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOOLEAN__Alternatives"


    // $ANTLR start "rule__NUMBER__Alternatives"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:958:1: rule__NUMBER__Alternatives : ( ( ( rule__NUMBER__Group_0__0 ) ) | ( ( rule__NUMBER__Group_1__0 ) ) );
    public final void rule__NUMBER__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:962:1: ( ( ( rule__NUMBER__Group_0__0 ) ) | ( ( rule__NUMBER__Group_1__0 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=14 && LA6_0<=15)) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_INT) ) {
                int LA6_2 = input.LA(2);

                if ( (LA6_2==38) ) {
                    alt6=2;
                }
                else if ( (LA6_2==EOF||LA6_2==RULE_ID||(LA6_2>=20 && LA6_2<=22)||LA6_2==31) ) {
                    alt6=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 2, input);

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
                    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:963:1: ( ( rule__NUMBER__Group_0__0 ) )
                    {
                    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:963:1: ( ( rule__NUMBER__Group_0__0 ) )
                    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:964:1: ( rule__NUMBER__Group_0__0 )
                    {
                     before(grammarAccess.getNUMBERAccess().getGroup_0()); 
                    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:965:1: ( rule__NUMBER__Group_0__0 )
                    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:965:2: rule__NUMBER__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__NUMBER__Group_0__0_in_rule__NUMBER__Alternatives2000);
                    rule__NUMBER__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNUMBERAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:969:6: ( ( rule__NUMBER__Group_1__0 ) )
                    {
                    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:969:6: ( ( rule__NUMBER__Group_1__0 ) )
                    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:970:1: ( rule__NUMBER__Group_1__0 )
                    {
                     before(grammarAccess.getNUMBERAccess().getGroup_1()); 
                    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:971:1: ( rule__NUMBER__Group_1__0 )
                    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:971:2: rule__NUMBER__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__NUMBER__Group_1__0_in_rule__NUMBER__Alternatives2018);
                    rule__NUMBER__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNUMBERAccess().getGroup_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NUMBER__Alternatives"


    // $ANTLR start "rule__NUMBER__Alternatives_0_0"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:980:1: rule__NUMBER__Alternatives_0_0 : ( ( '+' ) | ( '-' ) );
    public final void rule__NUMBER__Alternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:984:1: ( ( '+' ) | ( '-' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==14) ) {
                alt7=1;
            }
            else if ( (LA7_0==15) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:985:1: ( '+' )
                    {
                    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:985:1: ( '+' )
                    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:986:1: '+'
                    {
                     before(grammarAccess.getNUMBERAccess().getPlusSignKeyword_0_0_0()); 
                    match(input,14,FOLLOW_14_in_rule__NUMBER__Alternatives_0_02052); 
                     after(grammarAccess.getNUMBERAccess().getPlusSignKeyword_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:993:6: ( '-' )
                    {
                    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:993:6: ( '-' )
                    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:994:1: '-'
                    {
                     before(grammarAccess.getNUMBERAccess().getHyphenMinusKeyword_0_0_1()); 
                    match(input,15,FOLLOW_15_in_rule__NUMBER__Alternatives_0_02072); 
                     after(grammarAccess.getNUMBERAccess().getHyphenMinusKeyword_0_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NUMBER__Alternatives_0_0"


    // $ANTLR start "rule__TypeStorageModifier__Alternatives"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1006:1: rule__TypeStorageModifier__Alternatives : ( ( ( ' storable' ) ) | ( ( 'embeddable' ) ) );
    public final void rule__TypeStorageModifier__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1010:1: ( ( ( ' storable' ) ) | ( ( 'embeddable' ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==16) ) {
                alt8=1;
            }
            else if ( (LA8_0==17) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1011:1: ( ( ' storable' ) )
                    {
                    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1011:1: ( ( ' storable' ) )
                    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1012:1: ( ' storable' )
                    {
                     before(grammarAccess.getTypeStorageModifierAccess().getSTORABLEEnumLiteralDeclaration_0()); 
                    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1013:1: ( ' storable' )
                    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1013:3: ' storable'
                    {
                    match(input,16,FOLLOW_16_in_rule__TypeStorageModifier__Alternatives2107); 

                    }

                     after(grammarAccess.getTypeStorageModifierAccess().getSTORABLEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1018:6: ( ( 'embeddable' ) )
                    {
                    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1018:6: ( ( 'embeddable' ) )
                    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1019:1: ( 'embeddable' )
                    {
                     before(grammarAccess.getTypeStorageModifierAccess().getEMBEDDABLEEnumLiteralDeclaration_1()); 
                    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1020:1: ( 'embeddable' )
                    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1020:3: 'embeddable'
                    {
                    match(input,17,FOLLOW_17_in_rule__TypeStorageModifier__Alternatives2128); 

                    }

                     after(grammarAccess.getTypeStorageModifierAccess().getEMBEDDABLEEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeStorageModifier__Alternatives"


    // $ANTLR start "rule__EntityRelationshipKind__Alternatives"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1030:1: rule__EntityRelationshipKind__Alternatives : ( ( ( 'unique' ) ) | ( ( 'many' ) ) );
    public final void rule__EntityRelationshipKind__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1034:1: ( ( ( 'unique' ) ) | ( ( 'many' ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==18) ) {
                alt9=1;
            }
            else if ( (LA9_0==19) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1035:1: ( ( 'unique' ) )
                    {
                    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1035:1: ( ( 'unique' ) )
                    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1036:1: ( 'unique' )
                    {
                     before(grammarAccess.getEntityRelationshipKindAccess().getUNIQUEEnumLiteralDeclaration_0()); 
                    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1037:1: ( 'unique' )
                    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1037:3: 'unique'
                    {
                    match(input,18,FOLLOW_18_in_rule__EntityRelationshipKind__Alternatives2164); 

                    }

                     after(grammarAccess.getEntityRelationshipKindAccess().getUNIQUEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1042:6: ( ( 'many' ) )
                    {
                    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1042:6: ( ( 'many' ) )
                    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1043:1: ( 'many' )
                    {
                     before(grammarAccess.getEntityRelationshipKindAccess().getMANYEnumLiteralDeclaration_1()); 
                    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1044:1: ( 'many' )
                    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1044:3: 'many'
                    {
                    match(input,19,FOLLOW_19_in_rule__EntityRelationshipKind__Alternatives2185); 

                    }

                     after(grammarAccess.getEntityRelationshipKindAccess().getMANYEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityRelationshipKind__Alternatives"


    // $ANTLR start "rule__PropertyStorageModifier__Alternatives"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1054:1: rule__PropertyStorageModifier__Alternatives : ( ( ( 'var' ) ) | ( ( 'val' ) ) | ( ( 'transient' ) ) );
    public final void rule__PropertyStorageModifier__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1058:1: ( ( ( 'var' ) ) | ( ( 'val' ) ) | ( ( 'transient' ) ) )
            int alt10=3;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt10=1;
                }
                break;
            case 21:
                {
                alt10=2;
                }
                break;
            case 22:
                {
                alt10=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1059:1: ( ( 'var' ) )
                    {
                    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1059:1: ( ( 'var' ) )
                    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1060:1: ( 'var' )
                    {
                     before(grammarAccess.getPropertyStorageModifierAccess().getVARIABLEEnumLiteralDeclaration_0()); 
                    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1061:1: ( 'var' )
                    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1061:3: 'var'
                    {
                    match(input,20,FOLLOW_20_in_rule__PropertyStorageModifier__Alternatives2221); 

                    }

                     after(grammarAccess.getPropertyStorageModifierAccess().getVARIABLEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1066:6: ( ( 'val' ) )
                    {
                    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1066:6: ( ( 'val' ) )
                    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1067:1: ( 'val' )
                    {
                     before(grammarAccess.getPropertyStorageModifierAccess().getVALUEEnumLiteralDeclaration_1()); 
                    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1068:1: ( 'val' )
                    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1068:3: 'val'
                    {
                    match(input,21,FOLLOW_21_in_rule__PropertyStorageModifier__Alternatives2242); 

                    }

                     after(grammarAccess.getPropertyStorageModifierAccess().getVALUEEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1073:6: ( ( 'transient' ) )
                    {
                    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1073:6: ( ( 'transient' ) )
                    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1074:1: ( 'transient' )
                    {
                     before(grammarAccess.getPropertyStorageModifierAccess().getTRANSIENTEnumLiteralDeclaration_2()); 
                    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1075:1: ( 'transient' )
                    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1075:3: 'transient'
                    {
                    match(input,22,FOLLOW_22_in_rule__PropertyStorageModifier__Alternatives2263); 

                    }

                     after(grammarAccess.getPropertyStorageModifierAccess().getTRANSIENTEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyStorageModifier__Alternatives"


    // $ANTLR start "rule__Model__Group__0"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1087:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1091:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1092:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__02296);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__1_in_rule__Model__Group__02299);
            rule__Model__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1099:1: rule__Model__Group__0__Impl : ( 'package' ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1103:1: ( ( 'package' ) )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1104:1: ( 'package' )
            {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1104:1: ( 'package' )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1105:1: 'package'
            {
             before(grammarAccess.getModelAccess().getPackageKeyword_0()); 
            match(input,23,FOLLOW_23_in_rule__Model__Group__0__Impl2327); 
             after(grammarAccess.getModelAccess().getPackageKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1118:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1122:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1123:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__12358);
            rule__Model__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__2_in_rule__Model__Group__12361);
            rule__Model__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1130:1: rule__Model__Group__1__Impl : ( ( rule__Model__NameAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1134:1: ( ( ( rule__Model__NameAssignment_1 ) ) )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1135:1: ( ( rule__Model__NameAssignment_1 ) )
            {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1135:1: ( ( rule__Model__NameAssignment_1 ) )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1136:1: ( rule__Model__NameAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getNameAssignment_1()); 
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1137:1: ( rule__Model__NameAssignment_1 )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1137:2: rule__Model__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Model__NameAssignment_1_in_rule__Model__Group__1__Impl2388);
            rule__Model__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__Model__Group__2"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1147:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1151:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1152:2: rule__Model__Group__2__Impl rule__Model__Group__3
            {
            pushFollow(FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__22418);
            rule__Model__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__3_in_rule__Model__Group__22421);
            rule__Model__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2"


    // $ANTLR start "rule__Model__Group__2__Impl"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1159:1: rule__Model__Group__2__Impl : ( ( rule__Model__ImportsAssignment_2 )* ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1163:1: ( ( ( rule__Model__ImportsAssignment_2 )* ) )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1164:1: ( ( rule__Model__ImportsAssignment_2 )* )
            {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1164:1: ( ( rule__Model__ImportsAssignment_2 )* )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1165:1: ( rule__Model__ImportsAssignment_2 )*
            {
             before(grammarAccess.getModelAccess().getImportsAssignment_2()); 
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1166:1: ( rule__Model__ImportsAssignment_2 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==24) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1166:2: rule__Model__ImportsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Model__ImportsAssignment_2_in_rule__Model__Group__2__Impl2448);
            	    rule__Model__ImportsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getImportsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2__Impl"


    // $ANTLR start "rule__Model__Group__3"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1176:1: rule__Model__Group__3 : rule__Model__Group__3__Impl ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1180:1: ( rule__Model__Group__3__Impl )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1181:2: rule__Model__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group__3__Impl_in_rule__Model__Group__32479);
            rule__Model__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__3"


    // $ANTLR start "rule__Model__Group__3__Impl"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1187:1: rule__Model__Group__3__Impl : ( ( rule__Model__TypesAssignment_3 )* ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1191:1: ( ( ( rule__Model__TypesAssignment_3 )* ) )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1192:1: ( ( rule__Model__TypesAssignment_3 )* )
            {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1192:1: ( ( rule__Model__TypesAssignment_3 )* )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1193:1: ( rule__Model__TypesAssignment_3 )*
            {
             before(grammarAccess.getModelAccess().getTypesAssignment_3()); 
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1194:1: ( rule__Model__TypesAssignment_3 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==29||LA12_0==34) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1194:2: rule__Model__TypesAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Model__TypesAssignment_3_in_rule__Model__Group__3__Impl2506);
            	    rule__Model__TypesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getTypesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__3__Impl"


    // $ANTLR start "rule__Import__Group__0"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1212:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1216:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1217:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__02545);
            rule__Import__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Import__Group__1_in_rule__Import__Group__02548);
            rule__Import__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__0"


    // $ANTLR start "rule__Import__Group__0__Impl"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1224:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1228:1: ( ( 'import' ) )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1229:1: ( 'import' )
            {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1229:1: ( 'import' )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1230:1: 'import'
            {
             before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            match(input,24,FOLLOW_24_in_rule__Import__Group__0__Impl2576); 
             after(grammarAccess.getImportAccess().getImportKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__0__Impl"


    // $ANTLR start "rule__Import__Group__1"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1243:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1247:1: ( rule__Import__Group__1__Impl )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1248:2: rule__Import__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__12607);
            rule__Import__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__1"


    // $ANTLR start "rule__Import__Group__1__Impl"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1254:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1258:1: ( ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1259:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1259:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1260:1: ( rule__Import__ImportedNamespaceAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1261:1: ( rule__Import__ImportedNamespaceAssignment_1 )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1261:2: rule__Import__ImportedNamespaceAssignment_1
            {
            pushFollow(FOLLOW_rule__Import__ImportedNamespaceAssignment_1_in_rule__Import__Group__1__Impl2634);
            rule__Import__ImportedNamespaceAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__1__Impl"


    // $ANTLR start "rule__CollectionType__Group__0"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1275:1: rule__CollectionType__Group__0 : rule__CollectionType__Group__0__Impl rule__CollectionType__Group__1 ;
    public final void rule__CollectionType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1279:1: ( rule__CollectionType__Group__0__Impl rule__CollectionType__Group__1 )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1280:2: rule__CollectionType__Group__0__Impl rule__CollectionType__Group__1
            {
            pushFollow(FOLLOW_rule__CollectionType__Group__0__Impl_in_rule__CollectionType__Group__02668);
            rule__CollectionType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CollectionType__Group__1_in_rule__CollectionType__Group__02671);
            rule__CollectionType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollectionType__Group__0"


    // $ANTLR start "rule__CollectionType__Group__0__Impl"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1287:1: rule__CollectionType__Group__0__Impl : ( ( rule__CollectionType__ReferenceAssignment_0 ) ) ;
    public final void rule__CollectionType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1291:1: ( ( ( rule__CollectionType__ReferenceAssignment_0 ) ) )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1292:1: ( ( rule__CollectionType__ReferenceAssignment_0 ) )
            {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1292:1: ( ( rule__CollectionType__ReferenceAssignment_0 ) )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1293:1: ( rule__CollectionType__ReferenceAssignment_0 )
            {
             before(grammarAccess.getCollectionTypeAccess().getReferenceAssignment_0()); 
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1294:1: ( rule__CollectionType__ReferenceAssignment_0 )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1294:2: rule__CollectionType__ReferenceAssignment_0
            {
            pushFollow(FOLLOW_rule__CollectionType__ReferenceAssignment_0_in_rule__CollectionType__Group__0__Impl2698);
            rule__CollectionType__ReferenceAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getCollectionTypeAccess().getReferenceAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollectionType__Group__0__Impl"


    // $ANTLR start "rule__CollectionType__Group__1"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1304:1: rule__CollectionType__Group__1 : rule__CollectionType__Group__1__Impl rule__CollectionType__Group__2 ;
    public final void rule__CollectionType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1308:1: ( rule__CollectionType__Group__1__Impl rule__CollectionType__Group__2 )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1309:2: rule__CollectionType__Group__1__Impl rule__CollectionType__Group__2
            {
            pushFollow(FOLLOW_rule__CollectionType__Group__1__Impl_in_rule__CollectionType__Group__12728);
            rule__CollectionType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CollectionType__Group__2_in_rule__CollectionType__Group__12731);
            rule__CollectionType__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollectionType__Group__1"


    // $ANTLR start "rule__CollectionType__Group__1__Impl"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1316:1: rule__CollectionType__Group__1__Impl : ( '[' ) ;
    public final void rule__CollectionType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1320:1: ( ( '[' ) )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1321:1: ( '[' )
            {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1321:1: ( '[' )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1322:1: '['
            {
             before(grammarAccess.getCollectionTypeAccess().getLeftSquareBracketKeyword_1()); 
            match(input,25,FOLLOW_25_in_rule__CollectionType__Group__1__Impl2759); 
             after(grammarAccess.getCollectionTypeAccess().getLeftSquareBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollectionType__Group__1__Impl"


    // $ANTLR start "rule__CollectionType__Group__2"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1335:1: rule__CollectionType__Group__2 : rule__CollectionType__Group__2__Impl rule__CollectionType__Group__3 ;
    public final void rule__CollectionType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1339:1: ( rule__CollectionType__Group__2__Impl rule__CollectionType__Group__3 )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1340:2: rule__CollectionType__Group__2__Impl rule__CollectionType__Group__3
            {
            pushFollow(FOLLOW_rule__CollectionType__Group__2__Impl_in_rule__CollectionType__Group__22790);
            rule__CollectionType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CollectionType__Group__3_in_rule__CollectionType__Group__22793);
            rule__CollectionType__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollectionType__Group__2"


    // $ANTLR start "rule__CollectionType__Group__2__Impl"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1347:1: rule__CollectionType__Group__2__Impl : ( ( rule__CollectionType__SizeAssignment_2 )? ) ;
    public final void rule__CollectionType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1351:1: ( ( ( rule__CollectionType__SizeAssignment_2 )? ) )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1352:1: ( ( rule__CollectionType__SizeAssignment_2 )? )
            {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1352:1: ( ( rule__CollectionType__SizeAssignment_2 )? )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1353:1: ( rule__CollectionType__SizeAssignment_2 )?
            {
             before(grammarAccess.getCollectionTypeAccess().getSizeAssignment_2()); 
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1354:1: ( rule__CollectionType__SizeAssignment_2 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_INT) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1354:2: rule__CollectionType__SizeAssignment_2
                    {
                    pushFollow(FOLLOW_rule__CollectionType__SizeAssignment_2_in_rule__CollectionType__Group__2__Impl2820);
                    rule__CollectionType__SizeAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCollectionTypeAccess().getSizeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollectionType__Group__2__Impl"


    // $ANTLR start "rule__CollectionType__Group__3"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1364:1: rule__CollectionType__Group__3 : rule__CollectionType__Group__3__Impl ;
    public final void rule__CollectionType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1368:1: ( rule__CollectionType__Group__3__Impl )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1369:2: rule__CollectionType__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__CollectionType__Group__3__Impl_in_rule__CollectionType__Group__32851);
            rule__CollectionType__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollectionType__Group__3"


    // $ANTLR start "rule__CollectionType__Group__3__Impl"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1375:1: rule__CollectionType__Group__3__Impl : ( ']' ) ;
    public final void rule__CollectionType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1379:1: ( ( ']' ) )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1380:1: ( ']' )
            {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1380:1: ( ']' )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1381:1: ']'
            {
             before(grammarAccess.getCollectionTypeAccess().getRightSquareBracketKeyword_3()); 
            match(input,26,FOLLOW_26_in_rule__CollectionType__Group__3__Impl2879); 
             after(grammarAccess.getCollectionTypeAccess().getRightSquareBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollectionType__Group__3__Impl"


    // $ANTLR start "rule__MapType__Group__0"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1402:1: rule__MapType__Group__0 : rule__MapType__Group__0__Impl rule__MapType__Group__1 ;
    public final void rule__MapType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1406:1: ( rule__MapType__Group__0__Impl rule__MapType__Group__1 )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1407:2: rule__MapType__Group__0__Impl rule__MapType__Group__1
            {
            pushFollow(FOLLOW_rule__MapType__Group__0__Impl_in_rule__MapType__Group__02918);
            rule__MapType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MapType__Group__1_in_rule__MapType__Group__02921);
            rule__MapType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapType__Group__0"


    // $ANTLR start "rule__MapType__Group__0__Impl"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1414:1: rule__MapType__Group__0__Impl : ( ( rule__MapType__ReferenceAssignment_0 ) ) ;
    public final void rule__MapType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1418:1: ( ( ( rule__MapType__ReferenceAssignment_0 ) ) )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1419:1: ( ( rule__MapType__ReferenceAssignment_0 ) )
            {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1419:1: ( ( rule__MapType__ReferenceAssignment_0 ) )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1420:1: ( rule__MapType__ReferenceAssignment_0 )
            {
             before(grammarAccess.getMapTypeAccess().getReferenceAssignment_0()); 
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1421:1: ( rule__MapType__ReferenceAssignment_0 )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1421:2: rule__MapType__ReferenceAssignment_0
            {
            pushFollow(FOLLOW_rule__MapType__ReferenceAssignment_0_in_rule__MapType__Group__0__Impl2948);
            rule__MapType__ReferenceAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getMapTypeAccess().getReferenceAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapType__Group__0__Impl"


    // $ANTLR start "rule__MapType__Group__1"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1431:1: rule__MapType__Group__1 : rule__MapType__Group__1__Impl rule__MapType__Group__2 ;
    public final void rule__MapType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1435:1: ( rule__MapType__Group__1__Impl rule__MapType__Group__2 )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1436:2: rule__MapType__Group__1__Impl rule__MapType__Group__2
            {
            pushFollow(FOLLOW_rule__MapType__Group__1__Impl_in_rule__MapType__Group__12978);
            rule__MapType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MapType__Group__2_in_rule__MapType__Group__12981);
            rule__MapType__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapType__Group__1"


    // $ANTLR start "rule__MapType__Group__1__Impl"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1443:1: rule__MapType__Group__1__Impl : ( '<' ) ;
    public final void rule__MapType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1447:1: ( ( '<' ) )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1448:1: ( '<' )
            {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1448:1: ( '<' )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1449:1: '<'
            {
             before(grammarAccess.getMapTypeAccess().getLessThanSignKeyword_1()); 
            match(input,27,FOLLOW_27_in_rule__MapType__Group__1__Impl3009); 
             after(grammarAccess.getMapTypeAccess().getLessThanSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapType__Group__1__Impl"


    // $ANTLR start "rule__MapType__Group__2"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1462:1: rule__MapType__Group__2 : rule__MapType__Group__2__Impl rule__MapType__Group__3 ;
    public final void rule__MapType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1466:1: ( rule__MapType__Group__2__Impl rule__MapType__Group__3 )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1467:2: rule__MapType__Group__2__Impl rule__MapType__Group__3
            {
            pushFollow(FOLLOW_rule__MapType__Group__2__Impl_in_rule__MapType__Group__23040);
            rule__MapType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MapType__Group__3_in_rule__MapType__Group__23043);
            rule__MapType__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapType__Group__2"


    // $ANTLR start "rule__MapType__Group__2__Impl"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1474:1: rule__MapType__Group__2__Impl : ( ( rule__MapType__Group_2__0 ) ) ;
    public final void rule__MapType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1478:1: ( ( ( rule__MapType__Group_2__0 ) ) )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1479:1: ( ( rule__MapType__Group_2__0 ) )
            {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1479:1: ( ( rule__MapType__Group_2__0 ) )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1480:1: ( rule__MapType__Group_2__0 )
            {
             before(grammarAccess.getMapTypeAccess().getGroup_2()); 
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1481:1: ( rule__MapType__Group_2__0 )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1481:2: rule__MapType__Group_2__0
            {
            pushFollow(FOLLOW_rule__MapType__Group_2__0_in_rule__MapType__Group__2__Impl3070);
            rule__MapType__Group_2__0();

            state._fsp--;


            }

             after(grammarAccess.getMapTypeAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapType__Group__2__Impl"


    // $ANTLR start "rule__MapType__Group__3"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1491:1: rule__MapType__Group__3 : rule__MapType__Group__3__Impl rule__MapType__Group__4 ;
    public final void rule__MapType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1495:1: ( rule__MapType__Group__3__Impl rule__MapType__Group__4 )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1496:2: rule__MapType__Group__3__Impl rule__MapType__Group__4
            {
            pushFollow(FOLLOW_rule__MapType__Group__3__Impl_in_rule__MapType__Group__33100);
            rule__MapType__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MapType__Group__4_in_rule__MapType__Group__33103);
            rule__MapType__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapType__Group__3"


    // $ANTLR start "rule__MapType__Group__3__Impl"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1503:1: rule__MapType__Group__3__Impl : ( '[' ) ;
    public final void rule__MapType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1507:1: ( ( '[' ) )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1508:1: ( '[' )
            {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1508:1: ( '[' )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1509:1: '['
            {
             before(grammarAccess.getMapTypeAccess().getLeftSquareBracketKeyword_3()); 
            match(input,25,FOLLOW_25_in_rule__MapType__Group__3__Impl3131); 
             after(grammarAccess.getMapTypeAccess().getLeftSquareBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapType__Group__3__Impl"


    // $ANTLR start "rule__MapType__Group__4"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1522:1: rule__MapType__Group__4 : rule__MapType__Group__4__Impl rule__MapType__Group__5 ;
    public final void rule__MapType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1526:1: ( rule__MapType__Group__4__Impl rule__MapType__Group__5 )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1527:2: rule__MapType__Group__4__Impl rule__MapType__Group__5
            {
            pushFollow(FOLLOW_rule__MapType__Group__4__Impl_in_rule__MapType__Group__43162);
            rule__MapType__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MapType__Group__5_in_rule__MapType__Group__43165);
            rule__MapType__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapType__Group__4"


    // $ANTLR start "rule__MapType__Group__4__Impl"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1534:1: rule__MapType__Group__4__Impl : ( ( rule__MapType__SizeAssignment_4 )? ) ;
    public final void rule__MapType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1538:1: ( ( ( rule__MapType__SizeAssignment_4 )? ) )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1539:1: ( ( rule__MapType__SizeAssignment_4 )? )
            {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1539:1: ( ( rule__MapType__SizeAssignment_4 )? )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1540:1: ( rule__MapType__SizeAssignment_4 )?
            {
             before(grammarAccess.getMapTypeAccess().getSizeAssignment_4()); 
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1541:1: ( rule__MapType__SizeAssignment_4 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_INT) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1541:2: rule__MapType__SizeAssignment_4
                    {
                    pushFollow(FOLLOW_rule__MapType__SizeAssignment_4_in_rule__MapType__Group__4__Impl3192);
                    rule__MapType__SizeAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMapTypeAccess().getSizeAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapType__Group__4__Impl"


    // $ANTLR start "rule__MapType__Group__5"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1551:1: rule__MapType__Group__5 : rule__MapType__Group__5__Impl ;
    public final void rule__MapType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1555:1: ( rule__MapType__Group__5__Impl )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1556:2: rule__MapType__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__MapType__Group__5__Impl_in_rule__MapType__Group__53223);
            rule__MapType__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapType__Group__5"


    // $ANTLR start "rule__MapType__Group__5__Impl"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1562:1: rule__MapType__Group__5__Impl : ( ']' ) ;
    public final void rule__MapType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1566:1: ( ( ']' ) )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1567:1: ( ']' )
            {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1567:1: ( ']' )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1568:1: ']'
            {
             before(grammarAccess.getMapTypeAccess().getRightSquareBracketKeyword_5()); 
            match(input,26,FOLLOW_26_in_rule__MapType__Group__5__Impl3251); 
             after(grammarAccess.getMapTypeAccess().getRightSquareBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapType__Group__5__Impl"


    // $ANTLR start "rule__MapType__Group_2__0"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1593:1: rule__MapType__Group_2__0 : rule__MapType__Group_2__0__Impl rule__MapType__Group_2__1 ;
    public final void rule__MapType__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1597:1: ( rule__MapType__Group_2__0__Impl rule__MapType__Group_2__1 )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1598:2: rule__MapType__Group_2__0__Impl rule__MapType__Group_2__1
            {
            pushFollow(FOLLOW_rule__MapType__Group_2__0__Impl_in_rule__MapType__Group_2__03294);
            rule__MapType__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MapType__Group_2__1_in_rule__MapType__Group_2__03297);
            rule__MapType__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapType__Group_2__0"


    // $ANTLR start "rule__MapType__Group_2__0__Impl"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1605:1: rule__MapType__Group_2__0__Impl : ( ( rule__MapType__MapTypeAssignment_2_0 ) ) ;
    public final void rule__MapType__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1609:1: ( ( ( rule__MapType__MapTypeAssignment_2_0 ) ) )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1610:1: ( ( rule__MapType__MapTypeAssignment_2_0 ) )
            {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1610:1: ( ( rule__MapType__MapTypeAssignment_2_0 ) )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1611:1: ( rule__MapType__MapTypeAssignment_2_0 )
            {
             before(grammarAccess.getMapTypeAccess().getMapTypeAssignment_2_0()); 
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1612:1: ( rule__MapType__MapTypeAssignment_2_0 )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1612:2: rule__MapType__MapTypeAssignment_2_0
            {
            pushFollow(FOLLOW_rule__MapType__MapTypeAssignment_2_0_in_rule__MapType__Group_2__0__Impl3324);
            rule__MapType__MapTypeAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getMapTypeAccess().getMapTypeAssignment_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapType__Group_2__0__Impl"


    // $ANTLR start "rule__MapType__Group_2__1"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1622:1: rule__MapType__Group_2__1 : rule__MapType__Group_2__1__Impl ;
    public final void rule__MapType__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1626:1: ( rule__MapType__Group_2__1__Impl )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1627:2: rule__MapType__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__MapType__Group_2__1__Impl_in_rule__MapType__Group_2__13354);
            rule__MapType__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapType__Group_2__1"


    // $ANTLR start "rule__MapType__Group_2__1__Impl"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1633:1: rule__MapType__Group_2__1__Impl : ( '>' ) ;
    public final void rule__MapType__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1637:1: ( ( '>' ) )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1638:1: ( '>' )
            {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1638:1: ( '>' )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1639:1: '>'
            {
             before(grammarAccess.getMapTypeAccess().getGreaterThanSignKeyword_2_1()); 
            match(input,28,FOLLOW_28_in_rule__MapType__Group_2__1__Impl3382); 
             after(grammarAccess.getMapTypeAccess().getGreaterThanSignKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapType__Group_2__1__Impl"


    // $ANTLR start "rule__EnumerationType__Group__0"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1656:1: rule__EnumerationType__Group__0 : rule__EnumerationType__Group__0__Impl rule__EnumerationType__Group__1 ;
    public final void rule__EnumerationType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1660:1: ( rule__EnumerationType__Group__0__Impl rule__EnumerationType__Group__1 )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1661:2: rule__EnumerationType__Group__0__Impl rule__EnumerationType__Group__1
            {
            pushFollow(FOLLOW_rule__EnumerationType__Group__0__Impl_in_rule__EnumerationType__Group__03417);
            rule__EnumerationType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumerationType__Group__1_in_rule__EnumerationType__Group__03420);
            rule__EnumerationType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationType__Group__0"


    // $ANTLR start "rule__EnumerationType__Group__0__Impl"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1668:1: rule__EnumerationType__Group__0__Impl : ( 'enum' ) ;
    public final void rule__EnumerationType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1672:1: ( ( 'enum' ) )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1673:1: ( 'enum' )
            {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1673:1: ( 'enum' )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1674:1: 'enum'
            {
             before(grammarAccess.getEnumerationTypeAccess().getEnumKeyword_0()); 
            match(input,29,FOLLOW_29_in_rule__EnumerationType__Group__0__Impl3448); 
             after(grammarAccess.getEnumerationTypeAccess().getEnumKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationType__Group__0__Impl"


    // $ANTLR start "rule__EnumerationType__Group__1"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1687:1: rule__EnumerationType__Group__1 : rule__EnumerationType__Group__1__Impl rule__EnumerationType__Group__2 ;
    public final void rule__EnumerationType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1691:1: ( rule__EnumerationType__Group__1__Impl rule__EnumerationType__Group__2 )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1692:2: rule__EnumerationType__Group__1__Impl rule__EnumerationType__Group__2
            {
            pushFollow(FOLLOW_rule__EnumerationType__Group__1__Impl_in_rule__EnumerationType__Group__13479);
            rule__EnumerationType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumerationType__Group__2_in_rule__EnumerationType__Group__13482);
            rule__EnumerationType__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationType__Group__1"


    // $ANTLR start "rule__EnumerationType__Group__1__Impl"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1699:1: rule__EnumerationType__Group__1__Impl : ( ( rule__EnumerationType__NameAssignment_1 ) ) ;
    public final void rule__EnumerationType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1703:1: ( ( ( rule__EnumerationType__NameAssignment_1 ) ) )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1704:1: ( ( rule__EnumerationType__NameAssignment_1 ) )
            {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1704:1: ( ( rule__EnumerationType__NameAssignment_1 ) )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1705:1: ( rule__EnumerationType__NameAssignment_1 )
            {
             before(grammarAccess.getEnumerationTypeAccess().getNameAssignment_1()); 
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1706:1: ( rule__EnumerationType__NameAssignment_1 )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1706:2: rule__EnumerationType__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__EnumerationType__NameAssignment_1_in_rule__EnumerationType__Group__1__Impl3509);
            rule__EnumerationType__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEnumerationTypeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationType__Group__1__Impl"


    // $ANTLR start "rule__EnumerationType__Group__2"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1716:1: rule__EnumerationType__Group__2 : rule__EnumerationType__Group__2__Impl rule__EnumerationType__Group__3 ;
    public final void rule__EnumerationType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1720:1: ( rule__EnumerationType__Group__2__Impl rule__EnumerationType__Group__3 )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1721:2: rule__EnumerationType__Group__2__Impl rule__EnumerationType__Group__3
            {
            pushFollow(FOLLOW_rule__EnumerationType__Group__2__Impl_in_rule__EnumerationType__Group__23539);
            rule__EnumerationType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumerationType__Group__3_in_rule__EnumerationType__Group__23542);
            rule__EnumerationType__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationType__Group__2"


    // $ANTLR start "rule__EnumerationType__Group__2__Impl"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1728:1: rule__EnumerationType__Group__2__Impl : ( ( rule__EnumerationType__Group_2__0 )? ) ;
    public final void rule__EnumerationType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1732:1: ( ( ( rule__EnumerationType__Group_2__0 )? ) )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1733:1: ( ( rule__EnumerationType__Group_2__0 )? )
            {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1733:1: ( ( rule__EnumerationType__Group_2__0 )? )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1734:1: ( rule__EnumerationType__Group_2__0 )?
            {
             before(grammarAccess.getEnumerationTypeAccess().getGroup_2()); 
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1735:1: ( rule__EnumerationType__Group_2__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==32) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1735:2: rule__EnumerationType__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__EnumerationType__Group_2__0_in_rule__EnumerationType__Group__2__Impl3569);
                    rule__EnumerationType__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEnumerationTypeAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationType__Group__2__Impl"


    // $ANTLR start "rule__EnumerationType__Group__3"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1745:1: rule__EnumerationType__Group__3 : rule__EnumerationType__Group__3__Impl rule__EnumerationType__Group__4 ;
    public final void rule__EnumerationType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1749:1: ( rule__EnumerationType__Group__3__Impl rule__EnumerationType__Group__4 )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1750:2: rule__EnumerationType__Group__3__Impl rule__EnumerationType__Group__4
            {
            pushFollow(FOLLOW_rule__EnumerationType__Group__3__Impl_in_rule__EnumerationType__Group__33600);
            rule__EnumerationType__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumerationType__Group__4_in_rule__EnumerationType__Group__33603);
            rule__EnumerationType__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationType__Group__3"


    // $ANTLR start "rule__EnumerationType__Group__3__Impl"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1757:1: rule__EnumerationType__Group__3__Impl : ( '{' ) ;
    public final void rule__EnumerationType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1761:1: ( ( '{' ) )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1762:1: ( '{' )
            {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1762:1: ( '{' )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1763:1: '{'
            {
             before(grammarAccess.getEnumerationTypeAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,30,FOLLOW_30_in_rule__EnumerationType__Group__3__Impl3631); 
             after(grammarAccess.getEnumerationTypeAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationType__Group__3__Impl"


    // $ANTLR start "rule__EnumerationType__Group__4"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1776:1: rule__EnumerationType__Group__4 : rule__EnumerationType__Group__4__Impl rule__EnumerationType__Group__5 ;
    public final void rule__EnumerationType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1780:1: ( rule__EnumerationType__Group__4__Impl rule__EnumerationType__Group__5 )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1781:2: rule__EnumerationType__Group__4__Impl rule__EnumerationType__Group__5
            {
            pushFollow(FOLLOW_rule__EnumerationType__Group__4__Impl_in_rule__EnumerationType__Group__43662);
            rule__EnumerationType__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumerationType__Group__5_in_rule__EnumerationType__Group__43665);
            rule__EnumerationType__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationType__Group__4"


    // $ANTLR start "rule__EnumerationType__Group__4__Impl"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1788:1: rule__EnumerationType__Group__4__Impl : ( ( rule__EnumerationType__LiteralsAssignment_4 ) ) ;
    public final void rule__EnumerationType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1792:1: ( ( ( rule__EnumerationType__LiteralsAssignment_4 ) ) )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1793:1: ( ( rule__EnumerationType__LiteralsAssignment_4 ) )
            {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1793:1: ( ( rule__EnumerationType__LiteralsAssignment_4 ) )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1794:1: ( rule__EnumerationType__LiteralsAssignment_4 )
            {
             before(grammarAccess.getEnumerationTypeAccess().getLiteralsAssignment_4()); 
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1795:1: ( rule__EnumerationType__LiteralsAssignment_4 )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1795:2: rule__EnumerationType__LiteralsAssignment_4
            {
            pushFollow(FOLLOW_rule__EnumerationType__LiteralsAssignment_4_in_rule__EnumerationType__Group__4__Impl3692);
            rule__EnumerationType__LiteralsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getEnumerationTypeAccess().getLiteralsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationType__Group__4__Impl"


    // $ANTLR start "rule__EnumerationType__Group__5"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1805:1: rule__EnumerationType__Group__5 : rule__EnumerationType__Group__5__Impl rule__EnumerationType__Group__6 ;
    public final void rule__EnumerationType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1809:1: ( rule__EnumerationType__Group__5__Impl rule__EnumerationType__Group__6 )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1810:2: rule__EnumerationType__Group__5__Impl rule__EnumerationType__Group__6
            {
            pushFollow(FOLLOW_rule__EnumerationType__Group__5__Impl_in_rule__EnumerationType__Group__53722);
            rule__EnumerationType__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumerationType__Group__6_in_rule__EnumerationType__Group__53725);
            rule__EnumerationType__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationType__Group__5"


    // $ANTLR start "rule__EnumerationType__Group__5__Impl"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1817:1: rule__EnumerationType__Group__5__Impl : ( ( rule__EnumerationType__Group_5__0 )* ) ;
    public final void rule__EnumerationType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1821:1: ( ( ( rule__EnumerationType__Group_5__0 )* ) )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1822:1: ( ( rule__EnumerationType__Group_5__0 )* )
            {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1822:1: ( ( rule__EnumerationType__Group_5__0 )* )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1823:1: ( rule__EnumerationType__Group_5__0 )*
            {
             before(grammarAccess.getEnumerationTypeAccess().getGroup_5()); 
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1824:1: ( rule__EnumerationType__Group_5__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==33) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1824:2: rule__EnumerationType__Group_5__0
            	    {
            	    pushFollow(FOLLOW_rule__EnumerationType__Group_5__0_in_rule__EnumerationType__Group__5__Impl3752);
            	    rule__EnumerationType__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getEnumerationTypeAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationType__Group__5__Impl"


    // $ANTLR start "rule__EnumerationType__Group__6"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1834:1: rule__EnumerationType__Group__6 : rule__EnumerationType__Group__6__Impl ;
    public final void rule__EnumerationType__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1838:1: ( rule__EnumerationType__Group__6__Impl )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1839:2: rule__EnumerationType__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__EnumerationType__Group__6__Impl_in_rule__EnumerationType__Group__63783);
            rule__EnumerationType__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationType__Group__6"


    // $ANTLR start "rule__EnumerationType__Group__6__Impl"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1845:1: rule__EnumerationType__Group__6__Impl : ( '}' ) ;
    public final void rule__EnumerationType__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1849:1: ( ( '}' ) )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1850:1: ( '}' )
            {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1850:1: ( '}' )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1851:1: '}'
            {
             before(grammarAccess.getEnumerationTypeAccess().getRightCurlyBracketKeyword_6()); 
            match(input,31,FOLLOW_31_in_rule__EnumerationType__Group__6__Impl3811); 
             after(grammarAccess.getEnumerationTypeAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationType__Group__6__Impl"


    // $ANTLR start "rule__EnumerationType__Group_2__0"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1878:1: rule__EnumerationType__Group_2__0 : rule__EnumerationType__Group_2__0__Impl rule__EnumerationType__Group_2__1 ;
    public final void rule__EnumerationType__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1882:1: ( rule__EnumerationType__Group_2__0__Impl rule__EnumerationType__Group_2__1 )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1883:2: rule__EnumerationType__Group_2__0__Impl rule__EnumerationType__Group_2__1
            {
            pushFollow(FOLLOW_rule__EnumerationType__Group_2__0__Impl_in_rule__EnumerationType__Group_2__03856);
            rule__EnumerationType__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumerationType__Group_2__1_in_rule__EnumerationType__Group_2__03859);
            rule__EnumerationType__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationType__Group_2__0"


    // $ANTLR start "rule__EnumerationType__Group_2__0__Impl"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1890:1: rule__EnumerationType__Group_2__0__Impl : ( ':' ) ;
    public final void rule__EnumerationType__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1894:1: ( ( ':' ) )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1895:1: ( ':' )
            {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1895:1: ( ':' )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1896:1: ':'
            {
             before(grammarAccess.getEnumerationTypeAccess().getColonKeyword_2_0()); 
            match(input,32,FOLLOW_32_in_rule__EnumerationType__Group_2__0__Impl3887); 
             after(grammarAccess.getEnumerationTypeAccess().getColonKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationType__Group_2__0__Impl"


    // $ANTLR start "rule__EnumerationType__Group_2__1"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1909:1: rule__EnumerationType__Group_2__1 : rule__EnumerationType__Group_2__1__Impl ;
    public final void rule__EnumerationType__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1913:1: ( rule__EnumerationType__Group_2__1__Impl )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1914:2: rule__EnumerationType__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__EnumerationType__Group_2__1__Impl_in_rule__EnumerationType__Group_2__13918);
            rule__EnumerationType__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationType__Group_2__1"


    // $ANTLR start "rule__EnumerationType__Group_2__1__Impl"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1920:1: rule__EnumerationType__Group_2__1__Impl : ( ( rule__EnumerationType__ParentAssignment_2_1 ) ) ;
    public final void rule__EnumerationType__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1924:1: ( ( ( rule__EnumerationType__ParentAssignment_2_1 ) ) )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1925:1: ( ( rule__EnumerationType__ParentAssignment_2_1 ) )
            {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1925:1: ( ( rule__EnumerationType__ParentAssignment_2_1 ) )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1926:1: ( rule__EnumerationType__ParentAssignment_2_1 )
            {
             before(grammarAccess.getEnumerationTypeAccess().getParentAssignment_2_1()); 
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1927:1: ( rule__EnumerationType__ParentAssignment_2_1 )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1927:2: rule__EnumerationType__ParentAssignment_2_1
            {
            pushFollow(FOLLOW_rule__EnumerationType__ParentAssignment_2_1_in_rule__EnumerationType__Group_2__1__Impl3945);
            rule__EnumerationType__ParentAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getEnumerationTypeAccess().getParentAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationType__Group_2__1__Impl"


    // $ANTLR start "rule__EnumerationType__Group_5__0"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1941:1: rule__EnumerationType__Group_5__0 : rule__EnumerationType__Group_5__0__Impl rule__EnumerationType__Group_5__1 ;
    public final void rule__EnumerationType__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1945:1: ( rule__EnumerationType__Group_5__0__Impl rule__EnumerationType__Group_5__1 )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1946:2: rule__EnumerationType__Group_5__0__Impl rule__EnumerationType__Group_5__1
            {
            pushFollow(FOLLOW_rule__EnumerationType__Group_5__0__Impl_in_rule__EnumerationType__Group_5__03979);
            rule__EnumerationType__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumerationType__Group_5__1_in_rule__EnumerationType__Group_5__03982);
            rule__EnumerationType__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationType__Group_5__0"


    // $ANTLR start "rule__EnumerationType__Group_5__0__Impl"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1953:1: rule__EnumerationType__Group_5__0__Impl : ( ',' ) ;
    public final void rule__EnumerationType__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1957:1: ( ( ',' ) )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1958:1: ( ',' )
            {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1958:1: ( ',' )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1959:1: ','
            {
             before(grammarAccess.getEnumerationTypeAccess().getCommaKeyword_5_0()); 
            match(input,33,FOLLOW_33_in_rule__EnumerationType__Group_5__0__Impl4010); 
             after(grammarAccess.getEnumerationTypeAccess().getCommaKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationType__Group_5__0__Impl"


    // $ANTLR start "rule__EnumerationType__Group_5__1"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1972:1: rule__EnumerationType__Group_5__1 : rule__EnumerationType__Group_5__1__Impl ;
    public final void rule__EnumerationType__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1976:1: ( rule__EnumerationType__Group_5__1__Impl )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1977:2: rule__EnumerationType__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__EnumerationType__Group_5__1__Impl_in_rule__EnumerationType__Group_5__14041);
            rule__EnumerationType__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationType__Group_5__1"


    // $ANTLR start "rule__EnumerationType__Group_5__1__Impl"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1983:1: rule__EnumerationType__Group_5__1__Impl : ( ( rule__EnumerationType__LiteralsAssignment_5_1 ) ) ;
    public final void rule__EnumerationType__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1987:1: ( ( ( rule__EnumerationType__LiteralsAssignment_5_1 ) ) )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1988:1: ( ( rule__EnumerationType__LiteralsAssignment_5_1 ) )
            {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1988:1: ( ( rule__EnumerationType__LiteralsAssignment_5_1 ) )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1989:1: ( rule__EnumerationType__LiteralsAssignment_5_1 )
            {
             before(grammarAccess.getEnumerationTypeAccess().getLiteralsAssignment_5_1()); 
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1990:1: ( rule__EnumerationType__LiteralsAssignment_5_1 )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1990:2: rule__EnumerationType__LiteralsAssignment_5_1
            {
            pushFollow(FOLLOW_rule__EnumerationType__LiteralsAssignment_5_1_in_rule__EnumerationType__Group_5__1__Impl4068);
            rule__EnumerationType__LiteralsAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getEnumerationTypeAccess().getLiteralsAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationType__Group_5__1__Impl"


    // $ANTLR start "rule__EntityType__Group__0"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2004:1: rule__EntityType__Group__0 : rule__EntityType__Group__0__Impl rule__EntityType__Group__1 ;
    public final void rule__EntityType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2008:1: ( rule__EntityType__Group__0__Impl rule__EntityType__Group__1 )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2009:2: rule__EntityType__Group__0__Impl rule__EntityType__Group__1
            {
            pushFollow(FOLLOW_rule__EntityType__Group__0__Impl_in_rule__EntityType__Group__04102);
            rule__EntityType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EntityType__Group__1_in_rule__EntityType__Group__04105);
            rule__EntityType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityType__Group__0"


    // $ANTLR start "rule__EntityType__Group__0__Impl"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2016:1: rule__EntityType__Group__0__Impl : ( 'entity' ) ;
    public final void rule__EntityType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2020:1: ( ( 'entity' ) )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2021:1: ( 'entity' )
            {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2021:1: ( 'entity' )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2022:1: 'entity'
            {
             before(grammarAccess.getEntityTypeAccess().getEntityKeyword_0()); 
            match(input,34,FOLLOW_34_in_rule__EntityType__Group__0__Impl4133); 
             after(grammarAccess.getEntityTypeAccess().getEntityKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityType__Group__0__Impl"


    // $ANTLR start "rule__EntityType__Group__1"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2035:1: rule__EntityType__Group__1 : rule__EntityType__Group__1__Impl rule__EntityType__Group__2 ;
    public final void rule__EntityType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2039:1: ( rule__EntityType__Group__1__Impl rule__EntityType__Group__2 )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2040:2: rule__EntityType__Group__1__Impl rule__EntityType__Group__2
            {
            pushFollow(FOLLOW_rule__EntityType__Group__1__Impl_in_rule__EntityType__Group__14164);
            rule__EntityType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EntityType__Group__2_in_rule__EntityType__Group__14167);
            rule__EntityType__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityType__Group__1"


    // $ANTLR start "rule__EntityType__Group__1__Impl"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2047:1: rule__EntityType__Group__1__Impl : ( ( rule__EntityType__StorageModifierAssignment_1 )? ) ;
    public final void rule__EntityType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2051:1: ( ( ( rule__EntityType__StorageModifierAssignment_1 )? ) )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2052:1: ( ( rule__EntityType__StorageModifierAssignment_1 )? )
            {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2052:1: ( ( rule__EntityType__StorageModifierAssignment_1 )? )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2053:1: ( rule__EntityType__StorageModifierAssignment_1 )?
            {
             before(grammarAccess.getEntityTypeAccess().getStorageModifierAssignment_1()); 
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2054:1: ( rule__EntityType__StorageModifierAssignment_1 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=16 && LA17_0<=17)) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2054:2: rule__EntityType__StorageModifierAssignment_1
                    {
                    pushFollow(FOLLOW_rule__EntityType__StorageModifierAssignment_1_in_rule__EntityType__Group__1__Impl4194);
                    rule__EntityType__StorageModifierAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEntityTypeAccess().getStorageModifierAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityType__Group__1__Impl"


    // $ANTLR start "rule__EntityType__Group__2"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2064:1: rule__EntityType__Group__2 : rule__EntityType__Group__2__Impl rule__EntityType__Group__3 ;
    public final void rule__EntityType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2068:1: ( rule__EntityType__Group__2__Impl rule__EntityType__Group__3 )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2069:2: rule__EntityType__Group__2__Impl rule__EntityType__Group__3
            {
            pushFollow(FOLLOW_rule__EntityType__Group__2__Impl_in_rule__EntityType__Group__24225);
            rule__EntityType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EntityType__Group__3_in_rule__EntityType__Group__24228);
            rule__EntityType__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityType__Group__2"


    // $ANTLR start "rule__EntityType__Group__2__Impl"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2076:1: rule__EntityType__Group__2__Impl : ( ( rule__EntityType__NameAssignment_2 ) ) ;
    public final void rule__EntityType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2080:1: ( ( ( rule__EntityType__NameAssignment_2 ) ) )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2081:1: ( ( rule__EntityType__NameAssignment_2 ) )
            {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2081:1: ( ( rule__EntityType__NameAssignment_2 ) )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2082:1: ( rule__EntityType__NameAssignment_2 )
            {
             before(grammarAccess.getEntityTypeAccess().getNameAssignment_2()); 
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2083:1: ( rule__EntityType__NameAssignment_2 )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2083:2: rule__EntityType__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__EntityType__NameAssignment_2_in_rule__EntityType__Group__2__Impl4255);
            rule__EntityType__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEntityTypeAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityType__Group__2__Impl"


    // $ANTLR start "rule__EntityType__Group__3"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2093:1: rule__EntityType__Group__3 : rule__EntityType__Group__3__Impl rule__EntityType__Group__4 ;
    public final void rule__EntityType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2097:1: ( rule__EntityType__Group__3__Impl rule__EntityType__Group__4 )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2098:2: rule__EntityType__Group__3__Impl rule__EntityType__Group__4
            {
            pushFollow(FOLLOW_rule__EntityType__Group__3__Impl_in_rule__EntityType__Group__34285);
            rule__EntityType__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EntityType__Group__4_in_rule__EntityType__Group__34288);
            rule__EntityType__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityType__Group__3"


    // $ANTLR start "rule__EntityType__Group__3__Impl"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2105:1: rule__EntityType__Group__3__Impl : ( ( rule__EntityType__Group_3__0 )? ) ;
    public final void rule__EntityType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2109:1: ( ( ( rule__EntityType__Group_3__0 )? ) )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2110:1: ( ( rule__EntityType__Group_3__0 )? )
            {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2110:1: ( ( rule__EntityType__Group_3__0 )? )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2111:1: ( rule__EntityType__Group_3__0 )?
            {
             before(grammarAccess.getEntityTypeAccess().getGroup_3()); 
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2112:1: ( rule__EntityType__Group_3__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==32) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2112:2: rule__EntityType__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__EntityType__Group_3__0_in_rule__EntityType__Group__3__Impl4315);
                    rule__EntityType__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEntityTypeAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityType__Group__3__Impl"


    // $ANTLR start "rule__EntityType__Group__4"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2122:1: rule__EntityType__Group__4 : rule__EntityType__Group__4__Impl rule__EntityType__Group__5 ;
    public final void rule__EntityType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2126:1: ( rule__EntityType__Group__4__Impl rule__EntityType__Group__5 )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2127:2: rule__EntityType__Group__4__Impl rule__EntityType__Group__5
            {
            pushFollow(FOLLOW_rule__EntityType__Group__4__Impl_in_rule__EntityType__Group__44346);
            rule__EntityType__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EntityType__Group__5_in_rule__EntityType__Group__44349);
            rule__EntityType__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityType__Group__4"


    // $ANTLR start "rule__EntityType__Group__4__Impl"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2134:1: rule__EntityType__Group__4__Impl : ( '{' ) ;
    public final void rule__EntityType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2138:1: ( ( '{' ) )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2139:1: ( '{' )
            {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2139:1: ( '{' )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2140:1: '{'
            {
             before(grammarAccess.getEntityTypeAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,30,FOLLOW_30_in_rule__EntityType__Group__4__Impl4377); 
             after(grammarAccess.getEntityTypeAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityType__Group__4__Impl"


    // $ANTLR start "rule__EntityType__Group__5"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2153:1: rule__EntityType__Group__5 : rule__EntityType__Group__5__Impl rule__EntityType__Group__6 ;
    public final void rule__EntityType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2157:1: ( rule__EntityType__Group__5__Impl rule__EntityType__Group__6 )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2158:2: rule__EntityType__Group__5__Impl rule__EntityType__Group__6
            {
            pushFollow(FOLLOW_rule__EntityType__Group__5__Impl_in_rule__EntityType__Group__54408);
            rule__EntityType__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EntityType__Group__6_in_rule__EntityType__Group__54411);
            rule__EntityType__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityType__Group__5"


    // $ANTLR start "rule__EntityType__Group__5__Impl"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2165:1: rule__EntityType__Group__5__Impl : ( ( rule__EntityType__PropertiesAssignment_5 )* ) ;
    public final void rule__EntityType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2169:1: ( ( ( rule__EntityType__PropertiesAssignment_5 )* ) )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2170:1: ( ( rule__EntityType__PropertiesAssignment_5 )* )
            {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2170:1: ( ( rule__EntityType__PropertiesAssignment_5 )* )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2171:1: ( rule__EntityType__PropertiesAssignment_5 )*
            {
             before(grammarAccess.getEntityTypeAccess().getPropertiesAssignment_5()); 
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2172:1: ( rule__EntityType__PropertiesAssignment_5 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_ID||(LA19_0>=20 && LA19_0<=22)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2172:2: rule__EntityType__PropertiesAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__EntityType__PropertiesAssignment_5_in_rule__EntityType__Group__5__Impl4438);
            	    rule__EntityType__PropertiesAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getEntityTypeAccess().getPropertiesAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityType__Group__5__Impl"


    // $ANTLR start "rule__EntityType__Group__6"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2182:1: rule__EntityType__Group__6 : rule__EntityType__Group__6__Impl ;
    public final void rule__EntityType__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2186:1: ( rule__EntityType__Group__6__Impl )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2187:2: rule__EntityType__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__EntityType__Group__6__Impl_in_rule__EntityType__Group__64469);
            rule__EntityType__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityType__Group__6"


    // $ANTLR start "rule__EntityType__Group__6__Impl"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2193:1: rule__EntityType__Group__6__Impl : ( '}' ) ;
    public final void rule__EntityType__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2197:1: ( ( '}' ) )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2198:1: ( '}' )
            {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2198:1: ( '}' )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2199:1: '}'
            {
             before(grammarAccess.getEntityTypeAccess().getRightCurlyBracketKeyword_6()); 
            match(input,31,FOLLOW_31_in_rule__EntityType__Group__6__Impl4497); 
             after(grammarAccess.getEntityTypeAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityType__Group__6__Impl"


    // $ANTLR start "rule__EntityType__Group_3__0"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2226:1: rule__EntityType__Group_3__0 : rule__EntityType__Group_3__0__Impl rule__EntityType__Group_3__1 ;
    public final void rule__EntityType__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2230:1: ( rule__EntityType__Group_3__0__Impl rule__EntityType__Group_3__1 )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2231:2: rule__EntityType__Group_3__0__Impl rule__EntityType__Group_3__1
            {
            pushFollow(FOLLOW_rule__EntityType__Group_3__0__Impl_in_rule__EntityType__Group_3__04542);
            rule__EntityType__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EntityType__Group_3__1_in_rule__EntityType__Group_3__04545);
            rule__EntityType__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityType__Group_3__0"


    // $ANTLR start "rule__EntityType__Group_3__0__Impl"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2238:1: rule__EntityType__Group_3__0__Impl : ( ':' ) ;
    public final void rule__EntityType__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2242:1: ( ( ':' ) )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2243:1: ( ':' )
            {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2243:1: ( ':' )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2244:1: ':'
            {
             before(grammarAccess.getEntityTypeAccess().getColonKeyword_3_0()); 
            match(input,32,FOLLOW_32_in_rule__EntityType__Group_3__0__Impl4573); 
             after(grammarAccess.getEntityTypeAccess().getColonKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityType__Group_3__0__Impl"


    // $ANTLR start "rule__EntityType__Group_3__1"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2257:1: rule__EntityType__Group_3__1 : rule__EntityType__Group_3__1__Impl ;
    public final void rule__EntityType__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2261:1: ( rule__EntityType__Group_3__1__Impl )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2262:2: rule__EntityType__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__EntityType__Group_3__1__Impl_in_rule__EntityType__Group_3__14604);
            rule__EntityType__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityType__Group_3__1"


    // $ANTLR start "rule__EntityType__Group_3__1__Impl"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2268:1: rule__EntityType__Group_3__1__Impl : ( ( rule__EntityType__ParentAssignment_3_1 ) ) ;
    public final void rule__EntityType__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2272:1: ( ( ( rule__EntityType__ParentAssignment_3_1 ) ) )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2273:1: ( ( rule__EntityType__ParentAssignment_3_1 ) )
            {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2273:1: ( ( rule__EntityType__ParentAssignment_3_1 ) )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2274:1: ( rule__EntityType__ParentAssignment_3_1 )
            {
             before(grammarAccess.getEntityTypeAccess().getParentAssignment_3_1()); 
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2275:1: ( rule__EntityType__ParentAssignment_3_1 )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2275:2: rule__EntityType__ParentAssignment_3_1
            {
            pushFollow(FOLLOW_rule__EntityType__ParentAssignment_3_1_in_rule__EntityType__Group_3__1__Impl4631);
            rule__EntityType__ParentAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getEntityTypeAccess().getParentAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityType__Group_3__1__Impl"


    // $ANTLR start "rule__Property__Group__0"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2289:1: rule__Property__Group__0 : rule__Property__Group__0__Impl rule__Property__Group__1 ;
    public final void rule__Property__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2293:1: ( rule__Property__Group__0__Impl rule__Property__Group__1 )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2294:2: rule__Property__Group__0__Impl rule__Property__Group__1
            {
            pushFollow(FOLLOW_rule__Property__Group__0__Impl_in_rule__Property__Group__04665);
            rule__Property__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Property__Group__1_in_rule__Property__Group__04668);
            rule__Property__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__0"


    // $ANTLR start "rule__Property__Group__0__Impl"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2301:1: rule__Property__Group__0__Impl : ( ( rule__Property__StorageModifierAssignment_0 )? ) ;
    public final void rule__Property__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2305:1: ( ( ( rule__Property__StorageModifierAssignment_0 )? ) )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2306:1: ( ( rule__Property__StorageModifierAssignment_0 )? )
            {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2306:1: ( ( rule__Property__StorageModifierAssignment_0 )? )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2307:1: ( rule__Property__StorageModifierAssignment_0 )?
            {
             before(grammarAccess.getPropertyAccess().getStorageModifierAssignment_0()); 
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2308:1: ( rule__Property__StorageModifierAssignment_0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=20 && LA20_0<=22)) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2308:2: rule__Property__StorageModifierAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Property__StorageModifierAssignment_0_in_rule__Property__Group__0__Impl4695);
                    rule__Property__StorageModifierAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPropertyAccess().getStorageModifierAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__0__Impl"


    // $ANTLR start "rule__Property__Group__1"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2318:1: rule__Property__Group__1 : rule__Property__Group__1__Impl rule__Property__Group__2 ;
    public final void rule__Property__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2322:1: ( rule__Property__Group__1__Impl rule__Property__Group__2 )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2323:2: rule__Property__Group__1__Impl rule__Property__Group__2
            {
            pushFollow(FOLLOW_rule__Property__Group__1__Impl_in_rule__Property__Group__14726);
            rule__Property__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Property__Group__2_in_rule__Property__Group__14729);
            rule__Property__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__1"


    // $ANTLR start "rule__Property__Group__1__Impl"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2330:1: rule__Property__Group__1__Impl : ( ( rule__Property__TypeAssignment_1 ) ) ;
    public final void rule__Property__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2334:1: ( ( ( rule__Property__TypeAssignment_1 ) ) )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2335:1: ( ( rule__Property__TypeAssignment_1 ) )
            {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2335:1: ( ( rule__Property__TypeAssignment_1 ) )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2336:1: ( rule__Property__TypeAssignment_1 )
            {
             before(grammarAccess.getPropertyAccess().getTypeAssignment_1()); 
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2337:1: ( rule__Property__TypeAssignment_1 )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2337:2: rule__Property__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__Property__TypeAssignment_1_in_rule__Property__Group__1__Impl4756);
            rule__Property__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPropertyAccess().getTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__1__Impl"


    // $ANTLR start "rule__Property__Group__2"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2347:1: rule__Property__Group__2 : rule__Property__Group__2__Impl rule__Property__Group__3 ;
    public final void rule__Property__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2351:1: ( rule__Property__Group__2__Impl rule__Property__Group__3 )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2352:2: rule__Property__Group__2__Impl rule__Property__Group__3
            {
            pushFollow(FOLLOW_rule__Property__Group__2__Impl_in_rule__Property__Group__24786);
            rule__Property__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Property__Group__3_in_rule__Property__Group__24789);
            rule__Property__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__2"


    // $ANTLR start "rule__Property__Group__2__Impl"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2359:1: rule__Property__Group__2__Impl : ( ( rule__Property__NameAssignment_2 ) ) ;
    public final void rule__Property__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2363:1: ( ( ( rule__Property__NameAssignment_2 ) ) )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2364:1: ( ( rule__Property__NameAssignment_2 ) )
            {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2364:1: ( ( rule__Property__NameAssignment_2 ) )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2365:1: ( rule__Property__NameAssignment_2 )
            {
             before(grammarAccess.getPropertyAccess().getNameAssignment_2()); 
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2366:1: ( rule__Property__NameAssignment_2 )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2366:2: rule__Property__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Property__NameAssignment_2_in_rule__Property__Group__2__Impl4816);
            rule__Property__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPropertyAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__2__Impl"


    // $ANTLR start "rule__Property__Group__3"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2376:1: rule__Property__Group__3 : rule__Property__Group__3__Impl rule__Property__Group__4 ;
    public final void rule__Property__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2380:1: ( rule__Property__Group__3__Impl rule__Property__Group__4 )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2381:2: rule__Property__Group__3__Impl rule__Property__Group__4
            {
            pushFollow(FOLLOW_rule__Property__Group__3__Impl_in_rule__Property__Group__34846);
            rule__Property__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Property__Group__4_in_rule__Property__Group__34849);
            rule__Property__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__3"


    // $ANTLR start "rule__Property__Group__3__Impl"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2388:1: rule__Property__Group__3__Impl : ( ( rule__Property__RelationshipAssignment_3 )? ) ;
    public final void rule__Property__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2392:1: ( ( ( rule__Property__RelationshipAssignment_3 )? ) )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2393:1: ( ( rule__Property__RelationshipAssignment_3 )? )
            {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2393:1: ( ( rule__Property__RelationshipAssignment_3 )? )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2394:1: ( rule__Property__RelationshipAssignment_3 )?
            {
             before(grammarAccess.getPropertyAccess().getRelationshipAssignment_3()); 
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2395:1: ( rule__Property__RelationshipAssignment_3 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=18 && LA21_0<=19)) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2395:2: rule__Property__RelationshipAssignment_3
                    {
                    pushFollow(FOLLOW_rule__Property__RelationshipAssignment_3_in_rule__Property__Group__3__Impl4876);
                    rule__Property__RelationshipAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPropertyAccess().getRelationshipAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__3__Impl"


    // $ANTLR start "rule__Property__Group__4"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2405:1: rule__Property__Group__4 : rule__Property__Group__4__Impl rule__Property__Group__5 ;
    public final void rule__Property__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2409:1: ( rule__Property__Group__4__Impl rule__Property__Group__5 )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2410:2: rule__Property__Group__4__Impl rule__Property__Group__5
            {
            pushFollow(FOLLOW_rule__Property__Group__4__Impl_in_rule__Property__Group__44907);
            rule__Property__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Property__Group__5_in_rule__Property__Group__44910);
            rule__Property__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__4"


    // $ANTLR start "rule__Property__Group__4__Impl"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2417:1: rule__Property__Group__4__Impl : ( ( rule__Property__Group_4__0 )? ) ;
    public final void rule__Property__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2421:1: ( ( ( rule__Property__Group_4__0 )? ) )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2422:1: ( ( rule__Property__Group_4__0 )? )
            {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2422:1: ( ( rule__Property__Group_4__0 )? )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2423:1: ( rule__Property__Group_4__0 )?
            {
             before(grammarAccess.getPropertyAccess().getGroup_4()); 
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2424:1: ( rule__Property__Group_4__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==35) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2424:2: rule__Property__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Property__Group_4__0_in_rule__Property__Group__4__Impl4937);
                    rule__Property__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPropertyAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__4__Impl"


    // $ANTLR start "rule__Property__Group__5"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2434:1: rule__Property__Group__5 : rule__Property__Group__5__Impl rule__Property__Group__6 ;
    public final void rule__Property__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2438:1: ( rule__Property__Group__5__Impl rule__Property__Group__6 )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2439:2: rule__Property__Group__5__Impl rule__Property__Group__6
            {
            pushFollow(FOLLOW_rule__Property__Group__5__Impl_in_rule__Property__Group__54968);
            rule__Property__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Property__Group__6_in_rule__Property__Group__54971);
            rule__Property__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__5"


    // $ANTLR start "rule__Property__Group__5__Impl"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2446:1: rule__Property__Group__5__Impl : ( ( rule__Property__Group_5__0 )? ) ;
    public final void rule__Property__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2450:1: ( ( ( rule__Property__Group_5__0 )? ) )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2451:1: ( ( rule__Property__Group_5__0 )? )
            {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2451:1: ( ( rule__Property__Group_5__0 )? )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2452:1: ( rule__Property__Group_5__0 )?
            {
             before(grammarAccess.getPropertyAccess().getGroup_5()); 
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2453:1: ( rule__Property__Group_5__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==36) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2453:2: rule__Property__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__Property__Group_5__0_in_rule__Property__Group__5__Impl4998);
                    rule__Property__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPropertyAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__5__Impl"


    // $ANTLR start "rule__Property__Group__6"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2463:1: rule__Property__Group__6 : rule__Property__Group__6__Impl ;
    public final void rule__Property__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2467:1: ( rule__Property__Group__6__Impl )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2468:2: rule__Property__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Property__Group__6__Impl_in_rule__Property__Group__65029);
            rule__Property__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__6"


    // $ANTLR start "rule__Property__Group__6__Impl"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2474:1: rule__Property__Group__6__Impl : ( ( rule__Property__Group_6__0 )? ) ;
    public final void rule__Property__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2478:1: ( ( ( rule__Property__Group_6__0 )? ) )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2479:1: ( ( rule__Property__Group_6__0 )? )
            {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2479:1: ( ( rule__Property__Group_6__0 )? )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2480:1: ( rule__Property__Group_6__0 )?
            {
             before(grammarAccess.getPropertyAccess().getGroup_6()); 
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2481:1: ( rule__Property__Group_6__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==37) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2481:2: rule__Property__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__Property__Group_6__0_in_rule__Property__Group__6__Impl5056);
                    rule__Property__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPropertyAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__6__Impl"


    // $ANTLR start "rule__Property__Group_4__0"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2505:1: rule__Property__Group_4__0 : rule__Property__Group_4__0__Impl rule__Property__Group_4__1 ;
    public final void rule__Property__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2509:1: ( rule__Property__Group_4__0__Impl rule__Property__Group_4__1 )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2510:2: rule__Property__Group_4__0__Impl rule__Property__Group_4__1
            {
            pushFollow(FOLLOW_rule__Property__Group_4__0__Impl_in_rule__Property__Group_4__05101);
            rule__Property__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Property__Group_4__1_in_rule__Property__Group_4__05104);
            rule__Property__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group_4__0"


    // $ANTLR start "rule__Property__Group_4__0__Impl"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2517:1: rule__Property__Group_4__0__Impl : ( 'order' ) ;
    public final void rule__Property__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2521:1: ( ( 'order' ) )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2522:1: ( 'order' )
            {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2522:1: ( 'order' )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2523:1: 'order'
            {
             before(grammarAccess.getPropertyAccess().getOrderKeyword_4_0()); 
            match(input,35,FOLLOW_35_in_rule__Property__Group_4__0__Impl5132); 
             after(grammarAccess.getPropertyAccess().getOrderKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group_4__0__Impl"


    // $ANTLR start "rule__Property__Group_4__1"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2536:1: rule__Property__Group_4__1 : rule__Property__Group_4__1__Impl ;
    public final void rule__Property__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2540:1: ( rule__Property__Group_4__1__Impl )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2541:2: rule__Property__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Property__Group_4__1__Impl_in_rule__Property__Group_4__15163);
            rule__Property__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group_4__1"


    // $ANTLR start "rule__Property__Group_4__1__Impl"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2547:1: rule__Property__Group_4__1__Impl : ( ( rule__Property__OrderByAssignment_4_1 ) ) ;
    public final void rule__Property__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2551:1: ( ( ( rule__Property__OrderByAssignment_4_1 ) ) )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2552:1: ( ( rule__Property__OrderByAssignment_4_1 ) )
            {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2552:1: ( ( rule__Property__OrderByAssignment_4_1 ) )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2553:1: ( rule__Property__OrderByAssignment_4_1 )
            {
             before(grammarAccess.getPropertyAccess().getOrderByAssignment_4_1()); 
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2554:1: ( rule__Property__OrderByAssignment_4_1 )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2554:2: rule__Property__OrderByAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Property__OrderByAssignment_4_1_in_rule__Property__Group_4__1__Impl5190);
            rule__Property__OrderByAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getPropertyAccess().getOrderByAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group_4__1__Impl"


    // $ANTLR start "rule__Property__Group_5__0"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2568:1: rule__Property__Group_5__0 : rule__Property__Group_5__0__Impl rule__Property__Group_5__1 ;
    public final void rule__Property__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2572:1: ( rule__Property__Group_5__0__Impl rule__Property__Group_5__1 )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2573:2: rule__Property__Group_5__0__Impl rule__Property__Group_5__1
            {
            pushFollow(FOLLOW_rule__Property__Group_5__0__Impl_in_rule__Property__Group_5__05224);
            rule__Property__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Property__Group_5__1_in_rule__Property__Group_5__05227);
            rule__Property__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group_5__0"


    // $ANTLR start "rule__Property__Group_5__0__Impl"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2580:1: rule__Property__Group_5__0__Impl : ( 'key' ) ;
    public final void rule__Property__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2584:1: ( ( 'key' ) )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2585:1: ( 'key' )
            {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2585:1: ( 'key' )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2586:1: 'key'
            {
             before(grammarAccess.getPropertyAccess().getKeyKeyword_5_0()); 
            match(input,36,FOLLOW_36_in_rule__Property__Group_5__0__Impl5255); 
             after(grammarAccess.getPropertyAccess().getKeyKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group_5__0__Impl"


    // $ANTLR start "rule__Property__Group_5__1"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2599:1: rule__Property__Group_5__1 : rule__Property__Group_5__1__Impl ;
    public final void rule__Property__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2603:1: ( rule__Property__Group_5__1__Impl )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2604:2: rule__Property__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__Property__Group_5__1__Impl_in_rule__Property__Group_5__15286);
            rule__Property__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group_5__1"


    // $ANTLR start "rule__Property__Group_5__1__Impl"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2610:1: rule__Property__Group_5__1__Impl : ( ( rule__Property__MapKeyAssignment_5_1 ) ) ;
    public final void rule__Property__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2614:1: ( ( ( rule__Property__MapKeyAssignment_5_1 ) ) )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2615:1: ( ( rule__Property__MapKeyAssignment_5_1 ) )
            {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2615:1: ( ( rule__Property__MapKeyAssignment_5_1 ) )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2616:1: ( rule__Property__MapKeyAssignment_5_1 )
            {
             before(grammarAccess.getPropertyAccess().getMapKeyAssignment_5_1()); 
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2617:1: ( rule__Property__MapKeyAssignment_5_1 )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2617:2: rule__Property__MapKeyAssignment_5_1
            {
            pushFollow(FOLLOW_rule__Property__MapKeyAssignment_5_1_in_rule__Property__Group_5__1__Impl5313);
            rule__Property__MapKeyAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getPropertyAccess().getMapKeyAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group_5__1__Impl"


    // $ANTLR start "rule__Property__Group_6__0"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2631:1: rule__Property__Group_6__0 : rule__Property__Group_6__0__Impl rule__Property__Group_6__1 ;
    public final void rule__Property__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2635:1: ( rule__Property__Group_6__0__Impl rule__Property__Group_6__1 )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2636:2: rule__Property__Group_6__0__Impl rule__Property__Group_6__1
            {
            pushFollow(FOLLOW_rule__Property__Group_6__0__Impl_in_rule__Property__Group_6__05347);
            rule__Property__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Property__Group_6__1_in_rule__Property__Group_6__05350);
            rule__Property__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group_6__0"


    // $ANTLR start "rule__Property__Group_6__0__Impl"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2643:1: rule__Property__Group_6__0__Impl : ( '=' ) ;
    public final void rule__Property__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2647:1: ( ( '=' ) )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2648:1: ( '=' )
            {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2648:1: ( '=' )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2649:1: '='
            {
             before(grammarAccess.getPropertyAccess().getEqualsSignKeyword_6_0()); 
            match(input,37,FOLLOW_37_in_rule__Property__Group_6__0__Impl5378); 
             after(grammarAccess.getPropertyAccess().getEqualsSignKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group_6__0__Impl"


    // $ANTLR start "rule__Property__Group_6__1"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2662:1: rule__Property__Group_6__1 : rule__Property__Group_6__1__Impl ;
    public final void rule__Property__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2666:1: ( rule__Property__Group_6__1__Impl )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2667:2: rule__Property__Group_6__1__Impl
            {
            pushFollow(FOLLOW_rule__Property__Group_6__1__Impl_in_rule__Property__Group_6__15409);
            rule__Property__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group_6__1"


    // $ANTLR start "rule__Property__Group_6__1__Impl"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2673:1: rule__Property__Group_6__1__Impl : ( ( rule__Property__LiteralAssignment_6_1 ) ) ;
    public final void rule__Property__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2677:1: ( ( ( rule__Property__LiteralAssignment_6_1 ) ) )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2678:1: ( ( rule__Property__LiteralAssignment_6_1 ) )
            {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2678:1: ( ( rule__Property__LiteralAssignment_6_1 ) )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2679:1: ( rule__Property__LiteralAssignment_6_1 )
            {
             before(grammarAccess.getPropertyAccess().getLiteralAssignment_6_1()); 
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2680:1: ( rule__Property__LiteralAssignment_6_1 )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2680:2: rule__Property__LiteralAssignment_6_1
            {
            pushFollow(FOLLOW_rule__Property__LiteralAssignment_6_1_in_rule__Property__Group_6__1__Impl5436);
            rule__Property__LiteralAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getPropertyAccess().getLiteralAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group_6__1__Impl"


    // $ANTLR start "rule__EntityRelationship__Group__0"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2694:1: rule__EntityRelationship__Group__0 : rule__EntityRelationship__Group__0__Impl rule__EntityRelationship__Group__1 ;
    public final void rule__EntityRelationship__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2698:1: ( rule__EntityRelationship__Group__0__Impl rule__EntityRelationship__Group__1 )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2699:2: rule__EntityRelationship__Group__0__Impl rule__EntityRelationship__Group__1
            {
            pushFollow(FOLLOW_rule__EntityRelationship__Group__0__Impl_in_rule__EntityRelationship__Group__05470);
            rule__EntityRelationship__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EntityRelationship__Group__1_in_rule__EntityRelationship__Group__05473);
            rule__EntityRelationship__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityRelationship__Group__0"


    // $ANTLR start "rule__EntityRelationship__Group__0__Impl"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2706:1: rule__EntityRelationship__Group__0__Impl : ( () ) ;
    public final void rule__EntityRelationship__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2710:1: ( ( () ) )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2711:1: ( () )
            {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2711:1: ( () )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2712:1: ()
            {
             before(grammarAccess.getEntityRelationshipAccess().getEntityRelationshipAction_0()); 
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2713:1: ()
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2715:1: 
            {
            }

             after(grammarAccess.getEntityRelationshipAccess().getEntityRelationshipAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityRelationship__Group__0__Impl"


    // $ANTLR start "rule__EntityRelationship__Group__1"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2725:1: rule__EntityRelationship__Group__1 : rule__EntityRelationship__Group__1__Impl rule__EntityRelationship__Group__2 ;
    public final void rule__EntityRelationship__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2729:1: ( rule__EntityRelationship__Group__1__Impl rule__EntityRelationship__Group__2 )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2730:2: rule__EntityRelationship__Group__1__Impl rule__EntityRelationship__Group__2
            {
            pushFollow(FOLLOW_rule__EntityRelationship__Group__1__Impl_in_rule__EntityRelationship__Group__15531);
            rule__EntityRelationship__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EntityRelationship__Group__2_in_rule__EntityRelationship__Group__15534);
            rule__EntityRelationship__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityRelationship__Group__1"


    // $ANTLR start "rule__EntityRelationship__Group__1__Impl"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2737:1: rule__EntityRelationship__Group__1__Impl : ( ( rule__EntityRelationship__KindAssignment_1 ) ) ;
    public final void rule__EntityRelationship__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2741:1: ( ( ( rule__EntityRelationship__KindAssignment_1 ) ) )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2742:1: ( ( rule__EntityRelationship__KindAssignment_1 ) )
            {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2742:1: ( ( rule__EntityRelationship__KindAssignment_1 ) )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2743:1: ( rule__EntityRelationship__KindAssignment_1 )
            {
             before(grammarAccess.getEntityRelationshipAccess().getKindAssignment_1()); 
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2744:1: ( rule__EntityRelationship__KindAssignment_1 )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2744:2: rule__EntityRelationship__KindAssignment_1
            {
            pushFollow(FOLLOW_rule__EntityRelationship__KindAssignment_1_in_rule__EntityRelationship__Group__1__Impl5561);
            rule__EntityRelationship__KindAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEntityRelationshipAccess().getKindAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityRelationship__Group__1__Impl"


    // $ANTLR start "rule__EntityRelationship__Group__2"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2754:1: rule__EntityRelationship__Group__2 : rule__EntityRelationship__Group__2__Impl ;
    public final void rule__EntityRelationship__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2758:1: ( rule__EntityRelationship__Group__2__Impl )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2759:2: rule__EntityRelationship__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__EntityRelationship__Group__2__Impl_in_rule__EntityRelationship__Group__25591);
            rule__EntityRelationship__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityRelationship__Group__2"


    // $ANTLR start "rule__EntityRelationship__Group__2__Impl"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2765:1: rule__EntityRelationship__Group__2__Impl : ( ( rule__EntityRelationship__MappedByAssignment_2 )? ) ;
    public final void rule__EntityRelationship__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2769:1: ( ( ( rule__EntityRelationship__MappedByAssignment_2 )? ) )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2770:1: ( ( rule__EntityRelationship__MappedByAssignment_2 )? )
            {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2770:1: ( ( rule__EntityRelationship__MappedByAssignment_2 )? )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2771:1: ( rule__EntityRelationship__MappedByAssignment_2 )?
            {
             before(grammarAccess.getEntityRelationshipAccess().getMappedByAssignment_2()); 
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2772:1: ( rule__EntityRelationship__MappedByAssignment_2 )?
            int alt25=2;
            alt25 = dfa25.predict(input);
            switch (alt25) {
                case 1 :
                    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2772:2: rule__EntityRelationship__MappedByAssignment_2
                    {
                    pushFollow(FOLLOW_rule__EntityRelationship__MappedByAssignment_2_in_rule__EntityRelationship__Group__2__Impl5618);
                    rule__EntityRelationship__MappedByAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEntityRelationshipAccess().getMappedByAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityRelationship__Group__2__Impl"


    // $ANTLR start "rule__MappedByReference__Group__0"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2788:1: rule__MappedByReference__Group__0 : rule__MappedByReference__Group__0__Impl rule__MappedByReference__Group__1 ;
    public final void rule__MappedByReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2792:1: ( rule__MappedByReference__Group__0__Impl rule__MappedByReference__Group__1 )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2793:2: rule__MappedByReference__Group__0__Impl rule__MappedByReference__Group__1
            {
            pushFollow(FOLLOW_rule__MappedByReference__Group__0__Impl_in_rule__MappedByReference__Group__05655);
            rule__MappedByReference__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MappedByReference__Group__1_in_rule__MappedByReference__Group__05658);
            rule__MappedByReference__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappedByReference__Group__0"


    // $ANTLR start "rule__MappedByReference__Group__0__Impl"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2800:1: rule__MappedByReference__Group__0__Impl : ( ( rule__MappedByReference__BaseAssignment_0 ) ) ;
    public final void rule__MappedByReference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2804:1: ( ( ( rule__MappedByReference__BaseAssignment_0 ) ) )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2805:1: ( ( rule__MappedByReference__BaseAssignment_0 ) )
            {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2805:1: ( ( rule__MappedByReference__BaseAssignment_0 ) )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2806:1: ( rule__MappedByReference__BaseAssignment_0 )
            {
             before(grammarAccess.getMappedByReferenceAccess().getBaseAssignment_0()); 
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2807:1: ( rule__MappedByReference__BaseAssignment_0 )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2807:2: rule__MappedByReference__BaseAssignment_0
            {
            pushFollow(FOLLOW_rule__MappedByReference__BaseAssignment_0_in_rule__MappedByReference__Group__0__Impl5685);
            rule__MappedByReference__BaseAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getMappedByReferenceAccess().getBaseAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappedByReference__Group__0__Impl"


    // $ANTLR start "rule__MappedByReference__Group__1"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2817:1: rule__MappedByReference__Group__1 : rule__MappedByReference__Group__1__Impl ;
    public final void rule__MappedByReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2821:1: ( rule__MappedByReference__Group__1__Impl )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2822:2: rule__MappedByReference__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__MappedByReference__Group__1__Impl_in_rule__MappedByReference__Group__15715);
            rule__MappedByReference__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappedByReference__Group__1"


    // $ANTLR start "rule__MappedByReference__Group__1__Impl"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2828:1: rule__MappedByReference__Group__1__Impl : ( ( rule__MappedByReference__Group_1__0 )? ) ;
    public final void rule__MappedByReference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2832:1: ( ( ( rule__MappedByReference__Group_1__0 )? ) )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2833:1: ( ( rule__MappedByReference__Group_1__0 )? )
            {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2833:1: ( ( rule__MappedByReference__Group_1__0 )? )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2834:1: ( rule__MappedByReference__Group_1__0 )?
            {
             before(grammarAccess.getMappedByReferenceAccess().getGroup_1()); 
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2835:1: ( rule__MappedByReference__Group_1__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==38) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2835:2: rule__MappedByReference__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__MappedByReference__Group_1__0_in_rule__MappedByReference__Group__1__Impl5742);
                    rule__MappedByReference__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMappedByReferenceAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappedByReference__Group__1__Impl"


    // $ANTLR start "rule__MappedByReference__Group_1__0"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2849:1: rule__MappedByReference__Group_1__0 : rule__MappedByReference__Group_1__0__Impl rule__MappedByReference__Group_1__1 ;
    public final void rule__MappedByReference__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2853:1: ( rule__MappedByReference__Group_1__0__Impl rule__MappedByReference__Group_1__1 )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2854:2: rule__MappedByReference__Group_1__0__Impl rule__MappedByReference__Group_1__1
            {
            pushFollow(FOLLOW_rule__MappedByReference__Group_1__0__Impl_in_rule__MappedByReference__Group_1__05777);
            rule__MappedByReference__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MappedByReference__Group_1__1_in_rule__MappedByReference__Group_1__05780);
            rule__MappedByReference__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappedByReference__Group_1__0"


    // $ANTLR start "rule__MappedByReference__Group_1__0__Impl"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2861:1: rule__MappedByReference__Group_1__0__Impl : ( '.' ) ;
    public final void rule__MappedByReference__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2865:1: ( ( '.' ) )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2866:1: ( '.' )
            {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2866:1: ( '.' )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2867:1: '.'
            {
             before(grammarAccess.getMappedByReferenceAccess().getFullStopKeyword_1_0()); 
            match(input,38,FOLLOW_38_in_rule__MappedByReference__Group_1__0__Impl5808); 
             after(grammarAccess.getMappedByReferenceAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappedByReference__Group_1__0__Impl"


    // $ANTLR start "rule__MappedByReference__Group_1__1"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2880:1: rule__MappedByReference__Group_1__1 : rule__MappedByReference__Group_1__1__Impl ;
    public final void rule__MappedByReference__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2884:1: ( rule__MappedByReference__Group_1__1__Impl )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2885:2: rule__MappedByReference__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__MappedByReference__Group_1__1__Impl_in_rule__MappedByReference__Group_1__15839);
            rule__MappedByReference__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappedByReference__Group_1__1"


    // $ANTLR start "rule__MappedByReference__Group_1__1__Impl"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2891:1: rule__MappedByReference__Group_1__1__Impl : ( ( rule__MappedByReference__PathAssignment_1_1 ) ) ;
    public final void rule__MappedByReference__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2895:1: ( ( ( rule__MappedByReference__PathAssignment_1_1 ) ) )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2896:1: ( ( rule__MappedByReference__PathAssignment_1_1 ) )
            {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2896:1: ( ( rule__MappedByReference__PathAssignment_1_1 ) )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2897:1: ( rule__MappedByReference__PathAssignment_1_1 )
            {
             before(grammarAccess.getMappedByReferenceAccess().getPathAssignment_1_1()); 
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2898:1: ( rule__MappedByReference__PathAssignment_1_1 )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2898:2: rule__MappedByReference__PathAssignment_1_1
            {
            pushFollow(FOLLOW_rule__MappedByReference__PathAssignment_1_1_in_rule__MappedByReference__Group_1__1__Impl5866);
            rule__MappedByReference__PathAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getMappedByReferenceAccess().getPathAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappedByReference__Group_1__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2912:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2916:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2917:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__05900);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__05903);
            rule__QualifiedName__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0"


    // $ANTLR start "rule__QualifiedName__Group__0__Impl"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2924:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2928:1: ( ( RULE_ID ) )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2929:1: ( RULE_ID )
            {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2929:1: ( RULE_ID )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2930:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl5930); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group__1"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2941:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2945:1: ( rule__QualifiedName__Group__1__Impl )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2946:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__15959);
            rule__QualifiedName__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1"


    // $ANTLR start "rule__QualifiedName__Group__1__Impl"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2952:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2956:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2957:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2957:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2958:1: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2959:1: ( rule__QualifiedName__Group_1__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==38) ) {
                    int LA27_2 = input.LA(2);

                    if ( (LA27_2==RULE_ID) ) {
                        alt27=1;
                    }


                }


                switch (alt27) {
            	case 1 :
            	    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2959:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl5986);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

             after(grammarAccess.getQualifiedNameAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__0"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2973:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2977:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2978:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__06021);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__06024);
            rule__QualifiedName__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0"


    // $ANTLR start "rule__QualifiedName__Group_1__0__Impl"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2985:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2989:1: ( ( '.' ) )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2990:1: ( '.' )
            {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2990:1: ( '.' )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:2991:1: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,38,FOLLOW_38_in_rule__QualifiedName__Group_1__0__Impl6052); 
             after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__1"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3004:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3008:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3009:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__16083);
            rule__QualifiedName__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1"


    // $ANTLR start "rule__QualifiedName__Group_1__1__Impl"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3015:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3019:1: ( ( RULE_ID ) )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3020:1: ( RULE_ID )
            {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3020:1: ( RULE_ID )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3021:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl6110); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1__Impl"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__0"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3036:1: rule__QualifiedNameWithWildcard__Group__0 : rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 ;
    public final void rule__QualifiedNameWithWildcard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3040:1: ( rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3041:2: rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group__0__Impl_in_rule__QualifiedNameWithWildcard__Group__06143);
            rule__QualifiedNameWithWildcard__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group__1_in_rule__QualifiedNameWithWildcard__Group__06146);
            rule__QualifiedNameWithWildcard__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__0"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__0__Impl"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3048:1: rule__QualifiedNameWithWildcard__Group__0__Impl : ( ruleQualifiedName ) ;
    public final void rule__QualifiedNameWithWildcard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3052:1: ( ( ruleQualifiedName ) )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3053:1: ( ruleQualifiedName )
            {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3053:1: ( ruleQualifiedName )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3054:1: ruleQualifiedName
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__QualifiedNameWithWildcard__Group__0__Impl6173);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__0__Impl"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__1"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3065:1: rule__QualifiedNameWithWildcard__Group__1 : rule__QualifiedNameWithWildcard__Group__1__Impl ;
    public final void rule__QualifiedNameWithWildcard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3069:1: ( rule__QualifiedNameWithWildcard__Group__1__Impl )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3070:2: rule__QualifiedNameWithWildcard__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group__1__Impl_in_rule__QualifiedNameWithWildcard__Group__16202);
            rule__QualifiedNameWithWildcard__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__1"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__1__Impl"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3076:1: rule__QualifiedNameWithWildcard__Group__1__Impl : ( ( rule__QualifiedNameWithWildcard__Group_1__0 )? ) ;
    public final void rule__QualifiedNameWithWildcard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3080:1: ( ( ( rule__QualifiedNameWithWildcard__Group_1__0 )? ) )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3081:1: ( ( rule__QualifiedNameWithWildcard__Group_1__0 )? )
            {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3081:1: ( ( rule__QualifiedNameWithWildcard__Group_1__0 )? )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3082:1: ( rule__QualifiedNameWithWildcard__Group_1__0 )?
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup_1()); 
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3083:1: ( rule__QualifiedNameWithWildcard__Group_1__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==38) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3083:2: rule__QualifiedNameWithWildcard__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group_1__0_in_rule__QualifiedNameWithWildcard__Group__1__Impl6229);
                    rule__QualifiedNameWithWildcard__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__1__Impl"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group_1__0"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3097:1: rule__QualifiedNameWithWildcard__Group_1__0 : rule__QualifiedNameWithWildcard__Group_1__0__Impl rule__QualifiedNameWithWildcard__Group_1__1 ;
    public final void rule__QualifiedNameWithWildcard__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3101:1: ( rule__QualifiedNameWithWildcard__Group_1__0__Impl rule__QualifiedNameWithWildcard__Group_1__1 )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3102:2: rule__QualifiedNameWithWildcard__Group_1__0__Impl rule__QualifiedNameWithWildcard__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group_1__0__Impl_in_rule__QualifiedNameWithWildcard__Group_1__06264);
            rule__QualifiedNameWithWildcard__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group_1__1_in_rule__QualifiedNameWithWildcard__Group_1__06267);
            rule__QualifiedNameWithWildcard__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group_1__0"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group_1__0__Impl"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3109:1: rule__QualifiedNameWithWildcard__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedNameWithWildcard__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3113:1: ( ( '.' ) )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3114:1: ( '.' )
            {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3114:1: ( '.' )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3115:1: '.'
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopKeyword_1_0()); 
            match(input,38,FOLLOW_38_in_rule__QualifiedNameWithWildcard__Group_1__0__Impl6295); 
             after(grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group_1__1"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3128:1: rule__QualifiedNameWithWildcard__Group_1__1 : rule__QualifiedNameWithWildcard__Group_1__1__Impl ;
    public final void rule__QualifiedNameWithWildcard__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3132:1: ( rule__QualifiedNameWithWildcard__Group_1__1__Impl )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3133:2: rule__QualifiedNameWithWildcard__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group_1__1__Impl_in_rule__QualifiedNameWithWildcard__Group_1__16326);
            rule__QualifiedNameWithWildcard__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group_1__1"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group_1__1__Impl"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3139:1: rule__QualifiedNameWithWildcard__Group_1__1__Impl : ( '*' ) ;
    public final void rule__QualifiedNameWithWildcard__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3143:1: ( ( '*' ) )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3144:1: ( '*' )
            {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3144:1: ( '*' )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3145:1: '*'
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getAsteriskKeyword_1_1()); 
            match(input,39,FOLLOW_39_in_rule__QualifiedNameWithWildcard__Group_1__1__Impl6354); 
             after(grammarAccess.getQualifiedNameWithWildcardAccess().getAsteriskKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group_1__1__Impl"


    // $ANTLR start "rule__NUMBER__Group_0__0"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3162:1: rule__NUMBER__Group_0__0 : rule__NUMBER__Group_0__0__Impl rule__NUMBER__Group_0__1 ;
    public final void rule__NUMBER__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3166:1: ( rule__NUMBER__Group_0__0__Impl rule__NUMBER__Group_0__1 )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3167:2: rule__NUMBER__Group_0__0__Impl rule__NUMBER__Group_0__1
            {
            pushFollow(FOLLOW_rule__NUMBER__Group_0__0__Impl_in_rule__NUMBER__Group_0__06389);
            rule__NUMBER__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NUMBER__Group_0__1_in_rule__NUMBER__Group_0__06392);
            rule__NUMBER__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NUMBER__Group_0__0"


    // $ANTLR start "rule__NUMBER__Group_0__0__Impl"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3174:1: rule__NUMBER__Group_0__0__Impl : ( ( rule__NUMBER__Alternatives_0_0 )? ) ;
    public final void rule__NUMBER__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3178:1: ( ( ( rule__NUMBER__Alternatives_0_0 )? ) )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3179:1: ( ( rule__NUMBER__Alternatives_0_0 )? )
            {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3179:1: ( ( rule__NUMBER__Alternatives_0_0 )? )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3180:1: ( rule__NUMBER__Alternatives_0_0 )?
            {
             before(grammarAccess.getNUMBERAccess().getAlternatives_0_0()); 
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3181:1: ( rule__NUMBER__Alternatives_0_0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( ((LA29_0>=14 && LA29_0<=15)) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3181:2: rule__NUMBER__Alternatives_0_0
                    {
                    pushFollow(FOLLOW_rule__NUMBER__Alternatives_0_0_in_rule__NUMBER__Group_0__0__Impl6419);
                    rule__NUMBER__Alternatives_0_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNUMBERAccess().getAlternatives_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NUMBER__Group_0__0__Impl"


    // $ANTLR start "rule__NUMBER__Group_0__1"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3191:1: rule__NUMBER__Group_0__1 : rule__NUMBER__Group_0__1__Impl ;
    public final void rule__NUMBER__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3195:1: ( rule__NUMBER__Group_0__1__Impl )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3196:2: rule__NUMBER__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__NUMBER__Group_0__1__Impl_in_rule__NUMBER__Group_0__16450);
            rule__NUMBER__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NUMBER__Group_0__1"


    // $ANTLR start "rule__NUMBER__Group_0__1__Impl"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3202:1: rule__NUMBER__Group_0__1__Impl : ( RULE_INT ) ;
    public final void rule__NUMBER__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3206:1: ( ( RULE_INT ) )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3207:1: ( RULE_INT )
            {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3207:1: ( RULE_INT )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3208:1: RULE_INT
            {
             before(grammarAccess.getNUMBERAccess().getINTTerminalRuleCall_0_1()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__NUMBER__Group_0__1__Impl6477); 
             after(grammarAccess.getNUMBERAccess().getINTTerminalRuleCall_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NUMBER__Group_0__1__Impl"


    // $ANTLR start "rule__NUMBER__Group_1__0"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3223:1: rule__NUMBER__Group_1__0 : rule__NUMBER__Group_1__0__Impl rule__NUMBER__Group_1__1 ;
    public final void rule__NUMBER__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3227:1: ( rule__NUMBER__Group_1__0__Impl rule__NUMBER__Group_1__1 )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3228:2: rule__NUMBER__Group_1__0__Impl rule__NUMBER__Group_1__1
            {
            pushFollow(FOLLOW_rule__NUMBER__Group_1__0__Impl_in_rule__NUMBER__Group_1__06510);
            rule__NUMBER__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NUMBER__Group_1__1_in_rule__NUMBER__Group_1__06513);
            rule__NUMBER__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NUMBER__Group_1__0"


    // $ANTLR start "rule__NUMBER__Group_1__0__Impl"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3235:1: rule__NUMBER__Group_1__0__Impl : ( RULE_INT ) ;
    public final void rule__NUMBER__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3239:1: ( ( RULE_INT ) )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3240:1: ( RULE_INT )
            {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3240:1: ( RULE_INT )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3241:1: RULE_INT
            {
             before(grammarAccess.getNUMBERAccess().getINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__NUMBER__Group_1__0__Impl6540); 
             after(grammarAccess.getNUMBERAccess().getINTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NUMBER__Group_1__0__Impl"


    // $ANTLR start "rule__NUMBER__Group_1__1"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3252:1: rule__NUMBER__Group_1__1 : rule__NUMBER__Group_1__1__Impl rule__NUMBER__Group_1__2 ;
    public final void rule__NUMBER__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3256:1: ( rule__NUMBER__Group_1__1__Impl rule__NUMBER__Group_1__2 )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3257:2: rule__NUMBER__Group_1__1__Impl rule__NUMBER__Group_1__2
            {
            pushFollow(FOLLOW_rule__NUMBER__Group_1__1__Impl_in_rule__NUMBER__Group_1__16569);
            rule__NUMBER__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NUMBER__Group_1__2_in_rule__NUMBER__Group_1__16572);
            rule__NUMBER__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NUMBER__Group_1__1"


    // $ANTLR start "rule__NUMBER__Group_1__1__Impl"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3264:1: rule__NUMBER__Group_1__1__Impl : ( '.' ) ;
    public final void rule__NUMBER__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3268:1: ( ( '.' ) )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3269:1: ( '.' )
            {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3269:1: ( '.' )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3270:1: '.'
            {
             before(grammarAccess.getNUMBERAccess().getFullStopKeyword_1_1()); 
            match(input,38,FOLLOW_38_in_rule__NUMBER__Group_1__1__Impl6600); 
             after(grammarAccess.getNUMBERAccess().getFullStopKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NUMBER__Group_1__1__Impl"


    // $ANTLR start "rule__NUMBER__Group_1__2"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3283:1: rule__NUMBER__Group_1__2 : rule__NUMBER__Group_1__2__Impl ;
    public final void rule__NUMBER__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3287:1: ( rule__NUMBER__Group_1__2__Impl )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3288:2: rule__NUMBER__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__NUMBER__Group_1__2__Impl_in_rule__NUMBER__Group_1__26631);
            rule__NUMBER__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NUMBER__Group_1__2"


    // $ANTLR start "rule__NUMBER__Group_1__2__Impl"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3294:1: rule__NUMBER__Group_1__2__Impl : ( RULE_INT ) ;
    public final void rule__NUMBER__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3298:1: ( ( RULE_INT ) )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3299:1: ( RULE_INT )
            {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3299:1: ( RULE_INT )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3300:1: RULE_INT
            {
             before(grammarAccess.getNUMBERAccess().getINTTerminalRuleCall_1_2()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__NUMBER__Group_1__2__Impl6658); 
             after(grammarAccess.getNUMBERAccess().getINTTerminalRuleCall_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NUMBER__Group_1__2__Impl"


    // $ANTLR start "rule__Model__NameAssignment_1"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3318:1: rule__Model__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__Model__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3322:1: ( ( ruleQualifiedName ) )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3323:1: ( ruleQualifiedName )
            {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3323:1: ( ruleQualifiedName )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3324:1: ruleQualifiedName
            {
             before(grammarAccess.getModelAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Model__NameAssignment_16698);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getModelAccess().getNameQualifiedNameParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__NameAssignment_1"


    // $ANTLR start "rule__Model__ImportsAssignment_2"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3333:1: rule__Model__ImportsAssignment_2 : ( ruleImport ) ;
    public final void rule__Model__ImportsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3337:1: ( ( ruleImport ) )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3338:1: ( ruleImport )
            {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3338:1: ( ruleImport )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3339:1: ruleImport
            {
             before(grammarAccess.getModelAccess().getImportsImportParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleImport_in_rule__Model__ImportsAssignment_26729);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getModelAccess().getImportsImportParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ImportsAssignment_2"


    // $ANTLR start "rule__Model__TypesAssignment_3"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3348:1: rule__Model__TypesAssignment_3 : ( ruleComplexType ) ;
    public final void rule__Model__TypesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3352:1: ( ( ruleComplexType ) )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3353:1: ( ruleComplexType )
            {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3353:1: ( ruleComplexType )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3354:1: ruleComplexType
            {
             before(grammarAccess.getModelAccess().getTypesComplexTypeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleComplexType_in_rule__Model__TypesAssignment_36760);
            ruleComplexType();

            state._fsp--;

             after(grammarAccess.getModelAccess().getTypesComplexTypeParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__TypesAssignment_3"


    // $ANTLR start "rule__Import__ImportedNamespaceAssignment_1"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3363:1: rule__Import__ImportedNamespaceAssignment_1 : ( ruleQualifiedNameWithWildcard ) ;
    public final void rule__Import__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3367:1: ( ( ruleQualifiedNameWithWildcard ) )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3368:1: ( ruleQualifiedNameWithWildcard )
            {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3368:1: ( ruleQualifiedNameWithWildcard )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3369:1: ruleQualifiedNameWithWildcard
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_rule__Import__ImportedNamespaceAssignment_16791);
            ruleQualifiedNameWithWildcard();

            state._fsp--;

             after(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__ImportedNamespaceAssignment_1"


    // $ANTLR start "rule__CollectionType__ReferenceAssignment_0"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3378:1: rule__CollectionType__ReferenceAssignment_0 : ( ruleTypeReference ) ;
    public final void rule__CollectionType__ReferenceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3382:1: ( ( ruleTypeReference ) )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3383:1: ( ruleTypeReference )
            {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3383:1: ( ruleTypeReference )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3384:1: ruleTypeReference
            {
             before(grammarAccess.getCollectionTypeAccess().getReferenceTypeReferenceParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleTypeReference_in_rule__CollectionType__ReferenceAssignment_06822);
            ruleTypeReference();

            state._fsp--;

             after(grammarAccess.getCollectionTypeAccess().getReferenceTypeReferenceParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollectionType__ReferenceAssignment_0"


    // $ANTLR start "rule__CollectionType__SizeAssignment_2"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3393:1: rule__CollectionType__SizeAssignment_2 : ( RULE_INT ) ;
    public final void rule__CollectionType__SizeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3397:1: ( ( RULE_INT ) )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3398:1: ( RULE_INT )
            {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3398:1: ( RULE_INT )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3399:1: RULE_INT
            {
             before(grammarAccess.getCollectionTypeAccess().getSizeINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__CollectionType__SizeAssignment_26853); 
             after(grammarAccess.getCollectionTypeAccess().getSizeINTTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollectionType__SizeAssignment_2"


    // $ANTLR start "rule__MapType__ReferenceAssignment_0"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3408:1: rule__MapType__ReferenceAssignment_0 : ( ruleTypeReference ) ;
    public final void rule__MapType__ReferenceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3412:1: ( ( ruleTypeReference ) )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3413:1: ( ruleTypeReference )
            {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3413:1: ( ruleTypeReference )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3414:1: ruleTypeReference
            {
             before(grammarAccess.getMapTypeAccess().getReferenceTypeReferenceParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleTypeReference_in_rule__MapType__ReferenceAssignment_06884);
            ruleTypeReference();

            state._fsp--;

             after(grammarAccess.getMapTypeAccess().getReferenceTypeReferenceParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapType__ReferenceAssignment_0"


    // $ANTLR start "rule__MapType__MapTypeAssignment_2_0"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3423:1: rule__MapType__MapTypeAssignment_2_0 : ( ruleTypeReference ) ;
    public final void rule__MapType__MapTypeAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3427:1: ( ( ruleTypeReference ) )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3428:1: ( ruleTypeReference )
            {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3428:1: ( ruleTypeReference )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3429:1: ruleTypeReference
            {
             before(grammarAccess.getMapTypeAccess().getMapTypeTypeReferenceParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_ruleTypeReference_in_rule__MapType__MapTypeAssignment_2_06915);
            ruleTypeReference();

            state._fsp--;

             after(grammarAccess.getMapTypeAccess().getMapTypeTypeReferenceParserRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapType__MapTypeAssignment_2_0"


    // $ANTLR start "rule__MapType__SizeAssignment_4"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3438:1: rule__MapType__SizeAssignment_4 : ( RULE_INT ) ;
    public final void rule__MapType__SizeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3442:1: ( ( RULE_INT ) )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3443:1: ( RULE_INT )
            {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3443:1: ( RULE_INT )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3444:1: RULE_INT
            {
             before(grammarAccess.getMapTypeAccess().getSizeINTTerminalRuleCall_4_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__MapType__SizeAssignment_46946); 
             after(grammarAccess.getMapTypeAccess().getSizeINTTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapType__SizeAssignment_4"


    // $ANTLR start "rule__TypeReference__ReferenceAssignment"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3453:1: rule__TypeReference__ReferenceAssignment : ( ( RULE_ID ) ) ;
    public final void rule__TypeReference__ReferenceAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3457:1: ( ( ( RULE_ID ) ) )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3458:1: ( ( RULE_ID ) )
            {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3458:1: ( ( RULE_ID ) )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3459:1: ( RULE_ID )
            {
             before(grammarAccess.getTypeReferenceAccess().getReferenceNamedTypeCrossReference_0()); 
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3460:1: ( RULE_ID )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3461:1: RULE_ID
            {
             before(grammarAccess.getTypeReferenceAccess().getReferenceNamedTypeIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__TypeReference__ReferenceAssignment6981); 
             after(grammarAccess.getTypeReferenceAccess().getReferenceNamedTypeIDTerminalRuleCall_0_1()); 

            }

             after(grammarAccess.getTypeReferenceAccess().getReferenceNamedTypeCrossReference_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeReference__ReferenceAssignment"


    // $ANTLR start "rule__PrimitiveType__NameAssignment"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3472:1: rule__PrimitiveType__NameAssignment : ( RULE_ID ) ;
    public final void rule__PrimitiveType__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3476:1: ( ( RULE_ID ) )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3477:1: ( RULE_ID )
            {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3477:1: ( RULE_ID )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3478:1: RULE_ID
            {
             before(grammarAccess.getPrimitiveTypeAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__PrimitiveType__NameAssignment7016); 
             after(grammarAccess.getPrimitiveTypeAccess().getNameIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveType__NameAssignment"


    // $ANTLR start "rule__EnumerationType__NameAssignment_1"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3487:1: rule__EnumerationType__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__EnumerationType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3491:1: ( ( RULE_ID ) )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3492:1: ( RULE_ID )
            {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3492:1: ( RULE_ID )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3493:1: RULE_ID
            {
             before(grammarAccess.getEnumerationTypeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EnumerationType__NameAssignment_17047); 
             after(grammarAccess.getEnumerationTypeAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationType__NameAssignment_1"


    // $ANTLR start "rule__EnumerationType__ParentAssignment_2_1"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3502:1: rule__EnumerationType__ParentAssignment_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__EnumerationType__ParentAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3506:1: ( ( ( ruleQualifiedName ) ) )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3507:1: ( ( ruleQualifiedName ) )
            {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3507:1: ( ( ruleQualifiedName ) )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3508:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getEnumerationTypeAccess().getParentEnumerationTypeCrossReference_2_1_0()); 
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3509:1: ( ruleQualifiedName )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3510:1: ruleQualifiedName
            {
             before(grammarAccess.getEnumerationTypeAccess().getParentEnumerationTypeQualifiedNameParserRuleCall_2_1_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__EnumerationType__ParentAssignment_2_17082);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getEnumerationTypeAccess().getParentEnumerationTypeQualifiedNameParserRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getEnumerationTypeAccess().getParentEnumerationTypeCrossReference_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationType__ParentAssignment_2_1"


    // $ANTLR start "rule__EnumerationType__LiteralsAssignment_4"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3521:1: rule__EnumerationType__LiteralsAssignment_4 : ( ruleEnumerationLiteral ) ;
    public final void rule__EnumerationType__LiteralsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3525:1: ( ( ruleEnumerationLiteral ) )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3526:1: ( ruleEnumerationLiteral )
            {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3526:1: ( ruleEnumerationLiteral )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3527:1: ruleEnumerationLiteral
            {
             before(grammarAccess.getEnumerationTypeAccess().getLiteralsEnumerationLiteralParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleEnumerationLiteral_in_rule__EnumerationType__LiteralsAssignment_47117);
            ruleEnumerationLiteral();

            state._fsp--;

             after(grammarAccess.getEnumerationTypeAccess().getLiteralsEnumerationLiteralParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationType__LiteralsAssignment_4"


    // $ANTLR start "rule__EnumerationType__LiteralsAssignment_5_1"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3536:1: rule__EnumerationType__LiteralsAssignment_5_1 : ( ruleEnumerationLiteral ) ;
    public final void rule__EnumerationType__LiteralsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3540:1: ( ( ruleEnumerationLiteral ) )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3541:1: ( ruleEnumerationLiteral )
            {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3541:1: ( ruleEnumerationLiteral )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3542:1: ruleEnumerationLiteral
            {
             before(grammarAccess.getEnumerationTypeAccess().getLiteralsEnumerationLiteralParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_ruleEnumerationLiteral_in_rule__EnumerationType__LiteralsAssignment_5_17148);
            ruleEnumerationLiteral();

            state._fsp--;

             after(grammarAccess.getEnumerationTypeAccess().getLiteralsEnumerationLiteralParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationType__LiteralsAssignment_5_1"


    // $ANTLR start "rule__EnumerationLiteral__NameAssignment"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3551:1: rule__EnumerationLiteral__NameAssignment : ( RULE_ID ) ;
    public final void rule__EnumerationLiteral__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3555:1: ( ( RULE_ID ) )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3556:1: ( RULE_ID )
            {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3556:1: ( RULE_ID )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3557:1: RULE_ID
            {
             before(grammarAccess.getEnumerationLiteralAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EnumerationLiteral__NameAssignment7179); 
             after(grammarAccess.getEnumerationLiteralAccess().getNameIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationLiteral__NameAssignment"


    // $ANTLR start "rule__EntityType__StorageModifierAssignment_1"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3566:1: rule__EntityType__StorageModifierAssignment_1 : ( ruleTypeStorageModifier ) ;
    public final void rule__EntityType__StorageModifierAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3570:1: ( ( ruleTypeStorageModifier ) )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3571:1: ( ruleTypeStorageModifier )
            {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3571:1: ( ruleTypeStorageModifier )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3572:1: ruleTypeStorageModifier
            {
             before(grammarAccess.getEntityTypeAccess().getStorageModifierTypeStorageModifierEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleTypeStorageModifier_in_rule__EntityType__StorageModifierAssignment_17210);
            ruleTypeStorageModifier();

            state._fsp--;

             after(grammarAccess.getEntityTypeAccess().getStorageModifierTypeStorageModifierEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityType__StorageModifierAssignment_1"


    // $ANTLR start "rule__EntityType__NameAssignment_2"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3581:1: rule__EntityType__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__EntityType__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3585:1: ( ( RULE_ID ) )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3586:1: ( RULE_ID )
            {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3586:1: ( RULE_ID )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3587:1: RULE_ID
            {
             before(grammarAccess.getEntityTypeAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EntityType__NameAssignment_27241); 
             after(grammarAccess.getEntityTypeAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityType__NameAssignment_2"


    // $ANTLR start "rule__EntityType__ParentAssignment_3_1"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3596:1: rule__EntityType__ParentAssignment_3_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__EntityType__ParentAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3600:1: ( ( ( ruleQualifiedName ) ) )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3601:1: ( ( ruleQualifiedName ) )
            {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3601:1: ( ( ruleQualifiedName ) )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3602:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getEntityTypeAccess().getParentComplexTypeCrossReference_3_1_0()); 
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3603:1: ( ruleQualifiedName )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3604:1: ruleQualifiedName
            {
             before(grammarAccess.getEntityTypeAccess().getParentComplexTypeQualifiedNameParserRuleCall_3_1_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__EntityType__ParentAssignment_3_17276);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getEntityTypeAccess().getParentComplexTypeQualifiedNameParserRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getEntityTypeAccess().getParentComplexTypeCrossReference_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityType__ParentAssignment_3_1"


    // $ANTLR start "rule__EntityType__PropertiesAssignment_5"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3615:1: rule__EntityType__PropertiesAssignment_5 : ( ruleProperty ) ;
    public final void rule__EntityType__PropertiesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3619:1: ( ( ruleProperty ) )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3620:1: ( ruleProperty )
            {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3620:1: ( ruleProperty )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3621:1: ruleProperty
            {
             before(grammarAccess.getEntityTypeAccess().getPropertiesPropertyParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleProperty_in_rule__EntityType__PropertiesAssignment_57311);
            ruleProperty();

            state._fsp--;

             after(grammarAccess.getEntityTypeAccess().getPropertiesPropertyParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityType__PropertiesAssignment_5"


    // $ANTLR start "rule__Property__StorageModifierAssignment_0"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3630:1: rule__Property__StorageModifierAssignment_0 : ( rulePropertyStorageModifier ) ;
    public final void rule__Property__StorageModifierAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3634:1: ( ( rulePropertyStorageModifier ) )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3635:1: ( rulePropertyStorageModifier )
            {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3635:1: ( rulePropertyStorageModifier )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3636:1: rulePropertyStorageModifier
            {
             before(grammarAccess.getPropertyAccess().getStorageModifierPropertyStorageModifierEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_rulePropertyStorageModifier_in_rule__Property__StorageModifierAssignment_07342);
            rulePropertyStorageModifier();

            state._fsp--;

             after(grammarAccess.getPropertyAccess().getStorageModifierPropertyStorageModifierEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__StorageModifierAssignment_0"


    // $ANTLR start "rule__Property__TypeAssignment_1"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3645:1: rule__Property__TypeAssignment_1 : ( ruleDeclarationTypeReference ) ;
    public final void rule__Property__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3649:1: ( ( ruleDeclarationTypeReference ) )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3650:1: ( ruleDeclarationTypeReference )
            {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3650:1: ( ruleDeclarationTypeReference )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3651:1: ruleDeclarationTypeReference
            {
             before(grammarAccess.getPropertyAccess().getTypeDeclarationTypeReferenceParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleDeclarationTypeReference_in_rule__Property__TypeAssignment_17373);
            ruleDeclarationTypeReference();

            state._fsp--;

             after(grammarAccess.getPropertyAccess().getTypeDeclarationTypeReferenceParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__TypeAssignment_1"


    // $ANTLR start "rule__Property__NameAssignment_2"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3660:1: rule__Property__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Property__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3664:1: ( ( RULE_ID ) )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3665:1: ( RULE_ID )
            {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3665:1: ( RULE_ID )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3666:1: RULE_ID
            {
             before(grammarAccess.getPropertyAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Property__NameAssignment_27404); 
             after(grammarAccess.getPropertyAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__NameAssignment_2"


    // $ANTLR start "rule__Property__RelationshipAssignment_3"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3675:1: rule__Property__RelationshipAssignment_3 : ( ruleEntityRelationship ) ;
    public final void rule__Property__RelationshipAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3679:1: ( ( ruleEntityRelationship ) )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3680:1: ( ruleEntityRelationship )
            {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3680:1: ( ruleEntityRelationship )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3681:1: ruleEntityRelationship
            {
             before(grammarAccess.getPropertyAccess().getRelationshipEntityRelationshipParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleEntityRelationship_in_rule__Property__RelationshipAssignment_37435);
            ruleEntityRelationship();

            state._fsp--;

             after(grammarAccess.getPropertyAccess().getRelationshipEntityRelationshipParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__RelationshipAssignment_3"


    // $ANTLR start "rule__Property__OrderByAssignment_4_1"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3690:1: rule__Property__OrderByAssignment_4_1 : ( rulePropertyReference ) ;
    public final void rule__Property__OrderByAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3694:1: ( ( rulePropertyReference ) )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3695:1: ( rulePropertyReference )
            {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3695:1: ( rulePropertyReference )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3696:1: rulePropertyReference
            {
             before(grammarAccess.getPropertyAccess().getOrderByPropertyReferenceParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_rulePropertyReference_in_rule__Property__OrderByAssignment_4_17466);
            rulePropertyReference();

            state._fsp--;

             after(grammarAccess.getPropertyAccess().getOrderByPropertyReferenceParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__OrderByAssignment_4_1"


    // $ANTLR start "rule__Property__MapKeyAssignment_5_1"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3705:1: rule__Property__MapKeyAssignment_5_1 : ( rulePropertyReference ) ;
    public final void rule__Property__MapKeyAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3709:1: ( ( rulePropertyReference ) )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3710:1: ( rulePropertyReference )
            {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3710:1: ( rulePropertyReference )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3711:1: rulePropertyReference
            {
             before(grammarAccess.getPropertyAccess().getMapKeyPropertyReferenceParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_rulePropertyReference_in_rule__Property__MapKeyAssignment_5_17497);
            rulePropertyReference();

            state._fsp--;

             after(grammarAccess.getPropertyAccess().getMapKeyPropertyReferenceParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__MapKeyAssignment_5_1"


    // $ANTLR start "rule__Property__LiteralAssignment_6_1"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3720:1: rule__Property__LiteralAssignment_6_1 : ( ruleLiteral ) ;
    public final void rule__Property__LiteralAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3724:1: ( ( ruleLiteral ) )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3725:1: ( ruleLiteral )
            {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3725:1: ( ruleLiteral )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3726:1: ruleLiteral
            {
             before(grammarAccess.getPropertyAccess().getLiteralLiteralParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_ruleLiteral_in_rule__Property__LiteralAssignment_6_17528);
            ruleLiteral();

            state._fsp--;

             after(grammarAccess.getPropertyAccess().getLiteralLiteralParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__LiteralAssignment_6_1"


    // $ANTLR start "rule__EntityRelationship__KindAssignment_1"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3735:1: rule__EntityRelationship__KindAssignment_1 : ( ruleEntityRelationshipKind ) ;
    public final void rule__EntityRelationship__KindAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3739:1: ( ( ruleEntityRelationshipKind ) )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3740:1: ( ruleEntityRelationshipKind )
            {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3740:1: ( ruleEntityRelationshipKind )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3741:1: ruleEntityRelationshipKind
            {
             before(grammarAccess.getEntityRelationshipAccess().getKindEntityRelationshipKindEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleEntityRelationshipKind_in_rule__EntityRelationship__KindAssignment_17559);
            ruleEntityRelationshipKind();

            state._fsp--;

             after(grammarAccess.getEntityRelationshipAccess().getKindEntityRelationshipKindEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityRelationship__KindAssignment_1"


    // $ANTLR start "rule__EntityRelationship__MappedByAssignment_2"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3750:1: rule__EntityRelationship__MappedByAssignment_2 : ( ruleMappedByReference ) ;
    public final void rule__EntityRelationship__MappedByAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3754:1: ( ( ruleMappedByReference ) )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3755:1: ( ruleMappedByReference )
            {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3755:1: ( ruleMappedByReference )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3756:1: ruleMappedByReference
            {
             before(grammarAccess.getEntityRelationshipAccess().getMappedByMappedByReferenceParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleMappedByReference_in_rule__EntityRelationship__MappedByAssignment_27590);
            ruleMappedByReference();

            state._fsp--;

             after(grammarAccess.getEntityRelationshipAccess().getMappedByMappedByReferenceParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityRelationship__MappedByAssignment_2"


    // $ANTLR start "rule__MappedByReference__BaseAssignment_0"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3765:1: rule__MappedByReference__BaseAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__MappedByReference__BaseAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3769:1: ( ( ( RULE_ID ) ) )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3770:1: ( ( RULE_ID ) )
            {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3770:1: ( ( RULE_ID ) )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3771:1: ( RULE_ID )
            {
             before(grammarAccess.getMappedByReferenceAccess().getBasePropertyCrossReference_0_0()); 
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3772:1: ( RULE_ID )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3773:1: RULE_ID
            {
             before(grammarAccess.getMappedByReferenceAccess().getBasePropertyIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__MappedByReference__BaseAssignment_07625); 
             after(grammarAccess.getMappedByReferenceAccess().getBasePropertyIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getMappedByReferenceAccess().getBasePropertyCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappedByReference__BaseAssignment_0"


    // $ANTLR start "rule__MappedByReference__PathAssignment_1_1"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3784:1: rule__MappedByReference__PathAssignment_1_1 : ( ruleMappedByReference ) ;
    public final void rule__MappedByReference__PathAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3788:1: ( ( ruleMappedByReference ) )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3789:1: ( ruleMappedByReference )
            {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3789:1: ( ruleMappedByReference )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3790:1: ruleMappedByReference
            {
             before(grammarAccess.getMappedByReferenceAccess().getPathMappedByReferenceParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleMappedByReference_in_rule__MappedByReference__PathAssignment_1_17660);
            ruleMappedByReference();

            state._fsp--;

             after(grammarAccess.getMappedByReferenceAccess().getPathMappedByReferenceParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappedByReference__PathAssignment_1_1"


    // $ANTLR start "rule__StringLiteral__ValueAssignment"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3799:1: rule__StringLiteral__ValueAssignment : ( RULE_STRING ) ;
    public final void rule__StringLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3803:1: ( ( RULE_STRING ) )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3804:1: ( RULE_STRING )
            {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3804:1: ( RULE_STRING )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3805:1: RULE_STRING
            {
             before(grammarAccess.getStringLiteralAccess().getValueSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__StringLiteral__ValueAssignment7691); 
             after(grammarAccess.getStringLiteralAccess().getValueSTRINGTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringLiteral__ValueAssignment"


    // $ANTLR start "rule__CharLiteral__ValueAssignment"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3814:1: rule__CharLiteral__ValueAssignment : ( RULE_CHARACTER ) ;
    public final void rule__CharLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3818:1: ( ( RULE_CHARACTER ) )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3819:1: ( RULE_CHARACTER )
            {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3819:1: ( RULE_CHARACTER )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3820:1: RULE_CHARACTER
            {
             before(grammarAccess.getCharLiteralAccess().getValueCHARACTERTerminalRuleCall_0()); 
            match(input,RULE_CHARACTER,FOLLOW_RULE_CHARACTER_in_rule__CharLiteral__ValueAssignment7722); 
             after(grammarAccess.getCharLiteralAccess().getValueCHARACTERTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharLiteral__ValueAssignment"


    // $ANTLR start "rule__NumberLiteral__ValueAssignment"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3829:1: rule__NumberLiteral__ValueAssignment : ( ruleNUMBER ) ;
    public final void rule__NumberLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3833:1: ( ( ruleNUMBER ) )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3834:1: ( ruleNUMBER )
            {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3834:1: ( ruleNUMBER )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3835:1: ruleNUMBER
            {
             before(grammarAccess.getNumberLiteralAccess().getValueNUMBERParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleNUMBER_in_rule__NumberLiteral__ValueAssignment7753);
            ruleNUMBER();

            state._fsp--;

             after(grammarAccess.getNumberLiteralAccess().getValueNUMBERParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberLiteral__ValueAssignment"


    // $ANTLR start "rule__BooleanLiteral__ValueAssignment"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3844:1: rule__BooleanLiteral__ValueAssignment : ( ruleBOOLEAN ) ;
    public final void rule__BooleanLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3848:1: ( ( ruleBOOLEAN ) )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3849:1: ( ruleBOOLEAN )
            {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3849:1: ( ruleBOOLEAN )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3850:1: ruleBOOLEAN
            {
             before(grammarAccess.getBooleanLiteralAccess().getValueBOOLEANParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleBOOLEAN_in_rule__BooleanLiteral__ValueAssignment7784);
            ruleBOOLEAN();

            state._fsp--;

             after(grammarAccess.getBooleanLiteralAccess().getValueBOOLEANParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanLiteral__ValueAssignment"


    // $ANTLR start "rule__PropertyReference__ReferenceAssignment"
    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3859:1: rule__PropertyReference__ReferenceAssignment : ( ( RULE_ID ) ) ;
    public final void rule__PropertyReference__ReferenceAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3863:1: ( ( ( RULE_ID ) ) )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3864:1: ( ( RULE_ID ) )
            {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3864:1: ( ( RULE_ID ) )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3865:1: ( RULE_ID )
            {
             before(grammarAccess.getPropertyReferenceAccess().getReferencePropertyCrossReference_0()); 
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3866:1: ( RULE_ID )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3867:1: RULE_ID
            {
             before(grammarAccess.getPropertyReferenceAccess().getReferencePropertyIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__PropertyReference__ReferenceAssignment7819); 
             after(grammarAccess.getPropertyReferenceAccess().getReferencePropertyIDTerminalRuleCall_0_1()); 

            }

             after(grammarAccess.getPropertyReferenceAccess().getReferencePropertyCrossReference_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyReference__ReferenceAssignment"

    // Delegated rules


    protected DFA25 dfa25 = new DFA25(this);
    static final String DFA25_eotS =
        "\6\uffff";
    static final String DFA25_eofS =
        "\1\2\1\4\4\uffff";
    static final String DFA25_minS =
        "\2\4\1\uffff\1\4\1\uffff\1\4";
    static final String DFA25_maxS =
        "\1\45\1\46\1\uffff\1\45\1\uffff\1\45";
    static final String DFA25_acceptS =
        "\2\uffff\1\2\1\uffff\1\1\1\uffff";
    static final String DFA25_specialS =
        "\6\uffff}>";
    static final String[] DFA25_transitionS = {
            "\1\1\17\uffff\3\2\10\uffff\1\2\3\uffff\3\2",
            "\1\3\17\uffff\3\4\2\uffff\1\2\1\uffff\1\2\3\uffff\1\4\3\uffff"+
            "\4\4",
            "",
            "\1\5\15\uffff\5\2\2\uffff\1\4\1\uffff\1\4\3\uffff\1\2\3\uffff"+
            "\3\2",
            "",
            "\1\3\15\uffff\5\4\2\uffff\1\2\1\uffff\1\2\3\uffff\1\4\3\uffff"+
            "\3\4"
    };

    static final short[] DFA25_eot = DFA.unpackEncodedString(DFA25_eotS);
    static final short[] DFA25_eof = DFA.unpackEncodedString(DFA25_eofS);
    static final char[] DFA25_min = DFA.unpackEncodedStringToUnsignedChars(DFA25_minS);
    static final char[] DFA25_max = DFA.unpackEncodedStringToUnsignedChars(DFA25_maxS);
    static final short[] DFA25_accept = DFA.unpackEncodedString(DFA25_acceptS);
    static final short[] DFA25_special = DFA.unpackEncodedString(DFA25_specialS);
    static final short[][] DFA25_transition;

    static {
        int numStates = DFA25_transitionS.length;
        DFA25_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA25_transition[i] = DFA.unpackEncodedString(DFA25_transitionS[i]);
        }
    }

    class DFA25 extends DFA {

        public DFA25(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 25;
            this.eot = DFA25_eot;
            this.eof = DFA25_eof;
            this.min = DFA25_min;
            this.max = DFA25_max;
            this.accept = DFA25_accept;
            this.special = DFA25_special;
            this.transition = DFA25_transition;
        }
        public String getDescription() {
            return "2772:1: ( rule__EntityRelationship__MappedByAssignment_2 )?";
        }
    }
 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0_in_ruleModel94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__0_in_ruleImport154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamedType_in_entryRuleNamedType183 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNamedType190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamedType__Alternatives_in_ruleNamedType216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollectionType_in_entryRuleCollectionType243 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCollectionType250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CollectionType__Group__0_in_ruleCollectionType276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMapType_in_entryRuleMapType303 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMapType310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapType__Group__0_in_ruleMapType336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclarationTypeReference_in_entryRuleDeclarationTypeReference363 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeclarationTypeReference370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeclarationTypeReference__Alternatives_in_ruleDeclarationTypeReference396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeReference_in_entryRuleTypeReference423 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeReference430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeReference__ReferenceAssignment_in_ruleTypeReference456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveType_in_entryRulePrimitiveType483 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveType490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimitiveType__NameAssignment_in_rulePrimitiveType516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexType_in_entryRuleComplexType543 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComplexType550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexType__Alternatives_in_ruleComplexType576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumerationType_in_entryRuleEnumerationType603 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumerationType610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationType__Group__0_in_ruleEnumerationType636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumerationLiteral_in_entryRuleEnumerationLiteral663 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumerationLiteral670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationLiteral__NameAssignment_in_ruleEnumerationLiteral696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntityType_in_entryRuleEntityType723 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntityType730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityType__Group__0_in_ruleEntityType756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_entryRuleProperty783 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProperty790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group__0_in_ruleProperty816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntityRelationship_in_entryRuleEntityRelationship843 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntityRelationship850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityRelationship__Group__0_in_ruleEntityRelationship876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMappedByReference_in_entryRuleMappedByReference903 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMappedByReference910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MappedByReference__Group__0_in_ruleMappedByReference936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral963 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteral970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Alternatives_in_ruleLiteral996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral1023 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringLiteral1030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringLiteral__ValueAssignment_in_ruleStringLiteral1056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCharLiteral_in_entryRuleCharLiteral1083 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCharLiteral1090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CharLiteral__ValueAssignment_in_ruleCharLiteral1116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberLiteral_in_entryRuleNumberLiteral1143 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumberLiteral1150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberLiteral__ValueAssignment_in_ruleNumberLiteral1176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral1203 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanLiteral1210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanLiteral__ValueAssignment_in_ruleBooleanLiteral1236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyReference_in_entryRulePropertyReference1263 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyReference1270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyReference__ReferenceAssignment_in_rulePropertyReference1296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1323 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName1330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName1356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard1383 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard1390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group__0_in_ruleQualifiedNameWithWildcard1416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBOOLEAN_in_entryRuleBOOLEAN1443 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBOOLEAN1450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BOOLEAN__Alternatives_in_ruleBOOLEAN1476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNUMBER_in_entryRuleNUMBER1503 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNUMBER1510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NUMBER__Alternatives_in_ruleNUMBER1536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeStorageModifier__Alternatives_in_ruleTypeStorageModifier1573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityRelationshipKind__Alternatives_in_ruleEntityRelationshipKind1609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyStorageModifier__Alternatives_in_rulePropertyStorageModifier1645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexType_in_rule__NamedType__Alternatives1681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveType_in_rule__NamedType__Alternatives1698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeReference_in_rule__DeclarationTypeReference__Alternatives1730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollectionType_in_rule__DeclarationTypeReference__Alternatives1747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMapType_in_rule__DeclarationTypeReference__Alternatives1764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumerationType_in_rule__ComplexType__Alternatives1796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntityType_in_rule__ComplexType__Alternatives1813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLiteral_in_rule__Literal__Alternatives1845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberLiteral_in_rule__Literal__Alternatives1862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCharLiteral_in_rule__Literal__Alternatives1879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_rule__Literal__Alternatives1896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyReference_in_rule__Literal__Alternatives1913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__BOOLEAN__Alternatives1946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__BOOLEAN__Alternatives1966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NUMBER__Group_0__0_in_rule__NUMBER__Alternatives2000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NUMBER__Group_1__0_in_rule__NUMBER__Alternatives2018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__NUMBER__Alternatives_0_02052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__NUMBER__Alternatives_0_02072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__TypeStorageModifier__Alternatives2107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__TypeStorageModifier__Alternatives2128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__EntityRelationshipKind__Alternatives2164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__EntityRelationshipKind__Alternatives2185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__PropertyStorageModifier__Alternatives2221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__PropertyStorageModifier__Alternatives2242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__PropertyStorageModifier__Alternatives2263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__02296 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Model__Group__1_in_rule__Model__Group__02299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Model__Group__0__Impl2327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__12358 = new BitSet(new long[]{0x0000000421000000L});
    public static final BitSet FOLLOW_rule__Model__Group__2_in_rule__Model__Group__12361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__NameAssignment_1_in_rule__Model__Group__1__Impl2388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__22418 = new BitSet(new long[]{0x0000000421000000L});
    public static final BitSet FOLLOW_rule__Model__Group__3_in_rule__Model__Group__22421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__ImportsAssignment_2_in_rule__Model__Group__2__Impl2448 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_rule__Model__Group__3__Impl_in_rule__Model__Group__32479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__TypesAssignment_3_in_rule__Model__Group__3__Impl2506 = new BitSet(new long[]{0x0000000420000002L});
    public static final BitSet FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__02545 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Import__Group__1_in_rule__Import__Group__02548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Import__Group__0__Impl2576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__12607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__ImportedNamespaceAssignment_1_in_rule__Import__Group__1__Impl2634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CollectionType__Group__0__Impl_in_rule__CollectionType__Group__02668 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__CollectionType__Group__1_in_rule__CollectionType__Group__02671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CollectionType__ReferenceAssignment_0_in_rule__CollectionType__Group__0__Impl2698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CollectionType__Group__1__Impl_in_rule__CollectionType__Group__12728 = new BitSet(new long[]{0x0000000004000020L});
    public static final BitSet FOLLOW_rule__CollectionType__Group__2_in_rule__CollectionType__Group__12731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__CollectionType__Group__1__Impl2759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CollectionType__Group__2__Impl_in_rule__CollectionType__Group__22790 = new BitSet(new long[]{0x0000000004000020L});
    public static final BitSet FOLLOW_rule__CollectionType__Group__3_in_rule__CollectionType__Group__22793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CollectionType__SizeAssignment_2_in_rule__CollectionType__Group__2__Impl2820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CollectionType__Group__3__Impl_in_rule__CollectionType__Group__32851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__CollectionType__Group__3__Impl2879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapType__Group__0__Impl_in_rule__MapType__Group__02918 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__MapType__Group__1_in_rule__MapType__Group__02921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapType__ReferenceAssignment_0_in_rule__MapType__Group__0__Impl2948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapType__Group__1__Impl_in_rule__MapType__Group__12978 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__MapType__Group__2_in_rule__MapType__Group__12981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__MapType__Group__1__Impl3009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapType__Group__2__Impl_in_rule__MapType__Group__23040 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__MapType__Group__3_in_rule__MapType__Group__23043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapType__Group_2__0_in_rule__MapType__Group__2__Impl3070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapType__Group__3__Impl_in_rule__MapType__Group__33100 = new BitSet(new long[]{0x0000000004000020L});
    public static final BitSet FOLLOW_rule__MapType__Group__4_in_rule__MapType__Group__33103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__MapType__Group__3__Impl3131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapType__Group__4__Impl_in_rule__MapType__Group__43162 = new BitSet(new long[]{0x0000000004000020L});
    public static final BitSet FOLLOW_rule__MapType__Group__5_in_rule__MapType__Group__43165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapType__SizeAssignment_4_in_rule__MapType__Group__4__Impl3192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapType__Group__5__Impl_in_rule__MapType__Group__53223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__MapType__Group__5__Impl3251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapType__Group_2__0__Impl_in_rule__MapType__Group_2__03294 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__MapType__Group_2__1_in_rule__MapType__Group_2__03297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapType__MapTypeAssignment_2_0_in_rule__MapType__Group_2__0__Impl3324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapType__Group_2__1__Impl_in_rule__MapType__Group_2__13354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__MapType__Group_2__1__Impl3382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationType__Group__0__Impl_in_rule__EnumerationType__Group__03417 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EnumerationType__Group__1_in_rule__EnumerationType__Group__03420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__EnumerationType__Group__0__Impl3448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationType__Group__1__Impl_in_rule__EnumerationType__Group__13479 = new BitSet(new long[]{0x0000000140000000L});
    public static final BitSet FOLLOW_rule__EnumerationType__Group__2_in_rule__EnumerationType__Group__13482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationType__NameAssignment_1_in_rule__EnumerationType__Group__1__Impl3509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationType__Group__2__Impl_in_rule__EnumerationType__Group__23539 = new BitSet(new long[]{0x0000000140000000L});
    public static final BitSet FOLLOW_rule__EnumerationType__Group__3_in_rule__EnumerationType__Group__23542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationType__Group_2__0_in_rule__EnumerationType__Group__2__Impl3569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationType__Group__3__Impl_in_rule__EnumerationType__Group__33600 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EnumerationType__Group__4_in_rule__EnumerationType__Group__33603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__EnumerationType__Group__3__Impl3631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationType__Group__4__Impl_in_rule__EnumerationType__Group__43662 = new BitSet(new long[]{0x0000000280000000L});
    public static final BitSet FOLLOW_rule__EnumerationType__Group__5_in_rule__EnumerationType__Group__43665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationType__LiteralsAssignment_4_in_rule__EnumerationType__Group__4__Impl3692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationType__Group__5__Impl_in_rule__EnumerationType__Group__53722 = new BitSet(new long[]{0x0000000280000000L});
    public static final BitSet FOLLOW_rule__EnumerationType__Group__6_in_rule__EnumerationType__Group__53725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationType__Group_5__0_in_rule__EnumerationType__Group__5__Impl3752 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_rule__EnumerationType__Group__6__Impl_in_rule__EnumerationType__Group__63783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__EnumerationType__Group__6__Impl3811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationType__Group_2__0__Impl_in_rule__EnumerationType__Group_2__03856 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EnumerationType__Group_2__1_in_rule__EnumerationType__Group_2__03859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__EnumerationType__Group_2__0__Impl3887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationType__Group_2__1__Impl_in_rule__EnumerationType__Group_2__13918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationType__ParentAssignment_2_1_in_rule__EnumerationType__Group_2__1__Impl3945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationType__Group_5__0__Impl_in_rule__EnumerationType__Group_5__03979 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EnumerationType__Group_5__1_in_rule__EnumerationType__Group_5__03982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__EnumerationType__Group_5__0__Impl4010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationType__Group_5__1__Impl_in_rule__EnumerationType__Group_5__14041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationType__LiteralsAssignment_5_1_in_rule__EnumerationType__Group_5__1__Impl4068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityType__Group__0__Impl_in_rule__EntityType__Group__04102 = new BitSet(new long[]{0x0000000000030010L});
    public static final BitSet FOLLOW_rule__EntityType__Group__1_in_rule__EntityType__Group__04105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__EntityType__Group__0__Impl4133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityType__Group__1__Impl_in_rule__EntityType__Group__14164 = new BitSet(new long[]{0x0000000000030010L});
    public static final BitSet FOLLOW_rule__EntityType__Group__2_in_rule__EntityType__Group__14167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityType__StorageModifierAssignment_1_in_rule__EntityType__Group__1__Impl4194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityType__Group__2__Impl_in_rule__EntityType__Group__24225 = new BitSet(new long[]{0x0000000140000000L});
    public static final BitSet FOLLOW_rule__EntityType__Group__3_in_rule__EntityType__Group__24228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityType__NameAssignment_2_in_rule__EntityType__Group__2__Impl4255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityType__Group__3__Impl_in_rule__EntityType__Group__34285 = new BitSet(new long[]{0x0000000140000000L});
    public static final BitSet FOLLOW_rule__EntityType__Group__4_in_rule__EntityType__Group__34288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityType__Group_3__0_in_rule__EntityType__Group__3__Impl4315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityType__Group__4__Impl_in_rule__EntityType__Group__44346 = new BitSet(new long[]{0x0000000080700010L});
    public static final BitSet FOLLOW_rule__EntityType__Group__5_in_rule__EntityType__Group__44349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__EntityType__Group__4__Impl4377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityType__Group__5__Impl_in_rule__EntityType__Group__54408 = new BitSet(new long[]{0x0000000080700010L});
    public static final BitSet FOLLOW_rule__EntityType__Group__6_in_rule__EntityType__Group__54411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityType__PropertiesAssignment_5_in_rule__EntityType__Group__5__Impl4438 = new BitSet(new long[]{0x0000000000700012L});
    public static final BitSet FOLLOW_rule__EntityType__Group__6__Impl_in_rule__EntityType__Group__64469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__EntityType__Group__6__Impl4497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityType__Group_3__0__Impl_in_rule__EntityType__Group_3__04542 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EntityType__Group_3__1_in_rule__EntityType__Group_3__04545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__EntityType__Group_3__0__Impl4573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityType__Group_3__1__Impl_in_rule__EntityType__Group_3__14604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityType__ParentAssignment_3_1_in_rule__EntityType__Group_3__1__Impl4631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group__0__Impl_in_rule__Property__Group__04665 = new BitSet(new long[]{0x0000000000700010L});
    public static final BitSet FOLLOW_rule__Property__Group__1_in_rule__Property__Group__04668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__StorageModifierAssignment_0_in_rule__Property__Group__0__Impl4695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group__1__Impl_in_rule__Property__Group__14726 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Property__Group__2_in_rule__Property__Group__14729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__TypeAssignment_1_in_rule__Property__Group__1__Impl4756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group__2__Impl_in_rule__Property__Group__24786 = new BitSet(new long[]{0x00000038000C0000L});
    public static final BitSet FOLLOW_rule__Property__Group__3_in_rule__Property__Group__24789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__NameAssignment_2_in_rule__Property__Group__2__Impl4816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group__3__Impl_in_rule__Property__Group__34846 = new BitSet(new long[]{0x00000038000C0000L});
    public static final BitSet FOLLOW_rule__Property__Group__4_in_rule__Property__Group__34849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__RelationshipAssignment_3_in_rule__Property__Group__3__Impl4876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group__4__Impl_in_rule__Property__Group__44907 = new BitSet(new long[]{0x00000038000C0000L});
    public static final BitSet FOLLOW_rule__Property__Group__5_in_rule__Property__Group__44910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group_4__0_in_rule__Property__Group__4__Impl4937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group__5__Impl_in_rule__Property__Group__54968 = new BitSet(new long[]{0x00000038000C0000L});
    public static final BitSet FOLLOW_rule__Property__Group__6_in_rule__Property__Group__54971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group_5__0_in_rule__Property__Group__5__Impl4998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group__6__Impl_in_rule__Property__Group__65029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group_6__0_in_rule__Property__Group__6__Impl5056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group_4__0__Impl_in_rule__Property__Group_4__05101 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Property__Group_4__1_in_rule__Property__Group_4__05104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Property__Group_4__0__Impl5132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group_4__1__Impl_in_rule__Property__Group_4__15163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__OrderByAssignment_4_1_in_rule__Property__Group_4__1__Impl5190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group_5__0__Impl_in_rule__Property__Group_5__05224 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Property__Group_5__1_in_rule__Property__Group_5__05227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Property__Group_5__0__Impl5255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group_5__1__Impl_in_rule__Property__Group_5__15286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__MapKeyAssignment_5_1_in_rule__Property__Group_5__1__Impl5313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group_6__0__Impl_in_rule__Property__Group_6__05347 = new BitSet(new long[]{0x000000000000F0F0L});
    public static final BitSet FOLLOW_rule__Property__Group_6__1_in_rule__Property__Group_6__05350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Property__Group_6__0__Impl5378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group_6__1__Impl_in_rule__Property__Group_6__15409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__LiteralAssignment_6_1_in_rule__Property__Group_6__1__Impl5436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityRelationship__Group__0__Impl_in_rule__EntityRelationship__Group__05470 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_rule__EntityRelationship__Group__1_in_rule__EntityRelationship__Group__05473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityRelationship__Group__1__Impl_in_rule__EntityRelationship__Group__15531 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EntityRelationship__Group__2_in_rule__EntityRelationship__Group__15534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityRelationship__KindAssignment_1_in_rule__EntityRelationship__Group__1__Impl5561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityRelationship__Group__2__Impl_in_rule__EntityRelationship__Group__25591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityRelationship__MappedByAssignment_2_in_rule__EntityRelationship__Group__2__Impl5618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MappedByReference__Group__0__Impl_in_rule__MappedByReference__Group__05655 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__MappedByReference__Group__1_in_rule__MappedByReference__Group__05658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MappedByReference__BaseAssignment_0_in_rule__MappedByReference__Group__0__Impl5685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MappedByReference__Group__1__Impl_in_rule__MappedByReference__Group__15715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MappedByReference__Group_1__0_in_rule__MappedByReference__Group__1__Impl5742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MappedByReference__Group_1__0__Impl_in_rule__MappedByReference__Group_1__05777 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__MappedByReference__Group_1__1_in_rule__MappedByReference__Group_1__05780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__MappedByReference__Group_1__0__Impl5808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MappedByReference__Group_1__1__Impl_in_rule__MappedByReference__Group_1__15839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MappedByReference__PathAssignment_1_1_in_rule__MappedByReference__Group_1__1__Impl5866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__05900 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__05903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl5930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__15959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl5986 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__06021 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__06024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__QualifiedName__Group_1__0__Impl6052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__16083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl6110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group__0__Impl_in_rule__QualifiedNameWithWildcard__Group__06143 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group__1_in_rule__QualifiedNameWithWildcard__Group__06146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__QualifiedNameWithWildcard__Group__0__Impl6173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group__1__Impl_in_rule__QualifiedNameWithWildcard__Group__16202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group_1__0_in_rule__QualifiedNameWithWildcard__Group__1__Impl6229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group_1__0__Impl_in_rule__QualifiedNameWithWildcard__Group_1__06264 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group_1__1_in_rule__QualifiedNameWithWildcard__Group_1__06267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__QualifiedNameWithWildcard__Group_1__0__Impl6295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group_1__1__Impl_in_rule__QualifiedNameWithWildcard__Group_1__16326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__QualifiedNameWithWildcard__Group_1__1__Impl6354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NUMBER__Group_0__0__Impl_in_rule__NUMBER__Group_0__06389 = new BitSet(new long[]{0x000000000000C020L});
    public static final BitSet FOLLOW_rule__NUMBER__Group_0__1_in_rule__NUMBER__Group_0__06392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NUMBER__Alternatives_0_0_in_rule__NUMBER__Group_0__0__Impl6419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NUMBER__Group_0__1__Impl_in_rule__NUMBER__Group_0__16450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__NUMBER__Group_0__1__Impl6477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NUMBER__Group_1__0__Impl_in_rule__NUMBER__Group_1__06510 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__NUMBER__Group_1__1_in_rule__NUMBER__Group_1__06513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__NUMBER__Group_1__0__Impl6540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NUMBER__Group_1__1__Impl_in_rule__NUMBER__Group_1__16569 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__NUMBER__Group_1__2_in_rule__NUMBER__Group_1__16572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__NUMBER__Group_1__1__Impl6600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NUMBER__Group_1__2__Impl_in_rule__NUMBER__Group_1__26631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__NUMBER__Group_1__2__Impl6658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Model__NameAssignment_16698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_rule__Model__ImportsAssignment_26729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexType_in_rule__Model__TypesAssignment_36760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_rule__Import__ImportedNamespaceAssignment_16791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeReference_in_rule__CollectionType__ReferenceAssignment_06822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__CollectionType__SizeAssignment_26853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeReference_in_rule__MapType__ReferenceAssignment_06884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeReference_in_rule__MapType__MapTypeAssignment_2_06915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__MapType__SizeAssignment_46946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__TypeReference__ReferenceAssignment6981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__PrimitiveType__NameAssignment7016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EnumerationType__NameAssignment_17047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__EnumerationType__ParentAssignment_2_17082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumerationLiteral_in_rule__EnumerationType__LiteralsAssignment_47117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumerationLiteral_in_rule__EnumerationType__LiteralsAssignment_5_17148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EnumerationLiteral__NameAssignment7179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeStorageModifier_in_rule__EntityType__StorageModifierAssignment_17210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EntityType__NameAssignment_27241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__EntityType__ParentAssignment_3_17276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_rule__EntityType__PropertiesAssignment_57311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyStorageModifier_in_rule__Property__StorageModifierAssignment_07342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclarationTypeReference_in_rule__Property__TypeAssignment_17373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Property__NameAssignment_27404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntityRelationship_in_rule__Property__RelationshipAssignment_37435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyReference_in_rule__Property__OrderByAssignment_4_17466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyReference_in_rule__Property__MapKeyAssignment_5_17497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_rule__Property__LiteralAssignment_6_17528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntityRelationshipKind_in_rule__EntityRelationship__KindAssignment_17559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMappedByReference_in_rule__EntityRelationship__MappedByAssignment_27590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__MappedByReference__BaseAssignment_07625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMappedByReference_in_rule__MappedByReference__PathAssignment_1_17660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__StringLiteral__ValueAssignment7691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CHARACTER_in_rule__CharLiteral__ValueAssignment7722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNUMBER_in_rule__NumberLiteral__ValueAssignment7753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBOOLEAN_in_rule__BooleanLiteral__ValueAssignment7784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__PropertyReference__ReferenceAssignment7819 = new BitSet(new long[]{0x0000000000000002L});

}