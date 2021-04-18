package data

import domain.GithubJob
import io.ktor.client.*

interface DataSource {
    suspend fun getJobsBySearch(client: HttpClient, query: String , limit: Int ):List<GithubJob>
}