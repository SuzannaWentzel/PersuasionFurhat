package furhatos.app.persuationfurhat.flow

import furhatos.nlu.common.*
import furhatos.flow.kotlin.*
import furhatos.gestures.Gesture
import furhatos.gestures.Gestures
import kotlin.random.Random

val standpoint_meat1: State = state(Interaction) {
    val standpoints = mutableListOf("test1", "test2")
    onEntry {
        val random = Random.nextInt(0, standpoints.size)
        furhat.say(standpoints[random])
    }

}

val standpoint_meat2: State = state(Interaction) {

    onEntry {
        furhat.say("this is the meat eater standpoint number two")
    }

}

val standpoint_meat3: State = state(Interaction) {

    onEntry {
        furhat.say("this is the meat eater standpoint number three")
    }

}

val standpoint_meat4: State = state(Interaction) {

    onEntry {
        furhat.say("this is the meat eater standpoint number four")
    }

}