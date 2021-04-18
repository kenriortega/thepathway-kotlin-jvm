package domain


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class GithubJob(
    @SerialName("company")
    val company: String?,
    @SerialName("company_logo")
    val companyLogo: String?,
    @SerialName("company_url")
    val companyUrl: String?,
    @SerialName("created_at")
    val createdAt: String?,
    @SerialName("description")
    val description: String?,
    @SerialName("how_to_apply")
    val howToApply: String?,
    @SerialName("id")
    val id: String?,
    @SerialName("location")
    val location: String?,
    @SerialName("title")
    val title: String?,
    @SerialName("type")
    val type: String?,
    @SerialName("url")
    val url: String?
)