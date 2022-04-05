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
val standpoint_against_meat1: State = state(Interaction) {

    onEntry {
        val randomOptionIndex = Random.nextInt(0, standpoint_against_meat4_options.size)
        val newStandpoint = standpoint_against_meat4_options[randomOptionIndex]
        furhat.say(newStandpoint)
        goto(askConfirmation)
    }
}

val standpoint_against_meat2: State = state(Interaction) {

    onEntry {
        val randomOptionIndex = Random.nextInt(0, standpoint_against_meat4_options.size)
        val newStandpoint = standpoint_against_meat4_options[randomOptionIndex]
        furhat.say(newStandpoint)
        goto(askConfirmation)
    }

}

val standpoint_against_meat3: State = state(Interaction) {

    onEntry {
        furhat.say("this is the veggie eater standpoint number three")
    }

}

// Most extreme standpoint against meat
val standpoint_against_meat4: State = state(Interaction) {

    onEntry {
        furhat.say("this is the veggie eater standpoint number four")
    }

}
