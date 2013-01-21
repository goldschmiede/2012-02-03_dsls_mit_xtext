package de.goldschmiede.bodsl.ui.contentassist.antlr.internal; 

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
import de.goldschmiede.bodsl.services.BusinessObjectDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalBusinessObjectDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "'import'", "'businessObject'", "'{'", "'}'", "'enum'", "':'", "'type'", "'.'", "'.*'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__19=19;
    public static final int RULE_STRING=6;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=5;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalBusinessObjectDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalBusinessObjectDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalBusinessObjectDslParser.tokenNames; }
    public String getGrammarFileName() { return "../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g"; }


     
     	private BusinessObjectDslGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(BusinessObjectDslGrammarAccess grammarAccess) {
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
    // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:60:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:61:1: ( ruleModel EOF )
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:62:1: ruleModel EOF
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
    // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:69:1: ruleModel : ( ( rule__Model__Alternatives ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:73:2: ( ( ( rule__Model__Alternatives ) ) )
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:74:1: ( ( rule__Model__Alternatives ) )
            {
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:74:1: ( ( rule__Model__Alternatives ) )
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:75:1: ( rule__Model__Alternatives )
            {
             before(grammarAccess.getModelAccess().getAlternatives()); 
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:76:1: ( rule__Model__Alternatives )
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:76:2: rule__Model__Alternatives
            {
            pushFollow(FOLLOW_rule__Model__Alternatives_in_ruleModel94);
            rule__Model__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getAlternatives()); 

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


    // $ANTLR start "entryRulePackage"
    // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:88:1: entryRulePackage : rulePackage EOF ;
    public final void entryRulePackage() throws RecognitionException {
        try {
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:89:1: ( rulePackage EOF )
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:90:1: rulePackage EOF
            {
             before(grammarAccess.getPackageRule()); 
            pushFollow(FOLLOW_rulePackage_in_entryRulePackage121);
            rulePackage();

            state._fsp--;

             after(grammarAccess.getPackageRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePackage128); 

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
    // $ANTLR end "entryRulePackage"


    // $ANTLR start "rulePackage"
    // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:97:1: rulePackage : ( ( rule__Package__Group__0 ) ) ;
    public final void rulePackage() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:101:2: ( ( ( rule__Package__Group__0 ) ) )
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:102:1: ( ( rule__Package__Group__0 ) )
            {
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:102:1: ( ( rule__Package__Group__0 ) )
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:103:1: ( rule__Package__Group__0 )
            {
             before(grammarAccess.getPackageAccess().getGroup()); 
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:104:1: ( rule__Package__Group__0 )
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:104:2: rule__Package__Group__0
            {
            pushFollow(FOLLOW_rule__Package__Group__0_in_rulePackage154);
            rule__Package__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPackageAccess().getGroup()); 

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
    // $ANTLR end "rulePackage"


    // $ANTLR start "entryRuleImport"
    // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:116:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:117:1: ( ruleImport EOF )
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:118:1: ruleImport EOF
            {
             before(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport181);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getImportRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport188); 

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
    // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:125:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:129:2: ( ( ( rule__Import__Group__0 ) ) )
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:130:1: ( ( rule__Import__Group__0 ) )
            {
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:130:1: ( ( rule__Import__Group__0 ) )
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:131:1: ( rule__Import__Group__0 )
            {
             before(grammarAccess.getImportAccess().getGroup()); 
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:132:1: ( rule__Import__Group__0 )
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:132:2: rule__Import__Group__0
            {
            pushFollow(FOLLOW_rule__Import__Group__0_in_ruleImport214);
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


    // $ANTLR start "entryRuleBusinessObject"
    // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:144:1: entryRuleBusinessObject : ruleBusinessObject EOF ;
    public final void entryRuleBusinessObject() throws RecognitionException {
        try {
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:145:1: ( ruleBusinessObject EOF )
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:146:1: ruleBusinessObject EOF
            {
             before(grammarAccess.getBusinessObjectRule()); 
            pushFollow(FOLLOW_ruleBusinessObject_in_entryRuleBusinessObject241);
            ruleBusinessObject();

            state._fsp--;

             after(grammarAccess.getBusinessObjectRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBusinessObject248); 

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
    // $ANTLR end "entryRuleBusinessObject"


    // $ANTLR start "ruleBusinessObject"
    // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:153:1: ruleBusinessObject : ( ( rule__BusinessObject__Group__0 ) ) ;
    public final void ruleBusinessObject() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:157:2: ( ( ( rule__BusinessObject__Group__0 ) ) )
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:158:1: ( ( rule__BusinessObject__Group__0 ) )
            {
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:158:1: ( ( rule__BusinessObject__Group__0 ) )
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:159:1: ( rule__BusinessObject__Group__0 )
            {
             before(grammarAccess.getBusinessObjectAccess().getGroup()); 
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:160:1: ( rule__BusinessObject__Group__0 )
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:160:2: rule__BusinessObject__Group__0
            {
            pushFollow(FOLLOW_rule__BusinessObject__Group__0_in_ruleBusinessObject274);
            rule__BusinessObject__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBusinessObjectAccess().getGroup()); 

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
    // $ANTLR end "ruleBusinessObject"


    // $ANTLR start "entryRuleEnumeration"
    // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:172:1: entryRuleEnumeration : ruleEnumeration EOF ;
    public final void entryRuleEnumeration() throws RecognitionException {
        try {
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:173:1: ( ruleEnumeration EOF )
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:174:1: ruleEnumeration EOF
            {
             before(grammarAccess.getEnumerationRule()); 
            pushFollow(FOLLOW_ruleEnumeration_in_entryRuleEnumeration301);
            ruleEnumeration();

            state._fsp--;

             after(grammarAccess.getEnumerationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumeration308); 

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
    // $ANTLR end "entryRuleEnumeration"


    // $ANTLR start "ruleEnumeration"
    // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:181:1: ruleEnumeration : ( ( rule__Enumeration__Group__0 ) ) ;
    public final void ruleEnumeration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:185:2: ( ( ( rule__Enumeration__Group__0 ) ) )
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:186:1: ( ( rule__Enumeration__Group__0 ) )
            {
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:186:1: ( ( rule__Enumeration__Group__0 ) )
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:187:1: ( rule__Enumeration__Group__0 )
            {
             before(grammarAccess.getEnumerationAccess().getGroup()); 
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:188:1: ( rule__Enumeration__Group__0 )
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:188:2: rule__Enumeration__Group__0
            {
            pushFollow(FOLLOW_rule__Enumeration__Group__0_in_ruleEnumeration334);
            rule__Enumeration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEnumerationAccess().getGroup()); 

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
    // $ANTLR end "ruleEnumeration"


    // $ANTLR start "entryRuleEnumLiteral"
    // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:200:1: entryRuleEnumLiteral : ruleEnumLiteral EOF ;
    public final void entryRuleEnumLiteral() throws RecognitionException {
        try {
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:201:1: ( ruleEnumLiteral EOF )
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:202:1: ruleEnumLiteral EOF
            {
             before(grammarAccess.getEnumLiteralRule()); 
            pushFollow(FOLLOW_ruleEnumLiteral_in_entryRuleEnumLiteral361);
            ruleEnumLiteral();

            state._fsp--;

             after(grammarAccess.getEnumLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumLiteral368); 

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
    // $ANTLR end "entryRuleEnumLiteral"


    // $ANTLR start "ruleEnumLiteral"
    // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:209:1: ruleEnumLiteral : ( ( rule__EnumLiteral__NameAssignment ) ) ;
    public final void ruleEnumLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:213:2: ( ( ( rule__EnumLiteral__NameAssignment ) ) )
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:214:1: ( ( rule__EnumLiteral__NameAssignment ) )
            {
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:214:1: ( ( rule__EnumLiteral__NameAssignment ) )
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:215:1: ( rule__EnumLiteral__NameAssignment )
            {
             before(grammarAccess.getEnumLiteralAccess().getNameAssignment()); 
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:216:1: ( rule__EnumLiteral__NameAssignment )
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:216:2: rule__EnumLiteral__NameAssignment
            {
            pushFollow(FOLLOW_rule__EnumLiteral__NameAssignment_in_ruleEnumLiteral394);
            rule__EnumLiteral__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getEnumLiteralAccess().getNameAssignment()); 

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
    // $ANTLR end "ruleEnumLiteral"


    // $ANTLR start "entryRuleAttribute"
    // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:228:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:229:1: ( ruleAttribute EOF )
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:230:1: ruleAttribute EOF
            {
             before(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute421);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute428); 

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
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:237:1: ruleAttribute : ( ( rule__Attribute__Group__0 ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:241:2: ( ( ( rule__Attribute__Group__0 ) ) )
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:242:1: ( ( rule__Attribute__Group__0 ) )
            {
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:242:1: ( ( rule__Attribute__Group__0 ) )
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:243:1: ( rule__Attribute__Group__0 )
            {
             before(grammarAccess.getAttributeAccess().getGroup()); 
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:244:1: ( rule__Attribute__Group__0 )
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:244:2: rule__Attribute__Group__0
            {
            pushFollow(FOLLOW_rule__Attribute__Group__0_in_ruleAttribute454);
            rule__Attribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getGroup()); 

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
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleType"
    // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:256:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:257:1: ( ruleType EOF )
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:258:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType481);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType488); 

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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:265:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:269:2: ( ( ( rule__Type__Alternatives ) ) )
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:270:1: ( ( rule__Type__Alternatives ) )
            {
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:270:1: ( ( rule__Type__Alternatives ) )
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:271:1: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:272:1: ( rule__Type__Alternatives )
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:272:2: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_rule__Type__Alternatives_in_ruleType514);
            rule__Type__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleSimpleType"
    // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:284:1: entryRuleSimpleType : ruleSimpleType EOF ;
    public final void entryRuleSimpleType() throws RecognitionException {
        try {
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:285:1: ( ruleSimpleType EOF )
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:286:1: ruleSimpleType EOF
            {
             before(grammarAccess.getSimpleTypeRule()); 
            pushFollow(FOLLOW_ruleSimpleType_in_entryRuleSimpleType541);
            ruleSimpleType();

            state._fsp--;

             after(grammarAccess.getSimpleTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleType548); 

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
    // $ANTLR end "entryRuleSimpleType"


    // $ANTLR start "ruleSimpleType"
    // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:293:1: ruleSimpleType : ( ( rule__SimpleType__Group__0 ) ) ;
    public final void ruleSimpleType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:297:2: ( ( ( rule__SimpleType__Group__0 ) ) )
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:298:1: ( ( rule__SimpleType__Group__0 ) )
            {
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:298:1: ( ( rule__SimpleType__Group__0 ) )
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:299:1: ( rule__SimpleType__Group__0 )
            {
             before(grammarAccess.getSimpleTypeAccess().getGroup()); 
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:300:1: ( rule__SimpleType__Group__0 )
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:300:2: rule__SimpleType__Group__0
            {
            pushFollow(FOLLOW_rule__SimpleType__Group__0_in_ruleSimpleType574);
            rule__SimpleType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSimpleTypeAccess().getGroup()); 

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
    // $ANTLR end "ruleSimpleType"


    // $ANTLR start "entryRuleQualifiedName"
    // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:312:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:313:1: ( ruleQualifiedName EOF )
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:314:1: ruleQualifiedName EOF
            {
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName601);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName608); 

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
    // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:321:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:325:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:326:1: ( ( rule__QualifiedName__Group__0 ) )
            {
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:326:1: ( ( rule__QualifiedName__Group__0 ) )
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:327:1: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:328:1: ( rule__QualifiedName__Group__0 )
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:328:2: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName634);
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


    // $ANTLR start "entryRuleQualifiedNameWithWildcards"
    // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:340:1: entryRuleQualifiedNameWithWildcards : ruleQualifiedNameWithWildcards EOF ;
    public final void entryRuleQualifiedNameWithWildcards() throws RecognitionException {
        try {
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:341:1: ( ruleQualifiedNameWithWildcards EOF )
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:342:1: ruleQualifiedNameWithWildcards EOF
            {
             before(grammarAccess.getQualifiedNameWithWildcardsRule()); 
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcards_in_entryRuleQualifiedNameWithWildcards661);
            ruleQualifiedNameWithWildcards();

            state._fsp--;

             after(grammarAccess.getQualifiedNameWithWildcardsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcards668); 

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
    // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:349:1: ruleQualifiedNameWithWildcards : ( ( rule__QualifiedNameWithWildcards__Group__0 ) ) ;
    public final void ruleQualifiedNameWithWildcards() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:353:2: ( ( ( rule__QualifiedNameWithWildcards__Group__0 ) ) )
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:354:1: ( ( rule__QualifiedNameWithWildcards__Group__0 ) )
            {
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:354:1: ( ( rule__QualifiedNameWithWildcards__Group__0 ) )
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:355:1: ( rule__QualifiedNameWithWildcards__Group__0 )
            {
             before(grammarAccess.getQualifiedNameWithWildcardsAccess().getGroup()); 
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:356:1: ( rule__QualifiedNameWithWildcards__Group__0 )
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:356:2: rule__QualifiedNameWithWildcards__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildcards__Group__0_in_ruleQualifiedNameWithWildcards694);
            rule__QualifiedNameWithWildcards__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameWithWildcardsAccess().getGroup()); 

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


    // $ANTLR start "rule__Model__Alternatives"
    // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:368:1: rule__Model__Alternatives : ( ( ( ( rule__Model__TypesAssignment_0 ) ) ( ( rule__Model__TypesAssignment_0 )* ) ) | ( ( rule__Model__PackageAssignment_1 ) ) );
    public final void rule__Model__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:372:1: ( ( ( ( rule__Model__TypesAssignment_0 ) ) ( ( rule__Model__TypesAssignment_0 )* ) ) | ( ( rule__Model__PackageAssignment_1 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==18) ) {
                alt2=1;
            }
            else if ( (LA2_0==11) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:373:1: ( ( ( rule__Model__TypesAssignment_0 ) ) ( ( rule__Model__TypesAssignment_0 )* ) )
                    {
                    // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:373:1: ( ( ( rule__Model__TypesAssignment_0 ) ) ( ( rule__Model__TypesAssignment_0 )* ) )
                    // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:374:1: ( ( rule__Model__TypesAssignment_0 ) ) ( ( rule__Model__TypesAssignment_0 )* )
                    {
                    // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:374:1: ( ( rule__Model__TypesAssignment_0 ) )
                    // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:375:1: ( rule__Model__TypesAssignment_0 )
                    {
                     before(grammarAccess.getModelAccess().getTypesAssignment_0()); 
                    // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:376:1: ( rule__Model__TypesAssignment_0 )
                    // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:376:2: rule__Model__TypesAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Model__TypesAssignment_0_in_rule__Model__Alternatives732);
                    rule__Model__TypesAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getModelAccess().getTypesAssignment_0()); 

                    }

                    // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:379:1: ( ( rule__Model__TypesAssignment_0 )* )
                    // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:380:1: ( rule__Model__TypesAssignment_0 )*
                    {
                     before(grammarAccess.getModelAccess().getTypesAssignment_0()); 
                    // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:381:1: ( rule__Model__TypesAssignment_0 )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==18) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:381:2: rule__Model__TypesAssignment_0
                    	    {
                    	    pushFollow(FOLLOW_rule__Model__TypesAssignment_0_in_rule__Model__Alternatives744);
                    	    rule__Model__TypesAssignment_0();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                     after(grammarAccess.getModelAccess().getTypesAssignment_0()); 

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:386:6: ( ( rule__Model__PackageAssignment_1 ) )
                    {
                    // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:386:6: ( ( rule__Model__PackageAssignment_1 ) )
                    // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:387:1: ( rule__Model__PackageAssignment_1 )
                    {
                     before(grammarAccess.getModelAccess().getPackageAssignment_1()); 
                    // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:388:1: ( rule__Model__PackageAssignment_1 )
                    // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:388:2: rule__Model__PackageAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Model__PackageAssignment_1_in_rule__Model__Alternatives765);
                    rule__Model__PackageAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getModelAccess().getPackageAssignment_1()); 

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
    // $ANTLR end "rule__Model__Alternatives"


    // $ANTLR start "rule__Type__Alternatives"
    // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:397:1: rule__Type__Alternatives : ( ( ruleBusinessObject ) | ( ruleEnumeration ) | ( ruleSimpleType ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:401:1: ( ( ruleBusinessObject ) | ( ruleEnumeration ) | ( ruleSimpleType ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt3=1;
                }
                break;
            case 16:
                {
                alt3=2;
                }
                break;
            case 18:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:402:1: ( ruleBusinessObject )
                    {
                    // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:402:1: ( ruleBusinessObject )
                    // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:403:1: ruleBusinessObject
                    {
                     before(grammarAccess.getTypeAccess().getBusinessObjectParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleBusinessObject_in_rule__Type__Alternatives798);
                    ruleBusinessObject();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getBusinessObjectParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:408:6: ( ruleEnumeration )
                    {
                    // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:408:6: ( ruleEnumeration )
                    // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:409:1: ruleEnumeration
                    {
                     before(grammarAccess.getTypeAccess().getEnumerationParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleEnumeration_in_rule__Type__Alternatives815);
                    ruleEnumeration();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getEnumerationParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:414:6: ( ruleSimpleType )
                    {
                    // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:414:6: ( ruleSimpleType )
                    // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:415:1: ruleSimpleType
                    {
                     before(grammarAccess.getTypeAccess().getSimpleTypeParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleSimpleType_in_rule__Type__Alternatives832);
                    ruleSimpleType();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getSimpleTypeParserRuleCall_2()); 

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
    // $ANTLR end "rule__Type__Alternatives"


    // $ANTLR start "rule__Package__Group__0"
    // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:427:1: rule__Package__Group__0 : rule__Package__Group__0__Impl rule__Package__Group__1 ;
    public final void rule__Package__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:431:1: ( rule__Package__Group__0__Impl rule__Package__Group__1 )
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:432:2: rule__Package__Group__0__Impl rule__Package__Group__1
            {
            pushFollow(FOLLOW_rule__Package__Group__0__Impl_in_rule__Package__Group__0862);
            rule__Package__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Package__Group__1_in_rule__Package__Group__0865);
            rule__Package__Group__1();

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
    // $ANTLR end "rule__Package__Group__0"


    // $ANTLR start "rule__Package__Group__0__Impl"
    // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:439:1: rule__Package__Group__0__Impl : ( 'package' ) ;
    public final void rule__Package__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:443:1: ( ( 'package' ) )
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:444:1: ( 'package' )
            {
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:444:1: ( 'package' )
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:445:1: 'package'
            {
             before(grammarAccess.getPackageAccess().getPackageKeyword_0()); 
            match(input,11,FOLLOW_11_in_rule__Package__Group__0__Impl893); 
             after(grammarAccess.getPackageAccess().getPackageKeyword_0()); 

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
    // $ANTLR end "rule__Package__Group__0__Impl"


    // $ANTLR start "rule__Package__Group__1"
    // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:458:1: rule__Package__Group__1 : rule__Package__Group__1__Impl rule__Package__Group__2 ;
    public final void rule__Package__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:462:1: ( rule__Package__Group__1__Impl rule__Package__Group__2 )
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:463:2: rule__Package__Group__1__Impl rule__Package__Group__2
            {
            pushFollow(FOLLOW_rule__Package__Group__1__Impl_in_rule__Package__Group__1924);
            rule__Package__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Package__Group__2_in_rule__Package__Group__1927);
            rule__Package__Group__2();

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
    // $ANTLR end "rule__Package__Group__1"


    // $ANTLR start "rule__Package__Group__1__Impl"
    // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:470:1: rule__Package__Group__1__Impl : ( ( rule__Package__NameAssignment_1 ) ) ;
    public final void rule__Package__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:474:1: ( ( ( rule__Package__NameAssignment_1 ) ) )
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:475:1: ( ( rule__Package__NameAssignment_1 ) )
            {
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:475:1: ( ( rule__Package__NameAssignment_1 ) )
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:476:1: ( rule__Package__NameAssignment_1 )
            {
             before(grammarAccess.getPackageAccess().getNameAssignment_1()); 
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:477:1: ( rule__Package__NameAssignment_1 )
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:477:2: rule__Package__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Package__NameAssignment_1_in_rule__Package__Group__1__Impl954);
            rule__Package__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPackageAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Package__Group__1__Impl"


    // $ANTLR start "rule__Package__Group__2"
    // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:487:1: rule__Package__Group__2 : rule__Package__Group__2__Impl rule__Package__Group__3 ;
    public final void rule__Package__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:491:1: ( rule__Package__Group__2__Impl rule__Package__Group__3 )
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:492:2: rule__Package__Group__2__Impl rule__Package__Group__3
            {
            pushFollow(FOLLOW_rule__Package__Group__2__Impl_in_rule__Package__Group__2984);
            rule__Package__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Package__Group__3_in_rule__Package__Group__2987);
            rule__Package__Group__3();

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
    // $ANTLR end "rule__Package__Group__2"


    // $ANTLR start "rule__Package__Group__2__Impl"
    // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:499:1: rule__Package__Group__2__Impl : ( ( rule__Package__ImportsAssignment_2 )* ) ;
    public final void rule__Package__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:503:1: ( ( ( rule__Package__ImportsAssignment_2 )* ) )
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:504:1: ( ( rule__Package__ImportsAssignment_2 )* )
            {
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:504:1: ( ( rule__Package__ImportsAssignment_2 )* )
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:505:1: ( rule__Package__ImportsAssignment_2 )*
            {
             before(grammarAccess.getPackageAccess().getImportsAssignment_2()); 
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:506:1: ( rule__Package__ImportsAssignment_2 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==12) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:506:2: rule__Package__ImportsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Package__ImportsAssignment_2_in_rule__Package__Group__2__Impl1014);
            	    rule__Package__ImportsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getPackageAccess().getImportsAssignment_2()); 

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
    // $ANTLR end "rule__Package__Group__2__Impl"


    // $ANTLR start "rule__Package__Group__3"
    // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:516:1: rule__Package__Group__3 : rule__Package__Group__3__Impl ;
    public final void rule__Package__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:520:1: ( rule__Package__Group__3__Impl )
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:521:2: rule__Package__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Package__Group__3__Impl_in_rule__Package__Group__31045);
            rule__Package__Group__3__Impl();

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
    // $ANTLR end "rule__Package__Group__3"


    // $ANTLR start "rule__Package__Group__3__Impl"
    // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:527:1: rule__Package__Group__3__Impl : ( ( rule__Package__TypeAssignment_3 ) ) ;
    public final void rule__Package__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:531:1: ( ( ( rule__Package__TypeAssignment_3 ) ) )
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:532:1: ( ( rule__Package__TypeAssignment_3 ) )
            {
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:532:1: ( ( rule__Package__TypeAssignment_3 ) )
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:533:1: ( rule__Package__TypeAssignment_3 )
            {
             before(grammarAccess.getPackageAccess().getTypeAssignment_3()); 
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:534:1: ( rule__Package__TypeAssignment_3 )
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:534:2: rule__Package__TypeAssignment_3
            {
            pushFollow(FOLLOW_rule__Package__TypeAssignment_3_in_rule__Package__Group__3__Impl1072);
            rule__Package__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getPackageAccess().getTypeAssignment_3()); 

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
    // $ANTLR end "rule__Package__Group__3__Impl"


    // $ANTLR start "rule__Import__Group__0"
    // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:552:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:556:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:557:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__01110);
            rule__Import__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Import__Group__1_in_rule__Import__Group__01113);
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
    // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:564:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:568:1: ( ( 'import' ) )
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:569:1: ( 'import' )
            {
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:569:1: ( 'import' )
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:570:1: 'import'
            {
             before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            match(input,12,FOLLOW_12_in_rule__Import__Group__0__Impl1141); 
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
    // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:583:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:587:1: ( rule__Import__Group__1__Impl )
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:588:2: rule__Import__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__11172);
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
    // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:594:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:598:1: ( ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) )
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:599:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            {
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:599:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:600:1: ( rule__Import__ImportedNamespaceAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:601:1: ( rule__Import__ImportedNamespaceAssignment_1 )
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:601:2: rule__Import__ImportedNamespaceAssignment_1
            {
            pushFollow(FOLLOW_rule__Import__ImportedNamespaceAssignment_1_in_rule__Import__Group__1__Impl1199);
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


    // $ANTLR start "rule__BusinessObject__Group__0"
    // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:615:1: rule__BusinessObject__Group__0 : rule__BusinessObject__Group__0__Impl rule__BusinessObject__Group__1 ;
    public final void rule__BusinessObject__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:619:1: ( rule__BusinessObject__Group__0__Impl rule__BusinessObject__Group__1 )
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:620:2: rule__BusinessObject__Group__0__Impl rule__BusinessObject__Group__1
            {
            pushFollow(FOLLOW_rule__BusinessObject__Group__0__Impl_in_rule__BusinessObject__Group__01233);
            rule__BusinessObject__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BusinessObject__Group__1_in_rule__BusinessObject__Group__01236);
            rule__BusinessObject__Group__1();

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
    // $ANTLR end "rule__BusinessObject__Group__0"


    // $ANTLR start "rule__BusinessObject__Group__0__Impl"
    // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:627:1: rule__BusinessObject__Group__0__Impl : ( 'businessObject' ) ;
    public final void rule__BusinessObject__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:631:1: ( ( 'businessObject' ) )
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:632:1: ( 'businessObject' )
            {
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:632:1: ( 'businessObject' )
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:633:1: 'businessObject'
            {
             before(grammarAccess.getBusinessObjectAccess().getBusinessObjectKeyword_0()); 
            match(input,13,FOLLOW_13_in_rule__BusinessObject__Group__0__Impl1264); 
             after(grammarAccess.getBusinessObjectAccess().getBusinessObjectKeyword_0()); 

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
    // $ANTLR end "rule__BusinessObject__Group__0__Impl"


    // $ANTLR start "rule__BusinessObject__Group__1"
    // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:646:1: rule__BusinessObject__Group__1 : rule__BusinessObject__Group__1__Impl rule__BusinessObject__Group__2 ;
    public final void rule__BusinessObject__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:650:1: ( rule__BusinessObject__Group__1__Impl rule__BusinessObject__Group__2 )
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:651:2: rule__BusinessObject__Group__1__Impl rule__BusinessObject__Group__2
            {
            pushFollow(FOLLOW_rule__BusinessObject__Group__1__Impl_in_rule__BusinessObject__Group__11295);
            rule__BusinessObject__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BusinessObject__Group__2_in_rule__BusinessObject__Group__11298);
            rule__BusinessObject__Group__2();

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
    // $ANTLR end "rule__BusinessObject__Group__1"


    // $ANTLR start "rule__BusinessObject__Group__1__Impl"
    // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:658:1: rule__BusinessObject__Group__1__Impl : ( ( rule__BusinessObject__NameAssignment_1 ) ) ;
    public final void rule__BusinessObject__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:662:1: ( ( ( rule__BusinessObject__NameAssignment_1 ) ) )
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:663:1: ( ( rule__BusinessObject__NameAssignment_1 ) )
            {
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:663:1: ( ( rule__BusinessObject__NameAssignment_1 ) )
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:664:1: ( rule__BusinessObject__NameAssignment_1 )
            {
             before(grammarAccess.getBusinessObjectAccess().getNameAssignment_1()); 
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:665:1: ( rule__BusinessObject__NameAssignment_1 )
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:665:2: rule__BusinessObject__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__BusinessObject__NameAssignment_1_in_rule__BusinessObject__Group__1__Impl1325);
            rule__BusinessObject__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBusinessObjectAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__BusinessObject__Group__1__Impl"


    // $ANTLR start "rule__BusinessObject__Group__2"
    // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:675:1: rule__BusinessObject__Group__2 : rule__BusinessObject__Group__2__Impl rule__BusinessObject__Group__3 ;
    public final void rule__BusinessObject__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:679:1: ( rule__BusinessObject__Group__2__Impl rule__BusinessObject__Group__3 )
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:680:2: rule__BusinessObject__Group__2__Impl rule__BusinessObject__Group__3
            {
            pushFollow(FOLLOW_rule__BusinessObject__Group__2__Impl_in_rule__BusinessObject__Group__21355);
            rule__BusinessObject__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BusinessObject__Group__3_in_rule__BusinessObject__Group__21358);
            rule__BusinessObject__Group__3();

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
    // $ANTLR end "rule__BusinessObject__Group__2"


    // $ANTLR start "rule__BusinessObject__Group__2__Impl"
    // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:687:1: rule__BusinessObject__Group__2__Impl : ( '{' ) ;
    public final void rule__BusinessObject__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:691:1: ( ( '{' ) )
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:692:1: ( '{' )
            {
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:692:1: ( '{' )
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:693:1: '{'
            {
             before(grammarAccess.getBusinessObjectAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_14_in_rule__BusinessObject__Group__2__Impl1386); 
             after(grammarAccess.getBusinessObjectAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__BusinessObject__Group__2__Impl"


    // $ANTLR start "rule__BusinessObject__Group__3"
    // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:706:1: rule__BusinessObject__Group__3 : rule__BusinessObject__Group__3__Impl rule__BusinessObject__Group__4 ;
    public final void rule__BusinessObject__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:710:1: ( rule__BusinessObject__Group__3__Impl rule__BusinessObject__Group__4 )
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:711:2: rule__BusinessObject__Group__3__Impl rule__BusinessObject__Group__4
            {
            pushFollow(FOLLOW_rule__BusinessObject__Group__3__Impl_in_rule__BusinessObject__Group__31417);
            rule__BusinessObject__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BusinessObject__Group__4_in_rule__BusinessObject__Group__31420);
            rule__BusinessObject__Group__4();

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
    // $ANTLR end "rule__BusinessObject__Group__3"


    // $ANTLR start "rule__BusinessObject__Group__3__Impl"
    // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:718:1: rule__BusinessObject__Group__3__Impl : ( ( rule__BusinessObject__AttributesAssignment_3 )* ) ;
    public final void rule__BusinessObject__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:722:1: ( ( ( rule__BusinessObject__AttributesAssignment_3 )* ) )
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:723:1: ( ( rule__BusinessObject__AttributesAssignment_3 )* )
            {
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:723:1: ( ( rule__BusinessObject__AttributesAssignment_3 )* )
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:724:1: ( rule__BusinessObject__AttributesAssignment_3 )*
            {
             before(grammarAccess.getBusinessObjectAccess().getAttributesAssignment_3()); 
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:725:1: ( rule__BusinessObject__AttributesAssignment_3 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:725:2: rule__BusinessObject__AttributesAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__BusinessObject__AttributesAssignment_3_in_rule__BusinessObject__Group__3__Impl1447);
            	    rule__BusinessObject__AttributesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getBusinessObjectAccess().getAttributesAssignment_3()); 

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
    // $ANTLR end "rule__BusinessObject__Group__3__Impl"


    // $ANTLR start "rule__BusinessObject__Group__4"
    // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:735:1: rule__BusinessObject__Group__4 : rule__BusinessObject__Group__4__Impl ;
    public final void rule__BusinessObject__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:739:1: ( rule__BusinessObject__Group__4__Impl )
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:740:2: rule__BusinessObject__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__BusinessObject__Group__4__Impl_in_rule__BusinessObject__Group__41478);
            rule__BusinessObject__Group__4__Impl();

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
    // $ANTLR end "rule__BusinessObject__Group__4"


    // $ANTLR start "rule__BusinessObject__Group__4__Impl"
    // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:746:1: rule__BusinessObject__Group__4__Impl : ( '}' ) ;
    public final void rule__BusinessObject__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:750:1: ( ( '}' ) )
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:751:1: ( '}' )
            {
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:751:1: ( '}' )
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:752:1: '}'
            {
             before(grammarAccess.getBusinessObjectAccess().getRightCurlyBracketKeyword_4()); 
            match(input,15,FOLLOW_15_in_rule__BusinessObject__Group__4__Impl1506); 
             after(grammarAccess.getBusinessObjectAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__BusinessObject__Group__4__Impl"


    // $ANTLR start "rule__Enumeration__Group__0"
    // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:775:1: rule__Enumeration__Group__0 : rule__Enumeration__Group__0__Impl rule__Enumeration__Group__1 ;
    public final void rule__Enumeration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:779:1: ( rule__Enumeration__Group__0__Impl rule__Enumeration__Group__1 )
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:780:2: rule__Enumeration__Group__0__Impl rule__Enumeration__Group__1
            {
            pushFollow(FOLLOW_rule__Enumeration__Group__0__Impl_in_rule__Enumeration__Group__01547);
            rule__Enumeration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Enumeration__Group__1_in_rule__Enumeration__Group__01550);
            rule__Enumeration__Group__1();

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
    // $ANTLR end "rule__Enumeration__Group__0"


    // $ANTLR start "rule__Enumeration__Group__0__Impl"
    // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:787:1: rule__Enumeration__Group__0__Impl : ( 'enum' ) ;
    public final void rule__Enumeration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:791:1: ( ( 'enum' ) )
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:792:1: ( 'enum' )
            {
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:792:1: ( 'enum' )
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:793:1: 'enum'
            {
             before(grammarAccess.getEnumerationAccess().getEnumKeyword_0()); 
            match(input,16,FOLLOW_16_in_rule__Enumeration__Group__0__Impl1578); 
             after(grammarAccess.getEnumerationAccess().getEnumKeyword_0()); 

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
    // $ANTLR end "rule__Enumeration__Group__0__Impl"


    // $ANTLR start "rule__Enumeration__Group__1"
    // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:806:1: rule__Enumeration__Group__1 : rule__Enumeration__Group__1__Impl rule__Enumeration__Group__2 ;
    public final void rule__Enumeration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:810:1: ( rule__Enumeration__Group__1__Impl rule__Enumeration__Group__2 )
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:811:2: rule__Enumeration__Group__1__Impl rule__Enumeration__Group__2
            {
            pushFollow(FOLLOW_rule__Enumeration__Group__1__Impl_in_rule__Enumeration__Group__11609);
            rule__Enumeration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Enumeration__Group__2_in_rule__Enumeration__Group__11612);
            rule__Enumeration__Group__2();

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
    // $ANTLR end "rule__Enumeration__Group__1"


    // $ANTLR start "rule__Enumeration__Group__1__Impl"
    // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:818:1: rule__Enumeration__Group__1__Impl : ( ( rule__Enumeration__NameAssignment_1 ) ) ;
    public final void rule__Enumeration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:822:1: ( ( ( rule__Enumeration__NameAssignment_1 ) ) )
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:823:1: ( ( rule__Enumeration__NameAssignment_1 ) )
            {
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:823:1: ( ( rule__Enumeration__NameAssignment_1 ) )
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:824:1: ( rule__Enumeration__NameAssignment_1 )
            {
             before(grammarAccess.getEnumerationAccess().getNameAssignment_1()); 
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:825:1: ( rule__Enumeration__NameAssignment_1 )
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:825:2: rule__Enumeration__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Enumeration__NameAssignment_1_in_rule__Enumeration__Group__1__Impl1639);
            rule__Enumeration__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEnumerationAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Enumeration__Group__1__Impl"


    // $ANTLR start "rule__Enumeration__Group__2"
    // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:835:1: rule__Enumeration__Group__2 : rule__Enumeration__Group__2__Impl rule__Enumeration__Group__3 ;
    public final void rule__Enumeration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:839:1: ( rule__Enumeration__Group__2__Impl rule__Enumeration__Group__3 )
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:840:2: rule__Enumeration__Group__2__Impl rule__Enumeration__Group__3
            {
            pushFollow(FOLLOW_rule__Enumeration__Group__2__Impl_in_rule__Enumeration__Group__21669);
            rule__Enumeration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Enumeration__Group__3_in_rule__Enumeration__Group__21672);
            rule__Enumeration__Group__3();

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
    // $ANTLR end "rule__Enumeration__Group__2"


    // $ANTLR start "rule__Enumeration__Group__2__Impl"
    // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:847:1: rule__Enumeration__Group__2__Impl : ( '{' ) ;
    public final void rule__Enumeration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:851:1: ( ( '{' ) )
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:852:1: ( '{' )
            {
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:852:1: ( '{' )
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:853:1: '{'
            {
             before(grammarAccess.getEnumerationAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_14_in_rule__Enumeration__Group__2__Impl1700); 
             after(grammarAccess.getEnumerationAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Enumeration__Group__2__Impl"


    // $ANTLR start "rule__Enumeration__Group__3"
    // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:866:1: rule__Enumeration__Group__3 : rule__Enumeration__Group__3__Impl rule__Enumeration__Group__4 ;
    public final void rule__Enumeration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:870:1: ( rule__Enumeration__Group__3__Impl rule__Enumeration__Group__4 )
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:871:2: rule__Enumeration__Group__3__Impl rule__Enumeration__Group__4
            {
            pushFollow(FOLLOW_rule__Enumeration__Group__3__Impl_in_rule__Enumeration__Group__31731);
            rule__Enumeration__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Enumeration__Group__4_in_rule__Enumeration__Group__31734);
            rule__Enumeration__Group__4();

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
    // $ANTLR end "rule__Enumeration__Group__3"


    // $ANTLR start "rule__Enumeration__Group__3__Impl"
    // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:878:1: rule__Enumeration__Group__3__Impl : ( ( ( rule__Enumeration__LiteralsAssignment_3 ) ) ( ( rule__Enumeration__LiteralsAssignment_3 )* ) ) ;
    public final void rule__Enumeration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:882:1: ( ( ( ( rule__Enumeration__LiteralsAssignment_3 ) ) ( ( rule__Enumeration__LiteralsAssignment_3 )* ) ) )
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:883:1: ( ( ( rule__Enumeration__LiteralsAssignment_3 ) ) ( ( rule__Enumeration__LiteralsAssignment_3 )* ) )
            {
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:883:1: ( ( ( rule__Enumeration__LiteralsAssignment_3 ) ) ( ( rule__Enumeration__LiteralsAssignment_3 )* ) )
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:884:1: ( ( rule__Enumeration__LiteralsAssignment_3 ) ) ( ( rule__Enumeration__LiteralsAssignment_3 )* )
            {
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:884:1: ( ( rule__Enumeration__LiteralsAssignment_3 ) )
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:885:1: ( rule__Enumeration__LiteralsAssignment_3 )
            {
             before(grammarAccess.getEnumerationAccess().getLiteralsAssignment_3()); 
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:886:1: ( rule__Enumeration__LiteralsAssignment_3 )
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:886:2: rule__Enumeration__LiteralsAssignment_3
            {
            pushFollow(FOLLOW_rule__Enumeration__LiteralsAssignment_3_in_rule__Enumeration__Group__3__Impl1763);
            rule__Enumeration__LiteralsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getEnumerationAccess().getLiteralsAssignment_3()); 

            }

            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:889:1: ( ( rule__Enumeration__LiteralsAssignment_3 )* )
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:890:1: ( rule__Enumeration__LiteralsAssignment_3 )*
            {
             before(grammarAccess.getEnumerationAccess().getLiteralsAssignment_3()); 
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:891:1: ( rule__Enumeration__LiteralsAssignment_3 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:891:2: rule__Enumeration__LiteralsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Enumeration__LiteralsAssignment_3_in_rule__Enumeration__Group__3__Impl1775);
            	    rule__Enumeration__LiteralsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getEnumerationAccess().getLiteralsAssignment_3()); 

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
    // $ANTLR end "rule__Enumeration__Group__3__Impl"


    // $ANTLR start "rule__Enumeration__Group__4"
    // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:902:1: rule__Enumeration__Group__4 : rule__Enumeration__Group__4__Impl ;
    public final void rule__Enumeration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:906:1: ( rule__Enumeration__Group__4__Impl )
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:907:2: rule__Enumeration__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Enumeration__Group__4__Impl_in_rule__Enumeration__Group__41808);
            rule__Enumeration__Group__4__Impl();

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
    // $ANTLR end "rule__Enumeration__Group__4"


    // $ANTLR start "rule__Enumeration__Group__4__Impl"
    // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:913:1: rule__Enumeration__Group__4__Impl : ( '}' ) ;
    public final void rule__Enumeration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:917:1: ( ( '}' ) )
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:918:1: ( '}' )
            {
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:918:1: ( '}' )
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:919:1: '}'
            {
             before(grammarAccess.getEnumerationAccess().getRightCurlyBracketKeyword_4()); 
            match(input,15,FOLLOW_15_in_rule__Enumeration__Group__4__Impl1836); 
             after(grammarAccess.getEnumerationAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__Enumeration__Group__4__Impl"


    // $ANTLR start "rule__Attribute__Group__0"
    // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:942:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:946:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:947:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FOLLOW_rule__Attribute__Group__0__Impl_in_rule__Attribute__Group__01877);
            rule__Attribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attribute__Group__1_in_rule__Attribute__Group__01880);
            rule__Attribute__Group__1();

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
    // $ANTLR end "rule__Attribute__Group__0"


    // $ANTLR start "rule__Attribute__Group__0__Impl"
    // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:954:1: rule__Attribute__Group__0__Impl : ( ( rule__Attribute__NameAssignment_0 ) ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:958:1: ( ( ( rule__Attribute__NameAssignment_0 ) ) )
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:959:1: ( ( rule__Attribute__NameAssignment_0 ) )
            {
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:959:1: ( ( rule__Attribute__NameAssignment_0 ) )
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:960:1: ( rule__Attribute__NameAssignment_0 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_0()); 
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:961:1: ( rule__Attribute__NameAssignment_0 )
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:961:2: rule__Attribute__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Attribute__NameAssignment_0_in_rule__Attribute__Group__0__Impl1907);
            rule__Attribute__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__Attribute__Group__0__Impl"


    // $ANTLR start "rule__Attribute__Group__1"
    // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:971:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:975:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:976:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
            {
            pushFollow(FOLLOW_rule__Attribute__Group__1__Impl_in_rule__Attribute__Group__11937);
            rule__Attribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attribute__Group__2_in_rule__Attribute__Group__11940);
            rule__Attribute__Group__2();

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
    // $ANTLR end "rule__Attribute__Group__1"


    // $ANTLR start "rule__Attribute__Group__1__Impl"
    // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:983:1: rule__Attribute__Group__1__Impl : ( ':' ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:987:1: ( ( ':' ) )
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:988:1: ( ':' )
            {
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:988:1: ( ':' )
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:989:1: ':'
            {
             before(grammarAccess.getAttributeAccess().getColonKeyword_1()); 
            match(input,17,FOLLOW_17_in_rule__Attribute__Group__1__Impl1968); 
             after(grammarAccess.getAttributeAccess().getColonKeyword_1()); 

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
    // $ANTLR end "rule__Attribute__Group__1__Impl"


    // $ANTLR start "rule__Attribute__Group__2"
    // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:1002:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:1006:1: ( rule__Attribute__Group__2__Impl )
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:1007:2: rule__Attribute__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Attribute__Group__2__Impl_in_rule__Attribute__Group__21999);
            rule__Attribute__Group__2__Impl();

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
    // $ANTLR end "rule__Attribute__Group__2"


    // $ANTLR start "rule__Attribute__Group__2__Impl"
    // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:1013:1: rule__Attribute__Group__2__Impl : ( ( rule__Attribute__TypeAssignment_2 ) ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:1017:1: ( ( ( rule__Attribute__TypeAssignment_2 ) ) )
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:1018:1: ( ( rule__Attribute__TypeAssignment_2 ) )
            {
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:1018:1: ( ( rule__Attribute__TypeAssignment_2 ) )
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:1019:1: ( rule__Attribute__TypeAssignment_2 )
            {
             before(grammarAccess.getAttributeAccess().getTypeAssignment_2()); 
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:1020:1: ( rule__Attribute__TypeAssignment_2 )
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:1020:2: rule__Attribute__TypeAssignment_2
            {
            pushFollow(FOLLOW_rule__Attribute__TypeAssignment_2_in_rule__Attribute__Group__2__Impl2026);
            rule__Attribute__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getTypeAssignment_2()); 

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
    // $ANTLR end "rule__Attribute__Group__2__Impl"


    // $ANTLR start "rule__SimpleType__Group__0"
    // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:1036:1: rule__SimpleType__Group__0 : rule__SimpleType__Group__0__Impl rule__SimpleType__Group__1 ;
    public final void rule__SimpleType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:1040:1: ( rule__SimpleType__Group__0__Impl rule__SimpleType__Group__1 )
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:1041:2: rule__SimpleType__Group__0__Impl rule__SimpleType__Group__1
            {
            pushFollow(FOLLOW_rule__SimpleType__Group__0__Impl_in_rule__SimpleType__Group__02062);
            rule__SimpleType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SimpleType__Group__1_in_rule__SimpleType__Group__02065);
            rule__SimpleType__Group__1();

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
    // $ANTLR end "rule__SimpleType__Group__0"


    // $ANTLR start "rule__SimpleType__Group__0__Impl"
    // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:1048:1: rule__SimpleType__Group__0__Impl : ( 'type' ) ;
    public final void rule__SimpleType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:1052:1: ( ( 'type' ) )
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:1053:1: ( 'type' )
            {
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:1053:1: ( 'type' )
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:1054:1: 'type'
            {
             before(grammarAccess.getSimpleTypeAccess().getTypeKeyword_0()); 
            match(input,18,FOLLOW_18_in_rule__SimpleType__Group__0__Impl2093); 
             after(grammarAccess.getSimpleTypeAccess().getTypeKeyword_0()); 

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
    // $ANTLR end "rule__SimpleType__Group__0__Impl"


    // $ANTLR start "rule__SimpleType__Group__1"
    // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:1067:1: rule__SimpleType__Group__1 : rule__SimpleType__Group__1__Impl ;
    public final void rule__SimpleType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:1071:1: ( rule__SimpleType__Group__1__Impl )
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:1072:2: rule__SimpleType__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__SimpleType__Group__1__Impl_in_rule__SimpleType__Group__12124);
            rule__SimpleType__Group__1__Impl();

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
    // $ANTLR end "rule__SimpleType__Group__1"


    // $ANTLR start "rule__SimpleType__Group__1__Impl"
    // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:1078:1: rule__SimpleType__Group__1__Impl : ( ( rule__SimpleType__NameAssignment_1 ) ) ;
    public final void rule__SimpleType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:1082:1: ( ( ( rule__SimpleType__NameAssignment_1 ) ) )
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:1083:1: ( ( rule__SimpleType__NameAssignment_1 ) )
            {
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:1083:1: ( ( rule__SimpleType__NameAssignment_1 ) )
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:1084:1: ( rule__SimpleType__NameAssignment_1 )
            {
             before(grammarAccess.getSimpleTypeAccess().getNameAssignment_1()); 
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:1085:1: ( rule__SimpleType__NameAssignment_1 )
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:1085:2: rule__SimpleType__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__SimpleType__NameAssignment_1_in_rule__SimpleType__Group__1__Impl2151);
            rule__SimpleType__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSimpleTypeAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__SimpleType__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:1099:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:1103:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:1104:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__02185);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__02188);
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
    // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:1111:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:1115:1: ( ( RULE_ID ) )
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:1116:1: ( RULE_ID )
            {
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:1116:1: ( RULE_ID )
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:1117:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl2215); 
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
    // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:1128:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:1132:1: ( rule__QualifiedName__Group__1__Impl )
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:1133:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__12244);
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
    // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:1139:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:1143:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:1144:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:1144:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:1145:1: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:1146:1: ( rule__QualifiedName__Group_1__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==19) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:1146:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl2271);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
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
    // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:1160:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:1164:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:1165:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__02306);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__02309);
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
    // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:1172:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:1176:1: ( ( '.' ) )
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:1177:1: ( '.' )
            {
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:1177:1: ( '.' )
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:1178:1: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,19,FOLLOW_19_in_rule__QualifiedName__Group_1__0__Impl2337); 
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
    // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:1191:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:1195:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:1196:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__12368);
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
    // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:1202:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:1206:1: ( ( RULE_ID ) )
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:1207:1: ( RULE_ID )
            {
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:1207:1: ( RULE_ID )
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:1208:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl2395); 
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


    // $ANTLR start "rule__QualifiedNameWithWildcards__Group__0"
    // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:1223:1: rule__QualifiedNameWithWildcards__Group__0 : rule__QualifiedNameWithWildcards__Group__0__Impl rule__QualifiedNameWithWildcards__Group__1 ;
    public final void rule__QualifiedNameWithWildcards__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:1227:1: ( rule__QualifiedNameWithWildcards__Group__0__Impl rule__QualifiedNameWithWildcards__Group__1 )
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:1228:2: rule__QualifiedNameWithWildcards__Group__0__Impl rule__QualifiedNameWithWildcards__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildcards__Group__0__Impl_in_rule__QualifiedNameWithWildcards__Group__02428);
            rule__QualifiedNameWithWildcards__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedNameWithWildcards__Group__1_in_rule__QualifiedNameWithWildcards__Group__02431);
            rule__QualifiedNameWithWildcards__Group__1();

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
    // $ANTLR end "rule__QualifiedNameWithWildcards__Group__0"


    // $ANTLR start "rule__QualifiedNameWithWildcards__Group__0__Impl"
    // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:1235:1: rule__QualifiedNameWithWildcards__Group__0__Impl : ( ruleQualifiedName ) ;
    public final void rule__QualifiedNameWithWildcards__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:1239:1: ( ( ruleQualifiedName ) )
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:1240:1: ( ruleQualifiedName )
            {
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:1240:1: ( ruleQualifiedName )
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:1241:1: ruleQualifiedName
            {
             before(grammarAccess.getQualifiedNameWithWildcardsAccess().getQualifiedNameParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__QualifiedNameWithWildcards__Group__0__Impl2458);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameWithWildcardsAccess().getQualifiedNameParserRuleCall_0()); 

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
    // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:1252:1: rule__QualifiedNameWithWildcards__Group__1 : rule__QualifiedNameWithWildcards__Group__1__Impl ;
    public final void rule__QualifiedNameWithWildcards__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:1256:1: ( rule__QualifiedNameWithWildcards__Group__1__Impl )
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:1257:2: rule__QualifiedNameWithWildcards__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildcards__Group__1__Impl_in_rule__QualifiedNameWithWildcards__Group__12487);
            rule__QualifiedNameWithWildcards__Group__1__Impl();

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
    // $ANTLR end "rule__QualifiedNameWithWildcards__Group__1"


    // $ANTLR start "rule__QualifiedNameWithWildcards__Group__1__Impl"
    // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:1263:1: rule__QualifiedNameWithWildcards__Group__1__Impl : ( ( '.*' )? ) ;
    public final void rule__QualifiedNameWithWildcards__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:1267:1: ( ( ( '.*' )? ) )
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:1268:1: ( ( '.*' )? )
            {
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:1268:1: ( ( '.*' )? )
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:1269:1: ( '.*' )?
            {
             before(grammarAccess.getQualifiedNameWithWildcardsAccess().getFullStopAsteriskKeyword_1()); 
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:1270:1: ( '.*' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==20) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:1271:2: '.*'
                    {
                    match(input,20,FOLLOW_20_in_rule__QualifiedNameWithWildcards__Group__1__Impl2516); 

                    }
                    break;

            }

             after(grammarAccess.getQualifiedNameWithWildcardsAccess().getFullStopAsteriskKeyword_1()); 

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


    // $ANTLR start "rule__Model__TypesAssignment_0"
    // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:1287:1: rule__Model__TypesAssignment_0 : ( ruleSimpleType ) ;
    public final void rule__Model__TypesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:1291:1: ( ( ruleSimpleType ) )
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:1292:1: ( ruleSimpleType )
            {
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:1292:1: ( ruleSimpleType )
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:1293:1: ruleSimpleType
            {
             before(grammarAccess.getModelAccess().getTypesSimpleTypeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleSimpleType_in_rule__Model__TypesAssignment_02558);
            ruleSimpleType();

            state._fsp--;

             after(grammarAccess.getModelAccess().getTypesSimpleTypeParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Model__TypesAssignment_0"


    // $ANTLR start "rule__Model__PackageAssignment_1"
    // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:1302:1: rule__Model__PackageAssignment_1 : ( rulePackage ) ;
    public final void rule__Model__PackageAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:1306:1: ( ( rulePackage ) )
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:1307:1: ( rulePackage )
            {
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:1307:1: ( rulePackage )
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:1308:1: rulePackage
            {
             before(grammarAccess.getModelAccess().getPackagePackageParserRuleCall_1_0()); 
            pushFollow(FOLLOW_rulePackage_in_rule__Model__PackageAssignment_12589);
            rulePackage();

            state._fsp--;

             after(grammarAccess.getModelAccess().getPackagePackageParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Model__PackageAssignment_1"


    // $ANTLR start "rule__Package__NameAssignment_1"
    // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:1317:1: rule__Package__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__Package__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:1321:1: ( ( ruleQualifiedName ) )
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:1322:1: ( ruleQualifiedName )
            {
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:1322:1: ( ruleQualifiedName )
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:1323:1: ruleQualifiedName
            {
             before(grammarAccess.getPackageAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Package__NameAssignment_12620);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getPackageAccess().getNameQualifiedNameParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Package__NameAssignment_1"


    // $ANTLR start "rule__Package__ImportsAssignment_2"
    // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:1332:1: rule__Package__ImportsAssignment_2 : ( ruleImport ) ;
    public final void rule__Package__ImportsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:1336:1: ( ( ruleImport ) )
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:1337:1: ( ruleImport )
            {
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:1337:1: ( ruleImport )
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:1338:1: ruleImport
            {
             before(grammarAccess.getPackageAccess().getImportsImportParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleImport_in_rule__Package__ImportsAssignment_22651);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getPackageAccess().getImportsImportParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Package__ImportsAssignment_2"


    // $ANTLR start "rule__Package__TypeAssignment_3"
    // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:1347:1: rule__Package__TypeAssignment_3 : ( ruleType ) ;
    public final void rule__Package__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:1351:1: ( ( ruleType ) )
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:1352:1: ( ruleType )
            {
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:1352:1: ( ruleType )
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:1353:1: ruleType
            {
             before(grammarAccess.getPackageAccess().getTypeTypeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__Package__TypeAssignment_32682);
            ruleType();

            state._fsp--;

             after(grammarAccess.getPackageAccess().getTypeTypeParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Package__TypeAssignment_3"


    // $ANTLR start "rule__Import__ImportedNamespaceAssignment_1"
    // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:1362:1: rule__Import__ImportedNamespaceAssignment_1 : ( ruleQualifiedNameWithWildcards ) ;
    public final void rule__Import__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:1366:1: ( ( ruleQualifiedNameWithWildcards ) )
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:1367:1: ( ruleQualifiedNameWithWildcards )
            {
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:1367:1: ( ruleQualifiedNameWithWildcards )
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:1368:1: ruleQualifiedNameWithWildcards
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardsParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcards_in_rule__Import__ImportedNamespaceAssignment_12713);
            ruleQualifiedNameWithWildcards();

            state._fsp--;

             after(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardsParserRuleCall_1_0()); 

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


    // $ANTLR start "rule__BusinessObject__NameAssignment_1"
    // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:1377:1: rule__BusinessObject__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__BusinessObject__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:1381:1: ( ( RULE_ID ) )
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:1382:1: ( RULE_ID )
            {
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:1382:1: ( RULE_ID )
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:1383:1: RULE_ID
            {
             before(grammarAccess.getBusinessObjectAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__BusinessObject__NameAssignment_12744); 
             after(grammarAccess.getBusinessObjectAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__BusinessObject__NameAssignment_1"


    // $ANTLR start "rule__BusinessObject__AttributesAssignment_3"
    // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:1392:1: rule__BusinessObject__AttributesAssignment_3 : ( ruleAttribute ) ;
    public final void rule__BusinessObject__AttributesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:1396:1: ( ( ruleAttribute ) )
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:1397:1: ( ruleAttribute )
            {
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:1397:1: ( ruleAttribute )
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:1398:1: ruleAttribute
            {
             before(grammarAccess.getBusinessObjectAccess().getAttributesAttributeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleAttribute_in_rule__BusinessObject__AttributesAssignment_32775);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getBusinessObjectAccess().getAttributesAttributeParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__BusinessObject__AttributesAssignment_3"


    // $ANTLR start "rule__Enumeration__NameAssignment_1"
    // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:1407:1: rule__Enumeration__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Enumeration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:1411:1: ( ( RULE_ID ) )
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:1412:1: ( RULE_ID )
            {
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:1412:1: ( RULE_ID )
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:1413:1: RULE_ID
            {
             before(grammarAccess.getEnumerationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Enumeration__NameAssignment_12806); 
             after(grammarAccess.getEnumerationAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Enumeration__NameAssignment_1"


    // $ANTLR start "rule__Enumeration__LiteralsAssignment_3"
    // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:1422:1: rule__Enumeration__LiteralsAssignment_3 : ( ruleEnumLiteral ) ;
    public final void rule__Enumeration__LiteralsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:1426:1: ( ( ruleEnumLiteral ) )
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:1427:1: ( ruleEnumLiteral )
            {
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:1427:1: ( ruleEnumLiteral )
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:1428:1: ruleEnumLiteral
            {
             before(grammarAccess.getEnumerationAccess().getLiteralsEnumLiteralParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleEnumLiteral_in_rule__Enumeration__LiteralsAssignment_32837);
            ruleEnumLiteral();

            state._fsp--;

             after(grammarAccess.getEnumerationAccess().getLiteralsEnumLiteralParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Enumeration__LiteralsAssignment_3"


    // $ANTLR start "rule__EnumLiteral__NameAssignment"
    // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:1437:1: rule__EnumLiteral__NameAssignment : ( RULE_ID ) ;
    public final void rule__EnumLiteral__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:1441:1: ( ( RULE_ID ) )
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:1442:1: ( RULE_ID )
            {
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:1442:1: ( RULE_ID )
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:1443:1: RULE_ID
            {
             before(grammarAccess.getEnumLiteralAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EnumLiteral__NameAssignment2868); 
             after(grammarAccess.getEnumLiteralAccess().getNameIDTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__EnumLiteral__NameAssignment"


    // $ANTLR start "rule__Attribute__NameAssignment_0"
    // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:1452:1: rule__Attribute__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Attribute__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:1456:1: ( ( RULE_ID ) )
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:1457:1: ( RULE_ID )
            {
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:1457:1: ( RULE_ID )
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:1458:1: RULE_ID
            {
             before(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Attribute__NameAssignment_02899); 
             after(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__Attribute__NameAssignment_0"


    // $ANTLR start "rule__Attribute__TypeAssignment_2"
    // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:1467:1: rule__Attribute__TypeAssignment_2 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Attribute__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:1471:1: ( ( ( ruleQualifiedName ) ) )
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:1472:1: ( ( ruleQualifiedName ) )
            {
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:1472:1: ( ( ruleQualifiedName ) )
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:1473:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getAttributeAccess().getTypeTypeCrossReference_2_0()); 
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:1474:1: ( ruleQualifiedName )
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:1475:1: ruleQualifiedName
            {
             before(grammarAccess.getAttributeAccess().getTypeTypeQualifiedNameParserRuleCall_2_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Attribute__TypeAssignment_22934);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getTypeTypeQualifiedNameParserRuleCall_2_0_1()); 

            }

             after(grammarAccess.getAttributeAccess().getTypeTypeCrossReference_2_0()); 

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
    // $ANTLR end "rule__Attribute__TypeAssignment_2"


    // $ANTLR start "rule__SimpleType__NameAssignment_1"
    // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:1486:1: rule__SimpleType__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SimpleType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:1490:1: ( ( RULE_ID ) )
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:1491:1: ( RULE_ID )
            {
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:1491:1: ( RULE_ID )
            // ../de.goldschmiede.bodsl.ui/src-gen/de/goldschmiede/bodsl/ui/contentassist/antlr/internal/InternalBusinessObjectDsl.g:1492:1: RULE_ID
            {
             before(grammarAccess.getSimpleTypeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SimpleType__NameAssignment_12969); 
             after(grammarAccess.getSimpleTypeAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__SimpleType__NameAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Alternatives_in_ruleModel94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_in_entryRulePackage121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackage128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__Group__0_in_rulePackage154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__0_in_ruleImport214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBusinessObject_in_entryRuleBusinessObject241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBusinessObject248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessObject__Group__0_in_ruleBusinessObject274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumeration_in_entryRuleEnumeration301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumeration308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enumeration__Group__0_in_ruleEnumeration334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumLiteral_in_entryRuleEnumLiteral361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumLiteral368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumLiteral__NameAssignment_in_ruleEnumLiteral394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__0_in_ruleAttribute454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Alternatives_in_ruleType514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleType_in_entryRuleSimpleType541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleType548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleType__Group__0_in_ruleSimpleType574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcards_in_entryRuleQualifiedNameWithWildcards661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcards668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcards__Group__0_in_ruleQualifiedNameWithWildcards694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__TypesAssignment_0_in_rule__Model__Alternatives732 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_rule__Model__TypesAssignment_0_in_rule__Model__Alternatives744 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_rule__Model__PackageAssignment_1_in_rule__Model__Alternatives765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBusinessObject_in_rule__Type__Alternatives798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumeration_in_rule__Type__Alternatives815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleType_in_rule__Type__Alternatives832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__Group__0__Impl_in_rule__Package__Group__0862 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Package__Group__1_in_rule__Package__Group__0865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Package__Group__0__Impl893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__Group__1__Impl_in_rule__Package__Group__1924 = new BitSet(new long[]{0x0000000000053000L});
    public static final BitSet FOLLOW_rule__Package__Group__2_in_rule__Package__Group__1927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__NameAssignment_1_in_rule__Package__Group__1__Impl954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__Group__2__Impl_in_rule__Package__Group__2984 = new BitSet(new long[]{0x0000000000053000L});
    public static final BitSet FOLLOW_rule__Package__Group__3_in_rule__Package__Group__2987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__ImportsAssignment_2_in_rule__Package__Group__2__Impl1014 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_rule__Package__Group__3__Impl_in_rule__Package__Group__31045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__TypeAssignment_3_in_rule__Package__Group__3__Impl1072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__01110 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Import__Group__1_in_rule__Import__Group__01113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Import__Group__0__Impl1141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__11172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__ImportedNamespaceAssignment_1_in_rule__Import__Group__1__Impl1199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessObject__Group__0__Impl_in_rule__BusinessObject__Group__01233 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__BusinessObject__Group__1_in_rule__BusinessObject__Group__01236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__BusinessObject__Group__0__Impl1264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessObject__Group__1__Impl_in_rule__BusinessObject__Group__11295 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__BusinessObject__Group__2_in_rule__BusinessObject__Group__11298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessObject__NameAssignment_1_in_rule__BusinessObject__Group__1__Impl1325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessObject__Group__2__Impl_in_rule__BusinessObject__Group__21355 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_rule__BusinessObject__Group__3_in_rule__BusinessObject__Group__21358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__BusinessObject__Group__2__Impl1386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessObject__Group__3__Impl_in_rule__BusinessObject__Group__31417 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_rule__BusinessObject__Group__4_in_rule__BusinessObject__Group__31420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessObject__AttributesAssignment_3_in_rule__BusinessObject__Group__3__Impl1447 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__BusinessObject__Group__4__Impl_in_rule__BusinessObject__Group__41478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__BusinessObject__Group__4__Impl1506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enumeration__Group__0__Impl_in_rule__Enumeration__Group__01547 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Enumeration__Group__1_in_rule__Enumeration__Group__01550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Enumeration__Group__0__Impl1578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enumeration__Group__1__Impl_in_rule__Enumeration__Group__11609 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Enumeration__Group__2_in_rule__Enumeration__Group__11612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enumeration__NameAssignment_1_in_rule__Enumeration__Group__1__Impl1639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enumeration__Group__2__Impl_in_rule__Enumeration__Group__21669 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Enumeration__Group__3_in_rule__Enumeration__Group__21672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Enumeration__Group__2__Impl1700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enumeration__Group__3__Impl_in_rule__Enumeration__Group__31731 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Enumeration__Group__4_in_rule__Enumeration__Group__31734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enumeration__LiteralsAssignment_3_in_rule__Enumeration__Group__3__Impl1763 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Enumeration__LiteralsAssignment_3_in_rule__Enumeration__Group__3__Impl1775 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Enumeration__Group__4__Impl_in_rule__Enumeration__Group__41808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Enumeration__Group__4__Impl1836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__0__Impl_in_rule__Attribute__Group__01877 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Attribute__Group__1_in_rule__Attribute__Group__01880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__NameAssignment_0_in_rule__Attribute__Group__0__Impl1907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__1__Impl_in_rule__Attribute__Group__11937 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Attribute__Group__2_in_rule__Attribute__Group__11940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Attribute__Group__1__Impl1968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__2__Impl_in_rule__Attribute__Group__21999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__TypeAssignment_2_in_rule__Attribute__Group__2__Impl2026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleType__Group__0__Impl_in_rule__SimpleType__Group__02062 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SimpleType__Group__1_in_rule__SimpleType__Group__02065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__SimpleType__Group__0__Impl2093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleType__Group__1__Impl_in_rule__SimpleType__Group__12124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleType__NameAssignment_1_in_rule__SimpleType__Group__1__Impl2151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__02185 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__02188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl2215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__12244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl2271 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__02306 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__02309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__QualifiedName__Group_1__0__Impl2337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__12368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl2395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcards__Group__0__Impl_in_rule__QualifiedNameWithWildcards__Group__02428 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcards__Group__1_in_rule__QualifiedNameWithWildcards__Group__02431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__QualifiedNameWithWildcards__Group__0__Impl2458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcards__Group__1__Impl_in_rule__QualifiedNameWithWildcards__Group__12487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__QualifiedNameWithWildcards__Group__1__Impl2516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleType_in_rule__Model__TypesAssignment_02558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_in_rule__Model__PackageAssignment_12589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Package__NameAssignment_12620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_rule__Package__ImportsAssignment_22651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__Package__TypeAssignment_32682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcards_in_rule__Import__ImportedNamespaceAssignment_12713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__BusinessObject__NameAssignment_12744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_rule__BusinessObject__AttributesAssignment_32775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Enumeration__NameAssignment_12806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumLiteral_in_rule__Enumeration__LiteralsAssignment_32837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EnumLiteral__NameAssignment2868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Attribute__NameAssignment_02899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Attribute__TypeAssignment_22934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SimpleType__NameAssignment_12969 = new BitSet(new long[]{0x0000000000000002L});

}