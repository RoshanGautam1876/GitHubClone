package connector

import play.api.libs.json.OFormat
import play.api.libs.ws.{WSClient, WSRequest}
import play.api.mvc.Result

import javax.inject.Inject
import scala.concurrent.{ExecutionContext, Future}

class GitHubConnector @Inject()(ws:WSClient){
  def get[Response](url:String)(implicit rds: OFormat[Response], ec: ExecutionContext): Future[Response] = {
    val request: WSRequest = ws.url(url)
    val response = request.get()
    response.map {
      result =>  {
        result.json.as[Response]
      }
    }
  }

}
