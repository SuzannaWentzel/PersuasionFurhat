package furhatos.app.persuationfurhat.flow

import furhatos.nlu.common.*
import furhatos.flow.kotlin.*
import furhatos.gestures.Gesture
import furhatos.gestures.Gestures

val standpoint_against_meat1: State = state(Interaction) {

    onEntry {
        furhat.say("this is the veggie eater standpoint number one")
    }

}

val standpoint_against_meat2: State = state(Interaction) {

    onEntry {
        furhat.say("this is the veggie eater standpoint number two")
    }

}

val standpoint_against_meat3: State = state(Interaction) {

    onEntry {
        furhat.say("this is the veggie eater standpoint number three")
    }

}

val standpoint_against_meat4: State = state(Interaction) {

    onEntry {
        furhat.say("this is the veggie eater standpoint number four")
    }

}