package controllers

import com.google.inject.{Inject, Singleton}
import play.api.mvc.{Action, AnyContent, BaseController, ControllerComponents}
import play.api.mvc.ControllerHelpers.TODO
import play.mvc.Action
import service.RepositoryService

import java.util.function.ToDoubleFunction
import scala.concurrent.ExecutionContext

@Singleton
class ApplicationController @Inject()( val controllerComponents: ControllerComponents,
                                       val repoService: RepositoryService,
                                       implicit val  ex: ExecutionContext
                                     ) extends BaseController {

 def index(): Action[AnyContent]= Action.async { implicit request =>
   ???
 }
  def readUser(): Action[AnyContent]= Action.async { implicit request =>
    ???
  }
  def createUser(): Action[AnyContent]= Action.async { implicit request =>
    ???
  }

  def updateUser(): Action[AnyContent]= Action.async { implicit request =>
    ???
  }

  def deleteUser(): Action[AnyContent]= Action.async { implicit request =>
    ???
  }





}
