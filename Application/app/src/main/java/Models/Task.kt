package Models

data class Task (
    var id_t: Int,
    var title : String,
    var description: String,
    var category: String,
    var state: TaskState,
    var estimatedTime : String,
    var realTime : String,
    var id_u : Int)
{
    override fun toString(): String {
        return title
    }
}
