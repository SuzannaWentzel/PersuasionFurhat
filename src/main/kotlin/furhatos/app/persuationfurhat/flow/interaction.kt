package furhatos.app.persuationfurhat.flow

import furhatos.nlu.common.*
import furhatos.flow.kotlin.*
import furhatos.gestures.Gesture
import furhatos.gestures.Gestures

val Start : State = state(Interaction) {

    onEntry {
        furhat.say("Hello there!")
        furhat.listen(timeout = 2000)
    }

    onNoResponse {
        furhat.gesture(Gestures.Smile)
        furhat.say("Nice to talk to you today!")
        goto(GetInitialStandpoint)
    }

    onResponse<Greeting> {
        furhat.gesture(Gestures.BigSmile)
        furhat.say("So nice to talk to you today!")
        goto(GetInitialStandpoint)
    }
}
