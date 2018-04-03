// Generated from AMZ_synt.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AMZ_syntParser}.
 */
public interface AMZ_syntListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AMZ_syntParser#eval}.
	 * @param ctx the parse tree
	 */
	void enterEval(AMZ_syntParser.EvalContext ctx);
	/**
	 * Exit a parse tree produced by {@link AMZ_syntParser#eval}.
	 * @param ctx the parse tree
	 */
	void exitEval(AMZ_syntParser.EvalContext ctx);
	/**
	 * Enter a parse tree produced by {@link AMZ_syntParser#import_file}.
	 * @param ctx the parse tree
	 */
	void enterImport_file(AMZ_syntParser.Import_fileContext ctx);
	/**
	 * Exit a parse tree produced by {@link AMZ_syntParser#import_file}.
	 * @param ctx the parse tree
	 */
	void exitImport_file(AMZ_syntParser.Import_fileContext ctx);
	/**
	 * Enter a parse tree produced by {@link AMZ_syntParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(AMZ_syntParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AMZ_syntParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(AMZ_syntParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AMZ_syntParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(AMZ_syntParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AMZ_syntParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(AMZ_syntParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AMZ_syntParser#id_optional_array}.
	 * @param ctx the parse tree
	 */
	void enterId_optional_array(AMZ_syntParser.Id_optional_arrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link AMZ_syntParser#id_optional_array}.
	 * @param ctx the parse tree
	 */
	void exitId_optional_array(AMZ_syntParser.Id_optional_arrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link AMZ_syntParser#array_position}.
	 * @param ctx the parse tree
	 */
	void enterArray_position(AMZ_syntParser.Array_positionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AMZ_syntParser#array_position}.
	 * @param ctx the parse tree
	 */
	void exitArray_position(AMZ_syntParser.Array_positionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AMZ_syntParser#unary_operator}.
	 * @param ctx the parse tree
	 */
	void enterUnary_operator(AMZ_syntParser.Unary_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link AMZ_syntParser#unary_operator}.
	 * @param ctx the parse tree
	 */
	void exitUnary_operator(AMZ_syntParser.Unary_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link AMZ_syntParser#arithmetic_binary_op_higher_prec}.
	 * @param ctx the parse tree
	 */
	void enterArithmetic_binary_op_higher_prec(AMZ_syntParser.Arithmetic_binary_op_higher_precContext ctx);
	/**
	 * Exit a parse tree produced by {@link AMZ_syntParser#arithmetic_binary_op_higher_prec}.
	 * @param ctx the parse tree
	 */
	void exitArithmetic_binary_op_higher_prec(AMZ_syntParser.Arithmetic_binary_op_higher_precContext ctx);
	/**
	 * Enter a parse tree produced by {@link AMZ_syntParser#arithmetic_binary_op_lower_prec}.
	 * @param ctx the parse tree
	 */
	void enterArithmetic_binary_op_lower_prec(AMZ_syntParser.Arithmetic_binary_op_lower_precContext ctx);
	/**
	 * Exit a parse tree produced by {@link AMZ_syntParser#arithmetic_binary_op_lower_prec}.
	 * @param ctx the parse tree
	 */
	void exitArithmetic_binary_op_lower_prec(AMZ_syntParser.Arithmetic_binary_op_lower_precContext ctx);
	/**
	 * Enter a parse tree produced by {@link AMZ_syntParser#comparison_op_higher_prec}.
	 * @param ctx the parse tree
	 */
	void enterComparison_op_higher_prec(AMZ_syntParser.Comparison_op_higher_precContext ctx);
	/**
	 * Exit a parse tree produced by {@link AMZ_syntParser#comparison_op_higher_prec}.
	 * @param ctx the parse tree
	 */
	void exitComparison_op_higher_prec(AMZ_syntParser.Comparison_op_higher_precContext ctx);
	/**
	 * Enter a parse tree produced by {@link AMZ_syntParser#comparison_op_lower_prec}.
	 * @param ctx the parse tree
	 */
	void enterComparison_op_lower_prec(AMZ_syntParser.Comparison_op_lower_precContext ctx);
	/**
	 * Exit a parse tree produced by {@link AMZ_syntParser#comparison_op_lower_prec}.
	 * @param ctx the parse tree
	 */
	void exitComparison_op_lower_prec(AMZ_syntParser.Comparison_op_lower_precContext ctx);
	/**
	 * Enter a parse tree produced by {@link AMZ_syntParser#logic_binary_op_higher_prec}.
	 * @param ctx the parse tree
	 */
	void enterLogic_binary_op_higher_prec(AMZ_syntParser.Logic_binary_op_higher_precContext ctx);
	/**
	 * Exit a parse tree produced by {@link AMZ_syntParser#logic_binary_op_higher_prec}.
	 * @param ctx the parse tree
	 */
	void exitLogic_binary_op_higher_prec(AMZ_syntParser.Logic_binary_op_higher_precContext ctx);
	/**
	 * Enter a parse tree produced by {@link AMZ_syntParser#logic_binary_op_lower_prec}.
	 * @param ctx the parse tree
	 */
	void enterLogic_binary_op_lower_prec(AMZ_syntParser.Logic_binary_op_lower_precContext ctx);
	/**
	 * Exit a parse tree produced by {@link AMZ_syntParser#logic_binary_op_lower_prec}.
	 * @param ctx the parse tree
	 */
	void exitLogic_binary_op_lower_prec(AMZ_syntParser.Logic_binary_op_lower_precContext ctx);
	/**
	 * Enter a parse tree produced by {@link AMZ_syntParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(AMZ_syntParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AMZ_syntParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(AMZ_syntParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AMZ_syntParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(AMZ_syntParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link AMZ_syntParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(AMZ_syntParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link AMZ_syntParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call(AMZ_syntParser.Function_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link AMZ_syntParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call(AMZ_syntParser.Function_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link AMZ_syntParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(AMZ_syntParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link AMZ_syntParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(AMZ_syntParser.ArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link AMZ_syntParser#object_literal}.
	 * @param ctx the parse tree
	 */
	void enterObject_literal(AMZ_syntParser.Object_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link AMZ_syntParser#object_literal}.
	 * @param ctx the parse tree
	 */
	void exitObject_literal(AMZ_syntParser.Object_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link AMZ_syntParser#object_element}.
	 * @param ctx the parse tree
	 */
	void enterObject_element(AMZ_syntParser.Object_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AMZ_syntParser#object_element}.
	 * @param ctx the parse tree
	 */
	void exitObject_element(AMZ_syntParser.Object_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AMZ_syntParser#array_literal}.
	 * @param ctx the parse tree
	 */
	void enterArray_literal(AMZ_syntParser.Array_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link AMZ_syntParser#array_literal}.
	 * @param ctx the parse tree
	 */
	void exitArray_literal(AMZ_syntParser.Array_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link AMZ_syntParser#command}.
	 * @param ctx the parse tree
	 */
	void enterCommand(AMZ_syntParser.CommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link AMZ_syntParser#command}.
	 * @param ctx the parse tree
	 */
	void exitCommand(AMZ_syntParser.CommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link AMZ_syntParser#simple_command}.
	 * @param ctx the parse tree
	 */
	void enterSimple_command(AMZ_syntParser.Simple_commandContext ctx);
	/**
	 * Exit a parse tree produced by {@link AMZ_syntParser#simple_command}.
	 * @param ctx the parse tree
	 */
	void exitSimple_command(AMZ_syntParser.Simple_commandContext ctx);
	/**
	 * Enter a parse tree produced by {@link AMZ_syntParser#block_command}.
	 * @param ctx the parse tree
	 */
	void enterBlock_command(AMZ_syntParser.Block_commandContext ctx);
	/**
	 * Exit a parse tree produced by {@link AMZ_syntParser#block_command}.
	 * @param ctx the parse tree
	 */
	void exitBlock_command(AMZ_syntParser.Block_commandContext ctx);
	/**
	 * Enter a parse tree produced by {@link AMZ_syntParser#command_block}.
	 * @param ctx the parse tree
	 */
	void enterCommand_block(AMZ_syntParser.Command_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link AMZ_syntParser#command_block}.
	 * @param ctx the parse tree
	 */
	void exitCommand_block(AMZ_syntParser.Command_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link AMZ_syntParser#while_block}.
	 * @param ctx the parse tree
	 */
	void enterWhile_block(AMZ_syntParser.While_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link AMZ_syntParser#while_block}.
	 * @param ctx the parse tree
	 */
	void exitWhile_block(AMZ_syntParser.While_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link AMZ_syntParser#for_block}.
	 * @param ctx the parse tree
	 */
	void enterFor_block(AMZ_syntParser.For_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link AMZ_syntParser#for_block}.
	 * @param ctx the parse tree
	 */
	void exitFor_block(AMZ_syntParser.For_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link AMZ_syntParser#if_block}.
	 * @param ctx the parse tree
	 */
	void enterIf_block(AMZ_syntParser.If_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link AMZ_syntParser#if_block}.
	 * @param ctx the parse tree
	 */
	void exitIf_block(AMZ_syntParser.If_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link AMZ_syntParser#switch_block}.
	 * @param ctx the parse tree
	 */
	void enterSwitch_block(AMZ_syntParser.Switch_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link AMZ_syntParser#switch_block}.
	 * @param ctx the parse tree
	 */
	void exitSwitch_block(AMZ_syntParser.Switch_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link AMZ_syntParser#case_block}.
	 * @param ctx the parse tree
	 */
	void enterCase_block(AMZ_syntParser.Case_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link AMZ_syntParser#case_block}.
	 * @param ctx the parse tree
	 */
	void exitCase_block(AMZ_syntParser.Case_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link AMZ_syntParser#default_block}.
	 * @param ctx the parse tree
	 */
	void enterDefault_block(AMZ_syntParser.Default_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link AMZ_syntParser#default_block}.
	 * @param ctx the parse tree
	 */
	void exitDefault_block(AMZ_syntParser.Default_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link AMZ_syntParser#function_block}.
	 * @param ctx the parse tree
	 */
	void enterFunction_block(AMZ_syntParser.Function_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link AMZ_syntParser#function_block}.
	 * @param ctx the parse tree
	 */
	void exitFunction_block(AMZ_syntParser.Function_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link AMZ_syntParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(AMZ_syntParser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link AMZ_syntParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(AMZ_syntParser.ParametersContext ctx);
}