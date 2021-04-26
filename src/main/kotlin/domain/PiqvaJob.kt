package domain


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class PiqvaJob(
    @SerialName("company_logo")
    val companyLogo: String?, // https://jobs.github.com/rails/active_storage/blobs/eyJfcmFpbHMiOnsibWVzc2FnZSI6IkJBaHBBbXVoIiwiZXhwIjpudWxsLCJwdXIiOiJibG9iX2lkIn19--60fe54adcac0ac0e0953a2c53844f4b8598f9bf1/Journey-Primary-Logo-Color-Tagline.jpg
    @SerialName("company_url")
    val companyUrl: String?, // http://www.journeyid.com
    @SerialName("correo_entidad")
    val correoEntidad: String?, // miguel.perez@apacandido.azcuba.cu
    @SerialName("createdAt")
    val createdAt: String?, // 2021-04-26T15:22:48.108Z
    @SerialName("description")
    val description: String?, // asddad
    @SerialName("habilitada")
    val habilitada: Boolean?, // false
    @SerialName("id")
    val id: Int?, // 1
    @SerialName("salario")
    val salario: Int?, // 3810
    @SerialName("source")
    val source: String?, // PIQVA
    @SerialName("telefono_entidad")
    val telefonoEntidad: String?, // 32838148
    @SerialName("title")
    val title: String?, // Senior Product Engineer
    @SerialName("type_work")
    val typeWork: String?, // REMOTE
    @SerialName("updatedAt")
    val updatedAt: String? // 2021-04-26T15:46:13.563Z
)