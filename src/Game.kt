fun main(args: Array<String>) {

    val name = "Vovan"
    var healthPoints = 11
    val isBlessed = true
    val isImmortal = false

    val race = "ali"
    val faction = when (race) {
        "dwarf" -> "Keepers of the Mines"
        "gnome" -> "Keepers of the Mines"
        "orc" -> "Free People of the Rolling Hills"
        "human" -> "Free People of the Rolling Hills"
        else -> "Aliens from space"
    }

    val healthStatus = when (healthPoints) {
        100 -> " is in excellent condition!"
        in 90..99 -> " has a few scratches"
        in 75..89 -> if (isBlessed) {
            " has some minor wounds but is healing quite" +
                    " quickly!"
        } else {
            "has some minor wounds."
        }
        in 15..74 -> "looks pretty hurt."
        else -> "is in awful condition!"
    }

    //Аура
    val auraVisible = isBlessed && healthPoints > 50 ||
            isImmortal
    val auraColor = if (auraVisible) "GREEN" else "NONE"

    println("(Aura: $auraColor) " +
             "(Blessed: ${if (isBlessed) "YES" else "NO"})")
    println("$name $healthStatus")
}