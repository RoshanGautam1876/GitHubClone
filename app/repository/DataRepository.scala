package repository

import com.mongodb.client.model.{IndexModel, Indexes}
import model.User
import org.mongodb.scala.model.IndexModel
import uk.gov.hmrc.mongo.MongoComponent
import uk.gov.hmrc.mongo.play.json.PlayMongoRepository

import javax.inject.{Inject, Singleton}
import scala.concurrent.ExecutionContext

@Singleton
class DataRepository @Inject()(
                              mongoComponent: MongoComponent
                              )(implicit ex: ExecutionContext) extends PlayMongoRepository[User](

  collectionName = "dataModels",
  mongoComponent = mongoComponent,
  domainFormat = User.formats,
  indexes = Seq(IndexModel(
    Indexes.ascending("_id")
  )),

}
