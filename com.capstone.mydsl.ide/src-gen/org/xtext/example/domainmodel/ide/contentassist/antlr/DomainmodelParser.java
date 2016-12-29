/*
 * generated by Xtext 2.10.0
 */
package org.xtext.example.domainmodel.ide.contentassist.antlr;

import com.google.inject.Inject;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.xtext.example.domainmodel.ide.contentassist.antlr.internal.InternalDomainmodelParser;
import org.xtext.example.domainmodel.services.DomainmodelGrammarAccess;

public class DomainmodelParser extends AbstractContentAssistParser {

	@Inject
	private DomainmodelGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalDomainmodelParser createParser() {
		InternalDomainmodelParser result = new InternalDomainmodelParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getMyDSLAccess().getAlternatives(), "rule__MyDSL__Alternatives");
					put(grammarAccess.getConditionOperationAccess().getAlternatives(), "rule__ConditionOperation__Alternatives");
					put(grammarAccess.getMathOperationAccess().getAlternatives(), "rule__MathOperation__Alternatives");
					put(grammarAccess.getCompareOperationAccess().getAlternatives(), "rule__CompareOperation__Alternatives");
					put(grammarAccess.getVariableAccess().getAlternatives(), "rule__Variable__Alternatives");
					put(grammarAccess.getCompareFormulaAccess().getAlternatives(), "rule__CompareFormula__Alternatives");
					put(grammarAccess.getMyIDAccess().getAlternatives_1(), "rule__MyID__Alternatives_1");
					put(grammarAccess.getTestcaseElementAccess().getAlternatives(), "rule__TestcaseElement__Alternatives");
					put(grammarAccess.getEnumAccess().getAlternatives_1(), "rule__Enum__Alternatives_1");
					put(grammarAccess.getDefineAccess().getAlternatives_4(), "rule__Define__Alternatives_4");
					put(grammarAccess.getDefineAccess().getAlternatives_6_2(), "rule__Define__Alternatives_6_2");
					put(grammarAccess.getDatatypeAccess().getAlternatives(), "rule__Datatype__Alternatives");
					put(grammarAccess.getMathFormulaAccess().getGroup(), "rule__MathFormula__Group__0");
					put(grammarAccess.getMathFormulaAccess().getGroup_2(), "rule__MathFormula__Group_2__0");
					put(grammarAccess.getCompareFormulaAccess().getGroup_0(), "rule__CompareFormula__Group_0__0");
					put(grammarAccess.getCompareFormulaAccess().getGroup_1(), "rule__CompareFormula__Group_1__0");
					put(grammarAccess.getMyIDAccess().getGroup(), "rule__MyID__Group__0");
					put(grammarAccess.getMyIDAccess().getGroup_1_1(), "rule__MyID__Group_1_1__0");
					put(grammarAccess.getEnumAccess().getGroup(), "rule__Enum__Group__0");
					put(grammarAccess.getDefineAccess().getGroup(), "rule__Define__Group__0");
					put(grammarAccess.getDefineAccess().getGroup_6(), "rule__Define__Group_6__0");
					put(grammarAccess.getPreconditionAccess().getGroup(), "rule__Precondition__Group__0");
					put(grammarAccess.getPreconditionAccess().getGroup_3(), "rule__Precondition__Group_3__0");
					put(grammarAccess.getTestConditionAccess().getGroup(), "rule__TestCondition__Group__0");
					put(grammarAccess.getTestConditionAccess().getGroup_1(), "rule__TestCondition__Group_1__0");
					put(grammarAccess.getTestConditionAccess().getGroup_1_4(), "rule__TestCondition__Group_1_4__0");
					put(grammarAccess.getTestcaseAccess().getGroup(), "rule__Testcase__Group__0");
					put(grammarAccess.getFunctionAccess().getGroup(), "rule__Function__Group__0");
					put(grammarAccess.getFunctionAccess().getGroup_3(), "rule__Function__Group_3__0");
					put(grammarAccess.getFunctionAccess().getGroup_3_2(), "rule__Function__Group_3_2__0");
					put(grammarAccess.getModelAccess().getMyDSLAssignment(), "rule__Model__MyDSLAssignment");
					put(grammarAccess.getDefineAccess().getNameAssignment_1(), "rule__Define__NameAssignment_1");
					put(grammarAccess.getFunctionAccess().getNameAssignment_1(), "rule__Function__NameAssignment_1");
					put(grammarAccess.getFunctionAccess().getNameAssignment_3_1(), "rule__Function__NameAssignment_3_1");
					put(grammarAccess.getFunctionAccess().getNameAssignment_3_2_2(), "rule__Function__NameAssignment_3_2_2");
				}
			};
		}
		return nameMappings.get(element);
	}

	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			InternalDomainmodelParser typedParser = (InternalDomainmodelParser) parser;
			typedParser.entryRuleModel();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public DomainmodelGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(DomainmodelGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
