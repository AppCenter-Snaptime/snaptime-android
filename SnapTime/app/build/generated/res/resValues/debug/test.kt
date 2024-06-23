
import com.google.gson.annotations.SerializedName

data class test(
    @SerializedName("msg")
    val msg: String,
    @SerializedName("result")
    val result: Result
)