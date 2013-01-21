package de.goldschmiede.bodsl.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import de.goldschmiede.bodsl.services.BusinessObjectDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalBusinessObjectDslParser extends AbstractInternalAntlrParser {
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
    public String getGrammarFileName() { return "../de.goldschmiede.bodsl/src-gen/de/goldschmiede/bodsl/parser/antlr/internal/InternalBusinessObjectDsl.g"; }



     	private BusinessObjectDslGrammarAccess grammarAccess;
     	
        public InternalBusinessObjectDslParser(TokenStream input, BusinessObjectDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected BusinessObjectDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../de.goldschmiede.bodsl/src-gen/de/goldschmiede/bodsl/parser/antlr/internal/InternalBusinessObjectDsl.g:67:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../de.goldschmiede.bodsl/src-gen/de/goldschmiede/bodsl/parser/antlr/internal/InternalBusinessObjectDsl.g:68:2: (iv_ruleModel= ruleModel EOF )
            // ../de.goldschmiede.bodsl/src-gen/de/goldschmiede/bodsl/parser/antlr/internal/InternalBusinessObjectDsl.g:69:2: iv_ruleModel= ruleModel EOF
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
    // ../de.goldschmiede.bodsl/src-gen/de/goldschmiede/bodsl/parser/antlr/internal/InternalBusinessObjectDsl.g:76:1: ruleModel returns [EObject current=null] : ( ( (lv_types_0_0= ruleSimpleType ) )+ | ( (lv_package_1_0= rulePackage ) ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_types_0_0 = null;

        EObject lv_package_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.goldschmiede.bodsl/src-gen/de/goldschmiede/bodsl/parser/antlr/internal/InternalBusinessObjectDsl.g:79:28: ( ( ( (lv_types_0_0= ruleSimpleType ) )+ | ( (lv_package_1_0= rulePackage ) ) ) )
            // ../de.goldschmiede.bodsl/src-gen/de/goldschmiede/bodsl/parser/antlr/internal/InternalBusinessObjectDsl.g:80:1: ( ( (lv_types_0_0= ruleSimpleType ) )+ | ( (lv_package_1_0= rulePackage ) ) )
            {
            // ../de.goldschmiede.bodsl/src-gen/de/goldschmiede/bodsl/parser/antlr/internal/InternalBusinessObjectDsl.g:80:1: ( ( (lv_types_0_0= ruleSimpleType ) )+ | ( (lv_package_1_0= rulePackage ) ) )
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
                    // ../de.goldschmiede.bodsl/src-gen/de/goldschmiede/bodsl/parser/antlr/internal/InternalBusinessObjectDsl.g:80:2: ( (lv_types_0_0= ruleSimpleType ) )+
                    {
                    // ../de.goldschmiede.bodsl/src-gen/de/goldschmiede/bodsl/parser/antlr/internal/InternalBusinessObjectDsl.g:80:2: ( (lv_types_0_0= ruleSimpleType ) )+
                    int cnt1=0;
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==18) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // ../de.goldschmiede.bodsl/src-gen/de/goldschmiede/bodsl/parser/antlr/internal/InternalBusinessObjectDsl.g:81:1: (lv_types_0_0= ruleSimpleType )
                    	    {
                    	    // ../de.goldschmiede.bodsl/src-gen/de/goldschmiede/bodsl/parser/antlr/internal/InternalBusinessObjectDsl.g:81:1: (lv_types_0_0= ruleSimpleType )
                    	    // ../de.goldschmiede.bodsl/src-gen/de/goldschmiede/bodsl/parser/antlr/internal/InternalBusinessObjectDsl.g:82:3: lv_types_0_0= ruleSimpleType
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getModelAccess().getTypesSimpleTypeParserRuleCall_0_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleSimpleType_in_ruleModel131);
                    	    lv_types_0_0=ruleSimpleType();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getModelRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"types",
                    	            		lv_types_0_0, 
                    	            		"SimpleType");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt1 >= 1 ) break loop1;
                                EarlyExitException eee =
                                    new EarlyExitException(1, input);
                                throw eee;
                        }
                        cnt1++;
                    } while (true);


                    }
                    break;
                case 2 :
                    // ../de.goldschmiede.bodsl/src-gen/de/goldschmiede/bodsl/parser/antlr/internal/InternalBusinessObjectDsl.g:99:6: ( (lv_package_1_0= rulePackage ) )
                    {
                    // ../de.goldschmiede.bodsl/src-gen/de/goldschmiede/bodsl/parser/antlr/internal/InternalBusinessObjectDsl.g:99:6: ( (lv_package_1_0= rulePackage ) )
                    // ../de.goldschmiede.bodsl/src-gen/de/goldschmiede/bodsl/parser/antlr/internal/InternalBusinessObjectDsl.g:100:1: (lv_package_1_0= rulePackage )
                    {
                    // ../de.goldschmiede.bodsl/src-gen/de/goldschmiede/bodsl/parser/antlr/internal/InternalBusinessObjectDsl.g:100:1: (lv_package_1_0= rulePackage )
                    // ../de.goldschmiede.bodsl/src-gen/de/goldschmiede/bodsl/parser/antlr/internal/InternalBusinessObjectDsl.g:101:3: lv_package_1_0= rulePackage
                    {
                     
                    	        newCompositeNode(grammarAccess.getModelAccess().getPackagePackageParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_rulePackage_in_ruleModel159);
                    lv_package_1_0=rulePackage();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getModelRule());
                    	        }
                           		set(
                           			current, 
                           			"package",
                            		lv_package_1_0, 
                            		"Package");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRulePackage"
    // ../de.goldschmiede.bodsl/src-gen/de/goldschmiede/bodsl/parser/antlr/internal/InternalBusinessObjectDsl.g:125:1: entryRulePackage returns [EObject current=null] : iv_rulePackage= rulePackage EOF ;
    public final EObject entryRulePackage() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackage = null;


        try {
            // ../de.goldschmiede.bodsl/src-gen/de/goldschmiede/bodsl/parser/antlr/internal/InternalBusinessObjectDsl.g:126:2: (iv_rulePackage= rulePackage EOF )
            // ../de.goldschmiede.bodsl/src-gen/de/goldschmiede/bodsl/parser/antlr/internal/InternalBusinessObjectDsl.g:127:2: iv_rulePackage= rulePackage EOF
            {
             newCompositeNode(grammarAccess.getPackageRule()); 
            pushFollow(FOLLOW_rulePackage_in_entryRulePackage195);
            iv_rulePackage=rulePackage();

            state._fsp--;

             current =iv_rulePackage; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePackage205); 

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
    // $ANTLR end "entryRulePackage"


    // $ANTLR start "rulePackage"
    // ../de.goldschmiede.bodsl/src-gen/de/goldschmiede/bodsl/parser/antlr/internal/InternalBusinessObjectDsl.g:134:1: rulePackage returns [EObject current=null] : (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_imports_2_0= ruleImport ) )* ( (lv_type_3_0= ruleType ) ) ) ;
    public final EObject rulePackage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_imports_2_0 = null;

        EObject lv_type_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.goldschmiede.bodsl/src-gen/de/goldschmiede/bodsl/parser/antlr/internal/InternalBusinessObjectDsl.g:137:28: ( (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_imports_2_0= ruleImport ) )* ( (lv_type_3_0= ruleType ) ) ) )
            // ../de.goldschmiede.bodsl/src-gen/de/goldschmiede/bodsl/parser/antlr/internal/InternalBusinessObjectDsl.g:138:1: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_imports_2_0= ruleImport ) )* ( (lv_type_3_0= ruleType ) ) )
            {
            // ../de.goldschmiede.bodsl/src-gen/de/goldschmiede/bodsl/parser/antlr/internal/InternalBusinessObjectDsl.g:138:1: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_imports_2_0= ruleImport ) )* ( (lv_type_3_0= ruleType ) ) )
            // ../de.goldschmiede.bodsl/src-gen/de/goldschmiede/bodsl/parser/antlr/internal/InternalBusinessObjectDsl.g:138:3: otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_imports_2_0= ruleImport ) )* ( (lv_type_3_0= ruleType ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_rulePackage242); 

                	newLeafNode(otherlv_0, grammarAccess.getPackageAccess().getPackageKeyword_0());
                
            // ../de.goldschmiede.bodsl/src-gen/de/goldschmiede/bodsl/parser/antlr/internal/InternalBusinessObjectDsl.g:142:1: ( (lv_name_1_0= ruleQualifiedName ) )
            // ../de.goldschmiede.bodsl/src-gen/de/goldschmiede/bodsl/parser/antlr/internal/InternalBusinessObjectDsl.g:143:1: (lv_name_1_0= ruleQualifiedName )
            {
            // ../de.goldschmiede.bodsl/src-gen/de/goldschmiede/bodsl/parser/antlr/internal/InternalBusinessObjectDsl.g:143:1: (lv_name_1_0= ruleQualifiedName )
            // ../de.goldschmiede.bodsl/src-gen/de/goldschmiede/bodsl/parser/antlr/internal/InternalBusinessObjectDsl.g:144:3: lv_name_1_0= ruleQualifiedName
            {
             
            	        newCompositeNode(grammarAccess.getPackageAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_rulePackage263);
            lv_name_1_0=ruleQualifiedName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPackageRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"QualifiedName");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.goldschmiede.bodsl/src-gen/de/goldschmiede/bodsl/parser/antlr/internal/InternalBusinessObjectDsl.g:160:2: ( (lv_imports_2_0= ruleImport ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==12) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../de.goldschmiede.bodsl/src-gen/de/goldschmiede/bodsl/parser/antlr/internal/InternalBusinessObjectDsl.g:161:1: (lv_imports_2_0= ruleImport )
            	    {
            	    // ../de.goldschmiede.bodsl/src-gen/de/goldschmiede/bodsl/parser/antlr/internal/InternalBusinessObjectDsl.g:161:1: (lv_imports_2_0= ruleImport )
            	    // ../de.goldschmiede.bodsl/src-gen/de/goldschmiede/bodsl/parser/antlr/internal/InternalBusinessObjectDsl.g:162:3: lv_imports_2_0= ruleImport
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPackageAccess().getImportsImportParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleImport_in_rulePackage284);
            	    lv_imports_2_0=ruleImport();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPackageRule());
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
            	    break loop3;
                }
            } while (true);

            // ../de.goldschmiede.bodsl/src-gen/de/goldschmiede/bodsl/parser/antlr/internal/InternalBusinessObjectDsl.g:178:3: ( (lv_type_3_0= ruleType ) )
            // ../de.goldschmiede.bodsl/src-gen/de/goldschmiede/bodsl/parser/antlr/internal/InternalBusinessObjectDsl.g:179:1: (lv_type_3_0= ruleType )
            {
            // ../de.goldschmiede.bodsl/src-gen/de/goldschmiede/bodsl/parser/antlr/internal/InternalBusinessObjectDsl.g:179:1: (lv_type_3_0= ruleType )
            // ../de.goldschmiede.bodsl/src-gen/de/goldschmiede/bodsl/parser/antlr/internal/InternalBusinessObjectDsl.g:180:3: lv_type_3_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getPackageAccess().getTypeTypeParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_rulePackage306);
            lv_type_3_0=ruleType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPackageRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_3_0, 
                    		"Type");
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
    // $ANTLR end "rulePackage"


    // $ANTLR start "entryRuleImport"
    // ../de.goldschmiede.bodsl/src-gen/de/goldschmiede/bodsl/parser/antlr/internal/InternalBusinessObjectDsl.g:204:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ../de.goldschmiede.bodsl/src-gen/de/goldschmiede/bodsl/parser/antlr/internal/InternalBusinessObjectDsl.g:205:2: (iv_ruleImport= ruleImport EOF )
            // ../de.goldschmiede.bodsl/src-gen/de/goldschmiede/bodsl/parser/antlr/internal/InternalBusinessObjectDsl.g:206:2: iv_ruleImport= ruleImport EOF
            {
             newCompositeNode(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport342);
            iv_ruleImport=ruleImport();

            state._fsp--;

             current =iv_ruleImport; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport352); 

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
    // ../de.goldschmiede.bodsl/src-gen/de/goldschmiede/bodsl/parser/antlr/internal/InternalBusinessObjectDsl.g:213:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcards ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.goldschmiede.bodsl/src-gen/de/goldschmiede/bodsl/parser/antlr/internal/InternalBusinessObjectDsl.g:216:28: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcards ) ) ) )
            // ../de.goldschmiede.bodsl/src-gen/de/goldschmiede/bodsl/parser/antlr/internal/InternalBusinessObjectDsl.g:217:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcards ) ) )
            {
            // ../de.goldschmiede.bodsl/src-gen/de/goldschmiede/bodsl/parser/antlr/internal/InternalBusinessObjectDsl.g:217:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcards ) ) )
            // ../de.goldschmiede.bodsl/src-gen/de/goldschmiede/bodsl/parser/antlr/internal/InternalBusinessObjectDsl.g:217:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcards ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruleImport389); 

                	newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
                
            // ../de.goldschmiede.bodsl/src-gen/de/goldschmiede/bodsl/parser/antlr/internal/InternalBusinessObjectDsl.g:221:1: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcards ) )
            // ../de.goldschmiede.bodsl/src-gen/de/goldschmiede/bodsl/parser/antlr/internal/InternalBusinessObjectDsl.g:222:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcards )
            {
            // ../de.goldschmiede.bodsl/src-gen/de/goldschmiede/bodsl/parser/antlr/internal/InternalBusinessObjectDsl.g:222:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcards )
            // ../de.goldschmiede.bodsl/src-gen/de/goldschmiede/bodsl/parser/antlr/internal/InternalBusinessObjectDsl.g:223:3: lv_importedNamespace_1_0= ruleQualifiedNameWithWildcards
            {
             
            	        newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardsParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcards_in_ruleImport410);
            lv_importedNamespace_1_0=ruleQualifiedNameWithWildcards();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getImportRule());
            	        }
                   		set(
                   			current, 
                   			"importedNamespace",
                    		lv_importedNamespace_1_0, 
                    		"QualifiedNameWithWildcards");
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


    // $ANTLR start "entryRuleBusinessObject"
    // ../de.goldschmiede.bodsl/src-gen/de/goldschmiede/bodsl/parser/antlr/internal/InternalBusinessObjectDsl.g:247:1: entryRuleBusinessObject returns [EObject current=null] : iv_ruleBusinessObject= ruleBusinessObject EOF ;
    public final EObject entryRuleBusinessObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBusinessObject = null;


        try {
            // ../de.goldschmiede.bodsl/src-gen/de/goldschmiede/bodsl/parser/antlr/internal/InternalBusinessObjectDsl.g:248:2: (iv_ruleBusinessObject= ruleBusinessObject EOF )
            // ../de.goldschmiede.bodsl/src-gen/de/goldschmiede/bodsl/parser/antlr/internal/InternalBusinessObjectDsl.g:249:2: iv_ruleBusinessObject= ruleBusinessObject EOF
            {
             newCompositeNode(grammarAccess.getBusinessObjectRule()); 
            pushFollow(FOLLOW_ruleBusinessObject_in_entryRuleBusinessObject446);
            iv_ruleBusinessObject=ruleBusinessObject();

            state._fsp--;

             current =iv_ruleBusinessObject; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBusinessObject456); 

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
    // $ANTLR end "entryRuleBusinessObject"


    // $ANTLR start "ruleBusinessObject"
    // ../de.goldschmiede.bodsl/src-gen/de/goldschmiede/bodsl/parser/antlr/internal/InternalBusinessObjectDsl.g:256:1: ruleBusinessObject returns [EObject current=null] : (otherlv_0= 'businessObject' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttribute ) )* otherlv_4= '}' ) ;
    public final EObject ruleBusinessObject() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_attributes_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.goldschmiede.bodsl/src-gen/de/goldschmiede/bodsl/parser/antlr/internal/InternalBusinessObjectDsl.g:259:28: ( (otherlv_0= 'businessObject' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttribute ) )* otherlv_4= '}' ) )
            // ../de.goldschmiede.bodsl/src-gen/de/goldschmiede/bodsl/parser/antlr/internal/InternalBusinessObjectDsl.g:260:1: (otherlv_0= 'businessObject' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttribute ) )* otherlv_4= '}' )
            {
            // ../de.goldschmiede.bodsl/src-gen/de/goldschmiede/bodsl/parser/antlr/internal/InternalBusinessObjectDsl.g:260:1: (otherlv_0= 'businessObject' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttribute ) )* otherlv_4= '}' )
            // ../de.goldschmiede.bodsl/src-gen/de/goldschmiede/bodsl/parser/antlr/internal/InternalBusinessObjectDsl.g:260:3: otherlv_0= 'businessObject' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttribute ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleBusinessObject493); 

                	newLeafNode(otherlv_0, grammarAccess.getBusinessObjectAccess().getBusinessObjectKeyword_0());
                
            // ../de.goldschmiede.bodsl/src-gen/de/goldschmiede/bodsl/parser/antlr/internal/InternalBusinessObjectDsl.g:264:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.goldschmiede.bodsl/src-gen/de/goldschmiede/bodsl/parser/antlr/internal/InternalBusinessObjectDsl.g:265:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.goldschmiede.bodsl/src-gen/de/goldschmiede/bodsl/parser/antlr/internal/InternalBusinessObjectDsl.g:265:1: (lv_name_1_0= RULE_ID )
            // ../de.goldschmiede.bodsl/src-gen/de/goldschmiede/bodsl/parser/antlr/internal/InternalBusinessObjectDsl.g:266:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBusinessObject510); 

            			newLeafNode(lv_name_1_0, grammarAccess.getBusinessObjectAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getBusinessObjectRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleBusinessObject527); 

                	newLeafNode(otherlv_2, grammarAccess.getBusinessObjectAccess().getLeftCurlyBracketKeyword_2());
                
            // ../de.goldschmiede.bodsl/src-gen/de/goldschmiede/bodsl/parser/antlr/internal/InternalBusinessObjectDsl.g:286:1: ( (lv_attributes_3_0= ruleAttribute ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../de.goldschmiede.bodsl/src-gen/de/goldschmiede/bodsl/parser/antlr/internal/InternalBusinessObjectDsl.g:287:1: (lv_attributes_3_0= ruleAttribute )
            	    {
            	    // ../de.goldschmiede.bodsl/src-gen/de/goldschmiede/bodsl/parser/antlr/internal/InternalBusinessObjectDsl.g:287:1: (lv_attributes_3_0= ruleAttribute )
            	    // ../de.goldschmiede.bodsl/src-gen/de/goldschmiede/bodsl/parser/antlr/internal/InternalBusinessObjectDsl.g:288:3: lv_attributes_3_0= ruleAttribute
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getBusinessObjectAccess().getAttributesAttributeParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAttribute_in_ruleBusinessObject548);
            	    lv_attributes_3_0=ruleAttribute();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getBusinessObjectRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"attributes",
            	            		lv_attributes_3_0, 
            	            		"Attribute");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleBusinessObject561); 

                	newLeafNode(otherlv_4, grammarAccess.getBusinessObjectAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "ruleBusinessObject"


    // $ANTLR start "entryRuleEnumeration"
    // ../de.goldschmiede.bodsl/src-gen/de/goldschmiede/bodsl/parser/antlr/internal/InternalBusinessObjectDsl.g:316:1: entryRuleEnumeration returns [EObject current=null] : iv_ruleEnumeration= ruleEnumeration EOF ;
    public final EObject entryRuleEnumeration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumeration = null;


        try {
            // ../de.goldschmiede.bodsl/src-gen/de/goldschmiede/bodsl/parser/antlr/internal/InternalBusinessObjectDsl.g:317:2: (iv_ruleEnumeration= ruleEnumeration EOF )
            // ../de.goldschmiede.bodsl/src-gen/de/goldschmiede/bodsl/parser/antlr/internal/InternalBusinessObjectDsl.g:318:2: iv_ruleEnumeration= ruleEnumeration EOF
            {
             newCompositeNode(grammarAccess.getEnumerationRule()); 
            pushFollow(FOLLOW_ruleEnumeration_in_entryRuleEnumeration597);
            iv_ruleEnumeration=ruleEnumeration();

            state._fsp--;

             current =iv_ruleEnumeration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumeration607); 

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
    // $ANTLR end "entryRuleEnumeration"


    // $ANTLR start "ruleEnumeration"
    // ../de.goldschmiede.bodsl/src-gen/de/goldschmiede/bodsl/parser/antlr/internal/InternalBusinessObjectDsl.g:325:1: ruleEnumeration returns [EObject current=null] : (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_literals_3_0= ruleEnumLiteral ) )+ otherlv_4= '}' ) ;
    public final EObject ruleEnumeration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_literals_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.goldschmiede.bodsl/src-gen/de/goldschmiede/bodsl/parser/antlr/internal/InternalBusinessObjectDsl.g:328:28: ( (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_literals_3_0= ruleEnumLiteral ) )+ otherlv_4= '}' ) )
            // ../de.goldschmiede.bodsl/src-gen/de/goldschmiede/bodsl/parser/antlr/internal/InternalBusinessObjectDsl.g:329:1: (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_literals_3_0= ruleEnumLiteral ) )+ otherlv_4= '}' )
            {
            // ../de.goldschmiede.bodsl/src-gen/de/goldschmiede/bodsl/parser/antlr/internal/InternalBusinessObjectDsl.g:329:1: (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_literals_3_0= ruleEnumLiteral ) )+ otherlv_4= '}' )
            // ../de.goldschmiede.bodsl/src-gen/de/goldschmiede/bodsl/parser/antlr/internal/InternalBusinessObjectDsl.g:329:3: otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_literals_3_0= ruleEnumLiteral ) )+ otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleEnumeration644); 

                	newLeafNode(otherlv_0, grammarAccess.getEnumerationAccess().getEnumKeyword_0());
                
            // ../de.goldschmiede.bodsl/src-gen/de/goldschmiede/bodsl/parser/antlr/internal/InternalBusinessObjectDsl.g:333:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.goldschmiede.bodsl/src-gen/de/goldschmiede/bodsl/parser/antlr/internal/InternalBusinessObjectDsl.g:334:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.goldschmiede.bodsl/src-gen/de/goldschmiede/bodsl/parser/antlr/internal/InternalBusinessObjectDsl.g:334:1: (lv_name_1_0= RULE_ID )
            // ../de.goldschmiede.bodsl/src-gen/de/goldschmiede/bodsl/parser/antlr/internal/InternalBusinessObjectDsl.g:335:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumeration661); 

            			newLeafNode(lv_name_1_0, grammarAccess.getEnumerationAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEnumerationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleEnumeration678); 

                	newLeafNode(otherlv_2, grammarAccess.getEnumerationAccess().getLeftCurlyBracketKeyword_2());
                
            // ../de.goldschmiede.bodsl/src-gen/de/goldschmiede/bodsl/parser/antlr/internal/InternalBusinessObjectDsl.g:355:1: ( (lv_literals_3_0= ruleEnumLiteral ) )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../de.goldschmiede.bodsl/src-gen/de/goldschmiede/bodsl/parser/antlr/internal/InternalBusinessObjectDsl.g:356:1: (lv_literals_3_0= ruleEnumLiteral )
            	    {
            	    // ../de.goldschmiede.bodsl/src-gen/de/goldschmiede/bodsl/parser/antlr/internal/InternalBusinessObjectDsl.g:356:1: (lv_literals_3_0= ruleEnumLiteral )
            	    // ../de.goldschmiede.bodsl/src-gen/de/goldschmiede/bodsl/parser/antlr/internal/InternalBusinessObjectDsl.g:357:3: lv_literals_3_0= ruleEnumLiteral
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEnumerationAccess().getLiteralsEnumLiteralParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEnumLiteral_in_ruleEnumeration699);
            	    lv_literals_3_0=ruleEnumLiteral();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEnumerationRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"literals",
            	            		lv_literals_3_0, 
            	            		"EnumLiteral");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);

            otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleEnumeration712); 

                	newLeafNode(otherlv_4, grammarAccess.getEnumerationAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "ruleEnumeration"


    // $ANTLR start "entryRuleEnumLiteral"
    // ../de.goldschmiede.bodsl/src-gen/de/goldschmiede/bodsl/parser/antlr/internal/InternalBusinessObjectDsl.g:385:1: entryRuleEnumLiteral returns [EObject current=null] : iv_ruleEnumLiteral= ruleEnumLiteral EOF ;
    public final EObject entryRuleEnumLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumLiteral = null;


        try {
            // ../de.goldschmiede.bodsl/src-gen/de/goldschmiede/bodsl/parser/antlr/internal/InternalBusinessObjectDsl.g:386:2: (iv_ruleEnumLiteral= ruleEnumLiteral EOF )
            // ../de.goldschmiede.bodsl/src-gen/de/goldschmiede/bodsl/parser/antlr/internal/InternalBusinessObjectDsl.g:387:2: iv_ruleEnumLiteral= ruleEnumLiteral EOF
            {
             newCompositeNode(grammarAccess.getEnumLiteralRule()); 
            pushFollow(FOLLOW_ruleEnumLiteral_in_entryRuleEnumLiteral748);
            iv_ruleEnumLiteral=ruleEnumLiteral();

            state._fsp--;

             current =iv_ruleEnumLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumLiteral758); 

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
    // $ANTLR end "entryRuleEnumLiteral"


    // $ANTLR start "ruleEnumLiteral"
    // ../de.goldschmiede.bodsl/src-gen/de/goldschmiede/bodsl/parser/antlr/internal/InternalBusinessObjectDsl.g:394:1: ruleEnumLiteral returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleEnumLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../de.goldschmiede.bodsl/src-gen/de/goldschmiede/bodsl/parser/antlr/internal/InternalBusinessObjectDsl.g:397:28: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../de.goldschmiede.bodsl/src-gen/de/goldschmiede/bodsl/parser/antlr/internal/InternalBusinessObjectDsl.g:398:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../de.goldschmiede.bodsl/src-gen/de/goldschmiede/bodsl/parser/antlr/internal/InternalBusinessObjectDsl.g:398:1: ( (lv_name_0_0= RULE_ID ) )
            // ../de.goldschmiede.bodsl/src-gen/de/goldschmiede/bodsl/parser/antlr/internal/InternalBusinessObjectDsl.g:399:1: (lv_name_0_0= RULE_ID )
            {
            // ../de.goldschmiede.bodsl/src-gen/de/goldschmiede/bodsl/parser/antlr/internal/InternalBusinessObjectDsl.g:399:1: (lv_name_0_0= RULE_ID )
            // ../de.goldschmiede.bodsl/src-gen/de/goldschmiede/bodsl/parser/antlr/internal/InternalBusinessObjectDsl.g:400:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumLiteral799); 

            			newLeafNode(lv_name_0_0, grammarAccess.getEnumLiteralAccess().getNameIDTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEnumLiteralRule());
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
    // $ANTLR end "ruleEnumLiteral"


    // $ANTLR start "entryRuleAttribute"
    // ../de.goldschmiede.bodsl/src-gen/de/goldschmiede/bodsl/parser/antlr/internal/InternalBusinessObjectDsl.g:424:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // ../de.goldschmiede.bodsl/src-gen/de/goldschmiede/bodsl/parser/antlr/internal/InternalBusinessObjectDsl.g:425:2: (iv_ruleAttribute= ruleAttribute EOF )
            // ../de.goldschmiede.bodsl/src-gen/de/goldschmiede/bodsl/parser/antlr/internal/InternalBusinessObjectDsl.g:426:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute839);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute849); 

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
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // ../de.goldschmiede.bodsl/src-gen/de/goldschmiede/bodsl/parser/antlr/internal/InternalBusinessObjectDsl.g:433:1: ruleAttribute returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.goldschmiede.bodsl/src-gen/de/goldschmiede/bodsl/parser/antlr/internal/InternalBusinessObjectDsl.g:436:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleQualifiedName ) ) ) )
            // ../de.goldschmiede.bodsl/src-gen/de/goldschmiede/bodsl/parser/antlr/internal/InternalBusinessObjectDsl.g:437:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleQualifiedName ) ) )
            {
            // ../de.goldschmiede.bodsl/src-gen/de/goldschmiede/bodsl/parser/antlr/internal/InternalBusinessObjectDsl.g:437:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleQualifiedName ) ) )
            // ../de.goldschmiede.bodsl/src-gen/de/goldschmiede/bodsl/parser/antlr/internal/InternalBusinessObjectDsl.g:437:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleQualifiedName ) )
            {
            // ../de.goldschmiede.bodsl/src-gen/de/goldschmiede/bodsl/parser/antlr/internal/InternalBusinessObjectDsl.g:437:2: ( (lv_name_0_0= RULE_ID ) )
            // ../de.goldschmiede.bodsl/src-gen/de/goldschmiede/bodsl/parser/antlr/internal/InternalBusinessObjectDsl.g:438:1: (lv_name_0_0= RULE_ID )
            {
            // ../de.goldschmiede.bodsl/src-gen/de/goldschmiede/bodsl/parser/antlr/internal/InternalBusinessObjectDsl.g:438:1: (lv_name_0_0= RULE_ID )
            // ../de.goldschmiede.bodsl/src-gen/de/goldschmiede/bodsl/parser/antlr/internal/InternalBusinessObjectDsl.g:439:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAttribute891); 

            			newLeafNode(lv_name_0_0, grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAttributeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleAttribute908); 

                	newLeafNode(otherlv_1, grammarAccess.getAttributeAccess().getColonKeyword_1());
                
            // ../de.goldschmiede.bodsl/src-gen/de/goldschmiede/bodsl/parser/antlr/internal/InternalBusinessObjectDsl.g:459:1: ( ( ruleQualifiedName ) )
            // ../de.goldschmiede.bodsl/src-gen/de/goldschmiede/bodsl/parser/antlr/internal/InternalBusinessObjectDsl.g:460:1: ( ruleQualifiedName )
            {
            // ../de.goldschmiede.bodsl/src-gen/de/goldschmiede/bodsl/parser/antlr/internal/InternalBusinessObjectDsl.g:460:1: ( ruleQualifiedName )
            // ../de.goldschmiede.bodsl/src-gen/de/goldschmiede/bodsl/parser/antlr/internal/InternalBusinessObjectDsl.g:461:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getAttributeRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getAttributeAccess().getTypeTypeCrossReference_2_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleAttribute931);
            ruleQualifiedName();

            state._fsp--;

             
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
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleType"
    // ../de.goldschmiede.bodsl/src-gen/de/goldschmiede/bodsl/parser/antlr/internal/InternalBusinessObjectDsl.g:482:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // ../de.goldschmiede.bodsl/src-gen/de/goldschmiede/bodsl/parser/antlr/internal/InternalBusinessObjectDsl.g:483:2: (iv_ruleType= ruleType EOF )
            // ../de.goldschmiede.bodsl/src-gen/de/goldschmiede/bodsl/parser/antlr/internal/InternalBusinessObjectDsl.g:484:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType967);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType977); 

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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // ../de.goldschmiede.bodsl/src-gen/de/goldschmiede/bodsl/parser/antlr/internal/InternalBusinessObjectDsl.g:491:1: ruleType returns [EObject current=null] : (this_BusinessObject_0= ruleBusinessObject | this_Enumeration_1= ruleEnumeration | this_SimpleType_2= ruleSimpleType ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject this_BusinessObject_0 = null;

        EObject this_Enumeration_1 = null;

        EObject this_SimpleType_2 = null;


         enterRule(); 
            
        try {
            // ../de.goldschmiede.bodsl/src-gen/de/goldschmiede/bodsl/parser/antlr/internal/InternalBusinessObjectDsl.g:494:28: ( (this_BusinessObject_0= ruleBusinessObject | this_Enumeration_1= ruleEnumeration | this_SimpleType_2= ruleSimpleType ) )
            // ../de.goldschmiede.bodsl/src-gen/de/goldschmiede/bodsl/parser/antlr/internal/InternalBusinessObjectDsl.g:495:1: (this_BusinessObject_0= ruleBusinessObject | this_Enumeration_1= ruleEnumeration | this_SimpleType_2= ruleSimpleType )
            {
            // ../de.goldschmiede.bodsl/src-gen/de/goldschmiede/bodsl/parser/antlr/internal/InternalBusinessObjectDsl.g:495:1: (this_BusinessObject_0= ruleBusinessObject | this_Enumeration_1= ruleEnumeration | this_SimpleType_2= ruleSimpleType )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt6=1;
                }
                break;
            case 16:
                {
                alt6=2;
                }
                break;
            case 18:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../de.goldschmiede.bodsl/src-gen/de/goldschmiede/bodsl/parser/antlr/internal/InternalBusinessObjectDsl.g:496:5: this_BusinessObject_0= ruleBusinessObject
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getBusinessObjectParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleBusinessObject_in_ruleType1024);
                    this_BusinessObject_0=ruleBusinessObject();

                    state._fsp--;

                     
                            current = this_BusinessObject_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.goldschmiede.bodsl/src-gen/de/goldschmiede/bodsl/parser/antlr/internal/InternalBusinessObjectDsl.g:506:5: this_Enumeration_1= ruleEnumeration
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getEnumerationParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleEnumeration_in_ruleType1051);
                    this_Enumeration_1=ruleEnumeration();

                    state._fsp--;

                     
                            current = this_Enumeration_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../de.goldschmiede.bodsl/src-gen/de/goldschmiede/bodsl/parser/antlr/internal/InternalBusinessObjectDsl.g:516:5: this_SimpleType_2= ruleSimpleType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getSimpleTypeParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleSimpleType_in_ruleType1078);
                    this_SimpleType_2=ruleSimpleType();

                    state._fsp--;

                     
                            current = this_SimpleType_2; 
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
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleSimpleType"
    // ../de.goldschmiede.bodsl/src-gen/de/goldschmiede/bodsl/parser/antlr/internal/InternalBusinessObjectDsl.g:532:1: entryRuleSimpleType returns [EObject current=null] : iv_ruleSimpleType= ruleSimpleType EOF ;
    public final EObject entryRuleSimpleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleType = null;


        try {
            // ../de.goldschmiede.bodsl/src-gen/de/goldschmiede/bodsl/parser/antlr/internal/InternalBusinessObjectDsl.g:533:2: (iv_ruleSimpleType= ruleSimpleType EOF )
            // ../de.goldschmiede.bodsl/src-gen/de/goldschmiede/bodsl/parser/antlr/internal/InternalBusinessObjectDsl.g:534:2: iv_ruleSimpleType= ruleSimpleType EOF
            {
             newCompositeNode(grammarAccess.getSimpleTypeRule()); 
            pushFollow(FOLLOW_ruleSimpleType_in_entryRuleSimpleType1113);
            iv_ruleSimpleType=ruleSimpleType();

            state._fsp--;

             current =iv_ruleSimpleType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleType1123); 

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
    // $ANTLR end "entryRuleSimpleType"


    // $ANTLR start "ruleSimpleType"
    // ../de.goldschmiede.bodsl/src-gen/de/goldschmiede/bodsl/parser/antlr/internal/InternalBusinessObjectDsl.g:541:1: ruleSimpleType returns [EObject current=null] : (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleSimpleType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../de.goldschmiede.bodsl/src-gen/de/goldschmiede/bodsl/parser/antlr/internal/InternalBusinessObjectDsl.g:544:28: ( (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../de.goldschmiede.bodsl/src-gen/de/goldschmiede/bodsl/parser/antlr/internal/InternalBusinessObjectDsl.g:545:1: (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../de.goldschmiede.bodsl/src-gen/de/goldschmiede/bodsl/parser/antlr/internal/InternalBusinessObjectDsl.g:545:1: (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) )
            // ../de.goldschmiede.bodsl/src-gen/de/goldschmiede/bodsl/parser/antlr/internal/InternalBusinessObjectDsl.g:545:3: otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleSimpleType1160); 

                	newLeafNode(otherlv_0, grammarAccess.getSimpleTypeAccess().getTypeKeyword_0());
                
            // ../de.goldschmiede.bodsl/src-gen/de/goldschmiede/bodsl/parser/antlr/internal/InternalBusinessObjectDsl.g:549:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.goldschmiede.bodsl/src-gen/de/goldschmiede/bodsl/parser/antlr/internal/InternalBusinessObjectDsl.g:550:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.goldschmiede.bodsl/src-gen/de/goldschmiede/bodsl/parser/antlr/internal/InternalBusinessObjectDsl.g:550:1: (lv_name_1_0= RULE_ID )
            // ../de.goldschmiede.bodsl/src-gen/de/goldschmiede/bodsl/parser/antlr/internal/InternalBusinessObjectDsl.g:551:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSimpleType1177); 

            			newLeafNode(lv_name_1_0, grammarAccess.getSimpleTypeAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSimpleTypeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

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
    // $ANTLR end "ruleSimpleType"


    // $ANTLR start "entryRuleQualifiedName"
    // ../de.goldschmiede.bodsl/src-gen/de/goldschmiede/bodsl/parser/antlr/internal/InternalBusinessObjectDsl.g:575:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../de.goldschmiede.bodsl/src-gen/de/goldschmiede/bodsl/parser/antlr/internal/InternalBusinessObjectDsl.g:576:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../de.goldschmiede.bodsl/src-gen/de/goldschmiede/bodsl/parser/antlr/internal/InternalBusinessObjectDsl.g:577:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1219);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName1230); 

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
    // ../de.goldschmiede.bodsl/src-gen/de/goldschmiede/bodsl/parser/antlr/internal/InternalBusinessObjectDsl.g:584:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../de.goldschmiede.bodsl/src-gen/de/goldschmiede/bodsl/parser/antlr/internal/InternalBusinessObjectDsl.g:587:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../de.goldschmiede.bodsl/src-gen/de/goldschmiede/bodsl/parser/antlr/internal/InternalBusinessObjectDsl.g:588:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../de.goldschmiede.bodsl/src-gen/de/goldschmiede/bodsl/parser/antlr/internal/InternalBusinessObjectDsl.g:588:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../de.goldschmiede.bodsl/src-gen/de/goldschmiede/bodsl/parser/antlr/internal/InternalBusinessObjectDsl.g:588:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName1270); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                
            // ../de.goldschmiede.bodsl/src-gen/de/goldschmiede/bodsl/parser/antlr/internal/InternalBusinessObjectDsl.g:595:1: (kw= '.' this_ID_2= RULE_ID )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==19) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../de.goldschmiede.bodsl/src-gen/de/goldschmiede/bodsl/parser/antlr/internal/InternalBusinessObjectDsl.g:596:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,19,FOLLOW_19_in_ruleQualifiedName1289); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName1304); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop7;
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


    // $ANTLR start "entryRuleQualifiedNameWithWildcards"
    // ../de.goldschmiede.bodsl/src-gen/de/goldschmiede/bodsl/parser/antlr/internal/InternalBusinessObjectDsl.g:616:1: entryRuleQualifiedNameWithWildcards returns [String current=null] : iv_ruleQualifiedNameWithWildcards= ruleQualifiedNameWithWildcards EOF ;
    public final String entryRuleQualifiedNameWithWildcards() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcards = null;


        try {
            // ../de.goldschmiede.bodsl/src-gen/de/goldschmiede/bodsl/parser/antlr/internal/InternalBusinessObjectDsl.g:617:2: (iv_ruleQualifiedNameWithWildcards= ruleQualifiedNameWithWildcards EOF )
            // ../de.goldschmiede.bodsl/src-gen/de/goldschmiede/bodsl/parser/antlr/internal/InternalBusinessObjectDsl.g:618:2: iv_ruleQualifiedNameWithWildcards= ruleQualifiedNameWithWildcards EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameWithWildcardsRule()); 
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcards_in_entryRuleQualifiedNameWithWildcards1352);
            iv_ruleQualifiedNameWithWildcards=ruleQualifiedNameWithWildcards();

            state._fsp--;

             current =iv_ruleQualifiedNameWithWildcards.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcards1363); 

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
    // $ANTLR end "entryRuleQualifiedNameWithWildcards"


    // $ANTLR start "ruleQualifiedNameWithWildcards"
    // ../de.goldschmiede.bodsl/src-gen/de/goldschmiede/bodsl/parser/antlr/internal/InternalBusinessObjectDsl.g:625:1: ruleQualifiedNameWithWildcards returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcards() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;


         enterRule(); 
            
        try {
            // ../de.goldschmiede.bodsl/src-gen/de/goldschmiede/bodsl/parser/antlr/internal/InternalBusinessObjectDsl.g:628:28: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) )
            // ../de.goldschmiede.bodsl/src-gen/de/goldschmiede/bodsl/parser/antlr/internal/InternalBusinessObjectDsl.g:629:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            {
            // ../de.goldschmiede.bodsl/src-gen/de/goldschmiede/bodsl/parser/antlr/internal/InternalBusinessObjectDsl.g:629:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            // ../de.goldschmiede.bodsl/src-gen/de/goldschmiede/bodsl/parser/antlr/internal/InternalBusinessObjectDsl.g:630:5: this_QualifiedName_0= ruleQualifiedName (kw= '.*' )?
            {
             
                    newCompositeNode(grammarAccess.getQualifiedNameWithWildcardsAccess().getQualifiedNameParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildcards1410);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;


            		current.merge(this_QualifiedName_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../de.goldschmiede.bodsl/src-gen/de/goldschmiede/bodsl/parser/antlr/internal/InternalBusinessObjectDsl.g:640:1: (kw= '.*' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==20) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../de.goldschmiede.bodsl/src-gen/de/goldschmiede/bodsl/parser/antlr/internal/InternalBusinessObjectDsl.g:641:2: kw= '.*'
                    {
                    kw=(Token)match(input,20,FOLLOW_20_in_ruleQualifiedNameWithWildcards1429); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getQualifiedNameWithWildcardsAccess().getFullStopAsteriskKeyword_1()); 
                        

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
    // $ANTLR end "ruleQualifiedNameWithWildcards"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleType_in_ruleModel131 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_rulePackage_in_ruleModel159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_in_entryRulePackage195 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackage205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rulePackage242 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rulePackage263 = new BitSet(new long[]{0x0000000000053000L});
    public static final BitSet FOLLOW_ruleImport_in_rulePackage284 = new BitSet(new long[]{0x0000000000053000L});
    public static final BitSet FOLLOW_ruleType_in_rulePackage306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport342 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleImport389 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcards_in_ruleImport410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBusinessObject_in_entryRuleBusinessObject446 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBusinessObject456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleBusinessObject493 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBusinessObject510 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleBusinessObject527 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleBusinessObject548 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_15_in_ruleBusinessObject561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumeration_in_entryRuleEnumeration597 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumeration607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleEnumeration644 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumeration661 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleEnumeration678 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleEnumLiteral_in_ruleEnumeration699 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_15_in_ruleEnumeration712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumLiteral_in_entryRuleEnumLiteral748 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumLiteral758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumLiteral799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute839 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAttribute891 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleAttribute908 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleAttribute931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType967 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBusinessObject_in_ruleType1024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumeration_in_ruleType1051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleType_in_ruleType1078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleType_in_entryRuleSimpleType1113 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleType1123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleSimpleType1160 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSimpleType1177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1219 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName1230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName1270 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_ruleQualifiedName1289 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName1304 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcards_in_entryRuleQualifiedNameWithWildcards1352 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcards1363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildcards1410 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_ruleQualifiedNameWithWildcards1429 = new BitSet(new long[]{0x0000000000000002L});

}