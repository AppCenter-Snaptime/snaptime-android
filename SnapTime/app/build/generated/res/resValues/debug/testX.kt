
import com.google.gson.annotations.SerializedName

data class testX(
    @SerializedName("msg")
    val msg: String,
    @SerializedName("result")
    val result: ResultX
)