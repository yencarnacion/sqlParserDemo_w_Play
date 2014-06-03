package controllers

import play.api._
import play.api.mvc._
import utils.java.mysqlparser.MysqlErrorParser

/**
 * Created by yamir on 5/13/14.
 */
object Query extends Controller {
  def query(q: String) = Action { implicit request =>
    val errorParser:MysqlErrorParser = MysqlErrorParser(q)
    if(errorParser.err==null){
      Ok(views.html.index("There was no error with the query"))

    } else {
      Ok(views.html.index(errorParser.err))
    }
  }
}
