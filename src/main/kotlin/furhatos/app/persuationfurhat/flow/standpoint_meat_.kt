package furhatos.app.persuationfurhat.flow

import furhatos.nlu.common.*
import furhatos.flow.kotlin.*
import furhatos.gestures.Gesture
import furhatos.gestures.Gestures
import standpoint_meat1_options
import standpoint_meat2_options
import standpoint_meat3_options
import standpoint_meat4_options
import kotlin.random.Random

val standpoint_meat1: State = state(Interaction) {

    onEntry {
        val random = Random.nextInt(0, standpoint_meat1_options.size)
        furhat.say(standpoint_meat1_options[random])
        standpoint_meat1_options.removeAt(random)
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