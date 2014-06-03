package utils.java.mysqlparser

import org.antlr.v4.runtime._
import org.antlr.v4.runtime.tree.ParseTree
import java.io.{ByteArrayInputStream, InputStream}

/**
 * Created by yamir on 5/13/14.
 */
abstract trait Callable {
  def message(m: String)
}

class MysqlErrorParser (expression: String) extends Callable {
  private var _err:String = null

  def message(message: String) = {
    _err = message
  }

  def err = this._err

  def parse(expr: String) {
    val is: InputStream = new ByteArrayInputStream(expr.getBytes)
    val input: ANTLRInputStream = new ANTLRInputStream(is)
    val lexer: MysqlLexer = new MysqlLexer(input)
    val tokens: CommonTokenStream = new CommonTokenStream(lexer)
    val parser: MysqlParser = new MysqlParser(tokens)
    val error: MysqlErrorListener = new MysqlErrorListener(this)
    lexer.addErrorListener(error)
    parser.addErrorListener(error)
    val tree: ParseTree = parser.parse
  }

  parse(expression)
}

object MysqlErrorParser {
  def apply(expression: String) = new MysqlErrorParser(expression);
}
