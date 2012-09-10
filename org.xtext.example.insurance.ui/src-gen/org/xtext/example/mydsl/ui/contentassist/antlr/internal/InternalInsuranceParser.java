package org.xtext.example.mydsl.ui.contentassist.antlr.internal; 

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
import org.xtext.example.mydsl.services.InsuranceGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalInsuranceParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'TAK'", "'NIE'", "'Produkt'", "'{'", "'OPIS='", "'SREDNIE ODSZKODOWANIE='", "'CZESTOSC ZDARZEN NA 1000='", "'OCZEKIWANY ZYSK (%)='", "'KOSZT OBSLUGI (szt)='", "'W SPRZEDAZY='", "'}'", "'POWIAZANE PRODUKTY='"
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
    public String getGrammarFileName() { return "../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g"; }


     
     	private InsuranceGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(InsuranceGrammarAccess grammarAccess) {
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
    // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:60:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:61:1: ( ruleModel EOF )
            // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:62:1: ruleModel EOF
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
    // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:69:1: ruleModel : ( ( rule__Model__ProductsAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:73:2: ( ( ( rule__Model__ProductsAssignment )* ) )
            // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:74:1: ( ( rule__Model__ProductsAssignment )* )
            {
            // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:74:1: ( ( rule__Model__ProductsAssignment )* )
            // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:75:1: ( rule__Model__ProductsAssignment )*
            {
             before(grammarAccess.getModelAccess().getProductsAssignment()); 
            // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:76:1: ( rule__Model__ProductsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:76:2: rule__Model__ProductsAssignment
            	    {
            	    pushFollow(FOLLOW_rule__Model__ProductsAssignment_in_ruleModel94);
            	    rule__Model__ProductsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getProductsAssignment()); 

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


    // $ANTLR start "entryRuleProduct"
    // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:88:1: entryRuleProduct : ruleProduct EOF ;
    public final void entryRuleProduct() throws RecognitionException {
        try {
            // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:89:1: ( ruleProduct EOF )
            // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:90:1: ruleProduct EOF
            {
             before(grammarAccess.getProductRule()); 
            pushFollow(FOLLOW_ruleProduct_in_entryRuleProduct122);
            ruleProduct();

            state._fsp--;

             after(grammarAccess.getProductRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProduct129); 

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
    // $ANTLR end "entryRuleProduct"


    // $ANTLR start "ruleProduct"
    // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:97:1: ruleProduct : ( ( rule__Product__Group__0 ) ) ;
    public final void ruleProduct() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:101:2: ( ( ( rule__Product__Group__0 ) ) )
            // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:102:1: ( ( rule__Product__Group__0 ) )
            {
            // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:102:1: ( ( rule__Product__Group__0 ) )
            // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:103:1: ( rule__Product__Group__0 )
            {
             before(grammarAccess.getProductAccess().getGroup()); 
            // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:104:1: ( rule__Product__Group__0 )
            // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:104:2: rule__Product__Group__0
            {
            pushFollow(FOLLOW_rule__Product__Group__0_in_ruleProduct155);
            rule__Product__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProductAccess().getGroup()); 

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
    // $ANTLR end "ruleProduct"


    // $ANTLR start "entryRuleYesNo"
    // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:116:1: entryRuleYesNo : ruleYesNo EOF ;
    public final void entryRuleYesNo() throws RecognitionException {
        try {
            // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:117:1: ( ruleYesNo EOF )
            // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:118:1: ruleYesNo EOF
            {
             before(grammarAccess.getYesNoRule()); 
            pushFollow(FOLLOW_ruleYesNo_in_entryRuleYesNo182);
            ruleYesNo();

            state._fsp--;

             after(grammarAccess.getYesNoRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleYesNo189); 

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
    // $ANTLR end "entryRuleYesNo"


    // $ANTLR start "ruleYesNo"
    // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:125:1: ruleYesNo : ( ( rule__YesNo__Alternatives ) ) ;
    public final void ruleYesNo() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:129:2: ( ( ( rule__YesNo__Alternatives ) ) )
            // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:130:1: ( ( rule__YesNo__Alternatives ) )
            {
            // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:130:1: ( ( rule__YesNo__Alternatives ) )
            // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:131:1: ( rule__YesNo__Alternatives )
            {
             before(grammarAccess.getYesNoAccess().getAlternatives()); 
            // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:132:1: ( rule__YesNo__Alternatives )
            // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:132:2: rule__YesNo__Alternatives
            {
            pushFollow(FOLLOW_rule__YesNo__Alternatives_in_ruleYesNo215);
            rule__YesNo__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getYesNoAccess().getAlternatives()); 

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
    // $ANTLR end "ruleYesNo"


    // $ANTLR start "rule__YesNo__Alternatives"
    // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:144:1: rule__YesNo__Alternatives : ( ( 'TAK' ) | ( 'NIE' ) );
    public final void rule__YesNo__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:148:1: ( ( 'TAK' ) | ( 'NIE' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            else if ( (LA2_0==12) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:149:1: ( 'TAK' )
                    {
                    // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:149:1: ( 'TAK' )
                    // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:150:1: 'TAK'
                    {
                     before(grammarAccess.getYesNoAccess().getTAKKeyword_0()); 
                    match(input,11,FOLLOW_11_in_rule__YesNo__Alternatives252); 
                     after(grammarAccess.getYesNoAccess().getTAKKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:157:6: ( 'NIE' )
                    {
                    // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:157:6: ( 'NIE' )
                    // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:158:1: 'NIE'
                    {
                     before(grammarAccess.getYesNoAccess().getNIEKeyword_1()); 
                    match(input,12,FOLLOW_12_in_rule__YesNo__Alternatives272); 
                     after(grammarAccess.getYesNoAccess().getNIEKeyword_1()); 

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
    // $ANTLR end "rule__YesNo__Alternatives"


    // $ANTLR start "rule__Product__Group__0"
    // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:172:1: rule__Product__Group__0 : rule__Product__Group__0__Impl rule__Product__Group__1 ;
    public final void rule__Product__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:176:1: ( rule__Product__Group__0__Impl rule__Product__Group__1 )
            // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:177:2: rule__Product__Group__0__Impl rule__Product__Group__1
            {
            pushFollow(FOLLOW_rule__Product__Group__0__Impl_in_rule__Product__Group__0304);
            rule__Product__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Product__Group__1_in_rule__Product__Group__0307);
            rule__Product__Group__1();

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
    // $ANTLR end "rule__Product__Group__0"


    // $ANTLR start "rule__Product__Group__0__Impl"
    // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:184:1: rule__Product__Group__0__Impl : ( 'Produkt' ) ;
    public final void rule__Product__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:188:1: ( ( 'Produkt' ) )
            // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:189:1: ( 'Produkt' )
            {
            // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:189:1: ( 'Produkt' )
            // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:190:1: 'Produkt'
            {
             before(grammarAccess.getProductAccess().getProduktKeyword_0()); 
            match(input,13,FOLLOW_13_in_rule__Product__Group__0__Impl335); 
             after(grammarAccess.getProductAccess().getProduktKeyword_0()); 

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
    // $ANTLR end "rule__Product__Group__0__Impl"


    // $ANTLR start "rule__Product__Group__1"
    // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:203:1: rule__Product__Group__1 : rule__Product__Group__1__Impl rule__Product__Group__2 ;
    public final void rule__Product__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:207:1: ( rule__Product__Group__1__Impl rule__Product__Group__2 )
            // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:208:2: rule__Product__Group__1__Impl rule__Product__Group__2
            {
            pushFollow(FOLLOW_rule__Product__Group__1__Impl_in_rule__Product__Group__1366);
            rule__Product__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Product__Group__2_in_rule__Product__Group__1369);
            rule__Product__Group__2();

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
    // $ANTLR end "rule__Product__Group__1"


    // $ANTLR start "rule__Product__Group__1__Impl"
    // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:215:1: rule__Product__Group__1__Impl : ( ( rule__Product__NameAssignment_1 ) ) ;
    public final void rule__Product__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:219:1: ( ( ( rule__Product__NameAssignment_1 ) ) )
            // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:220:1: ( ( rule__Product__NameAssignment_1 ) )
            {
            // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:220:1: ( ( rule__Product__NameAssignment_1 ) )
            // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:221:1: ( rule__Product__NameAssignment_1 )
            {
             before(grammarAccess.getProductAccess().getNameAssignment_1()); 
            // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:222:1: ( rule__Product__NameAssignment_1 )
            // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:222:2: rule__Product__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Product__NameAssignment_1_in_rule__Product__Group__1__Impl396);
            rule__Product__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getProductAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Product__Group__1__Impl"


    // $ANTLR start "rule__Product__Group__2"
    // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:232:1: rule__Product__Group__2 : rule__Product__Group__2__Impl rule__Product__Group__3 ;
    public final void rule__Product__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:236:1: ( rule__Product__Group__2__Impl rule__Product__Group__3 )
            // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:237:2: rule__Product__Group__2__Impl rule__Product__Group__3
            {
            pushFollow(FOLLOW_rule__Product__Group__2__Impl_in_rule__Product__Group__2426);
            rule__Product__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Product__Group__3_in_rule__Product__Group__2429);
            rule__Product__Group__3();

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
    // $ANTLR end "rule__Product__Group__2"


    // $ANTLR start "rule__Product__Group__2__Impl"
    // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:244:1: rule__Product__Group__2__Impl : ( '{' ) ;
    public final void rule__Product__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:248:1: ( ( '{' ) )
            // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:249:1: ( '{' )
            {
            // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:249:1: ( '{' )
            // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:250:1: '{'
            {
             before(grammarAccess.getProductAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_14_in_rule__Product__Group__2__Impl457); 
             after(grammarAccess.getProductAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Product__Group__2__Impl"


    // $ANTLR start "rule__Product__Group__3"
    // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:263:1: rule__Product__Group__3 : rule__Product__Group__3__Impl rule__Product__Group__4 ;
    public final void rule__Product__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:267:1: ( rule__Product__Group__3__Impl rule__Product__Group__4 )
            // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:268:2: rule__Product__Group__3__Impl rule__Product__Group__4
            {
            pushFollow(FOLLOW_rule__Product__Group__3__Impl_in_rule__Product__Group__3488);
            rule__Product__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Product__Group__4_in_rule__Product__Group__3491);
            rule__Product__Group__4();

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
    // $ANTLR end "rule__Product__Group__3"


    // $ANTLR start "rule__Product__Group__3__Impl"
    // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:275:1: rule__Product__Group__3__Impl : ( 'OPIS=' ) ;
    public final void rule__Product__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:279:1: ( ( 'OPIS=' ) )
            // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:280:1: ( 'OPIS=' )
            {
            // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:280:1: ( 'OPIS=' )
            // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:281:1: 'OPIS='
            {
             before(grammarAccess.getProductAccess().getOPISKeyword_3()); 
            match(input,15,FOLLOW_15_in_rule__Product__Group__3__Impl519); 
             after(grammarAccess.getProductAccess().getOPISKeyword_3()); 

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
    // $ANTLR end "rule__Product__Group__3__Impl"


    // $ANTLR start "rule__Product__Group__4"
    // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:294:1: rule__Product__Group__4 : rule__Product__Group__4__Impl rule__Product__Group__5 ;
    public final void rule__Product__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:298:1: ( rule__Product__Group__4__Impl rule__Product__Group__5 )
            // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:299:2: rule__Product__Group__4__Impl rule__Product__Group__5
            {
            pushFollow(FOLLOW_rule__Product__Group__4__Impl_in_rule__Product__Group__4550);
            rule__Product__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Product__Group__5_in_rule__Product__Group__4553);
            rule__Product__Group__5();

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
    // $ANTLR end "rule__Product__Group__4"


    // $ANTLR start "rule__Product__Group__4__Impl"
    // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:306:1: rule__Product__Group__4__Impl : ( ( rule__Product__DescriptionAssignment_4 ) ) ;
    public final void rule__Product__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:310:1: ( ( ( rule__Product__DescriptionAssignment_4 ) ) )
            // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:311:1: ( ( rule__Product__DescriptionAssignment_4 ) )
            {
            // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:311:1: ( ( rule__Product__DescriptionAssignment_4 ) )
            // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:312:1: ( rule__Product__DescriptionAssignment_4 )
            {
             before(grammarAccess.getProductAccess().getDescriptionAssignment_4()); 
            // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:313:1: ( rule__Product__DescriptionAssignment_4 )
            // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:313:2: rule__Product__DescriptionAssignment_4
            {
            pushFollow(FOLLOW_rule__Product__DescriptionAssignment_4_in_rule__Product__Group__4__Impl580);
            rule__Product__DescriptionAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getProductAccess().getDescriptionAssignment_4()); 

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
    // $ANTLR end "rule__Product__Group__4__Impl"


    // $ANTLR start "rule__Product__Group__5"
    // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:323:1: rule__Product__Group__5 : rule__Product__Group__5__Impl rule__Product__Group__6 ;
    public final void rule__Product__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:327:1: ( rule__Product__Group__5__Impl rule__Product__Group__6 )
            // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:328:2: rule__Product__Group__5__Impl rule__Product__Group__6
            {
            pushFollow(FOLLOW_rule__Product__Group__5__Impl_in_rule__Product__Group__5610);
            rule__Product__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Product__Group__6_in_rule__Product__Group__5613);
            rule__Product__Group__6();

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
    // $ANTLR end "rule__Product__Group__5"


    // $ANTLR start "rule__Product__Group__5__Impl"
    // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:335:1: rule__Product__Group__5__Impl : ( 'SREDNIE ODSZKODOWANIE=' ) ;
    public final void rule__Product__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:339:1: ( ( 'SREDNIE ODSZKODOWANIE=' ) )
            // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:340:1: ( 'SREDNIE ODSZKODOWANIE=' )
            {
            // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:340:1: ( 'SREDNIE ODSZKODOWANIE=' )
            // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:341:1: 'SREDNIE ODSZKODOWANIE='
            {
             before(grammarAccess.getProductAccess().getSREDNIEODSZKODOWANIEKeyword_5()); 
            match(input,16,FOLLOW_16_in_rule__Product__Group__5__Impl641); 
             after(grammarAccess.getProductAccess().getSREDNIEODSZKODOWANIEKeyword_5()); 

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
    // $ANTLR end "rule__Product__Group__5__Impl"


    // $ANTLR start "rule__Product__Group__6"
    // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:354:1: rule__Product__Group__6 : rule__Product__Group__6__Impl rule__Product__Group__7 ;
    public final void rule__Product__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:358:1: ( rule__Product__Group__6__Impl rule__Product__Group__7 )
            // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:359:2: rule__Product__Group__6__Impl rule__Product__Group__7
            {
            pushFollow(FOLLOW_rule__Product__Group__6__Impl_in_rule__Product__Group__6672);
            rule__Product__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Product__Group__7_in_rule__Product__Group__6675);
            rule__Product__Group__7();

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
    // $ANTLR end "rule__Product__Group__6"


    // $ANTLR start "rule__Product__Group__6__Impl"
    // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:366:1: rule__Product__Group__6__Impl : ( ( rule__Product__AvgDamagesAssignment_6 ) ) ;
    public final void rule__Product__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:370:1: ( ( ( rule__Product__AvgDamagesAssignment_6 ) ) )
            // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:371:1: ( ( rule__Product__AvgDamagesAssignment_6 ) )
            {
            // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:371:1: ( ( rule__Product__AvgDamagesAssignment_6 ) )
            // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:372:1: ( rule__Product__AvgDamagesAssignment_6 )
            {
             before(grammarAccess.getProductAccess().getAvgDamagesAssignment_6()); 
            // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:373:1: ( rule__Product__AvgDamagesAssignment_6 )
            // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:373:2: rule__Product__AvgDamagesAssignment_6
            {
            pushFollow(FOLLOW_rule__Product__AvgDamagesAssignment_6_in_rule__Product__Group__6__Impl702);
            rule__Product__AvgDamagesAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getProductAccess().getAvgDamagesAssignment_6()); 

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
    // $ANTLR end "rule__Product__Group__6__Impl"


    // $ANTLR start "rule__Product__Group__7"
    // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:383:1: rule__Product__Group__7 : rule__Product__Group__7__Impl rule__Product__Group__8 ;
    public final void rule__Product__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:387:1: ( rule__Product__Group__7__Impl rule__Product__Group__8 )
            // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:388:2: rule__Product__Group__7__Impl rule__Product__Group__8
            {
            pushFollow(FOLLOW_rule__Product__Group__7__Impl_in_rule__Product__Group__7732);
            rule__Product__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Product__Group__8_in_rule__Product__Group__7735);
            rule__Product__Group__8();

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
    // $ANTLR end "rule__Product__Group__7"


    // $ANTLR start "rule__Product__Group__7__Impl"
    // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:395:1: rule__Product__Group__7__Impl : ( 'CZESTOSC ZDARZEN NA 1000=' ) ;
    public final void rule__Product__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:399:1: ( ( 'CZESTOSC ZDARZEN NA 1000=' ) )
            // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:400:1: ( 'CZESTOSC ZDARZEN NA 1000=' )
            {
            // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:400:1: ( 'CZESTOSC ZDARZEN NA 1000=' )
            // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:401:1: 'CZESTOSC ZDARZEN NA 1000='
            {
             before(grammarAccess.getProductAccess().getCZESTOSCZDARZENNA1000Keyword_7()); 
            match(input,17,FOLLOW_17_in_rule__Product__Group__7__Impl763); 
             after(grammarAccess.getProductAccess().getCZESTOSCZDARZENNA1000Keyword_7()); 

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
    // $ANTLR end "rule__Product__Group__7__Impl"


    // $ANTLR start "rule__Product__Group__8"
    // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:414:1: rule__Product__Group__8 : rule__Product__Group__8__Impl rule__Product__Group__9 ;
    public final void rule__Product__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:418:1: ( rule__Product__Group__8__Impl rule__Product__Group__9 )
            // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:419:2: rule__Product__Group__8__Impl rule__Product__Group__9
            {
            pushFollow(FOLLOW_rule__Product__Group__8__Impl_in_rule__Product__Group__8794);
            rule__Product__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Product__Group__9_in_rule__Product__Group__8797);
            rule__Product__Group__9();

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
    // $ANTLR end "rule__Product__Group__8"


    // $ANTLR start "rule__Product__Group__8__Impl"
    // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:426:1: rule__Product__Group__8__Impl : ( ( rule__Product__OccurrencesAssignment_8 ) ) ;
    public final void rule__Product__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:430:1: ( ( ( rule__Product__OccurrencesAssignment_8 ) ) )
            // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:431:1: ( ( rule__Product__OccurrencesAssignment_8 ) )
            {
            // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:431:1: ( ( rule__Product__OccurrencesAssignment_8 ) )
            // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:432:1: ( rule__Product__OccurrencesAssignment_8 )
            {
             before(grammarAccess.getProductAccess().getOccurrencesAssignment_8()); 
            // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:433:1: ( rule__Product__OccurrencesAssignment_8 )
            // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:433:2: rule__Product__OccurrencesAssignment_8
            {
            pushFollow(FOLLOW_rule__Product__OccurrencesAssignment_8_in_rule__Product__Group__8__Impl824);
            rule__Product__OccurrencesAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getProductAccess().getOccurrencesAssignment_8()); 

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
    // $ANTLR end "rule__Product__Group__8__Impl"


    // $ANTLR start "rule__Product__Group__9"
    // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:443:1: rule__Product__Group__9 : rule__Product__Group__9__Impl rule__Product__Group__10 ;
    public final void rule__Product__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:447:1: ( rule__Product__Group__9__Impl rule__Product__Group__10 )
            // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:448:2: rule__Product__Group__9__Impl rule__Product__Group__10
            {
            pushFollow(FOLLOW_rule__Product__Group__9__Impl_in_rule__Product__Group__9854);
            rule__Product__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Product__Group__10_in_rule__Product__Group__9857);
            rule__Product__Group__10();

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
    // $ANTLR end "rule__Product__Group__9"


    // $ANTLR start "rule__Product__Group__9__Impl"
    // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:455:1: rule__Product__Group__9__Impl : ( 'OCZEKIWANY ZYSK (%)=' ) ;
    public final void rule__Product__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:459:1: ( ( 'OCZEKIWANY ZYSK (%)=' ) )
            // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:460:1: ( 'OCZEKIWANY ZYSK (%)=' )
            {
            // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:460:1: ( 'OCZEKIWANY ZYSK (%)=' )
            // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:461:1: 'OCZEKIWANY ZYSK (%)='
            {
             before(grammarAccess.getProductAccess().getOCZEKIWANYZYSKKeyword_9()); 
            match(input,18,FOLLOW_18_in_rule__Product__Group__9__Impl885); 
             after(grammarAccess.getProductAccess().getOCZEKIWANYZYSKKeyword_9()); 

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
    // $ANTLR end "rule__Product__Group__9__Impl"


    // $ANTLR start "rule__Product__Group__10"
    // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:474:1: rule__Product__Group__10 : rule__Product__Group__10__Impl rule__Product__Group__11 ;
    public final void rule__Product__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:478:1: ( rule__Product__Group__10__Impl rule__Product__Group__11 )
            // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:479:2: rule__Product__Group__10__Impl rule__Product__Group__11
            {
            pushFollow(FOLLOW_rule__Product__Group__10__Impl_in_rule__Product__Group__10916);
            rule__Product__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Product__Group__11_in_rule__Product__Group__10919);
            rule__Product__Group__11();

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
    // $ANTLR end "rule__Product__Group__10"


    // $ANTLR start "rule__Product__Group__10__Impl"
    // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:486:1: rule__Product__Group__10__Impl : ( ( rule__Product__EarningsAssignment_10 ) ) ;
    public final void rule__Product__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:490:1: ( ( ( rule__Product__EarningsAssignment_10 ) ) )
            // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:491:1: ( ( rule__Product__EarningsAssignment_10 ) )
            {
            // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:491:1: ( ( rule__Product__EarningsAssignment_10 ) )
            // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:492:1: ( rule__Product__EarningsAssignment_10 )
            {
             before(grammarAccess.getProductAccess().getEarningsAssignment_10()); 
            // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:493:1: ( rule__Product__EarningsAssignment_10 )
            // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:493:2: rule__Product__EarningsAssignment_10
            {
            pushFollow(FOLLOW_rule__Product__EarningsAssignment_10_in_rule__Product__Group__10__Impl946);
            rule__Product__EarningsAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getProductAccess().getEarningsAssignment_10()); 

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
    // $ANTLR end "rule__Product__Group__10__Impl"


    // $ANTLR start "rule__Product__Group__11"
    // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:503:1: rule__Product__Group__11 : rule__Product__Group__11__Impl rule__Product__Group__12 ;
    public final void rule__Product__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:507:1: ( rule__Product__Group__11__Impl rule__Product__Group__12 )
            // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:508:2: rule__Product__Group__11__Impl rule__Product__Group__12
            {
            pushFollow(FOLLOW_rule__Product__Group__11__Impl_in_rule__Product__Group__11976);
            rule__Product__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Product__Group__12_in_rule__Product__Group__11979);
            rule__Product__Group__12();

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
    // $ANTLR end "rule__Product__Group__11"


    // $ANTLR start "rule__Product__Group__11__Impl"
    // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:515:1: rule__Product__Group__11__Impl : ( 'KOSZT OBSLUGI (szt)=' ) ;
    public final void rule__Product__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:519:1: ( ( 'KOSZT OBSLUGI (szt)=' ) )
            // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:520:1: ( 'KOSZT OBSLUGI (szt)=' )
            {
            // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:520:1: ( 'KOSZT OBSLUGI (szt)=' )
            // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:521:1: 'KOSZT OBSLUGI (szt)='
            {
             before(grammarAccess.getProductAccess().getKOSZTOBSLUGISztKeyword_11()); 
            match(input,19,FOLLOW_19_in_rule__Product__Group__11__Impl1007); 
             after(grammarAccess.getProductAccess().getKOSZTOBSLUGISztKeyword_11()); 

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
    // $ANTLR end "rule__Product__Group__11__Impl"


    // $ANTLR start "rule__Product__Group__12"
    // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:534:1: rule__Product__Group__12 : rule__Product__Group__12__Impl rule__Product__Group__13 ;
    public final void rule__Product__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:538:1: ( rule__Product__Group__12__Impl rule__Product__Group__13 )
            // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:539:2: rule__Product__Group__12__Impl rule__Product__Group__13
            {
            pushFollow(FOLLOW_rule__Product__Group__12__Impl_in_rule__Product__Group__121038);
            rule__Product__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Product__Group__13_in_rule__Product__Group__121041);
            rule__Product__Group__13();

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
    // $ANTLR end "rule__Product__Group__12"


    // $ANTLR start "rule__Product__Group__12__Impl"
    // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:546:1: rule__Product__Group__12__Impl : ( ( rule__Product__CostAssignment_12 ) ) ;
    public final void rule__Product__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:550:1: ( ( ( rule__Product__CostAssignment_12 ) ) )
            // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:551:1: ( ( rule__Product__CostAssignment_12 ) )
            {
            // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:551:1: ( ( rule__Product__CostAssignment_12 ) )
            // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:552:1: ( rule__Product__CostAssignment_12 )
            {
             before(grammarAccess.getProductAccess().getCostAssignment_12()); 
            // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:553:1: ( rule__Product__CostAssignment_12 )
            // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:553:2: rule__Product__CostAssignment_12
            {
            pushFollow(FOLLOW_rule__Product__CostAssignment_12_in_rule__Product__Group__12__Impl1068);
            rule__Product__CostAssignment_12();

            state._fsp--;


            }

             after(grammarAccess.getProductAccess().getCostAssignment_12()); 

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
    // $ANTLR end "rule__Product__Group__12__Impl"


    // $ANTLR start "rule__Product__Group__13"
    // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:563:1: rule__Product__Group__13 : rule__Product__Group__13__Impl rule__Product__Group__14 ;
    public final void rule__Product__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:567:1: ( rule__Product__Group__13__Impl rule__Product__Group__14 )
            // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:568:2: rule__Product__Group__13__Impl rule__Product__Group__14
            {
            pushFollow(FOLLOW_rule__Product__Group__13__Impl_in_rule__Product__Group__131098);
            rule__Product__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Product__Group__14_in_rule__Product__Group__131101);
            rule__Product__Group__14();

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
    // $ANTLR end "rule__Product__Group__13"


    // $ANTLR start "rule__Product__Group__13__Impl"
    // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:575:1: rule__Product__Group__13__Impl : ( 'W SPRZEDAZY=' ) ;
    public final void rule__Product__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:579:1: ( ( 'W SPRZEDAZY=' ) )
            // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:580:1: ( 'W SPRZEDAZY=' )
            {
            // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:580:1: ( 'W SPRZEDAZY=' )
            // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:581:1: 'W SPRZEDAZY='
            {
             before(grammarAccess.getProductAccess().getWSPRZEDAZYKeyword_13()); 
            match(input,20,FOLLOW_20_in_rule__Product__Group__13__Impl1129); 
             after(grammarAccess.getProductAccess().getWSPRZEDAZYKeyword_13()); 

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
    // $ANTLR end "rule__Product__Group__13__Impl"


    // $ANTLR start "rule__Product__Group__14"
    // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:594:1: rule__Product__Group__14 : rule__Product__Group__14__Impl rule__Product__Group__15 ;
    public final void rule__Product__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:598:1: ( rule__Product__Group__14__Impl rule__Product__Group__15 )
            // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:599:2: rule__Product__Group__14__Impl rule__Product__Group__15
            {
            pushFollow(FOLLOW_rule__Product__Group__14__Impl_in_rule__Product__Group__141160);
            rule__Product__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Product__Group__15_in_rule__Product__Group__141163);
            rule__Product__Group__15();

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
    // $ANTLR end "rule__Product__Group__14"


    // $ANTLR start "rule__Product__Group__14__Impl"
    // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:606:1: rule__Product__Group__14__Impl : ( ( rule__Product__SellingAssignment_14 ) ) ;
    public final void rule__Product__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:610:1: ( ( ( rule__Product__SellingAssignment_14 ) ) )
            // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:611:1: ( ( rule__Product__SellingAssignment_14 ) )
            {
            // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:611:1: ( ( rule__Product__SellingAssignment_14 ) )
            // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:612:1: ( rule__Product__SellingAssignment_14 )
            {
             before(grammarAccess.getProductAccess().getSellingAssignment_14()); 
            // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:613:1: ( rule__Product__SellingAssignment_14 )
            // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:613:2: rule__Product__SellingAssignment_14
            {
            pushFollow(FOLLOW_rule__Product__SellingAssignment_14_in_rule__Product__Group__14__Impl1190);
            rule__Product__SellingAssignment_14();

            state._fsp--;


            }

             after(grammarAccess.getProductAccess().getSellingAssignment_14()); 

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
    // $ANTLR end "rule__Product__Group__14__Impl"


    // $ANTLR start "rule__Product__Group__15"
    // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:623:1: rule__Product__Group__15 : rule__Product__Group__15__Impl rule__Product__Group__16 ;
    public final void rule__Product__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:627:1: ( rule__Product__Group__15__Impl rule__Product__Group__16 )
            // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:628:2: rule__Product__Group__15__Impl rule__Product__Group__16
            {
            pushFollow(FOLLOW_rule__Product__Group__15__Impl_in_rule__Product__Group__151220);
            rule__Product__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Product__Group__16_in_rule__Product__Group__151223);
            rule__Product__Group__16();

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
    // $ANTLR end "rule__Product__Group__15"


    // $ANTLR start "rule__Product__Group__15__Impl"
    // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:635:1: rule__Product__Group__15__Impl : ( ( rule__Product__Group_15__0 )? ) ;
    public final void rule__Product__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:639:1: ( ( ( rule__Product__Group_15__0 )? ) )
            // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:640:1: ( ( rule__Product__Group_15__0 )? )
            {
            // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:640:1: ( ( rule__Product__Group_15__0 )? )
            // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:641:1: ( rule__Product__Group_15__0 )?
            {
             before(grammarAccess.getProductAccess().getGroup_15()); 
            // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:642:1: ( rule__Product__Group_15__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==22) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:642:2: rule__Product__Group_15__0
                    {
                    pushFollow(FOLLOW_rule__Product__Group_15__0_in_rule__Product__Group__15__Impl1250);
                    rule__Product__Group_15__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProductAccess().getGroup_15()); 

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
    // $ANTLR end "rule__Product__Group__15__Impl"


    // $ANTLR start "rule__Product__Group__16"
    // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:652:1: rule__Product__Group__16 : rule__Product__Group__16__Impl ;
    public final void rule__Product__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:656:1: ( rule__Product__Group__16__Impl )
            // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:657:2: rule__Product__Group__16__Impl
            {
            pushFollow(FOLLOW_rule__Product__Group__16__Impl_in_rule__Product__Group__161281);
            rule__Product__Group__16__Impl();

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
    // $ANTLR end "rule__Product__Group__16"


    // $ANTLR start "rule__Product__Group__16__Impl"
    // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:663:1: rule__Product__Group__16__Impl : ( '}' ) ;
    public final void rule__Product__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:667:1: ( ( '}' ) )
            // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:668:1: ( '}' )
            {
            // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:668:1: ( '}' )
            // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:669:1: '}'
            {
             before(grammarAccess.getProductAccess().getRightCurlyBracketKeyword_16()); 
            match(input,21,FOLLOW_21_in_rule__Product__Group__16__Impl1309); 
             after(grammarAccess.getProductAccess().getRightCurlyBracketKeyword_16()); 

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
    // $ANTLR end "rule__Product__Group__16__Impl"


    // $ANTLR start "rule__Product__Group_15__0"
    // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:716:1: rule__Product__Group_15__0 : rule__Product__Group_15__0__Impl rule__Product__Group_15__1 ;
    public final void rule__Product__Group_15__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:720:1: ( rule__Product__Group_15__0__Impl rule__Product__Group_15__1 )
            // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:721:2: rule__Product__Group_15__0__Impl rule__Product__Group_15__1
            {
            pushFollow(FOLLOW_rule__Product__Group_15__0__Impl_in_rule__Product__Group_15__01374);
            rule__Product__Group_15__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Product__Group_15__1_in_rule__Product__Group_15__01377);
            rule__Product__Group_15__1();

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
    // $ANTLR end "rule__Product__Group_15__0"


    // $ANTLR start "rule__Product__Group_15__0__Impl"
    // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:728:1: rule__Product__Group_15__0__Impl : ( 'POWIAZANE PRODUKTY=' ) ;
    public final void rule__Product__Group_15__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:732:1: ( ( 'POWIAZANE PRODUKTY=' ) )
            // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:733:1: ( 'POWIAZANE PRODUKTY=' )
            {
            // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:733:1: ( 'POWIAZANE PRODUKTY=' )
            // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:734:1: 'POWIAZANE PRODUKTY='
            {
             before(grammarAccess.getProductAccess().getPOWIAZANEPRODUKTYKeyword_15_0()); 
            match(input,22,FOLLOW_22_in_rule__Product__Group_15__0__Impl1405); 
             after(grammarAccess.getProductAccess().getPOWIAZANEPRODUKTYKeyword_15_0()); 

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
    // $ANTLR end "rule__Product__Group_15__0__Impl"


    // $ANTLR start "rule__Product__Group_15__1"
    // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:747:1: rule__Product__Group_15__1 : rule__Product__Group_15__1__Impl ;
    public final void rule__Product__Group_15__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:751:1: ( rule__Product__Group_15__1__Impl )
            // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:752:2: rule__Product__Group_15__1__Impl
            {
            pushFollow(FOLLOW_rule__Product__Group_15__1__Impl_in_rule__Product__Group_15__11436);
            rule__Product__Group_15__1__Impl();

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
    // $ANTLR end "rule__Product__Group_15__1"


    // $ANTLR start "rule__Product__Group_15__1__Impl"
    // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:758:1: rule__Product__Group_15__1__Impl : ( ( rule__Product__ConnectedAssignment_15_1 )* ) ;
    public final void rule__Product__Group_15__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:762:1: ( ( ( rule__Product__ConnectedAssignment_15_1 )* ) )
            // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:763:1: ( ( rule__Product__ConnectedAssignment_15_1 )* )
            {
            // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:763:1: ( ( rule__Product__ConnectedAssignment_15_1 )* )
            // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:764:1: ( rule__Product__ConnectedAssignment_15_1 )*
            {
             before(grammarAccess.getProductAccess().getConnectedAssignment_15_1()); 
            // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:765:1: ( rule__Product__ConnectedAssignment_15_1 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:765:2: rule__Product__ConnectedAssignment_15_1
            	    {
            	    pushFollow(FOLLOW_rule__Product__ConnectedAssignment_15_1_in_rule__Product__Group_15__1__Impl1463);
            	    rule__Product__ConnectedAssignment_15_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getProductAccess().getConnectedAssignment_15_1()); 

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
    // $ANTLR end "rule__Product__Group_15__1__Impl"


    // $ANTLR start "rule__Model__ProductsAssignment"
    // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:780:1: rule__Model__ProductsAssignment : ( ruleProduct ) ;
    public final void rule__Model__ProductsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:784:1: ( ( ruleProduct ) )
            // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:785:1: ( ruleProduct )
            {
            // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:785:1: ( ruleProduct )
            // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:786:1: ruleProduct
            {
             before(grammarAccess.getModelAccess().getProductsProductParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleProduct_in_rule__Model__ProductsAssignment1503);
            ruleProduct();

            state._fsp--;

             after(grammarAccess.getModelAccess().getProductsProductParserRuleCall_0()); 

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
    // $ANTLR end "rule__Model__ProductsAssignment"


    // $ANTLR start "rule__Product__NameAssignment_1"
    // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:795:1: rule__Product__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Product__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:799:1: ( ( RULE_ID ) )
            // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:800:1: ( RULE_ID )
            {
            // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:800:1: ( RULE_ID )
            // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:801:1: RULE_ID
            {
             before(grammarAccess.getProductAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Product__NameAssignment_11534); 
             after(grammarAccess.getProductAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Product__NameAssignment_1"


    // $ANTLR start "rule__Product__DescriptionAssignment_4"
    // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:810:1: rule__Product__DescriptionAssignment_4 : ( RULE_STRING ) ;
    public final void rule__Product__DescriptionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:814:1: ( ( RULE_STRING ) )
            // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:815:1: ( RULE_STRING )
            {
            // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:815:1: ( RULE_STRING )
            // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:816:1: RULE_STRING
            {
             before(grammarAccess.getProductAccess().getDescriptionSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Product__DescriptionAssignment_41565); 
             after(grammarAccess.getProductAccess().getDescriptionSTRINGTerminalRuleCall_4_0()); 

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
    // $ANTLR end "rule__Product__DescriptionAssignment_4"


    // $ANTLR start "rule__Product__AvgDamagesAssignment_6"
    // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:825:1: rule__Product__AvgDamagesAssignment_6 : ( RULE_INT ) ;
    public final void rule__Product__AvgDamagesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:829:1: ( ( RULE_INT ) )
            // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:830:1: ( RULE_INT )
            {
            // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:830:1: ( RULE_INT )
            // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:831:1: RULE_INT
            {
             before(grammarAccess.getProductAccess().getAvgDamagesINTTerminalRuleCall_6_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Product__AvgDamagesAssignment_61596); 
             after(grammarAccess.getProductAccess().getAvgDamagesINTTerminalRuleCall_6_0()); 

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
    // $ANTLR end "rule__Product__AvgDamagesAssignment_6"


    // $ANTLR start "rule__Product__OccurrencesAssignment_8"
    // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:840:1: rule__Product__OccurrencesAssignment_8 : ( RULE_INT ) ;
    public final void rule__Product__OccurrencesAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:844:1: ( ( RULE_INT ) )
            // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:845:1: ( RULE_INT )
            {
            // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:845:1: ( RULE_INT )
            // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:846:1: RULE_INT
            {
             before(grammarAccess.getProductAccess().getOccurrencesINTTerminalRuleCall_8_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Product__OccurrencesAssignment_81627); 
             after(grammarAccess.getProductAccess().getOccurrencesINTTerminalRuleCall_8_0()); 

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
    // $ANTLR end "rule__Product__OccurrencesAssignment_8"


    // $ANTLR start "rule__Product__EarningsAssignment_10"
    // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:855:1: rule__Product__EarningsAssignment_10 : ( RULE_INT ) ;
    public final void rule__Product__EarningsAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:859:1: ( ( RULE_INT ) )
            // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:860:1: ( RULE_INT )
            {
            // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:860:1: ( RULE_INT )
            // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:861:1: RULE_INT
            {
             before(grammarAccess.getProductAccess().getEarningsINTTerminalRuleCall_10_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Product__EarningsAssignment_101658); 
             after(grammarAccess.getProductAccess().getEarningsINTTerminalRuleCall_10_0()); 

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
    // $ANTLR end "rule__Product__EarningsAssignment_10"


    // $ANTLR start "rule__Product__CostAssignment_12"
    // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:870:1: rule__Product__CostAssignment_12 : ( RULE_INT ) ;
    public final void rule__Product__CostAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:874:1: ( ( RULE_INT ) )
            // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:875:1: ( RULE_INT )
            {
            // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:875:1: ( RULE_INT )
            // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:876:1: RULE_INT
            {
             before(grammarAccess.getProductAccess().getCostINTTerminalRuleCall_12_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Product__CostAssignment_121689); 
             after(grammarAccess.getProductAccess().getCostINTTerminalRuleCall_12_0()); 

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
    // $ANTLR end "rule__Product__CostAssignment_12"


    // $ANTLR start "rule__Product__SellingAssignment_14"
    // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:885:1: rule__Product__SellingAssignment_14 : ( ruleYesNo ) ;
    public final void rule__Product__SellingAssignment_14() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:889:1: ( ( ruleYesNo ) )
            // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:890:1: ( ruleYesNo )
            {
            // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:890:1: ( ruleYesNo )
            // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:891:1: ruleYesNo
            {
             before(grammarAccess.getProductAccess().getSellingYesNoParserRuleCall_14_0()); 
            pushFollow(FOLLOW_ruleYesNo_in_rule__Product__SellingAssignment_141720);
            ruleYesNo();

            state._fsp--;

             after(grammarAccess.getProductAccess().getSellingYesNoParserRuleCall_14_0()); 

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
    // $ANTLR end "rule__Product__SellingAssignment_14"


    // $ANTLR start "rule__Product__ConnectedAssignment_15_1"
    // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:900:1: rule__Product__ConnectedAssignment_15_1 : ( ( RULE_ID ) ) ;
    public final void rule__Product__ConnectedAssignment_15_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:904:1: ( ( ( RULE_ID ) ) )
            // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:905:1: ( ( RULE_ID ) )
            {
            // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:905:1: ( ( RULE_ID ) )
            // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:906:1: ( RULE_ID )
            {
             before(grammarAccess.getProductAccess().getConnectedProductCrossReference_15_1_0()); 
            // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:907:1: ( RULE_ID )
            // ../org.xtext.example.insurance.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalInsurance.g:908:1: RULE_ID
            {
             before(grammarAccess.getProductAccess().getConnectedProductIDTerminalRuleCall_15_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Product__ConnectedAssignment_15_11755); 
             after(grammarAccess.getProductAccess().getConnectedProductIDTerminalRuleCall_15_1_0_1()); 

            }

             after(grammarAccess.getProductAccess().getConnectedProductCrossReference_15_1_0()); 

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
    // $ANTLR end "rule__Product__ConnectedAssignment_15_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__ProductsAssignment_in_ruleModel94 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_ruleProduct_in_entryRuleProduct122 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProduct129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Product__Group__0_in_ruleProduct155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleYesNo_in_entryRuleYesNo182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleYesNo189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__YesNo__Alternatives_in_ruleYesNo215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__YesNo__Alternatives252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__YesNo__Alternatives272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Product__Group__0__Impl_in_rule__Product__Group__0304 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Product__Group__1_in_rule__Product__Group__0307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Product__Group__0__Impl335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Product__Group__1__Impl_in_rule__Product__Group__1366 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Product__Group__2_in_rule__Product__Group__1369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Product__NameAssignment_1_in_rule__Product__Group__1__Impl396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Product__Group__2__Impl_in_rule__Product__Group__2426 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Product__Group__3_in_rule__Product__Group__2429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Product__Group__2__Impl457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Product__Group__3__Impl_in_rule__Product__Group__3488 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Product__Group__4_in_rule__Product__Group__3491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Product__Group__3__Impl519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Product__Group__4__Impl_in_rule__Product__Group__4550 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Product__Group__5_in_rule__Product__Group__4553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Product__DescriptionAssignment_4_in_rule__Product__Group__4__Impl580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Product__Group__5__Impl_in_rule__Product__Group__5610 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Product__Group__6_in_rule__Product__Group__5613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Product__Group__5__Impl641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Product__Group__6__Impl_in_rule__Product__Group__6672 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Product__Group__7_in_rule__Product__Group__6675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Product__AvgDamagesAssignment_6_in_rule__Product__Group__6__Impl702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Product__Group__7__Impl_in_rule__Product__Group__7732 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Product__Group__8_in_rule__Product__Group__7735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Product__Group__7__Impl763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Product__Group__8__Impl_in_rule__Product__Group__8794 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Product__Group__9_in_rule__Product__Group__8797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Product__OccurrencesAssignment_8_in_rule__Product__Group__8__Impl824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Product__Group__9__Impl_in_rule__Product__Group__9854 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Product__Group__10_in_rule__Product__Group__9857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Product__Group__9__Impl885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Product__Group__10__Impl_in_rule__Product__Group__10916 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Product__Group__11_in_rule__Product__Group__10919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Product__EarningsAssignment_10_in_rule__Product__Group__10__Impl946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Product__Group__11__Impl_in_rule__Product__Group__11976 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Product__Group__12_in_rule__Product__Group__11979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Product__Group__11__Impl1007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Product__Group__12__Impl_in_rule__Product__Group__121038 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Product__Group__13_in_rule__Product__Group__121041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Product__CostAssignment_12_in_rule__Product__Group__12__Impl1068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Product__Group__13__Impl_in_rule__Product__Group__131098 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_rule__Product__Group__14_in_rule__Product__Group__131101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Product__Group__13__Impl1129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Product__Group__14__Impl_in_rule__Product__Group__141160 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_rule__Product__Group__15_in_rule__Product__Group__141163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Product__SellingAssignment_14_in_rule__Product__Group__14__Impl1190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Product__Group__15__Impl_in_rule__Product__Group__151220 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_rule__Product__Group__16_in_rule__Product__Group__151223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Product__Group_15__0_in_rule__Product__Group__15__Impl1250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Product__Group__16__Impl_in_rule__Product__Group__161281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Product__Group__16__Impl1309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Product__Group_15__0__Impl_in_rule__Product__Group_15__01374 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Product__Group_15__1_in_rule__Product__Group_15__01377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Product__Group_15__0__Impl1405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Product__Group_15__1__Impl_in_rule__Product__Group_15__11436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Product__ConnectedAssignment_15_1_in_rule__Product__Group_15__1__Impl1463 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleProduct_in_rule__Model__ProductsAssignment1503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Product__NameAssignment_11534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Product__DescriptionAssignment_41565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Product__AvgDamagesAssignment_61596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Product__OccurrencesAssignment_81627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Product__EarningsAssignment_101658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Product__CostAssignment_121689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleYesNo_in_rule__Product__SellingAssignment_141720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Product__ConnectedAssignment_15_11755 = new BitSet(new long[]{0x0000000000000002L});

}