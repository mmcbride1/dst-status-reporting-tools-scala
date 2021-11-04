package com.bah.app.config

import DBInfo.{HOST, DATABASE}

/**
 * Configuration parameters for
 * DST connections
 */
object Config {

  // JDBC driver to use
  final val DRIVER: String = "org.postgresql.Driver"

  // Database port being
  // used
  private final val PORT: Int = 5432

  /**
   * Provide connection URL
   */
  def getUrlString: String = {
    s"jdbc:postgresql://$HOST:$PORT/$DATABASE"
  }

}
