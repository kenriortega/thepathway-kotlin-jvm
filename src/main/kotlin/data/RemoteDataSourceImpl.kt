package data

import domain.GithubJob
import io.ktor.client.*
import io.ktor.client.request.*
import utils.Constants

class RemoteDataSourceImpl : DataSource {
    override suspend fun getJobsBySearch(client: HttpClient, query: String, limit: Int): List<GithubJob> {
        val data = client.get<List<GithubJob>>("${Constants.URL_BASE}?search=$query")
        return data.take(limit)
    }
}