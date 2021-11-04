package com.bah.app.config

/**
 * General schema information for
 * DST artifacts
 */
object Schema {

  // Fields
  final val STAGE_ID:       String = "stageid"
  final val NOTES:          String = "notes"
  final val STAGE:          String = "stage"
  final val VALUE:          String = "value"
  final val SUB_STAGE:      String = "substage"
  final val CREATED_AT:     String = "created_at"
  final val UPDATED_AT:     String = "updated_at"
  final val MODIFIED_BY:    String = "modified_by"
  final val DATA_STATUS_ID: String = "data_status_id"
  final val HAS_COMPLETED:  String = "has_completed"
  final val DATASET_ID:     String = "datasetid"

  // Stages schema
  val STAGES_SCHEMA: List[String] = List(
    NOTES,
    STAGE,
    VALUE,
    SUB_STAGE,
    CREATED_AT,
    UPDATED_AT,
    MODIFIED_BY,
    HAS_COMPLETED
  )

}
