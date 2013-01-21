package de.goldschmiede.mapdsl.ui.contentassist.antlr.internal; 

import java.util.Map;
import java.util.HashMap;

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
import de.goldschmiede.mapdsl.services.MapDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalMapDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "KEYWORD_1", "KEYWORD_2", "KEYWORD_3", "KEYWORD_4", "KEYWORD_5", "KEYWORD_6", "KEYWORD_7", "KEYWORD_8", "KEYWORD_9", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "FRAGMENT_KEYWORD_1", "FRAGMENT_KEYWORD_2", "FRAGMENT_KEYWORD_3", "FRAGMENT_KEYWORD_4", "FRAGMENT_KEYWORD_5", "FRAGMENT_KEYWORD_6", "FRAGMENT_KEYWORD_7", "FRAGMENT_KEYWORD_8", "FRAGMENT_KEYWORD_9", "FRAGMENT_RULE_ID", "FRAGMENT_RULE_INT", "FRAGMENT_RULE_STRING", "FRAGMENT_RULE_ML_COMMENT", "FRAGMENT_RULE_SL_COMMENT", "FRAGMENT_RULE_WS", "FRAGMENT_RULE_ANY_OTHER", "SYNTHETIC_ALL_KEYWORDS"
    };
    public static final int RULE_ID=13;
    public static final int RULE_ANY_OTHER=19;
    public static final int FRAGMENT_KEYWORD_3=22;
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
    public static final int KEYWORD_2=5;
    public static final int FRAGMENT_KEYWORD_9=28;
    public static final int RULE_SL_COMMENT=17;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=16;
    public static final int RULE_STRING=15;
    public static final int FRAGMENT_RULE_STRING=31;
    public static final int SYNTHETIC_ALL_KEYWORDS=36;
    public static final int FRAGMENT_RULE_INT=30;
    public static final int KEYWORD_6=9;
    public static final int KEYWORD_7=10;
    public static final int KEYWORD_8=11;
    public static final int KEYWORD_9=12;
    public static final int FRAGMENT_RULE_ML_COMMENT=32;
    public static final int RULE_INT=14;
    public static final int FRAGMENT_RULE_SL_COMMENT=33;
    public static final int FRAGMENT_RULE_WS=34;
    public static final int RULE_WS=18;
    public static final int FRAGMENT_RULE_ANY_OTHER=35;

    // delegates
    // delegators


        public InternalMapDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMapDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMapDslParser.tokenNames; }
    public String getGrammarFileName() { return "../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g"; }


     
     	private MapDslGrammarAccess grammarAccess;
     	
     	private final Map<String, String> tokenNameToValue = new HashMap<String, String>();
     	
     	{
    		tokenNameToValue.put("KEYWORD_1", "'.'");
    		tokenNameToValue.put("KEYWORD_2", "'{'");
    		tokenNameToValue.put("KEYWORD_3", "'}'");
    		tokenNameToValue.put("KEYWORD_4", "'.*'");
    		tokenNameToValue.put("KEYWORD_5", "'=>'");
    		tokenNameToValue.put("KEYWORD_6", "'to'");
    		tokenNameToValue.put("KEYWORD_7", "'with'");
    		tokenNameToValue.put("KEYWORD_8", "'import'");
    		tokenNameToValue.put("KEYWORD_9", "'map BO'");
     	}
     	
        public void setGrammarAccess(MapDslGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }

    	@Override
        protected String getValueForTokenName(String tokenName) {
        	String result = tokenNameToValue.get(tokenName);
        	if (result == null)
        		result = tokenName;
        	return result;
        }



    // $ANTLR start "entryRuleModel"
    // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:73:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:74:1: ( ruleModel EOF )
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:75:1: ruleModel EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelRule()); 
            }
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel60);
            ruleModel();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel67); if (state.failed) return ;

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
    // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:82:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:86:5: ( ( ( rule__Model__Group__0 ) ) )
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:87:1: ( ( rule__Model__Group__0 ) )
            {
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:87:1: ( ( rule__Model__Group__0 ) )
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:88:1: ( rule__Model__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getGroup()); 
            }
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:89:1: ( rule__Model__Group__0 )
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:89:2: rule__Model__Group__0
            {
            pushFollow(FOLLOW_rule__Model__Group__0_in_ruleModel97);
            rule__Model__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getGroup()); 
            }

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


    // $ANTLR start "entryRuleMapping"
    // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:101:1: entryRuleMapping : ruleMapping EOF ;
    public final void entryRuleMapping() throws RecognitionException {
        try {
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:102:1: ( ruleMapping EOF )
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:103:1: ruleMapping EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMappingRule()); 
            }
            pushFollow(FOLLOW_ruleMapping_in_entryRuleMapping124);
            ruleMapping();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMappingRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMapping131); if (state.failed) return ;

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
    // $ANTLR end "entryRuleMapping"


    // $ANTLR start "ruleMapping"
    // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:110:1: ruleMapping : ( ( rule__Mapping__Group__0 ) ) ;
    public final void ruleMapping() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:114:5: ( ( ( rule__Mapping__Group__0 ) ) )
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:115:1: ( ( rule__Mapping__Group__0 ) )
            {
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:115:1: ( ( rule__Mapping__Group__0 ) )
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:116:1: ( rule__Mapping__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMappingAccess().getGroup()); 
            }
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:117:1: ( rule__Mapping__Group__0 )
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:117:2: rule__Mapping__Group__0
            {
            pushFollow(FOLLOW_rule__Mapping__Group__0_in_ruleMapping161);
            rule__Mapping__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMappingAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleMapping"


    // $ANTLR start "entryRuleAttributeMap"
    // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:129:1: entryRuleAttributeMap : ruleAttributeMap EOF ;
    public final void entryRuleAttributeMap() throws RecognitionException {
        try {
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:130:1: ( ruleAttributeMap EOF )
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:131:1: ruleAttributeMap EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeMapRule()); 
            }
            pushFollow(FOLLOW_ruleAttributeMap_in_entryRuleAttributeMap188);
            ruleAttributeMap();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeMapRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttributeMap195); if (state.failed) return ;

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
    // $ANTLR end "entryRuleAttributeMap"


    // $ANTLR start "ruleAttributeMap"
    // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:138:1: ruleAttributeMap : ( ruleAttributeMoveMap ) ;
    public final void ruleAttributeMap() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:142:5: ( ( ruleAttributeMoveMap ) )
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:143:1: ( ruleAttributeMoveMap )
            {
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:143:1: ( ruleAttributeMoveMap )
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:144:1: ruleAttributeMoveMap
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeMapAccess().getAttributeMoveMapParserRuleCall()); 
            }
            pushFollow(FOLLOW_ruleAttributeMoveMap_in_ruleAttributeMap225);
            ruleAttributeMoveMap();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeMapAccess().getAttributeMoveMapParserRuleCall()); 
            }

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
    // $ANTLR end "ruleAttributeMap"


    // $ANTLR start "entryRuleAttributeMoveMap"
    // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:157:1: entryRuleAttributeMoveMap : ruleAttributeMoveMap EOF ;
    public final void entryRuleAttributeMoveMap() throws RecognitionException {
        try {
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:158:1: ( ruleAttributeMoveMap EOF )
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:159:1: ruleAttributeMoveMap EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeMoveMapRule()); 
            }
            pushFollow(FOLLOW_ruleAttributeMoveMap_in_entryRuleAttributeMoveMap251);
            ruleAttributeMoveMap();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeMoveMapRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttributeMoveMap258); if (state.failed) return ;

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
    // $ANTLR end "entryRuleAttributeMoveMap"


    // $ANTLR start "ruleAttributeMoveMap"
    // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:166:1: ruleAttributeMoveMap : ( ( rule__AttributeMoveMap__Group__0 ) ) ;
    public final void ruleAttributeMoveMap() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:170:5: ( ( ( rule__AttributeMoveMap__Group__0 ) ) )
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:171:1: ( ( rule__AttributeMoveMap__Group__0 ) )
            {
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:171:1: ( ( rule__AttributeMoveMap__Group__0 ) )
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:172:1: ( rule__AttributeMoveMap__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeMoveMapAccess().getGroup()); 
            }
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:173:1: ( rule__AttributeMoveMap__Group__0 )
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:173:2: rule__AttributeMoveMap__Group__0
            {
            pushFollow(FOLLOW_rule__AttributeMoveMap__Group__0_in_ruleAttributeMoveMap288);
            rule__AttributeMoveMap__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeMoveMapAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleAttributeMoveMap"


    // $ANTLR start "entryRuleQualifiedName"
    // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:185:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:186:1: ( ruleQualifiedName EOF )
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:187:1: ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName315);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName322); if (state.failed) return ;

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
    // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:194:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:198:5: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:199:1: ( ( rule__QualifiedName__Group__0 ) )
            {
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:199:1: ( ( rule__QualifiedName__Group__0 ) )
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:200:1: ( rule__QualifiedName__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            }
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:201:1: ( rule__QualifiedName__Group__0 )
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:201:2: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName352);
            rule__QualifiedName__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getGroup()); 
            }

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


    // $ANTLR start "entryRuleQualifiedNameWithWildcards"
    // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:213:1: entryRuleQualifiedNameWithWildcards : ruleQualifiedNameWithWildcards EOF ;
    public final void entryRuleQualifiedNameWithWildcards() throws RecognitionException {
        try {
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:214:1: ( ruleQualifiedNameWithWildcards EOF )
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:215:1: ruleQualifiedNameWithWildcards EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildcardsRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcards_in_entryRuleQualifiedNameWithWildcards379);
            ruleQualifiedNameWithWildcards();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameWithWildcardsRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcards386); if (state.failed) return ;

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
    // $ANTLR end "entryRuleQualifiedNameWithWildcards"


    // $ANTLR start "ruleQualifiedNameWithWildcards"
    // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:222:1: ruleQualifiedNameWithWildcards : ( ( rule__QualifiedNameWithWildcards__Group__0 ) ) ;
    public final void ruleQualifiedNameWithWildcards() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:226:5: ( ( ( rule__QualifiedNameWithWildcards__Group__0 ) ) )
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:227:1: ( ( rule__QualifiedNameWithWildcards__Group__0 ) )
            {
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:227:1: ( ( rule__QualifiedNameWithWildcards__Group__0 ) )
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:228:1: ( rule__QualifiedNameWithWildcards__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildcardsAccess().getGroup()); 
            }
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:229:1: ( rule__QualifiedNameWithWildcards__Group__0 )
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:229:2: rule__QualifiedNameWithWildcards__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildcards__Group__0_in_ruleQualifiedNameWithWildcards416);
            rule__QualifiedNameWithWildcards__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameWithWildcardsAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleQualifiedNameWithWildcards"


    // $ANTLR start "entryRuleImport"
    // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:241:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:242:1: ( ruleImport EOF )
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:243:1: ruleImport EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportRule()); 
            }
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport443);
            ruleImport();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport450); if (state.failed) return ;

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
    // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:250:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:254:5: ( ( ( rule__Import__Group__0 ) ) )
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:255:1: ( ( rule__Import__Group__0 ) )
            {
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:255:1: ( ( rule__Import__Group__0 ) )
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:256:1: ( rule__Import__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getGroup()); 
            }
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:257:1: ( rule__Import__Group__0 )
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:257:2: rule__Import__Group__0
            {
            pushFollow(FOLLOW_rule__Import__Group__0_in_ruleImport480);
            rule__Import__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportAccess().getGroup()); 
            }

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


    // $ANTLR start "rule__Model__Group__0"
    // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:271:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:275:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:276:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__0514);
            rule__Model__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Model__Group__1_in_rule__Model__Group__0517);
            rule__Model__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:283:1: rule__Model__Group__0__Impl : ( ( rule__Model__ImportsAssignment_0 )* ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:287:1: ( ( ( rule__Model__ImportsAssignment_0 )* ) )
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:288:1: ( ( rule__Model__ImportsAssignment_0 )* )
            {
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:288:1: ( ( rule__Model__ImportsAssignment_0 )* )
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:289:1: ( rule__Model__ImportsAssignment_0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getImportsAssignment_0()); 
            }
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:290:1: ( rule__Model__ImportsAssignment_0 )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==KEYWORD_8) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:290:2: rule__Model__ImportsAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__Model__ImportsAssignment_0_in_rule__Model__Group__0__Impl544);
            	    rule__Model__ImportsAssignment_0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getImportsAssignment_0()); 
            }

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
    // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:300:1: rule__Model__Group__1 : rule__Model__Group__1__Impl ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:304:1: ( rule__Model__Group__1__Impl )
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:305:2: rule__Model__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__1575);
            rule__Model__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:311:1: rule__Model__Group__1__Impl : ( ( rule__Model__MapsAssignment_1 )* ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:315:1: ( ( ( rule__Model__MapsAssignment_1 )* ) )
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:316:1: ( ( rule__Model__MapsAssignment_1 )* )
            {
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:316:1: ( ( rule__Model__MapsAssignment_1 )* )
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:317:1: ( rule__Model__MapsAssignment_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getMapsAssignment_1()); 
            }
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:318:1: ( rule__Model__MapsAssignment_1 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==KEYWORD_9) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:318:2: rule__Model__MapsAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Model__MapsAssignment_1_in_rule__Model__Group__1__Impl602);
            	    rule__Model__MapsAssignment_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getMapsAssignment_1()); 
            }

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


    // $ANTLR start "rule__Mapping__Group__0"
    // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:332:1: rule__Mapping__Group__0 : rule__Mapping__Group__0__Impl rule__Mapping__Group__1 ;
    public final void rule__Mapping__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:336:1: ( rule__Mapping__Group__0__Impl rule__Mapping__Group__1 )
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:337:2: rule__Mapping__Group__0__Impl rule__Mapping__Group__1
            {
            pushFollow(FOLLOW_rule__Mapping__Group__0__Impl_in_rule__Mapping__Group__0637);
            rule__Mapping__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Mapping__Group__1_in_rule__Mapping__Group__0640);
            rule__Mapping__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Mapping__Group__0"


    // $ANTLR start "rule__Mapping__Group__0__Impl"
    // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:344:1: rule__Mapping__Group__0__Impl : ( KEYWORD_9 ) ;
    public final void rule__Mapping__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:348:1: ( ( KEYWORD_9 ) )
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:349:1: ( KEYWORD_9 )
            {
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:349:1: ( KEYWORD_9 )
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:350:1: KEYWORD_9
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMappingAccess().getMapBOKeyword_0()); 
            }
            match(input,KEYWORD_9,FOLLOW_KEYWORD_9_in_rule__Mapping__Group__0__Impl668); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMappingAccess().getMapBOKeyword_0()); 
            }

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
    // $ANTLR end "rule__Mapping__Group__0__Impl"


    // $ANTLR start "rule__Mapping__Group__1"
    // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:363:1: rule__Mapping__Group__1 : rule__Mapping__Group__1__Impl rule__Mapping__Group__2 ;
    public final void rule__Mapping__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:367:1: ( rule__Mapping__Group__1__Impl rule__Mapping__Group__2 )
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:368:2: rule__Mapping__Group__1__Impl rule__Mapping__Group__2
            {
            pushFollow(FOLLOW_rule__Mapping__Group__1__Impl_in_rule__Mapping__Group__1699);
            rule__Mapping__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Mapping__Group__2_in_rule__Mapping__Group__1702);
            rule__Mapping__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Mapping__Group__1"


    // $ANTLR start "rule__Mapping__Group__1__Impl"
    // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:375:1: rule__Mapping__Group__1__Impl : ( ( rule__Mapping__SourceTypeAssignment_1 ) ) ;
    public final void rule__Mapping__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:379:1: ( ( ( rule__Mapping__SourceTypeAssignment_1 ) ) )
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:380:1: ( ( rule__Mapping__SourceTypeAssignment_1 ) )
            {
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:380:1: ( ( rule__Mapping__SourceTypeAssignment_1 ) )
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:381:1: ( rule__Mapping__SourceTypeAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMappingAccess().getSourceTypeAssignment_1()); 
            }
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:382:1: ( rule__Mapping__SourceTypeAssignment_1 )
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:382:2: rule__Mapping__SourceTypeAssignment_1
            {
            pushFollow(FOLLOW_rule__Mapping__SourceTypeAssignment_1_in_rule__Mapping__Group__1__Impl729);
            rule__Mapping__SourceTypeAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMappingAccess().getSourceTypeAssignment_1()); 
            }

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
    // $ANTLR end "rule__Mapping__Group__1__Impl"


    // $ANTLR start "rule__Mapping__Group__2"
    // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:392:1: rule__Mapping__Group__2 : rule__Mapping__Group__2__Impl rule__Mapping__Group__3 ;
    public final void rule__Mapping__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:396:1: ( rule__Mapping__Group__2__Impl rule__Mapping__Group__3 )
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:397:2: rule__Mapping__Group__2__Impl rule__Mapping__Group__3
            {
            pushFollow(FOLLOW_rule__Mapping__Group__2__Impl_in_rule__Mapping__Group__2759);
            rule__Mapping__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Mapping__Group__3_in_rule__Mapping__Group__2762);
            rule__Mapping__Group__3();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Mapping__Group__2"


    // $ANTLR start "rule__Mapping__Group__2__Impl"
    // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:404:1: rule__Mapping__Group__2__Impl : ( KEYWORD_6 ) ;
    public final void rule__Mapping__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:408:1: ( ( KEYWORD_6 ) )
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:409:1: ( KEYWORD_6 )
            {
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:409:1: ( KEYWORD_6 )
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:410:1: KEYWORD_6
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMappingAccess().getToKeyword_2()); 
            }
            match(input,KEYWORD_6,FOLLOW_KEYWORD_6_in_rule__Mapping__Group__2__Impl790); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMappingAccess().getToKeyword_2()); 
            }

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
    // $ANTLR end "rule__Mapping__Group__2__Impl"


    // $ANTLR start "rule__Mapping__Group__3"
    // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:423:1: rule__Mapping__Group__3 : rule__Mapping__Group__3__Impl rule__Mapping__Group__4 ;
    public final void rule__Mapping__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:427:1: ( rule__Mapping__Group__3__Impl rule__Mapping__Group__4 )
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:428:2: rule__Mapping__Group__3__Impl rule__Mapping__Group__4
            {
            pushFollow(FOLLOW_rule__Mapping__Group__3__Impl_in_rule__Mapping__Group__3821);
            rule__Mapping__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Mapping__Group__4_in_rule__Mapping__Group__3824);
            rule__Mapping__Group__4();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Mapping__Group__3"


    // $ANTLR start "rule__Mapping__Group__3__Impl"
    // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:435:1: rule__Mapping__Group__3__Impl : ( ( rule__Mapping__TargetTypeAssignment_3 ) ) ;
    public final void rule__Mapping__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:439:1: ( ( ( rule__Mapping__TargetTypeAssignment_3 ) ) )
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:440:1: ( ( rule__Mapping__TargetTypeAssignment_3 ) )
            {
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:440:1: ( ( rule__Mapping__TargetTypeAssignment_3 ) )
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:441:1: ( rule__Mapping__TargetTypeAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMappingAccess().getTargetTypeAssignment_3()); 
            }
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:442:1: ( rule__Mapping__TargetTypeAssignment_3 )
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:442:2: rule__Mapping__TargetTypeAssignment_3
            {
            pushFollow(FOLLOW_rule__Mapping__TargetTypeAssignment_3_in_rule__Mapping__Group__3__Impl851);
            rule__Mapping__TargetTypeAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMappingAccess().getTargetTypeAssignment_3()); 
            }

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
    // $ANTLR end "rule__Mapping__Group__3__Impl"


    // $ANTLR start "rule__Mapping__Group__4"
    // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:452:1: rule__Mapping__Group__4 : rule__Mapping__Group__4__Impl ;
    public final void rule__Mapping__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:456:1: ( rule__Mapping__Group__4__Impl )
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:457:2: rule__Mapping__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Mapping__Group__4__Impl_in_rule__Mapping__Group__4881);
            rule__Mapping__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Mapping__Group__4"


    // $ANTLR start "rule__Mapping__Group__4__Impl"
    // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:463:1: rule__Mapping__Group__4__Impl : ( ( rule__Mapping__Group_4__0 )? ) ;
    public final void rule__Mapping__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:467:1: ( ( ( rule__Mapping__Group_4__0 )? ) )
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:468:1: ( ( rule__Mapping__Group_4__0 )? )
            {
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:468:1: ( ( rule__Mapping__Group_4__0 )? )
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:469:1: ( rule__Mapping__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMappingAccess().getGroup_4()); 
            }
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:470:1: ( rule__Mapping__Group_4__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==KEYWORD_7) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:470:2: rule__Mapping__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Mapping__Group_4__0_in_rule__Mapping__Group__4__Impl908);
                    rule__Mapping__Group_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMappingAccess().getGroup_4()); 
            }

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
    // $ANTLR end "rule__Mapping__Group__4__Impl"


    // $ANTLR start "rule__Mapping__Group_4__0"
    // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:490:1: rule__Mapping__Group_4__0 : rule__Mapping__Group_4__0__Impl rule__Mapping__Group_4__1 ;
    public final void rule__Mapping__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:494:1: ( rule__Mapping__Group_4__0__Impl rule__Mapping__Group_4__1 )
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:495:2: rule__Mapping__Group_4__0__Impl rule__Mapping__Group_4__1
            {
            pushFollow(FOLLOW_rule__Mapping__Group_4__0__Impl_in_rule__Mapping__Group_4__0949);
            rule__Mapping__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Mapping__Group_4__1_in_rule__Mapping__Group_4__0952);
            rule__Mapping__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Mapping__Group_4__0"


    // $ANTLR start "rule__Mapping__Group_4__0__Impl"
    // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:502:1: rule__Mapping__Group_4__0__Impl : ( KEYWORD_7 ) ;
    public final void rule__Mapping__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:506:1: ( ( KEYWORD_7 ) )
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:507:1: ( KEYWORD_7 )
            {
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:507:1: ( KEYWORD_7 )
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:508:1: KEYWORD_7
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMappingAccess().getWithKeyword_4_0()); 
            }
            match(input,KEYWORD_7,FOLLOW_KEYWORD_7_in_rule__Mapping__Group_4__0__Impl980); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMappingAccess().getWithKeyword_4_0()); 
            }

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
    // $ANTLR end "rule__Mapping__Group_4__0__Impl"


    // $ANTLR start "rule__Mapping__Group_4__1"
    // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:521:1: rule__Mapping__Group_4__1 : rule__Mapping__Group_4__1__Impl rule__Mapping__Group_4__2 ;
    public final void rule__Mapping__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:525:1: ( rule__Mapping__Group_4__1__Impl rule__Mapping__Group_4__2 )
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:526:2: rule__Mapping__Group_4__1__Impl rule__Mapping__Group_4__2
            {
            pushFollow(FOLLOW_rule__Mapping__Group_4__1__Impl_in_rule__Mapping__Group_4__11011);
            rule__Mapping__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Mapping__Group_4__2_in_rule__Mapping__Group_4__11014);
            rule__Mapping__Group_4__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Mapping__Group_4__1"


    // $ANTLR start "rule__Mapping__Group_4__1__Impl"
    // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:533:1: rule__Mapping__Group_4__1__Impl : ( KEYWORD_2 ) ;
    public final void rule__Mapping__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:537:1: ( ( KEYWORD_2 ) )
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:538:1: ( KEYWORD_2 )
            {
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:538:1: ( KEYWORD_2 )
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:539:1: KEYWORD_2
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMappingAccess().getLeftCurlyBracketKeyword_4_1()); 
            }
            match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_rule__Mapping__Group_4__1__Impl1042); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMappingAccess().getLeftCurlyBracketKeyword_4_1()); 
            }

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
    // $ANTLR end "rule__Mapping__Group_4__1__Impl"


    // $ANTLR start "rule__Mapping__Group_4__2"
    // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:552:1: rule__Mapping__Group_4__2 : rule__Mapping__Group_4__2__Impl rule__Mapping__Group_4__3 ;
    public final void rule__Mapping__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:556:1: ( rule__Mapping__Group_4__2__Impl rule__Mapping__Group_4__3 )
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:557:2: rule__Mapping__Group_4__2__Impl rule__Mapping__Group_4__3
            {
            pushFollow(FOLLOW_rule__Mapping__Group_4__2__Impl_in_rule__Mapping__Group_4__21073);
            rule__Mapping__Group_4__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Mapping__Group_4__3_in_rule__Mapping__Group_4__21076);
            rule__Mapping__Group_4__3();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Mapping__Group_4__2"


    // $ANTLR start "rule__Mapping__Group_4__2__Impl"
    // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:564:1: rule__Mapping__Group_4__2__Impl : ( ( ( rule__Mapping__AttributeMapAssignment_4_2 ) ) ( ( rule__Mapping__AttributeMapAssignment_4_2 )* ) ) ;
    public final void rule__Mapping__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:568:1: ( ( ( ( rule__Mapping__AttributeMapAssignment_4_2 ) ) ( ( rule__Mapping__AttributeMapAssignment_4_2 )* ) ) )
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:569:1: ( ( ( rule__Mapping__AttributeMapAssignment_4_2 ) ) ( ( rule__Mapping__AttributeMapAssignment_4_2 )* ) )
            {
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:569:1: ( ( ( rule__Mapping__AttributeMapAssignment_4_2 ) ) ( ( rule__Mapping__AttributeMapAssignment_4_2 )* ) )
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:570:1: ( ( rule__Mapping__AttributeMapAssignment_4_2 ) ) ( ( rule__Mapping__AttributeMapAssignment_4_2 )* )
            {
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:570:1: ( ( rule__Mapping__AttributeMapAssignment_4_2 ) )
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:571:1: ( rule__Mapping__AttributeMapAssignment_4_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMappingAccess().getAttributeMapAssignment_4_2()); 
            }
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:572:1: ( rule__Mapping__AttributeMapAssignment_4_2 )
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:572:2: rule__Mapping__AttributeMapAssignment_4_2
            {
            pushFollow(FOLLOW_rule__Mapping__AttributeMapAssignment_4_2_in_rule__Mapping__Group_4__2__Impl1105);
            rule__Mapping__AttributeMapAssignment_4_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMappingAccess().getAttributeMapAssignment_4_2()); 
            }

            }

            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:575:1: ( ( rule__Mapping__AttributeMapAssignment_4_2 )* )
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:576:1: ( rule__Mapping__AttributeMapAssignment_4_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMappingAccess().getAttributeMapAssignment_4_2()); 
            }
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:577:1: ( rule__Mapping__AttributeMapAssignment_4_2 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:577:2: rule__Mapping__AttributeMapAssignment_4_2
            	    {
            	    pushFollow(FOLLOW_rule__Mapping__AttributeMapAssignment_4_2_in_rule__Mapping__Group_4__2__Impl1117);
            	    rule__Mapping__AttributeMapAssignment_4_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMappingAccess().getAttributeMapAssignment_4_2()); 
            }

            }


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
    // $ANTLR end "rule__Mapping__Group_4__2__Impl"


    // $ANTLR start "rule__Mapping__Group_4__3"
    // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:588:1: rule__Mapping__Group_4__3 : rule__Mapping__Group_4__3__Impl ;
    public final void rule__Mapping__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:592:1: ( rule__Mapping__Group_4__3__Impl )
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:593:2: rule__Mapping__Group_4__3__Impl
            {
            pushFollow(FOLLOW_rule__Mapping__Group_4__3__Impl_in_rule__Mapping__Group_4__31150);
            rule__Mapping__Group_4__3__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Mapping__Group_4__3"


    // $ANTLR start "rule__Mapping__Group_4__3__Impl"
    // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:599:1: rule__Mapping__Group_4__3__Impl : ( KEYWORD_3 ) ;
    public final void rule__Mapping__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:603:1: ( ( KEYWORD_3 ) )
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:604:1: ( KEYWORD_3 )
            {
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:604:1: ( KEYWORD_3 )
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:605:1: KEYWORD_3
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMappingAccess().getRightCurlyBracketKeyword_4_3()); 
            }
            match(input,KEYWORD_3,FOLLOW_KEYWORD_3_in_rule__Mapping__Group_4__3__Impl1178); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMappingAccess().getRightCurlyBracketKeyword_4_3()); 
            }

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
    // $ANTLR end "rule__Mapping__Group_4__3__Impl"


    // $ANTLR start "rule__AttributeMoveMap__Group__0"
    // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:626:1: rule__AttributeMoveMap__Group__0 : rule__AttributeMoveMap__Group__0__Impl rule__AttributeMoveMap__Group__1 ;
    public final void rule__AttributeMoveMap__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:630:1: ( rule__AttributeMoveMap__Group__0__Impl rule__AttributeMoveMap__Group__1 )
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:631:2: rule__AttributeMoveMap__Group__0__Impl rule__AttributeMoveMap__Group__1
            {
            pushFollow(FOLLOW_rule__AttributeMoveMap__Group__0__Impl_in_rule__AttributeMoveMap__Group__01217);
            rule__AttributeMoveMap__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AttributeMoveMap__Group__1_in_rule__AttributeMoveMap__Group__01220);
            rule__AttributeMoveMap__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__AttributeMoveMap__Group__0"


    // $ANTLR start "rule__AttributeMoveMap__Group__0__Impl"
    // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:638:1: rule__AttributeMoveMap__Group__0__Impl : ( ( rule__AttributeMoveMap__SourceAttributeAssignment_0 ) ) ;
    public final void rule__AttributeMoveMap__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:642:1: ( ( ( rule__AttributeMoveMap__SourceAttributeAssignment_0 ) ) )
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:643:1: ( ( rule__AttributeMoveMap__SourceAttributeAssignment_0 ) )
            {
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:643:1: ( ( rule__AttributeMoveMap__SourceAttributeAssignment_0 ) )
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:644:1: ( rule__AttributeMoveMap__SourceAttributeAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeMoveMapAccess().getSourceAttributeAssignment_0()); 
            }
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:645:1: ( rule__AttributeMoveMap__SourceAttributeAssignment_0 )
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:645:2: rule__AttributeMoveMap__SourceAttributeAssignment_0
            {
            pushFollow(FOLLOW_rule__AttributeMoveMap__SourceAttributeAssignment_0_in_rule__AttributeMoveMap__Group__0__Impl1247);
            rule__AttributeMoveMap__SourceAttributeAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeMoveMapAccess().getSourceAttributeAssignment_0()); 
            }

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
    // $ANTLR end "rule__AttributeMoveMap__Group__0__Impl"


    // $ANTLR start "rule__AttributeMoveMap__Group__1"
    // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:655:1: rule__AttributeMoveMap__Group__1 : rule__AttributeMoveMap__Group__1__Impl rule__AttributeMoveMap__Group__2 ;
    public final void rule__AttributeMoveMap__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:659:1: ( rule__AttributeMoveMap__Group__1__Impl rule__AttributeMoveMap__Group__2 )
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:660:2: rule__AttributeMoveMap__Group__1__Impl rule__AttributeMoveMap__Group__2
            {
            pushFollow(FOLLOW_rule__AttributeMoveMap__Group__1__Impl_in_rule__AttributeMoveMap__Group__11277);
            rule__AttributeMoveMap__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AttributeMoveMap__Group__2_in_rule__AttributeMoveMap__Group__11280);
            rule__AttributeMoveMap__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__AttributeMoveMap__Group__1"


    // $ANTLR start "rule__AttributeMoveMap__Group__1__Impl"
    // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:667:1: rule__AttributeMoveMap__Group__1__Impl : ( KEYWORD_5 ) ;
    public final void rule__AttributeMoveMap__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:671:1: ( ( KEYWORD_5 ) )
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:672:1: ( KEYWORD_5 )
            {
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:672:1: ( KEYWORD_5 )
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:673:1: KEYWORD_5
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeMoveMapAccess().getEqualsSignGreaterThanSignKeyword_1()); 
            }
            match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_rule__AttributeMoveMap__Group__1__Impl1308); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeMoveMapAccess().getEqualsSignGreaterThanSignKeyword_1()); 
            }

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
    // $ANTLR end "rule__AttributeMoveMap__Group__1__Impl"


    // $ANTLR start "rule__AttributeMoveMap__Group__2"
    // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:686:1: rule__AttributeMoveMap__Group__2 : rule__AttributeMoveMap__Group__2__Impl ;
    public final void rule__AttributeMoveMap__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:690:1: ( rule__AttributeMoveMap__Group__2__Impl )
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:691:2: rule__AttributeMoveMap__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__AttributeMoveMap__Group__2__Impl_in_rule__AttributeMoveMap__Group__21339);
            rule__AttributeMoveMap__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__AttributeMoveMap__Group__2"


    // $ANTLR start "rule__AttributeMoveMap__Group__2__Impl"
    // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:697:1: rule__AttributeMoveMap__Group__2__Impl : ( ( rule__AttributeMoveMap__TargetAttributeAssignment_2 ) ) ;
    public final void rule__AttributeMoveMap__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:701:1: ( ( ( rule__AttributeMoveMap__TargetAttributeAssignment_2 ) ) )
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:702:1: ( ( rule__AttributeMoveMap__TargetAttributeAssignment_2 ) )
            {
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:702:1: ( ( rule__AttributeMoveMap__TargetAttributeAssignment_2 ) )
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:703:1: ( rule__AttributeMoveMap__TargetAttributeAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeMoveMapAccess().getTargetAttributeAssignment_2()); 
            }
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:704:1: ( rule__AttributeMoveMap__TargetAttributeAssignment_2 )
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:704:2: rule__AttributeMoveMap__TargetAttributeAssignment_2
            {
            pushFollow(FOLLOW_rule__AttributeMoveMap__TargetAttributeAssignment_2_in_rule__AttributeMoveMap__Group__2__Impl1366);
            rule__AttributeMoveMap__TargetAttributeAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeMoveMapAccess().getTargetAttributeAssignment_2()); 
            }

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
    // $ANTLR end "rule__AttributeMoveMap__Group__2__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:720:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:724:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:725:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__01402);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__01405);
            rule__QualifiedName__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:732:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:736:1: ( ( RULE_ID ) )
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:737:1: ( RULE_ID )
            {
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:737:1: ( RULE_ID )
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:738:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl1432); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            }

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
    // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:749:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:753:1: ( rule__QualifiedName__Group__1__Impl )
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:754:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__11461);
            rule__QualifiedName__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:760:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:764:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:765:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:765:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:766:1: ( rule__QualifiedName__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            }
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:767:1: ( rule__QualifiedName__Group_1__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==KEYWORD_1) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:767:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl1488);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            }

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
    // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:781:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:785:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:786:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__01523);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__01526);
            rule__QualifiedName__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

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
    // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:793:1: rule__QualifiedName__Group_1__0__Impl : ( KEYWORD_1 ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:797:1: ( ( KEYWORD_1 ) )
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:798:1: ( KEYWORD_1 )
            {
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:798:1: ( KEYWORD_1 )
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:799:1: KEYWORD_1
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            }
            match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_rule__QualifiedName__Group_1__0__Impl1554); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            }

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
    // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:812:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:816:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:817:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__11585);
            rule__QualifiedName__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:823:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:827:1: ( ( RULE_ID ) )
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:828:1: ( RULE_ID )
            {
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:828:1: ( RULE_ID )
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:829:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl1612); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            }

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


    // $ANTLR start "rule__QualifiedNameWithWildcards__Group__0"
    // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:844:1: rule__QualifiedNameWithWildcards__Group__0 : rule__QualifiedNameWithWildcards__Group__0__Impl rule__QualifiedNameWithWildcards__Group__1 ;
    public final void rule__QualifiedNameWithWildcards__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:848:1: ( rule__QualifiedNameWithWildcards__Group__0__Impl rule__QualifiedNameWithWildcards__Group__1 )
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:849:2: rule__QualifiedNameWithWildcards__Group__0__Impl rule__QualifiedNameWithWildcards__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildcards__Group__0__Impl_in_rule__QualifiedNameWithWildcards__Group__01645);
            rule__QualifiedNameWithWildcards__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__QualifiedNameWithWildcards__Group__1_in_rule__QualifiedNameWithWildcards__Group__01648);
            rule__QualifiedNameWithWildcards__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__QualifiedNameWithWildcards__Group__0"


    // $ANTLR start "rule__QualifiedNameWithWildcards__Group__0__Impl"
    // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:856:1: rule__QualifiedNameWithWildcards__Group__0__Impl : ( ruleQualifiedName ) ;
    public final void rule__QualifiedNameWithWildcards__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:860:1: ( ( ruleQualifiedName ) )
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:861:1: ( ruleQualifiedName )
            {
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:861:1: ( ruleQualifiedName )
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:862:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildcardsAccess().getQualifiedNameParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__QualifiedNameWithWildcards__Group__0__Impl1675);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameWithWildcardsAccess().getQualifiedNameParserRuleCall_0()); 
            }

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
    // $ANTLR end "rule__QualifiedNameWithWildcards__Group__0__Impl"


    // $ANTLR start "rule__QualifiedNameWithWildcards__Group__1"
    // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:873:1: rule__QualifiedNameWithWildcards__Group__1 : rule__QualifiedNameWithWildcards__Group__1__Impl ;
    public final void rule__QualifiedNameWithWildcards__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:877:1: ( rule__QualifiedNameWithWildcards__Group__1__Impl )
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:878:2: rule__QualifiedNameWithWildcards__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildcards__Group__1__Impl_in_rule__QualifiedNameWithWildcards__Group__11704);
            rule__QualifiedNameWithWildcards__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__QualifiedNameWithWildcards__Group__1"


    // $ANTLR start "rule__QualifiedNameWithWildcards__Group__1__Impl"
    // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:884:1: rule__QualifiedNameWithWildcards__Group__1__Impl : ( ( KEYWORD_4 )? ) ;
    public final void rule__QualifiedNameWithWildcards__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:888:1: ( ( ( KEYWORD_4 )? ) )
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:889:1: ( ( KEYWORD_4 )? )
            {
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:889:1: ( ( KEYWORD_4 )? )
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:890:1: ( KEYWORD_4 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildcardsAccess().getFullStopAsteriskKeyword_1()); 
            }
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:891:1: ( KEYWORD_4 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==KEYWORD_4) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:892:2: KEYWORD_4
                    {
                    match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_rule__QualifiedNameWithWildcards__Group__1__Impl1733); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameWithWildcardsAccess().getFullStopAsteriskKeyword_1()); 
            }

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
    // $ANTLR end "rule__QualifiedNameWithWildcards__Group__1__Impl"


    // $ANTLR start "rule__Import__Group__0"
    // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:907:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:911:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:912:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__01770);
            rule__Import__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Import__Group__1_in_rule__Import__Group__01773);
            rule__Import__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:919:1: rule__Import__Group__0__Impl : ( KEYWORD_8 ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:923:1: ( ( KEYWORD_8 ) )
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:924:1: ( KEYWORD_8 )
            {
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:924:1: ( KEYWORD_8 )
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:925:1: KEYWORD_8
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            }
            match(input,KEYWORD_8,FOLLOW_KEYWORD_8_in_rule__Import__Group__0__Impl1801); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportAccess().getImportKeyword_0()); 
            }

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
    // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:938:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:942:1: ( rule__Import__Group__1__Impl )
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:943:2: rule__Import__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__11832);
            rule__Import__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:949:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:953:1: ( ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) )
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:954:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            {
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:954:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:955:1: ( rule__Import__ImportedNamespaceAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 
            }
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:956:1: ( rule__Import__ImportedNamespaceAssignment_1 )
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:956:2: rule__Import__ImportedNamespaceAssignment_1
            {
            pushFollow(FOLLOW_rule__Import__ImportedNamespaceAssignment_1_in_rule__Import__Group__1__Impl1859);
            rule__Import__ImportedNamespaceAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 
            }

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


    // $ANTLR start "rule__Model__ImportsAssignment_0"
    // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:971:1: rule__Model__ImportsAssignment_0 : ( ruleImport ) ;
    public final void rule__Model__ImportsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:975:1: ( ( ruleImport ) )
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:976:1: ( ruleImport )
            {
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:976:1: ( ruleImport )
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:977:1: ruleImport
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getImportsImportParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleImport_in_rule__Model__ImportsAssignment_01898);
            ruleImport();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getImportsImportParserRuleCall_0_0()); 
            }

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
    // $ANTLR end "rule__Model__ImportsAssignment_0"


    // $ANTLR start "rule__Model__MapsAssignment_1"
    // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:986:1: rule__Model__MapsAssignment_1 : ( ruleMapping ) ;
    public final void rule__Model__MapsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:990:1: ( ( ruleMapping ) )
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:991:1: ( ruleMapping )
            {
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:991:1: ( ruleMapping )
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:992:1: ruleMapping
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getMapsMappingParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleMapping_in_rule__Model__MapsAssignment_11929);
            ruleMapping();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getMapsMappingParserRuleCall_1_0()); 
            }

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
    // $ANTLR end "rule__Model__MapsAssignment_1"


    // $ANTLR start "rule__Mapping__SourceTypeAssignment_1"
    // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:1001:1: rule__Mapping__SourceTypeAssignment_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Mapping__SourceTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:1005:1: ( ( ( ruleQualifiedName ) ) )
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:1006:1: ( ( ruleQualifiedName ) )
            {
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:1006:1: ( ( ruleQualifiedName ) )
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:1007:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMappingAccess().getSourceTypeBusinessObjectCrossReference_1_0()); 
            }
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:1008:1: ( ruleQualifiedName )
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:1009:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMappingAccess().getSourceTypeBusinessObjectQualifiedNameParserRuleCall_1_0_1()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Mapping__SourceTypeAssignment_11964);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMappingAccess().getSourceTypeBusinessObjectQualifiedNameParserRuleCall_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMappingAccess().getSourceTypeBusinessObjectCrossReference_1_0()); 
            }

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
    // $ANTLR end "rule__Mapping__SourceTypeAssignment_1"


    // $ANTLR start "rule__Mapping__TargetTypeAssignment_3"
    // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:1020:1: rule__Mapping__TargetTypeAssignment_3 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Mapping__TargetTypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:1024:1: ( ( ( ruleQualifiedName ) ) )
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:1025:1: ( ( ruleQualifiedName ) )
            {
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:1025:1: ( ( ruleQualifiedName ) )
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:1026:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMappingAccess().getTargetTypeBusinessObjectCrossReference_3_0()); 
            }
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:1027:1: ( ruleQualifiedName )
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:1028:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMappingAccess().getTargetTypeBusinessObjectQualifiedNameParserRuleCall_3_0_1()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Mapping__TargetTypeAssignment_32003);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMappingAccess().getTargetTypeBusinessObjectQualifiedNameParserRuleCall_3_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMappingAccess().getTargetTypeBusinessObjectCrossReference_3_0()); 
            }

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
    // $ANTLR end "rule__Mapping__TargetTypeAssignment_3"


    // $ANTLR start "rule__Mapping__AttributeMapAssignment_4_2"
    // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:1039:1: rule__Mapping__AttributeMapAssignment_4_2 : ( ruleAttributeMap ) ;
    public final void rule__Mapping__AttributeMapAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:1043:1: ( ( ruleAttributeMap ) )
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:1044:1: ( ruleAttributeMap )
            {
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:1044:1: ( ruleAttributeMap )
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:1045:1: ruleAttributeMap
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMappingAccess().getAttributeMapAttributeMapParserRuleCall_4_2_0()); 
            }
            pushFollow(FOLLOW_ruleAttributeMap_in_rule__Mapping__AttributeMapAssignment_4_22038);
            ruleAttributeMap();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMappingAccess().getAttributeMapAttributeMapParserRuleCall_4_2_0()); 
            }

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
    // $ANTLR end "rule__Mapping__AttributeMapAssignment_4_2"


    // $ANTLR start "rule__AttributeMoveMap__SourceAttributeAssignment_0"
    // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:1054:1: rule__AttributeMoveMap__SourceAttributeAssignment_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__AttributeMoveMap__SourceAttributeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:1058:1: ( ( ( ruleQualifiedName ) ) )
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:1059:1: ( ( ruleQualifiedName ) )
            {
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:1059:1: ( ( ruleQualifiedName ) )
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:1060:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeMoveMapAccess().getSourceAttributeAttributeCrossReference_0_0()); 
            }
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:1061:1: ( ruleQualifiedName )
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:1062:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeMoveMapAccess().getSourceAttributeAttributeQualifiedNameParserRuleCall_0_0_1()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__AttributeMoveMap__SourceAttributeAssignment_02073);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeMoveMapAccess().getSourceAttributeAttributeQualifiedNameParserRuleCall_0_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeMoveMapAccess().getSourceAttributeAttributeCrossReference_0_0()); 
            }

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
    // $ANTLR end "rule__AttributeMoveMap__SourceAttributeAssignment_0"


    // $ANTLR start "rule__AttributeMoveMap__TargetAttributeAssignment_2"
    // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:1073:1: rule__AttributeMoveMap__TargetAttributeAssignment_2 : ( ( ruleQualifiedName ) ) ;
    public final void rule__AttributeMoveMap__TargetAttributeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:1077:1: ( ( ( ruleQualifiedName ) ) )
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:1078:1: ( ( ruleQualifiedName ) )
            {
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:1078:1: ( ( ruleQualifiedName ) )
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:1079:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeMoveMapAccess().getTargetAttributeAttributeCrossReference_2_0()); 
            }
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:1080:1: ( ruleQualifiedName )
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:1081:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeMoveMapAccess().getTargetAttributeAttributeQualifiedNameParserRuleCall_2_0_1()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__AttributeMoveMap__TargetAttributeAssignment_22112);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeMoveMapAccess().getTargetAttributeAttributeQualifiedNameParserRuleCall_2_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeMoveMapAccess().getTargetAttributeAttributeCrossReference_2_0()); 
            }

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
    // $ANTLR end "rule__AttributeMoveMap__TargetAttributeAssignment_2"


    // $ANTLR start "rule__Import__ImportedNamespaceAssignment_1"
    // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:1092:1: rule__Import__ImportedNamespaceAssignment_1 : ( ruleQualifiedNameWithWildcards ) ;
    public final void rule__Import__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:1096:1: ( ( ruleQualifiedNameWithWildcards ) )
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:1097:1: ( ruleQualifiedNameWithWildcards )
            {
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:1097:1: ( ruleQualifiedNameWithWildcards )
            // ../de.goldschmiede.mapdsl.ui/src-gen/de/goldschmiede/mapdsl/ui/contentassist/antlr/internal/InternalMapDslParser.g:1098:1: ruleQualifiedNameWithWildcards
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardsParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcards_in_rule__Import__ImportedNamespaceAssignment_12147);
            ruleQualifiedNameWithWildcards();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardsParserRuleCall_1_0()); 
            }

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

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel60 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel67 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0_in_ruleModel97 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMapping_in_entryRuleMapping124 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMapping131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mapping__Group__0_in_ruleMapping161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeMap_in_entryRuleAttributeMap188 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttributeMap195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeMoveMap_in_ruleAttributeMap225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeMoveMap_in_entryRuleAttributeMoveMap251 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttributeMoveMap258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeMoveMap__Group__0_in_ruleAttributeMoveMap288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName315 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcards_in_entryRuleQualifiedNameWithWildcards379 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcards386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcards__Group__0_in_ruleQualifiedNameWithWildcards416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport443 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__0_in_ruleImport480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__0514 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Model__Group__1_in_rule__Model__Group__0517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__ImportsAssignment_0_in_rule__Model__Group__0__Impl544 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__1575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__MapsAssignment_1_in_rule__Model__Group__1__Impl602 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_rule__Mapping__Group__0__Impl_in_rule__Mapping__Group__0637 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Mapping__Group__1_in_rule__Mapping__Group__0640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_9_in_rule__Mapping__Group__0__Impl668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mapping__Group__1__Impl_in_rule__Mapping__Group__1699 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__Mapping__Group__2_in_rule__Mapping__Group__1702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mapping__SourceTypeAssignment_1_in_rule__Mapping__Group__1__Impl729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mapping__Group__2__Impl_in_rule__Mapping__Group__2759 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Mapping__Group__3_in_rule__Mapping__Group__2762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_6_in_rule__Mapping__Group__2__Impl790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mapping__Group__3__Impl_in_rule__Mapping__Group__3821 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_rule__Mapping__Group__4_in_rule__Mapping__Group__3824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mapping__TargetTypeAssignment_3_in_rule__Mapping__Group__3__Impl851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mapping__Group__4__Impl_in_rule__Mapping__Group__4881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mapping__Group_4__0_in_rule__Mapping__Group__4__Impl908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mapping__Group_4__0__Impl_in_rule__Mapping__Group_4__0949 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Mapping__Group_4__1_in_rule__Mapping__Group_4__0952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_7_in_rule__Mapping__Group_4__0__Impl980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mapping__Group_4__1__Impl_in_rule__Mapping__Group_4__11011 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Mapping__Group_4__2_in_rule__Mapping__Group_4__11014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_2_in_rule__Mapping__Group_4__1__Impl1042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mapping__Group_4__2__Impl_in_rule__Mapping__Group_4__21073 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Mapping__Group_4__3_in_rule__Mapping__Group_4__21076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mapping__AttributeMapAssignment_4_2_in_rule__Mapping__Group_4__2__Impl1105 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_rule__Mapping__AttributeMapAssignment_4_2_in_rule__Mapping__Group_4__2__Impl1117 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_rule__Mapping__Group_4__3__Impl_in_rule__Mapping__Group_4__31150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_3_in_rule__Mapping__Group_4__3__Impl1178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeMoveMap__Group__0__Impl_in_rule__AttributeMoveMap__Group__01217 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__AttributeMoveMap__Group__1_in_rule__AttributeMoveMap__Group__01220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeMoveMap__SourceAttributeAssignment_0_in_rule__AttributeMoveMap__Group__0__Impl1247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeMoveMap__Group__1__Impl_in_rule__AttributeMoveMap__Group__11277 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__AttributeMoveMap__Group__2_in_rule__AttributeMoveMap__Group__11280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_5_in_rule__AttributeMoveMap__Group__1__Impl1308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeMoveMap__Group__2__Impl_in_rule__AttributeMoveMap__Group__21339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeMoveMap__TargetAttributeAssignment_2_in_rule__AttributeMoveMap__Group__2__Impl1366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__01402 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__01405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl1432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__11461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl1488 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__01523 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__01526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_1_in_rule__QualifiedName__Group_1__0__Impl1554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__11585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl1612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcards__Group__0__Impl_in_rule__QualifiedNameWithWildcards__Group__01645 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcards__Group__1_in_rule__QualifiedNameWithWildcards__Group__01648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__QualifiedNameWithWildcards__Group__0__Impl1675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcards__Group__1__Impl_in_rule__QualifiedNameWithWildcards__Group__11704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_4_in_rule__QualifiedNameWithWildcards__Group__1__Impl1733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__01770 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Import__Group__1_in_rule__Import__Group__01773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_8_in_rule__Import__Group__0__Impl1801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__11832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__ImportedNamespaceAssignment_1_in_rule__Import__Group__1__Impl1859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_rule__Model__ImportsAssignment_01898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMapping_in_rule__Model__MapsAssignment_11929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Mapping__SourceTypeAssignment_11964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Mapping__TargetTypeAssignment_32003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeMap_in_rule__Mapping__AttributeMapAssignment_4_22038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__AttributeMoveMap__SourceAttributeAssignment_02073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__AttributeMoveMap__TargetAttributeAssignment_22112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcards_in_rule__Import__ImportedNamespaceAssignment_12147 = new BitSet(new long[]{0x0000000000000002L});

}