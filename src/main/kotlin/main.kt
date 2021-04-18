import data.RemoteDataSourceImpl
import io.ktor.client.*
import io.ktor.client.engine.cio.*
import io.ktor.client.features.json.*
import io.ktor.client.features.json.serializer.*
import io.ktor.client.features.logging.*
import kotlinx.coroutines.*
import utils.Constants
import utils.Timer

suspend fun main() {
    val client = HttpClient(CIO) {
        install(JsonFeature) {
            serializer = KotlinxSerializer(kotlinx.serialization.json.Json {
                prettyPrint = true
                isLenient = true
            })
        }
        install(Logging) {
            logger = Logger.DEFAULT
            level = LogLevel.HEADERS
        }
    }
    Timer.setInterval(Constants.FETCH_INTERVAL) {
        println("Doing Fetch data ...")
        CoroutineScope(Dispatchers.IO).launch {
            val data = async { RemoteDataSourceImpl().getJobsBySearch(client,"kotlin",4) }
            val result = data.await()
            println(result.map { it.company })
        }
    }
    client.close()
}