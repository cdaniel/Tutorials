package org.xtext.example.mydsl.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.InsuranceGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalInsuranceParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Produkt'", "'{'", "'OPIS='", "'SREDNIE ODSZKODOWANIE='", "'CZESTOSC ZDARZEN NA 1000='", "'OCZEKIWANY ZYSK (%)='", "'KOSZT OBSLUGI (szt)='", "'W SPRZEDAZY='", "'POWIAZANE PRODUKTY='", "'}'", "'TAK'", "'NIE'"
    };
    public static final int RULE_ID=4;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__19=19;
    public static final int RULE_STRING=5;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalInsuranceParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalInsuranceParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalInsuranceParser.tokenNames; }
    public String getGrammarFileName() { return "../org.xtext.example.insurance/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalInsurance.g"; }



     	private InsuranceGrammarAccess grammarAccess;
     	
        public InternalInsuranceParser(TokenStream input, InsuranceGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected InsuranceGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../org.xtext.example.insurance/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalInsurance.g:67:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../org.xtext.example.insurance/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalInsurance.g:68:2: (iv_ruleModel= ruleModel EOF )
            // ../org.xtext.example.insurance/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalInsurance.g:69:2: iv_ruleModel= ruleModel EOF
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
    // ../org.xtext.example.insurance/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalInsurance.g:76:1: ruleModel returns [EObject current=null] : ( (lv_products_0_0= ruleProduct ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_products_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.insurance/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalInsurance.g:79:28: ( ( (lv_products_0_0= ruleProduct ) )* )
            // ../org.xtext.example.insurance/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalInsurance.g:80:1: ( (lv_products_0_0= ruleProduct ) )*
            {
            // ../org.xtext.example.insurance/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalInsurance.g:80:1: ( (lv_products_0_0= ruleProduct ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.example.insurance/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalInsurance.g:81:1: (lv_products_0_0= ruleProduct )
            	    {
            	    // ../org.xtext.example.insurance/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalInsurance.g:81:1: (lv_products_0_0= ruleProduct )
            	    // ../org.xtext.example.insurance/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalInsurance.g:82:3: lv_products_0_0= ruleProduct
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getProductsProductParserRuleCall_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleProduct_in_ruleModel130);
            	    lv_products_0_0=ruleProduct();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"products",
            	            		lv_products_0_0, 
            	            		"Product");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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


    // $ANTLR start "entryRuleProduct"
    // ../org.xtext.example.insurance/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalInsurance.g:106:1: entryRuleProduct returns [EObject current=null] : iv_ruleProduct= ruleProduct EOF ;
    public final EObject entryRuleProduct() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProduct = null;


        try {
            // ../org.xtext.example.insurance/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalInsurance.g:107:2: (iv_ruleProduct= ruleProduct EOF )
            // ../org.xtext.example.insurance/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalInsurance.g:108:2: iv_ruleProduct= ruleProduct EOF
            {
             newCompositeNode(grammarAccess.getProductRule()); 
            pushFollow(FOLLOW_ruleProduct_in_entryRuleProduct166);
            iv_ruleProduct=ruleProduct();

            state._fsp--;

             current =iv_ruleProduct; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProduct176); 

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
    // $ANTLR end "entryRuleProduct"


    // $ANTLR start "ruleProduct"
    // ../org.xtext.example.insurance/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalInsurance.g:115:1: ruleProduct returns [EObject current=null] : (otherlv_0= 'Produkt' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'OPIS=' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= 'SREDNIE ODSZKODOWANIE=' ( (lv_avgDamages_6_0= RULE_INT ) ) otherlv_7= 'CZESTOSC ZDARZEN NA 1000=' ( (lv_occurrences_8_0= RULE_INT ) ) otherlv_9= 'OCZEKIWANY ZYSK (%)=' ( (lv_earnings_10_0= RULE_INT ) ) otherlv_11= 'KOSZT OBSLUGI (szt)=' ( (lv_cost_12_0= RULE_INT ) ) otherlv_13= 'W SPRZEDAZY=' ( (lv_selling_14_0= ruleYesNo ) ) (otherlv_15= 'POWIAZANE PRODUKTY=' ( (otherlv_16= RULE_ID ) )* )? otherlv_17= '}' ) ;
    public final EObject ruleProduct() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_description_4_0=null;
        Token otherlv_5=null;
        Token lv_avgDamages_6_0=null;
        Token otherlv_7=null;
        Token lv_occurrences_8_0=null;
        Token otherlv_9=null;
        Token lv_earnings_10_0=null;
        Token otherlv_11=null;
        Token lv_cost_12_0=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        AntlrDatatypeRuleToken lv_selling_14_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.insurance/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalInsurance.g:118:28: ( (otherlv_0= 'Produkt' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'OPIS=' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= 'SREDNIE ODSZKODOWANIE=' ( (lv_avgDamages_6_0= RULE_INT ) ) otherlv_7= 'CZESTOSC ZDARZEN NA 1000=' ( (lv_occurrences_8_0= RULE_INT ) ) otherlv_9= 'OCZEKIWANY ZYSK (%)=' ( (lv_earnings_10_0= RULE_INT ) ) otherlv_11= 'KOSZT OBSLUGI (szt)=' ( (lv_cost_12_0= RULE_INT ) ) otherlv_13= 'W SPRZEDAZY=' ( (lv_selling_14_0= ruleYesNo ) ) (otherlv_15= 'POWIAZANE PRODUKTY=' ( (otherlv_16= RULE_ID ) )* )? otherlv_17= '}' ) )
            // ../org.xtext.example.insurance/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalInsurance.g:119:1: (otherlv_0= 'Produkt' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'OPIS=' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= 'SREDNIE ODSZKODOWANIE=' ( (lv_avgDamages_6_0= RULE_INT ) ) otherlv_7= 'CZESTOSC ZDARZEN NA 1000=' ( (lv_occurrences_8_0= RULE_INT ) ) otherlv_9= 'OCZEKIWANY ZYSK (%)=' ( (lv_earnings_10_0= RULE_INT ) ) otherlv_11= 'KOSZT OBSLUGI (szt)=' ( (lv_cost_12_0= RULE_INT ) ) otherlv_13= 'W SPRZEDAZY=' ( (lv_selling_14_0= ruleYesNo ) ) (otherlv_15= 'POWIAZANE PRODUKTY=' ( (otherlv_16= RULE_ID ) )* )? otherlv_17= '}' )
            {
            // ../org.xtext.example.insurance/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalInsurance.g:119:1: (otherlv_0= 'Produkt' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'OPIS=' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= 'SREDNIE ODSZKODOWANIE=' ( (lv_avgDamages_6_0= RULE_INT ) ) otherlv_7= 'CZESTOSC ZDARZEN NA 1000=' ( (lv_occurrences_8_0= RULE_INT ) ) otherlv_9= 'OCZEKIWANY ZYSK (%)=' ( (lv_earnings_10_0= RULE_INT ) ) otherlv_11= 'KOSZT OBSLUGI (szt)=' ( (lv_cost_12_0= RULE_INT ) ) otherlv_13= 'W SPRZEDAZY=' ( (lv_selling_14_0= ruleYesNo ) ) (otherlv_15= 'POWIAZANE PRODUKTY=' ( (otherlv_16= RULE_ID ) )* )? otherlv_17= '}' )
            // ../org.xtext.example.insurance/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalInsurance.g:119:3: otherlv_0= 'Produkt' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'OPIS=' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= 'SREDNIE ODSZKODOWANIE=' ( (lv_avgDamages_6_0= RULE_INT ) ) otherlv_7= 'CZESTOSC ZDARZEN NA 1000=' ( (lv_occurrences_8_0= RULE_INT ) ) otherlv_9= 'OCZEKIWANY ZYSK (%)=' ( (lv_earnings_10_0= RULE_INT ) ) otherlv_11= 'KOSZT OBSLUGI (szt)=' ( (lv_cost_12_0= RULE_INT ) ) otherlv_13= 'W SPRZEDAZY=' ( (lv_selling_14_0= ruleYesNo ) ) (otherlv_15= 'POWIAZANE PRODUKTY=' ( (otherlv_16= RULE_ID ) )* )? otherlv_17= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleProduct213); 

                	newLeafNode(otherlv_0, grammarAccess.getProductAccess().getProduktKeyword_0());
                
            // ../org.xtext.example.insurance/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalInsurance.g:123:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.example.insurance/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalInsurance.g:124:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.example.insurance/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalInsurance.g:124:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.example.insurance/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalInsurance.g:125:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProduct230); 

            			newLeafNode(lv_name_1_0, grammarAccess.getProductAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getProductRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleProduct247); 

                	newLeafNode(otherlv_2, grammarAccess.getProductAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleProduct259); 

                	newLeafNode(otherlv_3, grammarAccess.getProductAccess().getOPISKeyword_3());
                
            // ../org.xtext.example.insurance/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalInsurance.g:149:1: ( (lv_description_4_0= RULE_STRING ) )
            // ../org.xtext.example.insurance/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalInsurance.g:150:1: (lv_description_4_0= RULE_STRING )
            {
            // ../org.xtext.example.insurance/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalInsurance.g:150:1: (lv_description_4_0= RULE_STRING )
            // ../org.xtext.example.insurance/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalInsurance.g:151:3: lv_description_4_0= RULE_STRING
            {
            lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleProduct276); 

            			newLeafNode(lv_description_4_0, grammarAccess.getProductAccess().getDescriptionSTRINGTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getProductRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"description",
                    		lv_description_4_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleProduct293); 

                	newLeafNode(otherlv_5, grammarAccess.getProductAccess().getSREDNIEODSZKODOWANIEKeyword_5());
                
            // ../org.xtext.example.insurance/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalInsurance.g:171:1: ( (lv_avgDamages_6_0= RULE_INT ) )
            // ../org.xtext.example.insurance/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalInsurance.g:172:1: (lv_avgDamages_6_0= RULE_INT )
            {
            // ../org.xtext.example.insurance/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalInsurance.g:172:1: (lv_avgDamages_6_0= RULE_INT )
            // ../org.xtext.example.insurance/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalInsurance.g:173:3: lv_avgDamages_6_0= RULE_INT
            {
            lv_avgDamages_6_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleProduct310); 

            			newLeafNode(lv_avgDamages_6_0, grammarAccess.getProductAccess().getAvgDamagesINTTerminalRuleCall_6_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getProductRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"avgDamages",
                    		lv_avgDamages_6_0, 
                    		"INT");
            	    

            }


            }

            otherlv_7=(Token)match(input,15,FOLLOW_15_in_ruleProduct327); 

                	newLeafNode(otherlv_7, grammarAccess.getProductAccess().getCZESTOSCZDARZENNA1000Keyword_7());
                
            // ../org.xtext.example.insurance/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalInsurance.g:193:1: ( (lv_occurrences_8_0= RULE_INT ) )
            // ../org.xtext.example.insurance/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalInsurance.g:194:1: (lv_occurrences_8_0= RULE_INT )
            {
            // ../org.xtext.example.insurance/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalInsurance.g:194:1: (lv_occurrences_8_0= RULE_INT )
            // ../org.xtext.example.insurance/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalInsurance.g:195:3: lv_occurrences_8_0= RULE_INT
            {
            lv_occurrences_8_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleProduct344); 

            			newLeafNode(lv_occurrences_8_0, grammarAccess.getProductAccess().getOccurrencesINTTerminalRuleCall_8_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getProductRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"occurrences",
                    		lv_occurrences_8_0, 
                    		"INT");
            	    

            }


            }

            otherlv_9=(Token)match(input,16,FOLLOW_16_in_ruleProduct361); 

                	newLeafNode(otherlv_9, grammarAccess.getProductAccess().getOCZEKIWANYZYSKKeyword_9());
                
            // ../org.xtext.example.insurance/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalInsurance.g:215:1: ( (lv_earnings_10_0= RULE_INT ) )
            // ../org.xtext.example.insurance/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalInsurance.g:216:1: (lv_earnings_10_0= RULE_INT )
            {
            // ../org.xtext.example.insurance/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalInsurance.g:216:1: (lv_earnings_10_0= RULE_INT )
            // ../org.xtext.example.insurance/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalInsurance.g:217:3: lv_earnings_10_0= RULE_INT
            {
            lv_earnings_10_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleProduct378); 

            			newLeafNode(lv_earnings_10_0, grammarAccess.getProductAccess().getEarningsINTTerminalRuleCall_10_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getProductRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"earnings",
                    		lv_earnings_10_0, 
                    		"INT");
            	    

            }


            }

            otherlv_11=(Token)match(input,17,FOLLOW_17_in_ruleProduct395); 

                	newLeafNode(otherlv_11, grammarAccess.getProductAccess().getKOSZTOBSLUGISztKeyword_11());
                
            // ../org.xtext.example.insurance/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalInsurance.g:237:1: ( (lv_cost_12_0= RULE_INT ) )
            // ../org.xtext.example.insurance/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalInsurance.g:238:1: (lv_cost_12_0= RULE_INT )
            {
            // ../org.xtext.example.insurance/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalInsurance.g:238:1: (lv_cost_12_0= RULE_INT )
            // ../org.xtext.example.insurance/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalInsurance.g:239:3: lv_cost_12_0= RULE_INT
            {
            lv_cost_12_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleProduct412); 

            			newLeafNode(lv_cost_12_0, grammarAccess.getProductAccess().getCostINTTerminalRuleCall_12_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getProductRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"cost",
                    		lv_cost_12_0, 
                    		"INT");
            	    

            }


            }

            otherlv_13=(Token)match(input,18,FOLLOW_18_in_ruleProduct429); 

                	newLeafNode(otherlv_13, grammarAccess.getProductAccess().getWSPRZEDAZYKeyword_13());
                
            // ../org.xtext.example.insurance/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalInsurance.g:259:1: ( (lv_selling_14_0= ruleYesNo ) )
            // ../org.xtext.example.insurance/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalInsurance.g:260:1: (lv_selling_14_0= ruleYesNo )
            {
            // ../org.xtext.example.insurance/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalInsurance.g:260:1: (lv_selling_14_0= ruleYesNo )
            // ../org.xtext.example.insurance/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalInsurance.g:261:3: lv_selling_14_0= ruleYesNo
            {
             
            	        newCompositeNode(grammarAccess.getProductAccess().getSellingYesNoParserRuleCall_14_0()); 
            	    
            pushFollow(FOLLOW_ruleYesNo_in_ruleProduct450);
            lv_selling_14_0=ruleYesNo();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getProductRule());
            	        }
                   		set(
                   			current, 
                   			"selling",
                    		lv_selling_14_0, 
                    		"YesNo");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.example.insurance/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalInsurance.g:277:2: (otherlv_15= 'POWIAZANE PRODUKTY=' ( (otherlv_16= RULE_ID ) )* )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==19) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.xtext.example.insurance/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalInsurance.g:277:4: otherlv_15= 'POWIAZANE PRODUKTY=' ( (otherlv_16= RULE_ID ) )*
                    {
                    otherlv_15=(Token)match(input,19,FOLLOW_19_in_ruleProduct463); 

                        	newLeafNode(otherlv_15, grammarAccess.getProductAccess().getPOWIAZANEPRODUKTYKeyword_15_0());
                        
                    // ../org.xtext.example.insurance/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalInsurance.g:281:1: ( (otherlv_16= RULE_ID ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==RULE_ID) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // ../org.xtext.example.insurance/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalInsurance.g:282:1: (otherlv_16= RULE_ID )
                    	    {
                    	    // ../org.xtext.example.insurance/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalInsurance.g:282:1: (otherlv_16= RULE_ID )
                    	    // ../org.xtext.example.insurance/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalInsurance.g:283:3: otherlv_16= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getProductRule());
                    	    	        }
                    	            
                    	    otherlv_16=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProduct483); 

                    	    		newLeafNode(otherlv_16, grammarAccess.getProductAccess().getConnectedProductCrossReference_15_1_0()); 
                    	    	

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_17=(Token)match(input,20,FOLLOW_20_in_ruleProduct498); 

                	newLeafNode(otherlv_17, grammarAccess.getProductAccess().getRightCurlyBracketKeyword_16());
                

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
    // $ANTLR end "ruleProduct"


    // $ANTLR start "entryRuleYesNo"
    // ../org.xtext.example.insurance/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalInsurance.g:306:1: entryRuleYesNo returns [String current=null] : iv_ruleYesNo= ruleYesNo EOF ;
    public final String entryRuleYesNo() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleYesNo = null;


        try {
            // ../org.xtext.example.insurance/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalInsurance.g:307:2: (iv_ruleYesNo= ruleYesNo EOF )
            // ../org.xtext.example.insurance/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalInsurance.g:308:2: iv_ruleYesNo= ruleYesNo EOF
            {
             newCompositeNode(grammarAccess.getYesNoRule()); 
            pushFollow(FOLLOW_ruleYesNo_in_entryRuleYesNo535);
            iv_ruleYesNo=ruleYesNo();

            state._fsp--;

             current =iv_ruleYesNo.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleYesNo546); 

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
    // $ANTLR end "entryRuleYesNo"


    // $ANTLR start "ruleYesNo"
    // ../org.xtext.example.insurance/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalInsurance.g:315:1: ruleYesNo returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'TAK' | kw= 'NIE' ) ;
    public final AntlrDatatypeRuleToken ruleYesNo() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.insurance/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalInsurance.g:318:28: ( (kw= 'TAK' | kw= 'NIE' ) )
            // ../org.xtext.example.insurance/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalInsurance.g:319:1: (kw= 'TAK' | kw= 'NIE' )
            {
            // ../org.xtext.example.insurance/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalInsurance.g:319:1: (kw= 'TAK' | kw= 'NIE' )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==21) ) {
                alt4=1;
            }
            else if ( (LA4_0==22) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../org.xtext.example.insurance/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalInsurance.g:320:2: kw= 'TAK'
                    {
                    kw=(Token)match(input,21,FOLLOW_21_in_ruleYesNo584); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getYesNoAccess().getTAKKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.insurance/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalInsurance.g:327:2: kw= 'NIE'
                    {
                    kw=(Token)match(input,22,FOLLOW_22_in_ruleYesNo603); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getYesNoAccess().getNIEKeyword_1()); 
                        

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
    // $ANTLR end "ruleYesNo"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProduct_in_ruleModel130 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_ruleProduct_in_entryRuleProduct166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProduct176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleProduct213 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProduct230 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleProduct247 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleProduct259 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleProduct276 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleProduct293 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleProduct310 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleProduct327 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleProduct344 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleProduct361 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleProduct378 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleProduct395 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleProduct412 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleProduct429 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_ruleYesNo_in_ruleProduct450 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_19_in_ruleProduct463 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProduct483 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_20_in_ruleProduct498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleYesNo_in_entryRuleYesNo535 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleYesNo546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleYesNo584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleYesNo603 = new BitSet(new long[]{0x0000000000000002L});

}