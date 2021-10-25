import org.scalatest.{BeforeAndAfter, FunSuite}
import com.bah.app.config.Config._
import com.bah.app.config.Schema.STAGES_SCHEMA
import com.bah.app.DSTConnector._

/**
 * Test for DST record insert.
 * Warning: LIVE, no mock. For debugging only.
 * Will not run at build.
 */
class DstStatusToolsTestSuite extends FunSuite with BeforeAndAfter {

  /**
   * Insert record into test DB (setup on local instance)
   */
  test("Insert a record into test DB") {
    //updateDstStages("from scala", "loaded")
  }
}
