package model

import play.api.libs.json.{Json, OFormat}

import java.time.LocalDate

case class User(userName:String,
                dateAccountCreated: LocalDate,
                numberOfFollowers: Int,
                numberOfFollowing:Int){

}

/**
 * This creates an implicit OFormat instance
 * which is used when dealing with JSON parsing, such as in
 * REST APIs or when saving objects to a NoSQL database like MongoDB
 */
object User {
  implicit val formats: OFormat[User] = Json.format[User]
}

