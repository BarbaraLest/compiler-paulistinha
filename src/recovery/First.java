package recovery;

import parser.*;

public class First {
	
    static public final RecoverySet main = new RecoverySet();
    static public final RecoverySet tipoInteiro = new RecoverySet();
    static public final RecoverySet tipoBool = new RecoverySet();
    static public final RecoverySet tipoString = new RecoverySet();
    static public final RecoverySet tipo_Calculo = new RecoverySet();
    static public final RecoverySet tipoComparacao = new RecoverySet();
    static public final RecoverySet numero = new RecoverySet();
    static public final RecoverySet id = new RecoverySet();
    static public final RecoverySet aspas = new RecoverySet();
    static public final RecoverySet virgula = new RecoverySet();
    static public final RecoverySet condIf = new RecoverySet();
    static public final RecoverySet condElse = new RecoverySet();
    static public final RecoverySet repWhile = new RecoverySet();
    static public final RecoverySet repFor = new RecoverySet();
    static public final RecoverySet entao = new RecoverySet();
    static public final RecoverySet mais = new RecoverySet();
    static public final RecoverySet menos = new RecoverySet();
    static public final RecoverySet multi = new RecoverySet();
    static public final RecoverySet div = new RecoverySet();
    static public final RecoverySet maior = new RecoverySet();
    static public final RecoverySet menor = new RecoverySet();
    static public final RecoverySet menorIgual = new RecoverySet();
    static public final RecoverySet maiorIgual = new RecoverySet();
    static public final RecoverySet diferente = new RecoverySet();
    static public final RecoverySet igual = new RecoverySet();
    static public final RecoverySet atribui = new RecoverySet();
    static public final RecoverySet inicioPrograma = new RecoverySet();
    static public final RecoverySet abreBloco = new RecoverySet();
    static public final RecoverySet fimBloco = new RecoverySet();
    static public final RecoverySet abreBloCond = new RecoverySet();
    static public final RecoverySet fechaBloCond = new RecoverySet();
    static public final RecoverySet e = new RecoverySet();
    static public final RecoverySet ou = new RecoverySet();
    static public final RecoverySet tipoDado = new RecoverySet();
    static public final RecoverySet tipoCalculo = new RecoverySet();
    static public final RecoverySet tipoOperadorLogico = new RecoverySet();
    static public final RecoverySet corpo = new RecoverySet();
    static public final RecoverySet input = new RecoverySet();
    static public final RecoverySet defineVariaveis = new RecoverySet();
    static public final RecoverySet atribuicaoVar = new RecoverySet();
    static public final RecoverySet cond = new RecoverySet();
    
    
    static {
    	main.add(new Integer(CompiladorConstants.EOF));
    	
    	
    	tipoInteiro.add(new Integer(CompiladorConstants.ID));
    	tipoBool.add(new Integer(CompiladorConstants.ID));
    	tipoString.add(new Integer(CompiladorConstants.ID));
    	
    	tipo_Calculo.add(new Integer(CompiladorConstants.ID));
    	tipo_Calculo.add(new Integer(CompiladorConstants.NUMERO));
    	
    	
    	numero.add(new Integer(CompiladorConstants.MAIOR));
    	numero.add(new Integer(CompiladorConstants.MENOR));
    	numero.add(new Integer(CompiladorConstants.MENORIGUAL));
    	numero.add(new Integer(CompiladorConstants.MAIORIGUAL));
    	numero.add(new Integer(CompiladorConstants.DIFERENTE));
    	numero.add(new Integer(CompiladorConstants.IGUAL));
    	numero.add(new Integer(CompiladorConstants.MAIS));
    	numero.add(new Integer(CompiladorConstants.MENOS));
    	numero.add(new Integer(CompiladorConstants.MULTI));
    	numero.add(new Integer(CompiladorConstants.DIV));
    	numero.add(new Integer(CompiladorConstants.E));
    	numero.add(new Integer(CompiladorConstants.OU));
    	numero.add(new Integer(CompiladorConstants.FECHABLOCOND));
    	numero.add(new Integer(CompiladorConstants.FIMBLOCO));
    	numero.add(new Integer(CompiladorConstants.VIRGULA));
    	numero.add(new Integer(CompiladorConstants.ABREBLOCOND));
    	
    	id.add(new Integer(CompiladorConstants.ABREBLOCO));
    	id.add(new Integer(CompiladorConstants.ATRIBUI));
    	id.add(new Integer(CompiladorConstants.MAIOR));
    	id.add(new Integer(CompiladorConstants.MENOR));
    	id.add(new Integer(CompiladorConstants.MENORIGUAL));
    	id.add(new Integer(CompiladorConstants.MAIORIGUAL));
    	id.add(new Integer(CompiladorConstants.DIFERENTE));
    	id.add(new Integer(CompiladorConstants.IGUAL));
    	id.add(new Integer(CompiladorConstants.VIRGULA));
    	id.add(new Integer(CompiladorConstants.ASPAS));
    	id.add(new Integer(CompiladorConstants.MAIS));
    	id.add(new Integer(CompiladorConstants.MENOS));
    	id.add(new Integer(CompiladorConstants.MULTI));
    	id.add(new Integer(CompiladorConstants.DIV));
    	id.add(new Integer(CompiladorConstants.E));
    	id.add(new Integer(CompiladorConstants.OU));
    	
    	aspas.add(new Integer(CompiladorConstants.ID));
    	aspas.add(new Integer(CompiladorConstants.FECHABLOCOND));
    	aspas.add(new Integer(CompiladorConstants.FIMBLOCO));
    	aspas.add(new Integer(CompiladorConstants.VIRGULA));
    	aspas.add(new Integer(CompiladorConstants.ABREBLOCOND));
    	
    	virgula.add(new Integer(CompiladorConstants.ID));
    	virgula.add(new Integer(CompiladorConstants.CONDIF));
    	virgula.add(new Integer(CompiladorConstants.REPWHILE));
    	virgula.add(new Integer(CompiladorConstants.REPFOR));
    	virgula.add(new Integer(CompiladorConstants.FECHABLOCOND));
    	virgula.add(new Integer(CompiladorConstants.FIMBLOCO));
    	
    	condIf.add(new Integer(CompiladorConstants.ID));  
    	condIf.add(new Integer(CompiladorConstants.NUMERO));
    	condIf.add(new Integer(CompiladorConstants.ENTAO));
    	
    	condElse.add(new Integer(CompiladorConstants.ABREBLOCOND));
    	
    	repWhile.add(new Integer(CompiladorConstants.ID));
    	repWhile.add(new Integer(CompiladorConstants.NUMERO));
    	repWhile.add(new Integer(CompiladorConstants.ABREBLOCOND));
    	
    	repFor.add(new Integer(CompiladorConstants.ID));
    	
    	entao.add(new Integer(CompiladorConstants.ABREBLOCOND));
    	
    	mais.add(new Integer(CompiladorConstants.ID));
    	mais.add(new Integer(CompiladorConstants.NUMERO));
    	
    	menos.add(new Integer(CompiladorConstants.ID));
    	menos.add(new Integer(CompiladorConstants.NUMERO));
    	
    	multi.add(new Integer(CompiladorConstants.ID));
    	multi.add(new Integer(CompiladorConstants.NUMERO));
    	
    	div.add(new Integer(CompiladorConstants.ID));
    	div.add(new Integer(CompiladorConstants.NUMERO));
    	
    	tipoComparacao.add(new Integer(CompiladorConstants.ID));
    	tipoComparacao.add(new Integer(CompiladorConstants.NUMERO));
    	
    	maior.add(new Integer(CompiladorConstants.ID));
    	maior.add(new Integer(CompiladorConstants.NUMERO));
    	
    	menor.add(new Integer(CompiladorConstants.ID));
    	menor.add(new Integer(CompiladorConstants.NUMERO));
    	
    	menorIgual.add(new Integer(CompiladorConstants.ID));
    	menorIgual.add(new Integer(CompiladorConstants.NUMERO));
    	
    	maiorIgual.add(new Integer(CompiladorConstants.ID));
    	maiorIgual.add(new Integer(CompiladorConstants.NUMERO));
    	
    	diferente.add(new Integer(CompiladorConstants.ID));
    	diferente.add(new Integer(CompiladorConstants.NUMERO));
    	
    	igual.add(new Integer(CompiladorConstants.ID));
    	igual.add(new Integer(CompiladorConstants.NUMERO));
    	
    	atribui.add(new Integer(CompiladorConstants.NUMERO));
    	
    	inicioPrograma.add(new Integer(CompiladorConstants.ID));
    	
    	abreBloco.add(new Integer(CompiladorConstants.TIPOINTEIRO));
    	abreBloco.add(new Integer(CompiladorConstants.TIPOBOOL));    
    	abreBloco.add(new Integer(CompiladorConstants.TIPOSTRING));
    	abreBloco.add(new Integer(CompiladorConstants.ID));
    	abreBloco.add(new Integer(CompiladorConstants.CONDIF));
    	abreBloco.add(new Integer(CompiladorConstants.REPWHILE));
    	abreBloco.add(new Integer(CompiladorConstants.REPFOR));
    	abreBloco.add(new Integer(CompiladorConstants.FECHABLOCOND));
    	abreBloco.add(new Integer(CompiladorConstants.FIMBLOCO));
    	
    	fimBloco.add(new Integer(CompiladorConstants.EOF));
    	
    	abreBloCond.add(new Integer(CompiladorConstants.ID));
    	abreBloCond.add(new Integer(CompiladorConstants.CONDIF));
    	abreBloCond.add(new Integer(CompiladorConstants.REPWHILE));
    	abreBloCond.add(new Integer(CompiladorConstants.REPFOR));
    	abreBloCond.add(new Integer(CompiladorConstants.FECHABLOCOND));
    	
    	fechaBloCond.add(new Integer(CompiladorConstants.CONDELSE));
    	fechaBloCond.add(new Integer(CompiladorConstants.FIMBLOCO));
    	fechaBloCond.add(new Integer(CompiladorConstants.FECHABLOCOND));
    	
    	e.add(new Integer(CompiladorConstants.ID));
    	e.add(new Integer(CompiladorConstants.NUMERO));
    	
    	ou.add(new Integer(CompiladorConstants.ID));
    	ou.add(new Integer(CompiladorConstants.NUMERO));
    	
    	tipoDado.add(new Integer(CompiladorConstants.ID));
    	
    	tipoOperadorLogico.add(new Integer(CompiladorConstants.ID));
    	tipoOperadorLogico.add(new Integer(CompiladorConstants.NUMERO));
    	
    	corpo.add(new Integer(CompiladorConstants.FECHABLOCOND));
    	corpo.add(new Integer(CompiladorConstants.FIMBLOCO));
    	
    	input.add(new Integer(CompiladorConstants.MAIOR));
    	input.add(new Integer(CompiladorConstants.MENOR));
    	input.add(new Integer(CompiladorConstants.MENORIGUAL));
    	input.add(new Integer(CompiladorConstants.MAIORIGUAL));
    	input.add(new Integer(CompiladorConstants.DIFERENTE));
    	input.add(new Integer(CompiladorConstants.IGUAL));
    	input.add(new Integer(CompiladorConstants.MAIS));
    	input.add(new Integer(CompiladorConstants.MENOS));
    	input.add(new Integer(CompiladorConstants.MULTI));
    	input.add(new Integer(CompiladorConstants.DIV));
    	input.add(new Integer(CompiladorConstants.E));
    	input.add(new Integer(CompiladorConstants.OU));
    	
    	defineVariaveis.add(new Integer(CompiladorConstants.ID));
    	defineVariaveis.add(new Integer(CompiladorConstants.CONDIF));
    	defineVariaveis.add(new Integer(CompiladorConstants.REPWHILE));
    	defineVariaveis.add(new Integer(CompiladorConstants.REPFOR));
    	defineVariaveis.add(new Integer(CompiladorConstants.FECHABLOCOND));
    	defineVariaveis.add(new Integer(CompiladorConstants.FIMBLOCO));
    	
    	atribuicaoVar.add(new Integer(CompiladorConstants.FECHABLOCOND));
    	atribuicaoVar.add(new Integer(CompiladorConstants.FIMBLOCO));
    	atribuicaoVar.add(new Integer(CompiladorConstants.VIRGULA));
    	atribuicaoVar.add(new Integer(CompiladorConstants.ABREBLOCOND));
    	
    	cond.add(new Integer(CompiladorConstants.ENTAO));
    	cond.add(new Integer(CompiladorConstants.ABREBLOCOND));
    	
    }
}
