package service

import cats.data.EitherT
import connector.GitHubConnector
import model.User
import model.errors.APIErrors

import javax.inject._
import scala.concurrent.{ExecutionContext, Future}

@Singleton
class GitHubServices @Inject()(gitHubConnector:GitHubConnector){

  def getUser(userName:String)(implicit ec: ExecutionContext):EitherT[Future, APIErrors, User]= {
    val url = s"https://api.github.com/users/$userName"
    ???
  }

}
