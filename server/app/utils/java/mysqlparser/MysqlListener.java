// Generated from Mysql.g4 by ANTLR 4.2.2

    package utils.java.mysqlparser;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MysqlParser}.
 */
public interface MysqlListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MysqlParser#insert_stmt}.
	 * @param ctx the parse tree
	 */
	void enterInsert_stmt(@NotNull MysqlParser.Insert_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MysqlParser#insert_stmt}.
	 * @param ctx the parse tree
	 */
	void exitInsert_stmt(@NotNull MysqlParser.Insert_stmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link MysqlParser#sql_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSql_stmt(@NotNull MysqlParser.Sql_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MysqlParser#sql_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSql_stmt(@NotNull MysqlParser.Sql_stmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link MysqlParser#table_or_index_name}.
	 * @param ctx the parse tree
	 */
	void enterTable_or_index_name(@NotNull MysqlParser.Table_or_index_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MysqlParser#table_or_index_name}.
	 * @param ctx the parse tree
	 */
	void exitTable_or_index_name(@NotNull MysqlParser.Table_or_index_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link MysqlParser#compound_operator}.
	 * @param ctx the parse tree
	 */
	void enterCompound_operator(@NotNull MysqlParser.Compound_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MysqlParser#compound_operator}.
	 * @param ctx the parse tree
	 */
	void exitCompound_operator(@NotNull MysqlParser.Compound_operatorContext ctx);

	/**
	 * Enter a parse tree produced by {@link MysqlParser#indexed_column}.
	 * @param ctx the parse tree
	 */
	void enterIndexed_column(@NotNull MysqlParser.Indexed_columnContext ctx);
	/**
	 * Exit a parse tree produced by {@link MysqlParser#indexed_column}.
	 * @param ctx the parse tree
	 */
	void exitIndexed_column(@NotNull MysqlParser.Indexed_columnContext ctx);

	/**
	 * Enter a parse tree produced by {@link MysqlParser#create_index_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_index_stmt(@NotNull MysqlParser.Create_index_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MysqlParser#create_index_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_index_stmt(@NotNull MysqlParser.Create_index_stmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link MysqlParser#rollback_stmt}.
	 * @param ctx the parse tree
	 */
	void enterRollback_stmt(@NotNull MysqlParser.Rollback_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MysqlParser#rollback_stmt}.
	 * @param ctx the parse tree
	 */
	void exitRollback_stmt(@NotNull MysqlParser.Rollback_stmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link MysqlParser#column_name}.
	 * @param ctx the parse tree
	 */
	void enterColumn_name(@NotNull MysqlParser.Column_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MysqlParser#column_name}.
	 * @param ctx the parse tree
	 */
	void exitColumn_name(@NotNull MysqlParser.Column_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link MysqlParser#qualified_table_name}.
	 * @param ctx the parse tree
	 */
	void enterQualified_table_name(@NotNull MysqlParser.Qualified_table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MysqlParser#qualified_table_name}.
	 * @param ctx the parse tree
	 */
	void exitQualified_table_name(@NotNull MysqlParser.Qualified_table_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link MysqlParser#savepoint_name}.
	 * @param ctx the parse tree
	 */
	void enterSavepoint_name(@NotNull MysqlParser.Savepoint_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MysqlParser#savepoint_name}.
	 * @param ctx the parse tree
	 */
	void exitSavepoint_name(@NotNull MysqlParser.Savepoint_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link MysqlParser#result_column}.
	 * @param ctx the parse tree
	 */
	void enterResult_column(@NotNull MysqlParser.Result_columnContext ctx);
	/**
	 * Exit a parse tree produced by {@link MysqlParser#result_column}.
	 * @param ctx the parse tree
	 */
	void exitResult_column(@NotNull MysqlParser.Result_columnContext ctx);

	/**
	 * Enter a parse tree produced by {@link MysqlParser#error_message}.
	 * @param ctx the parse tree
	 */
	void enterError_message(@NotNull MysqlParser.Error_messageContext ctx);
	/**
	 * Exit a parse tree produced by {@link MysqlParser#error_message}.
	 * @param ctx the parse tree
	 */
	void exitError_message(@NotNull MysqlParser.Error_messageContext ctx);

	/**
	 * Enter a parse tree produced by {@link MysqlParser#select_core}.
	 * @param ctx the parse tree
	 */
	void enterSelect_core(@NotNull MysqlParser.Select_coreContext ctx);
	/**
	 * Exit a parse tree produced by {@link MysqlParser#select_core}.
	 * @param ctx the parse tree
	 */
	void exitSelect_core(@NotNull MysqlParser.Select_coreContext ctx);

	/**
	 * Enter a parse tree produced by {@link MysqlParser#create_trigger_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_trigger_stmt(@NotNull MysqlParser.Create_trigger_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MysqlParser#create_trigger_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_trigger_stmt(@NotNull MysqlParser.Create_trigger_stmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link MysqlParser#function_name}.
	 * @param ctx the parse tree
	 */
	void enterFunction_name(@NotNull MysqlParser.Function_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MysqlParser#function_name}.
	 * @param ctx the parse tree
	 */
	void exitFunction_name(@NotNull MysqlParser.Function_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link MysqlParser#sql_stmt_list}.
	 * @param ctx the parse tree
	 */
	void enterSql_stmt_list(@NotNull MysqlParser.Sql_stmt_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link MysqlParser#sql_stmt_list}.
	 * @param ctx the parse tree
	 */
	void exitSql_stmt_list(@NotNull MysqlParser.Sql_stmt_listContext ctx);

	/**
	 * Enter a parse tree produced by {@link MysqlParser#drop_table_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDrop_table_stmt(@NotNull MysqlParser.Drop_table_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MysqlParser#drop_table_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDrop_table_stmt(@NotNull MysqlParser.Drop_table_stmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link MysqlParser#any_name}.
	 * @param ctx the parse tree
	 */
	void enterAny_name(@NotNull MysqlParser.Any_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MysqlParser#any_name}.
	 * @param ctx the parse tree
	 */
	void exitAny_name(@NotNull MysqlParser.Any_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link MysqlParser#database_name}.
	 * @param ctx the parse tree
	 */
	void enterDatabase_name(@NotNull MysqlParser.Database_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MysqlParser#database_name}.
	 * @param ctx the parse tree
	 */
	void exitDatabase_name(@NotNull MysqlParser.Database_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link MysqlParser#module_argument}.
	 * @param ctx the parse tree
	 */
	void enterModule_argument(@NotNull MysqlParser.Module_argumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link MysqlParser#module_argument}.
	 * @param ctx the parse tree
	 */
	void exitModule_argument(@NotNull MysqlParser.Module_argumentContext ctx);

	/**
	 * Enter a parse tree produced by {@link MysqlParser#join_operator}.
	 * @param ctx the parse tree
	 */
	void enterJoin_operator(@NotNull MysqlParser.Join_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MysqlParser#join_operator}.
	 * @param ctx the parse tree
	 */
	void exitJoin_operator(@NotNull MysqlParser.Join_operatorContext ctx);

	/**
	 * Enter a parse tree produced by {@link MysqlParser#vacuum_stmt}.
	 * @param ctx the parse tree
	 */
	void enterVacuum_stmt(@NotNull MysqlParser.Vacuum_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MysqlParser#vacuum_stmt}.
	 * @param ctx the parse tree
	 */
	void exitVacuum_stmt(@NotNull MysqlParser.Vacuum_stmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link MysqlParser#factored_select_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFactored_select_stmt(@NotNull MysqlParser.Factored_select_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MysqlParser#factored_select_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFactored_select_stmt(@NotNull MysqlParser.Factored_select_stmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link MysqlParser#transaction_name}.
	 * @param ctx the parse tree
	 */
	void enterTransaction_name(@NotNull MysqlParser.Transaction_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MysqlParser#transaction_name}.
	 * @param ctx the parse tree
	 */
	void exitTransaction_name(@NotNull MysqlParser.Transaction_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link MysqlParser#cte_table_name}.
	 * @param ctx the parse tree
	 */
	void enterCte_table_name(@NotNull MysqlParser.Cte_table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MysqlParser#cte_table_name}.
	 * @param ctx the parse tree
	 */
	void exitCte_table_name(@NotNull MysqlParser.Cte_table_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link MysqlParser#unary_operator}.
	 * @param ctx the parse tree
	 */
	void enterUnary_operator(@NotNull MysqlParser.Unary_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MysqlParser#unary_operator}.
	 * @param ctx the parse tree
	 */
	void exitUnary_operator(@NotNull MysqlParser.Unary_operatorContext ctx);

	/**
	 * Enter a parse tree produced by {@link MysqlParser#common_table_expression}.
	 * @param ctx the parse tree
	 */
	void enterCommon_table_expression(@NotNull MysqlParser.Common_table_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MysqlParser#common_table_expression}.
	 * @param ctx the parse tree
	 */
	void exitCommon_table_expression(@NotNull MysqlParser.Common_table_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link MysqlParser#drop_trigger_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDrop_trigger_stmt(@NotNull MysqlParser.Drop_trigger_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MysqlParser#drop_trigger_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDrop_trigger_stmt(@NotNull MysqlParser.Drop_trigger_stmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link MysqlParser#new_table_name}.
	 * @param ctx the parse tree
	 */
	void enterNew_table_name(@NotNull MysqlParser.New_table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MysqlParser#new_table_name}.
	 * @param ctx the parse tree
	 */
	void exitNew_table_name(@NotNull MysqlParser.New_table_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link MysqlParser#type_name}.
	 * @param ctx the parse tree
	 */
	void enterType_name(@NotNull MysqlParser.Type_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MysqlParser#type_name}.
	 * @param ctx the parse tree
	 */
	void exitType_name(@NotNull MysqlParser.Type_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link MysqlParser#table_alias}.
	 * @param ctx the parse tree
	 */
	void enterTable_alias(@NotNull MysqlParser.Table_aliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link MysqlParser#table_alias}.
	 * @param ctx the parse tree
	 */
	void exitTable_alias(@NotNull MysqlParser.Table_aliasContext ctx);

	/**
	 * Enter a parse tree produced by {@link MysqlParser#module_name}.
	 * @param ctx the parse tree
	 */
	void enterModule_name(@NotNull MysqlParser.Module_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MysqlParser#module_name}.
	 * @param ctx the parse tree
	 */
	void exitModule_name(@NotNull MysqlParser.Module_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link MysqlParser#commit_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCommit_stmt(@NotNull MysqlParser.Commit_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MysqlParser#commit_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCommit_stmt(@NotNull MysqlParser.Commit_stmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link MysqlParser#trigger_name}.
	 * @param ctx the parse tree
	 */
	void enterTrigger_name(@NotNull MysqlParser.Trigger_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MysqlParser#trigger_name}.
	 * @param ctx the parse tree
	 */
	void exitTrigger_name(@NotNull MysqlParser.Trigger_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link MysqlParser#create_table_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_stmt(@NotNull MysqlParser.Create_table_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MysqlParser#create_table_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_stmt(@NotNull MysqlParser.Create_table_stmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link MysqlParser#pragma_value}.
	 * @param ctx the parse tree
	 */
	void enterPragma_value(@NotNull MysqlParser.Pragma_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link MysqlParser#pragma_value}.
	 * @param ctx the parse tree
	 */
	void exitPragma_value(@NotNull MysqlParser.Pragma_valueContext ctx);

	/**
	 * Enter a parse tree produced by {@link MysqlParser#column_constraint}.
	 * @param ctx the parse tree
	 */
	void enterColumn_constraint(@NotNull MysqlParser.Column_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link MysqlParser#column_constraint}.
	 * @param ctx the parse tree
	 */
	void exitColumn_constraint(@NotNull MysqlParser.Column_constraintContext ctx);

	/**
	 * Enter a parse tree produced by {@link MysqlParser#savepoint_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSavepoint_stmt(@NotNull MysqlParser.Savepoint_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MysqlParser#savepoint_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSavepoint_stmt(@NotNull MysqlParser.Savepoint_stmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link MysqlParser#detach_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDetach_stmt(@NotNull MysqlParser.Detach_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MysqlParser#detach_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDetach_stmt(@NotNull MysqlParser.Detach_stmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link MysqlParser#column_def}.
	 * @param ctx the parse tree
	 */
	void enterColumn_def(@NotNull MysqlParser.Column_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link MysqlParser#column_def}.
	 * @param ctx the parse tree
	 */
	void exitColumn_def(@NotNull MysqlParser.Column_defContext ctx);

	/**
	 * Enter a parse tree produced by {@link MysqlParser#table_constraint}.
	 * @param ctx the parse tree
	 */
	void enterTable_constraint(@NotNull MysqlParser.Table_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link MysqlParser#table_constraint}.
	 * @param ctx the parse tree
	 */
	void exitTable_constraint(@NotNull MysqlParser.Table_constraintContext ctx);

	/**
	 * Enter a parse tree produced by {@link MysqlParser#column_alias}.
	 * @param ctx the parse tree
	 */
	void enterColumn_alias(@NotNull MysqlParser.Column_aliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link MysqlParser#column_alias}.
	 * @param ctx the parse tree
	 */
	void exitColumn_alias(@NotNull MysqlParser.Column_aliasContext ctx);

	/**
	 * Enter a parse tree produced by {@link MysqlParser#delete_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDelete_stmt(@NotNull MysqlParser.Delete_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MysqlParser#delete_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDelete_stmt(@NotNull MysqlParser.Delete_stmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link MysqlParser#release_stmt}.
	 * @param ctx the parse tree
	 */
	void enterRelease_stmt(@NotNull MysqlParser.Release_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MysqlParser#release_stmt}.
	 * @param ctx the parse tree
	 */
	void exitRelease_stmt(@NotNull MysqlParser.Release_stmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link MysqlParser#foreign_table}.
	 * @param ctx the parse tree
	 */
	void enterForeign_table(@NotNull MysqlParser.Foreign_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link MysqlParser#foreign_table}.
	 * @param ctx the parse tree
	 */
	void exitForeign_table(@NotNull MysqlParser.Foreign_tableContext ctx);

	/**
	 * Enter a parse tree produced by {@link MysqlParser#create_view_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_view_stmt(@NotNull MysqlParser.Create_view_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MysqlParser#create_view_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_view_stmt(@NotNull MysqlParser.Create_view_stmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link MysqlParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(@NotNull MysqlParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MysqlParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(@NotNull MysqlParser.ExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link MysqlParser#signed_number}.
	 * @param ctx the parse tree
	 */
	void enterSigned_number(@NotNull MysqlParser.Signed_numberContext ctx);
	/**
	 * Exit a parse tree produced by {@link MysqlParser#signed_number}.
	 * @param ctx the parse tree
	 */
	void exitSigned_number(@NotNull MysqlParser.Signed_numberContext ctx);

	/**
	 * Enter a parse tree produced by {@link MysqlParser#delete_stmt_limited}.
	 * @param ctx the parse tree
	 */
	void enterDelete_stmt_limited(@NotNull MysqlParser.Delete_stmt_limitedContext ctx);
	/**
	 * Exit a parse tree produced by {@link MysqlParser#delete_stmt_limited}.
	 * @param ctx the parse tree
	 */
	void exitDelete_stmt_limited(@NotNull MysqlParser.Delete_stmt_limitedContext ctx);

	/**
	 * Enter a parse tree produced by {@link MysqlParser#index_name}.
	 * @param ctx the parse tree
	 */
	void enterIndex_name(@NotNull MysqlParser.Index_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MysqlParser#index_name}.
	 * @param ctx the parse tree
	 */
	void exitIndex_name(@NotNull MysqlParser.Index_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link MysqlParser#select_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSelect_stmt(@NotNull MysqlParser.Select_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MysqlParser#select_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSelect_stmt(@NotNull MysqlParser.Select_stmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link MysqlParser#create_virtual_table_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_virtual_table_stmt(@NotNull MysqlParser.Create_virtual_table_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MysqlParser#create_virtual_table_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_virtual_table_stmt(@NotNull MysqlParser.Create_virtual_table_stmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link MysqlParser#alter_table_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAlter_table_stmt(@NotNull MysqlParser.Alter_table_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MysqlParser#alter_table_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAlter_table_stmt(@NotNull MysqlParser.Alter_table_stmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link MysqlParser#attach_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAttach_stmt(@NotNull MysqlParser.Attach_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MysqlParser#attach_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAttach_stmt(@NotNull MysqlParser.Attach_stmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link MysqlParser#pragma_stmt}.
	 * @param ctx the parse tree
	 */
	void enterPragma_stmt(@NotNull MysqlParser.Pragma_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MysqlParser#pragma_stmt}.
	 * @param ctx the parse tree
	 */
	void exitPragma_stmt(@NotNull MysqlParser.Pragma_stmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link MysqlParser#table_name}.
	 * @param ctx the parse tree
	 */
	void enterTable_name(@NotNull MysqlParser.Table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MysqlParser#table_name}.
	 * @param ctx the parse tree
	 */
	void exitTable_name(@NotNull MysqlParser.Table_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link MysqlParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(@NotNull MysqlParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MysqlParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(@NotNull MysqlParser.NameContext ctx);

	/**
	 * Enter a parse tree produced by {@link MysqlParser#join_constraint}.
	 * @param ctx the parse tree
	 */
	void enterJoin_constraint(@NotNull MysqlParser.Join_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link MysqlParser#join_constraint}.
	 * @param ctx the parse tree
	 */
	void exitJoin_constraint(@NotNull MysqlParser.Join_constraintContext ctx);

	/**
	 * Enter a parse tree produced by {@link MysqlParser#reindex_stmt}.
	 * @param ctx the parse tree
	 */
	void enterReindex_stmt(@NotNull MysqlParser.Reindex_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MysqlParser#reindex_stmt}.
	 * @param ctx the parse tree
	 */
	void exitReindex_stmt(@NotNull MysqlParser.Reindex_stmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link MysqlParser#parse}.
	 * @param ctx the parse tree
	 */
	void enterParse(@NotNull MysqlParser.ParseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MysqlParser#parse}.
	 * @param ctx the parse tree
	 */
	void exitParse(@NotNull MysqlParser.ParseContext ctx);

	/**
	 * Enter a parse tree produced by {@link MysqlParser#begin_stmt}.
	 * @param ctx the parse tree
	 */
	void enterBegin_stmt(@NotNull MysqlParser.Begin_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MysqlParser#begin_stmt}.
	 * @param ctx the parse tree
	 */
	void exitBegin_stmt(@NotNull MysqlParser.Begin_stmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link MysqlParser#table_or_subquery}.
	 * @param ctx the parse tree
	 */
	void enterTable_or_subquery(@NotNull MysqlParser.Table_or_subqueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link MysqlParser#table_or_subquery}.
	 * @param ctx the parse tree
	 */
	void exitTable_or_subquery(@NotNull MysqlParser.Table_or_subqueryContext ctx);

	/**
	 * Enter a parse tree produced by {@link MysqlParser#error}.
	 * @param ctx the parse tree
	 */
	void enterError(@NotNull MysqlParser.ErrorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MysqlParser#error}.
	 * @param ctx the parse tree
	 */
	void exitError(@NotNull MysqlParser.ErrorContext ctx);

	/**
	 * Enter a parse tree produced by {@link MysqlParser#ordering_term}.
	 * @param ctx the parse tree
	 */
	void enterOrdering_term(@NotNull MysqlParser.Ordering_termContext ctx);
	/**
	 * Exit a parse tree produced by {@link MysqlParser#ordering_term}.
	 * @param ctx the parse tree
	 */
	void exitOrdering_term(@NotNull MysqlParser.Ordering_termContext ctx);

	/**
	 * Enter a parse tree produced by {@link MysqlParser#keyword}.
	 * @param ctx the parse tree
	 */
	void enterKeyword(@NotNull MysqlParser.KeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link MysqlParser#keyword}.
	 * @param ctx the parse tree
	 */
	void exitKeyword(@NotNull MysqlParser.KeywordContext ctx);

	/**
	 * Enter a parse tree produced by {@link MysqlParser#with_clause}.
	 * @param ctx the parse tree
	 */
	void enterWith_clause(@NotNull MysqlParser.With_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MysqlParser#with_clause}.
	 * @param ctx the parse tree
	 */
	void exitWith_clause(@NotNull MysqlParser.With_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link MysqlParser#pragma_name}.
	 * @param ctx the parse tree
	 */
	void enterPragma_name(@NotNull MysqlParser.Pragma_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MysqlParser#pragma_name}.
	 * @param ctx the parse tree
	 */
	void exitPragma_name(@NotNull MysqlParser.Pragma_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link MysqlParser#select_or_values}.
	 * @param ctx the parse tree
	 */
	void enterSelect_or_values(@NotNull MysqlParser.Select_or_valuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link MysqlParser#select_or_values}.
	 * @param ctx the parse tree
	 */
	void exitSelect_or_values(@NotNull MysqlParser.Select_or_valuesContext ctx);

	/**
	 * Enter a parse tree produced by {@link MysqlParser#simple_select_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSimple_select_stmt(@NotNull MysqlParser.Simple_select_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MysqlParser#simple_select_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSimple_select_stmt(@NotNull MysqlParser.Simple_select_stmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link MysqlParser#view_name}.
	 * @param ctx the parse tree
	 */
	void enterView_name(@NotNull MysqlParser.View_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MysqlParser#view_name}.
	 * @param ctx the parse tree
	 */
	void exitView_name(@NotNull MysqlParser.View_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link MysqlParser#join_clause}.
	 * @param ctx the parse tree
	 */
	void enterJoin_clause(@NotNull MysqlParser.Join_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MysqlParser#join_clause}.
	 * @param ctx the parse tree
	 */
	void exitJoin_clause(@NotNull MysqlParser.Join_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link MysqlParser#foreign_key_clause}.
	 * @param ctx the parse tree
	 */
	void enterForeign_key_clause(@NotNull MysqlParser.Foreign_key_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MysqlParser#foreign_key_clause}.
	 * @param ctx the parse tree
	 */
	void exitForeign_key_clause(@NotNull MysqlParser.Foreign_key_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link MysqlParser#literal_value}.
	 * @param ctx the parse tree
	 */
	void enterLiteral_value(@NotNull MysqlParser.Literal_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link MysqlParser#literal_value}.
	 * @param ctx the parse tree
	 */
	void exitLiteral_value(@NotNull MysqlParser.Literal_valueContext ctx);

	/**
	 * Enter a parse tree produced by {@link MysqlParser#drop_index_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDrop_index_stmt(@NotNull MysqlParser.Drop_index_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MysqlParser#drop_index_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDrop_index_stmt(@NotNull MysqlParser.Drop_index_stmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link MysqlParser#compound_select_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCompound_select_stmt(@NotNull MysqlParser.Compound_select_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MysqlParser#compound_select_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCompound_select_stmt(@NotNull MysqlParser.Compound_select_stmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link MysqlParser#update_stmt_limited}.
	 * @param ctx the parse tree
	 */
	void enterUpdate_stmt_limited(@NotNull MysqlParser.Update_stmt_limitedContext ctx);
	/**
	 * Exit a parse tree produced by {@link MysqlParser#update_stmt_limited}.
	 * @param ctx the parse tree
	 */
	void exitUpdate_stmt_limited(@NotNull MysqlParser.Update_stmt_limitedContext ctx);

	/**
	 * Enter a parse tree produced by {@link MysqlParser#collation_name}.
	 * @param ctx the parse tree
	 */
	void enterCollation_name(@NotNull MysqlParser.Collation_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MysqlParser#collation_name}.
	 * @param ctx the parse tree
	 */
	void exitCollation_name(@NotNull MysqlParser.Collation_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link MysqlParser#update_stmt}.
	 * @param ctx the parse tree
	 */
	void enterUpdate_stmt(@NotNull MysqlParser.Update_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MysqlParser#update_stmt}.
	 * @param ctx the parse tree
	 */
	void exitUpdate_stmt(@NotNull MysqlParser.Update_stmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link MysqlParser#drop_view_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDrop_view_stmt(@NotNull MysqlParser.Drop_view_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MysqlParser#drop_view_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDrop_view_stmt(@NotNull MysqlParser.Drop_view_stmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link MysqlParser#raise_function}.
	 * @param ctx the parse tree
	 */
	void enterRaise_function(@NotNull MysqlParser.Raise_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MysqlParser#raise_function}.
	 * @param ctx the parse tree
	 */
	void exitRaise_function(@NotNull MysqlParser.Raise_functionContext ctx);

	/**
	 * Enter a parse tree produced by {@link MysqlParser#conflict_clause}.
	 * @param ctx the parse tree
	 */
	void enterConflict_clause(@NotNull MysqlParser.Conflict_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MysqlParser#conflict_clause}.
	 * @param ctx the parse tree
	 */
	void exitConflict_clause(@NotNull MysqlParser.Conflict_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link MysqlParser#analyze_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAnalyze_stmt(@NotNull MysqlParser.Analyze_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MysqlParser#analyze_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAnalyze_stmt(@NotNull MysqlParser.Analyze_stmtContext ctx);
}