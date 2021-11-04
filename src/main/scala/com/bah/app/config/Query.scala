package com.bah.app.config

import Schema._
import com.bah.app.config.DBInfo.TABLE_NAME

/**
 * Query parameters for DST
 * update process
 */
object Query {

  // Insert statement
  private final val INSERT_STATEMENT: String =
    s"""
      |INSERT INTO $TABLE_NAME (${STAGES_SCHEMA.mkString(",")})
      |VALUES (?,?,TRUE,NULL,NOW(),NOW(),NOW(),TRUE)
      |""".stripMargin

  /**
   * Provide insert statement
   */
  def getInsertStmt: String = INSERT_STATEMENT

}
