package furhatos.app.persuationfurhat.flow

import confirmationOptions
import showUnderstanding
import confirmationRequestOptions
import factIntroduction
import arguments_meat_options
import arguments_against_meat_options
import furhatos.flow.kotlin.furhat
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

fun getFactIntroduction(): String {
    return factIntroduction[Random.nextInt(0, factIntroduction.size)]
}

fun getFactMeat(): String {
    val random = Random.nextInt(0, arguments_meat_options.size)
    val argument = arguments_meat_options[random]
    arguments_meat_options.removeAt(random)
    return argument
}

fun getFactAgainstMeat(): String {
    val random = Random.nextInt(0, arguments_against_meat_options.size)
    val argument = arguments_against_meat_options[random]
    arguments_against_meat_options.removeAt(random)
    return argument
}
