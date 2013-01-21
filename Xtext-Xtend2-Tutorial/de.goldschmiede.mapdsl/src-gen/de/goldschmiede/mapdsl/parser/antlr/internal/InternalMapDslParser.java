package de.goldschmiede.mapdsl.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import de.goldschmiede.mapdsl.services.MapDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalMapDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "KEYWORD_1", "KEYWORD_2", "KEYWORD_3", "KEYWORD_4", "KEYWORD_5", "KEYWORD_6", "KEYWORD_7", "KEYWORD_8", "KEYWORD_9", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int RULE_ID=13;
    public static final int RULE_ANY_OTHER=19;
    public static final int KEYWORD_1=4;
    public static final int KEYWORD_5=8;
    public static final int KEYWORD_4=7;
    public static final int KEYWORD_3=6;
    public static final int KEYWORD_2=5;
    public static final int EOF=-1;
    public static final int RULE_SL_COMMENT=17;
    public static final int RULE_ML_COMMENT=16;
    public static final int RULE_STRING=15;
    public static final int KEYWORD_6=9;
    public static final int KEYWORD_7=10;
    public static final int KEYWORD_8=11;
    public static final int KEYWORD_9=12;
    public static final int RULE_INT=14;
    public static final int RULE_WS=18;

    // delegates
    // delegators


        public InternalMapDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMapDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMapDslParser.tokenNames; }
    public String getGrammarFileName() { return "../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/internal/InternalMapDslParser.g"; }



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */
     

    	private MapDslGrammarAccess grammarAccess;
    	 	
    	public InternalMapDslParser(TokenStream input, MapDslGrammarAccess grammarAccess) {
    		this(input);
    		this.grammarAccess = grammarAccess;
    		registerRules(grammarAccess.getGrammar());
    	}
    	
    	@Override
    	protected String getFirstRuleName() {
    		return "Model";	
    	} 
    	   	   	
    	@Override
    	protected MapDslGrammarAccess getGrammarAccess() {
    		return grammarAccess;
    	}



    // $ANTLR start "entryRuleModel"
    // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/internal/InternalMapDslParser.g:67:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/internal/InternalMapDslParser.g:68:2: (iv_ruleModel= ruleModel EOF )
            // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/internal/InternalMapDslParser.g:69:2: iv_ruleModel= ruleModel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModelRule()); 
            }
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel73);
            iv_ruleModel=ruleModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModel; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel83); if (state.failed) return current;

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
    // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/internal/InternalMapDslParser.g:76:1: ruleModel returns [EObject current=null] : ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_maps_1_0= ruleMapping ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_imports_0_0 = null;

        EObject lv_maps_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/internal/InternalMapDslParser.g:79:28: ( ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_maps_1_0= ruleMapping ) )* ) )
            // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/internal/InternalMapDslParser.g:80:1: ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_maps_1_0= ruleMapping ) )* )
            {
            // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/internal/InternalMapDslParser.g:80:1: ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_maps_1_0= ruleMapping ) )* )
            // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/internal/InternalMapDslParser.g:80:2: ( (lv_imports_0_0= ruleImport ) )* ( (lv_maps_1_0= ruleMapping ) )*
            {
            // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/internal/InternalMapDslParser.g:80:2: ( (lv_imports_0_0= ruleImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==KEYWORD_8) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/internal/InternalMapDslParser.g:81:1: (lv_imports_0_0= ruleImport )
            	    {
            	    // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/internal/InternalMapDslParser.g:81:1: (lv_imports_0_0= ruleImport )
            	    // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/internal/InternalMapDslParser.g:82:3: lv_imports_0_0= ruleImport
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getModelAccess().getImportsImportParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleImport_in_ruleModel129);
            	    lv_imports_0_0=ruleImport();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getModelRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"imports",
            	              		lv_imports_0_0, 
            	              		"Import");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/internal/InternalMapDslParser.g:98:3: ( (lv_maps_1_0= ruleMapping ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==KEYWORD_9) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/internal/InternalMapDslParser.g:99:1: (lv_maps_1_0= ruleMapping )
            	    {
            	    // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/internal/InternalMapDslParser.g:99:1: (lv_maps_1_0= ruleMapping )
            	    // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/internal/InternalMapDslParser.g:100:3: lv_maps_1_0= ruleMapping
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getModelAccess().getMapsMappingParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleMapping_in_ruleModel151);
            	    lv_maps_1_0=ruleMapping();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getModelRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"maps",
            	              		lv_maps_1_0, 
            	              		"Mapping");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleMapping"
    // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/internal/InternalMapDslParser.g:124:1: entryRuleMapping returns [EObject current=null] : iv_ruleMapping= ruleMapping EOF ;
    public final EObject entryRuleMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapping = null;


        try {
            // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/internal/InternalMapDslParser.g:125:2: (iv_ruleMapping= ruleMapping EOF )
            // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/internal/InternalMapDslParser.g:126:2: iv_ruleMapping= ruleMapping EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMappingRule()); 
            }
            pushFollow(FOLLOW_ruleMapping_in_entryRuleMapping187);
            iv_ruleMapping=ruleMapping();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMapping; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMapping197); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMapping"


    // $ANTLR start "ruleMapping"
    // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/internal/InternalMapDslParser.g:133:1: ruleMapping returns [EObject current=null] : (otherlv_0= KEYWORD_9 ( ( ruleQualifiedName ) ) otherlv_2= KEYWORD_6 ( ( ruleQualifiedName ) ) (otherlv_4= KEYWORD_7 otherlv_5= KEYWORD_2 ( (lv_attributeMap_6_0= ruleAttributeMap ) )+ otherlv_7= KEYWORD_3 )? ) ;
    public final EObject ruleMapping() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_attributeMap_6_0 = null;


         enterRule(); 
            
        try {
            // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/internal/InternalMapDslParser.g:136:28: ( (otherlv_0= KEYWORD_9 ( ( ruleQualifiedName ) ) otherlv_2= KEYWORD_6 ( ( ruleQualifiedName ) ) (otherlv_4= KEYWORD_7 otherlv_5= KEYWORD_2 ( (lv_attributeMap_6_0= ruleAttributeMap ) )+ otherlv_7= KEYWORD_3 )? ) )
            // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/internal/InternalMapDslParser.g:137:1: (otherlv_0= KEYWORD_9 ( ( ruleQualifiedName ) ) otherlv_2= KEYWORD_6 ( ( ruleQualifiedName ) ) (otherlv_4= KEYWORD_7 otherlv_5= KEYWORD_2 ( (lv_attributeMap_6_0= ruleAttributeMap ) )+ otherlv_7= KEYWORD_3 )? )
            {
            // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/internal/InternalMapDslParser.g:137:1: (otherlv_0= KEYWORD_9 ( ( ruleQualifiedName ) ) otherlv_2= KEYWORD_6 ( ( ruleQualifiedName ) ) (otherlv_4= KEYWORD_7 otherlv_5= KEYWORD_2 ( (lv_attributeMap_6_0= ruleAttributeMap ) )+ otherlv_7= KEYWORD_3 )? )
            // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/internal/InternalMapDslParser.g:138:2: otherlv_0= KEYWORD_9 ( ( ruleQualifiedName ) ) otherlv_2= KEYWORD_6 ( ( ruleQualifiedName ) ) (otherlv_4= KEYWORD_7 otherlv_5= KEYWORD_2 ( (lv_attributeMap_6_0= ruleAttributeMap ) )+ otherlv_7= KEYWORD_3 )?
            {
            otherlv_0=(Token)match(input,KEYWORD_9,FOLLOW_KEYWORD_9_in_ruleMapping235); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getMappingAccess().getMapBOKeyword_0());
                  
            }
            // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/internal/InternalMapDslParser.g:142:1: ( ( ruleQualifiedName ) )
            // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/internal/InternalMapDslParser.g:143:1: ( ruleQualifiedName )
            {
            // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/internal/InternalMapDslParser.g:143:1: ( ruleQualifiedName )
            // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/internal/InternalMapDslParser.g:144:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getMappingRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMappingAccess().getSourceTypeBusinessObjectCrossReference_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleMapping261);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,KEYWORD_6,FOLLOW_KEYWORD_6_in_ruleMapping274); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getMappingAccess().getToKeyword_2());
                  
            }
            // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/internal/InternalMapDslParser.g:165:1: ( ( ruleQualifiedName ) )
            // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/internal/InternalMapDslParser.g:166:1: ( ruleQualifiedName )
            {
            // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/internal/InternalMapDslParser.g:166:1: ( ruleQualifiedName )
            // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/internal/InternalMapDslParser.g:167:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getMappingRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMappingAccess().getTargetTypeBusinessObjectCrossReference_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleMapping300);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/internal/InternalMapDslParser.g:183:2: (otherlv_4= KEYWORD_7 otherlv_5= KEYWORD_2 ( (lv_attributeMap_6_0= ruleAttributeMap ) )+ otherlv_7= KEYWORD_3 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==KEYWORD_7) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/internal/InternalMapDslParser.g:184:2: otherlv_4= KEYWORD_7 otherlv_5= KEYWORD_2 ( (lv_attributeMap_6_0= ruleAttributeMap ) )+ otherlv_7= KEYWORD_3
                    {
                    otherlv_4=(Token)match(input,KEYWORD_7,FOLLOW_KEYWORD_7_in_ruleMapping314); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getMappingAccess().getWithKeyword_4_0());
                          
                    }
                    otherlv_5=(Token)match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_ruleMapping326); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getMappingAccess().getLeftCurlyBracketKeyword_4_1());
                          
                    }
                    // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/internal/InternalMapDslParser.g:193:1: ( (lv_attributeMap_6_0= ruleAttributeMap ) )+
                    int cnt3=0;
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==RULE_ID) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/internal/InternalMapDslParser.g:194:1: (lv_attributeMap_6_0= ruleAttributeMap )
                    	    {
                    	    // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/internal/InternalMapDslParser.g:194:1: (lv_attributeMap_6_0= ruleAttributeMap )
                    	    // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/internal/InternalMapDslParser.g:195:3: lv_attributeMap_6_0= ruleAttributeMap
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getMappingAccess().getAttributeMapAttributeMapParserRuleCall_4_2_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleAttributeMap_in_ruleMapping346);
                    	    lv_attributeMap_6_0=ruleAttributeMap();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getMappingRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"attributeMap",
                    	              		lv_attributeMap_6_0, 
                    	              		"AttributeMap");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt3 >= 1 ) break loop3;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(3, input);
                                throw eee;
                        }
                        cnt3++;
                    } while (true);

                    otherlv_7=(Token)match(input,KEYWORD_3,FOLLOW_KEYWORD_3_in_ruleMapping360); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getMappingAccess().getRightCurlyBracketKeyword_4_3());
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleMapping"


    // $ANTLR start "entryRuleAttributeMap"
    // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/internal/InternalMapDslParser.g:224:1: entryRuleAttributeMap returns [EObject current=null] : iv_ruleAttributeMap= ruleAttributeMap EOF ;
    public final EObject entryRuleAttributeMap() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeMap = null;


        try {
            // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/internal/InternalMapDslParser.g:225:2: (iv_ruleAttributeMap= ruleAttributeMap EOF )
            // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/internal/InternalMapDslParser.g:226:2: iv_ruleAttributeMap= ruleAttributeMap EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAttributeMapRule()); 
            }
            pushFollow(FOLLOW_ruleAttributeMap_in_entryRuleAttributeMap396);
            iv_ruleAttributeMap=ruleAttributeMap();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAttributeMap; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttributeMap406); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAttributeMap"


    // $ANTLR start "ruleAttributeMap"
    // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/internal/InternalMapDslParser.g:233:1: ruleAttributeMap returns [EObject current=null] : this_AttributeMoveMap_0= ruleAttributeMoveMap ;
    public final EObject ruleAttributeMap() throws RecognitionException {
        EObject current = null;

        EObject this_AttributeMoveMap_0 = null;


         enterRule(); 
            
        try {
            // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/internal/InternalMapDslParser.g:236:28: (this_AttributeMoveMap_0= ruleAttributeMoveMap )
            // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/internal/InternalMapDslParser.g:238:2: this_AttributeMoveMap_0= ruleAttributeMoveMap
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAttributeMapAccess().getAttributeMoveMapParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleAttributeMoveMap_in_ruleAttributeMap455);
            this_AttributeMoveMap_0=ruleAttributeMoveMap();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = this_AttributeMoveMap_0;
                      afterParserOrEnumRuleCall();
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleAttributeMap"


    // $ANTLR start "entryRuleAttributeMoveMap"
    // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/internal/InternalMapDslParser.g:257:1: entryRuleAttributeMoveMap returns [EObject current=null] : iv_ruleAttributeMoveMap= ruleAttributeMoveMap EOF ;
    public final EObject entryRuleAttributeMoveMap() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeMoveMap = null;


        try {
            // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/internal/InternalMapDslParser.g:258:2: (iv_ruleAttributeMoveMap= ruleAttributeMoveMap EOF )
            // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/internal/InternalMapDslParser.g:259:2: iv_ruleAttributeMoveMap= ruleAttributeMoveMap EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAttributeMoveMapRule()); 
            }
            pushFollow(FOLLOW_ruleAttributeMoveMap_in_entryRuleAttributeMoveMap488);
            iv_ruleAttributeMoveMap=ruleAttributeMoveMap();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAttributeMoveMap; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttributeMoveMap498); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAttributeMoveMap"


    // $ANTLR start "ruleAttributeMoveMap"
    // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/internal/InternalMapDslParser.g:266:1: ruleAttributeMoveMap returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) otherlv_1= KEYWORD_5 ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleAttributeMoveMap() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/internal/InternalMapDslParser.g:269:28: ( ( ( ( ruleQualifiedName ) ) otherlv_1= KEYWORD_5 ( ( ruleQualifiedName ) ) ) )
            // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/internal/InternalMapDslParser.g:270:1: ( ( ( ruleQualifiedName ) ) otherlv_1= KEYWORD_5 ( ( ruleQualifiedName ) ) )
            {
            // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/internal/InternalMapDslParser.g:270:1: ( ( ( ruleQualifiedName ) ) otherlv_1= KEYWORD_5 ( ( ruleQualifiedName ) ) )
            // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/internal/InternalMapDslParser.g:270:2: ( ( ruleQualifiedName ) ) otherlv_1= KEYWORD_5 ( ( ruleQualifiedName ) )
            {
            // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/internal/InternalMapDslParser.g:270:2: ( ( ruleQualifiedName ) )
            // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/internal/InternalMapDslParser.g:271:1: ( ruleQualifiedName )
            {
            // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/internal/InternalMapDslParser.g:271:1: ( ruleQualifiedName )
            // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/internal/InternalMapDslParser.g:272:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getAttributeMoveMapRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAttributeMoveMapAccess().getSourceAttributeAttributeCrossReference_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleAttributeMoveMap550);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleAttributeMoveMap563); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getAttributeMoveMapAccess().getEqualsSignGreaterThanSignKeyword_1());
                  
            }
            // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/internal/InternalMapDslParser.g:293:1: ( ( ruleQualifiedName ) )
            // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/internal/InternalMapDslParser.g:294:1: ( ruleQualifiedName )
            {
            // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/internal/InternalMapDslParser.g:294:1: ( ruleQualifiedName )
            // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/internal/InternalMapDslParser.g:295:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getAttributeMoveMapRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAttributeMoveMapAccess().getTargetAttributeAttributeCrossReference_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleAttributeMoveMap589);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleAttributeMoveMap"


    // $ANTLR start "entryRuleQualifiedName"
    // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/internal/InternalMapDslParser.g:319:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/internal/InternalMapDslParser.g:320:1: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/internal/InternalMapDslParser.g:321:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName625);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName636); if (state.failed) return current;

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
    // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/internal/InternalMapDslParser.g:328:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= KEYWORD_1 this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/internal/InternalMapDslParser.g:332:6: ( (this_ID_0= RULE_ID (kw= KEYWORD_1 this_ID_2= RULE_ID )* ) )
            // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/internal/InternalMapDslParser.g:333:1: (this_ID_0= RULE_ID (kw= KEYWORD_1 this_ID_2= RULE_ID )* )
            {
            // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/internal/InternalMapDslParser.g:333:1: (this_ID_0= RULE_ID (kw= KEYWORD_1 this_ID_2= RULE_ID )* )
            // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/internal/InternalMapDslParser.g:333:6: this_ID_0= RULE_ID (kw= KEYWORD_1 this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName676); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/internal/InternalMapDslParser.g:340:1: (kw= KEYWORD_1 this_ID_2= RULE_ID )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==KEYWORD_1) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/internal/InternalMapDslParser.g:341:2: kw= KEYWORD_1 this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_ruleQualifiedName695); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName710); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule();
                  
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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleQualifiedNameWithWildcards"
    // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/internal/InternalMapDslParser.g:361:1: entryRuleQualifiedNameWithWildcards returns [String current=null] : iv_ruleQualifiedNameWithWildcards= ruleQualifiedNameWithWildcards EOF ;
    public final String entryRuleQualifiedNameWithWildcards() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcards = null;


        try {
            // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/internal/InternalMapDslParser.g:362:1: (iv_ruleQualifiedNameWithWildcards= ruleQualifiedNameWithWildcards EOF )
            // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/internal/InternalMapDslParser.g:363:2: iv_ruleQualifiedNameWithWildcards= ruleQualifiedNameWithWildcards EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameWithWildcardsRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcards_in_entryRuleQualifiedNameWithWildcards757);
            iv_ruleQualifiedNameWithWildcards=ruleQualifiedNameWithWildcards();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedNameWithWildcards.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcards768); if (state.failed) return current;

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
    // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/internal/InternalMapDslParser.g:370:1: ruleQualifiedNameWithWildcards returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= KEYWORD_4 )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcards() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;


         enterRule(); 
            
        try {
            // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/internal/InternalMapDslParser.g:374:6: ( (this_QualifiedName_0= ruleQualifiedName (kw= KEYWORD_4 )? ) )
            // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/internal/InternalMapDslParser.g:375:1: (this_QualifiedName_0= ruleQualifiedName (kw= KEYWORD_4 )? )
            {
            // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/internal/InternalMapDslParser.g:375:1: (this_QualifiedName_0= ruleQualifiedName (kw= KEYWORD_4 )? )
            // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/internal/InternalMapDslParser.g:376:5: this_QualifiedName_0= ruleQualifiedName (kw= KEYWORD_4 )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getQualifiedNameWithWildcardsAccess().getQualifiedNameParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildcards815);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_QualifiedName_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/internal/InternalMapDslParser.g:386:1: (kw= KEYWORD_4 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==KEYWORD_4) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/internal/InternalMapDslParser.g:387:2: kw= KEYWORD_4
                    {
                    kw=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleQualifiedNameWithWildcards834); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getQualifiedNameWithWildcardsAccess().getFullStopAsteriskKeyword_1()); 
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule();
                  
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
    // $ANTLR end "ruleQualifiedNameWithWildcards"


    // $ANTLR start "entryRuleImport"
    // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/internal/InternalMapDslParser.g:400:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/internal/InternalMapDslParser.g:401:2: (iv_ruleImport= ruleImport EOF )
            // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/internal/InternalMapDslParser.g:402:2: iv_ruleImport= ruleImport EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImportRule()); 
            }
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport875);
            iv_ruleImport=ruleImport();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImport; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport885); if (state.failed) return current;

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
    // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/internal/InternalMapDslParser.g:409:1: ruleImport returns [EObject current=null] : (otherlv_0= KEYWORD_8 ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcards ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/internal/InternalMapDslParser.g:412:28: ( (otherlv_0= KEYWORD_8 ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcards ) ) ) )
            // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/internal/InternalMapDslParser.g:413:1: (otherlv_0= KEYWORD_8 ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcards ) ) )
            {
            // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/internal/InternalMapDslParser.g:413:1: (otherlv_0= KEYWORD_8 ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcards ) ) )
            // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/internal/InternalMapDslParser.g:414:2: otherlv_0= KEYWORD_8 ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcards ) )
            {
            otherlv_0=(Token)match(input,KEYWORD_8,FOLLOW_KEYWORD_8_in_ruleImport923); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
                  
            }
            // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/internal/InternalMapDslParser.g:418:1: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcards ) )
            // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/internal/InternalMapDslParser.g:419:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcards )
            {
            // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/internal/InternalMapDslParser.g:419:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcards )
            // ../de.goldschmiede.mapdsl/src-gen/de/goldschmiede/mapdsl/parser/antlr/internal/InternalMapDslParser.g:420:3: lv_importedNamespace_1_0= ruleQualifiedNameWithWildcards
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardsParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcards_in_ruleImport943);
            lv_importedNamespace_1_0=ruleQualifiedNameWithWildcards();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

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


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleImport"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel73 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel83 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_ruleModel129 = new BitSet(new long[]{0x0000000000001802L});
    public static final BitSet FOLLOW_ruleMapping_in_ruleModel151 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_ruleMapping_in_entryRuleMapping187 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMapping197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_9_in_ruleMapping235 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleMapping261 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_KEYWORD_6_in_ruleMapping274 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleMapping300 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_KEYWORD_7_in_ruleMapping314 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_KEYWORD_2_in_ruleMapping326 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ruleAttributeMap_in_ruleMapping346 = new BitSet(new long[]{0x0000000000002040L});
    public static final BitSet FOLLOW_KEYWORD_3_in_ruleMapping360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeMap_in_entryRuleAttributeMap396 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttributeMap406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeMoveMap_in_ruleAttributeMap455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeMoveMap_in_entryRuleAttributeMoveMap488 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttributeMoveMap498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleAttributeMoveMap550 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleAttributeMoveMap563 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleAttributeMoveMap589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName625 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName676 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_KEYWORD_1_in_ruleQualifiedName695 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName710 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcards_in_entryRuleQualifiedNameWithWildcards757 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcards768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildcards815 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleQualifiedNameWithWildcards834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport875 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_8_in_ruleImport923 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcards_in_ruleImport943 = new BitSet(new long[]{0x0000000000000002L});

}