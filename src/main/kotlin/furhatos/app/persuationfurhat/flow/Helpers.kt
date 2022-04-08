package furhatos.app.persuationfurhat.flow

import confirmationOptions
import showUnderstanding
import confirmationRequestOptions
import factIntroduction
import arguments_meat_options
import arguments_against_meat_options
import arguments_neutral_options
import copulative
import standpoint_against_meat1_options
import standpoint_against_meat2_options
import standpoint_against_meat3_options
import standpoint_against_meat4_options
import standpoint_meat1_options
import standpoint_meat2_options
import standpoint_meat3_options
import standpoint_meat4_options
import standpoint_neutral_options
import kotlin.random.Random

fun getRandomConfirmationQuestion(): String {
    return confirmationRequestOptions[Random.nextInt(0, confirmationRequestOptions.size)]
}

fun getRandomShowUnderstanding(): String {
    return showUnderstanding[Random.nextInt(0, showUnderstanding.size)]
}

fun getRandomConfirmation(): String {
    return confirmationOptions[Random.nextInt(0, confirmationOptions.size)]
}

fun getRandomFactIntroduction(): String {
    return factIntroduction[Random.nextInt(0, factIntroduction.size)]
}

fun getRandomFactMeat(): String {
    val randomIndex = Random.nextInt(0, arguments_meat_options.size)
    val argument = arguments_meat_options[randomIndex]
    arguments_meat_options.removeAt(randomIndex)
    return argument
}

fun getRandomFactAgainstMeat(): String {
    val randomIndex = Random.nextInt(0, arguments_against_meat_options.size)
    val argument = arguments_against_meat_options[randomIndex]
    arguments_against_meat_options.removeAt(randomIndex)
    return argument
}

fun getRandomFactNeutral(): String {
    val randomIndex = Random.nextInt(0, arguments_neutral_options.size)
    val argument = arguments_neutral_options[randomIndex]
    arguments_neutral_options.removeAt(randomIndex)
    return argument
}

//    Check if any of the lists with possible options is empty so we can end the conversation
fun optionsIsEmpty(): Boolean {
    return arguments_meat_options.isEmpty() or
            arguments_against_meat_options.isEmpty() or
            arguments_neutral_options.isEmpty() or
            standpoint_neutral_options.isEmpty() or
            standpoint_meat4_options.isEmpty() or
            standpoint_meat3_options.isEmpty() or
            standpoint_meat2_options.isEmpty() or
            standpoint_meat1_options.isEmpty() or
            standpoint_against_meat1_options.isEmpty() or
            standpoint_against_meat2_options.isEmpty() or
            standpoint_against_meat3_options.isEmpty() or
            standpoint_against_meat4_options.isEmpty()
}

fun getRandomCopulative(): String {
    return copulative[Random.nextInt(0, copulative.size)]
}
