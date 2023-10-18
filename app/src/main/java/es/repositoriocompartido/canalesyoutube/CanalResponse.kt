package es.repositoriocompartido.canalesyoutube

import com.google.gson.annotations.SerializedName

data class CanalResponse (
    @SerializedName("version") var version:String,
    @SerializedName("canales") var canales:List<Canal>
)