/*
 * generated by Xtext 2.29.0
 */
package org.xtext.ipsl.calcul.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.xtext.ipsl.calcul.ide.contentassist.antlr.internal.InternalCalculParser;
import org.xtext.ipsl.calcul.services.CalculGrammarAccess;

public class CalculParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(CalculGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, CalculGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getRETOURAccess().getAlternatives(), "rule__RETOUR__Alternatives");
			builder.put(grammarAccess.getSTATISTIQUEAccess().getGroup(), "rule__STATISTIQUE__Group__0");
			builder.put(grammarAccess.getMODALITEAccess().getGroup(), "rule__MODALITE__Group__0");
			builder.put(grammarAccess.getMODALITEAccess().getGroup_2(), "rule__MODALITE__Group_2__0");
			builder.put(grammarAccess.getEFFECTIFAccess().getGroup(), "rule__EFFECTIF__Group__0");
			builder.put(grammarAccess.getEFFECTIFAccess().getGroup_2(), "rule__EFFECTIF__Group_2__0");
			builder.put(grammarAccess.getCALCULAccess().getOperationAssignment(), "rule__CALCUL__OperationAssignment");
			builder.put(grammarAccess.getSTATISTIQUEAccess().getNomAssignment_1(), "rule__STATISTIQUE__NomAssignment_1");
			builder.put(grammarAccess.getSTATISTIQUEAccess().getDebutAssignment_2(), "rule__STATISTIQUE__DebutAssignment_2");
			builder.put(grammarAccess.getSTATISTIQUEAccess().getModaliteAssignment_4(), "rule__STATISTIQUE__ModaliteAssignment_4");
			builder.put(grammarAccess.getSTATISTIQUEAccess().getEffectifAssignment_6(), "rule__STATISTIQUE__EffectifAssignment_6");
			builder.put(grammarAccess.getSTATISTIQUEAccess().getResultatAssignment_8(), "rule__STATISTIQUE__ResultatAssignment_8");
			builder.put(grammarAccess.getSTATISTIQUEAccess().getEndAssignment_10(), "rule__STATISTIQUE__EndAssignment_10");
			builder.put(grammarAccess.getMODALITEAccess().getValuesAssignment_1(), "rule__MODALITE__ValuesAssignment_1");
			builder.put(grammarAccess.getMODALITEAccess().getValuesAssignment_2_1(), "rule__MODALITE__ValuesAssignment_2_1");
			builder.put(grammarAccess.getEFFECTIFAccess().getValuesAssignment_1(), "rule__EFFECTIF__ValuesAssignment_1");
			builder.put(grammarAccess.getEFFECTIFAccess().getValuesAssignment_2_1(), "rule__EFFECTIF__ValuesAssignment_2_1");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private CalculGrammarAccess grammarAccess;

	@Override
	protected InternalCalculParser createParser() {
		InternalCalculParser result = new InternalCalculParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public CalculGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(CalculGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
