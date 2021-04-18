package di

import data.DataSource
import data.RemoteDataSourceImpl
import domain.GithubJob

import io.ktor.client.*
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject
import org.koin.dsl.module

class Repository : KoinComponent {
    private val githubJobService by inject<DataSource>()

    suspend fun getJobsBySearch(client: HttpClient, query: String, limit: Int): List<GithubJob> =
        githubJobService.getJobsBySearch(client, query, limit)
}

val githubJobModule = module {
    single { GithubJob }
    single<DataSource> { RemoteDataSourceImpl() }
}