package furhatos.app.persuationfurhat.flow

import furhatos.nlu.common.*
import furhatos.flow.kotlin.*
import furhatos.gestures.Gesture
import furhatos.gestures.Gestures
import kotlin.math.abs
import LastQuestion

val askLastQuestion: State = state(Interaction) {
    onEntry {
        furhat.say(LastQuestion[0])
        goto(askConfirmation)
    }

}
