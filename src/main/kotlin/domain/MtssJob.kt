package domain


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class MtssJob(
    @SerialName("actividad")
    val actividad: String?, // AGENTE DE SEGURIDAD Y PROTECCION
    @SerialName("cantidad")
    val cantidad: Int?, // 2
    @SerialName("cargo")
    val cargo: String?, // Agente de Seguridad y Protección
    @SerialName("correo_entidad")
    val correoEntidad: String?, // agencia.villaclara@espcons.co.cu
    @SerialName("createdAt")
    val createdAt: String?, // 2021-04-26T15:22:48.071Z
    @SerialName("direccion_entidad")
    val direccionEntidad: String?, // Carretera Central 584 e/- Arroyo Carrascal y C. Planta Mecanica Rto Ciro Redondo
    @SerialName("entidad")
    val entidad: String?, // EMPRESA DE SEGURIDAD Y PROTECCION DE LA CONSTRUCCION (ESPCONS)
    @SerialName("fecha_registro")
    val fechaRegistro: String?, // 2021-04-26T00:00:00
    @SerialName("habilitada")
    val habilitada: Boolean?, // true
    @SerialName("id")
    val id: Int?, // 1
    @SerialName("municipio")
    val municipio: String?, // Santa Clara
    @SerialName("nivelEscolar")
    val nivelEscolar: String?, // 9no Grado
    @SerialName("observaciones")
    val observaciones: String?,
    @SerialName("ocupadas")
    val ocupadas: Int?, // 1
    @SerialName("organismo")
    val organismo: String?, // OSDE Construcción y Montaje
    @SerialName("provincia")
    val provincia: String?, // Villa Clara
    @SerialName("salario")
    val salario: Int?, // 2660
    @SerialName("source")
    val source: String?, // MTSS
    @SerialName("telefono_entidad")
    val telefonoEntidad: String?, // 42274158
    @SerialName("type_work")
    val typeWork: String?, // FULL_TIME
    @SerialName("unique_stamp")
    val uniqueStamp: String?, // 20210426100237
    @SerialName("updatedAt")
    val updatedAt: String? // 2021-04-26T15:22:48.072Z
)