package furhatos.app.persuationfurhat.flow

import furhatos.nlu.common.*
import furhatos.flow.kotlin.*
import furhatos.gestures.Gesture
import furhatos.gestures.Gestures
import standpoint_against_meat4_options
import standpoint_against_meat3_options
import standpoint_against_meat2_options
import standpoint_against_meat1_options
import kotlin.random.Random


// Most neutral standpoint against meat
val standpoint_against_meat4: State = state(Interaction) {

    onEntry {
        val randomOptionIndex = Random.nextInt(0, standpoint_against_meat4_options.size)
        standpoint_against_meat4_options.removeAt(randomOptionIndex)
        furhat.say(standpoint_against_meat4_options[randomOptionIndex])
        goto(askConfirmation)
    }
}

val standpoint_against_meat3: State = state(Interaction) {

    onEntry {
        val randomOptionIndex = Random.nextInt(0, standpoint_against_meat3_options.size)
        standpoint_against_meat3_options.removeAt(randomOptionIndex)
        furhat.say(standpoint_against_meat3_options[randomOptionIndex])
        goto(askConfirmation)
    }

}

val standpoint_against_meat2: State = state(Interaction) {

    onEntry {
        val randomOptionIndex = Random.nextInt(0, standpoint_against_meat2_options.size)
        standpoint_against_meat2_options.removeAt(randomOptionIndex)
        furhat.say(standpoint_against_meat2_options[randomOptionIndex])
        goto(askConfirmation)
    }

}

// Most extreme standpoint against meat
val standpoint_against_meat1: State = state(Interaction) {

    onEntry {
        val randomOptionIndex = Random.nextInt(0, standpoint_against_meat1_options.size)
        standpoint_against_meat1_options.removeAt(randomOptionIndex)
        furhat.say(standpoint_against_meat1_options[randomOptionIndex])
        goto(askConfirmation)    }

}
