package furhatos.app.persuationfurhat.flow

import furhatos.nlu.common.*
import furhatos.flow.kotlin.*
import furhatos.gestures.Gesture
import furhatos.gestures.Gestures

val standpoint_neutral: State = state(Interaction) {

    onEntry {
        furhat.say("this is the neutral standpoint")
    }

}

