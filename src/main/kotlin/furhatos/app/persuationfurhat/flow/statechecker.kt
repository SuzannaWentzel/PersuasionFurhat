package furhatos.app.persuationfurhat.flow

import furhatos.nlu.common.*
import furhatos.flow.kotlin.*
import furhatos.gestures.Gesture
import furhatos.gestures.Gestures

val statechecker: State = state(Interaction) {

    onEntry {
        if (x > 0) {
            goto(standpoint_meat)
        }
        else if (x < 0 ){
            goto(standpoint_against_meat)
        }
        else if (x < 0){
            goto(standpoint_neutral)
        }
    }

}
