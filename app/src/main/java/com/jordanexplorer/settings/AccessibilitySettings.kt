data class AccessibilitySettings(
    var fontSize: Int = 14, // Default font size
    var darkMode: Boolean = false, // Default is off
    var colorFilter: String = "none", // Default color filter
    var screenReader: Boolean = false, // Default is off
    var animations: Boolean = true // Default is on
)