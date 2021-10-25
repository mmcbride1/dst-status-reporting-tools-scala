package com.bah.app

import java.sql.{Connection, DriverManager, PreparedStatement, SQLException}
import com.bah.app.config.Config._
import com.bah.app.config.Credentials._
import com.bah.app.config.Query

/**
 * DST connector
 */
object DSTConnector {

  /**
   * Insert stage record into DST
   * 'Stages' table.
   * @param filename (datasource filename)
   * @param stage stage
   */
  def updateDstStages(filename: String, stage: String): Unit = {

    // Setup connection parameters
    var connection: Connection = null
    var statement: PreparedStatement = null

    // Attempt to connect to DST db given
    // provided credentials. If successful, insert
    // new record to 'Stages' table.
    try {
      // JDBC driver
      Class.forName(DRIVER)
      // Database connection
      connection = DriverManager.getConnection(getUrlString, USER, PASS)
      // Insert statement
      val query = Query.getInsertStmt
      statement = connection.prepareStatement(query)
      // Update field values for stage
      // and notes
      statement.setString(1, filename)
      statement.setString(2, stage)
      // Log insert statement
      println(s"Executing statement:\n $query")
      // Execute statement
      statement.execute()
      // Close connection
      statement.close()
      connection.close()
      // Log error
    } catch {
      case sqlEx: SQLException =>
        println("Encountered ERROR: \n" +
          sqlEx.printStackTrace())
      case ex: Exception =>
        println("Encountered ERROR: \n" +
          ex.printStackTrace())
        // Close statement
    } finally {
      try {
        if (statement != null) {
          statement.close()
        }
      } catch {
        case sqlEX2: SQLException =>
          // Nothing to do here
      }
      // Close connection
      try {
        if (connection != null) {
          connection.close()
        }
      } catch {
        case sqlEx: SQLException =>
          println("Encountered ERROR: \n" +
            sqlEx.printStackTrace())
      }
    }
  }

}
