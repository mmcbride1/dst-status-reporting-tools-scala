package com.bah.app.config

import Credentials.{HOST, DATABASE}

/**
 * Configuration parameters for
 * DST connections
 */
object Config {

  // JDBC driver to use
  final val DRIVER: String = "com.mysql.cj.jdbc.Driver"

  // Database port being
  // used
  private final val MYSQL_PORT: Int = 3307

  /**
   * Provide connection URL
   */
  def getUrlString: String = {
    s"jdbc:mysql://$HOST:$MYSQL_PORT/$DATABASE"
  }

}
