package model.errors

import play.api.http.Status.{BAD_REQUEST, INTERNAL_SERVER_ERROR, NOT_FOUND, NO_CONTENT}

sealed trait APIErrors {
  val statusCode: Int
  val message: String

  case object NotFoundError extends APIErrors() {
    override val statusCode: Int = NOT_FOUND
    override val message: String = "The content is not found"
  }

  case object NoContent extends APIErrors() {
    override val statusCode: Int = NO_CONTENT
    override val message: String = "No content found"
  }

  case object BadRequest extends APIErrors() {

    override val statusCode: Int = BAD_REQUEST
    override val message: String = "Error in request "
  }

  case object InternalServerError extends APIErrors {
    override val statusCode: Int = INTERNAL_SERVER_ERROR
    override val message: String = "Error in the internal server"
  }

}


