package org.spp.cocome.types.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTypesLexer extends Lexer {
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
    public static final int EOF=-1;
    public static final int RULE_SL_COMMENT=9;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__19=19;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_STRING=6;
    public static final int T__16=16;
    public static final int T__33=33;
    public static final int T__15=15;
    public static final int T__34=34;
    public static final int T__18=18;
    public static final int T__35=35;
    public static final int T__17=17;
    public static final int T__36=36;
    public static final int T__12=12;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__14=14;
    public static final int T__39=39;
    public static final int T__13=13;
    public static final int RULE_INT=5;
    public static final int RULE_WS=10;

    // delegates
    // delegators

    public InternalTypesLexer() {;} 
    public InternalTypesLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalTypesLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g"; }

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:11:7: ( 'true' )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:11:9: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:12:7: ( 'false' )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:12:9: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:13:7: ( '+' )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:13:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:14:7: ( '-' )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:14:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:15:7: ( ' storable' )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:15:9: ' storable'
            {
            match(" storable"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:16:7: ( 'embeddable' )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:16:9: 'embeddable'
            {
            match("embeddable"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:17:7: ( 'unique' )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:17:9: 'unique'
            {
            match("unique"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:18:7: ( 'many' )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:18:9: 'many'
            {
            match("many"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:19:7: ( 'var' )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:19:9: 'var'
            {
            match("var"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:20:7: ( 'val' )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:20:9: 'val'
            {
            match("val"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:21:7: ( 'transient' )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:21:9: 'transient'
            {
            match("transient"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:22:7: ( 'package' )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:22:9: 'package'
            {
            match("package"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:23:7: ( 'import' )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:23:9: 'import'
            {
            match("import"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:24:7: ( '[' )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:24:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:25:7: ( ']' )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:25:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:26:7: ( '<' )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:26:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:27:7: ( '>' )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:27:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:28:7: ( 'enum' )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:28:9: 'enum'
            {
            match("enum"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:29:7: ( '{' )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:29:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:30:7: ( '}' )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:30:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:31:7: ( ':' )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:31:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:32:7: ( ',' )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:32:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:33:7: ( 'entity' )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:33:9: 'entity'
            {
            match("entity"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:34:7: ( 'order' )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:34:9: 'order'
            {
            match("order"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:35:7: ( 'key' )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:35:9: 'key'
            {
            match("key"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:36:7: ( '=' )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:36:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:37:7: ( '.' )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:37:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:38:7: ( '*' )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:38:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "RULE_CHARACTER"
    public final void mRULE_CHARACTER() throws RecognitionException {
        try {
            int _type = RULE_CHARACTER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3879:16: ( '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) ) '\\'' )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3879:18: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) ) '\\''
            {
            match('\''); 
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3879:23: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='\\') ) {
                alt1=1;
            }
            else if ( ((LA1_0>='\u0000' && LA1_0<='&')||(LA1_0>='(' && LA1_0<='[')||(LA1_0>=']' && LA1_0<='\uFFFF')) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3879:24: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    {
                    match('\\'); 
                    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;
                case 2 :
                    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3879:69: ~ ( ( '\\\\' | '\\'' ) )
                    {
                    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }

            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_CHARACTER"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3881:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3881:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3881:11: ( '^' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='^') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3881:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3881:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3883:10: ( ( '0' .. '9' )+ )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3883:12: ( '0' .. '9' )+
            {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3883:12: ( '0' .. '9' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3883:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3885:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3885:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3885:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='\"') ) {
                alt7=1;
            }
            else if ( (LA7_0=='\'') ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3885:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3885:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='!')||(LA5_0>='#' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3885:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3885:66: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3885:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3885:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='\\') ) {
                            alt6=1;
                        }
                        else if ( ((LA6_0>='\u0000' && LA6_0<='&')||(LA6_0>='(' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFF')) ) {
                            alt6=2;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3885:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3885:137: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3887:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3887:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3887:24: ( options {greedy=false; } : . )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0=='*') ) {
                    int LA8_1 = input.LA(2);

                    if ( (LA8_1=='/') ) {
                        alt8=2;
                    }
                    else if ( ((LA8_1>='\u0000' && LA8_1<='.')||(LA8_1>='0' && LA8_1<='\uFFFF')) ) {
                        alt8=1;
                    }


                }
                else if ( ((LA8_0>='\u0000' && LA8_0<=')')||(LA8_0>='+' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3887:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3889:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3889:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3889:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='\u0000' && LA9_0<='\t')||(LA9_0>='\u000B' && LA9_0<='\f')||(LA9_0>='\u000E' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3889:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3889:40: ( ( '\\r' )? '\\n' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\n'||LA11_0=='\r') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3889:41: ( '\\r' )? '\\n'
                    {
                    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3889:41: ( '\\r' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='\r') ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3889:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3891:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3891:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3891:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3893:16: ( . )
            // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:3893:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1:8: ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | RULE_CHARACTER | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt13=36;
        alt13 = dfa13.predict(input);
        switch (alt13) {
            case 1 :
                // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1:10: T__12
                {
                mT__12(); 

                }
                break;
            case 2 :
                // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1:16: T__13
                {
                mT__13(); 

                }
                break;
            case 3 :
                // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1:22: T__14
                {
                mT__14(); 

                }
                break;
            case 4 :
                // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1:28: T__15
                {
                mT__15(); 

                }
                break;
            case 5 :
                // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1:34: T__16
                {
                mT__16(); 

                }
                break;
            case 6 :
                // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1:40: T__17
                {
                mT__17(); 

                }
                break;
            case 7 :
                // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1:46: T__18
                {
                mT__18(); 

                }
                break;
            case 8 :
                // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1:52: T__19
                {
                mT__19(); 

                }
                break;
            case 9 :
                // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1:58: T__20
                {
                mT__20(); 

                }
                break;
            case 10 :
                // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1:64: T__21
                {
                mT__21(); 

                }
                break;
            case 11 :
                // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1:70: T__22
                {
                mT__22(); 

                }
                break;
            case 12 :
                // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1:76: T__23
                {
                mT__23(); 

                }
                break;
            case 13 :
                // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1:82: T__24
                {
                mT__24(); 

                }
                break;
            case 14 :
                // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1:88: T__25
                {
                mT__25(); 

                }
                break;
            case 15 :
                // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1:94: T__26
                {
                mT__26(); 

                }
                break;
            case 16 :
                // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1:100: T__27
                {
                mT__27(); 

                }
                break;
            case 17 :
                // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1:106: T__28
                {
                mT__28(); 

                }
                break;
            case 18 :
                // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1:112: T__29
                {
                mT__29(); 

                }
                break;
            case 19 :
                // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1:118: T__30
                {
                mT__30(); 

                }
                break;
            case 20 :
                // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1:124: T__31
                {
                mT__31(); 

                }
                break;
            case 21 :
                // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1:130: T__32
                {
                mT__32(); 

                }
                break;
            case 22 :
                // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1:136: T__33
                {
                mT__33(); 

                }
                break;
            case 23 :
                // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1:142: T__34
                {
                mT__34(); 

                }
                break;
            case 24 :
                // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1:148: T__35
                {
                mT__35(); 

                }
                break;
            case 25 :
                // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1:154: T__36
                {
                mT__36(); 

                }
                break;
            case 26 :
                // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1:160: T__37
                {
                mT__37(); 

                }
                break;
            case 27 :
                // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1:166: T__38
                {
                mT__38(); 

                }
                break;
            case 28 :
                // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1:172: T__39
                {
                mT__39(); 

                }
                break;
            case 29 :
                // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1:178: RULE_CHARACTER
                {
                mRULE_CHARACTER(); 

                }
                break;
            case 30 :
                // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1:193: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 31 :
                // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1:201: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 32 :
                // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1:210: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 33 :
                // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1:222: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 34 :
                // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1:238: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 35 :
                // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1:254: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 36 :
                // ../org.spp.cocome.types.ui/src-gen/org/spp/cocome/types/ui/contentassist/antlr/internal/InternalTypes.g:1:262: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA13 dfa13 = new DFA13(this);
    static final String DFA13_eotS =
        "\1\uffff\2\42\2\uffff\1\47\6\42\10\uffff\2\42\3\uffff\2\40\2\uffff"+
        "\2\40\2\uffff\1\42\1\uffff\1\42\4\uffff\7\42\10\uffff\2\42\11\uffff"+
        "\10\42\1\132\1\133\3\42\1\137\2\uffff\1\141\3\42\1\145\2\42\1\150"+
        "\2\uffff\3\42\3\uffff\1\42\1\155\1\42\1\uffff\2\42\1\uffff\2\42"+
        "\1\163\1\42\1\uffff\1\42\1\166\1\167\1\42\1\171\1\uffff\2\42\2\uffff"+
        "\1\174\1\uffff\2\42\1\uffff\1\177\1\42\1\uffff\1\u0081\1\uffff";
    static final String DFA13_eofS =
        "\u0082\uffff";
    static final String DFA13_minS =
        "\1\0\1\162\1\141\2\uffff\1\163\1\155\1\156\3\141\1\155\10\uffff"+
        "\1\162\1\145\3\uffff\1\0\1\101\2\uffff\1\0\1\52\2\uffff\1\141\1"+
        "\uffff\1\154\4\uffff\1\142\1\164\1\151\1\156\1\154\1\143\1\160\10"+
        "\uffff\1\144\1\171\3\uffff\1\42\1\0\4\uffff\1\145\1\156\1\163\1"+
        "\145\1\155\1\151\1\161\1\171\2\60\1\153\1\157\1\145\1\60\1\0\1\uffff"+
        "\1\60\1\163\1\145\1\144\1\60\1\164\1\165\1\60\2\uffff\1\141\2\162"+
        "\3\uffff\1\151\1\60\1\144\1\uffff\1\171\1\145\1\uffff\1\147\1\164"+
        "\1\60\1\145\1\uffff\1\141\2\60\1\145\1\60\1\uffff\1\156\1\142\2"+
        "\uffff\1\60\1\uffff\1\164\1\154\1\uffff\1\60\1\145\1\uffff\1\60"+
        "\1\uffff";
    static final String DFA13_maxS =
        "\1\uffff\1\162\1\141\2\uffff\1\163\2\156\3\141\1\155\10\uffff\1"+
        "\162\1\145\3\uffff\1\uffff\1\172\2\uffff\1\uffff\1\57\2\uffff\1"+
        "\165\1\uffff\1\154\4\uffff\1\142\1\165\1\151\1\156\1\162\1\143\1"+
        "\160\10\uffff\1\144\1\171\3\uffff\1\165\1\uffff\4\uffff\1\145\1"+
        "\156\1\163\1\145\1\155\1\151\1\161\1\171\2\172\1\153\1\157\1\145"+
        "\1\172\1\uffff\1\uffff\1\172\1\163\1\145\1\144\1\172\1\164\1\165"+
        "\1\172\2\uffff\1\141\2\162\3\uffff\1\151\1\172\1\144\1\uffff\1\171"+
        "\1\145\1\uffff\1\147\1\164\1\172\1\145\1\uffff\1\141\2\172\1\145"+
        "\1\172\1\uffff\1\156\1\142\2\uffff\1\172\1\uffff\1\164\1\154\1\uffff"+
        "\1\172\1\145\1\uffff\1\172\1\uffff";
    static final String DFA13_acceptS =
        "\3\uffff\1\3\1\4\7\uffff\1\16\1\17\1\20\1\21\1\23\1\24\1\25\1\26"+
        "\2\uffff\1\32\1\33\1\34\2\uffff\1\36\1\37\2\uffff\1\43\1\44\1\uffff"+
        "\1\36\1\uffff\1\3\1\4\1\5\1\43\7\uffff\1\16\1\17\1\20\1\21\1\23"+
        "\1\24\1\25\1\26\2\uffff\1\32\1\33\1\34\2\uffff\1\40\1\37\1\41\1"+
        "\42\17\uffff\1\35\10\uffff\1\11\1\12\3\uffff\1\31\1\35\1\1\3\uffff"+
        "\1\22\2\uffff\1\10\4\uffff\1\2\5\uffff\1\30\2\uffff\1\27\1\7\1\uffff"+
        "\1\15\2\uffff\1\14\2\uffff\1\13\1\uffff\1\6";
    static final String DFA13_specialS =
        "\1\2\30\uffff\1\0\3\uffff\1\1\37\uffff\1\4\22\uffff\1\3\61\uffff}>";
    static final String[] DFA13_transitionS = {
            "\11\40\2\37\2\40\1\37\22\40\1\5\1\40\1\35\4\40\1\31\2\40\1\30"+
            "\1\3\1\23\1\4\1\27\1\36\12\34\1\22\1\40\1\16\1\26\1\17\2\40"+
            "\32\33\1\14\1\40\1\15\1\32\1\33\1\40\4\33\1\6\1\2\2\33\1\13"+
            "\1\33\1\25\1\33\1\10\1\33\1\24\1\12\3\33\1\1\1\7\1\11\4\33\1"+
            "\20\1\40\1\21\uff82\40",
            "\1\41",
            "\1\43",
            "",
            "",
            "\1\46",
            "\1\50\1\51",
            "\1\52",
            "\1\53",
            "\1\54",
            "\1\55",
            "\1\56",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\67",
            "\1\70",
            "",
            "",
            "",
            "\47\75\1\76\64\75\1\74\uffa3\75",
            "\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "",
            "\0\76",
            "\1\100\4\uffff\1\101",
            "",
            "",
            "\1\103\23\uffff\1\102",
            "",
            "\1\104",
            "",
            "",
            "",
            "",
            "\1\105",
            "\1\107\1\106",
            "\1\110",
            "\1\111",
            "\1\113\5\uffff\1\112",
            "\1\114",
            "\1\115",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\116",
            "\1\117",
            "",
            "",
            "",
            "\1\120\4\uffff\1\120\64\uffff\1\120\5\uffff\1\120\3\uffff\1"+
            "\120\7\uffff\1\120\3\uffff\1\120\1\uffff\2\120",
            "\47\76\1\121\uffd8\76",
            "",
            "",
            "",
            "",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\126",
            "\1\127",
            "\1\130",
            "\1\131",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\134",
            "\1\135",
            "\1\136",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\47\76\1\121\uffd8\76",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\142",
            "\1\143",
            "\1\144",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\146",
            "\1\147",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "",
            "\1\151",
            "\1\152",
            "\1\153",
            "",
            "",
            "",
            "\1\154",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\156",
            "",
            "\1\157",
            "\1\160",
            "",
            "\1\161",
            "\1\162",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\164",
            "",
            "\1\165",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\170",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "\1\172",
            "\1\173",
            "",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "\1\175",
            "\1\176",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u0080",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            ""
    };

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | RULE_CHARACTER | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA13_25 = input.LA(1);

                        s = -1;
                        if ( (LA13_25=='\\') ) {s = 60;}

                        else if ( ((LA13_25>='\u0000' && LA13_25<='&')||(LA13_25>='(' && LA13_25<='[')||(LA13_25>=']' && LA13_25<='\uFFFF')) ) {s = 61;}

                        else if ( (LA13_25=='\'') ) {s = 62;}

                        else s = 32;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA13_29 = input.LA(1);

                        s = -1;
                        if ( ((LA13_29>='\u0000' && LA13_29<='\uFFFF')) ) {s = 62;}

                        else s = 32;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA13_0 = input.LA(1);

                        s = -1;
                        if ( (LA13_0=='t') ) {s = 1;}

                        else if ( (LA13_0=='f') ) {s = 2;}

                        else if ( (LA13_0=='+') ) {s = 3;}

                        else if ( (LA13_0=='-') ) {s = 4;}

                        else if ( (LA13_0==' ') ) {s = 5;}

                        else if ( (LA13_0=='e') ) {s = 6;}

                        else if ( (LA13_0=='u') ) {s = 7;}

                        else if ( (LA13_0=='m') ) {s = 8;}

                        else if ( (LA13_0=='v') ) {s = 9;}

                        else if ( (LA13_0=='p') ) {s = 10;}

                        else if ( (LA13_0=='i') ) {s = 11;}

                        else if ( (LA13_0=='[') ) {s = 12;}

                        else if ( (LA13_0==']') ) {s = 13;}

                        else if ( (LA13_0=='<') ) {s = 14;}

                        else if ( (LA13_0=='>') ) {s = 15;}

                        else if ( (LA13_0=='{') ) {s = 16;}

                        else if ( (LA13_0=='}') ) {s = 17;}

                        else if ( (LA13_0==':') ) {s = 18;}

                        else if ( (LA13_0==',') ) {s = 19;}

                        else if ( (LA13_0=='o') ) {s = 20;}

                        else if ( (LA13_0=='k') ) {s = 21;}

                        else if ( (LA13_0=='=') ) {s = 22;}

                        else if ( (LA13_0=='.') ) {s = 23;}

                        else if ( (LA13_0=='*') ) {s = 24;}

                        else if ( (LA13_0=='\'') ) {s = 25;}

                        else if ( (LA13_0=='^') ) {s = 26;}

                        else if ( ((LA13_0>='A' && LA13_0<='Z')||LA13_0=='_'||(LA13_0>='a' && LA13_0<='d')||(LA13_0>='g' && LA13_0<='h')||LA13_0=='j'||LA13_0=='l'||LA13_0=='n'||(LA13_0>='q' && LA13_0<='s')||(LA13_0>='w' && LA13_0<='z')) ) {s = 27;}

                        else if ( ((LA13_0>='0' && LA13_0<='9')) ) {s = 28;}

                        else if ( (LA13_0=='\"') ) {s = 29;}

                        else if ( (LA13_0=='/') ) {s = 30;}

                        else if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r') ) {s = 31;}

                        else if ( ((LA13_0>='\u0000' && LA13_0<='\b')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\u001F')||LA13_0=='!'||(LA13_0>='#' && LA13_0<='&')||(LA13_0>='(' && LA13_0<=')')||LA13_0==';'||(LA13_0>='?' && LA13_0<='@')||LA13_0=='\\'||LA13_0=='`'||LA13_0=='|'||(LA13_0>='~' && LA13_0<='\uFFFF')) ) {s = 32;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA13_80 = input.LA(1);

                        s = -1;
                        if ( (LA13_80=='\'') ) {s = 81;}

                        else if ( ((LA13_80>='\u0000' && LA13_80<='&')||(LA13_80>='(' && LA13_80<='\uFFFF')) ) {s = 62;}

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA13_61 = input.LA(1);

                        s = -1;
                        if ( (LA13_61=='\'') ) {s = 81;}

                        else if ( ((LA13_61>='\u0000' && LA13_61<='&')||(LA13_61>='(' && LA13_61<='\uFFFF')) ) {s = 62;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 13, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}