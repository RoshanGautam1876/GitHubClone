package model

import play.api.libs.json.{Json, OFormat}

import java.time.LocalDate

case class User(userName:String,
                dateAccountCreated: LocalDate,
                numberOfFollowers: Int,
                numberOfFollowing:Int){

}
object User {
  implicit val formats: OFormat[User] = Json.format[User]
}

