package stores

import com.google.inject.AbstractModule
import play.api.{Configuration, Environment}

class StoreModule(environment: Environment, configuration: Configuration) extends AbstractModule {
  override def configure(): Unit = {
    //    val dataFilePath = configuration.get[String]("data")
    //
    //    val dataFileReader = new FileReader(new File(dataFilePath))
    //    try {
    //      val model = ModelFactory.createDefaultModel()
    //      model.read(dataFileReader, null, "TURTLE")
    //      bind(classOf[DataService]).toInstance(new DataService(model))
    //    } finally {
    //      dataFileReader.close()
    //    }
  }
}
