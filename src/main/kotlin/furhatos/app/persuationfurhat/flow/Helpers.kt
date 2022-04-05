package furhatos.app.persuationfurhat.flow

import confirmationOptions
import showUnderstanding
import confirmationRequestOptions
import factIntroduction
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
