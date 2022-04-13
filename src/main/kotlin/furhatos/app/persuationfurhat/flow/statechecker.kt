package furhatos.app.persuationfurhat.flow

import furhatos.nlu.common.*
import furhatos.flow.kotlin.*
import furhatos.gestures.Gesture
import furhatos.gestures.Gestures
import kotlin.math.abs

val statechecker: State = state(dialogState) {
    val statelist = listOf(standpoint_against_meat4, standpoint_against_meat3 ,standpoint_against_meat2, standpoint_against_meat1, standpoint_neutral ,standpoint_meat1, standpoint_meat2, standpoint_meat3, standpoint_meat4)
    onEntry {
        goto(statelist[x])
    }

}
