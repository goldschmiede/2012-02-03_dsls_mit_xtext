package de.goldschmiede.mapdsl.parser.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalMapDslLexer extends Lexer {
    public static final int RULE_ID=13;
    public static final int FRAGMENT_KEYWORD_3=22;
    public static final int RULE_ANY_OTHER=19;
    public static final int FRAGMENT_KEYWORD_4=23;
    public static final int FRAGMENT_KEYWORD_1=20;
    public static final int FRAGMENT_KEYWORD_2=21;
    public static final int FRAGMENT_KEYWORD_8=27;
    public static final int KEYWORD_1=4;
    public static final int FRAGMENT_RULE_ID=29;
    public static final int FRAGMENT_KEYWORD_7=26;
    public static final int FRAGMENT_KEYWORD_6=25;
    public static final int FRAGMENT_KEYWORD_5=24;
    public static final int KEYWORD_5=8;
    public static final int KEYWORD_4=7;
    public static final int KEYWORD_3=6;
    public static final int FRAGMENT_KEYWORD_9=28;
    public static final int KEYWORD_2=5;
    public static final int EOF=-1;
    public static final int RULE_SL_COMMENT=17;
    public static final int RULE_ML_COMMENT=16;
    public static final int RULE_STRING=15;
    public static final int SYNTHETIC_ALL_KEYWORDS=36;
    public static final int FRAGMENT_RULE_STRING=31;
    public static final int FRAGMENT_RULE_INT=30;
    public static final int KEYWORD_6=9;
    public static final int KEYWORD_7=10;
    public static final int KEYWORD_8=11;
    public static final int KEYWORD_9=12;
    public static final int FRAGMENT_RULE_ML_COMMENT=32;
    public static final int RULE_INT=14;
    public static final int FRAGMENT_RULE_SL_COMMENT=33;
    public static final int FRAGMENT_RULE_WS=34;
    public static final int FRAGMENT_RULE_ANY_OTHER=35;
    public static final int RULE_WS=18;

    // delegates
    // delegators

    public InternalMapDslLexer() {;} 
    public InternalMapDslLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalMapDslLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
        state.ruleMemo = new HashMap[82+1];
 
    }
    public String getGrammarFileName() { return "../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/lexer/InternalMapDslLexer.g"; }

    // $ANTLR start "SYNTHETIC_ALL_KEYWORDS"
    public final void mSYNTHETIC_ALL_KEYWORDS() throws RecognitionException {
        int SYNTHETIC_ALL_KEYWORDS_StartIndex = input.index();
        try {
            int _type = SYNTHETIC_ALL_KEYWORDS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return ; }
            // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/lexer/InternalMapDslLexer.g:41:24: ( ( FRAGMENT_KEYWORD_1 )=> FRAGMENT_KEYWORD_1 | ( FRAGMENT_KEYWORD_2 )=> FRAGMENT_KEYWORD_2 | ( FRAGMENT_KEYWORD_3 )=> FRAGMENT_KEYWORD_3 | ( FRAGMENT_KEYWORD_4 )=> FRAGMENT_KEYWORD_4 | ( FRAGMENT_KEYWORD_5 )=> FRAGMENT_KEYWORD_5 | ( FRAGMENT_KEYWORD_6 )=> FRAGMENT_KEYWORD_6 | ( FRAGMENT_KEYWORD_7 )=> FRAGMENT_KEYWORD_7 | ( FRAGMENT_KEYWORD_8 )=> FRAGMENT_KEYWORD_8 | ( FRAGMENT_KEYWORD_9 )=> FRAGMENT_KEYWORD_9 | ( FRAGMENT_RULE_ID )=> FRAGMENT_RULE_ID | ( FRAGMENT_RULE_INT )=> FRAGMENT_RULE_INT | ( FRAGMENT_RULE_STRING )=> FRAGMENT_RULE_STRING | ( FRAGMENT_RULE_ML_COMMENT )=> FRAGMENT_RULE_ML_COMMENT | ( FRAGMENT_RULE_SL_COMMENT )=> FRAGMENT_RULE_SL_COMMENT | ( FRAGMENT_RULE_WS )=> FRAGMENT_RULE_WS | ( FRAGMENT_RULE_ANY_OTHER )=> FRAGMENT_RULE_ANY_OTHER )
            int alt1=16;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/lexer/InternalMapDslLexer.g:42:2: ( FRAGMENT_KEYWORD_1 )=> FRAGMENT_KEYWORD_1
                    {
                    mFRAGMENT_KEYWORD_1(); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                      _type = KEYWORD_1; 
                    }

                    }
                    break;
                case 2 :
                    // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/lexer/InternalMapDslLexer.g:43:2: ( FRAGMENT_KEYWORD_2 )=> FRAGMENT_KEYWORD_2
                    {
                    mFRAGMENT_KEYWORD_2(); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                      _type = KEYWORD_2; 
                    }

                    }
                    break;
                case 3 :
                    // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/lexer/InternalMapDslLexer.g:44:2: ( FRAGMENT_KEYWORD_3 )=> FRAGMENT_KEYWORD_3
                    {
                    mFRAGMENT_KEYWORD_3(); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                      _type = KEYWORD_3; 
                    }

                    }
                    break;
                case 4 :
                    // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/lexer/InternalMapDslLexer.g:45:2: ( FRAGMENT_KEYWORD_4 )=> FRAGMENT_KEYWORD_4
                    {
                    mFRAGMENT_KEYWORD_4(); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                      _type = KEYWORD_4; 
                    }

                    }
                    break;
                case 5 :
                    // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/lexer/InternalMapDslLexer.g:46:2: ( FRAGMENT_KEYWORD_5 )=> FRAGMENT_KEYWORD_5
                    {
                    mFRAGMENT_KEYWORD_5(); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                      _type = KEYWORD_5; 
                    }

                    }
                    break;
                case 6 :
                    // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/lexer/InternalMapDslLexer.g:47:2: ( FRAGMENT_KEYWORD_6 )=> FRAGMENT_KEYWORD_6
                    {
                    mFRAGMENT_KEYWORD_6(); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                      _type = KEYWORD_6; 
                    }

                    }
                    break;
                case 7 :
                    // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/lexer/InternalMapDslLexer.g:48:2: ( FRAGMENT_KEYWORD_7 )=> FRAGMENT_KEYWORD_7
                    {
                    mFRAGMENT_KEYWORD_7(); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                      _type = KEYWORD_7; 
                    }

                    }
                    break;
                case 8 :
                    // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/lexer/InternalMapDslLexer.g:49:2: ( FRAGMENT_KEYWORD_8 )=> FRAGMENT_KEYWORD_8
                    {
                    mFRAGMENT_KEYWORD_8(); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                      _type = KEYWORD_8; 
                    }

                    }
                    break;
                case 9 :
                    // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/lexer/InternalMapDslLexer.g:50:2: ( FRAGMENT_KEYWORD_9 )=> FRAGMENT_KEYWORD_9
                    {
                    mFRAGMENT_KEYWORD_9(); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                      _type = KEYWORD_9; 
                    }

                    }
                    break;
                case 10 :
                    // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/lexer/InternalMapDslLexer.g:51:2: ( FRAGMENT_RULE_ID )=> FRAGMENT_RULE_ID
                    {
                    mFRAGMENT_RULE_ID(); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                      _type = RULE_ID; 
                    }

                    }
                    break;
                case 11 :
                    // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/lexer/InternalMapDslLexer.g:52:2: ( FRAGMENT_RULE_INT )=> FRAGMENT_RULE_INT
                    {
                    mFRAGMENT_RULE_INT(); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                      _type = RULE_INT; 
                    }

                    }
                    break;
                case 12 :
                    // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/lexer/InternalMapDslLexer.g:53:2: ( FRAGMENT_RULE_STRING )=> FRAGMENT_RULE_STRING
                    {
                    mFRAGMENT_RULE_STRING(); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                      _type = RULE_STRING; 
                    }

                    }
                    break;
                case 13 :
                    // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/lexer/InternalMapDslLexer.g:54:2: ( FRAGMENT_RULE_ML_COMMENT )=> FRAGMENT_RULE_ML_COMMENT
                    {
                    mFRAGMENT_RULE_ML_COMMENT(); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                      _type = RULE_ML_COMMENT; 
                    }

                    }
                    break;
                case 14 :
                    // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/lexer/InternalMapDslLexer.g:55:2: ( FRAGMENT_RULE_SL_COMMENT )=> FRAGMENT_RULE_SL_COMMENT
                    {
                    mFRAGMENT_RULE_SL_COMMENT(); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                      _type = RULE_SL_COMMENT; 
                    }

                    }
                    break;
                case 15 :
                    // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/lexer/InternalMapDslLexer.g:56:2: ( FRAGMENT_RULE_WS )=> FRAGMENT_RULE_WS
                    {
                    mFRAGMENT_RULE_WS(); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                      _type = RULE_WS; 
                    }

                    }
                    break;
                case 16 :
                    // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/lexer/InternalMapDslLexer.g:57:2: ( FRAGMENT_RULE_ANY_OTHER )=> FRAGMENT_RULE_ANY_OTHER
                    {
                    mFRAGMENT_RULE_ANY_OTHER(); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                      _type = RULE_ANY_OTHER; 
                    }

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 1, SYNTHETIC_ALL_KEYWORDS_StartIndex); }
        }
    }
    // $ANTLR end "SYNTHETIC_ALL_KEYWORDS"

    // $ANTLR start "FRAGMENT_KEYWORD_1"
    public final void mFRAGMENT_KEYWORD_1() throws RecognitionException {
        int FRAGMENT_KEYWORD_1_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return ; }
            // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/lexer/InternalMapDslLexer.g:59:29: ( '.' )
            // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/lexer/InternalMapDslLexer.g:59:31: '.'
            {
            match('.'); if (state.failed) return ;

            }

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 2, FRAGMENT_KEYWORD_1_StartIndex); }
        }
    }
    // $ANTLR end "FRAGMENT_KEYWORD_1"

    // $ANTLR start "FRAGMENT_KEYWORD_2"
    public final void mFRAGMENT_KEYWORD_2() throws RecognitionException {
        int FRAGMENT_KEYWORD_2_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return ; }
            // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/lexer/InternalMapDslLexer.g:61:29: ( '{' )
            // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/lexer/InternalMapDslLexer.g:61:31: '{'
            {
            match('{'); if (state.failed) return ;

            }

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 3, FRAGMENT_KEYWORD_2_StartIndex); }
        }
    }
    // $ANTLR end "FRAGMENT_KEYWORD_2"

    // $ANTLR start "FRAGMENT_KEYWORD_3"
    public final void mFRAGMENT_KEYWORD_3() throws RecognitionException {
        int FRAGMENT_KEYWORD_3_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return ; }
            // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/lexer/InternalMapDslLexer.g:63:29: ( '}' )
            // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/lexer/InternalMapDslLexer.g:63:31: '}'
            {
            match('}'); if (state.failed) return ;

            }

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 4, FRAGMENT_KEYWORD_3_StartIndex); }
        }
    }
    // $ANTLR end "FRAGMENT_KEYWORD_3"

    // $ANTLR start "FRAGMENT_KEYWORD_4"
    public final void mFRAGMENT_KEYWORD_4() throws RecognitionException {
        int FRAGMENT_KEYWORD_4_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return ; }
            // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/lexer/InternalMapDslLexer.g:65:29: ( '.*' )
            // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/lexer/InternalMapDslLexer.g:65:31: '.*'
            {
            match(".*"); if (state.failed) return ;


            }

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 5, FRAGMENT_KEYWORD_4_StartIndex); }
        }
    }
    // $ANTLR end "FRAGMENT_KEYWORD_4"

    // $ANTLR start "FRAGMENT_KEYWORD_5"
    public final void mFRAGMENT_KEYWORD_5() throws RecognitionException {
        int FRAGMENT_KEYWORD_5_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return ; }
            // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/lexer/InternalMapDslLexer.g:67:29: ( '=>' )
            // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/lexer/InternalMapDslLexer.g:67:31: '=>'
            {
            match("=>"); if (state.failed) return ;


            }

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 6, FRAGMENT_KEYWORD_5_StartIndex); }
        }
    }
    // $ANTLR end "FRAGMENT_KEYWORD_5"

    // $ANTLR start "FRAGMENT_KEYWORD_6"
    public final void mFRAGMENT_KEYWORD_6() throws RecognitionException {
        int FRAGMENT_KEYWORD_6_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return ; }
            // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/lexer/InternalMapDslLexer.g:69:29: ( 'to' )
            // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/lexer/InternalMapDslLexer.g:69:31: 'to'
            {
            match("to"); if (state.failed) return ;


            }

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 7, FRAGMENT_KEYWORD_6_StartIndex); }
        }
    }
    // $ANTLR end "FRAGMENT_KEYWORD_6"

    // $ANTLR start "FRAGMENT_KEYWORD_7"
    public final void mFRAGMENT_KEYWORD_7() throws RecognitionException {
        int FRAGMENT_KEYWORD_7_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return ; }
            // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/lexer/InternalMapDslLexer.g:71:29: ( 'with' )
            // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/lexer/InternalMapDslLexer.g:71:31: 'with'
            {
            match("with"); if (state.failed) return ;


            }

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 8, FRAGMENT_KEYWORD_7_StartIndex); }
        }
    }
    // $ANTLR end "FRAGMENT_KEYWORD_7"

    // $ANTLR start "FRAGMENT_KEYWORD_8"
    public final void mFRAGMENT_KEYWORD_8() throws RecognitionException {
        int FRAGMENT_KEYWORD_8_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return ; }
            // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/lexer/InternalMapDslLexer.g:73:29: ( 'import' )
            // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/lexer/InternalMapDslLexer.g:73:31: 'import'
            {
            match("import"); if (state.failed) return ;


            }

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 9, FRAGMENT_KEYWORD_8_StartIndex); }
        }
    }
    // $ANTLR end "FRAGMENT_KEYWORD_8"

    // $ANTLR start "FRAGMENT_KEYWORD_9"
    public final void mFRAGMENT_KEYWORD_9() throws RecognitionException {
        int FRAGMENT_KEYWORD_9_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return ; }
            // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/lexer/InternalMapDslLexer.g:75:29: ( 'map BO' )
            // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/lexer/InternalMapDslLexer.g:75:31: 'map BO'
            {
            match("map BO"); if (state.failed) return ;


            }

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 10, FRAGMENT_KEYWORD_9_StartIndex); }
        }
    }
    // $ANTLR end "FRAGMENT_KEYWORD_9"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        int RULE_ID_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return ; }
            // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/lexer/InternalMapDslLexer.g:80:18: ( FRAGMENT_RULE_ID )
            // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/lexer/InternalMapDslLexer.g:80:20: FRAGMENT_RULE_ID
            {
            mFRAGMENT_RULE_ID(); if (state.failed) return ;

            }

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 11, RULE_ID_StartIndex); }
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "FRAGMENT_RULE_ID"
    public final void mFRAGMENT_RULE_ID() throws RecognitionException {
        int FRAGMENT_RULE_ID_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return ; }
            // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/lexer/InternalMapDslLexer.g:81:27: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/lexer/InternalMapDslLexer.g:81:29: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/lexer/InternalMapDslLexer.g:81:29: ( '^' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='^') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/lexer/InternalMapDslLexer.g:0:0: '^'
                    {
                    match('^'); if (state.failed) return ;

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/lexer/InternalMapDslLexer.g:81:58: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/lexer/InternalMapDslLexer.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();
            	    state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
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

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 12, FRAGMENT_RULE_ID_StartIndex); }
        }
    }
    // $ANTLR end "FRAGMENT_RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        int RULE_INT_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return ; }
            // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/lexer/InternalMapDslLexer.g:83:19: ( FRAGMENT_RULE_INT )
            // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/lexer/InternalMapDslLexer.g:83:21: FRAGMENT_RULE_INT
            {
            mFRAGMENT_RULE_INT(); if (state.failed) return ;

            }

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 13, RULE_INT_StartIndex); }
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "FRAGMENT_RULE_INT"
    public final void mFRAGMENT_RULE_INT() throws RecognitionException {
        int FRAGMENT_RULE_INT_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return ; }
            // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/lexer/InternalMapDslLexer.g:84:28: ( ( '0' .. '9' )+ )
            // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/lexer/InternalMapDslLexer.g:84:30: ( '0' .. '9' )+
            {
            // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/lexer/InternalMapDslLexer.g:84:30: ( '0' .. '9' )+
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
            	    // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/lexer/InternalMapDslLexer.g:84:31: '0' .. '9'
            	    {
            	    matchRange('0','9'); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
            	    if (state.backtracking>0) {state.failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            }

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 14, FRAGMENT_RULE_INT_StartIndex); }
        }
    }
    // $ANTLR end "FRAGMENT_RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        int RULE_STRING_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return ; }
            // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/lexer/InternalMapDslLexer.g:86:22: ( FRAGMENT_RULE_STRING )
            // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/lexer/InternalMapDslLexer.g:86:24: FRAGMENT_RULE_STRING
            {
            mFRAGMENT_RULE_STRING(); if (state.failed) return ;

            }

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 15, RULE_STRING_StartIndex); }
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "FRAGMENT_RULE_STRING"
    public final void mFRAGMENT_RULE_STRING() throws RecognitionException {
        int FRAGMENT_RULE_STRING_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return ; }
            // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/lexer/InternalMapDslLexer.g:87:31: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/lexer/InternalMapDslLexer.g:87:33: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/lexer/InternalMapDslLexer.g:87:33: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='\"') ) {
                alt7=1;
            }
            else if ( (LA7_0=='\'') ) {
                alt7=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/lexer/InternalMapDslLexer.g:87:34: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); if (state.failed) return ;
                    // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/lexer/InternalMapDslLexer.g:87:38: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/lexer/InternalMapDslLexer.g:87:39: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); if (state.failed) return ;
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();
                    	    state.failed=false;
                    	    }
                    	    else {
                    	        if (state.backtracking>0) {state.failed=true; return ;}
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/lexer/InternalMapDslLexer.g:87:84: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();
                    	    state.failed=false;
                    	    }
                    	    else {
                    	        if (state.backtracking>0) {state.failed=true; return ;}
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match('\"'); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/lexer/InternalMapDslLexer.g:87:104: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); if (state.failed) return ;
                    // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/lexer/InternalMapDslLexer.g:87:109: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/lexer/InternalMapDslLexer.g:87:110: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); if (state.failed) return ;
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();
                    	    state.failed=false;
                    	    }
                    	    else {
                    	        if (state.backtracking>0) {state.failed=true; return ;}
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/lexer/InternalMapDslLexer.g:87:155: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();
                    	    state.failed=false;
                    	    }
                    	    else {
                    	        if (state.backtracking>0) {state.failed=true; return ;}
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    match('\''); if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 16, FRAGMENT_RULE_STRING_StartIndex); }
        }
    }
    // $ANTLR end "FRAGMENT_RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        int RULE_ML_COMMENT_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return ; }
            // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/lexer/InternalMapDslLexer.g:89:26: ( FRAGMENT_RULE_ML_COMMENT )
            // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/lexer/InternalMapDslLexer.g:89:28: FRAGMENT_RULE_ML_COMMENT
            {
            mFRAGMENT_RULE_ML_COMMENT(); if (state.failed) return ;

            }

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 17, RULE_ML_COMMENT_StartIndex); }
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "FRAGMENT_RULE_ML_COMMENT"
    public final void mFRAGMENT_RULE_ML_COMMENT() throws RecognitionException {
        int FRAGMENT_RULE_ML_COMMENT_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return ; }
            // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/lexer/InternalMapDslLexer.g:90:35: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/lexer/InternalMapDslLexer.g:90:37: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); if (state.failed) return ;

            // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/lexer/InternalMapDslLexer.g:90:42: ( options {greedy=false; } : . )*
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
            	    // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/lexer/InternalMapDslLexer.g:90:70: .
            	    {
            	    matchAny(); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            match("*/"); if (state.failed) return ;


            }

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 18, FRAGMENT_RULE_ML_COMMENT_StartIndex); }
        }
    }
    // $ANTLR end "FRAGMENT_RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        int RULE_SL_COMMENT_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return ; }
            // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/lexer/InternalMapDslLexer.g:92:26: ( FRAGMENT_RULE_SL_COMMENT )
            // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/lexer/InternalMapDslLexer.g:92:28: FRAGMENT_RULE_SL_COMMENT
            {
            mFRAGMENT_RULE_SL_COMMENT(); if (state.failed) return ;

            }

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 19, RULE_SL_COMMENT_StartIndex); }
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "FRAGMENT_RULE_SL_COMMENT"
    public final void mFRAGMENT_RULE_SL_COMMENT() throws RecognitionException {
        int FRAGMENT_RULE_SL_COMMENT_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return ; }
            // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/lexer/InternalMapDslLexer.g:93:35: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/lexer/InternalMapDslLexer.g:93:37: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); if (state.failed) return ;

            // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/lexer/InternalMapDslLexer.g:93:42: (~ ( ( '\\n' | '\\r' ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='\u0000' && LA9_0<='\t')||(LA9_0>='\u000B' && LA9_0<='\f')||(LA9_0>='\u000E' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/lexer/InternalMapDslLexer.g:0:0: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();
            	    state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/lexer/InternalMapDslLexer.g:93:58: ( ( '\\r' )? '\\n' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\n'||LA11_0=='\r') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/lexer/InternalMapDslLexer.g:93:59: ( '\\r' )? '\\n'
                    {
                    // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/lexer/InternalMapDslLexer.g:93:59: ( '\\r' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='\r') ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/lexer/InternalMapDslLexer.g:0:0: '\\r'
                            {
                            match('\r'); if (state.failed) return ;

                            }
                            break;

                    }

                    match('\n'); if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 20, FRAGMENT_RULE_SL_COMMENT_StartIndex); }
        }
    }
    // $ANTLR end "FRAGMENT_RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        int RULE_WS_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return ; }
            // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/lexer/InternalMapDslLexer.g:95:18: ( FRAGMENT_RULE_WS )
            // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/lexer/InternalMapDslLexer.g:95:20: FRAGMENT_RULE_WS
            {
            mFRAGMENT_RULE_WS(); if (state.failed) return ;

            }

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 21, RULE_WS_StartIndex); }
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "FRAGMENT_RULE_WS"
    public final void mFRAGMENT_RULE_WS() throws RecognitionException {
        int FRAGMENT_RULE_WS_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return ; }
            // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/lexer/InternalMapDslLexer.g:96:27: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/lexer/InternalMapDslLexer.g:96:29: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/lexer/InternalMapDslLexer.g:96:29: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            	    // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/lexer/InternalMapDslLexer.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();
            	    state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
            	    if (state.backtracking>0) {state.failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);


            }

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 22, FRAGMENT_RULE_WS_StartIndex); }
        }
    }
    // $ANTLR end "FRAGMENT_RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        int RULE_ANY_OTHER_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return ; }
            // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/lexer/InternalMapDslLexer.g:98:25: ( FRAGMENT_RULE_ANY_OTHER )
            // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/lexer/InternalMapDslLexer.g:98:27: FRAGMENT_RULE_ANY_OTHER
            {
            mFRAGMENT_RULE_ANY_OTHER(); if (state.failed) return ;

            }

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 23, RULE_ANY_OTHER_StartIndex); }
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    // $ANTLR start "FRAGMENT_RULE_ANY_OTHER"
    public final void mFRAGMENT_RULE_ANY_OTHER() throws RecognitionException {
        int FRAGMENT_RULE_ANY_OTHER_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return ; }
            // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/lexer/InternalMapDslLexer.g:99:34: ( . )
            // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/lexer/InternalMapDslLexer.g:99:36: .
            {
            matchAny(); if (state.failed) return ;

            }

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 24, FRAGMENT_RULE_ANY_OTHER_StartIndex); }
        }
    }
    // $ANTLR end "FRAGMENT_RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/lexer/InternalMapDslLexer.g:1:8: ( SYNTHETIC_ALL_KEYWORDS )
        // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/lexer/InternalMapDslLexer.g:1:10: SYNTHETIC_ALL_KEYWORDS
        {
        mSYNTHETIC_ALL_KEYWORDS(); if (state.failed) return ;

        }


    }

    // $ANTLR start synpred1_InternalMapDslLexer
    public final void synpred1_InternalMapDslLexer_fragment() throws RecognitionException {   
        // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/lexer/InternalMapDslLexer.g:42:2: ( FRAGMENT_KEYWORD_1 )
        // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/lexer/InternalMapDslLexer.g:42:3: FRAGMENT_KEYWORD_1
        {
        mFRAGMENT_KEYWORD_1(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalMapDslLexer

    // $ANTLR start synpred2_InternalMapDslLexer
    public final void synpred2_InternalMapDslLexer_fragment() throws RecognitionException {   
        // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/lexer/InternalMapDslLexer.g:43:2: ( FRAGMENT_KEYWORD_2 )
        // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/lexer/InternalMapDslLexer.g:43:3: FRAGMENT_KEYWORD_2
        {
        mFRAGMENT_KEYWORD_2(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_InternalMapDslLexer

    // $ANTLR start synpred3_InternalMapDslLexer
    public final void synpred3_InternalMapDslLexer_fragment() throws RecognitionException {   
        // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/lexer/InternalMapDslLexer.g:44:2: ( FRAGMENT_KEYWORD_3 )
        // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/lexer/InternalMapDslLexer.g:44:3: FRAGMENT_KEYWORD_3
        {
        mFRAGMENT_KEYWORD_3(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred3_InternalMapDslLexer

    // $ANTLR start synpred4_InternalMapDslLexer
    public final void synpred4_InternalMapDslLexer_fragment() throws RecognitionException {   
        // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/lexer/InternalMapDslLexer.g:45:2: ( FRAGMENT_KEYWORD_4 )
        // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/lexer/InternalMapDslLexer.g:45:3: FRAGMENT_KEYWORD_4
        {
        mFRAGMENT_KEYWORD_4(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred4_InternalMapDslLexer

    // $ANTLR start synpred5_InternalMapDslLexer
    public final void synpred5_InternalMapDslLexer_fragment() throws RecognitionException {   
        // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/lexer/InternalMapDslLexer.g:46:2: ( FRAGMENT_KEYWORD_5 )
        // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/lexer/InternalMapDslLexer.g:46:3: FRAGMENT_KEYWORD_5
        {
        mFRAGMENT_KEYWORD_5(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred5_InternalMapDslLexer

    // $ANTLR start synpred6_InternalMapDslLexer
    public final void synpred6_InternalMapDslLexer_fragment() throws RecognitionException {   
        // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/lexer/InternalMapDslLexer.g:47:2: ( FRAGMENT_KEYWORD_6 )
        // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/lexer/InternalMapDslLexer.g:47:3: FRAGMENT_KEYWORD_6
        {
        mFRAGMENT_KEYWORD_6(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred6_InternalMapDslLexer

    // $ANTLR start synpred7_InternalMapDslLexer
    public final void synpred7_InternalMapDslLexer_fragment() throws RecognitionException {   
        // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/lexer/InternalMapDslLexer.g:48:2: ( FRAGMENT_KEYWORD_7 )
        // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/lexer/InternalMapDslLexer.g:48:3: FRAGMENT_KEYWORD_7
        {
        mFRAGMENT_KEYWORD_7(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred7_InternalMapDslLexer

    // $ANTLR start synpred8_InternalMapDslLexer
    public final void synpred8_InternalMapDslLexer_fragment() throws RecognitionException {   
        // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/lexer/InternalMapDslLexer.g:49:2: ( FRAGMENT_KEYWORD_8 )
        // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/lexer/InternalMapDslLexer.g:49:3: FRAGMENT_KEYWORD_8
        {
        mFRAGMENT_KEYWORD_8(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred8_InternalMapDslLexer

    // $ANTLR start synpred9_InternalMapDslLexer
    public final void synpred9_InternalMapDslLexer_fragment() throws RecognitionException {   
        // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/lexer/InternalMapDslLexer.g:50:2: ( FRAGMENT_KEYWORD_9 )
        // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/lexer/InternalMapDslLexer.g:50:3: FRAGMENT_KEYWORD_9
        {
        mFRAGMENT_KEYWORD_9(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred9_InternalMapDslLexer

    // $ANTLR start synpred10_InternalMapDslLexer
    public final void synpred10_InternalMapDslLexer_fragment() throws RecognitionException {   
        // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/lexer/InternalMapDslLexer.g:51:2: ( FRAGMENT_RULE_ID )
        // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/lexer/InternalMapDslLexer.g:51:3: FRAGMENT_RULE_ID
        {
        mFRAGMENT_RULE_ID(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred10_InternalMapDslLexer

    // $ANTLR start synpred11_InternalMapDslLexer
    public final void synpred11_InternalMapDslLexer_fragment() throws RecognitionException {   
        // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/lexer/InternalMapDslLexer.g:52:2: ( FRAGMENT_RULE_INT )
        // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/lexer/InternalMapDslLexer.g:52:3: FRAGMENT_RULE_INT
        {
        mFRAGMENT_RULE_INT(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred11_InternalMapDslLexer

    // $ANTLR start synpred12_InternalMapDslLexer
    public final void synpred12_InternalMapDslLexer_fragment() throws RecognitionException {   
        // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/lexer/InternalMapDslLexer.g:53:2: ( FRAGMENT_RULE_STRING )
        // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/lexer/InternalMapDslLexer.g:53:3: FRAGMENT_RULE_STRING
        {
        mFRAGMENT_RULE_STRING(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred12_InternalMapDslLexer

    // $ANTLR start synpred13_InternalMapDslLexer
    public final void synpred13_InternalMapDslLexer_fragment() throws RecognitionException {   
        // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/lexer/InternalMapDslLexer.g:54:2: ( FRAGMENT_RULE_ML_COMMENT )
        // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/lexer/InternalMapDslLexer.g:54:3: FRAGMENT_RULE_ML_COMMENT
        {
        mFRAGMENT_RULE_ML_COMMENT(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred13_InternalMapDslLexer

    // $ANTLR start synpred14_InternalMapDslLexer
    public final void synpred14_InternalMapDslLexer_fragment() throws RecognitionException {   
        // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/lexer/InternalMapDslLexer.g:55:2: ( FRAGMENT_RULE_SL_COMMENT )
        // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/lexer/InternalMapDslLexer.g:55:3: FRAGMENT_RULE_SL_COMMENT
        {
        mFRAGMENT_RULE_SL_COMMENT(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred14_InternalMapDslLexer

    // $ANTLR start synpred15_InternalMapDslLexer
    public final void synpred15_InternalMapDslLexer_fragment() throws RecognitionException {   
        // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/lexer/InternalMapDslLexer.g:56:2: ( FRAGMENT_RULE_WS )
        // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/lexer/InternalMapDslLexer.g:56:3: FRAGMENT_RULE_WS
        {
        mFRAGMENT_RULE_WS(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred15_InternalMapDslLexer

    // $ANTLR start synpred16_InternalMapDslLexer
    public final void synpred16_InternalMapDslLexer_fragment() throws RecognitionException {   
        // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/lexer/InternalMapDslLexer.g:57:2: ( FRAGMENT_RULE_ANY_OTHER )
        // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/lexer/InternalMapDslLexer.g:57:3: FRAGMENT_RULE_ANY_OTHER
        {
        mFRAGMENT_RULE_ANY_OTHER(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred16_InternalMapDslLexer

    public final boolean synpred2_InternalMapDslLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalMapDslLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred9_InternalMapDslLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred9_InternalMapDslLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred10_InternalMapDslLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred10_InternalMapDslLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_InternalMapDslLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_InternalMapDslLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_InternalMapDslLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalMapDslLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred8_InternalMapDslLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred8_InternalMapDslLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred16_InternalMapDslLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred16_InternalMapDslLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred11_InternalMapDslLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred11_InternalMapDslLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred12_InternalMapDslLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred12_InternalMapDslLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred14_InternalMapDslLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred14_InternalMapDslLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred6_InternalMapDslLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_InternalMapDslLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred7_InternalMapDslLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_InternalMapDslLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred13_InternalMapDslLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred13_InternalMapDslLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_InternalMapDslLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_InternalMapDslLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred15_InternalMapDslLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred15_InternalMapDslLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_InternalMapDslLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalMapDslLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA1 dfa1 = new DFA1(this);
    static final String DFA1_eotS =
        "\4\uffff\1\26\4\uffff\1\26\2\uffff\3\26\27\uffff";
    static final String DFA1_eofS =
        "\46\uffff";
    static final String DFA1_minS =
        "\1\0\1\52\2\0\1\76\1\157\1\151\1\155\1\141\1\101\4\0\1\52\1\0\26"+
        "\uffff";
    static final String DFA1_maxS =
        "\1\uffff\1\52\2\0\1\76\1\157\1\151\1\155\1\141\1\172\2\0\2\uffff"+
        "\1\57\1\0\26\uffff";
    static final String DFA1_acceptS =
        "\20\uffff\1\20\1\4\1\1\1\2\1\3\1\5\1\20\1\6\1\12\1\7\1\10\1\11\1"+
        "\13\6\14\1\15\1\16\1\17";
    static final String DFA1_specialS =
        "\1\6\1\14\1\11\1\5\1\15\1\2\1\1\1\16\1\13\1\0\1\10\1\12\1\4\1\7"+
        "\1\3\1\17\26\uffff}>";
    static final String[] DFA1_transitionS = {
            "\11\20\2\17\2\20\1\17\22\20\1\17\1\20\1\14\4\20\1\15\6\20\1"+
            "\1\1\16\12\13\3\20\1\4\3\20\32\12\3\20\1\11\1\12\1\20\10\12"+
            "\1\7\3\12\1\10\6\12\1\5\2\12\1\6\3\12\1\2\1\20\1\3\uff82\20",
            "\1\21",
            "\1\uffff",
            "\1\uffff",
            "\1\25",
            "\1\27",
            "\1\31",
            "\1\32",
            "\1\33",
            "\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\uffff",
            "\1\uffff",
            "\42\36\1\37\71\36\1\35\uffa3\36",
            "\47\41\1\42\64\41\1\40\uffa3\41",
            "\1\43\4\uffff\1\44",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA1_eot = DFA.unpackEncodedString(DFA1_eotS);
    static final short[] DFA1_eof = DFA.unpackEncodedString(DFA1_eofS);
    static final char[] DFA1_min = DFA.unpackEncodedStringToUnsignedChars(DFA1_minS);
    static final char[] DFA1_max = DFA.unpackEncodedStringToUnsignedChars(DFA1_maxS);
    static final short[] DFA1_accept = DFA.unpackEncodedString(DFA1_acceptS);
    static final short[] DFA1_special = DFA.unpackEncodedString(DFA1_specialS);
    static final short[][] DFA1_transition;

    static {
        int numStates = DFA1_transitionS.length;
        DFA1_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA1_transition[i] = DFA.unpackEncodedString(DFA1_transitionS[i]);
        }
    }

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = DFA1_eot;
            this.eof = DFA1_eof;
            this.min = DFA1_min;
            this.max = DFA1_max;
            this.accept = DFA1_accept;
            this.special = DFA1_special;
            this.transition = DFA1_transition;
        }
        public String getDescription() {
            return "41:1: SYNTHETIC_ALL_KEYWORDS : ( ( FRAGMENT_KEYWORD_1 )=> FRAGMENT_KEYWORD_1 | ( FRAGMENT_KEYWORD_2 )=> FRAGMENT_KEYWORD_2 | ( FRAGMENT_KEYWORD_3 )=> FRAGMENT_KEYWORD_3 | ( FRAGMENT_KEYWORD_4 )=> FRAGMENT_KEYWORD_4 | ( FRAGMENT_KEYWORD_5 )=> FRAGMENT_KEYWORD_5 | ( FRAGMENT_KEYWORD_6 )=> FRAGMENT_KEYWORD_6 | ( FRAGMENT_KEYWORD_7 )=> FRAGMENT_KEYWORD_7 | ( FRAGMENT_KEYWORD_8 )=> FRAGMENT_KEYWORD_8 | ( FRAGMENT_KEYWORD_9 )=> FRAGMENT_KEYWORD_9 | ( FRAGMENT_RULE_ID )=> FRAGMENT_RULE_ID | ( FRAGMENT_RULE_INT )=> FRAGMENT_RULE_INT | ( FRAGMENT_RULE_STRING )=> FRAGMENT_RULE_STRING | ( FRAGMENT_RULE_ML_COMMENT )=> FRAGMENT_RULE_ML_COMMENT | ( FRAGMENT_RULE_SL_COMMENT )=> FRAGMENT_RULE_SL_COMMENT | ( FRAGMENT_RULE_WS )=> FRAGMENT_RULE_WS | ( FRAGMENT_RULE_ANY_OTHER )=> FRAGMENT_RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA1_9 = input.LA(1);

                         
                        int index1_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA1_9>='A' && LA1_9<='Z')||LA1_9=='_'||(LA1_9>='a' && LA1_9<='z')) && (synpred10_InternalMapDslLexer())) {s = 24;}

                        else s = 22;

                         
                        input.seek(index1_9);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA1_6 = input.LA(1);

                         
                        int index1_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA1_6=='i') && (synpred7_InternalMapDslLexer())) {s = 25;}

                        else if ( (synpred10_InternalMapDslLexer()) ) {s = 24;}

                        else if ( (synpred16_InternalMapDslLexer()) ) {s = 22;}

                         
                        input.seek(index1_6);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA1_5 = input.LA(1);

                         
                        int index1_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA1_5=='o') && (synpred6_InternalMapDslLexer())) {s = 23;}

                        else if ( (synpred10_InternalMapDslLexer()) ) {s = 24;}

                        else if ( (synpred16_InternalMapDslLexer()) ) {s = 22;}

                         
                        input.seek(index1_5);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA1_14 = input.LA(1);

                         
                        int index1_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA1_14=='*') && (synpred13_InternalMapDslLexer())) {s = 35;}

                        else if ( (LA1_14=='/') && (synpred14_InternalMapDslLexer())) {s = 36;}

                        else s = 22;

                         
                        input.seek(index1_14);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA1_12 = input.LA(1);

                         
                        int index1_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA1_12=='\\') && (synpred12_InternalMapDslLexer())) {s = 29;}

                        else if ( ((LA1_12>='\u0000' && LA1_12<='!')||(LA1_12>='#' && LA1_12<='[')||(LA1_12>=']' && LA1_12<='\uFFFF')) && (synpred12_InternalMapDslLexer())) {s = 30;}

                        else if ( (LA1_12=='\"') && (synpred12_InternalMapDslLexer())) {s = 31;}

                        else s = 22;

                         
                        input.seek(index1_12);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA1_3 = input.LA(1);

                         
                        int index1_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalMapDslLexer()) ) {s = 20;}

                        else if ( (synpred16_InternalMapDslLexer()) ) {s = 16;}

                         
                        input.seek(index1_3);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA1_0 = input.LA(1);

                         
                        int index1_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA1_0=='.') ) {s = 1;}

                        else if ( (LA1_0=='{') ) {s = 2;}

                        else if ( (LA1_0=='}') ) {s = 3;}

                        else if ( (LA1_0=='=') ) {s = 4;}

                        else if ( (LA1_0=='t') ) {s = 5;}

                        else if ( (LA1_0=='w') ) {s = 6;}

                        else if ( (LA1_0=='i') ) {s = 7;}

                        else if ( (LA1_0=='m') ) {s = 8;}

                        else if ( (LA1_0=='^') ) {s = 9;}

                        else if ( ((LA1_0>='A' && LA1_0<='Z')||LA1_0=='_'||(LA1_0>='a' && LA1_0<='h')||(LA1_0>='j' && LA1_0<='l')||(LA1_0>='n' && LA1_0<='s')||(LA1_0>='u' && LA1_0<='v')||(LA1_0>='x' && LA1_0<='z')) ) {s = 10;}

                        else if ( ((LA1_0>='0' && LA1_0<='9')) ) {s = 11;}

                        else if ( (LA1_0=='\"') ) {s = 12;}

                        else if ( (LA1_0=='\'') ) {s = 13;}

                        else if ( (LA1_0=='/') ) {s = 14;}

                        else if ( ((LA1_0>='\t' && LA1_0<='\n')||LA1_0=='\r'||LA1_0==' ') ) {s = 15;}

                        else if ( ((LA1_0>='\u0000' && LA1_0<='\b')||(LA1_0>='\u000B' && LA1_0<='\f')||(LA1_0>='\u000E' && LA1_0<='\u001F')||LA1_0=='!'||(LA1_0>='#' && LA1_0<='&')||(LA1_0>='(' && LA1_0<='-')||(LA1_0>=':' && LA1_0<='<')||(LA1_0>='>' && LA1_0<='@')||(LA1_0>='[' && LA1_0<=']')||LA1_0=='`'||LA1_0=='|'||(LA1_0>='~' && LA1_0<='\uFFFF')) && (synpred16_InternalMapDslLexer())) {s = 16;}

                         
                        input.seek(index1_0);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA1_13 = input.LA(1);

                         
                        int index1_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA1_13=='\\') && (synpred12_InternalMapDslLexer())) {s = 32;}

                        else if ( ((LA1_13>='\u0000' && LA1_13<='&')||(LA1_13>='(' && LA1_13<='[')||(LA1_13>=']' && LA1_13<='\uFFFF')) && (synpred12_InternalMapDslLexer())) {s = 33;}

                        else if ( (LA1_13=='\'') && (synpred12_InternalMapDslLexer())) {s = 34;}

                        else s = 22;

                         
                        input.seek(index1_13);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA1_10 = input.LA(1);

                         
                        int index1_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10_InternalMapDslLexer()) ) {s = 24;}

                        else if ( (synpred16_InternalMapDslLexer()) ) {s = 22;}

                         
                        input.seek(index1_10);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA1_2 = input.LA(1);

                         
                        int index1_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalMapDslLexer()) ) {s = 19;}

                        else if ( (synpred16_InternalMapDslLexer()) ) {s = 16;}

                         
                        input.seek(index1_2);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA1_11 = input.LA(1);

                         
                        int index1_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred11_InternalMapDslLexer()) ) {s = 28;}

                        else if ( (synpred16_InternalMapDslLexer()) ) {s = 22;}

                         
                        input.seek(index1_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA1_8 = input.LA(1);

                         
                        int index1_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA1_8=='a') && (synpred9_InternalMapDslLexer())) {s = 27;}

                        else if ( (synpred10_InternalMapDslLexer()) ) {s = 24;}

                        else if ( (synpred16_InternalMapDslLexer()) ) {s = 22;}

                         
                        input.seek(index1_8);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA1_1 = input.LA(1);

                         
                        int index1_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA1_1=='*') && (synpred4_InternalMapDslLexer())) {s = 17;}

                        else if ( (synpred1_InternalMapDslLexer()) ) {s = 18;}

                        else if ( (synpred16_InternalMapDslLexer()) ) {s = 16;}

                         
                        input.seek(index1_1);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA1_4 = input.LA(1);

                         
                        int index1_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA1_4=='>') && (synpred5_InternalMapDslLexer())) {s = 21;}

                        else s = 22;

                         
                        input.seek(index1_4);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA1_7 = input.LA(1);

                         
                        int index1_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA1_7=='m') && (synpred8_InternalMapDslLexer())) {s = 26;}

                        else if ( (synpred10_InternalMapDslLexer()) ) {s = 24;}

                        else if ( (synpred16_InternalMapDslLexer()) ) {s = 22;}

                         
                        input.seek(index1_7);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA1_15 = input.LA(1);

                         
                        int index1_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred15_InternalMapDslLexer()) ) {s = 37;}

                        else if ( (synpred16_InternalMapDslLexer()) ) {s = 22;}

                         
                        input.seek(index1_15);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 1, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}