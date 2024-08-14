package repository

import connector.GitHubConnector
import model.User

import javax.inject._
import scala.concurrent.{ExecutionContext, Future}

@Singleton
class GitHubServices @Inject()(gitHubConnector:GitHubConnector){

  def getUser(urlOverride:Option[String] = None, userName:String)(implicit ec: ExecutionContext):Future[User] =
    ???

}
