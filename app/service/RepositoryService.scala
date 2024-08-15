package service

import model.User
import model.errors.APIErrors

import java.util.concurrent.Future

trait RepositoryService {

  def index(): Future[Either[APIErrors, Seq[User]]]

  def createUser(user: User): Future[Either[APIErrors, Seq[User]]]

  def deleteUser(userName: String): Future[Either[APIErrors, User]]

  def updateUser(userName: String, updatedUser: User): Future[Either[APIErrors, User]]

  def searchUser(userName: String): Future[Either[APIErrors, User]]
}
