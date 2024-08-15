package service

import model.User
import model.errors.APIErrors
import repository.DataRepository

import java.util.concurrent.Future
import javax.inject.{Inject, Singleton}

@Singleton
class RepositoryServiceImpl @Inject()(val dataRepository: DataRepository
                                     ) extends RepositoryService {

  override def index(): Future[Either[APIErrors, Seq[User]]] = ???

  override def createUser(user: User): Future[Either[APIErrors, Seq[User]]] = ???

  override def deleteUser(userName: String): Future[Either[APIErrors, User]] = ???

  override def updateUser(userName: String, updatedUser: User): Future[Either[APIErrors, User]] = ???

  override def searchUser(userName: String): Future[Either[APIErrors, User]] = ???
}
