package furhatos.app.persuationfurhat.flow

import furhatos.app.persuationfurhat.nlu.Greetings
import furhatos.nlu.common.*
import furhatos.flow.kotlin.*
import furhatos.gestures.Gesture
import furhatos.gestures.Gestures

val Start : State = state(Interaction) {

    onEntry {
        dialogLogger.startSession()
        furhat.say("Hello there!")
        furhat.listen(timeout = 4000)
    }

    onNoResponse {
        furhat.gesture(Gestures.Smile)
        furhat.say("Nice to talk to you today!")
        goto(InitialStandpointV2)
    }

    onResponse<Greetings> {
        furhat.gesture(Gestures.BigSmile)
        furhat.say("So nice to talk to you today!")
        goto(InitialStandpointV2)
    }

}
