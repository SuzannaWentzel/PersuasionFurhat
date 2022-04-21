package furhatos.app.persuationfurhat.flow

import furhatos.nlu.common.*
import furhatos.flow.kotlin.*
import furhatos.gestures.Gesture
import furhatos.gestures.Gestures
import standpoint_against_meat4_options
import standpoint_against_meat3_options
import standpoint_against_meat2_options
import standpoint_against_meat1_options
import LastQuestion
import kotlin.random.Random


// Most neutral standpoint against meat
val standpoint_against_meat4: State = state(dialogState) {
    onEntry {
            val randomOptionIndex = Random.nextInt(0, standpoint_against_meat4_options.size)
            furhat.gesture(Gestures.ExpressAnger(duration=2.0, strength = 0.5))
            furhat.say(standpoint_against_meat4_options[randomOptionIndex])
            LastQuestion = standpoint_against_meat4_options[randomOptionIndex]
            standpoint_against_meat4_options.removeAt(randomOptionIndex)
            goto(askConfirmation)

    }
}

val standpoint_against_meat3: State = state(dialogState) {
    onEntry {
            val randomOptionIndex = Random.nextInt(0, standpoint_against_meat3_options.size)
            furhat.gesture(Gestures.ExpressDisgust(duration=2.0, strength = 0.5))
            furhat.say(standpoint_against_meat3_options[randomOptionIndex])
            LastQuestion = standpoint_against_meat3_options[randomOptionIndex]
            standpoint_against_meat3_options.removeAt(randomOptionIndex)
            goto(askConfirmation)
    }
}

val standpoint_against_meat2: State = state(dialogState) {
    onEntry {
            val randomOptionIndex = Random.nextInt(0, standpoint_against_meat2_options.size)
            furhat.gesture(Gestures.BrowFrown)
            furhat.say(standpoint_against_meat2_options[randomOptionIndex])
            LastQuestion = standpoint_against_meat2_options[randomOptionIndex]
            standpoint_against_meat2_options.removeAt(randomOptionIndex)
            goto(askConfirmation)
    }
}

// Most neutral standpoint against meat
val standpoint_against_meat1: State = state(dialogState) {

    onEntry {
            val randomOptionIndex = Random.nextInt(0, standpoint_against_meat1_options.size)
            furhat.gesture(Gestures.Blink)
            furhat.gesture(Gestures.Blink)
            furhat.say(standpoint_against_meat1_options[randomOptionIndex])
            LastQuestion = standpoint_against_meat1_options[randomOptionIndex]
            standpoint_against_meat1_options.removeAt(randomOptionIndex)
            goto(askConfirmation)
    }

}
